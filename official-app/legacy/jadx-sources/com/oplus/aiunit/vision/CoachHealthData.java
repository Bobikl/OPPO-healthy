package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.qj3, reason: from toString */
/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\rJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u000e\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Lcom/oplus/aiunit/vision/qj3;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "I", "()I", "setSleepRecommend", "(I)V", "sleepRecommend", "<init>", "sport_impl_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class CoachHealthData {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    public int sleepRecommend;

    public CoachHealthData() {
        this(0, 1, null);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getSleepRecommend() {
        return this.sleepRecommend;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof CoachHealthData) && this.sleepRecommend == ((CoachHealthData) other).sleepRecommend;
    }

    public int hashCode() {
        return Integer.hashCode(this.sleepRecommend);
    }

    @NotNull
    public String toString() {
        return "CoachHealthData(sleepRecommend=" + this.sleepRecommend + ")";
    }

    public CoachHealthData(int i) {
        this.sleepRecommend = i;
    }

    public /* synthetic */ CoachHealthData(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i);
    }
}
