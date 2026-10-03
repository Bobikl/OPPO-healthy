package com.heytap.log;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: loaded from: classes19.dex */
public class LogCacheManager {
    private static final int MAX_CACHE_SIZE = 30;
    private final ConcurrentLinkedQueue<CachedLogBean> cacheQueue = new ConcurrentLinkedQueue<>();
    private volatile boolean cacheEnabled = false;
    private volatile boolean initCalled = false;

    public boolean addToCache(String str, String str2, byte b, boolean z) {
        if (!shouldCache() || this.cacheQueue.size() >= 30) {
            return false;
        }
        CachedLogBean cachedLogBean = new CachedLogBean();
        cachedLogBean.setTag(str);
        cachedLogBean.setMessage(str2);
        cachedLogBean.setLevel(b);
        cachedLogBean.setShowConsole(z);
        cachedLogBean.setTimestamp(System.currentTimeMillis());
        return this.cacheQueue.offer(cachedLogBean);
    }

    public void disableCache() {
        this.cacheEnabled = false;
        this.cacheQueue.clear();
    }

    public List<CachedLogBean> drainCache() {
        ArrayList arrayList = new ArrayList();
        while (true) {
            CachedLogBean cachedLogBeanPoll = this.cacheQueue.poll();
            if (cachedLogBeanPoll == null) {
                return arrayList;
            }
            arrayList.add(cachedLogBeanPoll);
        }
    }

    public void enableCache() {
        this.initCalled = true;
        this.cacheEnabled = true;
    }

    public boolean shouldCache() {
        return this.initCalled && this.cacheEnabled;
    }
}
