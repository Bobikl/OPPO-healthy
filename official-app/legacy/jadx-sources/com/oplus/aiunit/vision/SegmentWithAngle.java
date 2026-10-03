package com.oplus.aiunit.vision;

import com.heytap.databaseengine.model.UserInfo;
import com.heytap.health.menstrual_period.view.compose.PhaseSegment;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.prg, reason: from toString */
/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\b\b\u0082\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\u0006\u0010\u0012\u001a\u00020\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u000f¢\u0006\u0004\b\u0015\u0010\u0016J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0012\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\f\u0010\u0010\u001a\u0004\b\n\u0010\u0011R\u0017\u0010\u0014\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0013\u0010\u0011¨\u0006\u0017"}, d2 = {"Lcom/oplus/aiunit/vision/prg;", "", "", "toString", "", "hashCode", "other", "", "equals", "Lcom/heytap/health/menstrual_period/view/compose/b;", "a", "Lcom/heytap/health/menstrual_period/view/compose/b;", "b", "()Lcom/heytap/health/menstrual_period/view/compose/b;", "segment", "", UserInfo.SEX_FEMALE, "()F", "segStartAngle", "c", "sweepAngle", "<init>", "(Lcom/heytap/health/menstrual_period/view/compose/b;FF)V", "menstrual_period_impl_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class SegmentWithAngle {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    public final PhaseSegment segment;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    public final float segStartAngle;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    public final float sweepAngle;

    public SegmentWithAngle(@NotNull PhaseSegment segment, float f, float f2) {
        Intrinsics.checkNotNullParameter(segment, "segment");
        this.segment = segment;
        this.segStartAngle = f;
        this.sweepAngle = f2;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final float getSegStartAngle() {
        return this.segStartAngle;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final PhaseSegment getSegment() {
        return this.segment;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final float getSweepAngle() {
        return this.sweepAngle;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SegmentWithAngle)) {
            return false;
        }
        SegmentWithAngle segmentWithAngle = (SegmentWithAngle) other;
        return Intrinsics.areEqual(this.segment, segmentWithAngle.segment) && Float.compare(this.segStartAngle, segmentWithAngle.segStartAngle) == 0 && Float.compare(this.sweepAngle, segmentWithAngle.sweepAngle) == 0;
    }

    public int hashCode() {
        return (((this.segment.hashCode() * 31) + Float.hashCode(this.segStartAngle)) * 31) + Float.hashCode(this.sweepAngle);
    }

    @NotNull
    public String toString() {
        return "SegmentWithAngle(segment=" + this.segment + ", segStartAngle=" + this.segStartAngle + ", sweepAngle=" + this.sweepAngle + ")";
    }
}
