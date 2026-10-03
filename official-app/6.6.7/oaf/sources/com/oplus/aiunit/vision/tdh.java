package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.databaseengine.model.newsleep.BreathRateStat;
import java.time.Instant;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00112\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u001c\u0010\b\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u0005J,\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u00052\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002¨\u0006\u0012"}, d2 = {"Lcom/oplus/aiunit/vision/tdh;", "", "", "Lcom/heytap/databaseengine/model/newsleep/BreathRateStat;", "breathRateStatList", "", "chartVisibleTime", "Lcom/oplus/aiunit/vision/adh;", "a", "startTime", "endTime", "", "Lcom/oplus/aiunit/vision/d3k;", "dataList", "b", "<init>", "()V", "Companion", "sleep_breath_rate_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSleepBRWeekTransform.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SleepBRWeekTransform.kt\ncom/health/sleep_breath_rate/week/model/SleepBRWeekTransform\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,144:1\n1855#2,2:145\n1855#2,2:147\n*S KotlinDebug\n*F\n+ 1 SleepBRWeekTransform.kt\ncom/health/sleep_breath_rate/week/model/SleepBRWeekTransform\n*L\n34#1:145,2\n133#1:147,2\n*E\n"})
public final class tdh {
    public static final int $stable = 0;

    @NotNull
    public static final String TAG = "SleepBRWeekTransform";

    @NotNull
    public final adh a(@NotNull List<BreathRateStat> breathRateStatList, long chartVisibleTime) {
        long jS;
        long j;
        long jR;
        boolean z;
        long jR2;
        Intrinsics.checkNotNullParameter(breathRateStatList, "breathRateStatList");
        m8b.f(TAG, "buildChartData chartVisibleTime:" + chartVisibleTime);
        ArrayList arrayList = new ArrayList();
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (!breathRateStatList.isEmpty()) {
            for (BreathRateStat breathRateStat : breathRateStatList) {
                arrayList.add(new d3k(o15.a(breathRateStat.getDate()), breathRateStat.getMin() / 10.0f, breathRateStat.getMax() / 10.0f));
            }
            long jD = arrayList.get(0).d();
            long jD2 = arrayList.get(arrayList.size() - 1).d();
            pr8 pr8Var = pr8.INSTANCE;
            m8b.f(TAG, "firstDataTime:" + pr8Var.q(jD, "yyyyMMdd HH:mm") + "/lastDataTime:" + pr8Var.q(jD2, "yyyyMMdd HH:mm"));
            long jS2 = pr8Var.s(jD);
            long jR3 = pr8Var.r(jD2);
            long jR4 = pr8Var.r(jCurrentTimeMillis);
            if (jR4 < jR3) {
                jR4 = jR3;
            }
            if (chartVisibleTime > 0) {
                long jS3 = pr8Var.s(chartVisibleTime);
                jR = jR4;
                jR2 = pr8Var.r(chartVisibleTime);
                z = false;
                jS = jS3;
                j = jS2;
            } else {
                long jS4 = pr8Var.s(jR3);
                jR = jR4;
                jR2 = pr8Var.r(jR3);
                j = jS2;
                z = false;
                jS = jS4;
            }
        } else {
            pr8 pr8Var2 = pr8.INSTANCE;
            jS = pr8Var2.s(jCurrentTimeMillis);
            j = jS;
            jR = pr8Var2.r(jCurrentTimeMillis);
            z = true;
            jR2 = jR;
        }
        pr8 pr8Var3 = pr8.INSTANCE;
        String strQ = pr8Var3.q(j, "yyyyMMdd HH:mm");
        String strQ2 = pr8Var3.q(jR, "yyyyMMdd HH:mm");
        String strQ3 = pr8Var3.q(jS, "yyyyMMdd HH:mm");
        String strQ4 = pr8Var3.q(jR2, "yyyyMMdd HH:mm");
        StringBuilder sb = new StringBuilder();
        long j2 = jS;
        sb.append("later chartStartTime:");
        sb.append(strQ);
        sb.append("/chartEndTime:");
        sb.append(strQ2);
        sb.append("/lowestVisibleTime:");
        sb.append(strQ3);
        sb.append("/highestVisibleTime:");
        sb.append(strQ4);
        m8b.f(TAG, sb.toString());
        return new adh(b(j, jR, arrayList), breathRateStatList, z, j, jR, j2, jR2);
    }

    public final List<d3k> b(long startTime, long endTime, List<d3k> dataList) {
        Instant instantOfEpochMilli = Instant.ofEpochMilli(startTime);
        pr8 pr8Var = pr8.INSTANCE;
        LocalDateTime localDateTimeOfInstant = LocalDateTime.ofInstant(instantOfEpochMilli, pr8Var.d());
        long epochDay = LocalDateTime.ofInstant(Instant.ofEpochMilli(endTime), pr8Var.d()).toLocalDate().atStartOfDay().toLocalDate().toEpochDay() - localDateTimeOfInstant.toLocalDate().toEpochDay();
        ArrayList arrayList = new ArrayList();
        long j = 0;
        if (0 <= epochDay) {
            while (true) {
                arrayList.add(new d3k(localDateTimeOfInstant.plusDays(j).atZone(pr8.INSTANCE.d()).toInstant().toEpochMilli(), -10.0f, -10.0f));
                if (j == epochDay) {
                    break;
                }
                j++;
            }
        }
        for (d3k d3kVar : dataList) {
            arrayList.set((int) (LocalDateTime.ofInstant(Instant.ofEpochMilli(d3kVar.d()), pr8.INSTANCE.d()).toLocalDate().toEpochDay() - localDateTimeOfInstant.toLocalDate().toEpochDay()), d3kVar);
        }
        return arrayList;
    }
}
