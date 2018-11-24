package com.ssm.sdk.common.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

@Data
public class GameTO {
    private Integer id;
    private Integer cpId;
    private Integer seqNum;

    private String name;
    private Integer game_category_id;
    private Integer game_state;
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date update_date;
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date created_date;
    private String download_url;
    private String description;

    private Integer status;
    private Integer repairStatus;
    private String repairContent;
    private String version;


}
