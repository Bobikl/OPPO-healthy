package com.oplus.wearable.linkservice.file.data.proto;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: classes5.dex */
public interface FTComplete$FTCompleteRequestResponseOrBuilder extends MessageLiteOrBuilder {
    String getErrorMsg();

    ByteString getErrorMsgBytes();

    int getState();

    int getTaskId();
}
