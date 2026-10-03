package com.oplus.pantaconnect.discovery;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;

/* JADX INFO: loaded from: classes8.dex */
public interface DiscoveredDeviceItemOrBuilder extends MessageOrBuilder {
    int getDeviceType();

    String getDisplayName();

    ByteString getDisplayNameBytes();

    String getModelId();

    ByteString getModelIdBytes();

    String getProtocolDeviceId();

    ByteString getProtocolDeviceIdBytes();

    String getTempId();

    ByteString getTempIdBytes();
}
