package com.thanh.date;

import java.util.Date;

/**
 * author lethanh9398 <p>
 * create Date 13-09-2019 13:39  <p>
 * document : <p>
 * <p>- vi :
 * <p>- en :
 */
public class VuotQua1Nua {
    public static void main(String[] args) {
        Date start = new Date();
        start.setHours(start.getHours() -1);

        Date enddate = new Date();
        enddate.setHours(enddate.getHours() + 3);

        Date cudate = new Date();
        long khoangCachGiuaEndVaHienTai = enddate.getTime() - cudate.getTime();
        long khoangCachGiuaStartAndEnd = enddate.getTime() - start.getTime();

        System.out.println(khoangCachGiuaEndVaHienTai);
        float phantram = (float) khoangCachGiuaEndVaHienTai / khoangCachGiuaStartAndEnd;
        System.out.println(phantram);
        System.out.println(10*phantram);
    }
}
