package com.heytap.wearable.oaf.proto;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: classes2.dex */
public interface OafRecorder$DeviceEventStoreOrBuilder extends MessageLiteOrBuilder {
    long getCallConnectedTime();

    long getCallDisconnectTime();

    boolean getConnected();

    long getConnectedTime();

    long getDisconnectedTime();

    long getHeartBeatTime();

    String getMac();

    ByteString getMacBytes();
}
