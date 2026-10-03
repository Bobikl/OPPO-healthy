package com.heytap.health.protocol.dm;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: classes17.dex */
public interface DMProto$MarketModeInfoOrBuilder extends MessageLiteOrBuilder {
    String getArea();

    ByteString getAreaBytes();

    int getCode();

    String getDeviceId();

    ByteString getDeviceIdBytes();

    String getDeviceModel();

    ByteString getDeviceModelBytes();

    int getPresentationType();
}
