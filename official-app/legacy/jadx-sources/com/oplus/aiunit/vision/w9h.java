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
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00112\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u001c\u0010\b\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u0005J,\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u00052\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002¨\u0006\u0012"}, d2 = {"Lcom/oplus/aiunit/vision/w9h;", "", "", "Lcom/heytap/databaseengine/model/newsleep/BreathRateStat;", "dataStatList", "", "chartVisibleTime", "Lcom/oplus/aiunit/vision/i9h;", "a", "startTime", "endTime", "", "Lcom/oplus/aiunit/vision/bzj;", "dataList", "b", "<init>", "()V", "Companion", "sleep_breath_rate_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSleepBRMonthTransform.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SleepBRMonthTransform.kt\ncom/health/sleep_breath_rate/month/SleepBRMonthTransform\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,145:1\n1855#2,2:146\n1855#2,2:148\n*S KotlinDebug\n*F\n+ 1 SleepBRMonthTransform.kt\ncom/health/sleep_breath_rate/month/SleepBRMonthTransform\n*L\n27#1:146,2\n133#1:148,2\n*E\n"})
public final class w9h {
    public static final int $stable = 0;

    @NotNull
    public static final String TAG = "SleepBRMonthTransform";

    @NotNull
    public final i9h a(@NotNull List<BreathRateStat> dataStatList, long chartVisibleTime) {
        long timestamp;
        boolean z;
        Intrinsics.checkNotNullParameter(dataStatList, "dataStatList");
        long jCurrentTimeMillis = System.currentTimeMillis();
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        ArrayList arrayList = new ArrayList();
        if (!dataStatList.isEmpty()) {
            for (BreathRateStat breathRateStat : dataStatList) {
                arrayList.add(new TimeStampedCandleData(v05.a(breathRateStat.getDate()), breathRateStat.getMin() / 10.0f, breathRateStat.getMax() / 10.0f));
            }
            long timestamp2 = arrayList.get(0).getTimestamp();
            timestamp = arrayList.get(arrayList.size() - 1).getTimestamp();
            mq8 mq8Var = mq8.INSTANCE;
            a7b.f(TAG, "firstDataTime:" + mq8Var.q(timestamp2, "yyyyMMdd HH:mm") + "/lastDataTime:" + mq8Var.q(timestamp, "yyyyMMdd HH:mm"));
            z = false;
            jCurrentTimeMillis = timestamp2;
        } else {
            timestamp = jCurrentTimeMillis2;
            z = true;
        }
        mq8 mq8Var2 = mq8.INSTANCE;
        long jL = mq8Var2.l(jCurrentTimeMillis);
        long jK = mq8Var2.k(timestamp);
        long jL2 = chartVisibleTime > 0 ? mq8Var2.l(chartVisibleTime) : mq8Var2.l(jK);
        long epochMilli = LocalDateTime.ofInstant(Instant.ofEpochMilli(jL2), mq8Var2.d()).toLocalDate().plusDays(31L).atStartOfDay().atZone(mq8Var2.d()).toInstant().toEpochMilli() - 1;
        if (jK < epochMilli) {
            jK = epochMilli;
        }
        long jK2 = mq8Var2.k(System.currentTimeMillis());
        if (jK2 >= jK) {
            jK = jK2;
        }
        String strQ = mq8Var2.q(jL, "yyyyMMdd HH:mm");
        String strQ2 = mq8Var2.q(jK, "yyyyMMdd HH:mm");
        String strQ3 = mq8Var2.q(jL2, "yyyyMMdd HH:mm");
        String strQ4 = mq8Var2.q(epochMilli, "yyyyMMdd HH:mm");
        StringBuilder sb = new StringBuilder();
        long j2 = jL2;
        sb.append("later chartStartTime:");
        sb.append(strQ);
        sb.append("/chartEndTime:");
        sb.append(strQ2);
        sb.append("/lowestVisibleTime:");
        sb.append(strQ3);
        sb.append("/highestVisibleTime:");
        sb.append(strQ4);
        a7b.f(TAG, sb.toString());
        return new i9h(b(jL, jK, arrayList), dataStatList, z, jL, jK, j2, epochMilli);
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
