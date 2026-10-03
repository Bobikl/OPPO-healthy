package com.heytap.health.protocol;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: classes17.dex */
public interface Common$ActionResponseOrBuilder extends MessageLiteOrBuilder {
    int getCode();

    String getMsg();

    ByteString getMsgBytes();
}
