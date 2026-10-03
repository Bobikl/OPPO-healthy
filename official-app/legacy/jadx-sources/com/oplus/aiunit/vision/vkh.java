package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.databaseengine.model.SleepDataStat;
import com.heytap.health.blood.glucose.BloodGlucoseWarningActivity;
import com.heytap.health.core.widget.charts.data.SleepBarData;
import io.protostuff.MapSchema;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.temporal.TemporalAdjusters;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes18.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u001a2\u00020\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u0014\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002J$\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\nJ,\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000f0\n2\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u00072\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\nH\u0002J,\u0010\u0016\u001a\u00020\u00152\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\n2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\n2\u0006\u0010\u0014\u001a\u00020\u000bH\u0002J,\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u00072\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\nH\u0002¨\u0006\u001b"}, d2 = {"Lcom/oplus/aiunit/vision/vkh;", "", "", "Lcom/heytap/databaseengine/model/SleepDataStat;", "sleepDataStatList", "Lcom/oplus/aiunit/vision/ibh;", "a", "", BloodGlucoseWarningActivity.CHART_LOWEST_VISIBLE_TIME, BloodGlucoseWarningActivity.CHART_HIGHEST_VISIBLE_TIME, "", "Lcom/oplus/aiunit/vision/xqh;", "c", "startTime", "endTime", "Lcom/heytap/health/core/widget/charts/data/SleepBarData;", "dataList", "d", "curList", "beforeList", "sleepTimeMonthBean", "", "b", MapSchema.FIELD_NAME_ENTRY, "<init>", "()V", "Companion", "sleep_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSleepMonthDataTransform.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SleepMonthDataTransform.kt\ncom/heytap/health/sleep/month/model/SleepMonthDataTransform\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,359:1\n1855#2,2:360\n1855#2,2:362\n1855#2,2:364\n1855#2,2:366\n1855#2,2:368\n1855#2,2:370\n*S KotlinDebug\n*F\n+ 1 SleepMonthDataTransform.kt\ncom/heytap/health/sleep/month/model/SleepMonthDataTransform\n*L\n35#1:360,2\n144#1:362,2\n213#1:364,2\n247#1:366,2\n291#1:368,2\n348#1:370,2\n*E\n"})
public final class vkh {
    public static final int $stable = 0;

    @NotNull
    public static final String TAG = "SleepMonthDataTransform";

    @NotNull
    public final ibh a(@NotNull List<SleepDataStat> sleepDataStatList) {
        long j2;
        boolean z;
        Intrinsics.checkNotNullParameter(sleepDataStatList, "sleepDataStatList");
        a7b.f(TAG, "buildChartData");
        long jCurrentTimeMillis = System.currentTimeMillis();
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        ArrayList arrayList = new ArrayList();
        if (sleepDataStatList.isEmpty()) {
            j2 = jCurrentTimeMillis2;
            z = true;
        } else {
            for (SleepDataStat sleepDataStat : sleepDataStatList) {
                SleepBarData sleepBarData = new SleepBarData();
                sleepBarData.setTimestamp(mq8.INSTANCE.g(sleepDataStat.getDate()));
                long j3 = 60;
                long j4 = 1000;
                sleepBarData.setDeepSleep(sleepDataStat.getTotalDeepSleepTime() * j3 * j4);
                sleepBarData.setLightSleep(sleepDataStat.getTotalLightlySleepTime() * j3 * j4);
                sleepBarData.setEyeMovement(sleepDataStat.getTotalRemTime() * j3 * j4);
                sleepBarData.setAwake(sleepDataStat.getTotalWakeUpTime() * j3 * j4);
                arrayList.add(sleepBarData);
            }
            jCurrentTimeMillis = ((SleepBarData) arrayList.get(0)).getTimestamp();
            long timestamp = ((SleepBarData) arrayList.get(arrayList.size() - 1)).getTimestamp();
            mq8 mq8Var = mq8.INSTANCE;
            a7b.f(TAG, "firstDataTime:" + mq8Var.q(jCurrentTimeMillis, "yyyyMMdd HH:mm") + "/lastDataTime:" + mq8Var.q(timestamp, "yyyyMMdd HH:mm"));
            j2 = timestamp;
            z = false;
        }
        ZoneId zoneIdSystemDefault = ZoneId.systemDefault();
        long epochMilli = LocalDateTime.ofInstant(Instant.ofEpochMilli(jCurrentTimeMillis), zoneIdSystemDefault).toLocalDate().with(TemporalAdjusters.firstDayOfMonth()).atStartOfDay().atZone(zoneIdSystemDefault).toInstant().toEpochMilli();
        mq8 mq8Var2 = mq8.INSTANCE;
        long jK = mq8Var2.k(j2);
        boolean z2 = z;
        long epochMilli2 = LocalDateTime.ofInstant(Instant.ofEpochMilli(jK), zoneIdSystemDefault).toLocalDate().with(TemporalAdjusters.firstDayOfMonth()).atStartOfDay().atZone(zoneIdSystemDefault).toInstant().toEpochMilli();
        long epochMilli3 = LocalDateTime.ofInstant(Instant.ofEpochMilli(epochMilli2), zoneIdSystemDefault).toLocalDate().plusDays(31L).atStartOfDay().atZone(zoneIdSystemDefault).toInstant().toEpochMilli() - 1;
        long j5 = jK < epochMilli3 ? epochMilli3 : jK;
        long jK2 = mq8Var2.k(System.currentTimeMillis());
        long j6 = jK2 < j5 ? j5 : jK2;
        a7b.f(TAG, "later firstDataTime:" + mq8Var2.q(epochMilli, "yyyyMMdd HH:mm") + "/lastDataTime:" + mq8Var2.q(j5, "yyyyMMdd HH:mm") + "/lowestVisibleTime:" + mq8Var2.q(epochMilli2, "yyyyMMdd HH:mm"));
        return new ibh(d(epochMilli, j6, arrayList), sleepDataStatList, z2, epochMilli, j6, epochMilli2, j5);
    }

    public final void b(List<? extends SleepDataStat> curList, List<? extends SleepDataStat> beforeList, xqh sleepTimeMonthBean) {
        List<? extends SleepDataStat> list = curList;
        long j2 = 0;
        if (!(list == null || list.isEmpty())) {
            Iterator it = curList.iterator();
            long jB = 0;
            long j3 = 0;
            int i = 0;
            int totalDeepSleepTime = 0;
            int totalLightlySleepTime = 0;
            int totalRemTime = 0;
            int totalWakeUpTime = 0;
            int i2 = 0;
            while (it.hasNext()) {
                SleepDataStat sleepDataStat = (SleepDataStat) it.next();
                sleepDataStat.getTotalSleepTime();
                totalDeepSleepTime += (int) sleepDataStat.getTotalDeepSleepTime();
                totalLightlySleepTime += (int) sleepDataStat.getTotalLightlySleepTime();
                totalRemTime += (int) sleepDataStat.getTotalRemTime();
                totalWakeUpTime += (int) sleepDataStat.getTotalWakeUpTime();
                if (sleepDataStat.getTotalSleepTime() > j2) {
                    i++;
                    wjh wjhVar = wjh.INSTANCE;
                    int iA = wjhVar.a((int) sleepDataStat.getFallAsleep());
                    if (iA > 0) {
                        j3 += (long) iA;
                        i2++;
                    } else {
                        a7b.f(TAG, "date:" + sleepDataStat.getDate() + "/cur sleepInTime error:" + sleepDataStat.getFallAsleep());
                    }
                    jB += (long) wjhVar.b((int) sleepDataStat.getSleepOut());
                } else {
                    it = it;
                }
                it = it;
                j2 = 0;
            }
            rqh rqhVar = new rqh();
            if (i > 0) {
                rqhVar.j(totalDeepSleepTime / i);
                rqhVar.k(totalLightlySleepTime / i);
                rqhVar.l(totalRemTime / i);
                rqhVar.m(totalWakeUpTime / i);
                rqhVar.a();
                sleepTimeMonthBean.g((int) (jB / ((long) i)));
            }
            if (i2 > 0) {
                sleepTimeMonthBean.f((int) (j3 / ((long) i2)));
            }
            sleepTimeMonthBean.h(rqhVar);
        }
        List<? extends SleepDataStat> list2 = beforeList;
        if (list2 == null || list2.isEmpty()) {
            return;
        }
        int i3 = 0;
        int i4 = 0;
        long jB2 = 0;
        long j4 = 0;
        for (SleepDataStat sleepDataStat2 : beforeList) {
            if (sleepDataStat2.getTotalSleepTime() > 0) {
                i4++;
                wjh wjhVar2 = wjh.INSTANCE;
                int iA2 = wjhVar2.a((int) sleepDataStat2.getFallAsleep());
                if (iA2 > 0) {
                    j4 += (long) iA2;
                    i3++;
                } else {
                    a7b.f(TAG, "date:" + sleepDataStat2.getDate() + "/before sleepInTime error:" + sleepDataStat2.getFallAsleep());
                }
                jB2 += (long) wjhVar2.b((int) sleepDataStat2.getSleepOut());
            }
        }
        if (i4 > 0) {
            sleepTimeMonthBean.d((int) (jB2 / ((long) i4)));
        }
        if (i3 > 0) {
            sleepTimeMonthBean.c((int) (j4 / ((long) i3)));
        }
    }

    @NotNull
    public final xqh c(long chartLowestVisibleTime, long chartHighestVisibleTime, @NotNull List<? extends SleepDataStat> sleepDataStatList) {
        long epochMilli;
        long epochMilli2;
        Intrinsics.checkNotNullParameter(sleepDataStatList, "sleepDataStatList");
        ZoneId zoneIdSystemDefault = ZoneId.systemDefault();
        mq8 mq8Var = mq8.INSTANCE;
        if (mq8Var.w(chartLowestVisibleTime)) {
            epochMilli = LocalDateTime.ofInstant(Instant.ofEpochMilli(chartLowestVisibleTime), zoneIdSystemDefault).toLocalDate().minusMonths(1L).with(TemporalAdjusters.firstDayOfMonth()).atStartOfDay().atZone(zoneIdSystemDefault).toInstant().toEpochMilli();
            epochMilli2 = LocalDateTime.ofInstant(Instant.ofEpochMilli(chartLowestVisibleTime), zoneIdSystemDefault).toLocalDate().with(TemporalAdjusters.firstDayOfMonth()).atStartOfDay().atZone(zoneIdSystemDefault).toInstant().toEpochMilli() - ((long) 1000);
        } else {
            epochMilli = LocalDateTime.ofInstant(Instant.ofEpochMilli(chartLowestVisibleTime), zoneIdSystemDefault).toLocalDate().minusDays(31L).atStartOfDay().atZone(zoneIdSystemDefault).toInstant().toEpochMilli();
            epochMilli2 = LocalDateTime.ofInstant(Instant.ofEpochMilli(chartHighestVisibleTime), zoneIdSystemDefault).toLocalDate().minusDays(31L).atStartOfDay().atZone(zoneIdSystemDefault).toInstant().toEpochMilli();
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (!sleepDataStatList.isEmpty()) {
            int iE = mq8Var.e(epochMilli);
            int iE2 = mq8Var.e(epochMilli2);
            int iE3 = mq8Var.e(chartLowestVisibleTime);
            int iE4 = mq8Var.e(chartHighestVisibleTime);
            a7b.f(TAG, "fetchSleepAverageData beforeStartTime:" + iE + "/beforeEndTime:" + iE2 + "/startTime:" + iE3 + "/endTime:" + iE4);
            for (SleepDataStat sleepDataStat : sleepDataStatList) {
                int date = sleepDataStat.getDate();
                if (iE <= date && date <= iE2) {
                    arrayList.add(sleepDataStat);
                }
                int date2 = sleepDataStat.getDate();
                if (iE3 <= date2 && date2 <= iE4) {
                    arrayList2.add(sleepDataStat);
                }
            }
        }
        xqh xqhVar = new xqh();
        xqhVar.e(e(chartLowestVisibleTime, chartHighestVisibleTime, arrayList2));
        b(arrayList2, arrayList, xqhVar);
        return xqhVar;
    }

    public final List<SleepBarData> d(long startTime, long endTime, List<? extends SleepBarData> dataList) {
        ZoneId zoneIdSystemDefault = ZoneId.systemDefault();
        LocalDateTime localDateTimeOfInstant = LocalDateTime.ofInstant(Instant.ofEpochMilli(startTime), zoneIdSystemDefault);
        long epochDay = LocalDateTime.ofInstant(Instant.ofEpochMilli(endTime), zoneIdSystemDefault).toLocalDate().atStartOfDay().toLocalDate().toEpochDay() - localDateTimeOfInstant.toLocalDate().toEpochDay();
        ArrayList arrayList = new ArrayList();
        long j2 = 0;
        if (0 <= epochDay) {
            while (true) {
                arrayList.add(new SleepBarData(localDateTimeOfInstant.plusDays(j2).atZone(zoneIdSystemDefault).toInstant().toEpochMilli(), 0L, 0L, 0L, 0L));
                if (j2 == epochDay) {
                    break;
                }
                j2++;
            }
        }
        for (SleepBarData sleepBarData : dataList) {
            arrayList.set((int) (LocalDateTime.ofInstant(Instant.ofEpochMilli(sleepBarData.getTimestamp()), zoneIdSystemDefault).toLocalDate().toEpochDay() - localDateTimeOfInstant.toLocalDate().toEpochDay()), sleepBarData);
        }
        return arrayList;
    }

    public final List<SleepDataStat> e(long startTime, long endTime, List<? extends SleepDataStat> dataList) {
        ZoneId zoneIdSystemDefault = ZoneId.systemDefault();
        LocalDateTime localDateTimeOfInstant = LocalDateTime.ofInstant(Instant.ofEpochMilli(startTime), zoneIdSystemDefault);
        long epochDay = LocalDateTime.ofInstant(Instant.ofEpochMilli(endTime), zoneIdSystemDefault).toLocalDate().atStartOfDay().toLocalDate().toEpochDay() - localDateTimeOfInstant.toLocalDate().toEpochDay();
        ArrayList arrayList = new ArrayList();
        long j2 = 0;
        if (0 <= epochDay) {
            while (true) {
                long epochMilli = localDateTimeOfInstant.plusDays(j2).atZone(zoneIdSystemDefault).toInstant().toEpochMilli();
                SleepDataStat sleepDataStat = new SleepDataStat();
                sleepDataStat.setDate(mq8.INSTANCE.e(epochMilli));
                arrayList.add(sleepDataStat);
                if (j2 == epochDay) {
                    break;
                }
                j2++;
            }
        }
        for (SleepDataStat sleepDataStat2 : dataList) {
            arrayList.set((int) (LocalDateTime.ofInstant(Instant.ofEpochMilli(mq8.INSTANCE.g(sleepDataStat2.getDate())), zoneIdSystemDefault).toLocalDate().toEpochDay() - localDateTimeOfInstant.toLocalDate().toEpochDay()), sleepDataStat2);
        }
        return arrayList;
    }
}
