package com.thanh.continueAndBreakInFor;

/**
 * @author LeThanh9398
 * @create Date 13:33 13-08-2019
 * @doctument :
 * vi :
 * -
 * en :
 * -
 */
public class Break {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                System.out.println("i == 5");
              // khi dùng bread ở for, tất cả đoạn code dưới break sẽ không được chạy nữa, và các for tiếp theo cũng sẽ không được chạy, vòng for sẽ chấp dứt luôn
                break;
            }
            System.out.println(i);
        }
    }
}
