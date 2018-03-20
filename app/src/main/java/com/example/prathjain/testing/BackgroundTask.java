package com.example.prathjain.testing;

import android.util.Log;

/**
 * Created by prathjain on 3/19/2018.
 */

public class BackgroundTask implements Runnable {

    public static final String TAG="CodeRunner";
    private int threadNumber;

    public BackgroundTask(int threadNumber) {
        this.threadNumber = threadNumber;
    }

    @Override
    public void run() {

        Log.i(TAG, Thread.currentThread().getName()+ " Start, thread number= "+threadNumber);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Log.i(TAG, Thread.currentThread().getName()+ " End, thread number= "+threadNumber);

    }
}
