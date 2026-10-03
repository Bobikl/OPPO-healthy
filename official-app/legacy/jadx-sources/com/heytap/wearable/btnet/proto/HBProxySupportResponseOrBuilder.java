package com.heytap.wearable.btnet.proto;

import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: classes2.dex */
public interface HBProxySupportResponseOrBuilder extends MessageLiteOrBuilder {
    HBProxySupportRequest getRequest();

    int getResultCode();

    boolean hasRequest();
}
