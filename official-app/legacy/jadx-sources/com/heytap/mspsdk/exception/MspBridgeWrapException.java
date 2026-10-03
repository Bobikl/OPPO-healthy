package com.heytap.mspsdk.exception;

/* JADX INFO: loaded from: classes19.dex */
public class MspBridgeWrapException extends MspSdkException {
    public MspBridgeWrapException(String str, Throwable th, int i) {
        super("bridge: " + str, th, i);
    }
}
