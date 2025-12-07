package com.feib.demo.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.feib.demo.common.rs.ReviewRs;
import com.feib.demo.controller.rq.SQLExecuteRq;
import com.feib.demo.controller.rq.SqlReviewRq;
import com.feib.demo.controller.rq.TableRq;
import com.feib.demo.controller.rs.SqlReviewRs;
import com.feib.demo.controller.rs.TableExecuteRs;
import com.feib.demo.persistence.entity.EmployeeEntity;
import com.feib.demo.persistence.entity.ReviewEntity;
import com.feib.demo.persistence.repository.ReviewRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

@Service
@RequiredArgsConstructor
public class SQLService {

    private final JdbcTemplate jdbcTemplate;

    private final ReviewRepository reviewRepository;

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

    public SqlReviewRs executeSqlReview(SqlReviewRq sqlReviewRq) {
        SqlReviewRs sqlReviewRs = new SqlReviewRs();
        ReviewEntity reviewEntity = sqlReviewRq.toReviewCell();
        reviewRepository.save(reviewEntity);
        sqlReviewRs.setResult("success");
        return sqlReviewRs;
    }

    public SqlReviewRs executeSqlReviewGet(SqlReviewRq sqlReviewRq) {
        SqlReviewRs sqlReviewRs = new SqlReviewRs();
        ReviewEntity reviewEntity = sqlReviewRq.toReviewCell();
        ExampleMatcher matcher = ExampleMatcher.matching()
                .withIgnoreNullValues()
                .withMatcher("tableName", ExampleMatcher.GenericPropertyMatchers.ignoreCase())
                .withMatcher("code", ExampleMatcher.GenericPropertyMatchers.ignoreCase())
                .withMatcher("reviewer", ExampleMatcher.GenericPropertyMatchers.ignoreCase())
                .withMatcher("submitter", ExampleMatcher.GenericPropertyMatchers.ignoreCase())
                .withMatcher("status", ExampleMatcher.GenericPropertyMatchers.ignoreCase());
        Example<ReviewEntity> example = Example.of(reviewEntity, matcher);
        Iterable<ReviewEntity> reviewEntities = reviewRepository.findAll(example);
        List<ReviewRs> reviewRsList = new ArrayList<>();
        for(ReviewEntity reviewEntityGet : reviewEntities) {
            ReviewRs reviewRs = new ReviewRs();
            reviewRs.setReviewEntity(reviewEntityGet);
            String tableName = reviewEntityGet.getTableName();
            String code = reviewEntityGet.getCode();
            reviewRs.setOriginEntity(getValues(tableName,code));
            reviewRsList.add(reviewRs);
        }
        sqlReviewRs.setResult("success");
        sqlReviewRs.setReviewRsList(reviewRsList);
        return sqlReviewRs;
    }

    private void checkDataExist(String tableName) throws Exception {
        if(!StringUtils.hasText(tableName)) {
            throw new Exception("tableNamw can not be null or empty");
        }
    }


    private List<Map<String,Object>> getValues(String tableName) {
        String sql = String.format("SELECT * FROM %s ;",tableName);
        List<Map<String,Object>> values = jdbcTemplate.queryForList(sql);
        values.forEach(map -> map.put("editable", false));
        return values;
    }

    private Map<String,Object> getValues(String tableName,String code) {
        String sql = String.format("SELECT * FROM %s WHERE code = '%s' ;",tableName,code);
        return jdbcTemplate.queryForList(sql).get(0);
    }





}
