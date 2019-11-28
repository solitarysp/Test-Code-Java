package com.thanh;

import java.util.Date;

/**
 * author lethanh9398 <p>
 * email lethanh9398@gmail.com <p>
 * create Date 29-10-2019 09:29  <p>
 * document : <p>
 * <p>- vi :
 * <p>- en :
 */
public class ConvertAnDecodeDateWith4byte {
    public static void main(String[] args) {
        Date date = new Date();
        String objId = convertDateTo4bit(date);
        System.out.println(objId);
        System.out.println(convertDateTo4bit(decoDateFrom4bit(objId)));
    }

    public static String convertDateTo4bit(Date date) {
        long timeS = date.getTime() / 1000;
        return Integer.toString((int) timeS, 16) + "0000000000000000";
    }

    public static Date decoDateFrom4bit(String s) {
       return new Date(Long.valueOf(s.substring(0, 8), 16) * 1000);
    }


}
