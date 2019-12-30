package com.mousian.huawei;

import java.util.Scanner;

public class HuaweiTest {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String strIn = sc.nextLine();
        int index = sc.nextInt();
        String[] split = strIn.split(";");
        System.out.println(split[index]);
    }
}
