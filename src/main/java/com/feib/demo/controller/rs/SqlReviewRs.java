package com.feib.demo.controller.rs;

import com.feib.demo.common.rs.ChannelRsBody;
import com.feib.demo.common.rs.ReviewRs;
import com.feib.demo.persistence.entity.ReviewEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;
import java.util.Map;

@EqualsAndHashCode(callSuper = true)
@Data
public class SqlReviewRs extends ChannelRsBody {

    private String result;

    private List<ReviewRs> reviewRsList;

}
