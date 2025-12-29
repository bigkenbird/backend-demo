/*
 * ===========================================================================
 * IBM Confidential
 * AIS Source Materials
 * (C) Copyright IBM Corp. 2021.
 * ===========================================================================
 */
package com.feib.demo.common.rs;

import com.feib.demo.exception.ErrorStatusEx;

import java.util.Date;

/**
 * <p>
 * Channel -> Client response meta data.
 * </p>
 * @author jeff
 * @version 1.0, 2021年9月27日
 * @see
 * @since
 */
public class ChannelRsMeta {

    /** 回應錯誤來源的系統別 */
    private String serviceIxd;

    /** 此次請求之 Task ID */
    private String taskIxd;

    /** 回應狀態. */
    private ErrorStatusEx status;

    /** Client 端發送請求時的時間戳記 */
    private Date clientTime;

    /** Server端回應時的時間戳記. */
    private Date serverTime;

    /** 是否更新 交易重複檢核用 Token */
    private boolean updateSubmitToken = true;

    /** 交易重覆檢核用Token */
    private String submitToken;

    /** 交易task名稱 */
    private String taskName;

    /** request URL */
    private String requestUrl;

    /** 交易 Timeout 之設定時間 */
    private int taskTimeout;

    /** 是否重置task timeout時間 */
    private boolean resetTaskTimeout = true;

    /**
     * @return {@link #serviceIxd}
     */
    public String getServiceIxd() {
        return serviceIxd;
    }

    /**
     * @param serviceIxd
     *            {@link #serviceIxd}
     */
    public void setServiceIxd(String serviceIxd) {
        this.serviceIxd = serviceIxd;
    }

    /**
     * @return {@link #taskIxd}
     */
    public String getTaskIxd() {
        return taskIxd;
    }

    /**
     * @param taskIxd
     *            {@link #taskIxd}
     */
    public void setTaskIxd(String taskIxd) {
        this.taskIxd = taskIxd;
    }

    /**
     * @return {@link #status}
     */
    public ErrorStatusEx getStatus() {
        return status;
    }

    /**
     * @param status
     *            {@link #status}
     */
    public void setStatus(ErrorStatusEx status) {
        this.status = status;
    }

    /**
     * @return {@link #clientTime}
     */
    public Date getClientTime() {
        return clientTime;
    }

    /**
     * @param clientTime
     *            {@link #clientTime}
     */
    public void setClientTime(Date clientTime) {
        this.clientTime = clientTime;
    }

    /**
     * @return {@link #serverTime}
     */
    public Date getServerTime() {
        return serverTime;
    }

    /**
     * @param serverTime
     *            {@link #serverTime}
     */
    public void setServerTime(Date serverTime) {
        this.serverTime = serverTime;
    }

    /**
     * @return {@link #submitToken}
     */
    public String getSubmitToken() {
        return submitToken;
    }

    /**
     * @param submitToken
     *            {@link #submitToken}
     */
    public void setSubmitToken(String submitToken) {
        this.submitToken = submitToken;
    }

    /**
     * @return {@link #taskName}
     */
    public String getTaskName() {
        return taskName;
    }

    /**
     * @param taskName
     *            {@link #taskName}
     */
    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    /**
     * @return {@link #updateSubmitToken}
     */
    public boolean isUpdateSubmitToken() {
        return updateSubmitToken;
    }

    /**
     * @param updateSubmitToken
     *            {@link #updateSubmitToken}
     */
    public void setUpdateSubmitToken(boolean updateSubmitToken) {
        this.updateSubmitToken = updateSubmitToken;
    }

    /**
     * @return {@link #resetTaskTimeout}
     */
    public boolean isResetTaskTimeout() {
        return resetTaskTimeout;
    }

    /**
     * @param resetTaskTimeout
     *            {@link #resetTaskTimeout}
     */
    public void setResetTaskTimeout(boolean resetTaskTimeout) {
        this.resetTaskTimeout = resetTaskTimeout;
    }

    /**
     * @return {@link #requestUrl}
     */
    public String getRequestUrl() {
        return requestUrl;
    }

    /**
     * @param requestUrl
     *            {@link #requestUrl}
     */
    public void setRequestUrl(String requestUrl) {
        this.requestUrl = requestUrl;
    }

    /**
     * @return {@link #taskTimeout}
     */
    public int getTaskTimeout() {
        return taskTimeout;
    }

    /**
     * @param taskTimeout
     *            {@link #taskTimeout}
     */
    public void setTaskTimeout(int taskTimeout) {
        this.taskTimeout = taskTimeout;
    }

}
