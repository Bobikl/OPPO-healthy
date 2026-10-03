package com.heytap.health.linkage.proto;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: classes16.dex */
public interface LinkageDeviceProto$AccountDeviceInfoOrBuilder extends MessageLiteOrBuilder {
    String getAccountKey();

    ByteString getAccountKeyBytes();

    LinkageDeviceProto$BondStatus getBoundStatus();

    int getBoundStatusValue();

    String getColorId();

    ByteString getColorIdBytes();

    String getDeviceId();

    ByteString getDeviceIdBytes();

    String getDeviceName();

    ByteString getDeviceNameBytes();

    LinkageDeviceProto$DeviceType getDeviceType();

    int getDeviceTypeValue();

    int getFeature();

    int getLinkageVersion();

    String getMac();

    ByteString getMacBytes();

    String getProductId();

    ByteString getProductIdBytes();

    String getServerDeviceId();

    ByteString getServerDeviceIdBytes();

    String getSsoid();

    ByteString getSsoidBytes();

    long getTimestamp();
}
