package com.heytap.health.base.cache.model;

import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes15.dex */
@Keep
public class DataModel<T> {
    T data;
    long timestamp;

    public DataModel(long j2, T t) {
        this.timestamp = j2;
        this.data = t;
    }

    public T getData() {
        return this.data;
    }

    public long getTimestamp() {
        return this.timestamp;
    }
}
