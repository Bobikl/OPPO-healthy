package com.heytap.health.band.data;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: classes15.dex */
public interface PressCmd$DeviceStatusOrBuilder extends MessageLiteOrBuilder {
    long getBattery();

    long getFreeSpace();

    int getPidHealthTransPort();

    int getPidLinkService();

    int getPidTestApp();

    int getPidTestTransPort();

    String getReason();

    ByteString getReasonBytes();

    long getTotalSpace();

    long getUpTime();
}
