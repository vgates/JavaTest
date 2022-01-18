package com.smredlabs.threadsexample;

public class ThreadMainDemo {
    public static void main(String[] args) {
        System.out.println("Active No of threads: " + Thread.activeCount());
        System.out.println(Thread.currentThread().getName());
        Thread thread = new Thread(new DownloadFileTask());
        thread.start();
    }
}
