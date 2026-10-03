package com.oplus.aiunit.vision;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.l3d, reason: from toString */
/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\r\u001a\u00020\u0007\u0012\u0006\u0010\u0012\u001a\u00020\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\r\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0012\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"Lcom/oplus/aiunit/vision/l3d;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "Z", "getFinish", "()Z", "finish", "b", "Ljava/lang/String;", "getError", "()Ljava/lang/String;", "error", "<init>", "(ZLjava/lang/String;)V", "device_pair_impl_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class OOBEState {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    public final boolean finish;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    public final String error;

    public OOBEState(boolean z, @NotNull String error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.finish = z;
        this.error = error;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OOBEState)) {
            return false;
        }
        OOBEState oOBEState = (OOBEState) other;
        return this.finish == oOBEState.finish && Intrinsics.areEqual(this.error, oOBEState.error);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    public int hashCode() {
        boolean z = this.finish;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        return (r0 * 31) + this.error.hashCode();
    }

    @NotNull
    public String toString() {
        return "OOBEState(finish=" + this.finish + ", error=" + this.error + ")";
    }
}
