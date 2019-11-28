package com.thanh.StringBuffer;

public class Main {
    public static void main(String[] args) {
        // tạo StringBuffer
        StringBuffer stringBuffer = new StringBuffer();
        // thêm Thành vào, sẽ chuyển thành 1 mảng char ở core
        stringBuffer.append("Thành");
        // thêm nam12121222222222222222222222222222222222222222
        stringBuffer.insert(2, "nam12121222222222222222222222222222222222222222");
        // nối mảng lại và trả về 1 string
        System.out.println(stringBuffer.toString());
        System.out.println(stringBuffer.capacity());
    }
}
