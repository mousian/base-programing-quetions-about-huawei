package com.mousian.test;

import java.util.*;

public class 输入数字去重然后排序 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Set<Integer> set = new TreeSet<>();
        for (int i = 0;i<n;i++){
            set.add(scanner.nextInt());
        }
        for(Integer rs : set){
            System.out.println(rs);
        }
    }
}
