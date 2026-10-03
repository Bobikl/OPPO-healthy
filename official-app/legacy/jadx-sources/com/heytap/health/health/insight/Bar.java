package com.heytap.health.health.insight;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@Keep
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\t\u0010 \u001a\u00020\fHÆ\u0003JY\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\fHÆ\u0001J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020&HÖ\u0001J\t\u0010'\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006("}, d2 = {"Lcom/heytap/health/health/insight/Bar;", "", "barColor", "", "rightDesc", "", "rightDescColor", "rightDescZh", "topDesc", "topDescColor", "topDescZh", "value", "", "(JLjava/lang/String;JLjava/lang/String;Ljava/lang/String;JLjava/lang/String;F)V", "getBarColor", "()J", "getRightDesc", "()Ljava/lang/String;", "getRightDescColor", "getRightDescZh", "getTopDesc", "getTopDescColor", "getTopDescZh", "getValue", "()F", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "", "toString", "health_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class Bar {
    private final long barColor;

    @NotNull
    private final String rightDesc;
    private final long rightDescColor;

    @NotNull
    private final String rightDescZh;

    @NotNull
    private final String topDesc;
    private final long topDescColor;

    @NotNull
    private final String topDescZh;
    private final float value;

    public Bar(long j2, @NotNull String rightDesc, long j3, @NotNull String rightDescZh, @NotNull String topDesc, long j4, @NotNull String topDescZh, float f) {
        Intrinsics.checkNotNullParameter(rightDesc, "rightDesc");
        Intrinsics.checkNotNullParameter(rightDescZh, "rightDescZh");
        Intrinsics.checkNotNullParameter(topDesc, "topDesc");
        Intrinsics.checkNotNullParameter(topDescZh, "topDescZh");
        this.barColor = j2;
        this.rightDesc = rightDesc;
        this.rightDescColor = j3;
        this.rightDescZh = rightDescZh;
        this.topDesc = topDesc;
        this.topDescColor = j4;
        this.topDescZh = topDescZh;
        this.value = f;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getBarColor() {
        return this.barColor;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getRightDesc() {
        return this.rightDesc;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getRightDescColor() {
        return this.rightDescColor;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getRightDescZh() {
        return this.rightDescZh;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getTopDesc() {
        return this.topDesc;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final long getTopDescColor() {
        return this.topDescColor;
    }

    @NotNull
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getTopDescZh() {
        return this.topDescZh;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final float getValue() {
        return this.value;
    }

    @NotNull
    public final Bar copy(long barColor, @NotNull String rightDesc, long rightDescColor, @NotNull String rightDescZh, @NotNull String topDesc, long topDescColor, @NotNull String topDescZh, float value) {
        Intrinsics.checkNotNullParameter(rightDesc, "rightDesc");
        Intrinsics.checkNotNullParameter(rightDescZh, "rightDescZh");
        Intrinsics.checkNotNullParameter(topDesc, "topDesc");
        Intrinsics.checkNotNullParameter(topDescZh, "topDescZh");
        return new Bar(barColor, rightDesc, rightDescColor, rightDescZh, topDesc, topDescColor, topDescZh, value);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Bar)) {
            return false;
        }
        Bar bar = (Bar) other;
        return this.barColor == bar.barColor && Intrinsics.areEqual(this.rightDesc, bar.rightDesc) && this.rightDescColor == bar.rightDescColor && Intrinsics.areEqual(this.rightDescZh, bar.rightDescZh) && Intrinsics.areEqual(this.topDesc, bar.topDesc) && this.topDescColor == bar.topDescColor && Intrinsics.areEqual(this.topDescZh, bar.topDescZh) && Float.compare(this.value, bar.value) == 0;
    }

    public final long getBarColor() {
        return this.barColor;
    }

    @NotNull
    public final String getRightDesc() {
        return this.rightDesc;
    }

    public final long getRightDescColor() {
        return this.rightDescColor;
    }

    @NotNull
    public final String getRightDescZh() {
        return this.rightDescZh;
    }

    @NotNull
    public final String getTopDesc() {
        return this.topDesc;
    }

    public final long getTopDescColor() {
        return this.topDescColor;
    }

    @NotNull
    public final String getTopDescZh() {
        return this.topDescZh;
    }

    public final float getValue() {
        return this.value;
    }

    public int hashCode() {
        return (((((((((((((Long.hashCode(this.barColor) * 31) + this.rightDesc.hashCode()) * 31) + Long.hashCode(this.rightDescColor)) * 31) + this.rightDescZh.hashCode()) * 31) + this.topDesc.hashCode()) * 31) + Long.hashCode(this.topDescColor)) * 31) + this.topDescZh.hashCode()) * 31) + Float.hashCode(this.value);
    }

    @NotNull
    public String toString() {
        return "Bar(barColor=" + this.barColor + ", rightDesc=" + this.rightDesc + ", rightDescColor=" + this.rightDescColor + ", rightDescZh=" + this.rightDescZh + ", topDesc=" + this.topDesc + ", topDescColor=" + this.topDescColor + ", topDescZh=" + this.topDescZh + ", value=" + this.value + ")";
    }
}
