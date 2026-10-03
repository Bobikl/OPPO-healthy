package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.health.core.widget.charts.data.SleepUnitData;
import com.heytap.health.core.widget.charts.data.TimeStampedData;
import com.heytap.health.sleep.bean.SleepDayBean;
import io.protostuff.MapSchema;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes18.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0017\u0010\u0018R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0005\u001a\u0004\b\u0004\u0010\u0007R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0005\u001a\u0004\b\f\u0010\u0007R$\u0010\u0014\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000b\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0005\u001a\u0004\b\u000f\u0010\u0007¨\u0006\u0019"}, d2 = {"Lcom/oplus/aiunit/vision/q8h;", "", "Ljava/util/ArrayList;", "Lcom/heytap/health/core/widget/charts/data/SleepUnitData;", "a", "Ljava/util/ArrayList;", "b", "()Ljava/util/ArrayList;", "sleepDataList", "Lcom/heytap/health/core/widget/charts/data/TimeStampedData;", "heartRateDataList", "c", MapSchema.FIELD_NAME_ENTRY, "spo2DataList", "Lcom/heytap/health/sleep/bean/SleepDayBean;", "d", "Lcom/heytap/health/sleep/bean/SleepDayBean;", "()Lcom/heytap/health/sleep/bean/SleepDayBean;", "f", "(Lcom/heytap/health/sleep/bean/SleepDayBean;)V", "sleepDayData", "Lcom/oplus/aiunit/vision/q8h$a;", "sleepIntervalTimeList", "<init>", "()V", "sleep_release"}, k = 1, mv = {1, 8, 0})
public final class q8h {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public SleepDayBean sleepDayData;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final ArrayList<SleepUnitData> sleepDataList = new ArrayList<>();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final ArrayList<TimeStampedData> heartRateDataList = new ArrayList<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final ArrayList<TimeStampedData> spo2DataList = new ArrayList<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final ArrayList<SleepIntervalTimeBean> sleepIntervalTimeList = new ArrayList<>();

    /* JADX INFO: renamed from: com.oplus.aiunit.vision.q8h$a, reason: from toString */
    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0010\u001a\u00020\t\u0012\u0006\u0010\u0012\u001a\u00020\t¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u0010\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0012\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u000b\u001a\u0004\b\n\u0010\r\"\u0004\b\u0011\u0010\u000f¨\u0006\u0015"}, d2 = {"Lcom/oplus/aiunit/vision/q8h$a;", "", "", "toString", "", "hashCode", "other", "", "equals", "", "a", "J", "b", "()J", "setStartTime", "(J)V", "startTime", "setEndTime", "endTime", "<init>", "(JJ)V", "sleep_release"}, k = 1, mv = {1, 8, 0})
    public static final /* data */ class SleepIntervalTimeBean {
        public static final int $stable = 8;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        public long startTime;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        public long endTime;

        public SleepIntervalTimeBean(long j2, long j3) {
            this.startTime = j2;
            this.endTime = j3;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final long getEndTime() {
            return this.endTime;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final long getStartTime() {
            return this.startTime;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SleepIntervalTimeBean)) {
                return false;
            }
            SleepIntervalTimeBean sleepIntervalTimeBean = (SleepIntervalTimeBean) other;
            return this.startTime == sleepIntervalTimeBean.startTime && this.endTime == sleepIntervalTimeBean.endTime;
        }

        public int hashCode() {
            return (Long.hashCode(this.startTime) * 31) + Long.hashCode(this.endTime);
        }

        @NotNull
        public String toString() {
            return "SleepIntervalTimeBean(startTime=" + this.startTime + ", endTime=" + this.endTime + ")";
        }
    }

    @NotNull
    public final ArrayList<TimeStampedData> a() {
        return this.heartRateDataList;
    }

    @NotNull
    public final ArrayList<SleepUnitData> b() {
        return this.sleepDataList;
    }

    @Nullable
    /* JADX INFO: renamed from: c, reason: from getter */
    public final SleepDayBean getSleepDayData() {
        return this.sleepDayData;
    }

    @NotNull
    public final ArrayList<SleepIntervalTimeBean> d() {
        return this.sleepIntervalTimeList;
    }

    @NotNull
    public final ArrayList<TimeStampedData> e() {
        return this.spo2DataList;
    }

    public final void f(@Nullable SleepDayBean sleepDayBean) {
        this.sleepDayData = sleepDayBean;
    }
}
