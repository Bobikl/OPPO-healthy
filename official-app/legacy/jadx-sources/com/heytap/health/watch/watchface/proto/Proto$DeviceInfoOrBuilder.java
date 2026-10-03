package com.heytap.health.watch.watchface.proto;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: classes19.dex */
public interface Proto$DeviceInfoOrBuilder extends MessageLiteOrBuilder {
    float getDensity();

    int getDeviceAppVersion();

    String getDeviceCategory();

    ByteString getDeviceCategoryBytes();

    String getDeviceMac();

    ByteString getDeviceMacBytes();

    String getDeviceSn();

    ByteString getDeviceSnBytes();

    String getDeviceUniqueId();

    ByteString getDeviceUniqueIdBytes();

    String getFirmwareVersion();

    ByteString getFirmwareVersionBytes();

    String getHardwareVersion();

    ByteString getHardwareVersionBytes();

    String getModel();

    ByteString getModelBytes();

    String getModelName();

    ByteString getModelNameBytes();

    float getScaledDensity();

    int getScreenHeight();

    int getScreenRadius();

    Proto$ScreenType getScreenType();

    int getScreenTypeValue();

    int getScreenWidth();

    String getSecretKey();

    ByteString getSecretKeyBytes();

    String getSku();

    ByteString getSkuBytes();

    String getSkuName();

    ByteString getSkuNameBytes();
}
