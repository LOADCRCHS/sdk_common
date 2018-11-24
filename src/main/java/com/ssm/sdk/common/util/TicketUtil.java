package com.ssm.sdk.common.util;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class TicketUtil {
    private static SimpleDateFormat format = new SimpleDateFormat("yyyy-MMdd-HHmm");
    private static SimpleDateFormat TIME_FORMAT = new SimpleDateFormat("yyyyMMddHHmm");
    //todo
    public static String getEncodeTicket(String ticket) {
        String[] times = format.format(new Date()).split("-");
        Random random = new Random();
        int rand = random.nextInt(9) + 1;
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 3; i++) {
            builder.append(ticket.substring(i * 4, i * 4 + 4));
            char[] chars = times[i].toCharArray();
            for (char c : chars) {
                builder.append(Integer.toHexString((c - '0') ^ rand));
            }
        }
        builder.append(ticket.substring(12)).append(rand);
        return builder.toString();
    }

    public static String getDecodeTicket(String ticket) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 4; i++) {
            builder.append(ticket.substring(i * 8, i * 8 + 4));
        }
        builder.append(ticket.substring(28));
        return builder.substring(0, builder.length() - 1);
    }

    public static Date getTicketDate(String ticket) throws Exception {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 3; i++) {
            int start = (2 * i + 1) * 4;
            builder.append(ticket.substring(start, start + 4));
        }
        String time = builder.toString();
        int num = ticket.charAt(ticket.length() - 1) - '0';
        char[] chars = time.toCharArray();
        builder = new StringBuilder();
        for (char c : chars) {
            builder.append(Integer.parseInt(c + "", 16) ^ num);
        }
        return TIME_FORMAT.parse(builder.toString());
    }

}
