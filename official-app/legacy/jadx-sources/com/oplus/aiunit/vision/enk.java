package com.oplus.aiunit.vision;

import android.content.Context;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.util.Pair;
import androidx.exifinterface.media.ExifInterface;
import com.heytap.databaseengine.model.DisturbSleep;
import com.heytap.databaseengine.model.DisturbSleepStat;
import com.heytap.health.sleep.disturb.algorithm.bean.AppStats;
import io.protostuff.MapSchema;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.collections.CollectionsKt__MutableCollectionsJVMKt;
import p010kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000\u001a\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000\u001a\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000\u001a&\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002\u001a&\u0010\r\u001a\u00020\u000b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002\u001a\u001c\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0003H\u0002\u001a\u001c\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0003H\u0002\u001a\u001c\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\bH\u0002\u001a\u001c\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\bH\u0002\u001a2\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00032\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0013\" \u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00180\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0019¨\u0006\u001b"}, d2 = {"", "startTime", "endTime", "", "Lcom/heytap/databaseengine/model/DisturbSleep;", b2n.f, "i", b2n.g, "", "Lcom/oplus/aiunit/vision/bnk;", "usageList", "", MapSchema.FIELD_NAME_ENTRY, "f", "a", "d", "disturbSleepList", "b", "c", "", "date", "Lcom/heytap/databaseengine/model/DisturbSleepStat;", "j", "Ljava/util/HashMap;", "", "Ljava/util/HashMap;", "appNameCache", "sleep_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nUsageDataUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UsageDataUtil.kt\ncom/heytap/health/sleep/disturb/util/UsageDataUtilKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,375:1\n1855#2,2:376\n1002#2,2:378\n1855#2,2:380\n1855#2,2:382\n1855#2,2:386\n1855#2,2:388\n215#3,2:384\n*S KotlinDebug\n*F\n+ 1 UsageDataUtil.kt\ncom/heytap/health/sleep/disturb/util/UsageDataUtilKt\n*L\n106#1:376,2\n113#1:378,2\n116#1:380,2\n141#1:382,2\n215#1:386,2\n254#1:388,2\n170#1:384,2\n*E\n"})
public final class enk {

    @NotNull
    public static final HashMap<String, String> a = new HashMap<>();

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 UsageDataUtil.kt\ncom/heytap/health/sleep/disturb/util/UsageDataUtilKt\n*L\n1#1,328:1\n114#2:329\n*E\n"})
    public static final class a<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return ComparisonsKt__ComparisonsKt.compareValues(((bnk) t).getStartTime(), ((bnk) t2).getStartTime());
        }
    }

    public static final List<DisturbSleep> a(List<bnk> list) {
        List<DisturbSleep> listC = c(b(d(list)));
        ArrayList arrayList = new ArrayList();
        for (DisturbSleep disturbSleep : listC) {
            if (disturbSleep.getUseTime() > 0) {
                lw5.a("UsageDataUtil", "one app data: " + disturbSleep);
                arrayList.add(disturbSleep);
            }
        }
        return arrayList;
    }

    public static final List<DisturbSleep> b(List<DisturbSleep> list) {
        ArrayList arrayList = new ArrayList();
        for (DisturbSleep disturbSleep : list) {
            if (arrayList.isEmpty()) {
                arrayList.add(disturbSleep);
            } else {
                DisturbSleep disturbSleep2 = (DisturbSleep) arrayList.get(arrayList.size() - 1);
                if (TextUtils.equals(disturbSleep2.getPackageName(), disturbSleep.getPackageName())) {
                    long startTimestamp = (disturbSleep.getStartTimestamp() - (disturbSleep2.getStartTimestamp() + (((long) disturbSleep2.getUseTime()) * 1000))) / 1000;
                    if (startTimestamp > 0 || disturbSleep.getStartTimestamp() < disturbSleep2.getStartTimestamp()) {
                        arrayList.add(disturbSleep);
                    } else {
                        disturbSleep2.setUseTime(disturbSleep2.getUseTime() + disturbSleep.getUseTime() + ((int) startTimestamp));
                    }
                } else {
                    arrayList.add(disturbSleep);
                }
            }
        }
        return arrayList;
    }

    public static final List<DisturbSleep> c(List<DisturbSleep> list) {
        ArrayList arrayList = new ArrayList();
        for (DisturbSleep disturbSleep : list) {
            int useTime = disturbSleep.getUseTime();
            long startTimestamp = disturbSleep.getStartTimestamp();
            long j2 = 1800000;
            long j3 = startTimestamp % j2;
            int i = ((int) (j2 - j3)) / 1000;
            if (useTime <= i) {
                arrayList.add(disturbSleep);
            } else {
                DisturbSleep disturbSleep2 = new DisturbSleep();
                disturbSleep2.setPackageName(disturbSleep.getPackageName());
                disturbSleep2.setAppName(disturbSleep.getAppName());
                disturbSleep2.setSsoid(disturbSleep.getSsoid());
                disturbSleep2.setStartTimestamp(startTimestamp);
                disturbSleep2.setUseTime(i);
                arrayList.add(disturbSleep2);
                long j4 = (startTimestamp - j3) + j2;
                int i2 = useTime - i;
                int i3 = (i2 / 1800) + 1;
                for (int i4 = 0; i4 < i3; i4++) {
                    long j5 = (((long) i4) * ap6.CDP_MIN_MANUAL_SYNC_TIME_INTERVAL) + j4;
                    DisturbSleep disturbSleep3 = new DisturbSleep();
                    disturbSleep3.setPackageName(disturbSleep.getPackageName());
                    disturbSleep3.setAppName(disturbSleep.getAppName());
                    disturbSleep3.setSsoid(disturbSleep.getSsoid());
                    disturbSleep3.setStartTimestamp(j5);
                    if (i4 < i3 - 1) {
                        disturbSleep3.setUseTime(1800);
                    } else {
                        disturbSleep3.setUseTime(i2 % 1800);
                    }
                    arrayList.add(disturbSleep3);
                }
            }
        }
        return arrayList;
    }

    public static final List<DisturbSleep> d(List<bnk> list) {
        String str;
        ArrayList arrayList = new ArrayList();
        String ssoid = um.c().getSsoid();
        for (bnk bnkVar : list) {
            Long duration = bnkVar.getDuration();
            Intrinsics.checkNotNull(duration);
            int iIntValue = new BigDecimal(duration.longValue()).divide(new BigDecimal(1000), 0, RoundingMode.HALF_UP).intValue();
            if (iIntValue > 0) {
                DisturbSleep disturbSleep = new DisturbSleep();
                disturbSleep.setSsoid(ssoid);
                disturbSleep.setPackageName(bnkVar.getPackageName());
                Long startTime = bnkVar.getStartTime();
                Intrinsics.checkNotNull(startTime);
                disturbSleep.setStartTimestamp(startTime.longValue());
                disturbSleep.setUseTime(iIntValue);
                HashMap<String, String> map = a;
                if (map.containsKey(bnkVar.getPackageName())) {
                    str = map.get(bnkVar.getPackageName());
                } else {
                    String strB = c3e.b(bnkVar.getPackageName());
                    String packageName = bnkVar.getPackageName();
                    Intrinsics.checkNotNull(packageName);
                    map.put(packageName, strB);
                    str = strB;
                }
                disturbSleep.setAppName(str);
                arrayList.add(disturbSleep);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00af  */
    public static final void e(long j2, long j3, List<bnk> list) {
        Long lValueOf;
        gnk gnkVar = gnk.INSTANCE;
        Context contextA = b78.a();
        Intrinsics.checkNotNullExpressionValue(contextA, "getAppContext()");
        Iterator<T> it = gnkVar.g(contextA, j2, j3).entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            int size = ((List) entry.getValue()).size();
            bnk bnkVar = null;
            for (int i = 0; i < size; i++) {
                AppStats appStats = (AppStats) ((List) entry.getValue()).get(i);
                if (bnkVar == null) {
                    bnkVar = new bnk(appStats.getPackageName(), Long.valueOf(appStats.getBeginTime()), Long.valueOf(appStats.getTotalTimeUsed()));
                } else {
                    Long startTime = bnkVar.getStartTime();
                    if (startTime != null) {
                        long jLongValue = startTime.longValue();
                        Long duration = bnkVar.getDuration();
                        Intrinsics.checkNotNull(duration);
                        lValueOf = Long.valueOf(jLongValue + duration.longValue());
                    } else {
                        lValueOf = null;
                    }
                    if (TextUtils.equals(bnkVar.getPackageName(), appStats.getPackageName())) {
                        long beginTime = appStats.getBeginTime();
                        if (lValueOf != null && beginTime == lValueOf.longValue()) {
                            Long duration2 = bnkVar.getDuration();
                            bnkVar.d(duration2 != null ? Long.valueOf(duration2.longValue() + appStats.getTotalTimeUsed()) : null);
                        } else {
                            list.add(bnkVar);
                            bnkVar = new bnk(appStats.getPackageName(), Long.valueOf(appStats.getBeginTime()), Long.valueOf(appStats.getTotalTimeUsed()));
                        }
                    } else {
                        list.add(bnkVar);
                        bnkVar = new bnk(appStats.getPackageName(), Long.valueOf(appStats.getBeginTime()), Long.valueOf(appStats.getTotalTimeUsed()));
                    }
                }
                if (i == size - 1) {
                    list.add(bnkVar);
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0198  */
    public static final void f(long j2, long j3, List<bnk> list) {
        Long lValueOf;
        List<bnk> list2;
        Context contextA = b78.a();
        Intrinsics.checkNotNullExpressionValue(contextA, "getAppContext()");
        Iterator<Map.Entry<String, LongSparseArray<AppStats>>> it = mnk.e(contextA, 2, j2, j3, false).entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, LongSparseArray<AppStats>> next = it.next();
            next.getKey();
            LongSparseArray<AppStats> value = next.getValue();
            int size = value.size();
            String str = "UsageDataUtil";
            lw5.c("UsageDataUtil", "sdk queryUsageStats result size:" + size);
            int i = 0;
            bnk bnkVar = null;
            while (i < size) {
                AppStats appStatsValueAt = value.valueAt(i);
                String packageName = appStatsValueAt.getPackageName();
                long totalTimeUsed = appStatsValueAt.getTotalTimeUsed();
                int count = appStatsValueAt.getCount();
                long beginTime = appStatsValueAt.getBeginTime();
                mq8 mq8Var = mq8.INSTANCE;
                String str2 = str;
                Iterator<Map.Entry<String, LongSparseArray<AppStats>>> it2 = it;
                int i2 = i;
                LongSparseArray<AppStats> longSparseArray = value;
                int i3 = size;
                lw5.a(str2, "AppStats(packageName='" + packageName + "', totalTimeUsed=" + totalTimeUsed + ", count=" + count + ", beginTime=" + beginTime + ",:" + mq8Var.y(appStatsValueAt.getBeginTime(), "yyy-MMM-dd HH:mm") + " endTime=" + appStatsValueAt.getEndTime() + ",:" + mq8Var.y(appStatsValueAt.getEndTime(), "yyy-MMM-dd HH:mm") + " bucketType=" + appStatsValueAt.getBucketType() + ", transformTime=" + appStatsValueAt.getTransformTime() + ", bucketTime=" + appStatsValueAt.getBucketTime() + ")");
                if (bnkVar == null) {
                    bnkVar = new bnk(appStatsValueAt.getPackageName(), Long.valueOf(appStatsValueAt.getBeginTime()), Long.valueOf(appStatsValueAt.getTotalTimeUsed()));
                } else {
                    Long startTime = bnkVar.getStartTime();
                    if (startTime != null) {
                        long jLongValue = startTime.longValue();
                        Long duration = bnkVar.getDuration();
                        Intrinsics.checkNotNull(duration);
                        lValueOf = Long.valueOf(jLongValue + duration.longValue());
                    } else {
                        lValueOf = null;
                    }
                    if (TextUtils.equals(bnkVar.getPackageName(), appStatsValueAt.getPackageName())) {
                        long beginTime2 = appStatsValueAt.getBeginTime();
                        if (lValueOf != null && beginTime2 == lValueOf.longValue()) {
                            Long duration2 = bnkVar.getDuration();
                            bnkVar.d(duration2 != null ? Long.valueOf(duration2.longValue() + appStatsValueAt.getTotalTimeUsed()) : null);
                        }
                        if (i2 == i3 - 1) {
                            list2.add(bnkVar);
                        }
                        i = i2 + 1;
                        str = str2;
                        value = longSparseArray;
                        size = i3;
                        it = it2;
                    }
                    list2 = list;
                    list2.add(bnkVar);
                    bnkVar = new bnk(appStatsValueAt.getPackageName(), Long.valueOf(appStatsValueAt.getBeginTime()), Long.valueOf(appStatsValueAt.getTotalTimeUsed()));
                    if (i2 == i3 - 1) {
                        list2.add(bnkVar);
                    }
                    i = i2 + 1;
                    str = str2;
                    value = longSparseArray;
                    size = i3;
                    it = it2;
                }
                list2 = list;
                if (i2 == i3 - 1) {
                    list2.add(bnkVar);
                }
                i = i2 + 1;
                str = str2;
                value = longSparseArray;
                size = i3;
                it = it2;
            }
        }
    }

    @NotNull
    public static final List<DisturbSleep> g(long j2, long j3) {
        if (j2 <= 0 || j3 <= 0 || j2 >= j3) {
            lw5.c("UsageDataUtil", "queryDisturbData parameter error!");
            List<DisturbSleep> listEmptyList = Collections.emptyList();
            Intrinsics.checkNotNullExpressionValue(listEmptyList, "emptyList()");
            return listEmptyList;
        }
        int iZ = v9g.x("health_common_sp_name").z("health_usage_calculate_route", -1);
        boolean z = iZ != 0;
        lw5.a("UsageDataUtil", "queryDisturbData fromSdk:" + z + ", switchStatus:" + iZ);
        return z ? i(j2, j3) : h(j2, j3);
    }

    @NotNull
    public static final List<DisturbSleep> h(long j2, long j3) {
        lw5.c("UsageDataUtil", "queryDisturbDataFromLocal");
        ArrayList arrayList = new ArrayList();
        e(j2, j3, arrayList);
        return a(arrayList);
    }

    @NotNull
    public static final List<DisturbSleep> i(long j2, long j3) {
        long j4 = j2;
        lw5.c("UsageDataUtil", "queryDisturbDataFromSdk");
        ArrayList<Pair> arrayList = new ArrayList();
        mq8 mq8Var = mq8.INSTANCE;
        long jM = mq8Var.m(j4, mq8Var.n(j3));
        ZoneId zoneIdSystemDefault = ZoneId.systemDefault();
        LocalDateTime localDateTimeOf = LocalDateTime.of(LocalDateTime.ofInstant(Instant.ofEpochMilli(j2), zoneIdSystemDefault).toLocalDate(), LocalTime.MIN);
        LocalDateTime localDateTimeOf2 = LocalDateTime.of(LocalDateTime.ofInstant(Instant.ofEpochMilli(j2), zoneIdSystemDefault).toLocalDate(), LocalTime.MAX);
        lw5.c("UsageDataUtil", "queryDisturbData startTime:" + j4 + ", endTime:" + j3 + " ,offsetDayNum:" + jM);
        long j5 = 0;
        if (0 <= jM) {
            while (true) {
                long epochMilli = localDateTimeOf.plusDays(j5).atZone(zoneIdSystemDefault).toInstant().toEpochMilli();
                long epochMilli2 = localDateTimeOf2.plusDays(j5).atZone(zoneIdSystemDefault).toInstant().toEpochMilli();
                if (epochMilli < j4) {
                    epochMilli = j4;
                }
                if (epochMilli2 > j3) {
                    epochMilli2 = j3;
                }
                arrayList.add(new Pair(Long.valueOf(epochMilli), Long.valueOf(epochMilli2)));
                if (j5 == jM) {
                    break;
                }
                j5++;
                j4 = j2;
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Pair pair : arrayList) {
            lw5.c("UsageDataUtil", "sdk queryUsageStats start:" + pair.first + ", end:" + pair.second);
            Object obj = pair.first;
            Intrinsics.checkNotNullExpressionValue(obj, "pair.first");
            long jLongValue = ((Number) obj).longValue();
            Object obj2 = pair.second;
            Intrinsics.checkNotNullExpressionValue(obj2, "pair.second");
            f(jLongValue, ((Number) obj2).longValue(), arrayList2);
        }
        if (arrayList2.size() > 1) {
            CollectionsKt__MutableCollectionsJVMKt.sortWith(arrayList2, new a());
        }
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            lw5.a("UsageDataUtil", "convert usageItem:" + ((bnk) it.next()));
        }
        return a(arrayList2);
    }

    @NotNull
    public static final List<DisturbSleepStat> j(@NotNull List<? extends DisturbSleep> disturbSleepList, long j2, long j3, int i) {
        List list;
        Intrinsics.checkNotNullParameter(disturbSleepList, "disturbSleepList");
        mq8 mq8Var = mq8.INSTANCE;
        lw5.c("UsageDataUtil", "convert stat " + j2 + " ,:" + mq8Var.y(j2, "yyy-MMM-dd HH:mm") + "/" + j3 + " ,:" + mq8Var.y(j3, "yyy-MMM-dd HH:mm") + " /" + i);
        String ssoid = um.c().getSsoid();
        HashMap map = new HashMap();
        Iterator<? extends DisturbSleep> it = disturbSleepList.iterator();
        while (true) {
            boolean z = false;
            if (!it.hasNext()) {
                break;
            }
            DisturbSleep next = it.next();
            lw5.a("UsageDataUtil", "db details item:" + next);
            if (!map.containsKey(next.getPackageName())) {
                String packageName = next.getPackageName();
                Intrinsics.checkNotNullExpressionValue(packageName, "data.packageName");
                map.put(packageName, new ArrayList());
            }
            long startTimestamp = next.getStartTimestamp();
            if (j2 <= startTimestamp && startTimestamp < j3) {
                z = true;
            }
            if (z && (list = (List) map.get(next.getPackageName())) != null) {
                list.add(next);
            }
        }
        ArrayList arrayList = new ArrayList();
        for (String str : map.keySet()) {
            List arrayList2 = (List) map.get(str);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
            }
            DisturbSleepStat disturbSleepStat = new DisturbSleepStat();
            disturbSleepStat.setPackageName(str);
            disturbSleepStat.setDate(i);
            disturbSleepStat.setAppName(c3e.b(str));
            disturbSleepStat.setSsoid(ssoid);
            disturbSleepStat.setTimezone(v05.r(null));
            disturbSleepStat.setLunchCount(0);
            disturbSleepStat.setTotalDuration(bw5.s(arrayList2));
            arrayList.add(disturbSleepStat);
            lw5.c("UsageDataUtil", "stat item: " + disturbSleepStat);
        }
        return arrayList;
    }
}
