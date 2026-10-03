package com.heytap.health.protocol.dm;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: classes17.dex */
public interface DMProto$BatteryInfoOrBuilder extends MessageLiteOrBuilder {
    int getBatteryPercent();

    String getDeviceMac();

    ByteString getDeviceMacBytes();

    int getIsCharging();
}
