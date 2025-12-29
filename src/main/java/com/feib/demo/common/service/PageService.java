/*
 * ===========================================================================
 * IBM Confidential
 * AIS Source Materials
 * (C) Copyright IBM Corp. 2025.
 * ===========================================================================
 */
package com.feib.demo.common.service;

import com.feib.demo.model.DataGridRow;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * 分頁服務
 * </p>
 * @author Eric Wei
 * @version 1.0, 2025年3月10日
 * @see
 * @since
 */
public class PageService {

    /**
     * 取得分頁所需的資料.
     * @param page
     *            the page
     * @param pageSize
     *            the pageSize
     * @param allRows
     *            the all rows
     * @return the rows
     */
    protected List<DataGridRow> getPageRowList(int page, int pageSize, List<DataGridRow> allRows) {

        int startIndex = pageSize * (page - 1);
        int endIndex = pageSize * page;

        if (CollectionUtils.isEmpty(allRows)) {
            return new ArrayList<>(0);
        }

        if (endIndex > allRows.size()) {
            endIndex = allRows.size();
        }

        List<DataGridRow> rows = new ArrayList<>();

        for (int i = startIndex; i < endIndex; i++) {
            rows.add(allRows.get(i));
        }

        return rows;

    }

}
