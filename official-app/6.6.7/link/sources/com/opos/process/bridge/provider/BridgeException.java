package com.opos.process.bridge.provider;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class BridgeException extends Exception {
    private int code;

    public BridgeException(String str, int i) {
        super(str);
        this.code = i;
    }

    public int getCode() {
        return this.code;
    }

    public BridgeException(String str, Throwable th, int i) {
        super(str, th);
        this.code = i;
    }

    public BridgeException(Throwable th, int i) {
        super(th);
        this.code = i;
    }
}
