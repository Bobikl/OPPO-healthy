package com.heytap.health.protocol.dm;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: classes17.dex */
public interface DMProto$AppItemOrBuilder extends MessageLiteOrBuilder {
    int getId();

    String getName();

    ByteString getNameBytes();

    int getState();
}
