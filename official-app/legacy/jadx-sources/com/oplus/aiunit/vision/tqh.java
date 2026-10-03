package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.databaseengine.model.SleepDataStat;
import com.heytap.log.formatter.LogFieldKey;
import io.protostuff.MapSchema;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b3\u00104R$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0004\u001a\u0004\b\u000b\u0010\u0006\"\u0004\b\f\u0010\bR$\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u0004\u001a\u0004\b\u000f\u0010\u0006\"\u0004\b\u0010\u0010\bR$\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0004\u001a\u0004\b\u0012\u0010\u0006\"\u0004\b\u0013\u0010\bR$\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0004\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\bR$\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0004\u001a\u0004\b\u0015\u0010\u0006\"\u0004\b\u0019\u0010\bR\"\u0010\"\u001a\u00020\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\"\u0010$\u001a\u00020\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001d\u001a\u0004\b\u001c\u0010\u001f\"\u0004\b#\u0010!R\"\u0010'\u001a\u00020\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010\u001d\u001a\u0004\b\n\u0010\u001f\"\u0004\b&\u0010!R\"\u0010)\u001a\u00020\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u0003\u0010\u001f\"\u0004\b(\u0010!R(\u00100\u001a\b\u0012\u0004\u0012\u00020+0*8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010,\u001a\u0004\b%\u0010-\"\u0004\b.\u0010/R(\u00102\u001a\b\u0012\u0004\u0012\u00020+0*8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010,\u001a\u0004\b\u000e\u0010-\"\u0004\b1\u0010/¨\u00065"}, d2 = {"Lcom/oplus/aiunit/vision/tqh;", "", "Lcom/oplus/aiunit/vision/rqh;", "a", "Lcom/oplus/aiunit/vision/rqh;", "j", "()Lcom/oplus/aiunit/vision/rqh;", "v", "(Lcom/oplus/aiunit/vision/rqh;)V", "beforeSleepTimeData", "b", LogFieldKey.LEVEL_KEY, "x", "beforeWorkingDaySleepTimeData", "c", MapSchema.FIELD_NAME_KEY, "w", "beforeWeekendDaySleepTimeData", "d", LogFieldKey.PROCESS_NAME_KEY, "afterSleepTimeData", MapSchema.FIELD_NAME_ENTRY, "f", "r", "afterWorkingDaySleepTimeData", "q", "afterWeekendDaySleepTimeData", "", b2n.f, "J", b2n.g, "()J", "t", "(J)V", "beforeChartLowestVisibleTime", "s", "beforeChartHighestVisibleTime", "i", "n", "afterChartLowestVisibleTime", LogFieldKey.MESSAGE_KEY, "afterChartHighestVisibleTime", "", "Lcom/heytap/databaseengine/model/SleepDataStat;", "Ljava/util/List;", "()Ljava/util/List;", "u", "(Ljava/util/List;)V", "beforeList", "o", "afterList", "<init>", "()V", "sleep_release"}, k = 1, mv = {1, 8, 0})
public final class tqh {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public rqh beforeSleepTimeData;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public rqh beforeWorkingDaySleepTimeData;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public rqh beforeWeekendDaySleepTimeData;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public rqh afterSleepTimeData;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public rqh afterWorkingDaySleepTimeData;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    public rqh afterWeekendDaySleepTimeData;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public long beforeChartLowestVisibleTime;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public long beforeChartHighestVisibleTime;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public long afterChartLowestVisibleTime;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public long afterChartHighestVisibleTime;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public List<SleepDataStat> beforeList = new ArrayList();

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public List<SleepDataStat> afterList = new ArrayList();

    /* JADX INFO: renamed from: a, reason: from getter */
    public final long getAfterChartHighestVisibleTime() {
        return this.afterChartHighestVisibleTime;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final long getAfterChartLowestVisibleTime() {
        return this.afterChartLowestVisibleTime;
    }

    @NotNull
    public final List<SleepDataStat> c() {
        return this.afterList;
    }

    @Nullable
    /* JADX INFO: renamed from: d, reason: from getter */
    public final rqh getAfterSleepTimeData() {
        return this.afterSleepTimeData;
    }

    @Nullable
    /* JADX INFO: renamed from: e, reason: from getter */
    public final rqh getAfterWeekendDaySleepTimeData() {
        return this.afterWeekendDaySleepTimeData;
    }

    @Nullable
    /* JADX INFO: renamed from: f, reason: from getter */
    public final rqh getAfterWorkingDaySleepTimeData() {
        return this.afterWorkingDaySleepTimeData;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final long getBeforeChartHighestVisibleTime() {
        return this.beforeChartHighestVisibleTime;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final long getBeforeChartLowestVisibleTime() {
        return this.beforeChartLowestVisibleTime;
    }

    @NotNull
    public final List<SleepDataStat> i() {
        return this.beforeList;
    }

    @Nullable
    /* JADX INFO: renamed from: j, reason: from getter */
    public final rqh getBeforeSleepTimeData() {
        return this.beforeSleepTimeData;
    }

    @Nullable
    /* JADX INFO: renamed from: k, reason: from getter */
    public final rqh getBeforeWeekendDaySleepTimeData() {
        return this.beforeWeekendDaySleepTimeData;
    }

    @Nullable
    /* JADX INFO: renamed from: l, reason: from getter */
    public final rqh getBeforeWorkingDaySleepTimeData() {
        return this.beforeWorkingDaySleepTimeData;
    }

    public final void m(long j2) {
        this.afterChartHighestVisibleTime = j2;
    }

    public final void n(long j2) {
        this.afterChartLowestVisibleTime = j2;
    }

    public final void o(@NotNull List<SleepDataStat> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.afterList = list;
    }

    public final void p(@Nullable rqh rqhVar) {
        this.afterSleepTimeData = rqhVar;
    }

    public final void q(@Nullable rqh rqhVar) {
        this.afterWeekendDaySleepTimeData = rqhVar;
    }

    public final void r(@Nullable rqh rqhVar) {
        this.afterWorkingDaySleepTimeData = rqhVar;
    }

    public final void s(long j2) {
        this.beforeChartHighestVisibleTime = j2;
    }

    public final void t(long j2) {
        this.beforeChartLowestVisibleTime = j2;
    }

    public final void u(@NotNull List<SleepDataStat> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.beforeList = list;
    }

    public final void v(@Nullable rqh rqhVar) {
        this.beforeSleepTimeData = rqhVar;
    }

    public final void w(@Nullable rqh rqhVar) {
        this.beforeWeekendDaySleepTimeData = rqhVar;
    }

    public final void x(@Nullable rqh rqhVar) {
        this.beforeWorkingDaySleepTimeData = rqhVar;
    }
}
