package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.o83, reason: from toString */
/* JADX INFO: loaded from: classes15.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u000f\u001a\u00020\t\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0017\u0010\u0018J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u000f\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u0016\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, d2 = {"Lcom/oplus/aiunit/vision/o83;", "", "", "toString", "", "hashCode", "other", "", "equals", "", "a", "J", "()J", "setX", "(J)V", "x", "", "b", "Ljava/lang/Float;", "()Ljava/lang/Float;", "setY", "(Ljava/lang/Float;)V", "y", "<init>", "(JLjava/lang/Float;)V", "bodyfat_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class ChartXY {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    public long x;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @Nullable
    public Float y;

    public ChartXY(long j2, @Nullable Float f) {
        this.x = j2;
        this.y = f;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final long getX() {
        return this.x;
    }

    @Nullable
    /* JADX INFO: renamed from: b, reason: from getter */
    public final Float getY() {
        return this.y;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChartXY)) {
            return false;
        }
        ChartXY chartXY = (ChartXY) other;
        return this.x == chartXY.x && Intrinsics.areEqual((Object) this.y, (Object) chartXY.y);
    }

    public int hashCode() {
        int iHashCode = Long.hashCode(this.x) * 31;
        Float f = this.y;
        return iHashCode + (f == null ? 0 : f.hashCode());
    }

    @NotNull
    public String toString() {
        return "ChartXY(x=" + this.x + ", y=" + this.y + ")";
    }
}
