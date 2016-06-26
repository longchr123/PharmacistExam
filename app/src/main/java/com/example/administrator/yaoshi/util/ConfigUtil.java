package com.example.administrator.yaoshi.util;

/**
 * Created by Administrator on 2016/4/27.
 */
public class ConfigUtil {
    public static String path = "/data/data/com.zhongyuedu.yaoshi/files/";
    //密码
    public static String mi_ma = "WCXLYHGYQLWWYLSWP2016";
    //sp保存
    public static String spSave = "com.zyedu.yaoshi";
    //收藏数据库
    public static String saveFilename = "/data/data/com.zhongyuedu.yaoshi/files" + "/save.db";//收藏数据库文件
    //保存考试类型
    public static String examTypeFileName = "/data/data/com.zhongyuedu.yaoshi/files" + "/examType.db";

    public static String getNormalSqLite(int position) {
        return position+"yaoShiNormal.db";
    }

    public static String getCuoSqLite(int position) {
        return position+"yaoShiCuo.db";
    }
}
