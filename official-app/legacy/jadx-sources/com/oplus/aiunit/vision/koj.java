package com.oplus.aiunit.vision;

import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0006\b&\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0019\u001a\u00020\t\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u001a¢\u0006\u0004\b\u001e\u0010\u001fJ\b\u0010\u0003\u001a\u00020\u0002H&J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\n\u001a\u00020\tH\u0016R$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\bR\"\u0010\u0016\u001a\u00020\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0019\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0017\u001a\u0004\b\u0010\u0010\u0018R\u0017\u0010\u001d\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\b\r\u0010\u001b\u001a\u0004\b\u000b\u0010\u001c¨\u0006 "}, d2 = {"Lcom/oplus/aiunit/vision/koj;", "", "", "f", "Lcom/oplus/aiunit/vision/xoj;", "queue", "", MapSchema.FIELD_NAME_ENTRY, "(Lcom/oplus/aiunit/vision/xoj;)V", "", "toString", "a", "Lcom/oplus/aiunit/vision/xoj;", "d", "()Lcom/oplus/aiunit/vision/xoj;", "setQueue$okhttp4_extension_release", "b", "J", "c", "()J", b2n.f, "(J)V", "nextExecuteNanoTime", "Ljava/lang/String;", "()Ljava/lang/String;", "name", "", "Z", "()Z", "cancelable", "<init>", "(Ljava/lang/String;Z)V", "okhttp4_extension_release"}, k = 1, mv = {1, 4, 0})
public abstract class koj {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public xoj queue;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public long nextExecuteNanoTime;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String name;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final boolean cancelable;

    public koj(@NotNull String name, boolean z) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.name = name;
        this.cancelable = z;
        this.nextExecuteNanoTime = -1L;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getCancelable() {
        return this.cancelable;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final long getNextExecuteNanoTime() {
        return this.nextExecuteNanoTime;
    }

    @Nullable
    /* JADX INFO: renamed from: d, reason: from getter */
    public final xoj getQueue() {
        return this.queue;
    }

    public final void e(@NotNull xoj queue) {
        Intrinsics.checkNotNullParameter(queue, "queue");
        xoj xojVar = this.queue;
        if (xojVar == queue) {
            return;
        }
        if (!(xojVar == null)) {
            throw new IllegalStateException("task is in multiple queues".toString());
        }
        this.queue = queue;
    }

    public abstract long f();

    public final void g(long j2) {
        this.nextExecuteNanoTime = j2;
    }

    @NotNull
    public String toString() {
        return this.name;
    }

    public /* synthetic */ koj(String str, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? true : z);
    }
}
