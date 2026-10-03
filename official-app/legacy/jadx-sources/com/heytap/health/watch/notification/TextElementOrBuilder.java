package com.heytap.health.watch.notification;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: classes19.dex */
public interface TextElementOrBuilder extends MessageLiteOrBuilder {
    int getColor();

    long getCountDownTarget();

    String getLevel();

    ByteString getLevelBytes();

    boolean getStartText();

    int getStep();

    String getText();

    ByteString getTextBytes();
}
