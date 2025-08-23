/*
 * ===========================================================================
 * IBM Confidential
 * AIS Source Materials
 * (C) Copyright IBM Corp. 2025.
 * ===========================================================================
 */
package com.feib.demo.controller.rq;

import com.feib.demo.common.rq.ChannelRqBody;

/**
 * <p>
 * 登入請求
 * </p>
 * @author Eric Wei
 * @version 1.0, 2025年3月7日
 * @see
 * @since
 */
public class LoginRq extends ChannelRqBody {

    private String account;

    private String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }
}
