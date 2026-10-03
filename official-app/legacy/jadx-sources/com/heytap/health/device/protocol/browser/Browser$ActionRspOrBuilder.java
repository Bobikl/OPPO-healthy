package com.heytap.health.device.protocol.browser;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: classes16.dex */
public interface Browser$ActionRspOrBuilder extends MessageLiteOrBuilder {
    int getCode();

    int getId();

    String getMsg();

    ByteString getMsgBytes();
}
