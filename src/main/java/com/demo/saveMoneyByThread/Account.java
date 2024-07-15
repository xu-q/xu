package com.demo.saveMoneyByThread;

public class Account {
    private double balance; // 账户余额

    /**
     * 存款
     *
     * @param money 存入金额
     */
    public synchronized void deposit(double money) {
        System.out.println(Thread.currentThread().getName());
        double newBalance = balance + money;
        try {
            Thread.sleep(1000); // 模拟此业务需要一段处理时间
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        balance = newBalance;
    }

    /**
     * 获得账户余额
     */
    public double getBalance() {
        return balance;
    }

}
