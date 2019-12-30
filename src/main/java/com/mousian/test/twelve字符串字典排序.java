package com.mousian.test;

import java.util.*;

public class twelve字符串字典排序 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        String[] strs = new String[c];
        for (int i = 0; i < c; i++) {
            if(sc.hasNext()){
                strs[i] = sc.next();
            }
        }
        Arrays.sort(strs);
        for (String str : strs) {
            System.out.println(str);
        }

    }

}
