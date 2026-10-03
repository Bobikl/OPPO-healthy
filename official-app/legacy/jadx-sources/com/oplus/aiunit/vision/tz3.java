package com.oplus.aiunit.vision;

import com.coloros.sceneservice.dataprovider.bean.scene.SceneHotelData;
import com.coloros.sceneservice.dataprovider.bean.scene.SceneMovieData;
import com.google.protobuf.Descriptors;
import com.google.protobuf.GeneratedMessageV3;

/* JADX INFO: loaded from: classes8.dex */
public final class tz3 {
    public static final Descriptors.Descriptor A;
    public static final GeneratedMessageV3.FieldAccessorTable B;
    public static final Descriptors.Descriptor C;
    public static final GeneratedMessageV3.FieldAccessorTable D;
    public static Descriptors.FileDescriptor E = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u0011connections.proto\u0012!com.oplus.pantaconnect.connection\"i\n\u0014ConnectExtensionArgs\u0012\r\n\u0005force\u0018\u0001 \u0001(\b\u0012\u0014\n\faddBlacklist\u0018\u0002 \u0001(\b\u0012\u0012\n\nisCloseAll\u0018\u0003 \u0001(\b\u0012\u000b\n\u0003pkg\u0018\u0004 \u0001(\t\u0012\u000b\n\u0003pid\u0018\u0005 \u0001(\u0005\"ø\u0001\n\u0019GlobalDeviceConnectParams\u0012\u0015\n\rdisplayDevice\u0018\u0001 \u0001(\f\u0012\u0013\n\u000bconnectType\u0018\u0002 \u0001(\u0005\u0012\u0013\n\u000bchannelType\u0018\u0003 \u0001(\u0005\u0012F\n\u0005extra\u0018\u0004 \u0001(\u000b27.com.oplus.pantaconnect.connection.ConnectExtensionArgs\u0012R\n\u000edirectDecision\u0018\u0005 \u0001(\u000b2:.com.oplus.pantaconnect.connection.DirectionDecisionParams\"±\u0002\n\u0010PairActionParams\u0012\u0015\n\rdisplayDevice\u0018\u0001 \u0001(\f\u0012I\n\npairAction\u0018\u0002 \u0001(\u000e25.com.oplus.pantaconnect.connection.InternalPairAction\u0012T\n\u000bconfirmType\u0018\u0003 \u0001(\u000e2?.com.oplus.pantaconnect.connection.PairActionParams.ConfirmType\"e\n\u000bConfirmType\u0012\u0019\n\u0015CONFIRM_FOR_ADVERTISE\u0010\u0000\u0012\u0017\n\u0013CONFIRM_FOR_QR_CODE\u0010\u0001\u0012\"\n\u001eCONFIRM_FOR_QR_CODE_COMPAT_P2P\u0010\u0002\"\u0084\u0001\n\u001aGlobalDeviceConnectionItem\u0012\u0013\n\u000bconnectType\u0018\u0001 \u0001(\u0005\u0012\u0013\n\u000bchannelType\u0018\u0002 \u0001(\u0005\u0012\u000f\n\u0007address\u0018\u0003 \u0001(\t\u0012\n\n\u0002ip\u0018\u0004 \u0001(\t\u0012\f\n\u0004ssid\u0018\u0005 \u0001(\t\u0012\u0011\n\tvLinkType\u0018\u0006 \u0001(\u0005\"f\n\u0017GlobalDeviceConnections\u0012K\n\u0004data\u0018\u0001 \u0003(\u000b2=.com.oplus.pantaconnect.connection.GlobalDeviceConnectionItem\"Ç\u0002\n\u001bGlobalDeviceConnectionEvent\u0012V\n\u0004type\u0018\u0001 \u0001(\u000e2H.com.oplus.pantaconnect.connection.GlobalDeviceConnectionEvent.EventType\u0012\u0015\n\rdisplayDevice\u0018\u0002 \u0001(\f\u0012\u000e\n\u0006result\u0018\u0003 \u0001(\f\u0012\r\n\u0005extra\u0018\u0004 \u0001(\f\"\u0099\u0001\n\tEventType\u0012\u0013\n\u000fCONNECTION_INIT\u0010\u0000\u0012\u0016\n\u0012CONNECTION_SUCCESS\u0010\u0001\u0012\u0013\n\u000fCONNECTION_FAIL\u0010\u0002\u0012\u001b\n\u0017CONNECTION_DISCONNECTED\u0010\u0003\u0012\u0018\n\u0014QR_CODE_INFO_REQUEST\u0010\u0004\u0012\u0013\n\u000fEXTENSION_EVENT\u0010\u0005\"÷\u0001\n\u0013QrCodeRequestParams\u0012\u0012\n\ndeviceType\u0018\u0001 \u0001(\u0005\u0012]\n\nqrCodeType\u0018\u0002 \u0001(\u000e2I.com.oplus.pantaconnect.connection.QrCodeRequestParams.InternalQrCodeType\u0012\u000f\n\u0007modelId\u0018\u0003 \u0001(\t\u0012\u000b\n\u0003pid\u0018\u0004 \u0001(\t\"O\n\u0012InternalQrCodeType\u0012\u001a\n\u0016CONNECT_PARAMS_P2P_MAC\u0010\u0000\u0012\u001d\n\u0019CONNECT_PARAMS_P2P_BT_MAC\u0010\u0001\"B\n\u0017GetConnectionListParams\u0012\u0010\n\bdeviceId\u0018\u0001 \u0001(\t\u0012\u0015\n\rconnectorType\u0018\u0002 \u0001(\u0005\"R\n\u0016GetModelIdResUriParams\u0012\u0012\n\ndeviceType\u0018\u0001 \u0001(\u0005\u0012\u000f\n\u0007modelId\u0018\u0002 \u0001(\t\u0012\u0013\n\u000bpackageName\u0018\u0003 \u0001(\t\"9\n\u001aP2PPhysicalSupportedResult\u0012\f\n\u0004code\u0018\u0001 \u0001(\u0005\u0012\r\n\u0005state\u0018\u0002 \u0001(\b\"f\n\u0017ConnectionHoldingParams\u0012\u0010\n\bdeviceId\u0018\u0001 \u0001(\t\u0012\u0013\n\u000bconnectType\u0018\u0002 \u0001(\u0005\u0012\u0017\n\u000fisForcedHolding\u0018\u0003 \u0001(\b\u0012\u000b\n\u0003pid\u0018\u0004 \u0001(\u0005\"E\n\u0010P2PPhysicalEvent\u0012\u0011\n\teventType\u0018\u0001 \u0001(\u0005\u0012\u000e\n\u0006device\u0018\u0002 \u0001(\f\u0012\u000e\n\u0006result\u0018\u0003 \u0001(\f\"Â\u0001\n\u0017DirectionDecisionParams\u0012\u0012\n\nmacAddress\u0018\u0001 \u0001(\t\u0012\u000f\n\u0007advFreq\u0018\u0002 \u0001(\t\u0012\u0010\n\bremoteIp\u0018\u0003 \u0001(\t\u0012\f\n\u0004ssid\u0018\u0004 \u0001(\t\u0012\u000b\n\u0003tag\u0018\u0005 \u0001(\t\u0012\u0010\n\bdeviceId\u0018\u0006 \u0001(\t\u0012\u0010\n\bkscAlias\u0018\u0007 \u0001(\t\u0012\u0011\n\tdeviceKsc\u0018\b \u0001(\t\u0012\f\n\u0004name\u0018\t \u0001(\t\u0012\u0010\n\bpassword\u0018\n \u0001(\t\"?\n\u0017FetchDeviceStatusParams\u0012\u0010\n\bdeviceId\u0018\u0001 \u0001(\t\u0012\u0012\n\nfeatureKey\u0018\u0002 \u0001(\t\"^\n\u0012PhyLinkUpdateEvent\u0012\u0011\n\tlinkState\u0018\u0001 \u0001(\u0005\u0012\u0010\n\blinkType\u0018\u0002 \u0001(\u0005\u0012\u0010\n\blinkFreq\u0018\u0003 \u0001(\u0005\u0012\u0011\n\tnetDevice\u0018\u0004 \u0001(\t*[\n\u0012InternalPairAction\u0012\u000b\n\u0007UNKNOWN\u0010\u0000\u0012\n\n\u0006ACCEPT\u0010\u0001\u0012\n\n\u0006REJECT\u0010\u0002\u0012\f\n\bPIN_AUTH\u0010\u0003\u0012\u0012\n\u000eCUSTOMIZE_AUTH\u0010\u0004B\u0002P\u0001b\u0006proto3"}, new Descriptors.FileDescriptor[0]);
    public static final Descriptors.Descriptor a;
    public static final GeneratedMessageV3.FieldAccessorTable b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Descriptors.Descriptor f17207c;
    public static final GeneratedMessageV3.FieldAccessorTable d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Descriptors.Descriptor f17208e;
    public static final GeneratedMessageV3.FieldAccessorTable f;
    public static final Descriptors.Descriptor g;
    public static final GeneratedMessageV3.FieldAccessorTable h;
    public static final Descriptors.Descriptor i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final GeneratedMessageV3.FieldAccessorTable f17209j;
    public static final Descriptors.Descriptor k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final GeneratedMessageV3.FieldAccessorTable f17210l;
    public static final Descriptors.Descriptor m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final GeneratedMessageV3.FieldAccessorTable f17211n;
    public static final Descriptors.Descriptor o;
    public static final GeneratedMessageV3.FieldAccessorTable p;
    public static final Descriptors.Descriptor q;
    public static final GeneratedMessageV3.FieldAccessorTable r;
    public static final Descriptors.Descriptor s;
    public static final GeneratedMessageV3.FieldAccessorTable t;
    public static final Descriptors.Descriptor u;
    public static final GeneratedMessageV3.FieldAccessorTable v;
    public static final Descriptors.Descriptor w;
    public static final GeneratedMessageV3.FieldAccessorTable x;
    public static final Descriptors.Descriptor y;
    public static final GeneratedMessageV3.FieldAccessorTable z;

    static {
        Descriptors.Descriptor descriptor = a().getMessageTypes().get(0);
        a = descriptor;
        b = new GeneratedMessageV3.FieldAccessorTable(descriptor, new String[]{"Force", "AddBlacklist", "IsCloseAll", "Pkg", "Pid"});
        Descriptors.Descriptor descriptor2 = a().getMessageTypes().get(1);
        f17207c = descriptor2;
        d = new GeneratedMessageV3.FieldAccessorTable(descriptor2, new String[]{"DisplayDevice", "ConnectType", "ChannelType", "Extra", "DirectDecision"});
        Descriptors.Descriptor descriptor3 = a().getMessageTypes().get(2);
        f17208e = descriptor3;
        f = new GeneratedMessageV3.FieldAccessorTable(descriptor3, new String[]{"DisplayDevice", "PairAction", "ConfirmType"});
        Descriptors.Descriptor descriptor4 = a().getMessageTypes().get(3);
        g = descriptor4;
        h = new GeneratedMessageV3.FieldAccessorTable(descriptor4, new String[]{"ConnectType", "ChannelType", SceneHotelData.KEY_ADDRESS, "Ip", "Ssid", "VLinkType"});
        Descriptors.Descriptor descriptor5 = a().getMessageTypes().get(4);
        i = descriptor5;
        f17209j = new GeneratedMessageV3.FieldAccessorTable(descriptor5, new String[]{"Data"});
        Descriptors.Descriptor descriptor6 = a().getMessageTypes().get(5);
        k = descriptor6;
        f17210l = new GeneratedMessageV3.FieldAccessorTable(descriptor6, new String[]{"Type", "DisplayDevice", "Result", "Extra"});
        Descriptors.Descriptor descriptor7 = a().getMessageTypes().get(6);
        m = descriptor7;
        f17211n = new GeneratedMessageV3.FieldAccessorTable(descriptor7, new String[]{"DeviceType", "QrCodeType", "ModelId", "Pid"});
        Descriptors.Descriptor descriptor8 = a().getMessageTypes().get(7);
        o = descriptor8;
        p = new GeneratedMessageV3.FieldAccessorTable(descriptor8, new String[]{"DeviceId", "ConnectorType"});
        Descriptors.Descriptor descriptor9 = a().getMessageTypes().get(8);
        q = descriptor9;
        r = new GeneratedMessageV3.FieldAccessorTable(descriptor9, new String[]{"DeviceType", "ModelId", "PackageName"});
        Descriptors.Descriptor descriptor10 = a().getMessageTypes().get(9);
        s = descriptor10;
        t = new GeneratedMessageV3.FieldAccessorTable(descriptor10, new String[]{SceneMovieData.KEY_PICK_CODE, "State"});
        Descriptors.Descriptor descriptor11 = a().getMessageTypes().get(10);
        u = descriptor11;
        v = new GeneratedMessageV3.FieldAccessorTable(descriptor11, new String[]{"DeviceId", "ConnectType", "IsForcedHolding", "Pid"});
        Descriptors.Descriptor descriptor12 = a().getMessageTypes().get(11);
        w = descriptor12;
        x = new GeneratedMessageV3.FieldAccessorTable(descriptor12, new String[]{"EventType", "Device", "Result"});
        Descriptors.Descriptor descriptor13 = a().getMessageTypes().get(12);
        y = descriptor13;
        z = new GeneratedMessageV3.FieldAccessorTable(descriptor13, new String[]{"MacAddress", "AdvFreq", "RemoteIp", "Ssid", "Tag", "DeviceId", "KscAlias", "DeviceKsc", "Name", "Password"});
        Descriptors.Descriptor descriptor14 = a().getMessageTypes().get(13);
        A = descriptor14;
        B = new GeneratedMessageV3.FieldAccessorTable(descriptor14, new String[]{"DeviceId", "FeatureKey"});
        Descriptors.Descriptor descriptor15 = a().getMessageTypes().get(14);
        C = descriptor15;
        D = new GeneratedMessageV3.FieldAccessorTable(descriptor15, new String[]{"LinkState", "LinkType", "LinkFreq", "NetDevice"});
    }

    public static Descriptors.FileDescriptor a() {
        return E;
    }
}
