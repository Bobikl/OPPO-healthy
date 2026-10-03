package com.heytap.health.watch.notification;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: classes19.dex */
public interface BleNotificationReplyOrBuilder extends MessageLiteOrBuilder {
    int getIntId();

    int getIntType();

    String getReplyText();

    ByteString getReplyTextBytes();

    String getStrKey();

    ByteString getStrKeyBytes();

    String getStrPackageName();

    ByteString getStrPackageNameBytes();

    String getStrTag();

    ByteString getStrTagBytes();
}
