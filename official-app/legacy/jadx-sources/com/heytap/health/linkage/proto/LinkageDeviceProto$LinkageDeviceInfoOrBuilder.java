package com.heytap.health.linkage.proto;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: classes16.dex */
public interface LinkageDeviceProto$LinkageDeviceInfoOrBuilder extends MessageLiteOrBuilder {
    LinkageDeviceProto$ConnectState getConnectState();

    int getConnectStateValue();

    String getDeviceName();

    ByteString getDeviceNameBytes();

    LinkageDeviceProto$DeviceType getDeviceType();

    int getDeviceTypeValue();

    boolean getIsSupportAudioConnect();

    boolean getIsSupportMultiConnect();

    String getMacAddress();

    ByteString getMacAddressBytes();
}
