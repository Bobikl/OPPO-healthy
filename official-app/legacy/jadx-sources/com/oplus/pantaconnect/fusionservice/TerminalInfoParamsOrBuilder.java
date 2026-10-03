package com.oplus.pantaconnect.fusionservice;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;

/* JADX INFO: loaded from: classes8.dex */
public interface TerminalInfoParamsOrBuilder extends MessageOrBuilder {
    ByteString getConnectState();

    String getDeviceAddress();

    ByteString getDeviceAddressBytes();

    String getDeviceId();

    ByteString getDeviceIdBytes();

    String getDeviceName();

    ByteString getDeviceNameBytes();

    int getDeviceType();

    IdentityParams getIdentity();

    IdentityParamsOrBuilder getIdentityOrBuilder();

    String getRssi();

    ByteString getRssiBytes();

    boolean hasIdentity();
}
