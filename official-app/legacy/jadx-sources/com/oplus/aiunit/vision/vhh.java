package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.databaseengine.model.SleepIndex;
import com.heytap.databaseengine.model.newsleep.SleepHeartRateStat;
import com.heytap.health.blood.glucose.BloodGlucoseWarningActivity;
import com.heytap.log.util.DateUtil;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.Pair;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes18.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00162\u00020\u0001:\u0001\nB\u0007¢\u0006\u0004\b\u0014\u0010\u0015J*\u0010\n\u001a\u00020\t2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00022\u0006\u0010\b\u001a\u00020\u0007J@\u0010\u0013\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00072\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0002¨\u0006\u0017"}, d2 = {"Lcom/oplus/aiunit/vision/vhh;", "", "", "Lcom/heytap/databaseengine/model/newsleep/SleepHeartRateStat;", "dataStatList", "Lcom/heytap/databaseengine/model/SleepIndex;", "sleepIndexList", "", "chartVisibleTime", "Lcom/oplus/aiunit/vision/sjh;", "a", "startTime", "endTime", BloodGlucoseWarningActivity.CHART_LOWEST_VISIBLE_TIME, "", "Lcom/oplus/aiunit/vision/bzj;", "dataList", "Lkotlin/Pair;", "", "b", "<init>", "()V", "Companion", "sleep_heartrate_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSleepHRYearTransform.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SleepHRYearTransform.kt\ncom/heytap/health/sleep/heartrate/year/viewmodel/SleepHRYearTransform\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,144:1\n1855#2,2:145\n1855#2,2:147\n*S KotlinDebug\n*F\n+ 1 SleepHRYearTransform.kt\ncom/heytap/health/sleep/heartrate/year/viewmodel/SleepHRYearTransform\n*L\n30#1:145,2\n133#1:147,2\n*E\n"})
public final class vhh {
    public static final int $stable = 0;

    @NotNull
    public static final String TAG = "SleepHRYearTransform";

    @NotNull
    public final sjh a(@NotNull List<SleepHeartRateStat> dataStatList, @NotNull List<SleepIndex> sleepIndexList, long chartVisibleTime) {
        long timestamp;
        long timestamp2;
        boolean z;
        long jU;
        long jT;
        Intrinsics.checkNotNullParameter(dataStatList, "dataStatList");
        Intrinsics.checkNotNullParameter(sleepIndexList, "sleepIndexList");
        a7b.f(TAG, "buildChartData");
        long jCurrentTimeMillis = System.currentTimeMillis();
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        ArrayList arrayList = new ArrayList();
        if (!dataStatList.isEmpty()) {
            for (SleepHeartRateStat sleepHeartRateStat : dataStatList) {
                TimeStampedCandleData timeStampedCandleData = new TimeStampedCandleData(v05.a(sleepHeartRateStat.getDate()), sleepHeartRateStat.getMinHeartRate(), sleepHeartRateStat.getMaxHeartRate());
                if (sleepHeartRateStat.getWarningNumber() > 0) {
                    timeStampedCandleData.e(String.valueOf(sleepHeartRateStat.getWarningNumber()));
                }
                arrayList.add(timeStampedCandleData);
            }
            z = false;
            timestamp2 = ((TimeStampedCandleData) arrayList.get(0)).getTimestamp();
            timestamp = ((TimeStampedCandleData) arrayList.get(arrayList.size() - 1)).getTimestamp();
            mq8 mq8Var = mq8.INSTANCE;
            a7b.f(TAG, "firstDataTime:" + mq8Var.q(timestamp2, "yyyyMMdd HH:mm") + "/lastDataTime:" + mq8Var.q(timestamp, "yyyyMMdd HH:mm"));
        } else {
            timestamp = jCurrentTimeMillis2;
            timestamp2 = jCurrentTimeMillis;
            z = true;
        }
        mq8 mq8Var2 = mq8.INSTANCE;
        long jU2 = mq8Var2.u(timestamp2);
        long jT2 = mq8Var2.t(timestamp);
        if (chartVisibleTime > 0) {
            jU = mq8Var2.u(chartVisibleTime);
            jT = mq8Var2.t(chartVisibleTime);
        } else {
            jU = mq8Var2.u(jT2);
            jT = jT2;
        }
        long jT3 = mq8Var2.t(System.currentTimeMillis());
        if (jT3 < jT2) {
            jT3 = jT2;
        }
        String strQ = mq8Var2.q(jU2, DateUtil.DATEFORMATMINUTE);
        String strQ2 = mq8Var2.q(jT3, DateUtil.DATEFORMATMINUTE);
        boolean z2 = z;
        String strQ3 = mq8Var2.q(jU, "YYYY-MM-dd HH:mm");
        String strQ4 = mq8Var2.q(jT, DateUtil.DATEFORMATMINUTE);
        StringBuilder sb = new StringBuilder();
        long j2 = jT;
        sb.append("later chartStartTime:");
        sb.append(strQ);
        sb.append("/chartEndTime:");
        sb.append(strQ2);
        sb.append("/!");
        sb.append(jT2);
        sb.append("/lowestVisibleTime:");
        sb.append(strQ3);
        sb.append("/highestVisibleTime:");
        sb.append(strQ4);
        a7b.f(TAG, sb.toString());
        Pair<List<TimeStampedCandleData>, Integer> pairB = b(jU2, jT3, jU, arrayList);
        sjh sjhVar = new sjh(pairB.getFirst(), dataStatList, sleepIndexList, z2, jU2, jT3, jU, j2);
        sjhVar.i(pairB.getSecond().intValue());
        return sjhVar;
    }

    public final Pair<List<TimeStampedCandleData>, Integer> b(long startTime, long endTime, long chartLowestVisibleTime, List<TimeStampedCandleData> dataList) {
        Instant instantOfEpochMilli = Instant.ofEpochMilli(startTime);
        mq8 mq8Var = mq8.INSTANCE;
        LocalDateTime localDateTimeOfInstant = LocalDateTime.ofInstant(instantOfEpochMilli, mq8Var.d());
        long totalMonths = Period.between(localDateTimeOfInstant.toLocalDate().withDayOfMonth(1), LocalDateTime.ofInstant(Instant.ofEpochMilli(endTime), mq8Var.d()).toLocalDate().atStartOfDay().toLocalDate().withDayOfMonth(1)).toTotalMonths();
        ArrayList arrayList = new ArrayList();
        long j2 = 0;
        int i = 0;
        if (0 <= totalMonths) {
            while (true) {
                long epochMilli = localDateTimeOfInstant.plusMonths(j2).atZone(mq8.INSTANCE.d()).toInstant().toEpochMilli();
                arrayList.add(new TimeStampedCandleData(epochMilli, -10.0f, -10.0f));
                if (chartLowestVisibleTime == epochMilli) {
                    i = (int) j2;
                }
                if (j2 == totalMonths) {
                    break;
                }
                j2++;
            }
        }
        for (TimeStampedCandleData timeStampedCandleData : dataList) {
            arrayList.set((int) Period.between(localDateTimeOfInstant.toLocalDate().withDayOfMonth(1), LocalDateTime.ofInstant(Instant.ofEpochMilli(timeStampedCandleData.getTimestamp()), mq8.INSTANCE.d()).toLocalDate().withDayOfMonth(1)).toTotalMonths(), timeStampedCandleData);
        }
        return new Pair<>(arrayList, Integer.valueOf(i));
    }
}
