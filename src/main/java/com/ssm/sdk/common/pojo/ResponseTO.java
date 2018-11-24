package com.ssm.sdk.common.pojo;

import lombok.Data;

@Data
public class ResponseTO {
    private boolean success = false;
    private Object result;
    private String ticket;

}
