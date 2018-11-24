package com.ssm.sdk.common.pojo;

import lombok.Data;

import java.util.Date;

@Data
public class VerCodeTO {
    private Integer id;
    private Integer userId;
    private String mobile;
    private String code;
    private Date createdDate;
}
