package com.heytap.wearable.devicemanager.proto;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: classes2.dex */
public interface S1EcdhKey$ShareKeyOrBuilder extends MessageLiteOrBuilder {
    int getMode();

    ByteString getPubKey();

    String getUuid();

    ByteString getUuidBytes();
}
