package com.example.demo;

import java.io.UnsupportedEncodingException;
import java.security.*;

public class MaskAPI {



    public static String md5Mask(String info) {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] array = md.digest(info.getBytes());
            StringBuffer sb = new StringBuffer();
            for (int i = 0; i < array.length; ++i) {
                sb.append(Integer.toHexString((array[i] & 0xFF) | 0x100).substring(1,3));
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException e) {
        }
        return null;
    }


    public static String starifyMask(String info){
        int length = info.length();
        StringBuffer sb = new StringBuffer();
        for(int i = 0; i < length; i++){
            sb.append("*");
        }

        return sb.toString();
    }



    public static void main(String[] args){
        // test
        System.out.println(md5Mask("abc123@gmail.com"));
        System.out.println(starifyMask("12345678"));
    }

}