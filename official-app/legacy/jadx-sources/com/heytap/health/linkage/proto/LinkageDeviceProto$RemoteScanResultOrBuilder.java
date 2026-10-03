package com.heytap.health.linkage.proto;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: classes16.dex */
public interface LinkageDeviceProto$RemoteScanResultOrBuilder extends MessageLiteOrBuilder {
    LinkageDeviceProto$PeerDevice getDevice();

    String getHostDeviceId();

    ByteString getHostDeviceIdBytes();

    String getMac();

    ByteString getMacBytes();

    boolean getSupportMultiConnect();

    boolean hasDevice();
}
