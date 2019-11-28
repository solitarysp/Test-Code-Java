package com.thanh.continueAndBreakInFor;

/**
 * @author LeThanh9398
 * @create Date 13:31 13-08-2019
 * @doctument :
 * vi :
 * -
 * en :
 * -
 */
public class Continue {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                System.out.println("i == 5");
                // lênh này sẽ pass qua vòng for lần này, các code dưới sẽ không chạy nữa mà sẽ bắt đầu vòng for tiếp theo luôn
                continue;
            }
            System.out.println(i);
        }
    }
}
