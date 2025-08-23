/*
 * ===========================================================================
 * IBM Confidential
 * AIS Source Materials
 * (C) Copyright IBM Corp. 2012.
 * ===========================================================================
 */
package com.feib.demo.enums;

import com.feib.demo.exception.ErrorStatus;

/**
 * <p>
 * Error Code Interface.
 * </p>
 * @author jeff
 * @version 1.0, Apr 13, 2012
 * @see
 * @since
 */
public interface IErrorCode extends IEnum {

    /**
     * 取得錯誤資料.
     * @return ErrorStatus
     */
    ErrorStatus getErrorStatus();

}
