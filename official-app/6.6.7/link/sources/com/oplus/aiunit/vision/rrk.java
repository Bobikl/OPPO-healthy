package com.oplus.aiunit.vision;

import android.content.Context;
import android.util.ArrayMap;
import android.util.LongSparseArray;
import androidx.annotation.VisibleForTesting;
import com.oplus.smartenginehelper.ParserTag;
import com.oplus.utrace.lib.ConstValuesKt;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b!\u0010\"JD\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\tH\u0007J\u0017\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0010\u0010\u0011Ja\u0010\u001a\u001a\u00020\u00192\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\u00122\u0006\u0010\u0014\u001a\u00020\f2\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u00122\u0006\u0010\u0016\u001a\u00020\t2\u0018\u0010\u0018\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\u0017H\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0018\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u0006H\u0003J\u001f\u0010\u001f\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\u001f\u0010 ¨\u0006#"}, d2 = {"Lcom/oplus/aiunit/vision/rrk;", "", "Landroid/content/Context;", "context", "", "bucketType", "", "beginTime", "endTime", "", "shouldHandleLast", "Landroid/util/ArrayMap;", "", "Landroid/util/LongSparseArray;", "Lcom/oplus/aiunit/vision/xc0;", "e", "b", "(I)J", "Lkotlin/Pair;", "bucketPair", "pkg", "timePair", ParserTag.DATA_SAME_COUNT, "", "statsOut", "", "d", "(Lkotlin/Pair;Ljava/lang/String;Lkotlin/Pair;ZLjava/util/Map;)V", "timeStart", "c", "timeEnd", "a", "(JJ)Z", "<init>", "()V", "usagecalculate_release"}, k = 1, mv = {1, 6, 0})
public final class rrk {

    @NotNull
    public static final rrk INSTANCE = new rrk();

    @JvmStatic
    @VisibleForTesting
    public static final boolean a(long timeStart, long timeEnd) {
        long j = timeEnd - timeStart;
        return 0 <= j && j < 86400001;
    }

    @JvmStatic
    @VisibleForTesting
    public static final long b(int bucketType) {
        if (bucketType == 0) {
            return 86400000L;
        }
        if (bucketType != 1) {
            return bucketType != 2 ? -1L : 60000L;
        }
        return ConstValuesKt.HOUR;
    }

    @JvmStatic
    public static final long c(int bucketType, long timeStart) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeZone(q3k.TIME_ZONE);
        calendar.setTimeInMillis(timeStart);
        if (bucketType == 0) {
            calendar.set(11, 0);
            calendar.set(12, 0);
            calendar.set(13, 0);
            calendar.set(14, 0);
        } else if (bucketType == 1) {
            calendar.set(12, 0);
            calendar.set(13, 0);
            calendar.set(14, 0);
        } else if (bucketType == 2) {
            calendar.set(13, 0);
            calendar.set(14, 0);
        }
        return calendar.getTimeInMillis();
    }

    @JvmStatic
    @VisibleForTesting
    public static final void d(@NotNull Pair<Integer, Long> bucketPair, @NotNull String pkg, @NotNull Pair<Long, Long> timePair, boolean count, @NotNull Map<String, LongSparseArray<AppStats>> statsOut) {
        long j;
        long j2;
        long j3;
        String str;
        AppStats appStats;
        String str2 = pkg;
        Map<String, LongSparseArray<AppStats>> map = statsOut;
        Intrinsics.checkNotNullParameter(bucketPair, "bucketPair");
        Intrinsics.checkNotNullParameter(str2, "pkg");
        Intrinsics.checkNotNullParameter(timePair, "timePair");
        Intrinsics.checkNotNullParameter(map, "statsOut");
        long jLongValue = ((Number) timePair.getFirst()).longValue();
        long jLongValue2 = ((Number) timePair.getSecond()).longValue();
        long jLongValue3 = ((Number) bucketPair.getSecond()).longValue();
        int iIntValue = ((Number) bucketPair.getFirst()).intValue();
        String str3 = "UsageTransformManager";
        if (!a(jLongValue, jLongValue2)) {
            zp2.a("UsageTransformManager", "process a abnormal time pair: " + jLongValue + ',' + jLongValue2);
            return;
        }
        long jC = c(iIntValue, jLongValue);
        boolean z = count;
        long j4 = jLongValue;
        long j5 = jC + jLongValue3;
        long j6 = jC;
        while (j4 < jLongValue2) {
            long jMin = Math.min(j5, jLongValue2);
            long j7 = jMin - j4;
            LongSparseArray<AppStats> longSparseArray = map.get(str2);
            if (longSparseArray == null) {
                longSparseArray = new LongSparseArray<>();
                map.put(str2, longSparseArray);
            }
            LongSparseArray<AppStats> longSparseArray2 = longSparseArray;
            AppStats appStats2 = longSparseArray2.get(j6);
            if (appStats2 == null) {
                long j8 = j6;
                appStats = new AppStats(pkg, 0L, 0, 0L, 0L, 0, 0L, 0L, 254, null);
                j3 = j4;
                appStats.i(j3);
                j2 = jMin;
                appStats.m(j2);
                j = j8;
                longSparseArray2.put(j, appStats);
            } else {
                j = j6;
                j2 = jMin;
                j3 = j4;
            }
            if (z) {
                appStats2 = appStats;
                appStats2.l(appStats2.getCount() + 1);
                z = false;
            }
            appStats2 = appStats;
            appStats2.i(Math.min(appStats2.getBeginTime(), j3));
            appStats2.m(Math.max(appStats2.getEndTime(), j2));
            appStats2.j(j);
            int i = iIntValue;
            appStats2.k(i);
            appStats2.n(pkg);
            appStats2.o(appStats2.getTotalTimeUsed() + j7);
            long j9 = jLongValue3;
            if (appStats2.getTotalTimeUsed() > j9) {
                str = str3;
                zp2.a(str, "transform error, illegal stats " + appStats2 + ",but interval is " + j9);
                appStats2.o(j9);
            } else {
                str = str3;
            }
            long j10 = j2 + j9;
            long j11 = j + j9;
            map = statsOut;
            str2 = pkg;
            iIntValue = i;
            j5 = j10;
            jLongValue2 = jLongValue2;
            jLongValue3 = j9;
            str3 = str;
            j4 = j2;
            j6 = j11;
        }
    }

    @JvmStatic
    @VisibleForTesting
    @NotNull
    public static final ArrayMap<String, LongSparseArray<AppStats>> e(@NotNull Context context, int bucketType, long beginTime, long endTime, boolean shouldHandleLast) {
        Intrinsics.checkNotNullParameter(context, "context");
        long jB = q3k.b(beginTime);
        zp2.c("UsageTransformManager", "queryUsageStats buck:" + bucketType + " begin:" + ((Object) q3k.a(beginTime)) + " to:" + ((Object) q3k.a(endTime)) + ' ' + beginTime + ' ' + endTime + ' ' + jB);
        List<String> listE = b5e.e(context);
        Intrinsics.checkNotNullExpressionValue(listE, "getLauncherAppNameList(context)");
        Map<String, nc0> mapG = z07.g(context, listE, beginTime, endTime, jB, shouldHandleLast);
        ArrayMap<String, LongSparseArray<AppStats>> arrayMap = new ArrayMap<>();
        long jB2 = b(bucketType);
        if (jB2 < 0) {
            zp2.a("UsageTransformManager", Intrinsics.stringPlus("illegal argument bucketType=", Integer.valueOf(bucketType)));
            return arrayMap;
        }
        Iterator<Map.Entry<String, nc0>> it = mapG.entrySet().iterator();
        while (it.hasNext()) {
            Iterator<T> it2 = it.next().getValue().a().iterator();
            while (it2.hasNext()) {
                Pair pair = (Pair) it2.next();
                d(new Pair(Integer.valueOf(bucketType), Long.valueOf(jB2)), ((ExtraAppUsage) pair.getFirst()).getPackageName(), new Pair(Long.valueOf(((ExtraAppUsage) pair.getFirst()).getTimeStamp()), Long.valueOf(((ExtraAppUsage) pair.getSecond()).getTimeStamp())), true, arrayMap);
            }
        }
        return arrayMap;
    }
}
