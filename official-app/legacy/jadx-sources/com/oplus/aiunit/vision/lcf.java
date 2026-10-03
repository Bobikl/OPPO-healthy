package com.oplus.aiunit.vision;

import java.util.concurrent.atomic.AtomicBoolean;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b&\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003B\u001b\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\b¢\u0006\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0007\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R#\u0010\r\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/oplus/aiunit/vision/lcf;", "In", "Out", "", "Ljava/util/concurrent/atomic/AtomicBoolean;", "a", "Ljava/util/concurrent/atomic/AtomicBoolean;", "executedFlag", "Lcom/oplus/aiunit/vision/wn9;", "b", "Lcom/oplus/aiunit/vision/wn9;", "getStepTask", "()Lcom/oplus/aiunit/vision/wn9;", "stepTask", "<init>", "(Lcom/oplus/aiunit/vision/wn9;)V", "com.oplus.nearx.cloudconfig"}, k = 1, mv = {1, 4, 0})
public abstract class lcf<In, Out> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public AtomicBoolean executedFlag;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final wn9<In, Out> stepTask;

    public lcf(@NotNull wn9<In, Out> stepTask) {
        Intrinsics.checkParameterIsNotNull(stepTask, "stepTask");
        this.stepTask = stepTask;
        this.executedFlag = new AtomicBoolean(false);
    }
}
