package com.ssm.sdk.common.pojo;

import lombok.Data;

/**
 * 错误代码
 */
@Data
public class ErrorCodeTO {

    /**
     * 错误码
     */
    private String code;

    /**
     * 错误说明
     */
    private String msg;

    public ErrorCodeTO() {
    }

    public ErrorCodeTO(String code, String msg) {
        this.code=code;
        this.msg=msg;
    }


}
