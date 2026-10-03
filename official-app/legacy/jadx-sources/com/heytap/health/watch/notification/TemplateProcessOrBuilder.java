package com.heytap.health.watch.notification;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: classes19.dex */
public interface TemplateProcessOrBuilder extends MessageLiteOrBuilder {
    String getContent();

    ByteString getContentBytes();

    int getCurrentProcess();

    String getTitle();

    ByteString getTitleBytes();

    int getTotalProcess();
}
