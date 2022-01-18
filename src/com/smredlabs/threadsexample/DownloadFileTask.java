package com.smredlabs.threadsexample;

public class DownloadFileTask implements Runnable {
    @Override
    public void run() {
        System.out.println("Active No of threads: " + Thread.activeCount());
        System.out.println("Downloading File. Thread: " + Thread.currentThread().getName());
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Download complete " + Thread.currentThread().getName());


    }
}
