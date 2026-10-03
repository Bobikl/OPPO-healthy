package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes18.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0010\u0010\u0011R$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\u000f\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\u0003\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/oplus/aiunit/vision/vbh;", "", "Lcom/oplus/aiunit/vision/tqh;", "a", "Lcom/oplus/aiunit/vision/tqh;", "b", "()Lcom/oplus/aiunit/vision/tqh;", "d", "(Lcom/oplus/aiunit/vision/tqh;)V", "sleepTimeComparedBean", "Lcom/oplus/aiunit/vision/cnh;", "Lcom/oplus/aiunit/vision/cnh;", "()Lcom/oplus/aiunit/vision/cnh;", "c", "(Lcom/oplus/aiunit/vision/cnh;)V", "sleepScoreComparedBean", "<init>", "()V", "sleep_release"}, k = 1, mv = {1, 8, 0})
public final class vbh {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public tqh sleepTimeComparedBean;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public cnh sleepScoreComparedBean;

    @Nullable
    /* JADX INFO: renamed from: a, reason: from getter */
    public final cnh getSleepScoreComparedBean() {
        return this.sleepScoreComparedBean;
    }

    @Nullable
    /* JADX INFO: renamed from: b, reason: from getter */
    public final tqh getSleepTimeComparedBean() {
        return this.sleepTimeComparedBean;
    }

    public final void c(@Nullable cnh cnhVar) {
        this.sleepScoreComparedBean = cnhVar;
    }

    public final void d(@Nullable tqh tqhVar) {
        this.sleepTimeComparedBean = tqhVar;
    }
}
