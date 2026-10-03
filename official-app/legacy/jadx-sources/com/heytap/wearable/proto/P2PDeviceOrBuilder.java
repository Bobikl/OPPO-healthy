package com.heytap.wearable.proto;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: classes2.dex */
public interface P2PDeviceOrBuilder extends MessageLiteOrBuilder {
    String getDeviceID();

    ByteString getDeviceIDBytes();

    String getGroup();

    ByteString getGroupBytes();

    int getGroupOperatingFrequency();

    String getMac();

    ByteString getMacBytes();

    String getPwd();

    ByteString getPwdBytes();
}
