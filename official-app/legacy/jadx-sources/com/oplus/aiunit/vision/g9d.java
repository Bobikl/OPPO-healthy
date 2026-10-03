package com.oplus.aiunit.vision;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\r\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0004¢\u0006\u0004\b\u0017\u0010\u0018J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\n\u001a\u0004\b\t\u0010\fR\u0017\u0010\u0011\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\u0010\u0010\fR\u0017\u0010\u0016\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, d2 = {"Lcom/oplus/aiunit/vision/g9d;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "pwd", "nname", "c", "getMac", "mac", "d", "I", "getGroupOperatingFrequency", "()I", "groupOperatingFrequency", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "oafhost_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class g9d {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final String pwd;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final String nname;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String mac;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final int groupOperatingFrequency;

    public g9d() {
        this(null, null, null, 0, 15, null);
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getNname() {
        return this.nname;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getPwd() {
        return this.pwd;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof g9d)) {
            return false;
        }
        g9d g9dVar = (g9d) other;
        return Intrinsics.areEqual(this.pwd, g9dVar.pwd) && Intrinsics.areEqual(this.nname, g9dVar.nname) && Intrinsics.areEqual(this.mac, g9dVar.mac) && this.groupOperatingFrequency == g9dVar.groupOperatingFrequency;
    }

    public int hashCode() {
        return (((((this.pwd.hashCode() * 31) + this.nname.hashCode()) * 31) + this.mac.hashCode()) * 31) + Integer.hashCode(this.groupOperatingFrequency);
    }

    @NotNull
    public String toString() {
        return "pwd=123*****,name=DIR*****,mac=00*****";
    }

    public g9d(@NotNull String pwd, @NotNull String nname, @NotNull String mac, int i) {
        Intrinsics.checkNotNullParameter(pwd, "pwd");
        Intrinsics.checkNotNullParameter(nname, "nname");
        Intrinsics.checkNotNullParameter(mac, "mac");
        this.pwd = pwd;
        this.nname = nname;
        this.mac = mac;
        this.groupOperatingFrequency = i;
    }

    public /* synthetic */ g9d(String str, String str2, String str3, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "oh12348765" : str, (i2 & 2) != 0 ? "DIRECT-owp2p" : str2, (i2 & 4) != 0 ? "" : str3, (i2 & 8) != 0 ? 0 : i);
    }
}
