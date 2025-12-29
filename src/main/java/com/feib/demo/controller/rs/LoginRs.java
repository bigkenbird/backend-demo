/*
 * ===========================================================================
 * IBM Confidential
 * AIS Source Materials
 * (C) Copyright IBM Corp. 2025.
 * ===========================================================================
 */
package com.feib.demo.controller.rs;

import com.feib.demo.common.rs.ChannelRsBody;
import com.feib.demo.model.Menu;

import java.util.List;

/**
 * <p>
 * 登入回覆
 * </p>
 * @author Eric Wei
 * @version 1.0, 2025年3月7日
 * @see
 * @since
 */
public class LoginRs extends ChannelRsBody {

    /** 是否登入 */
    private boolean isLogin;

    /** 功能清單 */
    private List<Menu> menuList;

    /**
     * Gets the isLogin.
     * @return {@link #isLogin}
     */
    public boolean getIsLogin() {
        return isLogin;
    }

    /**
     * Sets the isLogin.
     * @param isLogin
     *            {@link #isLogin}
     */
    public void setIsLogin(boolean isLogin) {
        this.isLogin = isLogin;
    }

    /**
     * Gets the menuList.
     * @return {@link #menuList}
     */
    public List<Menu> getMenuList() {
        return menuList;
    }

    /**
     * Sets the menuList.
     * @param menuList
     *            {@link #menuList}
     */
    public void setMenuList(List<Menu> menuList) {
        this.menuList = menuList;
    }

}
