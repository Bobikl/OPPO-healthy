package com.heytap.health.watch.notification;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: classes19.dex */
public interface NotificationRemovedOrBuilder extends MessageLiteOrBuilder {
    int getIntId();

    boolean getIsRemoveAll();

    String getStrKey();

    ByteString getStrKeyBytes();

    String getStrPackageName();

    ByteString getStrPackageNameBytes();

    String getStrTag();

    ByteString getStrTagBytes();
}
