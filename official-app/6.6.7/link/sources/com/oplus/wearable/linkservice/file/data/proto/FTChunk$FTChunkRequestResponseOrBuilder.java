package com.oplus.wearable.linkservice.file.data.proto;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public interface FTChunk$FTChunkRequestResponseOrBuilder extends MessageLiteOrBuilder {
    ByteString getContent();

    int getEndPoint();

    String getErrorMsg();

    ByteString getErrorMsgBytes();

    int getIndex();

    int getState();

    int getTaskId();
}
