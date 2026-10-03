package com.heytap.health.watch.notification;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: classes19.dex */
public interface ExtendActionOrBuilder extends MessageLiteOrBuilder {
    String getDeeplink();

    ByteString getDeeplinkBytes();

    String getPackage();

    ByteString getPackageBytes();

    long getVersionCode();
}
