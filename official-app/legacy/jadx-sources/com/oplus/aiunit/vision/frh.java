package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes18.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0010\u0010\u0011R$\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005\"\u0004\b\u0006\u0010\u0007R$\u0010\u000f\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/oplus/aiunit/vision/frh;", "", "Lcom/oplus/aiunit/vision/dkh;", "a", "Lcom/oplus/aiunit/vision/dkh;", "()Lcom/oplus/aiunit/vision/dkh;", "b", "(Lcom/oplus/aiunit/vision/dkh;)V", "sleepLawBean", "Lcom/oplus/aiunit/vision/wph;", "Lcom/oplus/aiunit/vision/wph;", "getSleepStandardBean", "()Lcom/oplus/aiunit/vision/wph;", "c", "(Lcom/oplus/aiunit/vision/wph;)V", "sleepStandardBean", "<init>", "()V", "sleep_release"}, k = 1, mv = {1, 8, 0})
public final class frh {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public dkh sleepLawBean;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public SleepStandardBean sleepStandardBean;

    @Nullable
    /* JADX INFO: renamed from: a, reason: from getter */
    public final dkh getSleepLawBean() {
        return this.sleepLawBean;
    }

    public final void b(@Nullable dkh dkhVar) {
        this.sleepLawBean = dkhVar;
    }

    public final void c(@Nullable SleepStandardBean sleepStandardBean) {
        this.sleepStandardBean = sleepStandardBean;
    }
}
