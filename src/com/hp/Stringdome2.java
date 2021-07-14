package com.hp;

public class Stringdome2 {

    //总结：频繁修改字符串，会造成性能损失，需要StringBuffer/Build
    //java.lang.OutOfMemoryError 频繁修改字符串 ，会造成内存溢出的异常
    public static void main(String[] args) {
        String str = "a";
        System.out.println(System.currentTimeMillis());//当前日期 long值
        long l = System.currentTimeMillis();
        for (int i = 0; i<30 ; i++) {
            str+=str;//测试频繁修改字符串
        }
        System.out.println(System.currentTimeMillis()-l);//当前日期的long值
    }
}
