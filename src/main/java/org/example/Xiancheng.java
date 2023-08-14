package org.example;

/**
 * 用户：minknown
 * 描述：线程类
 */
public class Xiancheng extends Thread{
    @Override
    public void run(){
        for (int i = 0; i < 100; i++) {
            System.out.println("A:"+i);
        }
    }
}
