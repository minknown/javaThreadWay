package org.example;

/**
 * 用户：minknown
 * 描述：线程接口模式
 */
public class Xianchengtwo implements Runnable{

    @Override
    public synchronized void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("B:"+i);
        }

    }
}
