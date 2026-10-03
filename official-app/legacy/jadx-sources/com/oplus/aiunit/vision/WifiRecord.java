package com.oplus.aiunit.vision;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.jwl, reason: from toString */
/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0004¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\t\u0010\fR\u0017\u0010\u0012\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0010\u001a\u0004\b\u000e\u0010\u0011¨\u0006\u0015"}, d2 = {"Lcom/oplus/aiunit/vision/jwl;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "ssid", "b", "preSharedKey", "I", "()I", "securityType", "<init>", "(Ljava/lang/String;Ljava/lang/String;I)V", "wifi_impl_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class WifiRecord {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    public final String ssid;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    public final String preSharedKey;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    public final int securityType;

    public WifiRecord(@NotNull String ssid, @NotNull String preSharedKey, int i) {
        Intrinsics.checkNotNullParameter(ssid, "ssid");
        Intrinsics.checkNotNullParameter(preSharedKey, "preSharedKey");
        this.ssid = ssid;
        this.preSharedKey = preSharedKey;
        this.securityType = i;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getPreSharedKey() {
        return this.preSharedKey;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getSecurityType() {
        return this.securityType;
    }

    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getSsid() {
        return this.ssid;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WifiRecord)) {
            return false;
        }
        WifiRecord wifiRecord = (WifiRecord) other;
        return Intrinsics.areEqual(this.ssid, wifiRecord.ssid) && Intrinsics.areEqual(this.preSharedKey, wifiRecord.preSharedKey) && this.securityType == wifiRecord.securityType;
    }

    public int hashCode() {
        return (((this.ssid.hashCode() * 31) + this.preSharedKey.hashCode()) * 31) + Integer.hashCode(this.securityType);
    }

    @NotNull
    public String toString() {
        return "WifiRecord(ssid=" + this.ssid + ", preSharedKey=" + this.preSharedKey + ", securityType=" + this.securityType + ")";
    }
}
