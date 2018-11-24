package com.ssm.sdk.common.pojo;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class OnlineUserTO implements Serializable {
    private static final Long serialVersionUID = 1L;

    private String ticket;
    private Integer userId;
    private String loginAccount;
    private Integer gameId;
    private Integer gameServerId;
    private String ip;
    private String ua;
    private Date loginDate;
    private Date lastAct;

}
