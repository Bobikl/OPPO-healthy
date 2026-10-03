package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.databaseengine.model.newsleep.BreathRateStat;
import java.time.Instant;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes14.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00112\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u001c\u0010\b\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u0005J,\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u00052\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002¨\u0006\u0012"}, d2 = {"Lcom/oplus/aiunit/vision/bah;", "", "", "Lcom/heytap/databaseengine/model/newsleep/BreathRateStat;", "breathRateStatList", "", "chartVisibleTime", "Lcom/oplus/aiunit/vision/i9h;", "a", "startTime", "endTime", "", "Lcom/oplus/aiunit/vision/bzj;", "dataList", "b", "<init>", "()V", "Companion", "sleep_breath_rate_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSleepBRWeekTransform.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SleepBRWeekTransform.kt\ncom/health/sleep_breath_rate/week/model/SleepBRWeekTransform\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,144:1\n1855#2,2:145\n1855#2,2:147\n*S KotlinDebug\n*F\n+ 1 SleepBRWeekTransform.kt\ncom/health/sleep_breath_rate/week/model/SleepBRWeekTransform\n*L\n34#1:145,2\n133#1:147,2\n*E\n"})
public final class bah {
    public static final int $stable = 0;

    @NotNull
    public static final String TAG = "SleepBRWeekTransform";

    @NotNull
    public final i9h a(@NotNull List<BreathRateStat> breathRateStatList, long chartVisibleTime) {
        long jS;
        long j2;
        long jR;
        boolean z;
        long jR2;
        Intrinsics.checkNotNullParameter(breathRateStatList, "breathRateStatList");
        a7b.f(TAG, "buildChartData chartVisibleTime:" + chartVisibleTime);
        ArrayList arrayList = new ArrayList();
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (!breathRateStatList.isEmpty()) {
            for (BreathRateStat breathRateStat : breathRateStatList) {
                arrayList.add(new TimeStampedCandleData(v05.a(breathRateStat.getDate()), breathRateStat.getMin() / 10.0f, breathRateStat.getMax() / 10.0f));
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
                jR = jR4;
                jR2 = mq8Var.r(chartVisibleTime);
                z = false;
                jS = jS3;
                j2 = jS2;
            } else {
                long jS4 = mq8Var.s(jR3);
                jR = jR4;
                jR2 = mq8Var.r(jR3);
                j2 = jS2;
                z = false;
                jS = jS4;
            }
        } else {
            mq8 mq8Var2 = mq8.INSTANCE;
            jS = mq8Var2.s(jCurrentTimeMillis);
            j2 = jS;
            jR = mq8Var2.r(jCurrentTimeMillis);
            z = true;
            jR2 = jR;
        }
        mq8 mq8Var3 = mq8.INSTANCE;
        String strQ = mq8Var3.q(j2, "yyyyMMdd HH:mm");
        String strQ2 = mq8Var3.q(jR, "yyyyMMdd HH:mm");
        String strQ3 = mq8Var3.q(jS, "yyyyMMdd HH:mm");
        String strQ4 = mq8Var3.q(jR2, "yyyyMMdd HH:mm");
        StringBuilder sb = new StringBuilder();
        long j3 = jS;
        sb.append("later chartStartTime:");
        sb.append(strQ);
        sb.append("/chartEndTime:");
        sb.append(strQ2);
        sb.append("/lowestVisibleTime:");
        sb.append(strQ3);
        sb.append("/highestVisibleTime:");
        sb.append(strQ4);
        a7b.f(TAG, sb.toString());
        return new i9h(b(j2, jR, arrayList), breathRateStatList, z, j2, jR, j3, jR2);
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
