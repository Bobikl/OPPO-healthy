package com.heytap.webview.extension.jsapi;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/heytap/webview/extension/jsapi/ExecutorInfo;", "", "executor", "Lcom/heytap/webview/extension/jsapi/IJsApiExecutor;", "uiThread", "", "(Lcom/heytap/webview/extension/jsapi/IJsApiExecutor;Z)V", "getExecutor", "()Lcom/heytap/webview/extension/jsapi/IJsApiExecutor;", "getUiThread", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "lib_webext_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class ExecutorInfo {

    @NotNull
    private final IJsApiExecutor executor;
    private final boolean uiThread;

    public ExecutorInfo(@NotNull IJsApiExecutor executor, boolean z) {
        Intrinsics.checkNotNullParameter(executor, "executor");
        this.executor = executor;
        this.uiThread = z;
    }

    public static /* synthetic */ ExecutorInfo copy$default(ExecutorInfo executorInfo, IJsApiExecutor iJsApiExecutor, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            iJsApiExecutor = executorInfo.executor;
        }
        if ((i & 2) != 0) {
            z = executorInfo.uiThread;
        }
        return executorInfo.copy(iJsApiExecutor, z);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final IJsApiExecutor getExecutor() {
        return this.executor;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getUiThread() {
        return this.uiThread;
    }

    @NotNull
    public final ExecutorInfo copy(@NotNull IJsApiExecutor executor, boolean uiThread) {
        Intrinsics.checkNotNullParameter(executor, "executor");
        return new ExecutorInfo(executor, uiThread);
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

    @NotNull
    public final IJsApiExecutor getExecutor() {
        return this.executor;
    }

    public final boolean getUiThread() {
        return this.uiThread;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2, types: [int] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    public int hashCode() {
        int iHashCode = this.executor.hashCode() * 31;
        boolean z = this.uiThread;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return iHashCode + r1;
    }

    @NotNull
    public String toString() {
        return "ExecutorInfo(executor=" + this.executor + ", uiThread=" + this.uiThread + ')';
    }
}
