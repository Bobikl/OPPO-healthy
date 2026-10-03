package com.heytap.health.watch.notification;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: classes19.dex */
public interface ExtendPushOrBuilder extends MessageLiteOrBuilder {
    String getMockPackageName();

    ByteString getMockPackageNameBytes();

    boolean getPush();

    long getShowAtTime();

    long getShowDuration();

    boolean getTransparent();

    int getTransparentAction();
}
