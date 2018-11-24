package com.ssm.sdk.common.pojo;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class UserDynamicTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer userId;
    private Date lastLoginDate;
    private Integer loginCnt;
    private String lastIp;
    private String lastUa;
    private Integer lastGameServerId;
    private Integer amount;
    private Integer balance;
    private Integer rankId;
    private Integer totalIntegral;
    private Integer integal;
    private Integer updateCnt;
}
