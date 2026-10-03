package com.oplus.pantaconnect.sdk.connectionservice.net;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/oplus/pantaconnect/sdk/connectionservice/net/WifiConfigOptions;", "", "ssid", "", "preSharedKey", "allowedKeyManagement", "(ZZZ)V", "getAllowedKeyManagement", "()Z", "getPreSharedKey", "getSsid", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "connectionservice_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class WifiConfigOptions {
    private final boolean allowedKeyManagement;
    private final boolean preSharedKey;
    private final boolean ssid;

    public WifiConfigOptions() {
        this(false, false, false, 7, null);
    }

    public static /* synthetic */ WifiConfigOptions copy$default(WifiConfigOptions wifiConfigOptions, boolean z, boolean z2, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            z = wifiConfigOptions.ssid;
        }
        if ((i & 2) != 0) {
            z2 = wifiConfigOptions.preSharedKey;
        }
        if ((i & 4) != 0) {
            z3 = wifiConfigOptions.allowedKeyManagement;
        }
        return wifiConfigOptions.copy(z, z2, z3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getSsid() {
        return this.ssid;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getPreSharedKey() {
        return this.preSharedKey;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getAllowedKeyManagement() {
        return this.allowedKeyManagement;
    }

    @NotNull
    public final WifiConfigOptions copy(boolean ssid, boolean preSharedKey, boolean allowedKeyManagement) {
        return new WifiConfigOptions(ssid, preSharedKey, allowedKeyManagement);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WifiConfigOptions)) {
            return false;
        }
        WifiConfigOptions wifiConfigOptions = (WifiConfigOptions) other;
        return this.ssid == wifiConfigOptions.ssid && this.preSharedKey == wifiConfigOptions.preSharedKey && this.allowedKeyManagement == wifiConfigOptions.allowedKeyManagement;
    }

    public final boolean getAllowedKeyManagement() {
        return this.allowedKeyManagement;
    }

    public final boolean getPreSharedKey() {
        return this.preSharedKey;
    }

    public final boolean getSsid() {
        return this.ssid;
    }

    public int hashCode() {
        return Boolean.hashCode(this.allowedKeyManagement) + ((Boolean.hashCode(this.preSharedKey) + (Boolean.hashCode(this.ssid) * 31)) * 31);
    }

    @NotNull
    public String toString() {
        return "WifiConfigOptions(ssid=" + this.ssid + ", preSharedKey=" + this.preSharedKey + ", allowedKeyManagement=" + this.allowedKeyManagement + ')';
    }

    public WifiConfigOptions(boolean z, boolean z2, boolean z3) {
        this.ssid = z;
        this.preSharedKey = z2;
        this.allowedKeyManagement = z3;
    }

    public /* synthetic */ WifiConfigOptions(boolean z, boolean z2, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z, (i & 2) != 0 ? true : z2, (i & 4) != 0 ? true : z3);
    }
}
