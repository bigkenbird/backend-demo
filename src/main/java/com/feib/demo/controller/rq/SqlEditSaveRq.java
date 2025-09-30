package com.feib.demo.controller.rq;

import com.feib.demo.common.rq.ChannelRqBody;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class SqlEditSaveRq extends ChannelRqBody {
    private String tableName;

}
