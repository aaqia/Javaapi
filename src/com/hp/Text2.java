package com.hp;

public class Text2 {
    /**
     * 将"大家好!"修改为:"大家好!我是程序员!"并输出。
     * 然后将"大家好!我是程序员!"修改为:"大家好!我是优秀的程序员!"并输出
     * 然后再修改为:"大家好!我是牛牛的程序员!"并输出
     * 然后在修改为:"我是牛牛的程序员!"并输出
     */
    public static void main(String[] args) {
        String str = "大家好";
        System.out.println("str = " + str);
        StringBuilder s = new StringBuilder(str);
        //将"大家好!"修改为:"大家好!我是程序员!"并输出。
        StringBuilder append = s.append("!我是程序员");
        System.out.println("append = " + append);
        //然后将"大家好!我是程序员!"修改为:"大家好!我是优秀的程序员!"并输出
        StringBuilder aa = s.replace(6, 11, "优秀的程序员");
        System.out.println("aa = " + aa);
        //然后再修改为:"大家好!我是牛牛的程序员!"并输出
        StringBuilder replace = s.replace(3, 12,"!我是牛牛的程序员!");
        System.out.println("replace = " + replace);
        //然后再修改为:"我是牛牛的程序员!"并输出
        StringBuilder delete = s.delete(0, 4);
        System.out.println("delete = " + delete);
    }
}
