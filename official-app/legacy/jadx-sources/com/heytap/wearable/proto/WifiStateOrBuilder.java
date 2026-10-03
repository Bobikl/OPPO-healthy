package com.heytap.wearable.proto;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: classes2.dex */
public interface WifiStateOrBuilder extends MessageLiteOrBuilder {
    int getErrorCode();

    String getErrorMsg();

    ByteString getErrorMsgBytes();

    int getGroupOperatingBand();

    int getGroupOperatingFrequency();

    boolean getP2PState();

    boolean getWifiState();
}
