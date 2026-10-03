package com.oplus.pantaconnect.fusionservice;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;

/* JADX INFO: loaded from: classes8.dex */
public interface BindAncsParamOrBuilder extends MessageOrBuilder {
    String getBluetoothMac();

    ByteString getBluetoothMacBytes();

    String getDeviceName();

    ByteString getDeviceNameBytes();

    int getDeviceType();

    String getProtocolDeviceId();

    ByteString getProtocolDeviceIdBytes();
}
