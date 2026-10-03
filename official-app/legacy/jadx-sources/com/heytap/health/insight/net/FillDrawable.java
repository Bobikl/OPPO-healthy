package com.heytap.health.insight.net;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes16.dex */
@Keep
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0013"}, d2 = {"Lcom/heytap/health/insight/net/FillDrawable;", "", "startColor", "", "endColor", "(JJ)V", "getEndColor", "()J", "getStartColor", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "health_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class FillDrawable {
    private final long endColor;
    private final long startColor;

    public FillDrawable(long j2, long j3) {
        this.startColor = j2;
        this.endColor = j3;
    }

    public static /* synthetic */ FillDrawable copy$default(FillDrawable fillDrawable, long j2, long j3, int i, Object obj) {
        if ((i & 1) != 0) {
            j2 = fillDrawable.startColor;
        }
        if ((i & 2) != 0) {
            j3 = fillDrawable.endColor;
        }
        return fillDrawable.copy(j2, j3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getStartColor() {
        return this.startColor;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getEndColor() {
        return this.endColor;
    }

    @NotNull
    public final FillDrawable copy(long startColor, long endColor) {
        return new FillDrawable(startColor, endColor);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FillDrawable)) {
            return false;
        }
        FillDrawable fillDrawable = (FillDrawable) other;
        return this.startColor == fillDrawable.startColor && this.endColor == fillDrawable.endColor;
    }

    public final long getEndColor() {
        return this.endColor;
    }

    public final long getStartColor() {
        return this.startColor;
    }

    public int hashCode() {
        return (Long.hashCode(this.startColor) * 31) + Long.hashCode(this.endColor);
    }

    @NotNull
    public String toString() {
        return "FillDrawable(startColor=" + this.startColor + ", endColor=" + this.endColor + ")";
    }
}
