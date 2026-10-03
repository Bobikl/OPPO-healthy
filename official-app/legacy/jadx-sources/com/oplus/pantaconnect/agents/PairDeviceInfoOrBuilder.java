package com.oplus.pantaconnect.agents;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;

/* JADX INFO: loaded from: classes8.dex */
public interface PairDeviceInfoOrBuilder extends MessageOrBuilder {
    String getAddress();

    ByteString getAddressBytes();

    ConnectType getConnectorType();

    int getConnectorTypeValue();

    int getDeviceType();

    boolean getIsSenseless();

    String getKscAlias();

    ByteString getKscAliasBytes();

    ByteString getRemoteDeviceId();
}
