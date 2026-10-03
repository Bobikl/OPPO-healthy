package com.heytap.health.protocol.dm;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: classes17.dex */
public interface DMProto$ConnectDeviceInfoOrBuilder extends MessageLiteOrBuilder {
    String getBTVersion();

    ByteString getBTVersionBytes();

    String getBoardId();

    ByteString getBoardIdBytes();

    String getBtName();

    ByteString getBtNameBytes();

    String getDeviceBleMac();

    ByteString getDeviceBleMacBytes();

    String getDeviceBtMac();

    ByteString getDeviceBtMacBytes();

    String getDeviceHardVersion();

    ByteString getDeviceHardVersionBytes();

    String getDeviceImei();

    ByteString getDeviceImeiBytes();

    String getDeviceModel();

    ByteString getDeviceModelBytes();

    String getDeviceName();

    ByteString getDeviceNameBytes();

    String getDeviceOpensourceVersion();

    ByteString getDeviceOpensourceVersionBytes();

    String getDeviceOtaVersion();

    ByteString getDeviceOtaVersionBytes();

    String getDevicePhoneNumber();

    ByteString getDevicePhoneNumberBytes();

    String getDeviceSku();

    ByteString getDeviceSkuBytes();

    String getDeviceSn();

    ByteString getDeviceSnBytes();

    String getDeviceSoftVersion();

    ByteString getDeviceSoftVersionBytes();

    int getDeviceType();

    String getDeviceVersion();

    ByteString getDeviceVersionBytes();

    String getGuid();

    ByteString getGuidBytes();

    int getLinkagePhone();

    String getManufacturer();

    ByteString getManufacturerBytes();

    String getOafModelId();

    ByteString getOafModelIdBytes();

    String getOsVersion();

    ByteString getOsVersionBytes();

    String getProjectId();

    ByteString getProjectIdBytes();

    String getSsoid();

    ByteString getSsoidBytes();
}
