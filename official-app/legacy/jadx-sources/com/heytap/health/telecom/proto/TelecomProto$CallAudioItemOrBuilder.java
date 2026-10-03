package com.heytap.health.telecom.proto;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: classes18.dex */
public interface TelecomProto$CallAudioItemOrBuilder extends MessageLiteOrBuilder {
    boolean getIsActiveRoute();

    String getMac();

    ByteString getMacBytes();

    String getName();

    ByteString getNameBytes();

    int getType();
}
