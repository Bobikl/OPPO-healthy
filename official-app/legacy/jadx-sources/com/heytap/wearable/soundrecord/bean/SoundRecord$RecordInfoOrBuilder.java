package com.heytap.wearable.soundrecord.bean;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: classes2.dex */
public interface SoundRecord$RecordInfoOrBuilder extends MessageLiteOrBuilder {
    long getFileId();

    String getFileMd5();

    ByteString getFileMd5Bytes();

    String getFileName();

    ByteString getFileNameBytes();

    int getFileSize();

    long getTimeStamp();

    int getTotalTime();
}
