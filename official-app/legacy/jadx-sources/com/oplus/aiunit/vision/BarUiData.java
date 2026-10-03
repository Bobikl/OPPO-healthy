package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Size;
import com.heytap.databaseengine.model.UserInfo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.ky0, reason: from toString */
/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\"\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\u0006\u0010\u0013\u001a\u00020\u000f\u0012\u0006\u0010\u0016\u001a\u00020\u0014ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR \u0010\u0013\u001a\u00020\u000f8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012R \u0010\u0016\u001a\u00020\u00148\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0011\u001a\u0004\b\n\u0010\u0012\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0019"}, d2 = {"Lcom/oplus/aiunit/vision/ky0;", "", "", "toString", "", "hashCode", "other", "", "equals", "", "a", UserInfo.SEX_FEMALE, "getValue", "()F", "value", "Landroidx/compose/ui/geometry/Offset;", "b", "J", "()J", "bottomStartOffset", "Landroidx/compose/ui/geometry/Size;", "c", "barSize", "<init>", "(FJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "sport_impl_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class BarUiData {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    public final float value;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    public final long bottomStartOffset;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    public final long barSize;

    public /* synthetic */ BarUiData(float f, long j2, long j3, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, j2, j3);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final long getBarSize() {
        return this.barSize;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final long getBottomStartOffset() {
        return this.bottomStartOffset;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BarUiData)) {
            return false;
        }
        BarUiData barUiData = (BarUiData) other;
        return Float.compare(this.value, barUiData.value) == 0 && Offset.m1377equalsimpl0(this.bottomStartOffset, barUiData.bottomStartOffset) && Size.m1445equalsimpl0(this.barSize, barUiData.barSize);
    }

    public int hashCode() {
        return (((Float.hashCode(this.value) * 31) + Offset.m1382hashCodeimpl(this.bottomStartOffset)) * 31) + Size.m1450hashCodeimpl(this.barSize);
    }

    @NotNull
    public String toString() {
        return "BarUiData(value=" + this.value + ", bottomStartOffset=" + Offset.m1388toStringimpl(this.bottomStartOffset) + ", barSize=" + Size.m1453toStringimpl(this.barSize) + ")";
    }

    public BarUiData(float f, long j2, long j3) {
        this.value = f;
        this.bottomStartOffset = j2;
        this.barSize = j3;
    }
}
