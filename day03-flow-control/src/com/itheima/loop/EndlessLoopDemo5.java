package com.itheima.loop;

public class EndlessLoopDemo5 {
    public static void main(String[] args) {
        // Ŀ�꣺��ѭ����д��
        test();
    }

    public static void test() {
        // while��ѭ�� ����д��
//        while(true) {
//            System.out.println("��ѭ��");
//        }

        // for��ѭ��
//        for ( ;   ;  ) {
//            System.out.println("��ѭ��");
//        }

        // do...while��ѭ��
        do {
            System.out.println("��ѭ��");
        }while (true);
    }
}
