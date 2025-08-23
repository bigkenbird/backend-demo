/*
 * ===========================================================================
 * IBM Confidential
 * AIS Source Materials
 * (C) Copyright IBM Corp. 2024.
 * ===========================================================================
 */
package com.feib.demo.model;

/**
 * <p>
 * 折返資料
 * </p>
 * .
 * @author jeff
 * @version 1.0, 2024年7月1日
 * @see
 * @since
 */
public class ConversationKxy {

    /** 交易代號. */
    private String taskIxd;

    /** DataGrid ID. */
    private String dataGridIxd;

    /** 下次抓取的資料位置. */
    private int fetchIndex = -1;

    /** 每頁的筆數. */
    private int pageSize;

    /**
     * Instantiates a new conversation kxy.
     */
    public ConversationKxy() {
        super();
    }

    /**
     * Instantiates a new conversation kxy.
     * @param taskIxd
     *            the task ixd
     * @param dataGridIxd
     *            the data grid ixd
     * @param pageSize
     *            the page size
     * @param fetchIndex
     *            the fetch index
     */
    public ConversationKxy(String taskIxd, String dataGridIxd, int pageSize, int fetchIndex) {

        this.taskIxd = taskIxd;
        this.dataGridIxd = dataGridIxd;
        this.fetchIndex = fetchIndex;
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
     * Sets the task ixd.
     * @param taskIxd
     *            {@link #taskIxd}
     */
    public void setTaskIxd(String taskIxd) {
        this.taskIxd = taskIxd;
    }

    /**
     * Gets the data grid ixd.
     * @return {@link #dataGridIxd}
     */
    public String getDataGridIxd() {
        return dataGridIxd;
    }

    /**
     * Sets the data grid ixd.
     * @param dataGridIxd
     *            {@link #dataGridIxd}
     */
    public void setDataGridIxd(String dataGridIxd) {
        this.dataGridIxd = dataGridIxd;
    }

    /**
     * Gets the fetch index.
     * @return {@link #fetchIndex}
     */
    public int getFetchIndex() {
        return fetchIndex;
    }

    /**
     * Sets the fetch index.
     * @param fetchIndex
     *            {@link #fetchIndex}
     */
    public void setFetchIndex(int fetchIndex) {
        this.fetchIndex = fetchIndex;
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

}
