package com.heytap.health.watch.notification;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: classes19.dex */
public interface VerifyCodeStyleProtoOrBuilder extends MessageLiteOrBuilder {
    String getBody();

    ByteString getBodyBytes();

    String getUuidKey();

    ByteString getUuidKeyBytes();

    String getVerifyCode();

    ByteString getVerifyCodeBytes();

    ByteString getVerifyCodeEncode();
}
