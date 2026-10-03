package com.oplus.aiunit.vision;

import android.os.Handler;
import android.os.HandlerThread;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.yg8, reason: from toString */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0017\u0010\u0018J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R$\u0010\u0010\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR$\u0010\u0016\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0012\u001a\u0004\b\n\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, d2 = {"Lcom/oplus/aiunit/vision/yg8;", "", "", "toString", "", "hashCode", "other", "", "equals", "Landroid/os/HandlerThread;", "a", "Landroid/os/HandlerThread;", "b", "()Landroid/os/HandlerThread;", "d", "(Landroid/os/HandlerThread;)V", "thread", "Landroid/os/Handler;", "Landroid/os/Handler;", "()Landroid/os/Handler;", "c", "(Landroid/os/Handler;)V", "handler", "<init>", "(Landroid/os/HandlerThread;Landroid/os/Handler;)V", "animplayer_release"}, k = 1, mv = {1, 4, 0})
public final /* data */ class HandlerHolder {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @Nullable
    public HandlerThread thread;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @Nullable
    public Handler handler;

    public HandlerHolder(@Nullable HandlerThread handlerThread, @Nullable Handler handler) {
        this.thread = handlerThread;
        this.handler = handler;
    }

    @Nullable
    /* JADX INFO: renamed from: a, reason: from getter */
    public final Handler getHandler() {
        return this.handler;
    }

    @Nullable
    /* JADX INFO: renamed from: b, reason: from getter */
    public final HandlerThread getThread() {
        return this.thread;
    }

    public final void c(@Nullable Handler handler) {
        this.handler = handler;
    }

    public final void d(@Nullable HandlerThread handlerThread) {
        this.thread = handlerThread;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HandlerHolder)) {
            return false;
        }
        HandlerHolder handlerHolder = (HandlerHolder) other;
        return Intrinsics.areEqual(this.thread, handlerHolder.thread) && Intrinsics.areEqual(this.handler, handlerHolder.handler);
    }

    public int hashCode() {
        HandlerThread handlerThread = this.thread;
        int iHashCode = (handlerThread != null ? handlerThread.hashCode() : 0) * 31;
        Handler handler = this.handler;
        return iHashCode + (handler != null ? handler.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "HandlerHolder(thread=" + this.thread + ", handler=" + this.handler + ")";
    }
}
