package com.heytap.health.protocol.iwatch;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: classes17.dex */
public interface IWatch$IWatchDeviceInfoResponseOrBuilder extends MessageLiteOrBuilder {
    String getDeviceModel();

    ByteString getDeviceModelBytes();

    String getDeviceOsVersion();

    ByteString getDeviceOsVersionBytes();

    String getDeviceSku();

    ByteString getDeviceSkuBytes();

    String getDeviceSoftVersion();

    ByteString getDeviceSoftVersionBytes();

    int getDeviceType();

    String getDeviceUniqueId();

    ByteString getDeviceUniqueIdBytes();
}
