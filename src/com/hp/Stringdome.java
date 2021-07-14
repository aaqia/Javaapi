package com.hp;

public class Stringdome {
    public static void main(String[] args) {
        //针对面试
        //==  比较的是否为一个对象
        String s1 = "abc";
        String s2 = "abc";
        System.out.println(s1==s2);//true
        //原因:以上为什么是TRUE 因为s2重用了s1的对象
        s1 = s1+"!";
        System.out.println(s1==s2);//false
        //以上为什么是false  因为s1 根本不相等 s2 深层的原因，是对象被修改了

        String s3 = "a"+"bc";
        System.out.println(s2==s3);//true
        //字符串的链接 就等于没连接

        String s4 = new String("abc");
        String s5 = new String("abc");
        System.out.println(s4==s2);//false
        //s2是常量中的字符串  而 new String 是类   类中有自己的地址
        System.out.println(s4);
        System.out.println(s4==s5);//false
        //s4和s5是不同的对象

        System.out.println(s4.equals(s5));//true
        System.out.println(s4.equals(s2));//true
        //==  比较的是内存地址  equals比较的是2者是否相同
        //例子: 优良对长得一模一样的双胞胎  ==比较的是DNA
    }
}
