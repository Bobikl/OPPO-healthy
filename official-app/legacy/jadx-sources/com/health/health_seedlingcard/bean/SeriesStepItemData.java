package com.health.health_seedlingcard.bean;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes14.dex */
@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0007\"\u0004\b\u000b\u0010\t¨\u0006\u0015"}, d2 = {"Lcom/health/health_seedlingcard/bean/SeriesStepItemData;", "", "index", "", "value", "(II)V", "getIndex", "()I", "setIndex", "(I)V", "getValue", "setValue", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "health_seedlingcard_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class SeriesStepItemData {
    private int index;
    private int value;

    public SeriesStepItemData(int i, int i2) {
        this.index = i;
        this.value = i2;
    }

    public static /* synthetic */ SeriesStepItemData copy$default(SeriesStepItemData seriesStepItemData, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = seriesStepItemData.index;
        }
        if ((i3 & 2) != 0) {
            i2 = seriesStepItemData.value;
        }
        return seriesStepItemData.copy(i, i2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getIndex() {
        return this.index;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getValue() {
        return this.value;
    }

    @NotNull
    public final SeriesStepItemData copy(int index, int value) {
        return new SeriesStepItemData(index, value);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SeriesStepItemData)) {
            return false;
        }
        SeriesStepItemData seriesStepItemData = (SeriesStepItemData) other;
        return this.index == seriesStepItemData.index && this.value == seriesStepItemData.value;
    }

    public final int getIndex() {
        return this.index;
    }

    public final int getValue() {
        return this.value;
    }

    public int hashCode() {
        return (Integer.hashCode(this.index) * 31) + Integer.hashCode(this.value);
    }

    public final void setIndex(int i) {
        this.index = i;
    }

    public final void setValue(int i) {
        this.value = i;
    }

    @NotNull
    public String toString() {
        return "SeriesStepItemData(index=" + this.index + ", value=" + this.value + ")";
    }
}
