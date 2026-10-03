package com.heytap.health.menstrual.data;

import androidx.annotation.Keep;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
@Keep
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0002\u0010\nJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003J7\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\u0005HÖ\u0001J\t\u0010\"\u001a\u00020#HÖ\u0001R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\f\"\u0004\b\u0010\u0010\u000eR \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006$"}, d2 = {"Lcom/heytap/health/menstrual/data/MenstrualCyclePredictiveBean;", "", "modifiedTime", "", "algorCycleDays", "", "algorPeriodDays", "cycleList", "", "Lcom/heytap/health/menstrual/data/MenstrualCyclePredictiveItemBean;", "(JIILjava/util/List;)V", "getAlgorCycleDays", "()I", "setAlgorCycleDays", "(I)V", "getAlgorPeriodDays", "setAlgorPeriodDays", "getCycleList", "()Ljava/util/List;", "setCycleList", "(Ljava/util/List;)V", "getModifiedTime", "()J", "setModifiedTime", "(J)V", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "menstrual_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class MenstrualCyclePredictiveBean {
    private int algorCycleDays;
    private int algorPeriodDays;

    @NotNull
    private List<MenstrualCyclePredictiveItemBean> cycleList;
    private long modifiedTime;

    public MenstrualCyclePredictiveBean() {
        this(0L, 0, 0, null, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MenstrualCyclePredictiveBean copy$default(MenstrualCyclePredictiveBean menstrualCyclePredictiveBean, long j2, int i, int i2, List list, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            j2 = menstrualCyclePredictiveBean.modifiedTime;
        }
        long j3 = j2;
        if ((i3 & 2) != 0) {
            i = menstrualCyclePredictiveBean.algorCycleDays;
        }
        int i4 = i;
        if ((i3 & 4) != 0) {
            i2 = menstrualCyclePredictiveBean.algorPeriodDays;
        }
        int i5 = i2;
        if ((i3 & 8) != 0) {
            list = menstrualCyclePredictiveBean.cycleList;
        }
        return menstrualCyclePredictiveBean.copy(j3, i4, i5, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getModifiedTime() {
        return this.modifiedTime;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getAlgorCycleDays() {
        return this.algorCycleDays;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getAlgorPeriodDays() {
        return this.algorPeriodDays;
    }

    @NotNull
    public final List<MenstrualCyclePredictiveItemBean> component4() {
        return this.cycleList;
    }

    @NotNull
    public final MenstrualCyclePredictiveBean copy(long modifiedTime, int algorCycleDays, int algorPeriodDays, @NotNull List<MenstrualCyclePredictiveItemBean> cycleList) {
        Intrinsics.checkNotNullParameter(cycleList, "cycleList");
        return new MenstrualCyclePredictiveBean(modifiedTime, algorCycleDays, algorPeriodDays, cycleList);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MenstrualCyclePredictiveBean)) {
            return false;
        }
        MenstrualCyclePredictiveBean menstrualCyclePredictiveBean = (MenstrualCyclePredictiveBean) other;
        return this.modifiedTime == menstrualCyclePredictiveBean.modifiedTime && this.algorCycleDays == menstrualCyclePredictiveBean.algorCycleDays && this.algorPeriodDays == menstrualCyclePredictiveBean.algorPeriodDays && Intrinsics.areEqual(this.cycleList, menstrualCyclePredictiveBean.cycleList);
    }

    public final int getAlgorCycleDays() {
        return this.algorCycleDays;
    }

    public final int getAlgorPeriodDays() {
        return this.algorPeriodDays;
    }

    @NotNull
    public final List<MenstrualCyclePredictiveItemBean> getCycleList() {
        return this.cycleList;
    }

    public final long getModifiedTime() {
        return this.modifiedTime;
    }

    public int hashCode() {
        return (((((Long.hashCode(this.modifiedTime) * 31) + Integer.hashCode(this.algorCycleDays)) * 31) + Integer.hashCode(this.algorPeriodDays)) * 31) + this.cycleList.hashCode();
    }

    public final void setAlgorCycleDays(int i) {
        this.algorCycleDays = i;
    }

    public final void setAlgorPeriodDays(int i) {
        this.algorPeriodDays = i;
    }

    public final void setCycleList(@NotNull List<MenstrualCyclePredictiveItemBean> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.cycleList = list;
    }

    public final void setModifiedTime(long j2) {
        this.modifiedTime = j2;
    }

    @NotNull
    public String toString() {
        return "MenstrualCyclePredictiveBean(modifiedTime=" + this.modifiedTime + ", algorCycleDays=" + this.algorCycleDays + ", algorPeriodDays=" + this.algorPeriodDays + ", cycleList=" + this.cycleList + ")";
    }

    public MenstrualCyclePredictiveBean(long j2, int i, int i2, @NotNull List<MenstrualCyclePredictiveItemBean> cycleList) {
        Intrinsics.checkNotNullParameter(cycleList, "cycleList");
        this.modifiedTime = j2;
        this.algorCycleDays = i;
        this.algorPeriodDays = i2;
        this.cycleList = cycleList;
    }

    public /* synthetic */ MenstrualCyclePredictiveBean(long j2, int i, int i2, List list, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0L : j2, (i3 & 2) != 0 ? 0 : i, (i3 & 4) != 0 ? 0 : i2, (i3 & 8) != 0 ? new ArrayList() : list);
    }
}
