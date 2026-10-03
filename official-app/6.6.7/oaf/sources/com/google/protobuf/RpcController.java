package com.google.protobuf;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public interface RpcController {
    String errorText();

    boolean failed();

    boolean isCanceled();

    void notifyOnCancel(RpcCallback<Object> rpcCallback);

    void reset();

    void setFailed(String str);

    void startCancel();
}
