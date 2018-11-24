package com.ssm.sdk.common.cache;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public abstract class AbstractCache implements Runnable {
    private long interval = 20 * 60 * 1000;
    private boolean isRun = false;

    @PostConstruct
    public void start() {
        isRun = true;
        new Thread(this).start();
    }

    @PreDestroy
    public void shutDown() {
        this.isRun = false;
    }

    @Override
    public void run() {
        while (isRun) {
            try {
                update();
                Thread.sleep(interval);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public abstract void update();

    public void setInterval(long interval) {
        this.interval = interval;
    }
}
