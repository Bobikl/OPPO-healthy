package com.heytap.wearable.watch;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: classes3.dex */
public interface ClockMessageProto$AlarmMessageOrBuilder extends MessageLiteOrBuilder {
    int getAlarmId();

    int getAlarmLaterEnable();

    String getAlarmName();

    ByteString getAlarmNameBytes();

    int getAlarmStatus();

    long getAlarmTime();

    boolean getIsGarbAlarm();

    int getRingCount();

    int getRingDuration();
}
