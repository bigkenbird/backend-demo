/*
 * ===========================================================================
 * IBM Confidential
 * AIS Source Materials
 * (C) Copyright IBM Corp. 2005.
 * ===========================================================================
 */
package com.feib.demo.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * 提供DataGrid的實體化物件.
 */
public class DataGridValue implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /** 薪資明細 DataGrid. */
    private List<DataGridRow> rows;

    /** 交易代號. */
    private String taskIxd;

    /** 給予每一個DataGrid一個ID. */
    private String datagridIxd;

    /** 每頁顯示筆數. */
    private int pageSize = 20;

    /** 目前cache內的總筆數. */
    private int totalCacheCount = 0;

    /** 資料筆數超過 warningCount 筆，請縮小查詢條件. */
    private int warningCount = 0;

    /** conversation end (前端是否要顯示更多資料) */
    private boolean messageEnd = false;

    /** 超過最大筆數 */
    private boolean overMaxCount = false;

    /** 折返鍵值. */
    private ConversationKxy conversationKxy = null;

    /**
     * Instantiates a new mb data grid value.
     */
    public DataGridValue() {
        super();
    }

    /**
     * Instantiates a new mb data grid value.
     */
    public DataGridValue(FetchCondition condition) {
        super();

        // 交易代號
        this.taskIxd = condition.getTaskIxd();

        // Lazy Load Data Grid ID
        this.datagridIxd = condition.getDatagridIxd();

        // page size
        this.pageSize = condition.getPageSize();

    }

    /**
     * Instantiates a new mb data grid value.
     * @param totalRecordCount
     *            the total record count
     * @param warningCount
     *            the warning count
     * @param rows
     *            the rows
     * @param condition
     *            the condition
     */
    // public MbDataGridValue(int totalRecordCount, int warningCount, List<DataGridRow> rows, DataGridFetchCondition condition) {
    //
    // // Lazy Load Data Grid ID
    // super.setDatagridIxd(condition.getDatagridIxd());
    //
    // super.setPageSize(condition.getPageSize());
    //
    // this.rows = rows;
    //
    // // 交易代號
    // this.setTaskIxd(condition.getTaskIxd());
    //
    // // 資料鏓筆數
    // super.setTotalRecordCount(totalRecordCount);
    //
    // if (warningCount > 0) {
    // if (totalRecordCount > warningCount) {
    // super.setWarningCount(warningCount);
    // }
    // }
    //
    // }

    /**
     * @return {@link #rows}
     */
    public List<DataGridRow> getRows() {
        return (rows != null) ? rows : new ArrayList<>(0);
    }

    /**
     * @param rows
     *            {@link #rows}
     */
    public void setRows(List<DataGridRow> rows) {
        this.rows = rows;
    }

    /**
     * @return {@link #taskIxd}
     */
    public String getTaskIxd() {
        return taskIxd;
    }

    /**
     * @param taskIxd
     *            {@link #taskIxd}
     */
    public void setTaskIxd(String taskIxd) {
        this.taskIxd = taskIxd;
    }

    /**
     * @return {@link #datagridIxd}
     */
    public String getDatagridIxd() {
        return datagridIxd;
    }

    /**
     * @param datagridIxd
     *            {@link #datagridIxd}
     */
    public void setDatagridIxd(String datagridIxd) {
        this.datagridIxd = datagridIxd;
    }

    /**
     * @return {@link #pageSize}
     */
    public int getPageSize() {
        return pageSize;
    }

    /**
     * @param pageSize
     *            {@link #pageSize}
     */
    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    /**
     * @return {@link #totalCacheCount}
     */
    public int getTotalCacheCount() {
        return totalCacheCount;
    }

    /**
     * @param totalCacheCount
     *            {@link #totalCacheCount}
     */
    public void setTotalCacheCount(int totalCacheCount) {
        this.totalCacheCount = totalCacheCount;
    }

    /**
     * @return {@link #warningCount}
     */
    public int getWarningCount() {
        return warningCount;
    }

    /**
     * @param warningCount
     *            {@link #warningCount}
     */
    public void setWarningCount(int warningCount) {
        this.warningCount = warningCount;
    }

    /**
     * @return {@link #messageEnd}
     */
    public boolean isMessageEnd() {
        return messageEnd;
    }

    /**
     * @param messageEnd
     *            {@link #messageEnd}
     */
    public void setMessageEnd(boolean messageEnd) {
        this.messageEnd = messageEnd;
    }

    /**
     * @return {@link #overMaxCount}
     */
    public boolean isOverMaxCount() {
        return overMaxCount;
    }

    /**
     * @param overMaxCount
     *            {@link #overMaxCount}
     */
    public void setOverMaxCount(boolean overMaxCount) {
        this.overMaxCount = overMaxCount;
    }

    /**
     * @return {@link #conversationKxy}
     */
    public ConversationKxy getConversationKxy() {
        return conversationKxy;
    }

    /**
     * @param conversationKxy
     *            {@link #conversationKxy}
     */
    public void setConversationKxy(ConversationKxy conversationKxy) {
        this.conversationKxy = conversationKxy;
    }

}
