package com.heytap.sports.recommend.bean;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0007\"\u0004\b\u000b\u0010\t¨\u0006\u0015"}, d2 = {"Lcom/heytap/sports/recommend/bean/MenstrualPeriodV2;", "", "type", "", "day", "(II)V", "getDay", "()I", "setDay", "(I)V", "getType", "setType", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "recommend_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class MenstrualPeriodV2 {
    public static final int $stable = 8;
    private int day;
    private int type;

    public MenstrualPeriodV2(int i, int i2) {
        this.type = i;
        this.day = i2;
    }

    public static /* synthetic */ MenstrualPeriodV2 copy$default(MenstrualPeriodV2 menstrualPeriodV2, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = menstrualPeriodV2.type;
        }
        if ((i3 & 2) != 0) {
            i2 = menstrualPeriodV2.day;
        }
        return menstrualPeriodV2.copy(i, i2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getDay() {
        return this.day;
    }

    @NotNull
    public final MenstrualPeriodV2 copy(int type, int day) {
        return new MenstrualPeriodV2(type, day);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MenstrualPeriodV2)) {
            return false;
        }
        MenstrualPeriodV2 menstrualPeriodV2 = (MenstrualPeriodV2) other;
        return this.type == menstrualPeriodV2.type && this.day == menstrualPeriodV2.day;
    }

    public final int getDay() {
        return this.day;
    }

    public final int getType() {
        return this.type;
    }

    public int hashCode() {
        return (Integer.hashCode(this.type) * 31) + Integer.hashCode(this.day);
    }

    public final void setDay(int i) {
        this.day = i;
    }

    public final void setType(int i) {
        this.type = i;
    }

    @NotNull
    public String toString() {
        return "MenstrualPeriodV2(type=" + this.type + ", day=" + this.day + ")";
    }
}
