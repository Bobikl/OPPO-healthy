package com.heytap.health.watch.watchface.proto;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: classes19.dex */
public interface Proto$WfPayInfoOrBuilder extends MessageLiteOrBuilder {
    String getPayStatus();

    ByteString getPayStatusBytes();

    String getSecretKey();

    ByteString getSecretKeyBytes();
}
