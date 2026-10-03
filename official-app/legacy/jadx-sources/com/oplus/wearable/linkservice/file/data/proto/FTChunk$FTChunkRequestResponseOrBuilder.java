package com.oplus.wearable.linkservice.file.data.proto;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: classes5.dex */
public interface FTChunk$FTChunkRequestResponseOrBuilder extends MessageLiteOrBuilder {
    ByteString getContent();

    int getEndPoint();

    String getErrorMsg();

    ByteString getErrorMsgBytes();

    int getIndex();

    int getState();

    int getTaskId();
}
