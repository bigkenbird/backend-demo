/*
 * ===========================================================================
 * IBM Confidential
 * AIS Source Materials
 * (C) Copyright IBM Corp. 2022.
 * ===========================================================================
 */
package com.feib.demo.exception;

import com.feib.demo.enums.ErrorCategoryType;
import com.feib.demo.enums.IErrorCode;
import com.feib.demo.enums.SystemErrorType;

/**
 * <p>
 * APP 的異常狀態
 * </p>
 * @author jeff
 * @version 1.0, 2022年1月25日
 * @see
 * @since
 */
public class ErrorStatusEx extends ErrorStatus {

    private static final long serialVersionUID = 1L;

    /** 分類: SYSTEM OR TASK */
    private String category = ErrorCategoryType.UNKNOWN_STR_CODE;

    /** 系統異常類別 */
    private String errorType = SystemErrorType.UNKNOWN_STR_CODE;

    /** 前端顯示的錯誤訊息. */
    private String displayMessage;

    /** 提供前端除錯誤訊息以外，回傳其他訊息 */
    private String extraMessage;

    /** 倒數計時秒數. */
    private int countdownSec = -1;

    public ErrorStatusEx() {
        super();
    }

    /**
     * Constructor
     * @param code
     */
    public ErrorStatusEx(IErrorCode code) {
        this(code.getErrorStatus());
    }

    /**
     * Constructor
     * @param status
     */
    public ErrorStatusEx(ErrorStatus status) {
        setSystemIxd(status.getSystemIxd());
        setErrorCode(status.getErrorCode());
        setSeverity(status.getSeverity());
        setErrorDesc(status.getErrorDesc());
        setErrorParamList(status.getErrorParamList());
        setErrorFields(status.getErrorFields());
    }

    /**
     * @return {@link #category}
     */
    public String getCategory() {
        return category;
    }

    /**
     * @param category
     *            {@link #category}
     */
    public void setCategory(String category) {
        this.category = category;
    }

    /**
     * @return {@link #errorType}
     */
    public String getErrorType() {
        return errorType;
    }

    /**
     * @param errorType
     *            {@link #errorType}
     */
    public void setErrorType(String errorType) {
        this.errorType = errorType;
    }

    /**
     * @return {@link #displayMessage}
     */
    public String getDisplayMessage() {
        return displayMessage;
    }

    /**
     * @param displayMessage
     *            {@link #displayMessage}
     */
    public void setDisplayMessage(String displayMessage) {
        this.displayMessage = displayMessage;
    }

    /**
     * @return {@link #extraMessage}
     */
    public String getExtraMessage() {
        return extraMessage;
    }

    /**
     * @param extraMessage
     *            {@link #extraMessage}
     */
    public void setExtraMessage(String extraMessage) {
        this.extraMessage = extraMessage;
    }

    /**
     * @return {@link #countdownSec}
     */
    public int getCountdownSec() {
        return countdownSec;
    }

    /**
     * @param countdownSec
     *            {@link #countdownSec}
     */
    public void setCountdownSec(int countdownSec) {
        this.countdownSec = countdownSec;
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder(super.toString());

        sb.append(", error type = ").append(errorType);

        return sb.toString();
    }

}
