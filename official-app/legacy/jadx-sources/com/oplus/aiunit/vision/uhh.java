package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.databaseengine.model.SleepIndex;
import com.heytap.databaseengine.model.newsleep.SleepHeartRateStat;
import java.time.Instant;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes18.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00132\u00020\u0001:\u0001\nB\u0007¢\u0006\u0004\b\u0011\u0010\u0012J*\u0010\n\u001a\u00020\t2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00022\u0006\u0010\b\u001a\u00020\u0007J,\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0002¨\u0006\u0014"}, d2 = {"Lcom/oplus/aiunit/vision/uhh;", "", "", "Lcom/heytap/databaseengine/model/newsleep/SleepHeartRateStat;", "sleepHeartRateStatList", "Lcom/heytap/databaseengine/model/SleepIndex;", "sleepIndexList", "", "chartVisibleTime", "Lcom/oplus/aiunit/vision/sjh;", "a", "startTime", "endTime", "", "Lcom/oplus/aiunit/vision/bzj;", "dataList", "b", "<init>", "()V", "Companion", "sleep_heartrate_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSleepHRWeekTransform.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SleepHRWeekTransform.kt\ncom/heytap/health/sleep/heartrate/week/model/SleepHRWeekTransform\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,146:1\n1855#2,2:147\n1855#2,2:149\n*S KotlinDebug\n*F\n+ 1 SleepHRWeekTransform.kt\ncom/heytap/health/sleep/heartrate/week/model/SleepHRWeekTransform\n*L\n35#1:147,2\n135#1:149,2\n*E\n"})
public final class uhh {
    public static final int $stable = 0;

    @NotNull
    public static final String TAG = "SleepHRWeekTransform";

    @NotNull
    public final sjh a(@NotNull List<SleepHeartRateStat> sleepHeartRateStatList, @NotNull List<SleepIndex> sleepIndexList, long chartVisibleTime) {
        long jS;
        long jR;
        long jR2;
        boolean z;
        long j2;
        Intrinsics.checkNotNullParameter(sleepHeartRateStatList, "sleepHeartRateStatList");
        Intrinsics.checkNotNullParameter(sleepIndexList, "sleepIndexList");
        a7b.f(TAG, "buildChartData chartVisibleTime:" + chartVisibleTime);
        ArrayList arrayList = new ArrayList();
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (!sleepHeartRateStatList.isEmpty()) {
            for (SleepHeartRateStat sleepHeartRateStat : sleepHeartRateStatList) {
                TimeStampedCandleData timeStampedCandleData = new TimeStampedCandleData(v05.a(sleepHeartRateStat.getDate()), sleepHeartRateStat.getMinHeartRate(), sleepHeartRateStat.getMaxHeartRate());
                if (sleepHeartRateStat.getWarningNumber() > 0) {
                    timeStampedCandleData.e(String.valueOf(sleepHeartRateStat.getWarningNumber()));
                }
                arrayList.add(timeStampedCandleData);
            }
            long timestamp = arrayList.get(0).getTimestamp();
            long timestamp2 = arrayList.get(arrayList.size() - 1).getTimestamp();
            mq8 mq8Var = mq8.INSTANCE;
            a7b.f(TAG, "firstDataTime:" + mq8Var.q(timestamp, "yyyyMMdd HH:mm") + "/lastDataTime:" + mq8Var.q(timestamp2, "yyyyMMdd HH:mm"));
            long jS2 = mq8Var.s(timestamp);
            long jR3 = mq8Var.r(timestamp2);
            long jR4 = mq8Var.r(jCurrentTimeMillis);
            if (jR4 < jR3) {
                jR4 = jR3;
            }
            if (chartVisibleTime > 0) {
                long jS3 = mq8Var.s(chartVisibleTime);
                jR2 = mq8Var.r(chartVisibleTime);
                jR = jR4;
                z = false;
                j2 = jS3;
                jS = jS2;
            } else {
                long jS4 = mq8Var.s(jR3);
                jR = jR4;
                z = false;
                jR2 = mq8Var.r(jR3);
                jS = jS2;
                j2 = jS4;
            }
        } else {
            mq8 mq8Var2 = mq8.INSTANCE;
            jS = mq8Var2.s(jCurrentTimeMillis);
            jR = mq8Var2.r(jCurrentTimeMillis);
            jR2 = jR;
            z = true;
            j2 = jS;
        }
        mq8 mq8Var3 = mq8.INSTANCE;
        String strQ = mq8Var3.q(jS, "yyyyMMdd HH:mm");
        String strQ2 = mq8Var3.q(jR, "yyyyMMdd HH:mm");
        String strQ3 = mq8Var3.q(j2, "yyyyMMdd HH:mm");
        String strQ4 = mq8Var3.q(jR2, "yyyyMMdd HH:mm");
        StringBuilder sb = new StringBuilder();
        long j3 = jR2;
        sb.append("later chartStartTime:");
        sb.append(strQ);
        sb.append("/chartEndTime:");
        sb.append(strQ2);
        sb.append("/lowestVisibleTime:");
        sb.append(strQ3);
        sb.append("/highestVisibleTime:");
        sb.append(strQ4);
        a7b.f(TAG, sb.toString());
        return new sjh(b(jS, jR, arrayList), sleepHeartRateStatList, sleepIndexList, z, jS, jR, j2, j3);
    }

    public final List<TimeStampedCandleData> b(long startTime, long endTime, List<TimeStampedCandleData> dataList) {
        Instant instantOfEpochMilli = Instant.ofEpochMilli(startTime);
        mq8 mq8Var = mq8.INSTANCE;
        LocalDateTime localDateTimeOfInstant = LocalDateTime.ofInstant(instantOfEpochMilli, mq8Var.d());
        long epochDay = LocalDateTime.ofInstant(Instant.ofEpochMilli(endTime), mq8Var.d()).toLocalDate().atStartOfDay().toLocalDate().toEpochDay() - localDateTimeOfInstant.toLocalDate().toEpochDay();
        ArrayList arrayList = new ArrayList();
        long j2 = 0;
        if (0 <= epochDay) {
            while (true) {
                arrayList.add(new TimeStampedCandleData(localDateTimeOfInstant.plusDays(j2).atZone(mq8.INSTANCE.d()).toInstant().toEpochMilli(), -10.0f, -10.0f));
                if (j2 == epochDay) {
                    break;
                }
                j2++;
            }
        }
        for (TimeStampedCandleData timeStampedCandleData : dataList) {
            arrayList.set((int) (LocalDateTime.ofInstant(Instant.ofEpochMilli(timeStampedCandleData.getTimestamp()), mq8.INSTANCE.d()).toLocalDate().toEpochDay() - localDateTimeOfInstant.toLocalDate().toEpochDay()), timeStampedCandleData);
        }
        return arrayList;
    }
}
