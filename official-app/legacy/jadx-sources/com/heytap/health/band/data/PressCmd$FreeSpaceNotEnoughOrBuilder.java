package com.heytap.health.band.data;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: classes15.dex */
public interface PressCmd$FreeSpaceNotEnoughOrBuilder extends MessageLiteOrBuilder {
    String getFileName();

    ByteString getFileNameBytes();

    PressCmd$DeviceStatus getStatus();

    boolean hasStatus();
}
