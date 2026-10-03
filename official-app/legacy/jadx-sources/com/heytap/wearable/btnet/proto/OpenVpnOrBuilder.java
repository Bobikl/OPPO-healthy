package com.heytap.wearable.btnet.proto;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public interface OpenVpnOrBuilder extends MessageLiteOrBuilder {
    String getDns(int i);

    ByteString getDnsBytes(int i);

    int getDnsCount();

    List<String> getDnsList();

    boolean getEnablevpn();

    int getMtu();

    int getNetworkType();

    String getNetworkTypeName();

    ByteString getNetworkTypeNameBytes();
}
