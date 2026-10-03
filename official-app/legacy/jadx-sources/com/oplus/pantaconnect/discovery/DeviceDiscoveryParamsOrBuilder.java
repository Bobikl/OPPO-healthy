package com.oplus.pantaconnect.discovery;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public interface DeviceDiscoveryParamsOrBuilder extends MessageOrBuilder {
    String getClientId();

    ByteString getClientIdBytes();

    int getDeviceType(int i);

    int getDeviceTypeCount();

    List<Integer> getDeviceTypeList();

    InternalDiscoveryStrategy getDiscoveryStrategy();

    int getDiscoveryStrategyValue();

    long getDurationMillis();

    InternalScanMode getScanMode();

    int getScanModeValue();
}
