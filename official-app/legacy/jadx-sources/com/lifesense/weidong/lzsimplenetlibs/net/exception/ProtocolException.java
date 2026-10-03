package com.lifesense.weidong.lzsimplenetlibs.net.exception;

/* JADX INFO: loaded from: classes5.dex */
public class ProtocolException extends BaseException {
    public static final long serialVersionUID = 3252234250603642437L;

    public ProtocolException(String str, String str2) {
        super(String.format("request(%s)exception:%s", str, str2));
    }

    public ProtocolException(String str, String str2, Throwable th, Object... objArr) {
        super(String.format("request(%s)exception:%s", str, str2), th, objArr);
    }
}
