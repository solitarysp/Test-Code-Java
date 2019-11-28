package com.thanh.date;

import java.util.Date;

/**
 * author lethanh9398 <p>
 * create Date 04-09-2019 11:04  <p>
 * document : <p>
 * <p>- vi :
 * <p>- en :
 */
public class Comp {
    public static void main(String[] args) {
        Date date1 = new Date();
        Date date2 = new Date();
        date2.setHours(date2.getHours() - 1);
        System.out.println(date1.after(date2));
    }
}
