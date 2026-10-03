package com.heytap.health.watch.notification;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: classes19.dex */
public interface TemplateIconProcessOrBuilder extends MessageLiteOrBuilder {
    int getCurrentProcess();

    ByteString getIcon();

    int getTotalProcess();
}
