package com.ssm.sdk.common.pojo;

import lombok.Data;

import java.io.Serializable;

@Data
public class UserTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer id;
    private String name;// 用户名
    private String email;// 邮箱
    private String num;// 手机号
    private String password;// 密码
    private Integer channelId;// 推广渠道
    private Integer gameId;// 注册游戏
    private String nickname;// 昵称
    private Integer userType = 1;// 用户类型0游客，1绑定
    private Integer status;// 状态，0无效，1有效
}
