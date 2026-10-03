package com.heytap.health.device.protocol.browser;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: classes16.dex */
public interface Browser$LabelOrBuilder extends MessageLiteOrBuilder {
    boolean getDefault();

    String getIcon();

    ByteString getIconBytes();

    int getId();

    String getName();

    ByteString getNameBytes();

    String getUrl();

    ByteString getUrlBytes();
}
