package com.google.protobuf;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public class ServiceException extends Exception {
    private static final long serialVersionUID = -1219262335729891920L;

    public ServiceException(String str) {
        super(str);
    }

    public ServiceException(Throwable th) {
        super(th);
    }

    public ServiceException(String str, Throwable th) {
        super(str, th);
    }
}
