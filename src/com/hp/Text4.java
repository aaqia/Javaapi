package com.hp;

import java.util.Scanner;

public class Text4 {
    public static void main(String[] args) {
        System.out.println("输入你的email地址");
        Scanner scanner = new Scanner(System.in);
            String s = scanner.nextLine();
        int i = s.indexOf("@");
        String substring = s.substring(0, i);
        System.out.println("substring = " + substring);
    }
}
