package com.oplus.pantaconnect.fusionservice;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;
import com.oplus.pantaconnect.agents.StrategyType;

/* JADX INFO: loaded from: classes8.dex */
public interface ServiceNodeParamsOrBuilder extends MessageOrBuilder {
    StrategyType getDiscoveryType();

    int getDiscoveryTypeValue();

    String getServiceId();

    ByteString getServiceIdBytes();

    ServiceInfoParams getServiceInfo();

    ServiceInfoParamsOrBuilder getServiceInfoOrBuilder();

    TerminalInfoParams getTerminalInfo();

    TerminalInfoParamsOrBuilder getTerminalInfoOrBuilder();

    boolean hasServiceInfo();

    boolean hasTerminalInfo();
}
