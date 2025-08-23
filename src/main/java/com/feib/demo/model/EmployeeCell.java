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
 * 登入紀錄明細
 * </p>
 * @author Eric Wei
 * @version 1.0, 2024年7月9日
 * @see
 * @since
 */
public class EmployeeCell implements DataGridCell {

    /** 筆次 */
    private Integer number;

    /** 員工編號 */
    private String code;

    /** 員工姓名 */
    private String name;

    /** 職稱 */
    private String title;

    /** 部門 */
    private String department;

    /** 到職日 */
    private String arrivalDate;

    /**
     * @return {@link #number}
     */
    public Integer getNumber() {
        return number;
    }

    /**
     * @param number
     *            {@link #number}
     */
    public void setNumber(Integer number) {
        this.number = number;
    }

    /**
     * @return {@link #code}
     */
    public String getCode() {
        return code;
    }

    /**
     * @param code
     *            {@link #code}
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * @return {@link #name}
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     *            {@link #name}
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return {@link #title}
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title
     *            {@link #title}
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return {@link #department}
     */
    public String getDepartment() {
        return department;
    }

    /**
     * @param department
     *            {@link #department}
     */
    public void setDepartment(String department) {
        this.department = department;
    }

    /**
     * @return {@link #arrivalDate}
     */
    public String getArrivalDate() {
        return arrivalDate;
    }

    /**
     * @param arrivalDate
     *            {@link #arrivalDate}
     */
    public void setArrivalDate(String arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

}
