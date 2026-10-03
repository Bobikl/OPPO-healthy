package com.oplus.aiunit.vision;

import android.content.Context;
import android.util.ArrayMap;
import android.util.LongSparseArray;
import androidx.annotation.VisibleForTesting;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Triple;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\"\u0010#Jn\u0010\u000f\u001a(\u0012\u0004\u0012\u00020\b\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\b\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000e0\r\u0018\u00010\r0\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0007Jo\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\b2,\u0010\u0012\u001a(\u0012\u0004\u0012\u00020\b\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\b\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000e0\r\u0018\u00010\r0\u00112\u0018\u0010\u0014\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00132\u0006\u0010\f\u001a\u00020\u000bH\u0001¢\u0006\u0004\b\u0016\u0010\u0017Jy\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u00182,\u0010\u0012\u001a(\u0012\u0004\u0012\u00020\b\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\b\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000e0\r\u0018\u00010\r0\u00112\u0018\u0010\u0014\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00132\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0001¢\u0006\u0004\b\u001a\u0010\u001bJS\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072,\u0010\u0012\u001a(\u0012\u0004\u0012\u00020\b\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\b\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000e0\r\u0018\u00010\r0\u0011H\u0001¢\u0006\u0004\b\u001c\u0010\u001dJF\u0010!\u001a&\u0012\u0004\u0012\u00020\b\u0012\u001c\u0012\u001a\u0012\u0004\u0012\u00020\b\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000e0\r0\r0\r2\u0018\u0010 \u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u001e0\u0011H\u0003¨\u0006$"}, d2 = {"Lcom/oplus/aiunit/vision/n4b;", "", "Landroid/content/Context;", "context", "", "beginTime", "endTime", "", "", "dateArray", "weekDateArray", "", "shouldHandleLast", "", "Lcom/oplus/aiunit/vision/e15;", "e", "date", "Landroid/util/ArrayMap;", "dailyUsageMap", "Lkotlin/Triple;", "timeTriple", "", "d", "(Landroid/content/Context;Ljava/lang/String;Landroid/util/ArrayMap;Lkotlin/Triple;Z)V", "Lcom/oplus/aiunit/vision/m15;", "dailyUsageCache", "c", "(Landroid/content/Context;Ljava/lang/String;Lcom/oplus/aiunit/vision/m15;Landroid/util/ArrayMap;Lkotlin/Triple;Z)V", "b", "(Ljava/lang/String;Ljava/util/List;Landroid/util/ArrayMap;)V", "Landroid/util/LongSparseArray;", "Lcom/oplus/aiunit/vision/xc0;", "appUsageMaps", "a", "<init>", "()V", "usagecalculate_release"}, k = 1, mv = {1, 6, 0})
public final class n4b {

    @NotNull
    public static final n4b INSTANCE = new n4b();

    @JvmStatic
    public static final Map<String, Map<String, Map<String, e15>>> a(ArrayMap<String, LongSparseArray<AppStats>> appUsageMaps) {
        ArrayMap arrayMap = new ArrayMap();
        new LinkedHashMap();
        new LinkedHashMap();
        Collection<LongSparseArray<AppStats>> collectionValues = appUsageMaps.values();
        Intrinsics.checkNotNullExpressionValue(collectionValues, "appUsageMaps.values");
        Iterator<T> it = collectionValues.iterator();
        while (it.hasNext()) {
            LongSparseArray longSparseArray = (LongSparseArray) it.next();
            Intrinsics.checkNotNullExpressionValue(longSparseArray, "appStatsList");
            int size = longSparseArray.size();
            for (int i = 0; i < size; i++) {
                longSparseArray.keyAt(i);
                AppStats appStats = (AppStats) longSparseArray.valueAt(i);
                int[] iArrI = q3k.i(appStats.getBucketTime());
                Intrinsics.checkNotNullExpressionValue(iArrI, "splitDateHour(appStats.bucketTime)");
                Map arrayMap2 = (Map) arrayMap.get(String.valueOf(iArrI[0]));
                if (arrayMap2 == null) {
                    arrayMap2 = new ArrayMap();
                    arrayMap.put(String.valueOf(iArrI[0]), arrayMap2);
                }
                Map arrayMap3 = (Map) arrayMap2.get(String.valueOf(iArrI[1]));
                if (arrayMap3 == null) {
                    arrayMap3 = new ArrayMap();
                    arrayMap2.put(String.valueOf(iArrI[1]), arrayMap3);
                }
                arrayMap3.put(appStats.getPackageName(), new e15(appStats.getPackageName(), iArrI[0], iArrI[1], appStats.getCount(), appStats.getTotalTimeUsed()));
            }
        }
        return arrayMap;
    }

    @JvmStatic
    @VisibleForTesting
    public static final void b(@NotNull String date, @NotNull List<String> dateArray, @NotNull ArrayMap<String, Map<String, Map<String, e15>>> dailyUsageMap) {
        Intrinsics.checkNotNullParameter(date, "date");
        Intrinsics.checkNotNullParameter(dateArray, "dateArray");
        Intrinsics.checkNotNullParameter(dailyUsageMap, "dailyUsageMap");
        if (dateArray.contains(date) || dailyUsageMap.containsKey(date)) {
            return;
        }
        dailyUsageMap.put(date, new ArrayMap());
    }

    @JvmStatic
    @VisibleForTesting
    public static final void c(@NotNull Context context, @NotNull String date, @NotNull m15 dailyUsageCache, @NotNull ArrayMap<String, Map<String, Map<String, e15>>> dailyUsageMap, @NotNull Triple<Long, Long, Long> timeTriple, boolean shouldHandleLast) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(date, "date");
        Intrinsics.checkNotNullParameter(dailyUsageCache, "dailyUsageCache");
        Intrinsics.checkNotNullParameter(dailyUsageMap, "dailyUsageMap");
        Intrinsics.checkNotNullParameter(timeTriple, "timeTriple");
        Map<String, Map<String, e15>> mapA = dailyUsageCache.a(date);
        long jLongValue = ((Number) timeTriple.getFirst()).longValue();
        long jLongValue2 = ((Number) timeTriple.getSecond()).longValue();
        zp2.c("UsageLoadDataUtils", "start queryUsageStats: maybeStartTime = " + jLongValue + ", beginTime = " + jLongValue2);
        if (mapA == null || mapA.isEmpty()) {
            long j = 86400000 + jLongValue;
            mapA = a(j >= jLongValue2 ? rrk.e(context, 1, Math.max(jLongValue, jLongValue2), j, shouldHandleLast) : new ArrayMap<>()).get(date);
            if (mapA == null) {
                mapA = new ArrayMap<>();
            }
            dailyUsageCache.b(date, mapA);
        }
        dailyUsageMap.put(date, mapA);
    }

    @JvmStatic
    @VisibleForTesting
    public static final void d(@NotNull Context context, @NotNull String date, @NotNull ArrayMap<String, Map<String, Map<String, e15>>> dailyUsageMap, @NotNull Triple<Long, Long, Long> timeTriple, boolean shouldHandleLast) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(date, "date");
        Intrinsics.checkNotNullParameter(dailyUsageMap, "dailyUsageMap");
        Intrinsics.checkNotNullParameter(timeTriple, "timeTriple");
        long jLongValue = ((Number) timeTriple.getFirst()).longValue();
        long jLongValue2 = ((Number) timeTriple.getSecond()).longValue();
        long jLongValue3 = ((Number) timeTriple.getThird()).longValue();
        zp2.c("UsageLoadDataUtils", "start queryUsageStats: maybeStartTime = " + jLongValue + ", beginTime = " + jLongValue2 + ", endTime = " + jLongValue3);
        Map<String, Map<String, e15>> arrayMap = a(rrk.e(context, 1, Math.max(jLongValue, jLongValue2), jLongValue3, shouldHandleLast)).get(date);
        if (arrayMap == null) {
            arrayMap = new ArrayMap<>();
        }
        dailyUsageMap.put(date, arrayMap);
    }

    @JvmStatic
    @NotNull
    public static final Map<String, Map<String, Map<String, e15>>> e(@NotNull Context context, long beginTime, long endTime, @NotNull List<String> dateArray, @Nullable List<String> weekDateArray, boolean shouldHandleLast) {
        Object obj;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(dateArray, "dateArray");
        ArrayMap arrayMap = new ArrayMap();
        m15 m15VarA = stb.a();
        zp2.c("UsageLoadDataUtils", "transformSevenUsageData() beginTime = " + beginTime + " , endTime = " + endTime + " , dateArray = " + ((Object) q3k.h(dateArray)));
        for (String str : dateArray) {
            try {
                Result.Companion companion = Result.Companion;
                obj = Result.constructor-impl(Integer.valueOf(Integer.parseInt(str)));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                obj = Result.constructor-impl(ResultKt.createFailure(th));
            }
            if (Result.isFailure-impl(obj)) {
                obj = 0;
            }
            long jG = q3k.g(((Number) obj).intValue());
            zp2.c("UsageLoadDataUtils", "transformSevenUsageData: " + str + ", maybeStartTime = " + jG + ", beginTime=" + beginTime + ", endTime=" + endTime);
            Triple triple = new Triple(Long.valueOf(jG), Long.valueOf(beginTime), Long.valueOf(endTime));
            if (q3k.e(str)) {
                d(context, str, arrayMap, triple, shouldHandleLast);
            } else {
                c(context, str, m15VarA, arrayMap, triple, shouldHandleLast);
            }
        }
        if (weekDateArray != null) {
            Iterator<T> it = weekDateArray.iterator();
            while (it.hasNext()) {
                b((String) it.next(), dateArray, arrayMap);
            }
        }
        return arrayMap;
    }
}
