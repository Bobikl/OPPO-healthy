package com.oplus.ocs.wearengine.proto;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: classes8.dex */
public interface WearEngineProto$WEMessageHeaderOrBuilder extends MessageLiteOrBuilder {
    String getFrom();

    ByteString getFromBytes();

    String getFromSignature();

    ByteString getFromSignatureBytes();

    String getFromSignatureSHA256();

    ByteString getFromSignatureSHA256Bytes();

    int getRequestId();

    String getTo();

    ByteString getToBytes();

    String getToSignature();

    ByteString getToSignatureBytes();

    String getToSignatureSHA256();

    ByteString getToSignatureSHA256Bytes();

    int getVersion();
}
