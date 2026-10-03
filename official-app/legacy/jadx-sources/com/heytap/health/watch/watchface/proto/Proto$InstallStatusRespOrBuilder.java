package com.heytap.health.watch.watchface.proto;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: classes19.dex */
public interface Proto$InstallStatusRespOrBuilder extends MessageLiteOrBuilder {
    int getInstallResult();

    String getWfUnique();

    ByteString getWfUniqueBytes();
}
