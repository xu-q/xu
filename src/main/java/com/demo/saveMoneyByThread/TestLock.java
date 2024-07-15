package com.demo.saveMoneyByThread;

import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.locks.LockSupport;

public class TestLock {
    static Thread thread = null;
    private static  ConcurrentLinkedDeque<Thread> concurrentLinkedDeque = new ConcurrentLinkedDeque<Thread>();

    private static int num = 0;
    public static void main(String[] args) throws InterruptedException {

            test();
            new Thread(() ->{
                System.out.println(Thread.currentThread().getId()+ "  thread（）");
                test();
            }).start();
            System.out.println(Thread.currentThread() + " unpark（）");
        Thread.sleep(1000);
            LockSupport.unpark(concurrentLinkedDeque.getFirst());
        concurrentLinkedDeque.remove(concurrentLinkedDeque.getFirst());
            num --;
            System.out.println("结束");

    }

    public static void test(){
        thread = Thread.currentThread();

        if(num > 0 ){
            System.out.println(Thread.currentThread()+ "  阻塞");
            concurrentLinkedDeque.add(thread);
            LockSupport.park();
            System.out.println(Thread.currentThread()+ "  3333333333");
            return;
        }
        System.out.println(Thread.currentThread()+ "  test()结束");
        num ++;
        return;
    }
}
