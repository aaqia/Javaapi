package com.hp;

public class Text {
    public static void main(String[] args) {
        String str = "HelloWorld";
        index(str);
    }

    private static void index(String str) {
        //1:输出字符串"HelloWorld"的字符串长度

        int length = str.length();
        System.out.println("HelloWorld的长度= " + length);
        //输出"HelloWorld"中"o"的位置
        int i = str.indexOf("o");
        System.out.println("o的位置=" + i);
        //3:输出"HelloWorld"中从下标5出开始第一次出现"o"的位置
        int o = str.indexOf("o", 5);
        System.out.println("从下标5出开始第一次出现o的位置=" + o);
        //4:截取"HelloWorld"中的"Hello"并输出
        String substring = str.substring(0, 5);
        System.out.println("截取HelloWorld中的Hello= " + substring);
        //5:截取"HelloWorld"中的"Hello"并输出
        String substring1 = str.substring(5, 10);
        System.out.println("截取HelloWorld中的World= " + substring1);
        //6:将字符串"  Hello   "中两边的空白去除后输出
        String str2 = "   Hello   ";
        String trim = str2.trim();
        System.out.println("去除空格 = " + trim);
        //7:输出"HelloWorld"中第6个字符"W"
        char i1 = (char) str.charAt(5);
        System.out.println("输出HelloWorld中第6个字符 = " + i1);
        //8:输出"HelloWorld"是否是以"h"开头和"ld"结尾的
        boolean h = str.startsWith("h");
        System.out.println("是否是以h开头" + h);
        boolean ld = str.endsWith("ld");
        System.out.println("是否是以ld结尾的 = " + ld);
        //9:将"HelloWorld"分别转换为全大写和全小写并输出
        String helloWorld = str.toUpperCase();
        System.out.println("转换成大写= " + helloWorld);
        String helloWorld1 = str.toLowerCase();
        System.out.println("转换成小写=" + helloWorld1);
    }
}
