package com.oplus.deviceui.model;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u0000 \u001f2\u00020\u0001:\u0001 B/\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0002HÆ\u0003J\t\u0010\b\u001a\u00020\u0007HÆ\u0003J;\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u0007HÆ\u0001J\t\u0010\u000f\u001a\u00020\u0007HÖ\u0001J\t\u0010\u0010\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0014\u001a\u0004\b\u0017\u0010\u0016R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0014\u001a\u0004\b\u0019\u0010\u0016R\u0017\u0010\r\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\r\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006!"}, d2 = {"Lcom/oplus/deviceui/model/StepData;", "", "", "component1", "component2", "component3", "component4", "", "component5", "min", "max", "step", "value", "unit", "copy", "toString", "hashCode", "other", "", "equals", "I", "getMin", "()I", "getMax", "getStep", "getValue", "Ljava/lang/String;", "getUnit", "()Ljava/lang/String;", "<init>", "(IIIILjava/lang/String;)V", "Companion", "a", "udeviceui_release"}, k = 1, mv = {1, 4, 2})
public final /* data */ class StepData {

    @NotNull
    public static final String TAG_MAX = "max";

    @NotNull
    public static final String TAG_MIN = "min";

    @NotNull
    public static final String TAG_STEP = "step";

    @NotNull
    public static final String TAG_UNIT = "unit";

    @NotNull
    public static final String TAG_Value = "value";
    private final int max;
    private final int min;
    private final int step;

    @NotNull
    private final String unit;
    private final int value;

    public StepData(int i, int i2, int i3, int i4, @NotNull String unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        this.min = i;
        this.max = i2;
        this.step = i3;
        this.value = i4;
        this.unit = unit;
    }

    public static /* synthetic */ StepData copy$default(StepData stepData, int i, int i2, int i3, int i4, String str, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = stepData.min;
        }
        if ((i5 & 2) != 0) {
            i2 = stepData.max;
        }
        int i6 = i2;
        if ((i5 & 4) != 0) {
            i3 = stepData.step;
        }
        int i7 = i3;
        if ((i5 & 8) != 0) {
            i4 = stepData.value;
        }
        int i8 = i4;
        if ((i5 & 16) != 0) {
            str = stepData.unit;
        }
        return stepData.copy(i, i6, i7, i8, str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getMin() {
        return this.min;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getMax() {
        return this.max;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getStep() {
        return this.step;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getValue() {
        return this.value;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getUnit() {
        return this.unit;
    }

    @NotNull
    public final StepData copy(int min, int max, int step, int value, @NotNull String unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        return new StepData(min, max, step, value, unit);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StepData)) {
            return false;
        }
        StepData stepData = (StepData) other;
        return this.min == stepData.min && this.max == stepData.max && this.step == stepData.step && this.value == stepData.value && Intrinsics.areEqual(this.unit, stepData.unit);
    }

    public final int getMax() {
        return this.max;
    }

    public final int getMin() {
        return this.min;
    }

    public final int getStep() {
        return this.step;
    }

    @NotNull
    public final String getUnit() {
        return this.unit;
    }

    public final int getValue() {
        return this.value;
    }

    public int hashCode() {
        int iHashCode = ((((((Integer.hashCode(this.min) * 31) + Integer.hashCode(this.max)) * 31) + Integer.hashCode(this.step)) * 31) + Integer.hashCode(this.value)) * 31;
        String str = this.unit;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "StepData(min=" + this.min + ", max=" + this.max + ", step=" + this.step + ", value=" + this.value + ", unit=" + this.unit + ")";
    }
}
