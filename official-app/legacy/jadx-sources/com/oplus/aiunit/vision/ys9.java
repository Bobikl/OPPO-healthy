package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes16.dex */
public interface ys9<T> {
    public static final int ERROR_DISCONNECTED = -2;
    public static final int ERROR_IN_STUB_MODULE = -4;
    public static final int ERROR_PEER_DISCONNECTED = -1;
    public static final int ERROR_TIME_OUT = -3;

    void onFail(int i);

    void onSuccess(T t);
}
