package com.heytap.health.protocol.cardiovascular;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: classes17.dex */
public interface CardiovascularProto$UserBodyInfoV1OrBuilder extends MessageLiteOrBuilder {
    int getAge();

    String getDeviceName();

    ByteString getDeviceNameBytes();

    float getHeight();

    int getSex();

    float getWeight();
}
