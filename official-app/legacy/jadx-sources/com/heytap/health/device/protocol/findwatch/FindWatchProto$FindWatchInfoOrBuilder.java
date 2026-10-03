package com.heytap.health.device.protocol.findwatch;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: classes16.dex */
public interface FindWatchProto$FindWatchInfoOrBuilder extends MessageLiteOrBuilder {
    int getAction();

    int getStatus();

    String getTicket();

    ByteString getTicketBytes();
}
