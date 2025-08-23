/*
 * ===========================================================================
 * IBM Confidential
 * AIS Source Materials
 * (C) Copyright IBM Corp. 2025.
 * ===========================================================================
 */
package com.feib.demo.controller.rq;

/**
 * <p>
 * 查詢員工資料請求
 * </p>
 * @author Eric Wei
 * @version 1.0, 2025年3月7日
 * @see
 * @since
 */
public class QueryEmployeeRq extends PageRq {

    /** 編號. */
    private String code;

    /** 姓名. */
    private String name;

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
