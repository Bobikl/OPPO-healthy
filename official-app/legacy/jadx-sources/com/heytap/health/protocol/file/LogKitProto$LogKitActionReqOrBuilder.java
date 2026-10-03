package com.heytap.health.protocol.file;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: classes17.dex */
public interface LogKitProto$LogKitActionReqOrBuilder extends MessageLiteOrBuilder {
    int getAction();

    String getParam();

    ByteString getParamBytes();
}
