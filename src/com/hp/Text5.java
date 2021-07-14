package com.hp;

import java.util.Random;
import java.util.Scanner;

public class Text5 {
    public static void main(String[] args) {
        /**
         * 随机生成一个5位的英文字母验证码(大小写混搭)
         * 然后将该验证码输出给用户，然后要求用户输入该验证码，大小写不限制。
         * 然后判定用户输入的验证码是否有效(无论用户输入大小写
         * ，只要字母都正确即可)。
         */

        String code = "";
        Random random = new Random();
        for(int i=0;i<5;i++){
            code+=random.nextInt(2)==0?(char)('A'+random.nextInt(26)):(char)('a'+random.nextInt(26));
        }
        System.out.println(code);
        String aa = code;
        System.out.println("输入验证码:");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        if (s.equalsIgnoreCase(aa)) {
            System.out.println("有效");
        }else{
            System.out.println("无效");
        }


    }
}
