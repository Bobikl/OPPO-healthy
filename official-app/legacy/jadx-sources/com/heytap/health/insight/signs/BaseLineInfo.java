package com.heytap.health.insight.signs;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@StabilityInferred(parameters = 0)
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/heytap/health/insight/signs/BaseLineInfo;", "", "currentDay", "", "totalDay", "type", "", "(IILjava/lang/String;)V", "getCurrentDay", "()I", "getTotalDay", "getType", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "health_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class BaseLineInfo {
    public static final int $stable = 0;
    private final int currentDay;
    private final int totalDay;

    @NotNull
    private final String type;

    public BaseLineInfo(int i, int i2, @NotNull String type) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.currentDay = i;
        this.totalDay = i2;
        this.type = type;
    }

    public static /* synthetic */ BaseLineInfo copy$default(BaseLineInfo baseLineInfo, int i, int i2, String str, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = baseLineInfo.currentDay;
        }
        if ((i3 & 2) != 0) {
            i2 = baseLineInfo.totalDay;
        }
        if ((i3 & 4) != 0) {
            str = baseLineInfo.type;
        }
        return baseLineInfo.copy(i, i2, str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getCurrentDay() {
        return this.currentDay;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getTotalDay() {
        return this.totalDay;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @NotNull
    public final BaseLineInfo copy(int currentDay, int totalDay, @NotNull String type) {
        Intrinsics.checkNotNullParameter(type, "type");
        return new BaseLineInfo(currentDay, totalDay, type);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BaseLineInfo)) {
            return false;
        }
        BaseLineInfo baseLineInfo = (BaseLineInfo) other;
        return this.currentDay == baseLineInfo.currentDay && this.totalDay == baseLineInfo.totalDay && Intrinsics.areEqual(this.type, baseLineInfo.type);
    }

    public final int getCurrentDay() {
        return this.currentDay;
    }

    public final int getTotalDay() {
        return this.totalDay;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.currentDay) * 31) + Integer.hashCode(this.totalDay)) * 31) + this.type.hashCode();
    }

    @NotNull
    public String toString() {
        return "BaseLineInfo(currentDay=" + this.currentDay + ", totalDay=" + this.totalDay + ", type=" + this.type + ")";
    }
}
