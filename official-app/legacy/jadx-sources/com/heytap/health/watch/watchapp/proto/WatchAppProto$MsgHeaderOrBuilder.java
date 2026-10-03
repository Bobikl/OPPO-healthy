package com.heytap.health.watch.watchapp.proto;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: classes19.dex */
public interface WatchAppProto$MsgHeaderOrBuilder extends MessageLiteOrBuilder {
    String getActionAnchor();

    ByteString getActionAnchorBytes();

    String getBodyMd5();

    ByteString getBodyMd5Bytes();

    int getCommandId();

    String getDeviceUniqueId();

    ByteString getDeviceUniqueIdBytes();

    boolean getIsAck();

    int getProtocolVersion();
}
