package com.heytap.health.protocol.dm;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: classes17.dex */
public interface DMProto$PackageOrBuilder extends MessageLiteOrBuilder {
    String getAction();

    ByteString getActionBytes();

    String getPackageName();

    ByteString getPackageNameBytes();
}
