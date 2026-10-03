package com.oplus.pantaconnect.connection;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;

/* JADX INFO: loaded from: classes8.dex */
public interface GlobalDeviceConnectParamsOrBuilder extends MessageOrBuilder {
    int getChannelType();

    int getConnectType();

    DirectionDecisionParams getDirectDecision();

    DirectionDecisionParamsOrBuilder getDirectDecisionOrBuilder();

    ByteString getDisplayDevice();

    ConnectExtensionArgs getExtra();

    ConnectExtensionArgsOrBuilder getExtraOrBuilder();

    boolean hasDirectDecision();

    boolean hasExtra();
}
