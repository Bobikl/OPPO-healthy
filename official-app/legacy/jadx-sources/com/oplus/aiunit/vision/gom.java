package com.oplus.aiunit.vision;

import com.google.protobuf.Descriptors;
import com.google.protobuf.GeneratedMessageV3;

/* JADX INFO: loaded from: classes12.dex */
public final class gom {
    public static final Descriptors.Descriptor a;
    public static final GeneratedMessageV3.FieldAccessorTable b;
    public static final GeneratedMessageV3.FieldAccessorTable blueberry;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Descriptors.FileDescriptor f11833c;

    /* JADX INFO: renamed from: coconut, reason: collision with root package name */
    public static final Descriptors.Descriptor f11834coconut;
    public static final Descriptors.Descriptor cranberry;

    /* JADX INFO: renamed from: jackFruit, reason: collision with root package name */
    public static final GeneratedMessageV3.FieldAccessorTable f11835jackFruit;
    public static final GeneratedMessageV3.FieldAccessorTable kiwifruit;
    public static final Descriptors.Descriptor mango;
    public static final Descriptors.Descriptor pineapple;
    public static final GeneratedMessageV3.FieldAccessorTable pitaya;
    public static final Descriptors.Descriptor prunes;
    public static final GeneratedMessageV3.FieldAccessorTable raspberry;

    static {
        Descriptors.FileDescriptor fileDescriptorInternalBuildGeneratedFileFrom = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u000fdiscovery.proto\u0012 com.oplus.pantaconnect.discovery\"Ä\u0004\n\u0017GlobalAdvertisingParams\u0012\u0010\n\bclientId\u0018\u0001 \u0001(\t\u0012\u0016\n\u000edurationMillis\u0018\u0002 \u0001(\u0003\u0012\u000f\n\u0007modelId\u0018\u0003 \u0001(\t\u0012\u0012\n\ndeviceType\u0018\u0004 \u0001(\u0005\u0012\u0013\n\u000bconnectType\u0018\u0005 \u0001(\u0005\u0012T\n\radvertiseType\u0018\u0006 \u0001(\u000e2=.com.oplus.pantaconnect.discovery.InternalGlobalAdvertiseType\u0012\u000e\n\u0006isHide\u0018\u0007 \u0001(\b\u0012\u0012\n\nisGattSlow\u0018\b \u0001(\b\u0012T\n\rreconnectType\u0018\t \u0001(\u000e2=.com.oplus.pantaconnect.discovery.InternalGlobalReconnectType\u0012T\n\radvertiseMode\u0018\n \u0001(\u000e2=.com.oplus.pantaconnect.discovery.InternalGlobalAdvertiseMode\u0012\\\n\u0011discoveryStrategy\u0018\u000b \u0001(\u000e2A.com.oplus.pantaconnect.discovery.InternalGlobalDiscoveryStrategy\u0012\u0019\n\u0011isOnlyPairConnect\u0018\f \u0001(\b\u0012\u0019\n\u0011reconnectDeviceId\u0018\r \u0003(\t\u0012\u000b\n\u0003pid\u0018\u000e \u0001(\t\"ÿ\u0001\n\u0015GlobalDiscoveryParams\u0012\u0010\n\bclientId\u0018\u0001 \u0001(\t\u0012\\\n\u0011discoveryStrategy\u0018\u0002 \u0001(\u000e2A.com.oplus.pantaconnect.discovery.InternalGlobalDiscoveryStrategy\u0012\u0012\n\ndeviceType\u0018\u0003 \u0003(\u0005\u0012J\n\bscanMode\u0018\u0004 \u0001(\u000e28.com.oplus.pantaconnect.discovery.InternalGlobalScanMode\u0012\u0016\n\u000edurationMillis\u0018\u0005 \u0001(\u0003\"\u0088\u0004\n\u0011DisplayDeviceItem\u0012\u0012\n\ndeviceType\u0018\u0001 \u0001(\u0005\u0012\u0018\n\u0010protocolDeviceId\u0018\u0002 \u0001(\t\u0012\u0013\n\u000bdisplayName\u0018\u0003 \u0001(\t\u0012\u000e\n\u0006tempId\u0018\u0004 \u0001(\t\u0012J\n\u000bdeviceState\u0018\u0005 \u0001(\u000e25.com.oplus.pantaconnect.discovery.InternalDeviceState\u0012L\n\faccountState\u0018\u0006 \u0001(\u000e26.com.oplus.pantaconnect.discovery.InternalAccountState\u0012\u001b\n\u0013isSenselessSwitchOn\u0018\u0007 \u0001(\b\u0012\u0017\n\u000fprotocolVersion\u0018\b \u0001(\u0005\u0012\u0016\n\u000econnectedTypes\u0018\t \u0003(\u0005\u0012\u000f\n\u0007ability\u0018\n \u0001(\u0005\u0012\u000f\n\u0007modelId\u0018\u000b \u0001(\t\u0012\\\n\u0011discoveryStrategy\u0018\f \u0001(\u000e2A.com.oplus.pantaconnect.discovery.InternalGlobalDiscoveryStrategy\u0012\u0010\n\bdeviceIp\u0018\r \u0001(\t\u0012\u0011\n\tvLinkType\u0018\u000e \u0001(\u0005\u0012\u0013\n\u000busedLocalIp\u0018\u000f \u0001(\t\"k\n\u0015DisplayDeviceItemList\u0012R\n\u0015displayDeviceItemList\u0018\u0001 \u0003(\u000b23.com.oplus.pantaconnect.discovery.DisplayDeviceItem\"Y\n\u001bEnableDiscoverabilityParams\u0012\u0012\n\ndeviceType\u0018\u0001 \u0001(\u0005\u0012\u000e\n\u0006enable\u0018\u0002 \u0001(\b\u0012\u0016\n\u000edurationMillis\u0018\u0003 \u0001(\u0003\"*\n\u000fProbeDeviceList\u0012\u0017\n\u000fprobeDeviceList\u0018\u0001 \u0003(\f*d\n\u0016InternalGlobalScanMode\u0012\u0017\n\u0013SCAN_MODE_LOW_POWER\u0010\u0000\u0012\u0016\n\u0012SCAN_MODE_BALANCED\u0010\u0001\u0012\u0019\n\u0015SCAN_MODE_LOW_LATENCY\u0010\u0002*K\n\u001bInternalGlobalAdvertiseMode\u0012\r\n\tLOW_POWER\u0010\u0000\u0012\f\n\bBALANCED\u0010\u0001\u0012\u000f\n\u000bLOW_LATENCY\u0010\u0002*t\n\u001fInternalGlobalDiscoveryStrategy\u0012\u0007\n\u0003BLE\u0010\u0000\u0012\u0007\n\u0003NSD\u0010\u0001\u0012\u0011\n\rBASED_CONNECT\u0010\u0002\u0012\u0007\n\u0003RTC\u0010\u0003\u0012\b\n\u0004AUTO\u0010\u0004\u0012\u0007\n\u0003LAN\u0010\u0005\u0012\u0007\n\u0003NFC\u0010\u0006\u0012\u0007\n\u0003USB\u0010\u0007*}\n\u001bInternalGlobalAdvertiseType\u0012\u0016\n\u0012DISCOVERY_MODEL_ID\u0010\u0000\u0012\u0016\n\u0012FAST_PAIR_MODEL_ID\u0010\u0001\u0012\u0015\n\u0011FAST_PAIR_ACCOUNT\u0010\u0002\u0012\u0017\n\u0013FAST_PAIR_DEVICE_ID\u0010\u0003*\u0089\u0001\n\u001bInternalGlobalReconnectType\u0012\u000e\n\nDIALOG_ALL\u0010\u0000\u0012\u0011\n\rDIALOG_RECENT\u0010\u0001\u0012\u000e\n\nSILENT_ALL\u0010\u0002\u0012\u0011\n\rSILENT_RECENT\u0010\u0003\u0012\u0011\n\rDIALOG_CUSTOM\u0010\u0004\u0012\u0011\n\rSILENT_CUSTOM\u0010\u0005*P\n\u0013InternalDeviceState\u0012\u000e\n\nDISCOVERED\u0010\u0000\u0012\r\n\tCONNECTED\u0010\u0001\u0012\u0010\n\fDISCONNECTED\u0010\u0002\u0012\b\n\u0004LOST\u0010\u0003*O\n\u0014InternalAccountState\u0012\u000e\n\nNO_ACCOUNT\u0010\u0000\u0012\u0015\n\u0011DIFFERENT_ACCOUNT\u0010\u0001\u0012\u0010\n\fSAME_ACCOUNT\u0010\u0002B\u0002P\u0001b\u0006proto3"}, new Descriptors.FileDescriptor[0]);
        f11833c = fileDescriptorInternalBuildGeneratedFileFrom;
        Descriptors.Descriptor descriptor = fileDescriptorInternalBuildGeneratedFileFrom.getMessageTypes().get(0);
        f11834coconut = descriptor;
        f11835jackFruit = new GeneratedMessageV3.FieldAccessorTable(descriptor, new String[]{"ClientId", "DurationMillis", "ModelId", "DeviceType", "ConnectType", "AdvertiseType", "IsHide", "IsGattSlow", "ReconnectType", "AdvertiseMode", "DiscoveryStrategy", "IsOnlyPairConnect", "ReconnectDeviceId", "Pid"});
        Descriptors.Descriptor descriptor2 = fileDescriptorInternalBuildGeneratedFileFrom.getMessageTypes().get(1);
        prunes = descriptor2;
        blueberry = new GeneratedMessageV3.FieldAccessorTable(descriptor2, new String[]{"ClientId", "DiscoveryStrategy", "DeviceType", "ScanMode", "DurationMillis"});
        Descriptors.Descriptor descriptor3 = fileDescriptorInternalBuildGeneratedFileFrom.getMessageTypes().get(2);
        cranberry = descriptor3;
        raspberry = new GeneratedMessageV3.FieldAccessorTable(descriptor3, new String[]{"DeviceType", "ProtocolDeviceId", "DisplayName", "TempId", "DeviceState", "AccountState", "IsSenselessSwitchOn", "ProtocolVersion", "ConnectedTypes", "Ability", "ModelId", "DiscoveryStrategy", "DeviceIp", "VLinkType", "UsedLocalIp"});
        Descriptors.Descriptor descriptor4 = fileDescriptorInternalBuildGeneratedFileFrom.getMessageTypes().get(3);
        mango = descriptor4;
        pitaya = new GeneratedMessageV3.FieldAccessorTable(descriptor4, new String[]{"DisplayDeviceItemList"});
        Descriptors.Descriptor descriptor5 = fileDescriptorInternalBuildGeneratedFileFrom.getMessageTypes().get(4);
        pineapple = descriptor5;
        kiwifruit = new GeneratedMessageV3.FieldAccessorTable(descriptor5, new String[]{"DeviceType", "Enable", "DurationMillis"});
        Descriptors.Descriptor descriptor6 = fileDescriptorInternalBuildGeneratedFileFrom.getMessageTypes().get(5);
        a = descriptor6;
        b = new GeneratedMessageV3.FieldAccessorTable(descriptor6, new String[]{"ProbeDeviceList"});
    }
}
