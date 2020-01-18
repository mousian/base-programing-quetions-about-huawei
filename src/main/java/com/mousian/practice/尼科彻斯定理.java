package com.mousian.practice;

import java.util.Scanner;

/**
 * 公司名称: 国誉创富(深圳)国际金融服务有限公司
 * 项目名: base-programing-questions-about-huawei
 * 文件名: com.mousian.practice
 * Copyright (C) 2020 Co. Ltd. www.huashengguotong.com
 * All rights reserved.
 */
public class 尼科彻斯定理 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        scanner.close();
        //算出第一位
        int fst = 1;
        int temp =2;
        if(m==1){
            System.out.println(fst);
        }else{
            for(int i = 1;i<m;i++){
                fst = fst+temp;
                temp=temp+2;
            }
            for (int i = 0;i<m;i++){
                if (i==(m-1)){
                    System.out.print(fst);
                }else{
                    System.out.print(fst+"+");
                }
                fst=fst+2;
            }
        }
    }


}
