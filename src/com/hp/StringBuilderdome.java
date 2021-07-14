package com.hp;

public class StringBuilderdome {
    //解决了字符串频繁修改的问题  意思是吧String给升级了
    //String 类 重点  重用性
    //StringBuilder/buffer 倾向于字符串的修改
    //当用到大量的追加/修改/删除的时候，就是用StringBuilder/buffer
    //StringBuilder优点：内部有个可变的字符数组 ，速度快 内存消耗小
    //在公司实际开发中  字符串的 增删改查 要使用StringBuilder/buffer
    //StringBuilder（线程不安全，速度快）/buffer（相反）
    public static void main(String[] args) {
        String str = "好好学习java";
        StringBuilder sb = new StringBuilder(str);
        //1.追加
        sb.append(",挣钱");
        System.out.println("sb = " + sb);
        //2.修改
        sb.replace(9,11,"挣大钱");
        System.out.println("sb = " + sb);
        //3.删除
        sb.deleteCharAt(1);
        System.out.println("sb = " + sb);
        //删除区间
        sb.delete(2,5);
        System.out.println("sb = " + sb);
        //删除全部
        sb.delete(0,sb.length());
        System.out.println("sb = " + sb);
        //4.添加
        sb.insert(0,"努力");
        System.out.println("sb = " + sb);
        //5.反转
        sb.reverse();
        System.out.println(sb);
    }
}
