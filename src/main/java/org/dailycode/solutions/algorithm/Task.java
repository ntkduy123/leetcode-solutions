package org.dailycode.solutions.algorithm;

public class Task implements Runnable {

    private static int count = 0;

    private String name;

    private boolean isSync;

    public Task(String name, boolean isSync) {
        this.name = name;
        this.isSync = isSync;
    }


    @Override
    public void run() {
        if (this.isSync) {
            this.increaseWithSync();
        } else {
            this.increaseWithoutSync();
        }
    }

    public void increaseWithSync() {
        int val = 0;
        for (int i = 0; i < 10; ++i) {
            synchronized (Task.class) {
                val = Task.count++;
            }
        }
        System.out.println(val);
    }

    public void increaseWithoutSync() {
        int val = 0;
        for (int i = 0; i < 10; ++i) {
            val = Task.count++;

        }
        System.out.println(val);
    }
}
