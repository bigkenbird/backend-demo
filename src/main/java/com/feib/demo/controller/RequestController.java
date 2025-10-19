/*
 * ===========================================================================
 * IBM Confidential
 * AIS Source Materials
 * (C) Copyright IBM Corp. 2025.
 * ===========================================================================
 */
package com.feib.demo.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.feib.demo.controller.rq.*;
import com.feib.demo.controller.rs.*;
import com.feib.demo.service.SQLService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.feib.demo.common.rq.ChannelRq;
import com.feib.demo.common.rs.ChannelRs;
import com.feib.demo.common.rs.ChannelRsMeta;
import com.feib.demo.exception.ErrorStatusEx;
import com.feib.demo.service.EmployeeService;
import com.feib.demo.service.LoginService;

/**
 * <p>
 * 請求控制
 * </p>
 * @author Eric Wei
 * @version 1.0, 2025年3月7日
 * @see
 * @since
 */
@RestController
@RequiredArgsConstructor
public class RequestController {

    private final LoginService loginService;

    private final SQLService sqlService;

    private final EmployeeService employeeService;

    /**
     * 登入請求處理
     */
    @PostMapping("/login")
    @CrossOrigin("*")
    public ChannelRs<LoginRs> login(@RequestBody
    ChannelRq<LoginRq> channelRq) {

        ChannelRs<LoginRs> channelRs = new ChannelRs<LoginRs>();
        ChannelRsMeta meta = new ChannelRsMeta();
        ErrorStatusEx status = new ErrorStatusEx();
        meta.setStatus(status);
        channelRs.setMeta(meta);
        channelRs.setBody(loginService.login(channelRq.getBody()));

        return channelRs;
    }

    /**
     * 查詢員工資料請求處理
     */
    @PostMapping("employees")
    @CrossOrigin("http://localhost:3000")
    public ChannelRs<QueryEmployeeRs> queryEmployeeList(@RequestBody
                                                            ChannelRq<QueryEmployeeRq> channelRq) {

        ChannelRs<QueryEmployeeRs> channelRs = new ChannelRs<QueryEmployeeRs>();
        ChannelRsMeta meta = new ChannelRsMeta();
        ErrorStatusEx status = new ErrorStatusEx();
        meta.setStatus(status);
        channelRs.setMeta(meta);
        channelRs.setBody(employeeService.queryEmployee(channelRq.getBody()));

        return channelRs;
    }

    /**
     * 查詢員工明細資料請求處理
     */
    @PostMapping("employeedetail")
    @CrossOrigin("http://localhost:3000")
    public ChannelRs<QueryEmployeeDetailRs> queryEmployeeDetail(@RequestBody
    ChannelRq<QueryEmployeeDetailRq> channelRq) {

        ChannelRs<QueryEmployeeDetailRs> channelRs = new ChannelRs<QueryEmployeeDetailRs>();
        ChannelRsMeta meta = new ChannelRsMeta();
        ErrorStatusEx status = new ErrorStatusEx();
        meta.setStatus(status);
        channelRs.setMeta(meta);
        channelRs.setBody(employeeService.queryEmployeeDetail(channelRq.getBody()));

        return channelRs;
    }

    /**
     * 執行任何sql字串
     */
    @PostMapping("sql/execute")
    @CrossOrigin("http://localhost:3000")
    public ChannelRs<SQLExecuteRs> sqlExecute(@RequestBody ChannelRq<SQLExecuteRq> channelRq) throws JsonProcessingException {
        ChannelRs<SQLExecuteRs> channelRs = new ChannelRs<>();
        ChannelRsMeta meta = new ChannelRsMeta();
        ErrorStatusEx status = new ErrorStatusEx();
        meta.setStatus(status);
        channelRs.setMeta(meta);
        SQLExecuteRs sqlExecuteRs = new SQLExecuteRs();
        sqlExecuteRs.setResult(sqlService.search(channelRq.getBody()));
        channelRs.setBody(sqlExecuteRs);

        return channelRs;

    }

    /**
     * 執行查詢sql語法
     */
    @PostMapping("sql/table/search")
    @CrossOrigin("http://localhost:3000")
    public ChannelRs<TableExecuteRs> sqlSearch(@RequestBody ChannelRq<TableRq> channelRq) throws JsonProcessingException {
        ChannelRs<TableExecuteRs> channelRs = new ChannelRs<>();
        ChannelRsMeta meta = new ChannelRsMeta();
        ErrorStatusEx status = new ErrorStatusEx();
        meta.setStatus(status);
        channelRs.setMeta(meta);
        TableExecuteRs tableExecuteRs = sqlService.executeSql(channelRq.getBody());
        channelRs.setBody(tableExecuteRs);
        return channelRs;
    }

    /**
     * 執行查詢sql語法
     */
    @PostMapping("sql/table/edit/save")
    @CrossOrigin("http://localhost:3000")
    public ChannelRs<TableExecuteRs> sqlEditSave(@RequestBody ChannelRq<TableRq> channelRq) throws JsonProcessingException {
        ChannelRs<TableExecuteRs> channelRs = new ChannelRs<>();
        ChannelRsMeta meta = new ChannelRsMeta();
        ErrorStatusEx status = new ErrorStatusEx();
        meta.setStatus(status);
        channelRs.setMeta(meta);
        TableExecuteRs tableExecuteRs = sqlService.executeSql(channelRq.getBody());
        channelRs.setBody(tableExecuteRs);
        return channelRs;
    }

    @PostMapping("sql/table/review/save")
    @CrossOrigin("http://localhost:3000")
    public ChannelRs<SqlReviewRs> sqlReviewSave(@RequestBody ChannelRq<SqlReviewRq> channelRq) {
        ChannelRs<SqlReviewRs> channelRs = new ChannelRs<>();
        ChannelRsMeta meta = new ChannelRsMeta();
        ErrorStatusEx status = new ErrorStatusEx();
        meta.setStatus(status);
        channelRs.setMeta(meta);
        System.out.println(channelRq.getBody().getTable());
        SqlReviewRs sqlReviewRs = sqlService.executeSqlReview(channelRq.getBody());
        channelRs.setBody(sqlReviewRs);
        return channelRs;
    }

    @PostMapping("sql/table/review/get")
    @CrossOrigin("http://localhost:3000")
    public ChannelRs<SqlReviewRs> sqlReviewGet(@RequestBody ChannelRq<SqlReviewRq> channelRq) {
        ChannelRs<SqlReviewRs> result = new ChannelRs<>();
        SqlReviewRs sqlReviewRs = sqlService.executeSqlReviewGet(channelRq.getBody());
        result.setBody(sqlReviewRs);
        ChannelRsMeta meta = new ChannelRsMeta();
        ErrorStatusEx status = new ErrorStatusEx();
        meta.setStatus(status);
        result.setMeta(meta);
        return result;
    }


}
