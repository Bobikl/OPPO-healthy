package com.heytap.health.device.protocol.emergency;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: classes16.dex */
public interface SGP$RelationOrBuilder extends MessageLiteOrBuilder {
    long getId();

    String getMobile();

    ByteString getMobileBytes();

    String getName();

    ByteString getNameBytes();

    String getRemark();

    ByteString getRemarkBytes();
}
