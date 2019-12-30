package com.mousian.test;

import java.util.*;

public class eight将表中索引相同数值想加 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //条数
        int c = scanner.nextInt();
        //表
        Map treeMap = new TreeMap();
        for (int i = 0; i < c; i++) {
            String strA = scanner.next();
            String strB = scanner.next();
            if (treeMap.containsKey(strA)) {
                Integer intA = Integer.valueOf((String) treeMap.get(strA));
                Integer intB = Integer.valueOf(strB);
                treeMap.put(strA, intA + intB);
            } else {
                treeMap.put(strA, strB);
            }
        }

        for (Object k : treeMap.keySet()) {
            System.out.println(k + " " + treeMap.get(k));
        }
    }


}
