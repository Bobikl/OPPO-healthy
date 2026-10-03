package com.heytap.log.log;

import android.util.Log;
import com.heytap.log.Logger;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes19.dex */
public class SafeConLinkedQueue {
    private static final String TAG = "SafeConLinkedQueue";
    private int MAX_BLOCK_IN_SIZE;
    private ConcurrentLinkedQueue<LogBean> blockQueue;
    Logger logger;
    private AtomicBoolean syncSize = new AtomicBoolean(false);
    private AtomicInteger blockInSize = new AtomicInteger(0);
    private long OOM_OMIT_DURATION = 500;
    private long oomSystemTime = 0;

    public SafeConLinkedQueue(Logger logger) {
        this.MAX_BLOCK_IN_SIZE = 50000;
        this.blockQueue = null;
        this.logger = null;
        if (logger == null) {
            Log.e(TAG, "SafeConLinkedQueue init failure");
            return;
        }
        this.logger = logger;
        int fisrtCacheSize = logger.getConfig().getFisrtCacheSize();
        logger.debug(TAG, "SafeConLinkedQueue init maxSize : " + fisrtCacheSize);
        if (fisrtCacheSize > this.MAX_BLOCK_IN_SIZE) {
            this.MAX_BLOCK_IN_SIZE = fisrtCacheSize;
        }
        if (this.blockQueue == null) {
            this.blockQueue = new ConcurrentLinkedQueue<>();
        }
    }

    public boolean canWriteLog() {
        if (this.oomSystemTime + this.OOM_OMIT_DURATION <= System.currentTimeMillis()) {
            this.oomSystemTime = 0L;
            ConcurrentLinkedQueue<LogBean> concurrentLinkedQueue = this.blockQueue;
            return concurrentLinkedQueue == null || this.logger == null || concurrentLinkedQueue.size() < this.MAX_BLOCK_IN_SIZE;
        }
        Logger logger = this.logger;
        if (logger != null) {
            logger.debug(TAG, "canWriteLog 限制业务日志输入 ... ... ");
        }
        return false;
    }

    public void clear() {
        ConcurrentLinkedQueue<LogBean> concurrentLinkedQueue = this.blockQueue;
        if (concurrentLinkedQueue != null) {
            concurrentLinkedQueue.clear();
            this.blockInSize.set(0);
        }
    }

    public void offer(LogBean logBean) {
        if (this.blockQueue == null) {
            this.blockQueue = new ConcurrentLinkedQueue<>();
        }
        if (logBean == null || this.blockQueue == null) {
            return;
        }
        if (this.blockInSize.get() <= this.MAX_BLOCK_IN_SIZE) {
            this.syncSize.set(false);
            this.blockQueue.offer(logBean);
            this.blockInSize.getAndIncrement();
            return;
        }
        if (!this.syncSize.get()) {
            this.syncSize.set(true);
            this.blockInSize.set(this.blockQueue.size());
        }
        Logger logger = this.logger;
        if (logger != null) {
            logger.e(TAG, "超出一级缓存容量..... size : " + this.MAX_BLOCK_IN_SIZE);
        }
        if (this.oomSystemTime == 0) {
            this.oomSystemTime = System.currentTimeMillis();
        }
    }

    public LogBean poll() {
        ConcurrentLinkedQueue<LogBean> concurrentLinkedQueue = this.blockQueue;
        if (concurrentLinkedQueue == null || concurrentLinkedQueue.isEmpty()) {
            return null;
        }
        LogBean logBeanPoll = this.blockQueue.poll();
        this.blockInSize.getAndDecrement();
        return logBeanPoll;
    }

    public int size() {
        if (this.blockQueue != null) {
            return this.blockInSize.get();
        }
        return 0;
    }

    public void verifySize() {
        ConcurrentLinkedQueue<LogBean> concurrentLinkedQueue = this.blockQueue;
        if (concurrentLinkedQueue != null) {
            this.blockInSize.set(concurrentLinkedQueue.size());
        }
    }
}
