package com.heytap.health.linkage.proto;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: classes16.dex */
public interface LinkageDeviceProto$PeerDeviceOrBuilder extends MessageLiteOrBuilder {
    boolean getAutoSwitch();

    boolean getIsCallActive();

    boolean getIsConnected();

    boolean getIsMusicActive();

    boolean getIsScreenOn();

    String getName();

    ByteString getNameBytes();
}
