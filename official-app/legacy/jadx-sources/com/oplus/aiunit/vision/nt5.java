package com.oplus.aiunit.vision;

import com.google.protobuf.Descriptors;
import com.google.protobuf.GeneratedMessageV3;

/* JADX INFO: loaded from: classes8.dex */
public final class nt5 {
    public static final Descriptors.Descriptor a;
    public static final GeneratedMessageV3.FieldAccessorTable b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Descriptors.Descriptor f14628c;
    public static final GeneratedMessageV3.FieldAccessorTable d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Descriptors.Descriptor f14629e;
    public static final GeneratedMessageV3.FieldAccessorTable f;
    public static final Descriptors.Descriptor g;
    public static final GeneratedMessageV3.FieldAccessorTable h;
    public static final Descriptors.Descriptor i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final GeneratedMessageV3.FieldAccessorTable f14630j;
    public static final Descriptors.Descriptor k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final GeneratedMessageV3.FieldAccessorTable f14631l;
    public static final Descriptors.Descriptor m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final GeneratedMessageV3.FieldAccessorTable f14632n;
    public static Descriptors.FileDescriptor o = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u0011discoveries.proto\u0012 com.oplus.pantaconnect.discovery\"\u0087\u0001\n\u000eDiscoveryEvent\u0012H\n\u0004type\u0018\u0001 \u0001(\u000e2:.com.oplus.pantaconnect.discovery.DiscoveryEvent.EventType\u0012\f\n\u0004data\u0018\u0002 \u0001(\f\"\u001d\n\tEventType\u0012\u0010\n\fDEVICE_FOUND\u0010\u0000\"¬\u0004\n\u0017DeviceAdvertisingParams\u0012\u0010\n\bclientId\u0018\u0001 \u0001(\t\u0012\u0016\n\u000edurationMillis\u0018\u0002 \u0001(\u0003\u0012\u000f\n\u0007modelId\u0018\u0003 \u0001(\t\u0012\u0012\n\ndeviceType\u0018\u0004 \u0001(\u0005\u0012\u0013\n\u000bconnectType\u0018\u0005 \u0001(\u0005\u0012N\n\radvertiseType\u0018\u0006 \u0001(\u000e27.com.oplus.pantaconnect.discovery.InternalAdvertiseType\u0012\u000e\n\u0006isHide\u0018\u0007 \u0001(\b\u0012\u0012\n\nisGattSlow\u0018\b \u0001(\b\u0012N\n\rreconnectType\u0018\t \u0001(\u000e27.com.oplus.pantaconnect.discovery.InternalReconnectType\u0012N\n\radvertiseMode\u0018\n \u0001(\u000e27.com.oplus.pantaconnect.discovery.InternalAdvertiseMode\u0012V\n\u0011discoveryStrategy\u0018\u000b \u0001(\u000e2;.com.oplus.pantaconnect.discovery.InternalDiscoveryStrategy\u0012\u0019\n\u0011isOnlyPairConnect\u0018\f \u0001(\b\u0012\u0019\n\u0011reconnectDeviceId\u0018\r \u0003(\t\u0012\u000b\n\u0003pid\u0018\u000e \u0001(\t\"ó\u0001\n\u0015DeviceDiscoveryParams\u0012\u0010\n\bclientId\u0018\u0001 \u0001(\t\u0012V\n\u0011discoveryStrategy\u0018\u0002 \u0001(\u000e2;.com.oplus.pantaconnect.discovery.InternalDiscoveryStrategy\u0012\u0012\n\ndeviceType\u0018\u0003 \u0003(\u0005\u0012D\n\bscanMode\u0018\u0004 \u0001(\u000e22.com.oplus.pantaconnect.discovery.InternalScanMode\u0012\u0016\n\u000edurationMillis\u0018\u0005 \u0001(\u0003\"z\n\u0014DiscoveredDeviceItem\u0012\u0012\n\ndeviceType\u0018\u0001 \u0001(\u0005\u0012\u0018\n\u0010protocolDeviceId\u0018\u0002 \u0001(\t\u0012\u0013\n\u000bdisplayName\u0018\u0003 \u0001(\t\u0012\u000e\n\u0006tempId\u0018\u0004 \u0001(\t\u0012\u000f\n\u0007modelId\u0018\u0005 \u0001(\t\"ê\u0002\n\u0018ServiceAdvertisingParams\u0012\u0013\n\u000bserviceName\u0018\u0001 \u0001(\t\u0012V\n\u0011discoveryStrategy\u0018\u0002 \u0001(\u000e2;.com.oplus.pantaconnect.discovery.InternalDiscoveryStrategy\u0012`\n\u0016discoverableDeviceType\u0018\u0003 \u0001(\u000e2@.com.oplus.pantaconnect.discovery.InternalDiscoverableDeviceType\u0012j\n\u001bdiscoverableServiceUserType\u0018\u0004 \u0001(\u000e2E.com.oplus.pantaconnect.discovery.InternalDiscoverableServiceUserType\u0012\u0013\n\u000bserviceData\u0018\u0005 \u0001(\f\"Õ\u0001\n\u0016ServiceDiscoveryParams\u0012\u0013\n\u000bserviceName\u0018\u0001 \u0001(\t\u0012V\n\u0011discoveryStrategy\u0018\u0002 \u0001(\u000e2;.com.oplus.pantaconnect.discovery.InternalDiscoveryStrategy\u0012N\n\rserviceFilter\u0018\u0003 \u0001(\u000e27.com.oplus.pantaconnect.discovery.InternalServiceFilter\"Ñ\u0001\n\u0015DiscoveredServiceItem\u0012\u0018\n\u0010protocolDeviceId\u0018\u0001 \u0001(\t\u0012\u0012\n\ndeviceType\u0018\u0002 \u0001(\u0005\u0012\u0013\n\u000baccountHash\u0018\u0003 \u0001(\f\u0012\u0013\n\u000bhostAddress\u0018\u0004 \u0001(\t\u0012\u0013\n\u000bdisplayName\u0018\u0005 \u0001(\t\u0012\u0010\n\bhostName\u0018\u0006 \u0001(\t\u0012\u0013\n\u000bserviceData\u0018\u0007 \u0001(\f\u0012\u0010\n\bdistance\u0018\b \u0001(\u0002\u0012\u0012\n\nroleIntent\u0018\t \u0001(\u0005*^\n\u0010InternalScanMode\u0012\u0017\n\u0013SCAN_MODE_LOW_POWER\u0010\u0000\u0012\u0016\n\u0012SCAN_MODE_BALANCED\u0010\u0001\u0012\u0019\n\u0015SCAN_MODE_LOW_LATENCY\u0010\u0002*E\n\u0015InternalAdvertiseMode\u0012\r\n\tLOW_POWER\u0010\u0000\u0012\f\n\bBALANCED\u0010\u0001\u0012\u000f\n\u000bLOW_LATENCY\u0010\u0002*n\n\u0019InternalDiscoveryStrategy\u0012\u0007\n\u0003BLE\u0010\u0000\u0012\u0007\n\u0003NSD\u0010\u0001\u0012\u0011\n\rBASED_CONNECT\u0010\u0002\u0012\u0007\n\u0003RTC\u0010\u0003\u0012\b\n\u0004AUTO\u0010\u0004\u0012\u0007\n\u0003LAN\u0010\u0005\u0012\u0007\n\u0003NFC\u0010\u0006\u0012\u0007\n\u0003USB\u0010\u0007*w\n\u0015InternalAdvertiseType\u0012\u0016\n\u0012DISCOVERY_MODEL_ID\u0010\u0000\u0012\u0016\n\u0012FAST_PAIR_MODEL_ID\u0010\u0001\u0012\u0015\n\u0011FAST_PAIR_ACCOUNT\u0010\u0002\u0012\u0017\n\u0013FAST_PAIR_DEVICE_ID\u0010\u0003*\u0083\u0001\n\u0015InternalReconnectType\u0012\u000e\n\nDIALOG_ALL\u0010\u0000\u0012\u0011\n\rDIALOG_RECENT\u0010\u0001\u0012\u000e\n\nSILENT_ALL\u0010\u0002\u0012\u0011\n\rSILENT_RECENT\u0010\u0003\u0012\u0011\n\rDIALOG_CUSTOM\u0010\u0004\u0012\u0011\n\rSILENT_CUSTOM\u0010\u0005*I\n\u001eInternalDiscoverableDeviceType\u0012\u0017\n\u0013SAME_ACCOUNT_DEVICE\u0010\u0000\u0012\u000e\n\nALL_DEVICE\u0010\u0001*>\n#InternalDiscoverableServiceUserType\u0012\u000b\n\u0007PRIVATE\u0010\u0000\u0012\n\n\u0006PUBLIC\u0010\u0001*:\n\u0015InternalServiceFilter\u0012\u0010\n\fSAME_SERVICE\u0010\u0000\u0012\u000f\n\u000bANY_SERVICE\u0010\u0001B\u0002P\u0001b\u0006proto3"}, new Descriptors.FileDescriptor[0]);

    static {
        Descriptors.Descriptor descriptor = a().getMessageTypes().get(0);
        a = descriptor;
        b = new GeneratedMessageV3.FieldAccessorTable(descriptor, new String[]{"Type", "Data"});
        Descriptors.Descriptor descriptor2 = a().getMessageTypes().get(1);
        f14628c = descriptor2;
        d = new GeneratedMessageV3.FieldAccessorTable(descriptor2, new String[]{"ClientId", "DurationMillis", "ModelId", "DeviceType", "ConnectType", "AdvertiseType", "IsHide", "IsGattSlow", "ReconnectType", "AdvertiseMode", "DiscoveryStrategy", "IsOnlyPairConnect", "ReconnectDeviceId", "Pid"});
        Descriptors.Descriptor descriptor3 = a().getMessageTypes().get(2);
        f14629e = descriptor3;
        f = new GeneratedMessageV3.FieldAccessorTable(descriptor3, new String[]{"ClientId", "DiscoveryStrategy", "DeviceType", "ScanMode", "DurationMillis"});
        Descriptors.Descriptor descriptor4 = a().getMessageTypes().get(3);
        g = descriptor4;
        h = new GeneratedMessageV3.FieldAccessorTable(descriptor4, new String[]{"DeviceType", "ProtocolDeviceId", "DisplayName", "TempId", "ModelId"});
        Descriptors.Descriptor descriptor5 = a().getMessageTypes().get(4);
        i = descriptor5;
        f14630j = new GeneratedMessageV3.FieldAccessorTable(descriptor5, new String[]{"ServiceName", "DiscoveryStrategy", "DiscoverableDeviceType", "DiscoverableServiceUserType", "ServiceData"});
        Descriptors.Descriptor descriptor6 = a().getMessageTypes().get(5);
        k = descriptor6;
        f14631l = new GeneratedMessageV3.FieldAccessorTable(descriptor6, new String[]{"ServiceName", "DiscoveryStrategy", "ServiceFilter"});
        Descriptors.Descriptor descriptor7 = a().getMessageTypes().get(6);
        m = descriptor7;
        f14632n = new GeneratedMessageV3.FieldAccessorTable(descriptor7, new String[]{"ProtocolDeviceId", "DeviceType", "AccountHash", "HostAddress", "DisplayName", "HostName", "ServiceData", "Distance", "RoleIntent"});
    }

    public static Descriptors.FileDescriptor a() {
        return o;
    }
}
