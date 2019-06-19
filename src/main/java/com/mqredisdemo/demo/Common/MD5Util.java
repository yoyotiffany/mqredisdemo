package com.mqredisdemo.demo.Common;

import org.apache.commons.codec.digest.DigestUtils;

/**
 * author：yq
 * date: 2019/6/18
 */
public class MD5Util {

    private static String staticSalt="mqredisdemo";
/**
 * 加密
 */
public static String encodePwd(String userPwd) {
    return DigestUtils.md5Hex(userPwd + staticSalt);
}


/**
 * 解密
 */

public static Boolean isRightPwd(String pwd,String dbpwd){
    Boolean result=false;
  String newpwd=  encodePwd(pwd);
    if (newpwd.equals(dbpwd)){
        result=true;
        return result;
    }
    return result;
}
}
