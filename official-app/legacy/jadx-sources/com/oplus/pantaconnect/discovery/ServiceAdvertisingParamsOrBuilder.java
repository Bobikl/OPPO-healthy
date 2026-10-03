package com.oplus.pantaconnect.discovery;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;

/* JADX INFO: loaded from: classes8.dex */
public interface ServiceAdvertisingParamsOrBuilder extends MessageOrBuilder {
    InternalDiscoverableDeviceType getDiscoverableDeviceType();

    int getDiscoverableDeviceTypeValue();

    InternalDiscoverableServiceUserType getDiscoverableServiceUserType();

    int getDiscoverableServiceUserTypeValue();

    InternalDiscoveryStrategy getDiscoveryStrategy();

    int getDiscoveryStrategyValue();

    ByteString getServiceData();

    String getServiceName();

    ByteString getServiceNameBytes();
}
