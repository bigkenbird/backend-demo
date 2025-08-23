/*
 * ===========================================================================
 * IBM Confidential
 * AIS Source Materials
 * (C) Copyright IBM Corp. 2024.
 * ===========================================================================
 */
package com.feib.demo.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * 功能清單
 * </p>
 * @author Eric Wei
 * @version 1.0, 2024年7月4日
 * @see
 * @since
 */
public class Menu implements Serializable, Comparable<Menu> {

    /**
     * <code>serialVersionUID</code> 的註解
     */
    private static final long serialVersionUID = 1L;

    /** 功能名稱 */
    private String label;

    /** 功能代碼 */
    private String menuIxd;

    /** 功能連結 */
    private String url;

    /** 順序 */
    private int order;

    /** 子功能清單 */
    private List<Menu> sub = new ArrayList<Menu>();

    /** 功能關閉 */
    private boolean disabled;

    /**
     * @return {@link #label}
     */
    public String getLabel() {
        return label;
    }

    /**
     * @param label
     *            {@link #label}
     */
    public void setLabel(String label) {
        this.label = label;
    }

    /**
     * @return {@link #url}
     */
    public String getUrl() {
        return url;
    }

    /**
     * @param url
     *            {@link #url}
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * @return {@link #order}
     */
    public int getOrder() {
        return order;
    }

    /**
     * @param order
     *            {@link #order}
     */
    public void setOrder(int order) {
        this.order = order;
    }

    /**
     * @return {@link #menuIxd}
     */
    public String getMenuIxd() {
        return menuIxd;
    }

    /**
     * @param menuIxd
     *            {@link #menuIxd}
     */
    public void setMenuIxd(String menuIxd) {
        this.menuIxd = menuIxd;
    }

    /**
     * @return {@link #sub}
     */
    public List<Menu> getSub() {
        return sub;
    }

    /**
     * @param sub
     *            {@link #sub}
     */
    public void setSub(List<Menu> sub) {
        this.sub = sub;
    }

    /**
     * @return {@link #disabled}
     */
    public boolean getDisabled() {
        return disabled;
    }

    /**
     * @param disabled
     *            {@link #disabled}
     */
    public void setDisabled(boolean disabled) {
        this.disabled = disabled;
    }

    @Override
    public int compareTo(Menu other) {
        if (this.order > other.order) {
            return 1;
        }
        else if (this.order < other.order) {
            return -1;
        }
        else {
            return 0;
        }
    }

}
