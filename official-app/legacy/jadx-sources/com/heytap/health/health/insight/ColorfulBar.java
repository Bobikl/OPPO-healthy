package com.heytap.health.health.insight;

import androidx.annotation.Keep;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@Keep
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r¢\u0006\u0002\u0010\u000fJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0005HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u000bHÆ\u0003J\u0011\u0010#\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0003Ja\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u000b2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0001J\u0013\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010(\u001a\u00020)HÖ\u0001J\t\u0010*\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0011R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u0006+"}, d2 = {"Lcom/heytap/health/health/insight/ColorfulBar;", "", "rightDesc", "", "rightDescColor", "", "rightDescZh", "topDesc", "topDescColor", "topDescZh", "value", "", "zones", "", "Lcom/heytap/health/health/insight/Zone;", "(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;JLjava/lang/String;FLjava/util/List;)V", "getRightDesc", "()Ljava/lang/String;", "getRightDescColor", "()J", "getRightDescZh", "getTopDesc", "getTopDescColor", "getTopDescZh", "getValue", "()F", "getZones", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "", "toString", "health_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class ColorfulBar {

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

    @Nullable
    private final List<Zone> zones;

    public ColorfulBar(@NotNull String rightDesc, long j2, @NotNull String rightDescZh, @NotNull String topDesc, long j3, @NotNull String topDescZh, float f, @Nullable List<Zone> list) {
        Intrinsics.checkNotNullParameter(rightDesc, "rightDesc");
        Intrinsics.checkNotNullParameter(rightDescZh, "rightDescZh");
        Intrinsics.checkNotNullParameter(topDesc, "topDesc");
        Intrinsics.checkNotNullParameter(topDescZh, "topDescZh");
        this.rightDesc = rightDesc;
        this.rightDescColor = j2;
        this.rightDescZh = rightDescZh;
        this.topDesc = topDesc;
        this.topDescColor = j3;
        this.topDescZh = topDescZh;
        this.value = f;
        this.zones = list;
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getRightDesc() {
        return this.rightDesc;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getRightDescColor() {
        return this.rightDescColor;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getRightDescZh() {
        return this.rightDescZh;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getTopDesc() {
        return this.topDesc;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final long getTopDescColor() {
        return this.topDescColor;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getTopDescZh() {
        return this.topDescZh;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final float getValue() {
        return this.value;
    }

    @Nullable
    public final List<Zone> component8() {
        return this.zones;
    }

    @NotNull
    public final ColorfulBar copy(@NotNull String rightDesc, long rightDescColor, @NotNull String rightDescZh, @NotNull String topDesc, long topDescColor, @NotNull String topDescZh, float value, @Nullable List<Zone> zones) {
        Intrinsics.checkNotNullParameter(rightDesc, "rightDesc");
        Intrinsics.checkNotNullParameter(rightDescZh, "rightDescZh");
        Intrinsics.checkNotNullParameter(topDesc, "topDesc");
        Intrinsics.checkNotNullParameter(topDescZh, "topDescZh");
        return new ColorfulBar(rightDesc, rightDescColor, rightDescZh, topDesc, topDescColor, topDescZh, value, zones);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ColorfulBar)) {
            return false;
        }
        ColorfulBar colorfulBar = (ColorfulBar) other;
        return Intrinsics.areEqual(this.rightDesc, colorfulBar.rightDesc) && this.rightDescColor == colorfulBar.rightDescColor && Intrinsics.areEqual(this.rightDescZh, colorfulBar.rightDescZh) && Intrinsics.areEqual(this.topDesc, colorfulBar.topDesc) && this.topDescColor == colorfulBar.topDescColor && Intrinsics.areEqual(this.topDescZh, colorfulBar.topDescZh) && Float.compare(this.value, colorfulBar.value) == 0 && Intrinsics.areEqual(this.zones, colorfulBar.zones);
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

    @Nullable
    public final List<Zone> getZones() {
        return this.zones;
    }

    public int hashCode() {
        int iHashCode = ((((((((((((this.rightDesc.hashCode() * 31) + Long.hashCode(this.rightDescColor)) * 31) + this.rightDescZh.hashCode()) * 31) + this.topDesc.hashCode()) * 31) + Long.hashCode(this.topDescColor)) * 31) + this.topDescZh.hashCode()) * 31) + Float.hashCode(this.value)) * 31;
        List<Zone> list = this.zones;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }

    @NotNull
    public String toString() {
        return "ColorfulBar(rightDesc=" + this.rightDesc + ", rightDescColor=" + this.rightDescColor + ", rightDescZh=" + this.rightDescZh + ", topDesc=" + this.topDesc + ", topDescColor=" + this.topDescColor + ", topDescZh=" + this.topDescZh + ", value=" + this.value + ", zones=" + this.zones + ")";
    }
}
