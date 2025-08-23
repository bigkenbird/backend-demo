/*
 * ===========================================================================
 * IBM Confidential
 * AIS Source Materials
 * (C) Copyright IBM Corp. 2025.
 * ===========================================================================
 */
package com.feib.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.feib.demo.common.service.PageService;
import com.feib.demo.controller.rq.QueryEmployeeDetailRq;
import com.feib.demo.controller.rq.QueryEmployeeRq;
import com.feib.demo.controller.rs.QueryEmployeeDetailRs;
import com.feib.demo.controller.rs.QueryEmployeeRs;
import com.feib.demo.model.ConversationKxy;
import com.feib.demo.model.DataGridRow;
import com.feib.demo.model.DataGridValue;
import com.feib.demo.model.EmployeeCell;
import com.feib.demo.persistence.entity.EmployeeEntity;
import com.feib.demo.persistence.repository.EmployeeRepository;

import ch.qos.logback.core.util.StringUtil;

/**
 * <p>
 * 員工服務
 * </p>
 * @author Eric Wei
 * @version 1.0, 2025年3月10日
 * @see
 * @since
 */
@Component
public class EmployeeService extends PageService {

    @Autowired
    private EmployeeRepository employeeRespository;

    public QueryEmployeeRs queryEmployee(QueryEmployeeRq queryEmployeeRq) {

        QueryEmployeeRs queryEmployeeRs = new QueryEmployeeRs();

        // 查詢員工資料
        List<EmployeeEntity> employeeList = findEmployee(queryEmployeeRq);

        // 組裝頁面表格
        DataGridValue dataGridValue = buildDataGrid(queryEmployeeRq, employeeList);
        queryEmployeeRs.setDataGridValue(dataGridValue);

        return queryEmployeeRs;

    }

    public QueryEmployeeDetailRs queryEmployeeDetail(QueryEmployeeDetailRq queryEmployeeDetailRq) {

        QueryEmployeeDetailRs queryEmployeeDetailRs = new QueryEmployeeDetailRs();

        // 查詢員工明細資料
        EmployeeEntity employee = findEmployeeDetail(queryEmployeeDetailRq);

        queryEmployeeDetailRs.setName(employee.getName());

        return queryEmployeeDetailRs;

    }

    private List<EmployeeEntity> findEmployee(QueryEmployeeRq queryEmployeeRq) {

        List<EmployeeEntity> employeeList = new ArrayList<EmployeeEntity>();

        EmployeeEntity employee = null;

        // 依照查詢條件不同而調用不同區塊，以下做法僅為Demo而生，實際開發需有系統性架構設計
        if (StringUtil.notNullNorEmpty(queryEmployeeRq.getCode()) && StringUtil.notNullNorEmpty(queryEmployeeRq.getName())) {
            employee = employeeRespository.findByCodeAndName(queryEmployeeRq.getCode(), queryEmployeeRq.getName());
        }
        else if (StringUtil.notNullNorEmpty(queryEmployeeRq.getCode())) {
            employee = employeeRespository.findByCode(queryEmployeeRq.getCode());
        }
        else if (StringUtil.notNullNorEmpty(queryEmployeeRq.getName())) {
            employee = employeeRespository.findByName(queryEmployeeRq.getName());
        }
        else {
            Iterable<EmployeeEntity> employeeIterable = employeeRespository.findAll();
            employeeIterable.forEach(employeeList::add);
        }

        if (null != employee) {
            employeeList.add(employee);
        }

        return employeeList;

    }

    private EmployeeEntity findEmployeeDetail(QueryEmployeeDetailRq queryEmployeeDetailRq) {

        EmployeeEntity employee = null;

        if (StringUtil.notNullNorEmpty(queryEmployeeDetailRq.getCode())) {
            employee = employeeRespository.findByCode(queryEmployeeDetailRq.getCode());
        }

        if (null == employee) {
            employee = new EmployeeEntity();
            employee.setName("Not Found");
        }

        return employee;

    }

    private DataGridValue buildDataGrid(QueryEmployeeRq queryEmployeeRq, List<EmployeeEntity> employeeList) {

        // 將資料庫查詢出來的員工資料轉換成頁面表格明細
        List<EmployeeCell> employeeCellList = new ArrayList<>();
        for (int i = 0; i < employeeList.size(); i++) {
            EmployeeEntity employeeEntity = employeeList.get(i);
            EmployeeCell employeeCell = new EmployeeCell();
            employeeCell.setNumber(i + 1);
            employeeCell.setCode(employeeEntity.getCode());
            employeeCell.setName(employeeEntity.getName());
            employeeCell.setTitle(employeeEntity.getTitle());
            employeeCell.setDepartment(employeeEntity.getDepartment());
            employeeCell.setArrivalDate(employeeEntity.getArrivaldate());
            employeeCellList.add(employeeCell);
        }

        // 將明細資料存放到資料列中
        List<DataGridRow> allEmployeeRowList = new ArrayList<>();
        for (EmployeeCell employeeCell : employeeCellList) {
            DataGridRow row = new DataGridRow();
            row.addCell(employeeCell);
            allEmployeeRowList.add(row);
        }

        // 取得指定頁面資料
        List<DataGridRow> pageEmployeeRowList = new ArrayList<>();
        pageEmployeeRowList = getPageRowList(queryEmployeeRq.getPage(), queryEmployeeRq.getPageSize(), allEmployeeRowList);

        // 整理表格資料
        DataGridValue dataGridValue = new DataGridValue();
        ConversationKxy conversationKxy = new ConversationKxy();
        conversationKxy.setPageSize(queryEmployeeRq.getPageSize());
        dataGridValue.setConversationKxy(conversationKxy);
        dataGridValue.setTotalCacheCount(allEmployeeRowList.size());
        dataGridValue.setRows(pageEmployeeRowList);

        return dataGridValue;

    }

}
