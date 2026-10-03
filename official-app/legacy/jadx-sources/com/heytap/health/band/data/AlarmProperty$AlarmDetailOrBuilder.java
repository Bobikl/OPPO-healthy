package com.heytap.health.band.data;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: classes15.dex */
public interface AlarmProperty$AlarmDetailOrBuilder extends MessageLiteOrBuilder {
    int getAlarmDayflag();

    int getAlarmEnable();

    int getAlarmId();

    int getAlarmLaterEnable();

    String getAlarmName();

    ByteString getAlarmNameBytes();

    int getAlarmShakeDuration();

    int getAlarmState();

    int getAlarmTime();
}
