package com.oplus.aiunit.vision;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.t0e, reason: from toString */
/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\r\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\r\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0010\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\u000f\u0010\fR\u0017\u0010\u0013\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0011\u001a\u0004\b\t\u0010\u0012R\u0017\u0010\u0016\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0014\u001a\u0004\b\u000e\u0010\u0015¨\u0006\u0019"}, d2 = {"Lcom/oplus/aiunit/vision/t0e;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "Z", "d", "()Z", "wifiState", "b", "c", "p2pState", "I", "()I", "code", "Ljava/lang/String;", "()Ljava/lang/String;", "msg", "<init>", "(ZZILjava/lang/String;)V", "oafhost_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class P2PEnv {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    public final boolean wifiState;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    public final boolean p2pState;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    public final int code;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @NotNull
    public final String msg;

    public P2PEnv() {
        this(false, false, 0, null, 15, null);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getCode() {
        return this.code;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getMsg() {
        return this.msg;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getP2pState() {
        return this.p2pState;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getWifiState() {
        return this.wifiState;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof P2PEnv)) {
            return false;
        }
        P2PEnv p2PEnv = (P2PEnv) other;
        return this.wifiState == p2PEnv.wifiState && this.p2pState == p2PEnv.p2pState && this.code == p2PEnv.code && Intrinsics.areEqual(this.msg, p2PEnv.msg);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v4 */
    public int hashCode() {
        boolean z = this.wifiState;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        boolean z2 = this.p2pState;
        return ((((i + (z2 ? 1 : z2)) * 31) + Integer.hashCode(this.code)) * 31) + this.msg.hashCode();
    }

    @NotNull
    public String toString() {
        return "P2PEnv(wifiState=" + this.wifiState + ", p2pState=" + this.p2pState + ", code=" + this.code + ", msg=" + this.msg + ")";
    }

    public P2PEnv(boolean z, boolean z2, int i, @NotNull String msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        this.wifiState = z;
        this.p2pState = z2;
        this.code = i;
        this.msg = msg;
    }

    public /* synthetic */ P2PEnv(boolean z, boolean z2, int i, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? false : z2, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? "" : str);
    }
}
