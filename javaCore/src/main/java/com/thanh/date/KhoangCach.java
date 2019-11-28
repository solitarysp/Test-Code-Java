package com.thanh.date;

import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * author lethanh9398 <p>
 * create Date 10-09-2019 16:09  <p>
 * document : <p>
 * <p>- vi :
 * <p>- en :
 */
public class KhoangCach {
    public static void main(String[] args) {
        KhoangCach khoangCach=new KhoangCach();
        Date date1 = new Date();
        Date date2 = new Date();
        date2.setHours(date2.getHours() +12);
        System.out.println(khoangCach.getBetweenTwoDate(date1,date2,TimeUnit.SECONDS));
        System.out.println(37000f / 100000f);
    }

    long getBetweenTwoDate(Date start, Date end, TimeUnit timeUnit) {
        long diff = end.getTime() - start.getTime();//as given
        long time = 0;
        switch (timeUnit) {
            case DAYS: {
                time = TimeUnit.MILLISECONDS.toDays(diff);
                break;

            }
            case HOURS: {
                time = TimeUnit.MILLISECONDS.toHours(diff);
                break;
            }
            case MINUTES: {
                time = TimeUnit.MILLISECONDS.toMinutes(diff);
                break;

            }
            case SECONDS: {
                time = TimeUnit.MILLISECONDS.toSeconds(diff);
                break;

            }
            case NANOSECONDS: {
                time = TimeUnit.MILLISECONDS.toNanos(diff);
                break;

            }
            case MICROSECONDS: {
                time = TimeUnit.MILLISECONDS.toMicros(diff);
                break;

            }
            case MILLISECONDS: {
                time = TimeUnit.MILLISECONDS.toMillis(diff);
                break;
            }

        }
        return time;
    }
}
