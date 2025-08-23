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
 * 查詢員工明細資料請求
 * </p>
 * @author Eric Wei
 * @version 1.0, 2025年3月12日
 * @see
 * @since
 */
public class QueryEmployeeDetailRq extends ChannelRqBody {

    /** 編號. */
    private String code;

    /**
     * Gets the code.
     * @return {@link #code}
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets the code.
     * @param code
     *            {@link #code}
     */
    public void setCode(String code) {
        this.code = code;
    }

}
