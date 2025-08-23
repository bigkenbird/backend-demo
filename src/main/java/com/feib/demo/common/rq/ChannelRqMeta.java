/*
 * ===========================================================================
 * IBM Confidential
 * AIS Source Materials
 * (C) Copyright IBM Corp. 2020.
 * ===========================================================================
 */
package com.feib.demo.common.rq;

import java.util.Date;

/**
 * <p>
 * Client -> Channel Service Meta Data.
 * </p>
 * @author Jeff
 * @version 1.0, 2020年2月25日
 * @see
 * @since
 */
public class ChannelRqMeta {

    /** 裝置Id */
    private String deviceIxd;

    /** IMP裝置ID (IMP配發UUID，APP重裝會更新.) */
    private String impDeviceIxd;

    /** 原始IMP裝置ID (※重裝APP仍為同裝置鍵值) */
    private String originalDeviceIxd;

    /** 裝置名稱, 手機名稱/手機識別(使用者可自行修改) */
    private String deviceName;

    /** 製造商, Motorola/Samsung/Apple.. */
    private String brand;

    /** 裝置Model, eg: iPhone12,1 */
    private String model;

    /** 裝置平台 memo: android或ios, PC版值類似"Windows NT 6.1; Win64; x64" */
    private String platform;

    /** 裝置平台版本: eg: 14.7.1 */
    private String platformVersion;

    /** 應用程式版本 */
    private String appVersion;

    /** 登入頁timeout後重新產生儲存在web session的 channel2AppE2eeKxy 所需的 Seed */
    private String channel2AppE2eeKxySeed;

    /** 避免前端重複請求的識別 (交易重覆檢核用Token) */
    private String submitToken;

    /** 來源系統代號 */
    private String clientIxd;

    /** Client端發送請求時的時間戳記 */
    private Date clientTime;

    /** 當下網路型態. */
    private String networkType;

    /** 前端是否已經提醒過倒數計時(Y/N) */
    private String countdownRemind;

    public ChannelRqMeta() {
        super();
    }

    /**
     * @return {@link #deviceIxd}
     */
    public String getDeviceIxd() {
        return deviceIxd;
    }

    /**
     * @param deviceIxd
     *            {@link #deviceIxd}
     */
    public void setDeviceIxd(String deviceIxd) {
        this.deviceIxd = deviceIxd;
    }

    /**
     * @return {@link #impDeviceIxd}
     */
    public String getImpDeviceIxd() {
        return impDeviceIxd;
    }

    /**
     * @param impDeviceIxd
     *            {@link #impDeviceIxd}
     */
    public void setImpDeviceIxd(String impDeviceIxd) {
        this.impDeviceIxd = impDeviceIxd;
    }

    /**
     * @return {@link #originalDeviceIxd}
     */
    public String getOriginalDeviceIxd() {
        return originalDeviceIxd;
    }

    /**
     * @param originalDeviceIxd
     *            {@link #originalDeviceIxd}
     */
    public void setOriginalDeviceIxd(String originalDeviceIxd) {
        this.originalDeviceIxd = originalDeviceIxd;
    }

    /**
     * @return {@link #deviceName}
     */
    public String getDeviceName() {
        return deviceName;
    }

    /**
     * @param deviceName
     *            {@link #deviceName}
     */
    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    /**
     * @return {@link #brand}
     */
    public String getBrand() {
        return brand;
    }

    /**
     * @param brand
     *            {@link #brand}
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * @return {@link #model}
     */
    public String getModel() {
        return model;
    }

    /**
     * @param model
     *            {@link #model}
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * @return {@link #platform}
     */
    public String getPlatform() {
        return platform;
    }

    /**
     * @param platform
     *            {@link #platform}
     */
    public void setPlatform(String platform) {
        this.platform = platform;
    }

    /**
     * @return {@link #platformVersion}
     */
    public String getPlatformVersion() {
        return platformVersion;
    }

    /**
     * @param platformVersion
     *            {@link #platformVersion}
     */
    public void setPlatformVersion(String platformVersion) {
        this.platformVersion = platformVersion;
    }

    /**
     * @return {@link #appVersion}
     */
    public String getAppVersion() {
        return appVersion;
    }

    /**
     * @param appVersion
     *            {@link #appVersion}
     */
    public void setAppVersion(String appVersion) {
        this.appVersion = appVersion;
    }

    /**
     * @return {@link #channel2AppE2eeKxySeed}
     */
    public String getChannel2AppE2eeKxySeed() {
        return channel2AppE2eeKxySeed;
    }

    /**
     * @param channel2AppE2eeKxySeed
     *            {@link #channel2AppE2eeKxySeed}
     */
    public void setChannel2AppE2eeKxySeed(String channel2AppE2eeKxySeed) {
        this.channel2AppE2eeKxySeed = channel2AppE2eeKxySeed;
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
     * @return {@link #clientIxd}
     */
    public String getClientIxd() {
        return clientIxd;
    }

    /**
     * @param clientIxd
     *            {@link #clientIxd}
     */
    public void setClientIxd(String clientIxd) {
        this.clientIxd = clientIxd;
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
     * @return {@link #networkType}
     */
    public String getNetworkType() {
        return networkType;
    }

    /**
     * @param networkType
     *            {@link #networkType}
     */
    public void setNetworkType(String networkType) {
        this.networkType = networkType;
    }

    /**
     * @return {@link #countdownRemind}
     */
    public String getCountdownRemind() {
        return countdownRemind;
    }

    /**
     * @param countdownRemind
     *            {@link #countdownRemind}
     */
    public void setCountdownRemind(String countdownRemind) {
        this.countdownRemind = countdownRemind;
    }

}
