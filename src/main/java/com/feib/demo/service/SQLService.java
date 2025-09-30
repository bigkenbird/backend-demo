package com.feib.demo.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.feib.demo.controller.rq.SQLExecuteRq;
import com.feib.demo.controller.rq.TableRq;
import com.feib.demo.controller.rs.TableExecuteRs;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;
import java.util.Map;
import java.util.Set;

@Service
@RequiredArgsConstructor
public class SQLService {

    private final JdbcTemplate jdbcTemplate;

    public String search(SQLExecuteRq sqlExecuteRq) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();

        String sql = sqlExecuteRq.getSql();
        return mapper.writeValueAsString(jdbcTemplate.queryForList(sql));
    }


    public TableExecuteRs executeSql(TableRq tableRq) {
        TableExecuteRs tableExecuteRs = new TableExecuteRs();
        try {
            String tableName = tableRq.getTableName();
            checkDataExist(tableName);
            List<Map<String,Object>> values = getValues(tableName);
            Set<String> columns = values.get(0).keySet();
            tableExecuteRs.setColumns(columns);
            tableExecuteRs.setValues(values);
        } catch (Exception e) {
            e.printStackTrace();
            tableExecuteRs.setError(e.getMessage());
        }
        return tableExecuteRs;
    }

    private void checkDataExist(String tableName) throws Exception {
        if(!StringUtils.hasText(tableName)) {
            throw new Exception("tableNamw can not be null or empty");
        }
    }


    private List<Map<String,Object>> getValues(String tableName) {
        String sql = String.format("SELECT * FROM %s",tableName);
        List<Map<String,Object>> values = jdbcTemplate.queryForList(sql);
        values.forEach(map -> map.put("editable", false));
        return values;
    }

}
