package com.heytap.health.telecom.proto;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: classes18.dex */
public interface TelecomProto$WatchCallChangeOrBuilder extends MessageLiteOrBuilder {
    String getCallRemoteNumber();

    ByteString getCallRemoteNumberBytes();

    int getChangeStatus();

    boolean getMute();
}
