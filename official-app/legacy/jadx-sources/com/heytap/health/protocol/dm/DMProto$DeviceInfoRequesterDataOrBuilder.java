package com.heytap.health.protocol.dm;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: classes17.dex */
public interface DMProto$DeviceInfoRequesterDataOrBuilder extends MessageLiteOrBuilder {
    String getBTVersion();

    ByteString getBTVersionBytes();

    String getDeviceBtMac();

    ByteString getDeviceBtMacBytes();

    String getDeviceImei();

    ByteString getDeviceImeiBytes();

    String getDeviceModel();

    ByteString getDeviceModelBytes();

    String getDeviceName();

    ByteString getDeviceNameBytes();

    String getDeviceOpensourceVersion();

    ByteString getDeviceOpensourceVersionBytes();

    String getDevicePhoneNumber();

    ByteString getDevicePhoneNumberBytes();

    String getDeviceSn();

    ByteString getDeviceSnBytes();

    String getDeviceSoftVersion();

    ByteString getDeviceSoftVersionBytes();

    int getDeviceType();

    String getDeviceVersion();

    ByteString getDeviceVersionBytes();

    int getLinkagePhone();
}
