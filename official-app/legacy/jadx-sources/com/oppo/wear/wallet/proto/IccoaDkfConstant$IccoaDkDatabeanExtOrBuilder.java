package com.oppo.wear.wallet.proto;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: classes9.dex */
public interface IccoaDkfConstant$IccoaDkDatabeanExtOrBuilder extends MessageLiteOrBuilder {
    ByteString getBleBroadcastKey();

    ByteString getBleValue();

    IccoaDkfConstant$CloudConstants_Capability getCloudCap();

    int getCloudCapValue();

    ByteString getDecryptedMacAddressBytes();

    boolean getIsSupportMac();
}
