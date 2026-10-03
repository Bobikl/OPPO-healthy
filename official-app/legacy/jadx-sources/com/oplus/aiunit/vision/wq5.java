package com.oplus.aiunit.vision;

import com.coloros.sceneservice.dataprovider.bean.scene.SceneHotelData;
import com.google.protobuf.Descriptors;
import com.google.protobuf.GeneratedMessageV3;

/* JADX INFO: loaded from: classes8.dex */
public final class wq5 {
    public static final Descriptors.Descriptor a;
    public static final GeneratedMessageV3.FieldAccessorTable b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Descriptors.FileDescriptor f18363c = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u0017deviceconnections.proto\u0012!com.oplus.pantaconnect.connection\"K\n\u0016DeviceConnectionResult\u0012\u000f\n\u0007address\u0018\u0001 \u0001(\t\u0012\n\n\u0002ip\u0018\u0002 \u0001(\t\u0012\u0014\n\fconnectionId\u0018\u0003 \u0001(\u0003B\u0002P\u0001b\u0006proto3"}, new Descriptors.FileDescriptor[0]);

    static {
        Descriptors.Descriptor descriptor = a().getMessageTypes().get(0);
        a = descriptor;
        b = new GeneratedMessageV3.FieldAccessorTable(descriptor, new String[]{SceneHotelData.KEY_ADDRESS, "Ip", "ConnectionId"});
    }

    public static Descriptors.FileDescriptor a() {
        return f18363c;
    }
}
