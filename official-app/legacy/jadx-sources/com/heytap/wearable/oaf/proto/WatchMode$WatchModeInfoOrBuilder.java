package com.heytap.wearable.oaf.proto;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: classes2.dex */
public interface WatchMode$WatchModeInfoOrBuilder extends MessageLiteOrBuilder {
    int getParingSequence();

    ByteString getPhoneMac();

    int getPhoneType();

    int getReplaySeq();

    int getRequestSeq();

    int getWorkMode();
}
