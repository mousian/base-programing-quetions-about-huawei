package com.mousian.test;

import java.math.BigDecimal;
import java.util.Scanner;

public class seven浮点数四舍五入取整数 {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        double value = sc.nextDouble();
        int intVal = Double.valueOf(value).intValue();
        double temp = value - intVal;
        if(temp>=0.5){
            System.out.println(intVal+1);
        }else{
            System.out.println(intVal);
        }


    }

}
