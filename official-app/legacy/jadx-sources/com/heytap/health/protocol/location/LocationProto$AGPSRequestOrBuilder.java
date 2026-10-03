package com.heytap.health.protocol.location;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: classes17.dex */
public interface LocationProto$AGPSRequestOrBuilder extends MessageLiteOrBuilder {
    int getCombo();

    int getEndTime();

    String getFormat();

    ByteString getFormatBytes();

    String getModel();

    ByteString getModelBytes();

    int getStartTime();

    int getTimeUnit();
}
