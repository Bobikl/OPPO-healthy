package com.heytap.health.protocol.dm;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: classes17.dex */
public interface DMProto$OpenSourceAppInfoOrBuilder extends MessageLiteOrBuilder {
    String getName();

    ByteString getNameBytes();

    String getPackage();

    ByteString getPackageBytes();

    String getVersion();

    ByteString getVersionBytes();
}
