/*
 * ===========================================================================
 * IBM Confidential
 * AIS Source Materials
 * (C) Copyright IBM Corp. 2021.
 * ===========================================================================
 */
package com.feib.demo.common.rs;

/**
 * <p>
 * 回傳前端的下行資料.
 * </p>
 * @author jeff
 * @version 1.0, 2021年10月20日
 * @see
 * @since
 */
public class ChannelRs<T extends ChannelRsBody> {

    /** response meta data. */
    private ChannelRsMeta meta = new ChannelRsMeta();

    /** 交易特定的回傳資料 . */
    private T body;

    public ChannelRs() {
        super();
    }

    /**
     * @return {@link #meta}
     */
    public ChannelRsMeta getMeta() {
        return meta;
    }

    /**
     * @param meta
     *            {@link #meta}
     */
    public void setMeta(ChannelRsMeta meta) {
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
