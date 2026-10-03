package com.heytap.health.owconnect.diagnosis;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: classes17.dex */
public interface Events$ProcessLifeOrBuilder extends MessageLiteOrBuilder {
    String getMsg();

    ByteString getMsgBytes();

    int getPid();

    boolean getStart();

    long getTime();
}
