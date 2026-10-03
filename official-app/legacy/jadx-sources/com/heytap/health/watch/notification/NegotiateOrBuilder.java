package com.heytap.health.watch.notification;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: classes19.dex */
public interface NegotiateOrBuilder extends MessageLiteOrBuilder {
    int getMode();

    ByteString getPubKey();

    String getUuid();

    ByteString getUuidBytes();
}
