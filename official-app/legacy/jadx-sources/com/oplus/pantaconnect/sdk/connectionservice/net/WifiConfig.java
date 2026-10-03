package com.oplus.pantaconnect.sdk.connectionservice.net;

import java.util.BitSet;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f¨\u0006\u001a"}, d2 = {"Lcom/oplus/pantaconnect/sdk/connectionservice/net/WifiConfig;", "", "ssid", "", "preSharedKey", "allowedKeyManagement", "Ljava/util/BitSet;", "allowedKeyManagementStr", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/BitSet;Ljava/lang/String;)V", "getAllowedKeyManagement", "()Ljava/util/BitSet;", "getAllowedKeyManagementStr", "()Ljava/lang/String;", "getPreSharedKey", "getSsid", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "connectionservice_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class WifiConfig {

    @NotNull
    private final BitSet allowedKeyManagement;

    @NotNull
    private final String allowedKeyManagementStr;

    @NotNull
    private final String preSharedKey;

    @NotNull
    private final String ssid;

    public WifiConfig() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ WifiConfig copy$default(WifiConfig wifiConfig, String str, String str2, BitSet bitSet, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = wifiConfig.ssid;
        }
        if ((i & 2) != 0) {
            str2 = wifiConfig.preSharedKey;
        }
        if ((i & 4) != 0) {
            bitSet = wifiConfig.allowedKeyManagement;
        }
        if ((i & 8) != 0) {
            str3 = wifiConfig.allowedKeyManagementStr;
        }
        return wifiConfig.copy(str, str2, bitSet, str3);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSsid() {
        return this.ssid;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPreSharedKey() {
        return this.preSharedKey;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final BitSet getAllowedKeyManagement() {
        return this.allowedKeyManagement;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getAllowedKeyManagementStr() {
        return this.allowedKeyManagementStr;
    }

    @NotNull
    public final WifiConfig copy(@NotNull String ssid, @NotNull String preSharedKey, @NotNull BitSet allowedKeyManagement, @NotNull String allowedKeyManagementStr) {
        return new WifiConfig(ssid, preSharedKey, allowedKeyManagement, allowedKeyManagementStr);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WifiConfig)) {
            return false;
        }
        WifiConfig wifiConfig = (WifiConfig) other;
        return Intrinsics.areEqual(this.ssid, wifiConfig.ssid) && Intrinsics.areEqual(this.preSharedKey, wifiConfig.preSharedKey) && Intrinsics.areEqual(this.allowedKeyManagement, wifiConfig.allowedKeyManagement) && Intrinsics.areEqual(this.allowedKeyManagementStr, wifiConfig.allowedKeyManagementStr);
    }

    @NotNull
    public final BitSet getAllowedKeyManagement() {
        return this.allowedKeyManagement;
    }

    @NotNull
    public final String getAllowedKeyManagementStr() {
        return this.allowedKeyManagementStr;
    }

    @NotNull
    public final String getPreSharedKey() {
        return this.preSharedKey;
    }

    @NotNull
    public final String getSsid() {
        return this.ssid;
    }

    public int hashCode() {
        return this.allowedKeyManagementStr.hashCode() + ((this.allowedKeyManagement.hashCode() + ((this.preSharedKey.hashCode() + (this.ssid.hashCode() * 31)) * 31)) * 31);
    }

    @NotNull
    public String toString() {
        return "WifiConfig(ssid=" + this.ssid + ", preSharedKey=" + this.preSharedKey + ", allowedKeyManagement=" + this.allowedKeyManagement + ", allowedKeyManagementStr=" + this.allowedKeyManagementStr + ')';
    }

    public WifiConfig(@NotNull String str, @NotNull String str2, @NotNull BitSet bitSet, @NotNull String str3) {
        this.ssid = str;
        this.preSharedKey = str2;
        this.allowedKeyManagement = bitSet;
        this.allowedKeyManagementStr = str3;
    }

    public /* synthetic */ WifiConfig(String str, String str2, BitSet bitSet, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? new BitSet() : bitSet, (i & 8) != 0 ? "" : str3);
    }
}
