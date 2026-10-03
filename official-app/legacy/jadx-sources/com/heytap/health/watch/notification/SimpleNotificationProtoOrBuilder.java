package com.heytap.health.watch.notification;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: classes19.dex */
public interface SimpleNotificationProtoOrBuilder extends MessageLiteOrBuilder {
    int getId();

    String getKey();

    ByteString getKeyBytes();

    String getPkgName();

    ByteString getPkgNameBytes();

    long getPostTime();

    String getTag();

    ByteString getTagBytes();
}
