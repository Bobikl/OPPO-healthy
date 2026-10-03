package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.databaseengine.model.SleepIndex;
import com.heytap.databaseengine.model.newsleep.SleepHeartRateStat;
import com.heytap.databaseengine.model.sleepdaystat.SleepMainData;
import com.heytap.health.core.widget.charts.data.TimeStampedData;
import com.heytap.log.formatter.LogFieldKey;
import io.protostuff.MapSchema;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.bih, reason: from toString */
/* JADX INFO: loaded from: classes18.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\bN\u0010OJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\"\u0010\u000b\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\"\u0010\u000f\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\b\"\u0004\b\u000e\u0010\nR\"\u0010\u0012\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u0010\u0010\b\"\u0004\b\u0011\u0010\nR\u001d\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R$\u0010 \u001a\u0004\u0018\u00010\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0015\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001d\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0016\u001a\u0004\b!\u0010\u0018R\"\u0010)\u001a\u00020#8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\"\u00100\u001a\u00020*8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\"\u00104\u001a\u00020#8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b1\u0010$\u001a\u0004\b2\u0010&\"\u0004\b3\u0010(R\"\u00107\u001a\u00020#8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b2\u0010$\u001a\u0004\b5\u0010&\"\u0004\b6\u0010(R\"\u00109\u001a\u00020#8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b5\u0010$\u001a\u0004\b1\u0010&\"\u0004\b8\u0010(R\"\u0010;\u001a\u00020#8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010$\u001a\u0004\b\u001b\u0010&\"\u0004\b:\u0010(R\"\u0010>\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b<\u0010\u0006\u001a\u0004\b\f\u0010\b\"\u0004\b=\u0010\nR\"\u0010@\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u0005\u0010\b\"\u0004\b?\u0010\nR$\u0010F\u001a\u0004\u0018\u00010A8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010B\u001a\u0004\b<\u0010C\"\u0004\bD\u0010ER$\u0010M\u001a\u0004\u0018\u00010G8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b?\u0010H\u001a\u0004\bI\u0010J\"\u0004\bK\u0010L¨\u0006P"}, d2 = {"Lcom/oplus/aiunit/vision/bih;", "", "", "toString", "", "a", "J", "c", "()J", "r", "(J)V", "curDayMinTimestamp", "b", "n", "C", "sleepStartTime", LogFieldKey.LEVEL_KEY, "A", "sleepEndTime", "", "Lcom/heytap/health/core/widget/charts/data/TimeStampedData;", "d", "Ljava/util/List;", "f", "()Ljava/util/List;", "lineDataList", "Lcom/heytap/databaseengine/model/newsleep/SleepHeartRateStat;", MapSchema.FIELD_NAME_ENTRY, "Lcom/heytap/databaseengine/model/newsleep/SleepHeartRateStat;", "()Lcom/heytap/databaseengine/model/newsleep/SleepHeartRateStat;", "s", "(Lcom/heytap/databaseengine/model/newsleep/SleepHeartRateStat;)V", "curSleepHRDayStat", b2n.f, "lineDataList2", "", "I", b2n.g, "()I", "u", "(I)V", "lineType", "", "Z", "o", "()Z", "z", "(Z)V", "isNoData", "i", "j", "x", "maxValue", MapSchema.FIELD_NAME_KEY, "y", "minValue", "v", "lowThreshold", "t", "highThreshold", LogFieldKey.MESSAGE_KEY, "q", "chartStartTime", LogFieldKey.PROCESS_NAME_KEY, "chartEndTime", "Lcom/heytap/databaseengine/model/SleepIndex;", "Lcom/heytap/databaseengine/model/SleepIndex;", "()Lcom/heytap/databaseengine/model/SleepIndex;", c8l.KEY_B, "(Lcom/heytap/databaseengine/model/SleepIndex;)V", "sleepIndex", "Lcom/heytap/databaseengine/model/sleepdaystat/SleepMainData;", "Lcom/heytap/databaseengine/model/sleepdaystat/SleepMainData;", "getMainSleep", "()Lcom/heytap/databaseengine/model/sleepdaystat/SleepMainData;", "w", "(Lcom/heytap/databaseengine/model/sleepdaystat/SleepMainData;)V", "mainSleep", "<init>", "()V", "sleep_heartrate_release"}, k = 1, mv = {1, 8, 0})
public final class SleepHeartRateDayBean {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public long curDayMinTimestamp;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public long sleepStartTime;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public long sleepEndTime;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public SleepHeartRateStat curSleepHRDayStat;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public int lineType;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata and from toString */
    public int maxValue;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    public int minValue;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata and from toString */
    public int lowThreshold;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    public int highThreshold;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public long chartStartTime;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    public long chartEndTime;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata and from toString */
    @Nullable
    public SleepIndex sleepIndex;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @Nullable
    public SleepMainData mainSleep;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final List<TimeStampedData> lineDataList = new ArrayList();

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final List<TimeStampedData> lineDataList2 = new ArrayList();

    /* JADX INFO: renamed from: h, reason: from kotlin metadata and from toString */
    public boolean isNoData = true;

    public final void A(long j2) {
        this.sleepEndTime = j2;
    }

    public final void B(@Nullable SleepIndex sleepIndex) {
        this.sleepIndex = sleepIndex;
    }

    public final void C(long j2) {
        this.sleepStartTime = j2;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final long getChartEndTime() {
        return this.chartEndTime;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final long getChartStartTime() {
        return this.chartStartTime;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final long getCurDayMinTimestamp() {
        return this.curDayMinTimestamp;
    }

    @Nullable
    /* JADX INFO: renamed from: d, reason: from getter */
    public final SleepHeartRateStat getCurSleepHRDayStat() {
        return this.curSleepHRDayStat;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getHighThreshold() {
        return this.highThreshold;
    }

    @NotNull
    public final List<TimeStampedData> f() {
        return this.lineDataList;
    }

    @NotNull
    public final List<TimeStampedData> g() {
        return this.lineDataList2;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final int getLineType() {
        return this.lineType;
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final int getLowThreshold() {
        return this.lowThreshold;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final int getMaxValue() {
        return this.maxValue;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final int getMinValue() {
        return this.minValue;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final long getSleepEndTime() {
        return this.sleepEndTime;
    }

    @Nullable
    /* JADX INFO: renamed from: m, reason: from getter */
    public final SleepIndex getSleepIndex() {
        return this.sleepIndex;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final long getSleepStartTime() {
        return this.sleepStartTime;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final boolean getIsNoData() {
        return this.isNoData;
    }

    public final void p(long j2) {
        this.chartEndTime = j2;
    }

    public final void q(long j2) {
        this.chartStartTime = j2;
    }

    public final void r(long j2) {
        this.curDayMinTimestamp = j2;
    }

    public final void s(@Nullable SleepHeartRateStat sleepHeartRateStat) {
        this.curSleepHRDayStat = sleepHeartRateStat;
    }

    public final void t(int i) {
        this.highThreshold = i;
    }

    @NotNull
    public String toString() {
        mq8 mq8Var = mq8.INSTANCE;
        return "SleepHeartRateDayBean(curDayMinTimestamp=" + mq8Var.y(this.curDayMinTimestamp, "yyy-MM-dd HH:mm") + ", lineDataList=" + this.lineDataList.size() + ", lineDataList2=" + this.lineDataList2.size() + ", isNoData=" + this.isNoData + ", maxValue=" + this.maxValue + ", minValue=" + this.minValue + ", lowThreshold=" + this.lowThreshold + ", highThreshold=" + this.highThreshold + ", chartStartTime=" + mq8Var.y(this.chartStartTime, "yyy-MM-dd HH:mm") + ",chartEndTime=" + mq8Var.y(this.chartEndTime, "yyy-MM-dd HH:mm") + ", sleepIndex=" + this.sleepIndex + ")";
    }

    public final void u(int i) {
        this.lineType = i;
    }

    public final void v(int i) {
        this.lowThreshold = i;
    }

    public final void w(@Nullable SleepMainData sleepMainData) {
        this.mainSleep = sleepMainData;
    }

    public final void x(int i) {
        this.maxValue = i;
    }

    public final void y(int i) {
        this.minValue = i;
    }

    public final void z(boolean z) {
        this.isNoData = z;
    }
}
