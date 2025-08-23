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
 * 異常分類.
 * </p>
 */
public enum ErrorCategoryType implements IEnum {

    /** 系統: 統一處理 */
    SYSTEM("SYSTEM", "系統"),

    /** 交易: 交易自行處理 */
    TASK("TASK", "交易"),

    /** 未知. */
    UNKNOWN(UNKNOWN_STR_CODE, "未知");

    /** 代碼. */
    private String code;

    /** 說明 */
    private String memo;

    /**
     * Constructor
     * @param code
     * @param memo
     */
    ErrorCategoryType(String code, String memo) {
        this.code = code;
        this.memo = memo;
    }

    /**
     * Gets the code.
     * @return {@link #code}
     */
    public String getCode() {
        return code;
    }

    @Override
    public String getMemo() {
        return this.memo;
    }

    /**
     * 依據代碼取得類別.
     * @param code
     *            the code.
     * @return the AesPaddingType
     */
    public static ErrorCategoryType find(String code) {

        for (ErrorCategoryType value : ErrorCategoryType.values()) {
            if (value.getCode().equalsIgnoreCase(code)) {
                return value;
            }
        }
        return ErrorCategoryType.UNKNOWN;
    }

    /**
     * unknown.
     * @return true, if is unknown
     */
    public boolean isUnknown() {
        return equals(ErrorCategoryType.UNKNOWN);
    }

}
