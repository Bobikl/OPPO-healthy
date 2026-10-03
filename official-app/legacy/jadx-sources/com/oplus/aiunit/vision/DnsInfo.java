package com.oplus.aiunit.vision;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.ux5, reason: from toString */
/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0012\u001a\u00020\r\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0004¢\u0006\u0004\b\u0018\u0010\u0019J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000bR\u0017\u0010\u0012\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0016\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0017\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u000e\u0010\u0015¨\u0006\u001a"}, d2 = {"Lcom/oplus/aiunit/vision/ux5;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "ip", "", "b", "J", "c", "()J", "ttl", "I", "d", "()I", "weight", "port", "<init>", "(Ljava/lang/String;JII)V", "com.heytap.nearx.httpdns"}, k = 1, mv = {1, 4, 0})
public final /* data */ class DnsInfo {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    public final String ip;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    public final long ttl;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    public final int weight;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    public final int port;

    public DnsInfo(@NotNull String ip, long j2, int i, int i2) {
        Intrinsics.checkNotNullParameter(ip, "ip");
        this.ip = ip;
        this.ttl = j2;
        this.weight = i;
        this.port = i2;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getIp() {
        return this.ip;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getPort() {
        return this.port;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final long getTtl() {
        return this.ttl;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getWeight() {
        return this.weight;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DnsInfo)) {
            return false;
        }
        DnsInfo dnsInfo = (DnsInfo) other;
        return Intrinsics.areEqual(this.ip, dnsInfo.ip) && this.ttl == dnsInfo.ttl && this.weight == dnsInfo.weight && this.port == dnsInfo.port;
    }

    public int hashCode() {
        String str = this.ip;
        int iHashCode = str != null ? str.hashCode() : 0;
        long j2 = this.ttl;
        return (((((iHashCode * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + this.weight) * 31) + this.port;
    }

    @NotNull
    public String toString() {
        return "DnsInfo(ip=" + this.ip + ", ttl=" + this.ttl + ", weight=" + this.weight + ", port=" + this.port + ")";
    }
}
