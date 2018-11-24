package com.ssm.sdk.common.util;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.*;

public class SignUtil {

    /**
     * 将参数按顺序排列并拼接
     * @return 字符串，可用于计算签名
     */
    public static String getSignStr(Map<String, String[]> params) {
        if (params == null || params.isEmpty()) {
            return "";
        }
        List<String> keys = new ArrayList<>(params.keySet());
        Collections.sort(keys);
        StringBuilder builder = new StringBuilder();
        try {
            for (String paramName : keys) {
                if ("sign".equals(paramName)) {
                    continue;
                }
                String[] value = params.get(paramName);
                if (value != null && value.length > 0) {
                    for (String s : value) {
                        builder.append("&");
                        builder.append(paramName).append("=");
                        builder.append(URLEncoder.encode(s,"utf-8"));
                    }
                } else {
                    builder.append("&");
                    builder.append(paramName).append("=");
                }
            }
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return builder.substring(1).toString();
    }

    /**
     * 通过字符串计算签名
     * @return 签名
     */
    public static String getSign(String str, String secret) {
        return DigestUtils.getMD5(str + secret);
    }
}
