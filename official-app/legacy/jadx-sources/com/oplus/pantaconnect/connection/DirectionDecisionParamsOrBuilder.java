package com.oplus.pantaconnect.connection;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;

/* JADX INFO: loaded from: classes8.dex */
public interface DirectionDecisionParamsOrBuilder extends MessageOrBuilder {
    String getAdvFreq();

    ByteString getAdvFreqBytes();

    String getDeviceId();

    ByteString getDeviceIdBytes();

    String getDeviceKsc();

    ByteString getDeviceKscBytes();

    String getKscAlias();

    ByteString getKscAliasBytes();

    String getMacAddress();

    ByteString getMacAddressBytes();

    String getName();

    ByteString getNameBytes();

    String getPassword();

    ByteString getPasswordBytes();

    String getRemoteIp();

    ByteString getRemoteIpBytes();

    String getSsid();

    ByteString getSsidBytes();

    String getTag();

    ByteString getTagBytes();
}
