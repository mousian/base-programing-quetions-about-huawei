package com.mousian.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class 空瓶子换饮料喝 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            if (n != 0) {
                list.add(n);
            } else {
                break;
            }
        }
        for (Integer in : list) {
            int result = 0;
            int r = 0;
            while (in / 3 > 0) {
                result = result + in / 3;
                in = in / 3 + in % 3;
                if (in == 2) {
                    in++;
                }
            }
            System.out.println(result);
        }
    }

}
