package com.heytap.wearable.btnet.proto;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: classes2.dex */
public interface HBProxyConfigOrBuilder extends MessageLiteOrBuilder {
    boolean getEnable();

    int getHbInterval();

    int getHbTimeout();

    String getIp();

    ByteString getIpBytes();

    int getPort();

    int getProxyType();
}
