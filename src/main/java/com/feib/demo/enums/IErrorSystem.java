/*
 * ===========================================================================
 * IBM Confidential
 * AIS Source Materials
 * (C) Copyright IBM Corp. 2009.
 * ===========================================================================
 */
package com.feib.demo.enums;

/**
 * <p>
 * 錯誤系統介面.
 * </p>
 * @author jeff
 * @version 1.0, Oct 13, 2009
 * @see
 * @since
 */
public interface IErrorSystem extends IEnum {

    /**
     * 取得錯誤系統代碼.
     * @return
     */
    String getErrorSystemIxd();

    /**
     * 錯誤代碼前兩碼
     * @return
     */
    String getLevel1Prefix();

}