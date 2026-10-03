package com.oplus.aiunit.vision;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.av6, reason: from toString */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0080\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\r\u001a\u00020\t\u0012\u0006\u0010\u0011\u001a\u00020\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\r\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\fR\u0017\u0010\u0011\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010¨\u0006\u0014"}, d2 = {"Lcom/oplus/aiunit/vision/av6;", "", "", "toString", "", "hashCode", "other", "", "equals", "Lcom/oplus/aiunit/vision/nr9;", "a", "Lcom/oplus/aiunit/vision/nr9;", "()Lcom/oplus/aiunit/vision/nr9;", "executor", "b", "Z", "()Z", "uiThread", "<init>", "(Lcom/oplus/aiunit/vision/nr9;Z)V", "lib_webpro_jsbridge_release"}, k = 1, mv = {1, 4, 0})
public final /* data */ class ExecutorInfo {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    public final nr9 executor;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    public final boolean uiThread;

    public ExecutorInfo(@NotNull nr9 executor, boolean z) {
        Intrinsics.checkNotNullParameter(executor, "executor");
        this.executor = executor;
        this.uiThread = z;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final nr9 getExecutor() {
        return this.executor;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getUiThread() {
        return this.uiThread;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ExecutorInfo)) {
            return false;
        }
        ExecutorInfo executorInfo = (ExecutorInfo) other;
        return Intrinsics.areEqual(this.executor, executorInfo.executor) && this.uiThread == executorInfo.uiThread;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2, types: [int] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    public int hashCode() {
        nr9 nr9Var = this.executor;
        int iHashCode = (nr9Var != null ? nr9Var.hashCode() : 0) * 31;
        boolean z = this.uiThread;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return iHashCode + r1;
    }

    @NotNull
    public String toString() {
        return "ExecutorInfo(executor=" + this.executor + ", uiThread=" + this.uiThread + ")";
    }
}
