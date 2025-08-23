/*
 * ===========================================================================
 * IBM Confidential
 * AIS Source Materials
 * (C) Copyright IBM Corp. 2025.
 * ===========================================================================
 */
package com.feib.demo.persistence.entity;

import java.io.Serializable;

import jakarta.persistence.Basic;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

/**
 * <p>
 * 員工資料 Entity.
 * </p>
 * @author Eric Wei
 * @version 1.0, 2025年3月7號
 * @see
 * @since
 */
@Entity
@Table(name = "EMPLOYEE")
@Data
public class EmployeeEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    /** 編號. */
    @Id
    private String code;

    /** 姓名. */
    @Basic
    private String name;

    /** 職稱. */
    @Basic
    private String title;

    /** 部門. */
    @Basic
    private String department;

    /** 到職日. */
    @Basic
    private String arrivaldate;
}
