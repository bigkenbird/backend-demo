package com.feib.demo.controller.rs;

import com.feib.demo.common.rs.ChannelRsBody;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;
import java.util.Map;
import java.util.Set;

@EqualsAndHashCode(callSuper = true)
@Data
public class TableExecuteRs extends ChannelRsBody {
    private String error;
    private Set<String> columns;
    private List<Map<String,Object>> values;
}
