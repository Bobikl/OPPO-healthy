package com.heytap.health.protocol.device_breeno;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: classes17.dex */
public interface DeviceBreenoProto$BreenoLocationInfoOrBuilder extends MessageLiteOrBuilder {
    String getAddress();

    ByteString getAddressBytes();

    boolean getCanLocation();

    String getCity();

    ByteString getCityBytes();

    String getDistrict();

    ByteString getDistrictBytes();

    double getLatitude();

    double getLongitude();

    String getProvince();

    ByteString getProvinceBytes();
}
