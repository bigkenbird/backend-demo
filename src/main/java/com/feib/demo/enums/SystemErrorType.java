/*
 * ===========================================================================
 * IBM Confidential
 * AIS Source Materials
 * (C) Copyright IBM Corp. 2017.
 * ===========================================================================
 */
package com.feib.demo.enums;

/**
 * <p>
 * 異常處理方式
 * </p>
 * @author Jeff
 * @version 1.0, 2021/10/21
 * @see
 * @since
 */
public enum SystemErrorType implements IEnum {

    EXPRIRE("SESSION TIMEOUT"),

    SESSION_NEED_RELOAD("SESSION NEED RELOAD"),

    MKT_ERROR("MKT ERROR"),

    INVALID_SESSION("INVALID SESSION"),

    SYSTEM_SUSPEND("系統暫停"),

    SYSTEM_COUNTDOWN("系統倒數計時"),

    TASK_SUSPEND("交易暫停"),

    TASK_COUNTDOWN("交易倒數計時"),

    USER_OFFLINE("使用者已經登出系統 (eg. 後踢前, 被踢掉的前者)"),

    FIELD_VALIDATE_EXCEPTION("欄位檢核失敗"),

    /** (此類錯誤由iMP Adator產生, 在此定義僅為參考) */
    CHANNER_SERVICE_SHUTDOWN("CHANNEL SERVICE 停機"),

    COMMON_ERROR("共同錯誤頁"),

    UNKNOWN("未知");

    /** 說明 */
    String memo = "";

    /**
     * 建構子.
     * @param code
     *            the code.
     * @param memo
     *            the memo.
     */
    SystemErrorType(String memo) {
        this.memo = memo;
    }

    /**
     * 依據狀態碼取得狀態.
     * @param code
     *            the code.
     * @return the YesNoFlag
     */
    public static SystemErrorType find(String code) {
        SystemErrorType type = SystemErrorType.UNKNOWN;
        try {
            type = SystemErrorType.valueOf(code);
        }
        catch (Exception e) {
            type = SystemErrorType.UNKNOWN;
        }

        return type;
    }

    /**
     * Gets the code.
     * @return {@link #code}
     */
    public String getCode() {
        return name();
    }

    @Override
    public String getMemo() {
        return this.memo;
    }

    /**
     * session expire
     * @return
     */
    public boolean isExpire() {
        return equals(SystemErrorType.EXPRIRE);
    }

    /**
     * 系統暫停
     * @return
     */
    public boolean isSystemSuspend() {
        return equals(SystemErrorType.SYSTEM_SUSPEND);
    }

    /**
     * 系統暫停倒數計時
     * @return
     */
    public boolean isSystemCountdown() {
        return equals(SystemErrorType.SYSTEM_COUNTDOWN);
    }

    /**
     * 交易暫停
     * @return
     */
    public boolean isTaskSuspend() {
        return equals(SystemErrorType.TASK_SUSPEND);
    }

    /**
     * 交易暫停倒數計時
     * @return
     */
    public boolean isTaskCountdown() {
        return equals(SystemErrorType.TASK_COUNTDOWN);
    }

    /**
     * 使用者已經登出系統
     * @return
     */
    public boolean isUserOffline() {
        return equals(SystemErrorType.USER_OFFLINE);
    }

    /**
     * 欄位檢核失敗
     * @return
     */
    public boolean isFieldValidation() {
        return equals(SystemErrorType.FIELD_VALIDATE_EXCEPTION);
    }

    /**
     * 共同錯誤
     * @return
     */
    public boolean isCommonError() {
        return equals(SystemErrorType.COMMON_ERROR);
    }

    /**
     * 是否為未明.
     * @return ture, if is unknown
     */
    public boolean isUnknown() {
        return equals(SystemErrorType.UNKNOWN);
    }

}
