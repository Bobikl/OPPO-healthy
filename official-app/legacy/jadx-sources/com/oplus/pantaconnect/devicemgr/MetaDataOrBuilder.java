package com.oplus.pantaconnect.devicemgr;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;

/* JADX INFO: loaded from: classes8.dex */
public interface MetaDataOrBuilder extends MessageOrBuilder {
    String getDeviceId();

    ByteString getDeviceIdBytes();

    String getDeviceModel();

    ByteString getDeviceModelBytes();

    String getProtocolDeviceId();

    ByteString getProtocolDeviceIdBytes();
}
