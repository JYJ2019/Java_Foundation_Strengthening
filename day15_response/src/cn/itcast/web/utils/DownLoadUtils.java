package cn.itcast.web.utils;


import sun.misc.BASE64Encoder;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

/**
 * @Description：TODO
 * @Author 金宇佳
 * @Date 2021/1/11 17:02
 * @Version 1.0
 */
public class DownLoadUtils {
    public static String getFileName(String agent, String filename) throws UnsupportedEncodingException {
        if (agent.contains("MSIE")) {
            // IE浏览器
            filename = URLEncoder.encode(filename, "utf-8");
            filename = filename.replace("+", "");
        } else if (agent.contains("Firefox")) {
            //火狐浏览器
            BASE64Encoder base64Encoder = new BASE64Encoder();
            filename = "=?utf-8?B?" + base64Encoder.encode(filename.getBytes("utf-8")) + "?=";
        } else {
            //其他浏览器
            filename = URLEncoder.encode(filename, "utf-8");
        }
        return filename;
    }
}
