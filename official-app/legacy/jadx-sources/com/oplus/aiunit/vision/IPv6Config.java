package com.oplus.aiunit.vision;

import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmOverloads;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.vv9, reason: from toString */
/* JADX INFO: loaded from: classes18.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0015\b\u0086\b\u0018\u00002\u00020\u0001B9\b\u0007\u0012\u0006\u0010\u000f\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0002\u0012\b\b\u0002\u0010 \u001a\u00020\u0002\u0012\b\b\u0002\u0010\"\u001a\u00020\u0002¢\u0006\u0004\b#\u0010$J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u000f\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\"\u0010\u0016\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013\"\u0004\b\u0014\u0010\u0015R \u0010\u001c\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010\u0017\u0012\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0018\u0010\u0019R \u0010 \u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001d\u0010\u0017\u0012\u0004\b\u001f\u0010\u001b\u001a\u0004\b\u001e\u0010\u0019R\"\u0010\"\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u0017\u001a\u0004\b\t\u0010\u0019\"\u0004\b\u001d\u0010!¨\u0006%"}, d2 = {"Lcom/oplus/aiunit/vision/vv9;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "Z", "c", "()Z", MapSchema.FIELD_NAME_ENTRY, "(Z)V", "useIpv6Switcher", "", "b", "J", "()J", "setIpv6ConfigId", "(J)V", "ipv6ConfigId", "Ljava/lang/String;", "getChannelId", "()Ljava/lang/String;", "getChannelId$annotations", "()V", "channelId", "d", "getBuildNumber", "getBuildNumber$annotations", "buildNumber", "(Ljava/lang/String;)V", "ipv6ConfigCode", "<init>", "(ZJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "okhttp4_extension_release"}, k = 1, mv = {1, 4, 0})
public final /* data */ class IPv6Config {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    public boolean useIpv6Switcher;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    public long ipv6ConfigId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @NotNull
    public final String channelId;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @NotNull
    public final String buildNumber;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    @NotNull
    public String ipv6ConfigCode;

    @JvmOverloads
    public IPv6Config(boolean z, long j2, @NotNull String channelId, @NotNull String buildNumber, @NotNull String ipv6ConfigCode) {
        Intrinsics.checkNotNullParameter(channelId, "channelId");
        Intrinsics.checkNotNullParameter(buildNumber, "buildNumber");
        Intrinsics.checkNotNullParameter(ipv6ConfigCode, "ipv6ConfigCode");
        this.useIpv6Switcher = z;
        this.ipv6ConfigId = j2;
        this.channelId = channelId;
        this.buildNumber = buildNumber;
        this.ipv6ConfigCode = ipv6ConfigCode;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getIpv6ConfigCode() {
        return this.ipv6ConfigCode;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final long getIpv6ConfigId() {
        return this.ipv6ConfigId;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getUseIpv6Switcher() {
        return this.useIpv6Switcher;
    }

    public final void d(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.ipv6ConfigCode = str;
    }

    public final void e(boolean z) {
        this.useIpv6Switcher = z;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IPv6Config)) {
            return false;
        }
        IPv6Config iPv6Config = (IPv6Config) other;
        return this.useIpv6Switcher == iPv6Config.useIpv6Switcher && this.ipv6ConfigId == iPv6Config.ipv6ConfigId && Intrinsics.areEqual(this.channelId, iPv6Config.channelId) && Intrinsics.areEqual(this.buildNumber, iPv6Config.buildNumber) && Intrinsics.areEqual(this.ipv6ConfigCode, iPv6Config.ipv6ConfigCode);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    public int hashCode() {
        boolean z = this.useIpv6Switcher;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int iHashCode = ((r0 * 31) + Long.hashCode(this.ipv6ConfigId)) * 31;
        String str = this.channelId;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.buildNumber;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.ipv6ConfigCode;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "IPv6Config(useIpv6Switcher=" + this.useIpv6Switcher + ", ipv6ConfigId=" + this.ipv6ConfigId + ", channelId=" + this.channelId + ", buildNumber=" + this.buildNumber + ", ipv6ConfigCode=" + this.ipv6ConfigCode + ")";
    }
}
