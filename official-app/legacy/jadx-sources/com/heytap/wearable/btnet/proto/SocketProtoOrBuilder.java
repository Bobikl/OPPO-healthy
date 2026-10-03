package com.heytap.wearable.btnet.proto;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: classes2.dex */
public interface SocketProtoOrBuilder extends MessageLiteOrBuilder {
    String getAddress();

    ByteString getAddressBytes();

    boolean getHbProxyEnable();

    String getPackageName();

    ByteString getPackageNameBytes();

    int getPort();
}
