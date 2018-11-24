package com.ssm.sdk.common.pojo;

import lombok.Data;

@Data
public class LoginServerLogTO {
    private Integer userId;
    private Integer channelId;
    private Integer gameId;
    private Integer serverId;
    private String ip;
    private String ua;
    private String roleId;
    private String imei;
    private String mac;
}
