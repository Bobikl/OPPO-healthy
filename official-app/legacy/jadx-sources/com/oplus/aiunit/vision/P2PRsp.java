package com.oplus.aiunit.vision;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.v0e, reason: from toString */
/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\r\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\r\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u000e\u001a\u0004\b\t\u0010\u000f¨\u0006\u0013"}, d2 = {"Lcom/oplus/aiunit/vision/v0e;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "Z", "b", "()Z", "success", "Ljava/lang/String;", "()Ljava/lang/String;", "msg", "<init>", "(ZLjava/lang/String;)V", "oafhost_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class P2PRsp {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    public final boolean success;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    public final String msg;

    public P2PRsp(boolean z, @NotNull String msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        this.success = z;
        this.msg = msg;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getMsg() {
        return this.msg;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getSuccess() {
        return this.success;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof P2PRsp)) {
            return false;
        }
        P2PRsp p2PRsp = (P2PRsp) other;
        return this.success == p2PRsp.success && Intrinsics.areEqual(this.msg, p2PRsp.msg);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    public int hashCode() {
        boolean z = this.success;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        return (r0 * 31) + this.msg.hashCode();
    }

    @NotNull
    public String toString() {
        return "P2PRsp(success=" + this.success + ", msg=" + this.msg + ")";
    }

    public /* synthetic */ P2PRsp(boolean z, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, (i & 2) != 0 ? "" : str);
    }
}
