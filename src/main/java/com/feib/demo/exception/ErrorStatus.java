/*
 * ===========================================================================
 * IBM Confidential
 * AIS Source Materials
 * (C) Copyright IBM Corp. 2007.
 * ===========================================================================
 */
package com.feib.demo.exception;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.feib.demo.enums.IErrorCode;
import com.feib.demo.enums.IErrorSystem;
import com.feib.demo.enums.SeverityType;

/**
 * 異常資料.
 * @author jeff
 * @version 1.0, 2007/9/13
 * @see
 * @since
 */
public class ErrorStatus implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /** error code 和 交易代號的分隔符號. */
    public static final String ERROR_DELIM = ":";

    /** error desc 儲存的最大長度. */
    private static final int ERROR_DESC_MAX_LEN = 512;

    /** error param josn儲存的最大長度. */
    private static final int ERROR_PARAM_MAX_LEN = 256;

    /** 系統代碼. */
    private String systemIxd = "";

    /** 交易回應代碼. */
    private String errorCode = "";

    /** 狀態等級. */
    private SeverityType severity = SeverityType.INFO;

    /** 狀態描述. */
    private String errorDesc = "";

    /** 錯誤參數LIST. */
    private List<String> errorParamList = new ArrayList<>();

    /** 錯誤欄位與訊息 */
    private Map<String, String> errorFields;

    /**
     * Constructor.
     */
    public ErrorStatus() {
        super();
    }

    /**
     * Constructor.
     * @param status
     *            the status.
     */
    public ErrorStatus(ErrorStatus status) {
        if (null == status) {
            return;
        }

        this.systemIxd = status.getSystemIxd();
        this.errorCode = status.getErrorCode();
        this.severity = status.getSeverity();
        this.errorDesc = status.getErrorDesc();
        this.errorParamList = status.getErrorParamList();
    }

    /**
     * Constructor.
     * @param systemIxd
     *            the system ixd.
     * @param errorCode
     *            the error code.
     * @param severity
     *            the severity.
     * @param errorDesc
     *            the error desc.
     */
    public ErrorStatus(String systemIxd, String errorCode, SeverityType severity, String errorDesc) {
        this.systemIxd = systemIxd;
        this.errorCode = errorCode;
        this.severity = severity;
        this.errorDesc = errorDesc;
    }

    public ErrorStatus(IErrorSystem errorSystem, String shortErrorCode, SeverityType severity, String errorDesc) {

        this.systemIxd = errorSystem.getErrorSystemIxd();
        this.errorCode = errorSystem.getLevel1Prefix() + shortErrorCode;
        this.severity = severity;
        this.errorDesc = errorDesc;
    }

    public ErrorStatus(String systemIxd, String errorCode, String errorDesc) {
        this(systemIxd, errorCode, SeverityType.ERROR, errorDesc);
    }

    /**
     * Constructor.
     * @param code
     *            the code.
     */
    public ErrorStatus(IErrorCode code) {
        ErrorStatus error = code.getErrorStatus();

        this.systemIxd = error.getSystemIxd();
        this.errorCode = error.getErrorCode();
        this.severity = error.getSeverity();
        this.errorDesc = error.getErrorDesc();
    }

    /**
     * Constructor.
     * @param systemIxd
     *            the system ixd.
     * @param errorCode
     *            the error code.
     * @param severity
     *            the severity.
     * @param errorDesc
     *            the error desc.
     */
    public ErrorStatus(String systemIxd, String errorCode, String severity, String errorDesc) {
        this(systemIxd, errorCode, SeverityType.find(severity), errorDesc);
    }

    /**
     * 是否為Timeout.
     * @return true, if is timeout
     */
    public boolean isTimeout() {

        return getSeverity().isTimeout();
    }

    /**
     * 是否為warning.
     * @return true, if is warning
     */
    public boolean isWarning() {
        return getSeverity().isWarn();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();

        sb.append("system ixd = ").append(systemIxd);
        sb.append(", error code = ").append(errorCode);
        sb.append(", severity = ").append(severity);
        sb.append(", desc = ").append(errorDesc);

        return sb.toString();
    }

    /**
     * Gets the system ixd.
     * @return {@link #systemIxd}
     */
    public String getSystemIxd() {
        return systemIxd;
    }

    /**
     * Sets the system ixd.
     * @param systemIxd
     *            {@link #systemIxd}
     */
    public void setSystemIxd(String systemIxd) {
        this.systemIxd = systemIxd;
    }

    /**
     * Gets the error code.
     * @return {@link #errorCode}
     */
    public String getErrorCode() {
        return errorCode;
    }

    /**
     * Sets the error code.
     * @param errorCode
     *            {@link #errorCode}
     */
    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    /**
     * Gets the severity.
     * @return {@link #severity}
     */
    public SeverityType getSeverity() {
        return severity;
    }

    /**
     * Sets the severity.
     * @param severity
     *            {@link #severity}
     */
    public void setSeverity(SeverityType severity) {
        this.severity = severity;
    }

    /**
     * Gets the error desc.
     * @return {@link #errorDesc}
     */
    public String getErrorDesc() {

        return errorDesc;
    }

    /**
     * 取得錯誤訊息
     * @param params
     * @return
     */
    public String getErrorDescMessage(String[] params) {

        if (params == null || params.length == 0) {
            return errorDesc;
        }

        return String.format(errorDesc, (Object[]) params);
    }

    /**
     * Sets the error desc.
     * @param errorDesc
     *            {@link #errorDesc}
     */
    public void setErrorDesc(String errorDesc) {
        this.errorDesc = errorDesc;
    }

    /**
     * @return {@link #errorParamList}
     */
    public List<String> getErrorParamList() {
        return errorParamList;
    }

    /**
     * @param errorParamList
     *            {@link #errorParamList}
     */
    public void setErrorParamList(List<String> errorParamList) {
        this.errorParamList = errorParamList;
    }

    /**
     * @return {@link #errorFields}
     */
    public Map<String, String> getErrorFields() {
        return errorFields;
    }

    /**
     * @param errorFields
     *            {@link #errorFields}
     */
    public void setErrorFields(Map<String, String> errorFields) {
        this.errorFields = errorFields;
    }

}
