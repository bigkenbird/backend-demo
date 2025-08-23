/*
 * ===========================================================================
 * IBM Confidential
 * AIS Source Materials
 * (C) Copyright IBM Corp. 2012.
 * ===========================================================================
 */
package com.feib.demo.enums;

/**
 * <p>
 * Enum共同介面.
 * </p>
 * @author Leo
 * @version 1.0, 2012/11/26
 * @see
 * @since
 */
public interface IEnum {

    /** 未知代碼. */
    int UNKNOWN_INT_CODE = -9;

    /** 未知代碼. */
    String UNKNOWN_STR_CODE = "";

    String NULL_STRING = null;

    /**
     * get enum name.
     * @return enum name
     */
    String name();

    /**
     * 取得備註(僅供程式說明及code gen使用)
     * @return
     */
    default String getMemo() {
        return "";
    }

}
