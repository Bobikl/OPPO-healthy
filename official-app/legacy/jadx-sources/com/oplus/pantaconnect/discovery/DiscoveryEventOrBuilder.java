package com.oplus.pantaconnect.discovery;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;

/* JADX INFO: loaded from: classes8.dex */
public interface DiscoveryEventOrBuilder extends MessageOrBuilder {
    ByteString getData();

    DiscoveryEvent.EventType getType();

    int getTypeValue();
}
