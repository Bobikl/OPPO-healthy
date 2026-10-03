package com.oplus.aiunit.vision;

import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.nf4, reason: from toString */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0004¢\u0006\u0004\b\u001b\u0010\u001cJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R$\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\n\u001a\u0004\b\t\u0010\f\"\u0004\b\u0011\u0010\u000eR$\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\n\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0014\u0010\u000eR\"\u0010\u001a\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u0016\u001a\u0004\b\u0013\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006\u001d"}, d2 = {"Lcom/oplus/aiunit/vision/nf4;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "f", "(Ljava/lang/String;)V", "serverName", "b", MapSchema.FIELD_NAME_ENTRY, "customUrl", "c", "setIp", "ip", "I", "()I", "setPort", "(I)V", "port", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "speechEngine_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class CustomInfo {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @Nullable
    public String serverName;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @Nullable
    public String customUrl;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @Nullable
    public String ip;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    public int port;

    public CustomInfo() {
        this(null, null, null, 0, 15, null);
    }

    @Nullable
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getCustomUrl() {
        return this.customUrl;
    }

    @Nullable
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getIp() {
        return this.ip;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getPort() {
        return this.port;
    }

    @Nullable
    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getServerName() {
        return this.serverName;
    }

    public final void e(@Nullable String str) {
        this.customUrl = str;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CustomInfo)) {
            return false;
        }
        CustomInfo customInfo = (CustomInfo) other;
        return Intrinsics.areEqual(this.serverName, customInfo.serverName) && Intrinsics.areEqual(this.customUrl, customInfo.customUrl) && Intrinsics.areEqual(this.ip, customInfo.ip) && this.port == customInfo.port;
    }

    public final void f(@Nullable String str) {
        this.serverName = str;
    }

    public int hashCode() {
        String str = this.serverName;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.customUrl;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.ip;
        return ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + Integer.hashCode(this.port);
    }

    @NotNull
    public String toString() {
        return "CustomInfo(serverName=" + ((Object) this.serverName) + ", customUrl=" + ((Object) this.customUrl) + ", ip=" + ((Object) this.ip) + ", port=" + this.port + ')';
    }

    public CustomInfo(@Nullable String str, @Nullable String str2, @Nullable String str3, int i) {
        this.serverName = str;
        this.customUrl = str2;
        this.ip = str3;
        this.port = i;
    }

    public /* synthetic */ CustomInfo(String str, String str2, String str3, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? null : str2, (i2 & 4) != 0 ? null : str3, (i2 & 8) != 0 ? 0 : i);
    }
}
