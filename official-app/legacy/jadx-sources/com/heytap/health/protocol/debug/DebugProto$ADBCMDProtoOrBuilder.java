package com.heytap.health.protocol.debug;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: classes17.dex */
public interface DebugProto$ADBCMDProtoOrBuilder extends MessageLiteOrBuilder {
    ByteString getPayload();

    int getPort();
}
