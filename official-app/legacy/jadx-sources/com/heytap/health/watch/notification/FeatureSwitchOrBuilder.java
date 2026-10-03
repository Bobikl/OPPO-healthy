package com.heytap.health.watch.notification;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: classes19.dex */
public interface FeatureSwitchOrBuilder extends MessageLiteOrBuilder {
    boolean getStatus();

    String getSubDomain();

    ByteString getSubDomainBytes();
}
