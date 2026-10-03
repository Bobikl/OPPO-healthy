package com.health.health_seedlingcard.bean;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
@Keep
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0018"}, d2 = {"Lcom/health/health_seedlingcard/bean/yAxisDataItem;", "", "index", "", "label", "Lcom/health/health_seedlingcard/bean/yAxisLabelData;", "(ILcom/health/health_seedlingcard/bean/yAxisLabelData;)V", "getIndex", "()I", "setIndex", "(I)V", "getLabel", "()Lcom/health/health_seedlingcard/bean/yAxisLabelData;", "setLabel", "(Lcom/health/health_seedlingcard/bean/yAxisLabelData;)V", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "health_seedlingcard_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class yAxisDataItem {
    private int index;

    @NotNull
    private yAxisLabelData label;

    public yAxisDataItem(int i, @NotNull yAxisLabelData yaxislabeldata) {
        Intrinsics.checkNotNullParameter(yaxislabeldata, "label");
        this.index = i;
        this.label = yaxislabeldata;
    }

    public static /* synthetic */ yAxisDataItem copy$default(yAxisDataItem yaxisdataitem, int i, yAxisLabelData yaxislabeldata, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = yaxisdataitem.index;
        }
        if ((i2 & 2) != 0) {
            yaxislabeldata = yaxisdataitem.label;
        }
        return yaxisdataitem.copy(i, yaxislabeldata);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getIndex() {
        return this.index;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final yAxisLabelData getLabel() {
        return this.label;
    }

    @NotNull
    public final yAxisDataItem copy(int index, @NotNull yAxisLabelData label) {
        Intrinsics.checkNotNullParameter(label, "label");
        return new yAxisDataItem(index, label);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof yAxisDataItem)) {
            return false;
        }
        yAxisDataItem yaxisdataitem = (yAxisDataItem) other;
        return this.index == yaxisdataitem.index && Intrinsics.areEqual(this.label, yaxisdataitem.label);
    }

    public final int getIndex() {
        return this.index;
    }

    @NotNull
    public final yAxisLabelData getLabel() {
        return this.label;
    }

    public int hashCode() {
        return (Integer.hashCode(this.index) * 31) + this.label.hashCode();
    }

    public final void setIndex(int i) {
        this.index = i;
    }

    public final void setLabel(@NotNull yAxisLabelData yaxislabeldata) {
        Intrinsics.checkNotNullParameter(yaxislabeldata, "<set-?>");
        this.label = yaxislabeldata;
    }

    @NotNull
    public String toString() {
        return "yAxisDataItem(index=" + this.index + ", label=" + this.label + ")";
    }

    public /* synthetic */ yAxisDataItem(int i, yAxisLabelData yaxislabeldata, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, yaxislabeldata);
    }
}
