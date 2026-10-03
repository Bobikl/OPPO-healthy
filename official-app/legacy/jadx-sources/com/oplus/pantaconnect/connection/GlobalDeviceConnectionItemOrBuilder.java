package com.oplus.pantaconnect.connection;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;

/* JADX INFO: loaded from: classes8.dex */
public interface GlobalDeviceConnectionItemOrBuilder extends MessageOrBuilder {
    String getAddress();

    ByteString getAddressBytes();

    int getChannelType();

    int getConnectType();

    String getIp();

    ByteString getIpBytes();

    String getSsid();

    ByteString getSsidBytes();

    int getVLinkType();
}
