package com.ssm.sdk.common.pojo;

import lombok.Data;

import java.util.Date;

@Data
public class UserRoleTO {
    private Integer id;
    private Integer userId;
    private String roleId;
    private Integer gameId;
    private Integer serverId;
    private String roleName;
    private Integer roleLevel;
    private Date loginServerTime;
    private Integer currentStatus;
    private Date createdDate;
}
