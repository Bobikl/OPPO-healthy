package com.oppo.wear.wallet.proto;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: classes9.dex */
public interface SwipeIndexConfigProto$SwipeIndexConfigOrBuilder extends MessageLiteOrBuilder {
    String getAid();

    ByteString getAidBytes();

    String getAppCode();

    ByteString getAppCodeBytes();

    int getCurrentIndex();

    int getState();

    int getSumIndex();
}
