package com.oplus.pantaconnect.sdk;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;

/* JADX INFO: loaded from: classes8.dex */
public interface SealedResultOrBuilder extends MessageOrBuilder {
    ByteString getData();

    ErrorCode getErrorCode();

    int getErrorCodeValue();

    String getMessage();

    ByteString getMessageBytes();

    ResultCode getResultCode();

    int getResultCodeValue();
}
