package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.databaseengine.model.newsleep.BreathRateStat;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00142\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u001c\u0010\b\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u0005J@\u0010\u0011\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u00052\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0002¨\u0006\u0015"}, d2 = {"Lcom/oplus/aiunit/vision/wdh;", "", "", "Lcom/heytap/databaseengine/model/newsleep/BreathRateStat;", "dataStatList", "", "chartVisibleTime", "Lcom/oplus/aiunit/vision/adh;", "a", "startTime", "endTime", "chartLowestVisibleTime", "", "Lcom/oplus/aiunit/vision/d3k;", "dataList", "Lkotlin/Pair;", "", "b", "<init>", "()V", "Companion", "sleep_breath_rate_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSleepBRYearTransform.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SleepBRYearTransform.kt\ncom/health/sleep_breath_rate/year/SleepBRYearTransform\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,142:1\n1855#2,2:143\n1855#2,2:145\n*S KotlinDebug\n*F\n+ 1 SleepBRYearTransform.kt\ncom/health/sleep_breath_rate/year/SleepBRYearTransform\n*L\n29#1:143,2\n131#1:145,2\n*E\n"})
public final class wdh {
    public static final int $stable = 0;

    @NotNull
    public static final String TAG = "SleepBRYearTransform";

    @NotNull
    public final adh a(@NotNull List<BreathRateStat> dataStatList, long chartVisibleTime) {
        long jD;
        long jD2;
        boolean z;
        long jU;
        long jT;
        Intrinsics.checkNotNullParameter(dataStatList, "dataStatList");
        m8b.f(TAG, "buildChartData");
        long jCurrentTimeMillis = System.currentTimeMillis();
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        ArrayList arrayList = new ArrayList();
        if (!dataStatList.isEmpty()) {
            for (BreathRateStat breathRateStat : dataStatList) {
                arrayList.add(new d3k(o15.a(breathRateStat.getDate()), breathRateStat.getMin() / 10.0f, breathRateStat.getMax() / 10.0f));
            }
            z = false;
            jD2 = arrayList.get(0).d();
            jD = arrayList.get(arrayList.size() - 1).d();
            pr8 pr8Var = pr8.INSTANCE;
            m8b.f(TAG, "firstDataTime:" + pr8Var.q(jD2, "yyyyMMdd HH:mm") + "/lastDataTime:" + pr8Var.q(jD, "yyyyMMdd HH:mm"));
        } else {
            jD = jCurrentTimeMillis2;
            jD2 = jCurrentTimeMillis;
            z = true;
        }
        pr8 pr8Var2 = pr8.INSTANCE;
        long jU2 = pr8Var2.u(jD2);
        long jT2 = pr8Var2.t(jD);
        if (chartVisibleTime > 0) {
            long jU3 = pr8Var2.u(chartVisibleTime);
            jT = pr8Var2.t(chartVisibleTime);
            jU = jU3;
        } else {
            jU = pr8Var2.u(jT2);
            jT = jT2;
        }
        long jT3 = pr8Var2.t(System.currentTimeMillis());
        long j = jT3 < jT2 ? jT2 : jT3;
        boolean z2 = z;
        long j2 = j;
        m8b.f(TAG, "later chartStartTime:" + pr8Var2.q(jU2, "yyyy-MM-dd HH:mm") + "/chartEndTime:" + pr8Var2.q(j, "yyyy-MM-dd HH:mm") + "/!" + jT2 + "/lowestVisibleTime:" + pr8Var2.q(jU, "YYYY-MM-dd HH:mm") + "/highestVisibleTime:" + pr8Var2.q(jT, "yyyy-MM-dd HH:mm"));
        Pair<List<d3k>, Integer> pairB = b(jU2, j2, jU, arrayList);
        adh adhVar = new adh((List) pairB.getFirst(), dataStatList, z2, jU2, j2, jU, jT);
        adhVar.i(((Number) pairB.getSecond()).intValue());
        return adhVar;
    }

    public final Pair<List<d3k>, Integer> b(long startTime, long endTime, long chartLowestVisibleTime, List<d3k> dataList) {
        Instant instantOfEpochMilli = Instant.ofEpochMilli(startTime);
        pr8 pr8Var = pr8.INSTANCE;
        LocalDateTime localDateTimeOfInstant = LocalDateTime.ofInstant(instantOfEpochMilli, pr8Var.d());
        long totalMonths = Period.between(localDateTimeOfInstant.toLocalDate().withDayOfMonth(1), LocalDateTime.ofInstant(Instant.ofEpochMilli(endTime), pr8Var.d()).toLocalDate().atStartOfDay().toLocalDate().withDayOfMonth(1)).toTotalMonths();
        ArrayList arrayList = new ArrayList();
        long j = 0;
        int i = 0;
        if (0 <= totalMonths) {
            while (true) {
                long epochMilli = localDateTimeOfInstant.plusMonths(j).atZone(pr8.INSTANCE.d()).toInstant().toEpochMilli();
                arrayList.add(new d3k(epochMilli, -10.0f, -10.0f));
                if (chartLowestVisibleTime == epochMilli) {
                    i = (int) j;
                }
                if (j == totalMonths) {
                    break;
                }
                j++;
            }
        }
        for (d3k d3kVar : dataList) {
            arrayList.set((int) Period.between(localDateTimeOfInstant.toLocalDate().withDayOfMonth(1), LocalDateTime.ofInstant(Instant.ofEpochMilli(d3kVar.d()), pr8.INSTANCE.d()).toLocalDate().withDayOfMonth(1)).toTotalMonths(), d3kVar);
        }
        return new Pair<>(arrayList, Integer.valueOf(i));
    }
}
