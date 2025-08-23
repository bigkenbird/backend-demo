/*
 * ===========================================================================
 * IBM Confidential
 * AIS Source Materials
 * (C) Copyright IBM Corp. 2005.
 * ===========================================================================
 */
package com.feib.demo.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * 一列的資料(row)
 * @author Jeff
 * @version 1.0, 2005/2/15
 * @param <T>
 *            the generic type
 * @see
 * @since
 */
public class DataGridRow implements Serializable {

    private static final long serialVersionUID = -7321819270751627874L;

    /** List of Cell . */
    private List<DataGridCell> cellList = new ArrayList<>();

    /**
     * Constructor.
     */
    public DataGridRow() {
        super();
    }

    /**
     * add cell.
     * @param cell
     */
    public void addCell(DataGridCell cell) {
        if (null == cell) {
            return;
        }

        cellList.add(cell);
    }

    /**
     * @return {@link #cellList}
     */
    public List<DataGridCell> getCellList() {
        return cellList;
    }

    /**
     * @param cellList
     *            {@link #cellList}
     */
    public void setCellList(List<DataGridCell> cellList) {
        this.cellList = cellList;
    }

}
