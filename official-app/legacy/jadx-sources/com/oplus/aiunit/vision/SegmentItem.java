package com.oplus.aiunit.vision;

import android.content.res.Resources;
import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.sports.record.details.widget.SegmentTableColumnType;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.jrg, reason: from toString */
/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u000f\u001a\u00020\t\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0017\u0012\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u00020\u001e¢\u0006\u0004\b%\u0010&J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u000f\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\f\"\u0004\b\r\u0010\u000eR\"\u0010\u0016\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\"\u0010\u001d\u001a\u00020\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001a\"\u0004\b\u001b\u0010\u001cR.\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u00020\u001e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010 \u001a\u0004\b\u0010\u0010!\"\u0004\b\"\u0010#¨\u0006'"}, d2 = {"Lcom/oplus/aiunit/vision/jrg;", "", "", "toString", "", "hashCode", "other", "", "equals", "Lcom/heytap/sports/record/details/widget/SegmentTableColumnType;", "a", "Lcom/heytap/sports/record/details/widget/SegmentTableColumnType;", "()Lcom/heytap/sports/record/details/widget/SegmentTableColumnType;", "setColumnType", "(Lcom/heytap/sports/record/details/widget/SegmentTableColumnType;)V", "columnType", "b", "Z", "d", "()Z", "setBest", "(Z)V", "isBest", "", "c", "D", "()D", "f", "(D)V", "value", "Lkotlin/Function1;", "Landroid/content/res/Resources;", "Lkotlin/jvm/functions/Function1;", "()Lkotlin/jvm/functions/Function1;", MapSchema.FIELD_NAME_ENTRY, "(Lkotlin/jvm/functions/Function1;)V", "text", "<init>", "(Lcom/heytap/sports/record/details/widget/SegmentTableColumnType;ZDLkotlin/jvm/functions/Function1;)V", "sport_impl_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class SegmentItem {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    public SegmentTableColumnType columnType;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    public boolean isBest;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    public double value;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @NotNull
    public Function1<? super Resources, String> text;

    public SegmentItem(@NotNull SegmentTableColumnType columnType, boolean z, double d, @NotNull Function1<? super Resources, String> text) {
        Intrinsics.checkNotNullParameter(columnType, "columnType");
        Intrinsics.checkNotNullParameter(text, "text");
        this.columnType = columnType;
        this.isBest = z;
        this.value = d;
        this.text = text;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final SegmentTableColumnType getColumnType() {
        return this.columnType;
    }

    @NotNull
    public final Function1<Resources, String> b() {
        return this.text;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final double getValue() {
        return this.value;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getIsBest() {
        return this.isBest;
    }

    public final void e(@NotNull Function1<? super Resources, String> function1) {
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        this.text = function1;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SegmentItem)) {
            return false;
        }
        SegmentItem segmentItem = (SegmentItem) other;
        return this.columnType == segmentItem.columnType && this.isBest == segmentItem.isBest && Double.compare(this.value, segmentItem.value) == 0 && Intrinsics.areEqual(this.text, segmentItem.text);
    }

    public final void f(double d) {
        this.value = d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    public int hashCode() {
        int iHashCode = this.columnType.hashCode() * 31;
        boolean z = this.isBest;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return ((((iHashCode + r1) * 31) + Double.hashCode(this.value)) * 31) + this.text.hashCode();
    }

    @NotNull
    public String toString() {
        return "SegmentItem(columnType=" + this.columnType + ", isBest=" + this.isBest + ", value=" + this.value + ", text=" + this.text + ")";
    }

    public /* synthetic */ SegmentItem(SegmentTableColumnType segmentTableColumnType, boolean z, double d, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(segmentTableColumnType, (i & 2) != 0 ? false : z, (i & 4) != 0 ? 0.0d : d, function1);
    }
}
