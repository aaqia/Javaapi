package com.hp;

public class StringBuilder3 {
    public static void main(String[] args) {
        String aa[]= {"www.oracle.com",
                "www.oracle.com.cn",
                "www.java.oracle.com.cn",
                "www.lol.game.qq.com.cn",
                "www.game.mycom.com.cn",
                "www.girl.mycom.com.cn",
                "www.computer.mycom.com.cn"};
        for (int i = 0; i <aa.length; i++) {
            System.out.println(aa[i]);
            getSubstring(aa[i]);
        }
    }
    private static String getSubstring(String url){
        int com = url.indexOf(".com", 5);
        String substring = url.substring(4,com);
        System.out.println("substring = " + substring);
        return "substring";
    }
}
