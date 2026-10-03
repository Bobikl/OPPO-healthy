package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.databaseengine.model.newsleep.BreathRateStat;
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

/* JADX INFO: loaded from: classes14.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00142\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u001c\u0010\b\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u0005J@\u0010\u0011\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u00052\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0002¨\u0006\u0015"}, d2 = {"Lcom/oplus/aiunit/vision/eah;", "", "", "Lcom/heytap/databaseengine/model/newsleep/BreathRateStat;", "dataStatList", "", "chartVisibleTime", "Lcom/oplus/aiunit/vision/i9h;", "a", "startTime", "endTime", BloodGlucoseWarningActivity.CHART_LOWEST_VISIBLE_TIME, "", "Lcom/oplus/aiunit/vision/bzj;", "dataList", "Lkotlin/Pair;", "", "b", "<init>", "()V", "Companion", "sleep_breath_rate_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSleepBRYearTransform.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SleepBRYearTransform.kt\ncom/health/sleep_breath_rate/year/SleepBRYearTransform\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,142:1\n1855#2,2:143\n1855#2,2:145\n*S KotlinDebug\n*F\n+ 1 SleepBRYearTransform.kt\ncom/health/sleep_breath_rate/year/SleepBRYearTransform\n*L\n29#1:143,2\n131#1:145,2\n*E\n"})
public final class eah {
    public static final int $stable = 0;

    @NotNull
    public static final String TAG = "SleepBRYearTransform";

    @NotNull
    public final i9h a(@NotNull List<BreathRateStat> dataStatList, long chartVisibleTime) {
        long timestamp;
        long timestamp2;
        boolean z;
        long jU;
        long jT;
        Intrinsics.checkNotNullParameter(dataStatList, "dataStatList");
        a7b.f(TAG, "buildChartData");
        long jCurrentTimeMillis = System.currentTimeMillis();
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        ArrayList arrayList = new ArrayList();
        if (!dataStatList.isEmpty()) {
            for (BreathRateStat breathRateStat : dataStatList) {
                arrayList.add(new TimeStampedCandleData(v05.a(breathRateStat.getDate()), breathRateStat.getMin() / 10.0f, breathRateStat.getMax() / 10.0f));
            }
            z = false;
            timestamp2 = arrayList.get(0).getTimestamp();
            timestamp = arrayList.get(arrayList.size() - 1).getTimestamp();
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
            long jU3 = mq8Var2.u(chartVisibleTime);
            jT = mq8Var2.t(chartVisibleTime);
            jU = jU3;
        } else {
            jU = mq8Var2.u(jT2);
            jT = jT2;
        }
        long jT3 = mq8Var2.t(System.currentTimeMillis());
        long j2 = jT3 < jT2 ? jT2 : jT3;
        boolean z2 = z;
        long j3 = j2;
        a7b.f(TAG, "later chartStartTime:" + mq8Var2.q(jU2, DateUtil.DATEFORMATMINUTE) + "/chartEndTime:" + mq8Var2.q(j2, DateUtil.DATEFORMATMINUTE) + "/!" + jT2 + "/lowestVisibleTime:" + mq8Var2.q(jU, "YYYY-MM-dd HH:mm") + "/highestVisibleTime:" + mq8Var2.q(jT, DateUtil.DATEFORMATMINUTE));
        Pair<List<TimeStampedCandleData>, Integer> pairB = b(jU2, j3, jU, arrayList);
        i9h i9hVar = new i9h(pairB.getFirst(), dataStatList, z2, jU2, j3, jU, jT);
        i9hVar.i(pairB.getSecond().intValue());
        return i9hVar;
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
