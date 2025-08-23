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
 * Severity Type.
 * </p>
 * @author jeff
 * @version 1.0, Apr 13, 2012
 * @see
 * @since
 */
public enum SeverityType implements IEnum {

    /** 狀態等級-資訊. */
    INFO("INFO", 1),

    /** 狀態等級-警告. */
    WARN("WARN", 2),

    /** 狀態等級-錯誤. */
    ERROR("ERROR", 3),

    /** 狀態等級-逾時. */
    TIMEOUT("TIMEOUT", 10),

    /** 狀態等級-傳送異常. */
    SENDFAIL("SENDFAIL", 15),

    /** 狀態等級-異常. */
    FATAL("FATAL", 90),

    /** 機房通知. */
    OMS("OMS", 99),

    /** 未知. */
    UNKNOWN("UNKNOWN", 0);

    /** 代碼. */
    private String code;

    /** 重要性(值越大表示priority越高). */
    private int priority;

    /**
     * Constructor.
     * @param code
     *            the code.
     * @param priority
     *            the priority.
     */
    SeverityType(String code, int priority) {
        this.code = code;
        this.priority = priority;
    }

    /**
     * 依據代碼取得SourceType.
     * @param code
     *            the code.
     * @return the SeverityType
     */
    public static SeverityType find(String code) {
        for (SeverityType value : SeverityType.values()) {
            if (value.getCode().equals(code)) {
                return value;
            }
        }
        return SeverityType.UNKNOWN;
    }

    /**
     * 依據 Priority 取得SeverityType
     * @param priority
     * @return
     */
    public static SeverityType find(int priority) {

        for (SeverityType value : SeverityType.values()) {
            if (value.getPriority() == priority) {
                return value;
            }
        }

        return SeverityType.UNKNOWN;
    }

    /**
     * 根據名稱(eg. ERROR)取的資料.
     * @param name
     *            the name.
     * @return the SeverityType
     */
    public static SeverityType findByName(String name) {
        for (SeverityType group : SeverityType.values()) {
            if (group.name().equals(name)) {
                return group;
            }
        }

        return SeverityType.UNKNOWN;
    }

    /**
     * Gets the code.
     * @return String
     */
    public String getCode() {
        return code;
    }

    /**
     * Gets the priority.
     * @return {@link #priority}
     */
    public int getPriority() {
        return priority;
    }

    /**
     * 是否為TIMEOUT.
     * @return true, if is timeout
     */
    public boolean isTimeout() {
        return equals(SeverityType.TIMEOUT);
    }

    /**
     * 是否為FATAL ERROR.
     * @return true, if is fatal
     */
    public boolean isFatal() {
        return equals(SeverityType.FATAL);
    }

    /**
     * 最嚴重的異常
     * @return
     */
    public boolean isOms() {
        return equals(SeverityType.OMS);
    }

    /**
     * 是否為INFO.
     * @return true, if is info
     */
    public boolean isInfo() {
        return equals(SeverityType.INFO);
    }

    /**
     * 是否為ERROR.
     * @return true, if is error
     */
    public boolean isError() {
        return equals(SeverityType.ERROR);
    }

    /**
     * 是否為WARN.
     * @return true, if is warn
     */
    public boolean isWarn() {
        return equals(SeverityType.WARN);
    }

    /**
     * 是否為未知.
     * @return true, if is unknown
     */
    public boolean isUnknown() {
        return equals(SeverityType.UNKNOWN);
    }

    @Override
    public String getMemo() {
        return this.code;
    }

}
