package com.heytap.wearable.btnet.proto;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: classes2.dex */
public interface HBProxyStatusOrBuilder extends MessageLiteOrBuilder {
    String getIp();

    ByteString getIpBytes();

    long getLastServerHbTime();

    int getPort();

    int getProxyType();

    int getStatus();
}
