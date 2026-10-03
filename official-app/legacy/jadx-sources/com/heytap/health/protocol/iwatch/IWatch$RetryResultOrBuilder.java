package com.heytap.health.protocol.iwatch;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: classes17.dex */
public interface IWatch$RetryResultOrBuilder extends MessageLiteOrBuilder {
    String getDeviceId();

    ByteString getDeviceIdBytes();

    String getKey();

    ByteString getKeyBytes();

    String getR1();

    ByteString getR1Bytes();
}
