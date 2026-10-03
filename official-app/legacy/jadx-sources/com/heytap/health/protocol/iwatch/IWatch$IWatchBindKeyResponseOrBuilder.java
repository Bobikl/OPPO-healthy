package com.heytap.health.protocol.iwatch;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: classes17.dex */
public interface IWatch$IWatchBindKeyResponseOrBuilder extends MessageLiteOrBuilder {
    String getSecretBindKey();

    ByteString getSecretBindKeyBytes();
}
