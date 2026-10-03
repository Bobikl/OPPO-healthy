package com.oplus.pantaconnect.sdk.connectionservice.connection;

import androidx.autofill.HintConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmOverloads;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b!\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u007f\b\u0007\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\rJ\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0081\u0001\u0010#\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020(HÖ\u0001J\t\u0010)\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u000f¨\u0006*"}, d2 = {"Lcom/oplus/pantaconnect/sdk/connectionservice/connection/DirectDecision;", "", "macAddress", "", "advFreq", "remoteIp", "ssid", "tag", "deviceId", "kscAlias", "deviceKsc", "name", HintConstants.AUTOFILL_HINT_PASSWORD, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAdvFreq", "()Ljava/lang/String;", "getDeviceId", "getDeviceKsc", "getKscAlias", "getMacAddress", "getName", "getPassword", "getRemoteIp", "getSsid", "getTag", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "connectionservice_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class DirectDecision {

    @Nullable
    private final String advFreq;

    @Nullable
    private final String deviceId;

    @Nullable
    private final String deviceKsc;

    @Nullable
    private final String kscAlias;

    @Nullable
    private final String macAddress;

    @Nullable
    private final String name;

    @Nullable
    private final String password;

    @Nullable
    private final String remoteIp;

    @Nullable
    private final String ssid;

    @Nullable
    private final String tag;

    @JvmOverloads
    public DirectDecision() {
        this(null, null, null, null, null, null, null, null, null, null, 1023, null);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getMacAddress() {
        return this.macAddress;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getPassword() {
        return this.password;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAdvFreq() {
        return this.advFreq;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getRemoteIp() {
        return this.remoteIp;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getSsid() {
        return this.ssid;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getTag() {
        return this.tag;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getDeviceId() {
        return this.deviceId;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getKscAlias() {
        return this.kscAlias;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getDeviceKsc() {
        return this.deviceKsc;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final DirectDecision copy(@Nullable String macAddress, @Nullable String advFreq, @Nullable String remoteIp, @Nullable String ssid, @Nullable String tag, @Nullable String deviceId, @Nullable String kscAlias, @Nullable String deviceKsc, @Nullable String name, @Nullable String password) {
        return new DirectDecision(macAddress, advFreq, remoteIp, ssid, tag, deviceId, kscAlias, deviceKsc, name, password);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DirectDecision)) {
            return false;
        }
        DirectDecision directDecision = (DirectDecision) other;
        return Intrinsics.areEqual(this.macAddress, directDecision.macAddress) && Intrinsics.areEqual(this.advFreq, directDecision.advFreq) && Intrinsics.areEqual(this.remoteIp, directDecision.remoteIp) && Intrinsics.areEqual(this.ssid, directDecision.ssid) && Intrinsics.areEqual(this.tag, directDecision.tag) && Intrinsics.areEqual(this.deviceId, directDecision.deviceId) && Intrinsics.areEqual(this.kscAlias, directDecision.kscAlias) && Intrinsics.areEqual(this.deviceKsc, directDecision.deviceKsc) && Intrinsics.areEqual(this.name, directDecision.name) && Intrinsics.areEqual(this.password, directDecision.password);
    }

    @Nullable
    public final String getAdvFreq() {
        return this.advFreq;
    }

    @Nullable
    public final String getDeviceId() {
        return this.deviceId;
    }

    @Nullable
    public final String getDeviceKsc() {
        return this.deviceKsc;
    }

    @Nullable
    public final String getKscAlias() {
        return this.kscAlias;
    }

    @Nullable
    public final String getMacAddress() {
        return this.macAddress;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final String getPassword() {
        return this.password;
    }

    @Nullable
    public final String getRemoteIp() {
        return this.remoteIp;
    }

    @Nullable
    public final String getSsid() {
        return this.ssid;
    }

    @Nullable
    public final String getTag() {
        return this.tag;
    }

    public int hashCode() {
        String str = this.macAddress;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.advFreq;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.remoteIp;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.ssid;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.tag;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.deviceId;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.kscAlias;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.deviceKsc;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.name;
        int iHashCode9 = (iHashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.password;
        return iHashCode9 + (str10 != null ? str10.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "DirectDecision(macAddress=" + this.macAddress + ", advFreq=" + this.advFreq + ", remoteIp=" + this.remoteIp + ", ssid=" + this.ssid + ", tag=" + this.tag + ", deviceId=" + this.deviceId + ", kscAlias=" + this.kscAlias + ", deviceKsc=" + this.deviceKsc + ", name=" + this.name + ", password=" + this.password + ')';
    }

    @JvmOverloads
    public DirectDecision(@Nullable String str) {
        this(str, null, null, null, null, null, null, null, null, null, 1022, null);
    }

    @JvmOverloads
    public DirectDecision(@Nullable String str, @Nullable String str2) {
        this(str, str2, null, null, null, null, null, null, null, null, 1020, null);
    }

    @JvmOverloads
    public DirectDecision(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        this(str, str2, str3, null, null, null, null, null, null, null, 1016, null);
    }

    @JvmOverloads
    public DirectDecision(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
        this(str, str2, str3, str4, null, null, null, null, null, null, 1008, null);
    }

    @JvmOverloads
    public DirectDecision(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5) {
        this(str, str2, str3, str4, str5, null, null, null, null, null, 992, null);
    }

    @JvmOverloads
    public DirectDecision(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6) {
        this(str, str2, str3, str4, str5, str6, null, null, null, null, 960, null);
    }

    @JvmOverloads
    public DirectDecision(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7) {
        this(str, str2, str3, str4, str5, str6, str7, null, null, null, 896, null);
    }

    @JvmOverloads
    public DirectDecision(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8) {
        this(str, str2, str3, str4, str5, str6, str7, str8, null, null, 768, null);
    }

    @JvmOverloads
    public DirectDecision(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9) {
        this(str, str2, str3, str4, str5, str6, str7, str8, str9, null, 512, null);
    }

    @JvmOverloads
    public DirectDecision(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10) {
        this.macAddress = str;
        this.advFreq = str2;
        this.remoteIp = str3;
        this.ssid = str4;
        this.tag = str5;
        this.deviceId = str6;
        this.kscAlias = str7;
        this.deviceKsc = str8;
        this.name = str9;
        this.password = str10;
    }

    public /* synthetic */ DirectDecision(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : str8, (i & 256) != 0 ? null : str9, (i & 512) != 0 ? null : str10);
    }
}
