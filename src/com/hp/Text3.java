package com.hp;

public class Text3 {
    public static void main(String[] args) {
        String str= "上海自来水来自海上";
        check(str);
    }
    
    public static void check(String str) {
        StringBuilder b = new StringBuilder(str);
        StringBuilder reverse = b.reverse();
        System.out.println("reverse = " + reverse);
        StringBuilder reverse1 = b.reverse();
        System.out.println(reverse1.equals(reverse));
    }
}
