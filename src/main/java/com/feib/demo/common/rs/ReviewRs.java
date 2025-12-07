package com.feib.demo.common.rs;

import com.feib.demo.persistence.entity.ReviewEntity;
import lombok.Data;
import java.util.Map;

@Data
public class ReviewRs {

    private ReviewEntity reviewEntity;

    private Map<String,Object> originEntity;
}
