package com.heytap.health.protocol.dm;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: classes17.dex */
public interface DMProto$BatteryNotificationOrBuilder extends MessageLiteOrBuilder {
    String getContent();

    ByteString getContentBytes();

    int getId();

    int getTimestamp();

    int getType();
}
