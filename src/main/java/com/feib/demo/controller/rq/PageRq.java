/*
 * ===========================================================================
 * IBM Confidential
 * AIS Source Materials
 * (C) Copyright IBM Corp. 2025.
 * ===========================================================================
 */
package com.feib.demo.controller.rq;

import com.feib.demo.common.rq.ChannelRqBody;

/**
 * <p>
 * 分頁請求
 * </p>
 * @author Eric Wei
 * @version 1.0, 2025年3月7日
 * @see
 * @since
 */
public class PageRq extends ChannelRqBody {

    /** 頁次. */
    private int page = 1;

    /** 每頁筆數. */
    private int pageSize = 10;

    /**
     * Gets the page.
     * @return {@link #page}
     */
    public int getPage() {
        return page;
    }

    /**
     * Sets the page.
     * @param page
     *            {@link #page}
     */
    public void setPage(int page) {
        this.page = page;
    }

    /**
     * Gets the pageSize.
     * @return {@link #pageSize}
     */
    public int getPageSize() {
        return pageSize;
    }

    /**
     * Sets the pageSize.
     * @param pageSize
     *            {@link #pageSize}
     */
    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

}
