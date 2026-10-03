package com.oplus.aiunit.vision;

import com.google.protobuf.Descriptors;
import com.google.protobuf.GeneratedMessageV3;
import xcrash.TombstoneParser;

/* JADX INFO: loaded from: classes8.dex */
public final class xq5 {
    public static final Descriptors.Descriptor a;
    public static final GeneratedMessageV3.FieldAccessorTable b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Descriptors.Descriptor f18722c;
    public static final GeneratedMessageV3.FieldAccessorTable d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Descriptors.Descriptor f18723e;
    public static final GeneratedMessageV3.FieldAccessorTable f;
    public static final Descriptors.Descriptor g;
    public static final GeneratedMessageV3.FieldAccessorTable h;
    public static final Descriptors.Descriptor i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final GeneratedMessageV3.FieldAccessorTable f18724j;
    public static final Descriptors.Descriptor k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final GeneratedMessageV3.FieldAccessorTable f18725l;
    public static final Descriptors.Descriptor m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final GeneratedMessageV3.FieldAccessorTable f18726n;
    public static final Descriptors.Descriptor o;
    public static final GeneratedMessageV3.FieldAccessorTable p;
    public static final Descriptors.Descriptor q;
    public static final GeneratedMessageV3.FieldAccessorTable r;
    public static Descriptors.FileDescriptor s = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u0013devicemanager.proto\u0012 com.oplus.pantaconnect.devicemgr\"Ó\u0001\n\u000fLocalDeviceInfo\u0012\u0012\n\ndeviceType\u0018\u0001 \u0001(\t\u0012<\n\bmetaData\u0018\u0002 \u0001(\u000b2*.com.oplus.pantaconnect.devicemgr.MetaData\u00124\n\u0004spec\u0018\u0003 \u0001(\u000b2&.com.oplus.pantaconnect.devicemgr.Spec\u00128\n\u0006status\u0018\u0004 \u0001(\u000b2(.com.oplus.pantaconnect.devicemgr.Status\"K\n\bMetaData\u0012\u0010\n\bdeviceId\u0018\u0001 \u0001(\t\u0012\u0018\n\u0010protocolDeviceId\u0018\u0002 \u0001(\t\u0012\u0013\n\u000bdeviceModel\u0018\u0003 \u0001(\t\"\u0088\u0002\n\u0004Spec\u0012\u0012\n\ndeviceName\u0018\u0001 \u0001(\t\u0012\u0012\n\nresolution\u0018\u0002 \u0001(\t\u0012\u0011\n\tscreenDpi\u0018\u0003 \u0001(\t\u0012\u000f\n\u0007cpuName\u0018\u0004 \u0001(\t\u0012\u000f\n\u0007ramSpec\u0018\u0005 \u0001(\t\u0012\u000f\n\u0007romSpec\u0018\u0006 \u0001(\t\u0012\u0017\n\u000fbatteryCapacity\u0018\u0007 \u0001(\t\u0012\r\n\u0005btMac\u0018\b \u0001(\t\u0012\u0016\n\u000eandroidVersion\u0018\t \u0001(\t\u0012\u0011\n\tosVersion\u0018\n \u0001(\t\u0012\r\n\u0005brand\u0018\u000b \u0001(\t\u0012\u000e\n\u0006region\u0018\f \u0001(\t\u0012\f\n\u0004oaid\u0018\r \u0001(\t\u0012\u0012\n\nmarketName\u0018\u000e \u0001(\t\"\u0085\u0002\n\u0006Status\u0012\u0019\n\u0011connectionToMajor\u0018\u0001 \u0001(\t\u0012\u0010\n\bbtStatus\u0018\u0002 \u0001(\t\u0012\u0013\n\u000bnetworkType\u0018\u0003 \u0001(\t\u0012\u0016\n\u000elocationStatus\u0018\u0004 \u0001(\t\u0012\u0010\n\bmemAvail\u0018\u0005 \u0001(\t\u0012\u0010\n\bmemTotal\u0018\u0006 \u0001(\t\u0012\u0014\n\fstorageAvail\u0018\u0007 \u0001(\t\u0012\u0010\n\bdarkMode\u0018\b \u0001(\t\u0012\u0010\n\bearPhone\u0018\t \u0001(\t\u0012\u0011\n\tlongitude\u0018\n \u0001(\t\u0012\u0010\n\blatitude\u0018\u000b \u0001(\t\u0012\u001e\n\u0016locationCoordinateType\u0018\f \u0001(\t\"_\n\u0011LocalResourceList\u0012J\n\rresourceInfos\u0018\u0001 \u0003(\u000b23.com.oplus.pantaconnect.devicemgr.LocalResourceInfo\"Ä\u0003\n\u0011LocalResourceInfo\u0012\u0010\n\bdeviceId\u0018\u0001 \u0001(\t\u0012\u000f\n\u0007version\u0018\u0002 \u0001(\t\u0012\f\n\u0004kind\u0018\u0003 \u0001(\t\u0012S\n\bmetaData\u0018\u0004 \u0003(\u000b2A.com.oplus.pantaconnect.devicemgr.LocalResourceInfo.MetaDataEntry\u0012K\n\u0004spec\u0018\u0005 \u0003(\u000b2=.com.oplus.pantaconnect.devicemgr.LocalResourceInfo.SpecEntry\u0012O\n\u0006status\u0018\u0006 \u0003(\u000b2?.com.oplus.pantaconnect.devicemgr.LocalResourceInfo.StatusEntry\u001a/\n\rMetaDataEntry\u0012\u000b\n\u0003key\u0018\u0001 \u0001(\t\u0012\r\n\u0005value\u0018\u0002 \u0001(\t:\u00028\u0001\u001a+\n\tSpecEntry\u0012\u000b\n\u0003key\u0018\u0001 \u0001(\t\u0012\r\n\u0005value\u0018\u0002 \u0001(\t:\u00028\u0001\u001a-\n\u000bStatusEntry\u0012\u000b\n\u0003key\u0018\u0001 \u0001(\t\u0012\r\n\u0005value\u0018\u0002 \u0001(\t:\u00028\u0001B\u0002P\u0001b\u0006proto3"}, new Descriptors.FileDescriptor[0]);

    static {
        Descriptors.Descriptor descriptor = a().getMessageTypes().get(0);
        a = descriptor;
        b = new GeneratedMessageV3.FieldAccessorTable(descriptor, new String[]{"DeviceType", "MetaData", "Spec", "Status"});
        Descriptors.Descriptor descriptor2 = a().getMessageTypes().get(1);
        f18722c = descriptor2;
        d = new GeneratedMessageV3.FieldAccessorTable(descriptor2, new String[]{"DeviceId", "ProtocolDeviceId", "DeviceModel"});
        Descriptors.Descriptor descriptor3 = a().getMessageTypes().get(2);
        f18723e = descriptor3;
        f = new GeneratedMessageV3.FieldAccessorTable(descriptor3, new String[]{"DeviceName", "Resolution", "ScreenDpi", "CpuName", "RamSpec", "RomSpec", "BatteryCapacity", "BtMac", "AndroidVersion", "OsVersion", TombstoneParser.keyBrand, "Region", "Oaid", "MarketName"});
        Descriptors.Descriptor descriptor4 = a().getMessageTypes().get(3);
        g = descriptor4;
        h = new GeneratedMessageV3.FieldAccessorTable(descriptor4, new String[]{"ConnectionToMajor", "BtStatus", "NetworkType", "LocationStatus", "MemAvail", "MemTotal", "StorageAvail", "DarkMode", "EarPhone", "Longitude", "Latitude", "LocationCoordinateType"});
        Descriptors.Descriptor descriptor5 = a().getMessageTypes().get(4);
        i = descriptor5;
        f18724j = new GeneratedMessageV3.FieldAccessorTable(descriptor5, new String[]{"ResourceInfos"});
        Descriptors.Descriptor descriptor6 = a().getMessageTypes().get(5);
        k = descriptor6;
        f18725l = new GeneratedMessageV3.FieldAccessorTable(descriptor6, new String[]{"DeviceId", usm.g, "Kind", "MetaData", "Spec", "Status"});
        Descriptors.Descriptor descriptor7 = descriptor6.getNestedTypes().get(0);
        m = descriptor7;
        f18726n = new GeneratedMessageV3.FieldAccessorTable(descriptor7, new String[]{"Key", "Value"});
        Descriptors.Descriptor descriptor8 = descriptor6.getNestedTypes().get(1);
        o = descriptor8;
        p = new GeneratedMessageV3.FieldAccessorTable(descriptor8, new String[]{"Key", "Value"});
        Descriptors.Descriptor descriptor9 = descriptor6.getNestedTypes().get(2);
        q = descriptor9;
        r = new GeneratedMessageV3.FieldAccessorTable(descriptor9, new String[]{"Key", "Value"});
    }

    public static Descriptors.FileDescriptor a() {
        return s;
    }
}
