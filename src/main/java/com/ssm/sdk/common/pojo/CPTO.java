package com.ssm.sdk.common.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

@Data
public class CPTO {
    private Integer id;
    private String secretKey;
    private String noticeKey;
    private String password;
    private String name;
    private Integer status;
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date createdDate;

}
