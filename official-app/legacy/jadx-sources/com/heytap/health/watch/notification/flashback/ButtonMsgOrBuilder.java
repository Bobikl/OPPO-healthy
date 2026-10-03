package com.heytap.health.watch.notification.flashback;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: classes19.dex */
public interface ButtonMsgOrBuilder extends MessageLiteOrBuilder {
    int getButtonId();

    String getButtonText();

    ByteString getButtonTextBytes();

    long getMsgId();
}
