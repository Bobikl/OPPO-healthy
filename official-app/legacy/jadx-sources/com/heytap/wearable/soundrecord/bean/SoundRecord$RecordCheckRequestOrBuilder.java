package com.heytap.wearable.soundrecord.bean;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: classes2.dex */
public interface SoundRecord$RecordCheckRequestOrBuilder extends MessageLiteOrBuilder {
    long getFileId();

    String getFileName();

    ByteString getFileNameBytes();
}
