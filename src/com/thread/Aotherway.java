package com.thread;

public class Aotherway extends Thread{

    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.println(" AotherwayThread start: "+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Aotherway aotherway=new Aotherway();
        aotherway.run();
    }
}
