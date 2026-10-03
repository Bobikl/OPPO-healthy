package com.heytap.health.watch.notification;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: classes19.dex */
public interface KVOrBuilder extends MessageLiteOrBuilder {
    String getKey();

    ByteString getKeyBytes();

    String getValue();

    ByteString getValueBytes();
}
