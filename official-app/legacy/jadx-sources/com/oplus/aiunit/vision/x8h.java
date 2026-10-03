package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u0010\u0010\u0011R\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\u000f\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\u0003\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/oplus/aiunit/vision/x8h;", "", "", "a", "I", "b", "()I", "setType", "(I)V", "type", "Lcom/oplus/aiunit/vision/ihh;", "Lcom/oplus/aiunit/vision/ihh;", "()Lcom/oplus/aiunit/vision/ihh;", "setSleepFrgBean", "(Lcom/oplus/aiunit/vision/ihh;)V", "sleepFrgBean", "<init>", "(ILcom/oplus/aiunit/vision/ihh;)V", "sleep_release"}, k = 1, mv = {1, 8, 0})
public final class x8h {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public int type;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public ihh sleepFrgBean;

    public x8h(int i, @NotNull ihh sleepFrgBean) {
        Intrinsics.checkNotNullParameter(sleepFrgBean, "sleepFrgBean");
        this.type = i;
        this.sleepFrgBean = sleepFrgBean;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final ihh getSleepFrgBean() {
        return this.sleepFrgBean;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getType() {
        return this.type;
    }
}
