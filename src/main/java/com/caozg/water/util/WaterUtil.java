package com.caozg.water.util;

import com.alibaba.fastjson.JSONObject;
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.io.IOException;

/**
 * @ClassName WaterUtil
 * @Description TODO
 * @Author caozg
 * @Date 2019/7/10 15:55
 * @Version 1.0
 */
public class WaterUtil {
    //?date=2019-07-10+08%3A00
    public static Document httpGet(String url,String param) throws IOException {
        //获取请求连接
        Connection conn = Jsoup.connect(url).ignoreContentType(true);
        //请求头设置，特别是cookie设置
        conn.header("Accept", "application/json, text/javascript, */*; q=0.01");
        conn.header("Content-Type", "application/json");
        conn.header("User-Agent", "Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/74.0.3729.169 Safari/537.36");
        //请求参数设置
        conn.data("date",param);
        //获取请求结果
        Document doc = conn.get();
        return doc;
    }

    public static void main(String[] args) {
        try {
            Document document = httpGet("http://113.57.190.228:8001/Web/Report/GetRiverData", "2019-07-10 08:00");
            JSONObject obj = (JSONObject)JSONObject.parse(document.body().text());

            System.out.println(obj);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
