package com.heytap.health.protocol.dm;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: classes17.dex */
public interface DMProto$WiFiConfigOrBuilder extends MessageLiteOrBuilder {
    String getPwd();

    ByteString getPwdBytes();

    int getSecurityType();

    String getSsid();

    ByteString getSsidBytes();
}
