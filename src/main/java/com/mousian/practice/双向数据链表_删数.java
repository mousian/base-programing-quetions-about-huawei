package com.mousian.practice;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * 有一个数组a[N]顺序存放0~N-1，要求每隔两个数删掉一个数，到末尾时循环至开头继续进行，求最后一个被删掉的数的原始下标位置。以8个数(N=7)为例:｛0，1，2，3，4，5，6，7｝，0->1->2(删除)->3->4->5(删除)->6->7->0(删除),如此循环直到最后一个数被删除。
 *
 * 输入描述:
 * 每组数据为一行一个整数n(小于等于1000)，为数组成员数,如果大于1000，则对a[999]进行计算。
 *
 * 输出描述:
 * 一行输出最后一个被删掉的数的原始下标位置。
 */

public class 双向数据链表_删数 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        LinkedList<Integer> c = new LinkedList<>();
        for(int i = 0;i<n;i++){
            c.add(i);
        }
        Iterator<Integer> iterator = c.iterator();
        int count = 0;
        int size = c.size();
        while (size>1){
            if(count!=2){
                Integer pop = c.pop();
                c.addLast(pop);
                count++;
            }else{
                c.removeFirst();
                count=0;
            }
            size = c.size();
        }
        System.out.println(c.get(0));
    }

}
