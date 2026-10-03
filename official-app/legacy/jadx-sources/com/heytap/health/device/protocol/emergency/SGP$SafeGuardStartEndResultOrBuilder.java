package com.heytap.health.device.protocol.emergency;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: classes16.dex */
public interface SGP$SafeGuardStartEndResultOrBuilder extends MessageLiteOrBuilder {
    int getResult();

    String getTravelId();

    ByteString getTravelIdBytes();
}
