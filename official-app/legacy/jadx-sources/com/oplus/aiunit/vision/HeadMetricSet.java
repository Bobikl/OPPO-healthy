package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.sports.home.compose.HeadMetricField;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.th8, reason: from toString */
/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0019\u0010\u0010\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\n\u0010\rR\u0019\u0010\u0011\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\f\u0010\u000b\u001a\u0004\b\u000f\u0010\r¨\u0006\u0014"}, d2 = {"Lcom/oplus/aiunit/vision/th8;", "", "", "toString", "", "hashCode", "other", "", "equals", "Lcom/heytap/sports/home/compose/HeadMetricField;", "a", "Lcom/heytap/sports/home/compose/HeadMetricField;", "c", "()Lcom/heytap/sports/home/compose/HeadMetricField;", "primary", "b", "bottomLeft", "bottomRight", "<init>", "(Lcom/heytap/sports/home/compose/HeadMetricField;Lcom/heytap/sports/home/compose/HeadMetricField;Lcom/heytap/sports/home/compose/HeadMetricField;)V", "sport_impl_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class HeadMetricSet {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    public final HeadMetricField primary;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @Nullable
    public final HeadMetricField bottomLeft;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @Nullable
    public final HeadMetricField bottomRight;

    public HeadMetricSet(@NotNull HeadMetricField primary, @Nullable HeadMetricField headMetricField, @Nullable HeadMetricField headMetricField2) {
        Intrinsics.checkNotNullParameter(primary, "primary");
        this.primary = primary;
        this.bottomLeft = headMetricField;
        this.bottomRight = headMetricField2;
    }

    @Nullable
    /* JADX INFO: renamed from: a, reason: from getter */
    public final HeadMetricField getBottomLeft() {
        return this.bottomLeft;
    }

    @Nullable
    /* JADX INFO: renamed from: b, reason: from getter */
    public final HeadMetricField getBottomRight() {
        return this.bottomRight;
    }

    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public final HeadMetricField getPrimary() {
        return this.primary;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HeadMetricSet)) {
            return false;
        }
        HeadMetricSet headMetricSet = (HeadMetricSet) other;
        return this.primary == headMetricSet.primary && this.bottomLeft == headMetricSet.bottomLeft && this.bottomRight == headMetricSet.bottomRight;
    }

    public int hashCode() {
        int iHashCode = this.primary.hashCode() * 31;
        HeadMetricField headMetricField = this.bottomLeft;
        int iHashCode2 = (iHashCode + (headMetricField == null ? 0 : headMetricField.hashCode())) * 31;
        HeadMetricField headMetricField2 = this.bottomRight;
        return iHashCode2 + (headMetricField2 != null ? headMetricField2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "HeadMetricSet(primary=" + this.primary + ", bottomLeft=" + this.bottomLeft + ", bottomRight=" + this.bottomRight + ")";
    }
}
