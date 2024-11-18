package com.java8.lambda;

public class ThreadUsingLambda {

    public static void main(String[] args) throws Exception {


        Runnable thread1 = () -> {
            for (int i = 0; i < 10; i++) {
                System.out.print(i + " ");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };
        Thread t = new Thread(thread1);
        t.setName("John");
        t.start();


    }
}
