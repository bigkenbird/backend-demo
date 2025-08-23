/*
 * ===========================================================================
 * IBM Confidential
 * AIS Source Materials
 * (C) Copyright IBM Corp. 2025.
 * ===========================================================================
 */
package com.feib.demo.controller.rs;

import com.feib.demo.common.rs.ChannelRsBody;

/**
 * <p>
 * 查詢員工明細資料回覆
 * </p>
 * @author Eric Wei
 * @version 1.0, 2025年3月12日
 * @see
 * @since
 */
public class QueryEmployeeDetailRs extends ChannelRsBody {

    /** 姓名. */
    private String name;

    /**
     * Gets the name.
     * @return {@link #name}
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name.
     * @param name
     *            {@link #name}
     */
    public void setName(String name) {
        this.name = name;
    }

}
