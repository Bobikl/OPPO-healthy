package com.oplus.pantaconnect.discovery;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public interface DeviceAdvertisingParamsOrBuilder extends MessageOrBuilder {
    InternalAdvertiseMode getAdvertiseMode();

    int getAdvertiseModeValue();

    InternalAdvertiseType getAdvertiseType();

    int getAdvertiseTypeValue();

    String getClientId();

    ByteString getClientIdBytes();

    int getConnectType();

    int getDeviceType();

    InternalDiscoveryStrategy getDiscoveryStrategy();

    int getDiscoveryStrategyValue();

    long getDurationMillis();

    boolean getIsGattSlow();

    boolean getIsHide();

    boolean getIsOnlyPairConnect();

    String getModelId();

    ByteString getModelIdBytes();

    String getPid();

    ByteString getPidBytes();

    String getReconnectDeviceId(int i);

    ByteString getReconnectDeviceIdBytes(int i);

    int getReconnectDeviceIdCount();

    List<String> getReconnectDeviceIdList();

    InternalReconnectType getReconnectType();

    int getReconnectTypeValue();
}
