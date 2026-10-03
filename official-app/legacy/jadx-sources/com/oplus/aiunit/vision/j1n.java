package com.oplus.aiunit.vision;

import com.google.protobuf.Descriptors;
import com.google.protobuf.GeneratedMessageV3;

/* JADX INFO: loaded from: classes10.dex */
public final class j1n {
    public static final GeneratedMessageV3.FieldAccessorTable blueberry;

    /* JADX INFO: renamed from: coconut, reason: collision with root package name */
    public static final Descriptors.Descriptor f12730coconut;
    public static final Descriptors.Descriptor cranberry;

    /* JADX INFO: renamed from: jackFruit, reason: collision with root package name */
    public static final GeneratedMessageV3.FieldAccessorTable f12731jackFruit;
    public static final Descriptors.Descriptor prunes;
    public static final GeneratedMessageV3.FieldAccessorTable raspberry;

    static {
        Descriptors.FileDescriptor fileDescriptorInternalBuildGeneratedFileFrom = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u0011wifi_config.proto\u0012\u001bcom.oplus.pantaconnect.wifi\"u\n\u0010WifiConfigResult\u0012\f\n\u0004ssid\u0018\u0001 \u0001(\t\u0012\u0014\n\fpreSharedKey\u0018\u0002 \u0001(\t\u0012\u001c\n\u0014allowedKeyManagement\u0018\u0003 \u0001(\f\u0012\u001f\n\u0017allowedKeyManagementStr\u0018\u0004 \u0001(\t\"T\n\u0010WifiConfigParams\u0012\f\n\u0004ssid\u0018\u0001 \u0001(\b\u0012\u0014\n\fpreSharedKey\u0018\u0002 \u0001(\b\u0012\u001c\n\u0014allowedKeyManagement\u0018\u0003 \u0001(\b\"c\n\u0017RecordWifiConfigsResult\u0012H\n\u0011recordWifiConfigs\u0018\u0001 \u0003(\u000b2-.com.oplus.pantaconnect.wifi.WifiConfigResultB\u0002P\u0001b\u0006proto3"}, new Descriptors.FileDescriptor[0]);
        Descriptors.Descriptor descriptor = fileDescriptorInternalBuildGeneratedFileFrom.getMessageTypes().get(0);
        f12730coconut = descriptor;
        f12731jackFruit = new GeneratedMessageV3.FieldAccessorTable(descriptor, new String[]{"Ssid", "PreSharedKey", "AllowedKeyManagement", "AllowedKeyManagementStr"});
        Descriptors.Descriptor descriptor2 = fileDescriptorInternalBuildGeneratedFileFrom.getMessageTypes().get(1);
        prunes = descriptor2;
        blueberry = new GeneratedMessageV3.FieldAccessorTable(descriptor2, new String[]{"Ssid", "PreSharedKey", "AllowedKeyManagement"});
        Descriptors.Descriptor descriptor3 = fileDescriptorInternalBuildGeneratedFileFrom.getMessageTypes().get(2);
        cranberry = descriptor3;
        raspberry = new GeneratedMessageV3.FieldAccessorTable(descriptor3, new String[]{"RecordWifiConfigs"});
    }
}
