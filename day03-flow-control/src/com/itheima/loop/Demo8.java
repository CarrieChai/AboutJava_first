package com.itheima.loop;

import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class Demo8 {
    public static void main(String[] args) {
        //һЩ������ϰ
//        calc();
//        guessNumber();
//        VerificationCode(4);
//        VerificationCode(6);
        PrimeNumber(101,200);
    }

    // ��ϰ��ʵ��һ���򵥵ļ�����
    public static void calc(){
        while(true){
            Double n1,n2 = 0.0;
            String op = " ";
            Scanner sc = new Scanner(System.in);
            System.out.println("�������һ�����֣�");
            n1 = sc.nextDouble();
            System.out.println("�����������������֧��+��-�� *��/�������㣩��");
            op = sc.next();
            System.out.println("������ڶ������֣�");
            n2 = sc.nextDouble();
            // ����ʹ��switch����Ϊ���ǵ������ǵ�ֵƥ�� ��switch�ȽϺ���
            switch(op){
                case "+":
                    System.out.println(n1+"+"+n2+"="+(n1+n2));
                    break;
                case "-":
                    System.out.println(n1+"-"+n2+"="+(n1-n2));
                    break;
                case "*":
                    System.out.println(n1+"*"+n2+"="+(n1*n2));
                    break;
                case "/":
                    if (n2==0){
                        System.out.println("������Ϊ0����������");
                        break;
                    }else {
                        System.out.println(n1+"/"+n2+"="+(n1/n2));
                        break;
                    }
                default:
                    System.out.println("�������������");
            }
            System.out.println("--------------");
            System.out.println("�Ƿ��˳���y/n");
            String flag = sc.next();
            if (flag.equals("y")){
                break;
            }else if(!(flag.equals("n"))){
                System.out.println("��������Ĭ�ϼ���ʹ��");
            }
        }
    }

    // ��ϰ����������Ϸ
    public static void guessNumber(){
        Random random = new Random();
        int luckyNumber = random.nextInt(100)+1;// ����[1,100]�������
        while (true){
            int n = 0;
            Scanner sc = new Scanner(System.in);
            System.out.println("������²�����֣�");
            n = sc.nextInt();
            if (n==luckyNumber){
                System.out.println("��ϲ�㣬�¶���");
                break;
            }else if (n>luckyNumber){
                System.out.println("�´���");
            }else {
                System.out.println("��С��");
            }
        }
    }

    // ��ϰ����֤��������
    public static void VerificationCode(int size){ //����nȷ����֤���λ��
        String code = "";
        for (int i = 0; i < size; i++) {
            // ÿһλ���п���������0 ����д��ĸ1��Сд��ĸ2֮�е�һ����
            // ��������һ���������ȷ������
            int type = (int)(Math.random()*3);
            switch(type){
                case 0: // ����
                    code = code+(int)(Math.random()*10);
                    break;
                case 1: // ��д
                    code = code + (char) ('A' + Math.random() * 26); // A-Z 65-90 A��ASCII��ֵ��65 Ҳ����д�� (char)(65+Math.random()*26)
                    break;
                case 2: // Сд
                    code = code + (char) ('a' + Math.random() * 26); // a-z 97-122 a��ASCII��ֵ��97 Ҳ����д�� (char)(97+Math.random()*26)
                    break;
            }

        }
        System.out.println("���ɵ���֤���ǣ�"+code);

    }


    // ��ϰ����������ͳ��
    // 1 �ж�һ�����Ƿ�������
    public static boolean IsPrime(int n){
        boolean flag = true;
        int i = 2;
        while (i<=Math.sqrt(n)){
            if (n%i==0){
                flag = false;
                break;
            }
            i++;
        }
        return flag;
    }
    // 2 ͳ����������
    public static void PrimeNumber(int i1,int i2){
        int n = 0;
        for (int j = i1; j <= i2; j++) {
            if (IsPrime(j)){
                n++;
                System.out.println(j);
            }
        }
        System.out.println("��["+i1+","+i2+"]֮�䣬�����ĸ���Ϊ��"+n);
    }


}
