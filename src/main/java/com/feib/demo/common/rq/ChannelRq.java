/*
 * ===========================================================================
 * IBM Confidential
 * iX Source Materials
 * (C) Copyright IBM Corp. 2023.
 * ===========================================================================
 */
package com.feib.demo.common.rq;

import java.util.Date;

/**
 * <p>
 * 上送的Request
 * </p>
 * @author Alex LS Chen
 * @version 1.0, 2016/04/25
 * @see
 * @since
 */
public class ChannelRq<T extends ChannelRqBody> {

    /** request meta data. */
    private ChannelRqMeta meta = null;

    /** 各交易特定的參數 . */
    private T body;

    /**
     * @return
     * @see deviceIxd
     */
    public String getDeviceIxd() {

        if (null == meta) {
            return "";
        }

        return meta.getDeviceIxd();
    }

    /**
     * @return
     * @see impDeviceIxd
     */
    public String getImpDeviceIxd() {

        if (null == meta) {
            return "";
        }

        return meta.getImpDeviceIxd();
    }

    /**
     * @return
     * @see originalDeviceIxd
     */
    public String getOriginalDeviceIxd() {

        if (null == meta) {
            return "";
        }

        return meta.getOriginalDeviceIxd();
    }

    /**
     * @return
     * @see deviceName
     */
    public String getDeviceName() {

        if (null == meta) {
            return "";
        }

        return meta.getDeviceName();
    }

    /**
     * @return
     * @see brand
     */
    public String getBrand() {

        if (null == meta) {
            return "";
        }

        return meta.getBrand();
    }

    /**
     * @return
     * @see model
     */
    public String getModel() {
        return meta.getModel();
    }

    /**
     * @return
     * @see platform
     */
    public String getPlatform() {

        if (null == meta) {
            return "";
        }

        return meta.getPlatform();
    }

    /**
     * @return
     * @see platformVersion
     */
    public String getPlatformVersion() {

        if (null == meta) {
            return "";
        }

        return meta.getPlatformVersion();
    }

    /**
     * @return
     * @see appVersion
     */
    public String getAppVersion() {

        if (null == meta) {
            return "";
        }

        return meta.getAppVersion();
    }

    /**
     * @return
     * @see channel2AppE2eeKxySeed
     */
    public String getChannel2AppE2eeKxySeed() {

        if (null == meta) {
            return "";
        }

        return meta.getChannel2AppE2eeKxySeed();
    }

    /**
     * @return
     * @see submitToken
     */
    public String getSubmitToken() {

        if (null == meta) {
            return "";
        }

        return meta.getSubmitToken();
    }

    /**
     * @return
     * @see clientIxd
     */
    public String getClientIxd() {

        if (null == meta) {
            return "";
        }

        return meta.getClientIxd();
    }

    /**
     * @return
     * @see clientTime
     */
    public Date getClientTime() {

        if (null == meta) {
            return null;
        }

        return meta.getClientTime();
    }

    /**
     * @return {@link #meta}
     */
    public ChannelRqMeta getMeta() {
        return meta;
    }

    /**
     * @param meta
     *            {@link #meta}
     */
    public void setMeta(ChannelRqMeta meta) {
        this.meta = meta;
    }

    /**
     * @return {@link #body}
     */
    public T getBody() {
        return body;
    }

    /**
     * @param body
     *            {@link #body}
     */
    public void setBody(T body) {
        this.body = body;
    }

}
