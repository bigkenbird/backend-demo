package com.feib.demo.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.feib.demo.controller.rq.SQLExecuteRq;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class SQLService {

    private final JdbcTemplate jdbcTemplate;

    public String search(SQLExecuteRq sqlExecuteRq) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();

        String sql = sqlExecuteRq.getSql();
        return mapper.writeValueAsString(jdbcTemplate.queryForList(sql));
    }


    public String executeSql(SQLExecuteRq sqlExecuteRq) {
        try {
            String sql = sqlExecuteRq.getSql();
            if (sql.startsWith("select")) {
                List<Map<String, Object>> rows = jdbcTemplate.queryForList(sql);
                if (rows.isEmpty()) return "查無資料。";

                // 把每一列資料轉成字串
                StringBuilder sb = new StringBuilder();
                for (Map<String, Object> row : rows) {
                    sb.append(row.toString()).append("\n");
                }
                return sb.toString();
            } else {
                int updated = jdbcTemplate.update(sql);
                return "成功執行，受影響列數: " + updated;
            }
        } catch (Exception e) {
            return "執行錯誤: " + e.getMessage();
        }
    }

}
