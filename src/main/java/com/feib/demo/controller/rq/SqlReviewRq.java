package com.feib.demo.controller.rq;

import com.feib.demo.common.rq.ChannelRqBody;
import com.feib.demo.persistence.entity.ReviewEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Objects;

@EqualsAndHashCode(callSuper = true)
@Data
public class SqlReviewRq extends ChannelRqBody {

    private String table;

    private String code;

    private String modifiedData;

    private String reviewer;

    private String submitter;

    private Integer reviewStatus;

    public ReviewEntity toReviewCell() {
        ReviewEntity reviewCell = new ReviewEntity();
        reviewCell.setTableName(table);
        reviewCell.setCode(code);
        reviewCell.setModifiedData(modifiedData);
        reviewCell.setReviewer(reviewer);
        reviewCell.setSubmitter(submitter);
        reviewCell.setStatus(Objects.requireNonNullElse(reviewStatus, 0));
        return reviewCell;
    }


}
