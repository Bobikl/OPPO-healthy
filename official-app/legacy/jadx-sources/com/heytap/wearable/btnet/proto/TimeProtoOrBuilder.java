package com.heytap.wearable.btnet.proto;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: classes2.dex */
public interface TimeProtoOrBuilder extends MessageLiteOrBuilder {
    int getDay();

    int getHour();

    int getMinute();

    int getMonth();

    int getSec();

    String getTimezone();

    ByteString getTimezoneBytes();

    int getYear();
}
