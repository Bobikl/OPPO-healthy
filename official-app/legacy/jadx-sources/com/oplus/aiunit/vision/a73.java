package com.oplus.aiunit.vision;

import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.GeneratedMessage;

/* JADX INFO: loaded from: classes9.dex */
public final class a73 {
    public static final Descriptors.Descriptor a;
    public static GeneratedMessage.FieldAccessorTable b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Descriptors.Descriptor f9218c;
    public static GeneratedMessage.FieldAccessorTable d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Descriptors.Descriptor f9219e;
    public static GeneratedMessage.FieldAccessorTable f;
    public static final Descriptors.Descriptor g;
    public static GeneratedMessage.FieldAccessorTable h;
    public static final Descriptors.Descriptor i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static GeneratedMessage.FieldAccessorTable f9220j;
    public static Descriptors.FileDescriptor k;

    public class a implements Descriptors.FileDescriptor.InternalDescriptorAssigner {
        @Override // com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner
        public ExtensionRegistry assignDescriptors(Descriptors.FileDescriptor fileDescriptor) {
            Descriptors.FileDescriptor unused = a73.k = fileDescriptor;
            return null;
        }
    }

    static {
        Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n src/main/resources/channel.proto\u0012\u0013com.oppo.push.proto\"£\u0002\n\u0012ConnectionMetaData\u0012\u0015\n\rtimezone_code\u0018\u0001 \u0001(\t\u0012\u0013\n\u000bregion_code\u0018\u0002 \u0001(\t\u0012\u0013\n\u000bnetworkType\u0018\u0003 \u0001(\t\u0012\u0011\n\tlocationX\u0018\u0004 \u0001(\t\u0012\u0011\n\tlocationY\u0018\u0005 \u0001(\t\u0012\u0010\n\bprovince\u0018\u0006 \u0001(\t\u0012\f\n\u0004city\u0018\u0007 \u0001(\t\u0012\u0011\n\twifi_ssid\u0018\b \u0001(\t\u0012\u0010\n\bdistrict\u0018\t \u0001(\t\u0012\u000f\n\u0007isReset\u0018\n \u0001(\b\u0012\u0011\n\tresetTime\u0018\u000b \u0001(\t\u0012\u0012\n\nmcsVersion\u0018\f \u0001(\t\u0012\r\n\u0005model\u0018\r \u0001(\t\u0012\f\n\u0004duid\u0018\u000e \u0001(\t\u0012\f\n\u0004ouid\u0018\u000f \u0001(\t\"Ì\u0001\n\u0011ConnectUplinkData\u0012\u0012\n\nserverName\u0018\u0001 \u0001(\t\u0012\u000b\n\u0003cmd\u0018\u0002", " \u0001(\t\u0012\u0010\n\bclientId\u0018\u0003 \u0001(\t\u0012\u0010\n\bclientIp\u0018\u0004 \u0001(\t\u0012\u0012\n\nclientPort\u0018\u0005 \u0001(\t\u0012\u0011\n\tconnectIp\u0018\u0006 \u0001(\t\u0012\u0013\n\u000bconnectPort\u0018\u0007 \u0001(\t\u0012\u0013\n\u000bdataPayload\u0018\b \u0001(\t\u0012\u0011\n\tmessageId\u0018\t \u0001(\t\u0012\u000e\n\u0006source\u0018\n \u0001(\t\"b\n\u0013ConnectDownlinkData\u0012\u0010\n\bclientId\u0018\u0001 \u0001(\t\u0012\u0013\n\u000bdataPayload\u0018\u0002 \u0001(\t\u0012\u0011\n\tmessageId\u0018\u0003 \u0001(\t\u0012\u0011\n\tcmdLatest\u0018\u0004 \u0001(\t\"h\n\u000eConnectCmdData\u0012\u0010\n\bclientId\u0018\u0001 \u0001(\t\u0012\u000f\n\u0007cmdType\u0018\u0002 \u0001(\t\u0012\u000b\n\u0003ext\u0018\u0003 \u0001(\t\u0012\u0013\n\u000bdataPayload\u0018\u0004 \u0001(\t\u0012\u0011\n\tmessageId\u0018\u0005 \u0001(\t\"ç\u0001\n\u0014LcConnectionMetaData\u0012\u0011\n\tmessageId", "\u0018\u0001 \u0001(\t\u0012\u0012\n\nappPackage\u0018\u0002 \u0001(\t\u0012\u0013\n\u000bnetworkType\u0018\u0003 \u0001(\t\u0012\u0011\n\tlocationX\u0018\u0004 \u0001(\t\u0012\u0011\n\tlocationY\u0018\u0005 \u0001(\t\u0012\u0011\n\twifi_ssid\u0018\u0006 \u0001(\t\u0012\r\n\u0005model\u0018\u0007 \u0001(\t\u0012\f\n\u0004duid\u0018\b \u0001(\t\u0012\f\n\u0004ouid\u0018\t \u0001(\t\u0012\u000b\n\u0003ext\u0018\n \u0001(\t\u0012\u0012\n\nserverName\u0018\u000b \u0001(\t\u0012\u000e\n\u0006source\u0018\f \u0001(\tB\u0017\n\u0013com.oppo.push.protoP\u0001"}, new Descriptors.FileDescriptor[0], new a());
        Descriptors.Descriptor descriptor = b().getMessageTypes().get(0);
        a = descriptor;
        b = new GeneratedMessage.FieldAccessorTable(descriptor, new String[]{"TimezoneCode", "RegionCode", "NetworkType", "LocationX", "LocationY", "Province", "City", "WifiSsid", "District", "IsReset", "ResetTime", "McsVersion", "Model", "Duid", "Ouid"});
        Descriptors.Descriptor descriptor2 = b().getMessageTypes().get(1);
        f9218c = descriptor2;
        d = new GeneratedMessage.FieldAccessorTable(descriptor2, new String[]{"ServerName", "Cmd", "ClientId", "ClientIp", "ClientPort", "ConnectIp", "ConnectPort", "DataPayload", "MessageId", "Source"});
        Descriptors.Descriptor descriptor3 = b().getMessageTypes().get(2);
        f9219e = descriptor3;
        f = new GeneratedMessage.FieldAccessorTable(descriptor3, new String[]{"ClientId", "DataPayload", "MessageId", "CmdLatest"});
        Descriptors.Descriptor descriptor4 = b().getMessageTypes().get(3);
        g = descriptor4;
        h = new GeneratedMessage.FieldAccessorTable(descriptor4, new String[]{"ClientId", "CmdType", "Ext", "DataPayload", "MessageId"});
        Descriptors.Descriptor descriptor5 = b().getMessageTypes().get(4);
        i = descriptor5;
        f9220j = new GeneratedMessage.FieldAccessorTable(descriptor5, new String[]{"MessageId", "AppPackage", "NetworkType", "LocationX", "LocationY", "WifiSsid", "Model", "Duid", "Ouid", "Ext", "ServerName", "Source"});
    }

    public static Descriptors.FileDescriptor b() {
        return k;
    }
}
