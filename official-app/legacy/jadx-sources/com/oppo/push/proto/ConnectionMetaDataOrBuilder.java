package com.oppo.push.proto;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;

/* JADX INFO: loaded from: classes9.dex */
public interface ConnectionMetaDataOrBuilder extends MessageOrBuilder {
    String getCity();

    ByteString getCityBytes();

    String getDistrict();

    ByteString getDistrictBytes();

    String getDuid();

    ByteString getDuidBytes();

    boolean getIsReset();

    String getLocationX();

    ByteString getLocationXBytes();

    String getLocationY();

    ByteString getLocationYBytes();

    String getMcsVersion();

    ByteString getMcsVersionBytes();

    String getModel();

    ByteString getModelBytes();

    String getNetworkType();

    ByteString getNetworkTypeBytes();

    String getOuid();

    ByteString getOuidBytes();

    String getProvince();

    ByteString getProvinceBytes();

    String getRegionCode();

    ByteString getRegionCodeBytes();

    String getResetTime();

    ByteString getResetTimeBytes();

    String getTimezoneCode();

    ByteString getTimezoneCodeBytes();

    String getWifiSsid();

    ByteString getWifiSsidBytes();

    boolean hasCity();

    boolean hasDistrict();

    boolean hasDuid();

    boolean hasIsReset();

    boolean hasLocationX();

    boolean hasLocationY();

    boolean hasMcsVersion();

    boolean hasModel();

    boolean hasNetworkType();

    boolean hasOuid();

    boolean hasProvince();

    boolean hasRegionCode();

    boolean hasResetTime();

    boolean hasTimezoneCode();

    boolean hasWifiSsid();
}
