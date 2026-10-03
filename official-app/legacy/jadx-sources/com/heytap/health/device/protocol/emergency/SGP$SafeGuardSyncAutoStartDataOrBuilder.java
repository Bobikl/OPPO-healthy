package com.heytap.health.device.protocol.emergency;

import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: classes16.dex */
public interface SGP$SafeGuardSyncAutoStartDataOrBuilder extends MessageLiteOrBuilder {
    int getEndHour();

    int getEndMinute();

    boolean getIsOpen();

    int getStartHour();

    int getStartMinute();
}
