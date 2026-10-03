package com.oplus.pantaconnect.discovery;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;

/* JADX INFO: loaded from: classes8.dex */
public interface DiscoveredServiceItemOrBuilder extends MessageOrBuilder {
    ByteString getAccountHash();

    int getDeviceType();

    String getDisplayName();

    ByteString getDisplayNameBytes();

    float getDistance();

    String getHostAddress();

    ByteString getHostAddressBytes();

    String getHostName();

    ByteString getHostNameBytes();

    String getProtocolDeviceId();

    ByteString getProtocolDeviceIdBytes();

    int getRoleIntent();

    ByteString getServiceData();
}
