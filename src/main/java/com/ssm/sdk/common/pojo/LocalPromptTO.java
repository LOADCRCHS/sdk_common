package com.ssm.sdk.common.pojo;

import lombok.Data;

@Data
public class LocalPromptTO {
    private Integer id;
    private String name;
    private String value;
    private Integer languageType;
    private String code;

}
