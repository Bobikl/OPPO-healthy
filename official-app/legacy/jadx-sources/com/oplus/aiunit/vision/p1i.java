package com.oplus.aiunit.vision;

import com.google.protobuf.Descriptors;
import com.google.protobuf.GeneratedMessageV3;

/* JADX INFO: loaded from: classes8.dex */
public final class p1i {
    public static final Descriptors.Descriptor a;
    public static final GeneratedMessageV3.FieldAccessorTable b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Descriptors.Descriptor f15152c;
    public static final GeneratedMessageV3.FieldAccessorTable d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Descriptors.Descriptor f15153e;
    public static final GeneratedMessageV3.FieldAccessorTable f;
    public static Descriptors.FileDescriptor g = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u0010socket_qos.proto\u0012!com.oplus.pantaconnect.connection\"Â\u0001\n\u000fSocketQosResult\u0012\u0011\n\tbandWidth\u0018\u0001 \u0001(\u0005\u0012\r\n\u0005delay\u0018\u0002 \u0001(\u0005\u0012\u0016\n\u000epacketLossRate\u0018\u0003 \u0001(\u0005\u0012\f\n\u0004rssi\u0018\u0004 \u0001(\u0005\u0012\u000e\n\u0006peerIp\u0018\u0005 \u0001(\t\u0012\u0012\n\nremoteRssi\u0018\u0006 \u0001(\u0005\u0012C\n\u000bsocketState\u0018\u0007 \u0001(\u000e2..com.oplus.pantaconnect.connection.SocketState\"G\n\u001aLanConnectionHoldingParams\u0012\u0010\n\bdeviceId\u0018\u0001 \u0001(\t\u0012\u0017\n\u000fisForcedHolding\u0018\u0002 \u0001(\b\"Â\u0001\n\u0017SocketQosObserverResult\u0012\u0010\n\bdeviceId\u0018\u0001 \u0001(\t\u0012K\n\u000fsocketQosResult\u0018\u0002 \u0001(\u000b22.com.oplus.pantaconnect.connection.SocketQosResult\u0012H\n\u0005event\u0018\u0003 \u0001(\u000e29.com.oplus.pantaconnect.connection.SocketQosObserverEvent*U\n\u000bSocketState\u0012\u0012\n\u000eSOCKET_INVALID\u0010\u0000\u0012\u0018\n\u0014SOCKET_SPEED_TESTING\u0010\u0001\u0012\u0018\n\u0014SOCKET_QOS_AVAILABLE\u0010\u0002*Z\n\u0016SocketQosObserverEvent\u0012 \n\u001cEVENT_SOCKET_QOS_UNAVAILABLE\u0010\u0000\u0012\u001e\n\u001aEVENT_SOCKET_QOS_AVAILABLE\u0010\u0001B\u0002P\u0001b\u0006proto3"}, new Descriptors.FileDescriptor[0]);

    static {
        Descriptors.Descriptor descriptor = a().getMessageTypes().get(0);
        a = descriptor;
        b = new GeneratedMessageV3.FieldAccessorTable(descriptor, new String[]{"BandWidth", "Delay", "PacketLossRate", "Rssi", "PeerIp", "RemoteRssi", "SocketState"});
        Descriptors.Descriptor descriptor2 = a().getMessageTypes().get(1);
        f15152c = descriptor2;
        d = new GeneratedMessageV3.FieldAccessorTable(descriptor2, new String[]{"DeviceId", "IsForcedHolding"});
        Descriptors.Descriptor descriptor3 = a().getMessageTypes().get(2);
        f15153e = descriptor3;
        f = new GeneratedMessageV3.FieldAccessorTable(descriptor3, new String[]{"DeviceId", "SocketQosResult", "Event"});
    }

    public static Descriptors.FileDescriptor a() {
        return g;
    }
}
