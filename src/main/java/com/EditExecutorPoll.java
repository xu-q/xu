package com;

import java.util.concurrent.LinkedBlockingDeque;

public class EditExecutorPoll {

    private LinkedBlockingDeque<Runnable> threadDeque;

    private boolean isRun = true;

    public EditExecutorPoll(int maxThreadCount, int maxThreadDequeCount) {
        threadDeque = new LinkedBlockingDeque<>(maxThreadDequeCount);
        for (int i = 0; i < maxThreadCount; i++) {
            new WorkThread().start();
        }
    }

    public static void main(String[] args) {
        EditExecutorPoll editExecutorPoll = new EditExecutorPoll(15, 15);
        for (int i = 0; i < 10; i++) {
            final int num = i;
            editExecutorPoll.addThread(() -> {
                System.out.println(Thread.currentThread().getName() + "  " + num);
            });
        }
        editExecutorPoll.isRun = false;
    }

    public void addThread(Runnable runnable) {
        threadDeque.offer(runnable);
    }

    class WorkThread extends Thread {
        @Override
        public void run() {
            while (isRun || threadDeque.size() > 0) {
                Runnable runnable = threadDeque.poll();
                if (runnable != null) {
                    runnable.run();
                }
            }
        }
    }
}


