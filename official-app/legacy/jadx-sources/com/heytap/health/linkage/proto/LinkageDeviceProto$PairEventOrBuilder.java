package com.heytap.health.linkage.proto;

import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: classes16.dex */
public interface LinkageDeviceProto$PairEventOrBuilder extends MessageLiteOrBuilder {
    LinkageDeviceProto$ACTION getAction();

    int getActionValue();

    LinkageDeviceProto$AccountDeviceInfo getDevice();

    int getEventId();

    int getFlag();

    int getResultCode();

    boolean hasDevice();
}
