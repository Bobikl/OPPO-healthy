package com.oplus.pantaconnect.devicemgr;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;

/* JADX INFO: loaded from: classes8.dex */
public interface SpecOrBuilder extends MessageOrBuilder {
    String getAndroidVersion();

    ByteString getAndroidVersionBytes();

    String getBatteryCapacity();

    ByteString getBatteryCapacityBytes();

    String getBrand();

    ByteString getBrandBytes();

    String getBtMac();

    ByteString getBtMacBytes();

    String getCpuName();

    ByteString getCpuNameBytes();

    String getDeviceName();

    ByteString getDeviceNameBytes();

    String getMarketName();

    ByteString getMarketNameBytes();

    String getOaid();

    ByteString getOaidBytes();

    String getOsVersion();

    ByteString getOsVersionBytes();

    String getRamSpec();

    ByteString getRamSpecBytes();

    String getRegion();

    ByteString getRegionBytes();

    String getResolution();

    ByteString getResolutionBytes();

    String getRomSpec();

    ByteString getRomSpecBytes();

    String getScreenDpi();

    ByteString getScreenDpiBytes();
}
