package com.heytap.wearable.btnet.proto;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: classes2.dex */
public interface HttpDataProtoOrBuilder extends MessageLiteOrBuilder {
    ByteString getBody();

    ByteString getHead();
}
