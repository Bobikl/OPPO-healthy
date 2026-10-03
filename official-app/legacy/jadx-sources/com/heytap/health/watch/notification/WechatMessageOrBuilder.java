package com.heytap.health.watch.notification;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: classes19.dex */
public interface WechatMessageOrBuilder extends MessageLiteOrBuilder {
    boolean getCanSlideOut();

    String getContent();

    ByteString getContentBytes();

    Extend getExt();

    String getTitle();

    ByteString getTitleBytes();

    int getVibrateDuration();

    boolean hasExt();
}
