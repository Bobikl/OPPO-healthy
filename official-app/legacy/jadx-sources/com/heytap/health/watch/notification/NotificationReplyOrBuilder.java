package com.heytap.health.watch.notification;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: classes19.dex */
public interface NotificationReplyOrBuilder extends MessageLiteOrBuilder {
    String getReplyText();

    ByteString getReplyTextBytes();

    String getStrKey();

    ByteString getStrKeyBytes();
}
