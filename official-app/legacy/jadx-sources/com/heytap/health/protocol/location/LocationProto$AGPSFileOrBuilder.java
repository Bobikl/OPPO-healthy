package com.heytap.health.protocol.location;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: classes17.dex */
public interface LocationProto$AGPSFileOrBuilder extends MessageLiteOrBuilder {
    int getEndTime();

    String getFileName();

    ByteString getFileNameBytes();

    int getFileSize();

    int getStartTime();
}
