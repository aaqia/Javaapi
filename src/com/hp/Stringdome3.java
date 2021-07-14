package com.hp;

public class Stringdome3 {
    public static void main(String[] args) {
        String str = "this is java";  //java编程思想
        //查询10的字符是什么
        char a = str.charAt(7);
        System.out.println("a = " + a);//数组的长度是属性

        int length = str.length();  //带括号  是方法
        System.out.println("length = " + length);

        char[] chars = str.toCharArray();
        int x = chars.length;  //不带括号  是属性
        for (char aChar : chars) {
            System.out.println("aChar = " + aChar);
        }

        //查找给定的字符串位置
        // 查找i 的位置   查找出来的是第一次出现的位置
        int i = str.indexOf("i");
        System.out.println("i = " + i);

        //从指定位置进行检索
        int i1 = str.indexOf("i",3);
        System.out.println("i1 = " + i1);

        //检索最后一次出现的位置
       int i2 =  str.lastIndexOf("i");
        System.out.println("i2 = " + i2);
        
        //以什么字符开头  什么字符结束
        boolean th = str.startsWith("th");
        System.out.println("th = " + th);
        boolean va = str.endsWith("va");
        System.out.println("va = " + va);
                    //  01234567
        String str2 =  "aaaabbbb";
        //String substring(int beginIndex, int endIndex)截取字符串
        //含头不含尾
        String substring = str2.substring(2,5);
        System.out.println("substring = " + substring);
        //一下子截取到末尾
        String substring1 = str.substring(4);
        System.out.println("substring1 = " + substring1);

        //只能删除字符串两边的空格
        String str3 = "  a  a  ";
        String trim = str3.trim();
        System.out.println("trim = " + trim);
        String str4 = "ABC";
        String str5 = "abc";
        String s = str4.toLowerCase();
        String s1 = str5.toUpperCase();
        System.out.println("s = " + s);
        System.out.println("s1 = " + s1);
        System.out.println(str4.equals(str5));
        System.out.println(str4.equalsIgnoreCase(str5));//忽略大小写


        //吧数字转换成字符串
        int str6 = 11;
        String s2 = String.valueOf(str6);
        System.out.println("s2 = " + s2);
        System.out.println("s2+1 = " + s2+1);
        
        //spild()  分割成数组
        String str7 = "aaa.bbb";
        String[] split = str7.split("\\.");
        System.out.println("split = " + split);
        for (String s3 : split) {
            System.out.println("s3 = " + s3);
        }

        //数据替换
        String mm = "aaa0..2...ede";
        String bbb = mm.replaceAll("[a-z]", "bbb");
        System.out.println("bbb = " + bbb);
        //数据包含
        String nn = "acxa";
        boolean c = nn.contains("c");
        System.out.println("c = " + c);
    }
}
