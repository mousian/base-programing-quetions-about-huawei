package com.mousian.test;

import java.util.*;


public class eleven句子单词倒序 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String strIn = scanner.nextLine();
        String[] sps = strIn.split(" ");

        for (int i=sps.length-1;i>=0;i--){
            System.out.print(sps[i]+" ");
        }
    }

}
