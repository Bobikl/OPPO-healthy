package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.nearx.tangramconfig.strategy.Fields;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.rva, reason: from toString */
/* JADX INFO: loaded from: classes16.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\r\u001a\u00020\t\u0012\u0006\u0010\u0011\u001a\u00020\u0004\u0012\u0006\u0010\u0013\u001a\u00020\u0004¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\r\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\fR\u0017\u0010\u0011\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010R\u0017\u0010\u0013\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0012\u0010\u0010¨\u0006\u0016"}, d2 = {"Lcom/oplus/aiunit/vision/rva;", "", "", "toString", "", "hashCode", "other", "", "equals", "Lcom/oplus/aiunit/vision/qva;", "a", "Lcom/oplus/aiunit/vision/qva;", "()Lcom/oplus/aiunit/vision/qva;", "legend", "b", "I", "()I", "rowNum", "c", Fields.WIDTH_FIELD, "<init>", "(Lcom/oplus/aiunit/vision/qva;II)V", "health_impl_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class LegendWrapper {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    public final LegendPair legend;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    public final int rowNum;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    public final int width;

    public LegendWrapper(@NotNull LegendPair legend, int i, int i2) {
        Intrinsics.checkNotNullParameter(legend, "legend");
        this.legend = legend;
        this.rowNum = i;
        this.width = i2;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final LegendPair getLegend() {
        return this.legend;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getRowNum() {
        return this.rowNum;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getWidth() {
        return this.width;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LegendWrapper)) {
            return false;
        }
        LegendWrapper legendWrapper = (LegendWrapper) other;
        return Intrinsics.areEqual(this.legend, legendWrapper.legend) && this.rowNum == legendWrapper.rowNum && this.width == legendWrapper.width;
    }

    public int hashCode() {
        return (((this.legend.hashCode() * 31) + Integer.hashCode(this.rowNum)) * 31) + Integer.hashCode(this.width);
    }

    @NotNull
    public String toString() {
        return "LegendWrapper(legend=" + this.legend + ", rowNum=" + this.rowNum + ", width=" + this.width + ")";
    }
}
