package com.oppo.wear.wallet.proto;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: classes9.dex */
public interface UserStatement$UserStatementRequestOrBuilder extends MessageLiteOrBuilder {
    String getScene();

    ByteString getSceneBytes();

    boolean getShowAgreement();

    int getTimeout();
}
