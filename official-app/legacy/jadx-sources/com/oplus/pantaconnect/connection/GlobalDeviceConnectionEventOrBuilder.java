package com.oplus.pantaconnect.connection;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;

/* JADX INFO: loaded from: classes8.dex */
public interface GlobalDeviceConnectionEventOrBuilder extends MessageOrBuilder {
    ByteString getDisplayDevice();

    ByteString getExtra();

    ByteString getResult();

    GlobalDeviceConnectionEvent.EventType getType();

    int getTypeValue();
}
