package org.example;

/**
 * 用户：minknown
 * 描述：线程的三种启动方法
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        //线程的第一种实现
        Xiancheng cc = new Xiancheng();
        cc.start();
        //线程的第二种实现
        Thread thread1 = new Thread(new Xianchengtwo());
        thread1.start();
        //线程的第三种实现
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println("C:" + i);
                }
            }
        });
        thread.start();

        //主线程
        System.out.println("HIHIHIHIHI");
    }
}