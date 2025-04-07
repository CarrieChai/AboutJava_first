package com.itheima.Array;

import java.util.Random;

public class ArrayTest4 {
    public static void main(String[] args) {
        // 一个斗地主的小练习 完成做牌和洗牌
        makePoker();
    }
    public static void makePoker(){
        String pokers[] = new String[54];
        String colcrs[] = {"♥","♠","♣","♦"};
        String number[] = {"3","4","5","6","7","8","9","10","J","Q","K","A","2"};
        int index = 0;
        for (int i = 0; i < colcrs.length; i++) {
            for (int j = 0; j < number.length; j++) {
                pokers[index++] = colcrs[i]+number[j];
            }
        }
        pokers[index++] = "\uD83D\uDC74";
        pokers[index] = "\uD83D\uDC69";
        for (int i = 0; i < pokers.length; i++) {
            System.out.print(pokers[i]+"\t");
        }
        System.out.println();

        Random r = new Random();
        for (int i = 0; i < pokers.length; i++) {
            int index1 = r.nextInt(pokers.length);
            int index2 = r.nextInt(pokers.length);
            String temp = pokers[index1];
            pokers[index1] = pokers[index2];
            pokers[index2] = temp;
        }
        for (int i = 0; i < pokers.length; i++) {
            System.out.print(pokers[i]+"\t");
        }
    }
}
