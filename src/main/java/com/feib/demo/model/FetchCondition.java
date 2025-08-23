/*
 * ===========================================================================
 * IBM Confidential
 * AIS Source Materials
 * (C) Copyright IBM Corp. 2024.
 * ===========================================================================
 */
package com.feib.demo.model;

import java.util.UUID;

/**
 * <p>
 * Data Grid 取得資料的條件.
 * </p>
 * @author jeff
 * @version 1.0, 2024年6月7日
 * @see
 * @since
 */
public abstract class FetchCondition {

    /** 交易代號. */
    private String taskIxd;

    /** DataGrid ID (請 Client 端自己儲存好這個 ID, 每次都帶入相同 ID). */
    private String datagridIxd;

    /** 取得第幾頁資料. */
    private int pageNo;

    /** 每頁幾筆. */
    private int pageSize;

    /**
     * Instantiates a new fetch condition.
     */
    public FetchCondition() {
        super();
    }

    /**
     * Constructor.
     * @param taskIxd
     *            the task ixd
     */
    public FetchCondition(String taskIxd) {
        super();
        this.taskIxd = taskIxd;
        this.datagridIxd = "DataGrid_" + UUID.randomUUID().toString();
    }

    /**
     * Constructor.
     * @param taskIxd
     *            the task ixd
     * @param datagridIxd
     *            the datagrid ixd
     */
    public FetchCondition(String taskIxd, String datagridIxd) {
        super();
        this.taskIxd = taskIxd;
        this.datagridIxd = datagridIxd;
    }

    /**
     * Gets the page no.
     * @return {@link #pageNo}
     */
    public int getPageNo() {
        return pageNo;
    }

    /**
     * Sets the page no.
     * @param pageNo
     *            {@link #pageNo}
     */
    public void setPageNo(int pageNo) {
        this.pageNo = pageNo;
    }

    /**
     * Gets the page size.
     * @return {@link #pageSize}
     */
    public int getPageSize() {
        return pageSize;
    }

    /**
     * Sets the page size.
     * @param pageSize
     *            {@link #pageSize}
     */
    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    /**
     * Gets the task ixd.
     * @return {@link #taskIxd}
     */
    public String getTaskIxd() {
        return taskIxd;
    }

    /**
     * Gets the datagrid ixd.
     * @return {@link #datagridIxd}
     */
    public String getDatagridIxd() {
        return datagridIxd;
    }

}
