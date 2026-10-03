package com.oplus.aiunit.vision;

import com.oplus.pantaconnect.sdk.discovery.fusion.ServiceNodeBundleKeys;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.u6l, reason: from toString */
/* JADX INFO: loaded from: classes18.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0086\b\u0018\u00002\u00020\u0001BO\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\u0013\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u000b\u001a\u0004\b\u000f\u0010\rR\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u000b\u001a\u0004\b\u0012\u0010\rR\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u000b\u001a\u0004\b\u0014\u0010\rR\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u000b\u001a\u0004\b\u0011\u0010\rR\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u000b\u001a\u0004\b\u0017\u0010\r¨\u0006\u001b"}, d2 = {"Lcom/oplus/aiunit/vision/u6l;", "", "", "a", "b", "toString", "", "hashCode", "other", "", "equals", "Ljava/lang/String;", "f", "()Ljava/lang/String;", "mac", b2n.f, "model", "c", MapSchema.FIELD_NAME_ENTRY, e36.PARAM_FIRMWARE_VERSION, "d", "deviceSn", "deviceMarketName", "getDeviceName", ServiceNodeBundleKeys.DEVICE_NAME, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "commonlib_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class WalletDevInfo {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @Nullable
    public final String mac;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @Nullable
    public final String model;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @Nullable
    public final String firmwareVersion;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @Nullable
    public final String deviceSn;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    @Nullable
    public final String deviceMarketName;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    @Nullable
    public final String deviceName;

    public WalletDevInfo() {
        this(null, null, null, null, null, null, 63, null);
    }

    @Nullable
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getModel() {
        return this.model;
    }

    @Nullable
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getDeviceSn() {
        return this.deviceSn;
    }

    @Nullable
    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getDeviceMarketName() {
        return this.deviceMarketName;
    }

    @Nullable
    public final String d() {
        return this.deviceSn;
    }

    @Nullable
    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getFirmwareVersion() {
        return this.firmwareVersion;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WalletDevInfo)) {
            return false;
        }
        WalletDevInfo walletDevInfo = (WalletDevInfo) other;
        return Intrinsics.areEqual(this.mac, walletDevInfo.mac) && Intrinsics.areEqual(this.model, walletDevInfo.model) && Intrinsics.areEqual(this.firmwareVersion, walletDevInfo.firmwareVersion) && Intrinsics.areEqual(this.deviceSn, walletDevInfo.deviceSn) && Intrinsics.areEqual(this.deviceMarketName, walletDevInfo.deviceMarketName) && Intrinsics.areEqual(this.deviceName, walletDevInfo.deviceName);
    }

    @Nullable
    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getMac() {
        return this.mac;
    }

    @Nullable
    public final String g() {
        return this.model;
    }

    public int hashCode() {
        String str = this.mac;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.model;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.firmwareVersion;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.deviceSn;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.deviceMarketName;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.deviceName;
        return iHashCode5 + (str6 != null ? str6.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "WalletDevInfo(mac=" + this.mac + ", model=" + this.model + ", firmwareVersion=" + this.firmwareVersion + ", deviceSn=" + this.deviceSn + ", deviceMarketName=" + this.deviceMarketName + ", deviceName=" + this.deviceName + ")";
    }

    public WalletDevInfo(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6) {
        this.mac = str;
        this.model = str2;
        this.firmwareVersion = str3;
        this.deviceSn = str4;
        this.deviceMarketName = str5;
        this.deviceName = str6;
    }

    public /* synthetic */ WalletDevInfo(String str, String str2, String str3, String str4, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "null" : str, (i & 2) != 0 ? "null" : str2, (i & 4) != 0 ? "null" : str3, (i & 8) != 0 ? "null" : str4, (i & 16) != 0 ? "null" : str5, (i & 32) != 0 ? "null" : str6);
    }
}
