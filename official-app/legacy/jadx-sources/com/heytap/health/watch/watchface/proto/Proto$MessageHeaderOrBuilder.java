package com.heytap.health.watch.watchface.proto;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: classes19.dex */
public interface Proto$MessageHeaderOrBuilder extends MessageLiteOrBuilder {
    String getActionAnchor();

    ByteString getActionAnchorBytes();

    int getCommandId();

    String getDeviceUniqueId();

    ByteString getDeviceUniqueIdBytes();

    int getErrorCode();

    boolean getIsAck();

    int getProtocolVersion();
}
