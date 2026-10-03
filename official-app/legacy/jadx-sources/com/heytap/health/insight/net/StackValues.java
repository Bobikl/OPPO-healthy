package com.heytap.health.insight.net;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes16.dex */
@Keep
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/heytap/health/insight/net/StackValues;", "", "value", "", "color", "", "(FJ)V", "getColor", "()J", "getValue", "()F", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "health_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class StackValues {
    private final long color;
    private final float value;

    public StackValues(float f, long j2) {
        this.value = f;
        this.color = j2;
    }

    public static /* synthetic */ StackValues copy$default(StackValues stackValues, float f, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = stackValues.value;
        }
        if ((i & 2) != 0) {
            j2 = stackValues.color;
        }
        return stackValues.copy(f, j2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final float getValue() {
        return this.value;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getColor() {
        return this.color;
    }

    @NotNull
    public final StackValues copy(float value, long color) {
        return new StackValues(value, color);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StackValues)) {
            return false;
        }
        StackValues stackValues = (StackValues) other;
        return Float.compare(this.value, stackValues.value) == 0 && this.color == stackValues.color;
    }

    public final long getColor() {
        return this.color;
    }

    public final float getValue() {
        return this.value;
    }

    public int hashCode() {
        return (Float.hashCode(this.value) * 31) + Long.hashCode(this.color);
    }

    @NotNull
    public String toString() {
        return "StackValues(value=" + this.value + ", color=" + this.color + ")";
    }
}
