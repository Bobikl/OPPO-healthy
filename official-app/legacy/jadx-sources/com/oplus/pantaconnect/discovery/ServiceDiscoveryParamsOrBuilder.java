package com.oplus.pantaconnect.discovery;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;

/* JADX INFO: loaded from: classes8.dex */
public interface ServiceDiscoveryParamsOrBuilder extends MessageOrBuilder {
    InternalDiscoveryStrategy getDiscoveryStrategy();

    int getDiscoveryStrategyValue();

    InternalServiceFilter getServiceFilter();

    int getServiceFilterValue();

    String getServiceName();

    ByteString getServiceNameBytes();
}
