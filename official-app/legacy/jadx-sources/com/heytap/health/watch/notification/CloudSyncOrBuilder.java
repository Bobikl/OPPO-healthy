package com.heytap.health.watch.notification;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: classes19.dex */
public interface CloudSyncOrBuilder extends MessageLiteOrBuilder {
    boolean getHasKey();

    String getKeyUuid();

    ByteString getKeyUuidBytes();

    boolean getStatus();
}
