package com.feib.demo.controller.rs;

import com.feib.demo.common.rs.ChannelRsBody;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class SQLExecuteRs extends ChannelRsBody {
    private String result;
}
