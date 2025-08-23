/*
 * ===========================================================================
 * IBM Confidential
 * AIS Source Materials
 * (C) Copyright IBM Corp. 2025.
 * ===========================================================================
 */
package com.feib.demo.controller.rs;

import com.feib.demo.common.rs.ChannelRsBody;
import com.feib.demo.model.DataGridValue;

/**
 * <p>
 * 查詢員工資料回覆
 * </p>
 * @author Eric Wei
 * @version 1.0, 2025年3月7日
 * @see
 * @since
 */
public class QueryEmployeeRs extends ChannelRsBody {

    /** 員工資料 DataGrid */
    private DataGridValue dataGridValue;

    /**
     * @return {@link #dataGridValue}
     */
    public DataGridValue getDataGridValue() {
        return dataGridValue;
    }

    /**
     * @param dataGridValue
     *            {@link #dataGridValue}
     */
    public void setDataGridValue(DataGridValue dataGridValue) {
        this.dataGridValue = dataGridValue;
    }

}
