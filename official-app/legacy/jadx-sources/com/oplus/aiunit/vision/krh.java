package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.databaseengine.model.SleepDataStat;
import com.heytap.health.blood.glucose.BloodGlucoseWarningActivity;
import com.heytap.health.core.widget.charts.data.SleepBarData;
import io.protostuff.MapSchema;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.temporal.TemporalAdjusters;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.Pair;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes18.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u001c2\u00020\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u0014\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002J$\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\nJ@\u0010\u0013\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\n\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\nH\u0002J,\u0010\u0018\u001a\u00020\u00172\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00030\n2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\n2\u0006\u0010\u0016\u001a\u00020\u000bH\u0002J,\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u00072\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\nH\u0002¨\u0006\u001d"}, d2 = {"Lcom/oplus/aiunit/vision/krh;", "", "", "Lcom/heytap/databaseengine/model/SleepDataStat;", "sleepDataStatList", "Lcom/oplus/aiunit/vision/ibh;", "a", "", BloodGlucoseWarningActivity.CHART_LOWEST_VISIBLE_TIME, BloodGlucoseWarningActivity.CHART_HIGHEST_VISIBLE_TIME, "", "Lcom/oplus/aiunit/vision/xqh;", "c", "startTime", "endTime", "Lcom/heytap/health/core/widget/charts/data/SleepBarData;", "dataList", "Lkotlin/Pair;", "", "d", "curList", "beforeList", "sleepTimeMonthBean", "", "b", MapSchema.FIELD_NAME_ENTRY, "<init>", "()V", "Companion", "sleep_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSleepYearDataTransform.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SleepYearDataTransform.kt\ncom/heytap/health/sleep/year/model/SleepYearDataTransform\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,365:1\n1855#2,2:366\n1855#2,2:368\n1855#2,2:370\n1855#2,2:372\n1855#2,2:374\n1855#2,2:376\n*S KotlinDebug\n*F\n+ 1 SleepYearDataTransform.kt\ncom/heytap/health/sleep/year/model/SleepYearDataTransform\n*L\n38#1:366,2\n154#1:368,2\n202#1:370,2\n232#1:372,2\n285#1:374,2\n354#1:376,2\n*E\n"})
public final class krh {
    public static final int $stable = 0;

    @NotNull
    public static final String TAG = "SleepYearDataTransform";

    @NotNull
    public final ibh a(@NotNull List<SleepDataStat> sleepDataStatList) {
        boolean z;
        long timestamp;
        Intrinsics.checkNotNullParameter(sleepDataStatList, "sleepDataStatList");
        a7b.f(irh.TAG, "buildChartData");
        long jCurrentTimeMillis = System.currentTimeMillis();
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        ArrayList arrayList = new ArrayList();
        ZoneId zoneIdSystemDefault = ZoneId.systemDefault();
        if (sleepDataStatList.isEmpty()) {
            z = true;
            timestamp = jCurrentTimeMillis2;
        } else {
            for (SleepDataStat sleepDataStat : sleepDataStatList) {
                SleepBarData sleepBarData = new SleepBarData();
                sleepBarData.setTimestamp(v05.a(sleepDataStat.getDate()));
                long j2 = 60;
                long j3 = 1000;
                sleepBarData.setDeepSleep(sleepDataStat.getTotalDeepSleepTime() * j2 * j3);
                sleepBarData.setLightSleep(sleepDataStat.getTotalLightlySleepTime() * j2 * j3);
                sleepBarData.setEyeMovement(sleepDataStat.getTotalRemTime() * j2 * j3);
                sleepBarData.setAwake(sleepDataStat.getTotalWakeUpTime() * j2 * j3);
                arrayList.add(sleepBarData);
            }
            long timestamp2 = ((SleepBarData) arrayList.get(0)).getTimestamp();
            timestamp = ((SleepBarData) arrayList.get(arrayList.size() - 1)).getTimestamp();
            mq8 mq8Var = mq8.INSTANCE;
            a7b.f(irh.TAG, "firstDataTime:" + mq8Var.q(timestamp2, "yyyyMMdd HH:mm") + "/lastDataTime:" + mq8Var.q(timestamp, "yyyyMMdd HH:mm"));
            z = false;
            jCurrentTimeMillis = timestamp2;
        }
        long epochMilli = LocalDateTime.ofInstant(Instant.ofEpochMilli(jCurrentTimeMillis), zoneIdSystemDefault).toLocalDate().with(TemporalAdjusters.firstDayOfYear()).atStartOfDay().atZone(zoneIdSystemDefault).toInstant().toEpochMilli();
        long j4 = 1000;
        long epochMilli2 = LocalDateTime.ofInstant(Instant.ofEpochMilli(timestamp), zoneIdSystemDefault).toLocalDate().plusYears(1L).with(TemporalAdjusters.firstDayOfYear()).atStartOfDay().atZone(zoneIdSystemDefault).toInstant().toEpochMilli() - j4;
        long epochMilli3 = LocalDateTime.ofInstant(Instant.ofEpochMilli(epochMilli2), zoneIdSystemDefault).toLocalDate().with(TemporalAdjusters.firstDayOfYear()).atStartOfDay().atZone(zoneIdSystemDefault).toInstant().toEpochMilli();
        long epochMilli4 = LocalDateTime.ofInstant(Instant.ofEpochMilli(System.currentTimeMillis()), zoneIdSystemDefault).toLocalDate().plusYears(1L).with(TemporalAdjusters.firstDayOfYear()).atStartOfDay().atZone(zoneIdSystemDefault).toInstant().toEpochMilli() - j4;
        if (epochMilli4 < epochMilli2) {
            epochMilli4 = epochMilli2;
        }
        mq8 mq8Var2 = mq8.INSTANCE;
        a7b.f(TAG, "later firstDataTime:" + mq8Var2.q(epochMilli, "YYYY-MM-dd HH:mm") + "/lastDataTime:" + mq8Var2.q(epochMilli2, "YYYY-MM-dd HH:mm") + "/lowestVisibleTime:" + mq8Var2.q(epochMilli3, "YYYY-MM-dd HH:mm") + "/chartEndTime:" + mq8Var2.q(epochMilli4, "YYYY-MM-dd HH:mm"));
        long j5 = epochMilli4;
        Pair<List<SleepBarData>, Integer> pairD = d(epochMilli, j5, epochMilli3, arrayList);
        ibh ibhVar = new ibh(pairD.getFirst(), sleepDataStatList, z, epochMilli, j5, epochMilli3, epochMilli2);
        ibhVar.i(pairD.getSecond().intValue());
        return ibhVar;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:27:0x00be  */
    public final void b(List<? extends SleepDataStat> curList, List<? extends SleepDataStat> beforeList, xqh sleepTimeMonthBean) {
        String str;
        String str2;
        long fallAsleep;
        long sleepOut;
        List<? extends SleepDataStat> list = curList;
        boolean z = list == null || list.isEmpty();
        String str3 = "date:";
        long j2 = 720;
        long j3 = h27.FAMILY_PULL_REFRESH_DELAY;
        long j4 = 0;
        if (z) {
            str = "date:";
        } else {
            long j5 = 0;
            long j6 = 0;
            int i = 0;
            int i2 = 0;
            int totalDeepSleepTime = 0;
            int totalLightlySleepTime = 0;
            int totalRemTime = 0;
            int totalWakeUpTime = 0;
            for (SleepDataStat sleepDataStat : curList) {
                sleepDataStat.getTotalSleepTime();
                String str4 = str3;
                totalDeepSleepTime += (int) sleepDataStat.getTotalDeepSleepTime();
                totalLightlySleepTime += (int) sleepDataStat.getTotalLightlySleepTime();
                totalRemTime += (int) sleepDataStat.getTotalRemTime();
                totalWakeUpTime += (int) sleepDataStat.getTotalWakeUpTime();
                if (sleepDataStat.getTotalSleepTime() > j4) {
                    i2++;
                    if (sleepDataStat.getFallAsleep() >= h27.FAMILY_PULL_REFRESH_DELAY) {
                        fallAsleep = sleepDataStat.getFallAsleep();
                    } else {
                        if (sleepDataStat.getFallAsleep() >= j2) {
                            fallAsleep = sleepDataStat.getFallAsleep() + ((long) weg.WINDOW_NIGHT_END);
                        } else {
                            int date = sleepDataStat.getDate();
                            long fallAsleep2 = sleepDataStat.getFallAsleep();
                            StringBuilder sb = new StringBuilder();
                            str2 = str4;
                            sb.append(str2);
                            sb.append(date);
                            sb.append("/cur sleepInTime error:");
                            sb.append(fallAsleep2);
                            a7b.f(TAG, sb.toString());
                        }
                        if (sleepDataStat.getSleepOut() < h27.FAMILY_PULL_REFRESH_DELAY) {
                            sleepOut = sleepDataStat.getSleepOut() + ((long) weg.WINDOW_NIGHT_END);
                        } else {
                            sleepOut = sleepDataStat.getSleepOut();
                        }
                        j5 += sleepOut;
                    }
                    j6 += fallAsleep;
                    i++;
                    str2 = str4;
                    if (sleepDataStat.getSleepOut() < h27.FAMILY_PULL_REFRESH_DELAY) {
                        sleepOut = sleepDataStat.getSleepOut() + ((long) weg.WINDOW_NIGHT_END);
                    } else {
                        sleepOut = sleepDataStat.getSleepOut();
                    }
                    j5 += sleepOut;
                } else {
                    str2 = str4;
                }
                str3 = str2;
                j2 = 720;
                j4 = 0;
            }
            str = str3;
            rqh rqhVar = new rqh();
            if (i2 > 0) {
                rqhVar.j(totalDeepSleepTime / i2);
                rqhVar.k(totalLightlySleepTime / i2);
                rqhVar.l(totalRemTime / i2);
                rqhVar.m(totalWakeUpTime / i2);
                rqhVar.a();
                sleepTimeMonthBean.g((int) (j5 / ((long) i2)));
            }
            if (i > 0) {
                sleepTimeMonthBean.f((int) (j6 / ((long) i)));
            }
            sleepTimeMonthBean.h(rqhVar);
        }
        List<? extends SleepDataStat> list2 = beforeList;
        if (list2 == null || list2.isEmpty()) {
            return;
        }
        int i3 = 0;
        int i4 = 0;
        long sleepOut2 = 0;
        long fallAsleep3 = 0;
        for (SleepDataStat sleepDataStat2 : beforeList) {
            if (sleepDataStat2.getTotalSleepTime() > 0) {
                i4++;
                if (sleepDataStat2.getFallAsleep() >= j3) {
                    fallAsleep3 += sleepDataStat2.getFallAsleep();
                    i3++;
                } else if (sleepDataStat2.getFallAsleep() >= 720) {
                    fallAsleep3 += sleepDataStat2.getFallAsleep() + ((long) weg.WINDOW_NIGHT_END);
                    i3++;
                } else {
                    a7b.f(TAG, str + sleepDataStat2.getDate() + "/before sleepInTime error:" + sleepDataStat2.getFallAsleep());
                }
                sleepOut2 += sleepDataStat2.getSleepOut() < h27.FAMILY_PULL_REFRESH_DELAY ? sleepDataStat2.getSleepOut() + ((long) weg.WINDOW_NIGHT_END) : sleepDataStat2.getSleepOut();
            }
            j3 = h27.FAMILY_PULL_REFRESH_DELAY;
        }
        if (i4 > 0) {
            sleepTimeMonthBean.d((int) (sleepOut2 / ((long) i4)));
        }
        if (i3 > 0) {
            sleepTimeMonthBean.c((int) (fallAsleep3 / ((long) i3)));
        }
    }

    @NotNull
    public final xqh c(long chartLowestVisibleTime, long chartHighestVisibleTime, @NotNull List<? extends SleepDataStat> sleepDataStatList) {
        Intrinsics.checkNotNullParameter(sleepDataStatList, "sleepDataStatList");
        ZoneId zoneIdSystemDefault = ZoneId.systemDefault();
        long epochMilli = LocalDateTime.ofInstant(Instant.ofEpochMilli(chartLowestVisibleTime), zoneIdSystemDefault).minusMonths(12L).atZone(zoneIdSystemDefault).toInstant().toEpochMilli();
        long epochMilli2 = LocalDateTime.ofInstant(Instant.ofEpochMilli(chartHighestVisibleTime), zoneIdSystemDefault).minusMonths(12L).atZone(zoneIdSystemDefault).toInstant().toEpochMilli();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (!sleepDataStatList.isEmpty()) {
            int iK = v05.k(epochMilli);
            int iK2 = v05.k(epochMilli2);
            int iK3 = v05.k(chartLowestVisibleTime);
            int iK4 = v05.k(chartHighestVisibleTime);
            a7b.f(TAG, "fetchSleepAverageData beforeStartTime:" + iK + "/beforeEndTime:" + iK2 + "/startTime:" + iK3 + "/endTime:" + iK4);
            for (SleepDataStat sleepDataStat : sleepDataStatList) {
                int date = sleepDataStat.getDate();
                if (iK <= date && date <= iK2) {
                    arrayList.add(sleepDataStat);
                }
                int date2 = sleepDataStat.getDate();
                if (iK3 <= date2 && date2 <= iK4) {
                    arrayList2.add(sleepDataStat);
                }
            }
        }
        xqh xqhVar = new xqh();
        xqhVar.e(e(chartLowestVisibleTime, chartHighestVisibleTime, arrayList2));
        b(arrayList2, arrayList, xqhVar);
        return xqhVar;
    }

    public final Pair<List<SleepBarData>, Integer> d(long startTime, long endTime, long chartLowestVisibleTime, List<? extends SleepBarData> dataList) {
        ZoneId zoneIdSystemDefault = ZoneId.systemDefault();
        LocalDateTime localDateTimeOfInstant = LocalDateTime.ofInstant(Instant.ofEpochMilli(startTime), zoneIdSystemDefault);
        long totalMonths = Period.between(localDateTimeOfInstant.toLocalDate().withDayOfMonth(1), LocalDateTime.ofInstant(Instant.ofEpochMilli(endTime), zoneIdSystemDefault).toLocalDate().atStartOfDay().toLocalDate().withDayOfMonth(1)).toTotalMonths();
        ArrayList arrayList = new ArrayList();
        long j2 = 0;
        int i = 0;
        if (0 <= totalMonths) {
            while (true) {
                long epochMilli = localDateTimeOfInstant.plusMonths(j2).atZone(zoneIdSystemDefault).toInstant().toEpochMilli();
                arrayList.add(new SleepBarData(epochMilli, 0L, 0L, 0L, 0L));
                if (chartLowestVisibleTime == epochMilli) {
                    i = (int) j2;
                }
                if (j2 == totalMonths) {
                    break;
                }
                j2++;
            }
        }
        for (SleepBarData sleepBarData : dataList) {
            arrayList.set((int) Period.between(localDateTimeOfInstant.toLocalDate().withDayOfMonth(1), LocalDateTime.ofInstant(Instant.ofEpochMilli(sleepBarData.getTimestamp()), zoneIdSystemDefault).toLocalDate().withDayOfMonth(1)).toTotalMonths(), sleepBarData);
        }
        return new Pair<>(arrayList, Integer.valueOf(i));
    }

    public final List<SleepDataStat> e(long startTime, long endTime, List<? extends SleepDataStat> dataList) {
        ZoneId zoneIdSystemDefault = ZoneId.systemDefault();
        LocalDateTime localDateTimeOfInstant = LocalDateTime.ofInstant(Instant.ofEpochMilli(startTime), zoneIdSystemDefault);
        long totalMonths = Period.between(localDateTimeOfInstant.toLocalDate().withDayOfMonth(1), LocalDateTime.ofInstant(Instant.ofEpochMilli(endTime), zoneIdSystemDefault).toLocalDate().atStartOfDay().toLocalDate().withDayOfMonth(1)).toTotalMonths();
        ArrayList arrayList = new ArrayList();
        long j2 = 0;
        if (0 <= totalMonths) {
            while (true) {
                long epochMilli = localDateTimeOfInstant.plusMonths(j2).atZone(zoneIdSystemDefault).toInstant().toEpochMilli();
                SleepDataStat sleepDataStat = new SleepDataStat();
                sleepDataStat.setDate(mq8.INSTANCE.e(epochMilli));
                arrayList.add(sleepDataStat);
                if (j2 == totalMonths) {
                    break;
                }
                j2++;
            }
        }
        for (SleepDataStat sleepDataStat2 : dataList) {
            arrayList.set((int) Period.between(localDateTimeOfInstant.toLocalDate().withDayOfMonth(1), LocalDateTime.ofInstant(Instant.ofEpochMilli(mq8.INSTANCE.g(sleepDataStat2.getDate())), zoneIdSystemDefault).toLocalDate().withDayOfMonth(1)).toTotalMonths(), sleepDataStat2);
        }
        return arrayList;
    }
}
