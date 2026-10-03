package com.heytap.health.watch.watchface.proto;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: classes19.dex */
public interface Proto$LocationEventOrBuilder extends MessageLiteOrBuilder {
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
