package com.heytap.health.protocol.file;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: classes17.dex */
public interface FileProto$FileRequestOrBuilder extends MessageLiteOrBuilder {
    String getName();

    ByteString getNameBytes();

    int getServiceId();

    int getState();

    String getUri();

    ByteString getUriBytes();
}
