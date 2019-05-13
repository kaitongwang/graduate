package com.lzjd.mis.graduate.api.util;

/**
 * Created by ToBeing
 */
 
public class StringUtil {
    /**
     * 判断字符串是否为空
     * @param content
     * @return
     */
    public static boolean isNull(String content){
        if(content == null || content.length() <= 0){
            return true;
        }else {
            return false;
        }
    }
 
    /**
     * 比较两个字符串是否相等
     * @param str1
     * @param str2
     * @return
     */
    public static boolean equal(String str1, String str2){
        if(str1 == str2){
            //str1和str2指向同一地址
            return true;
        }else if(str1 == null || str2 == null){
            return false;
        }else {
            //str1和str2的值是否相等
            return str1.equals(str2);
        }
    }
 
    /**
     * 获取字符串的长度
     * @param str
     * @return
     */
    public static int length(String str){
        if(str == null){
            return 0;
        }else {
            return str.length();
        }
    }
}