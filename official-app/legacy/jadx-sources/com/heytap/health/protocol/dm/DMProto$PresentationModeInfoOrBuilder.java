package com.heytap.health.protocol.dm;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: classes17.dex */
public interface DMProto$PresentationModeInfoOrBuilder extends MessageLiteOrBuilder {
    String getDeviceId();

    ByteString getDeviceIdBytes();

    String getRegion();

    ByteString getRegionBytes();

    int getType();
}
