package com.heytap.sports.recommend.bean;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Keep
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0007J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ2\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\f\u001a\u0004\b\r\u0010\t\"\u0004\b\u000e\u0010\u000bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u001e"}, d2 = {"Lcom/heytap/sports/recommend/bean/HealthArchives;", "", "menstrualPeriodType", "", "menstrualPeriodV2", "Lcom/heytap/sports/recommend/bean/MenstrualPeriodV2;", "bloodPressureRiskType", "(Ljava/lang/Integer;Lcom/heytap/sports/recommend/bean/MenstrualPeriodV2;Ljava/lang/Integer;)V", "getBloodPressureRiskType", "()Ljava/lang/Integer;", "setBloodPressureRiskType", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getMenstrualPeriodType", "setMenstrualPeriodType", "getMenstrualPeriodV2", "()Lcom/heytap/sports/recommend/bean/MenstrualPeriodV2;", "setMenstrualPeriodV2", "(Lcom/heytap/sports/recommend/bean/MenstrualPeriodV2;)V", "component1", "component2", "component3", "copy", "(Ljava/lang/Integer;Lcom/heytap/sports/recommend/bean/MenstrualPeriodV2;Ljava/lang/Integer;)Lcom/heytap/sports/recommend/bean/HealthArchives;", "equals", "", "other", "hashCode", "toString", "", "recommend_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class HealthArchives {
    public static final int $stable = 8;

    @Nullable
    private Integer bloodPressureRiskType;

    @Nullable
    private Integer menstrualPeriodType;

    @Nullable
    private MenstrualPeriodV2 menstrualPeriodV2;

    public HealthArchives() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ HealthArchives copy$default(HealthArchives healthArchives, Integer num, MenstrualPeriodV2 menstrualPeriodV2, Integer num2, int i, Object obj) {
        if ((i & 1) != 0) {
            num = healthArchives.menstrualPeriodType;
        }
        if ((i & 2) != 0) {
            menstrualPeriodV2 = healthArchives.menstrualPeriodV2;
        }
        if ((i & 4) != 0) {
            num2 = healthArchives.bloodPressureRiskType;
        }
        return healthArchives.copy(num, menstrualPeriodV2, num2);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Integer getMenstrualPeriodType() {
        return this.menstrualPeriodType;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final MenstrualPeriodV2 getMenstrualPeriodV2() {
        return this.menstrualPeriodV2;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getBloodPressureRiskType() {
        return this.bloodPressureRiskType;
    }

    @NotNull
    public final HealthArchives copy(@Nullable Integer menstrualPeriodType, @Nullable MenstrualPeriodV2 menstrualPeriodV2, @Nullable Integer bloodPressureRiskType) {
        return new HealthArchives(menstrualPeriodType, menstrualPeriodV2, bloodPressureRiskType);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HealthArchives)) {
            return false;
        }
        HealthArchives healthArchives = (HealthArchives) other;
        return Intrinsics.areEqual(this.menstrualPeriodType, healthArchives.menstrualPeriodType) && Intrinsics.areEqual(this.menstrualPeriodV2, healthArchives.menstrualPeriodV2) && Intrinsics.areEqual(this.bloodPressureRiskType, healthArchives.bloodPressureRiskType);
    }

    @Nullable
    public final Integer getBloodPressureRiskType() {
        return this.bloodPressureRiskType;
    }

    @Nullable
    public final Integer getMenstrualPeriodType() {
        return this.menstrualPeriodType;
    }

    @Nullable
    public final MenstrualPeriodV2 getMenstrualPeriodV2() {
        return this.menstrualPeriodV2;
    }

    public int hashCode() {
        Integer num = this.menstrualPeriodType;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        MenstrualPeriodV2 menstrualPeriodV2 = this.menstrualPeriodV2;
        int iHashCode2 = (iHashCode + (menstrualPeriodV2 == null ? 0 : menstrualPeriodV2.hashCode())) * 31;
        Integer num2 = this.bloodPressureRiskType;
        return iHashCode2 + (num2 != null ? num2.hashCode() : 0);
    }

    public final void setBloodPressureRiskType(@Nullable Integer num) {
        this.bloodPressureRiskType = num;
    }

    public final void setMenstrualPeriodType(@Nullable Integer num) {
        this.menstrualPeriodType = num;
    }

    public final void setMenstrualPeriodV2(@Nullable MenstrualPeriodV2 menstrualPeriodV2) {
        this.menstrualPeriodV2 = menstrualPeriodV2;
    }

    @NotNull
    public String toString() {
        return "HealthArchives(menstrualPeriodType=" + this.menstrualPeriodType + ", menstrualPeriodV2=" + this.menstrualPeriodV2 + ", bloodPressureRiskType=" + this.bloodPressureRiskType + ")";
    }

    public HealthArchives(@Nullable Integer num, @Nullable MenstrualPeriodV2 menstrualPeriodV2, @Nullable Integer num2) {
        this.menstrualPeriodType = num;
        this.menstrualPeriodV2 = menstrualPeriodV2;
        this.bloodPressureRiskType = num2;
    }

    public /* synthetic */ HealthArchives(Integer num, MenstrualPeriodV2 menstrualPeriodV2, Integer num2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : menstrualPeriodV2, (i & 4) != 0 ? null : num2);
    }
}
