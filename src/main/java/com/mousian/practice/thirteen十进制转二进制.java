package com.mousian.practice;

import java.util.Scanner;

public class thirteen十进制转二进制 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int rs = 0;
        while (n > 0) {
            if (n % 2 == 1) {
                rs++;
            }
            n = n / 2;
        }
        System.out.println(rs);
    }
}
