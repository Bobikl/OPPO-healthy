package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.a8l, reason: from toString */
/* JADX INFO: loaded from: classes16.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000bR\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\r\u0010\u000b¨\u0006\u0011"}, d2 = {"Lcom/oplus/aiunit/vision/a8l;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "timeRange", "b", "valueRange", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "family_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class WarningDisplayItem {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    public final String timeRange;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    public final String valueRange;

    public WarningDisplayItem(@NotNull String timeRange, @NotNull String valueRange) {
        Intrinsics.checkNotNullParameter(timeRange, "timeRange");
        Intrinsics.checkNotNullParameter(valueRange, "valueRange");
        this.timeRange = timeRange;
        this.valueRange = valueRange;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getTimeRange() {
        return this.timeRange;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getValueRange() {
        return this.valueRange;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WarningDisplayItem)) {
            return false;
        }
        WarningDisplayItem warningDisplayItem = (WarningDisplayItem) other;
        return Intrinsics.areEqual(this.timeRange, warningDisplayItem.timeRange) && Intrinsics.areEqual(this.valueRange, warningDisplayItem.valueRange);
    }

    public int hashCode() {
        return (this.timeRange.hashCode() * 31) + this.valueRange.hashCode();
    }

    @NotNull
    public String toString() {
        return "WarningDisplayItem(timeRange=" + this.timeRange + ", valueRange=" + this.valueRange + ")";
    }
}
