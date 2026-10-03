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
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00132\u00020\u0001:\u0001\nB\u0007¢\u0006\u0004\b\u0011\u0010\u0012J*\u0010\n\u001a\u00020\t2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00022\u0006\u0010\b\u001a\u00020\u0007J,\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0002¨\u0006\u0014"}, d2 = {"Lcom/oplus/aiunit/vision/shh;", "", "", "Lcom/heytap/databaseengine/model/newsleep/SleepHeartRateStat;", "dataStatList", "Lcom/heytap/databaseengine/model/SleepIndex;", "sleepIndexList", "", "chartVisibleTime", "Lcom/oplus/aiunit/vision/sjh;", "a", "startTime", "endTime", "", "Lcom/oplus/aiunit/vision/bzj;", "dataList", "b", "<init>", "()V", "Companion", "sleep_heartrate_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSleepHRMonthTransform.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SleepHRMonthTransform.kt\ncom/heytap/health/sleep/heartrate/month/model/SleepHRMonthTransform\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,146:1\n1855#2,2:147\n1855#2,2:149\n*S KotlinDebug\n*F\n+ 1 SleepHRMonthTransform.kt\ncom/heytap/health/sleep/heartrate/month/model/SleepHRMonthTransform\n*L\n30#1:147,2\n135#1:149,2\n*E\n"})
public final class shh {
    public static final int $stable = 0;

    @NotNull
    public static final String TAG = "GluMonthTransform";

    @NotNull
    public final sjh a(@NotNull List<SleepHeartRateStat> dataStatList, @NotNull List<SleepIndex> sleepIndexList, long chartVisibleTime) {
        boolean z;
        long j2;
        long j3;
        Intrinsics.checkNotNullParameter(dataStatList, "dataStatList");
        Intrinsics.checkNotNullParameter(sleepIndexList, "sleepIndexList");
        a7b.f(uhh.TAG, "buildChartData chartVisibleTime:" + chartVisibleTime);
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
            long timestamp = arrayList.get(0).getTimestamp();
            long timestamp2 = arrayList.get(arrayList.size() - 1).getTimestamp();
            mq8 mq8Var = mq8.INSTANCE;
            a7b.f("GluMonthTransform", "firstDataTime:" + mq8Var.q(timestamp, "yyyyMMdd HH:mm") + "/lastDataTime:" + mq8Var.q(timestamp2, "yyyyMMdd HH:mm"));
            j2 = timestamp2;
            j3 = timestamp;
            z = false;
        } else {
            z = true;
            j2 = jCurrentTimeMillis2;
            j3 = jCurrentTimeMillis;
        }
        mq8 mq8Var2 = mq8.INSTANCE;
        long jL = mq8Var2.l(j3);
        long jK = mq8Var2.k(j2);
        long jL2 = chartVisibleTime > 0 ? mq8Var2.l(chartVisibleTime) : mq8Var2.l(jK);
        boolean z2 = z;
        long epochMilli = LocalDateTime.ofInstant(Instant.ofEpochMilli(jL2), mq8Var2.d()).toLocalDate().plusDays(31L).atStartOfDay().atZone(mq8Var2.d()).toInstant().toEpochMilli() - 1;
        if (jK < epochMilli) {
            jK = epochMilli;
        }
        long jK2 = mq8Var2.k(System.currentTimeMillis());
        if (jK2 < jK) {
            jK2 = jK;
        }
        String strQ = mq8Var2.q(jL, "yyyyMMdd HH:mm");
        String strQ2 = mq8Var2.q(jK2, "yyyyMMdd HH:mm");
        String strQ3 = mq8Var2.q(jL2, "yyyyMMdd HH:mm");
        String strQ4 = mq8Var2.q(epochMilli, "yyyyMMdd HH:mm");
        StringBuilder sb = new StringBuilder();
        long j4 = jL2;
        sb.append("later chartStartTime:");
        sb.append(strQ);
        sb.append("/chartEndTime:");
        sb.append(strQ2);
        sb.append("/lowestVisibleTime:");
        sb.append(strQ3);
        sb.append("/highestVisibleTime:");
        sb.append(strQ4);
        a7b.f("GluMonthTransform", sb.toString());
        return new sjh(b(jL, jK2, arrayList), dataStatList, sleepIndexList, z2, jL, jK2, j4, epochMilli);
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
