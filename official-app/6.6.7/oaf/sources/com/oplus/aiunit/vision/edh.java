package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.databaseengine.model.BreathRate;
import com.heytap.databaseengine.model.newsleep.BreathRateStat;
import com.heytap.databaseengine.model.sleepdaystat.SleepDayStat;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0015\u0010\u0016JF\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00022\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tJB\u0010\u0011\u001a\u00020\f2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\tH\u0002J \u0010\u0012\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\tH\u0002J\u0010\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\tH\u0002¨\u0006\u0017"}, d2 = {"Lcom/oplus/aiunit/vision/edh;", "", "", "Lcom/heytap/databaseengine/model/BreathRate;", "breathRateList", "Lcom/heytap/databaseengine/model/newsleep/BreathRateStat;", "breathRateStatList", "Lcom/heytap/databaseengine/model/sleepdaystat/SleepDayStat;", "sleepDayStatList", "", "startTime", "endTime", "Lcom/oplus/aiunit/vision/bdh;", "f", "curBreathRateStat", "curSleepDayStat", "curDayMinTimestamp", "c", "g", "time", "h", "<init>", "()V", "sleep_breath_rate_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSleepBRDayDateTransform.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SleepBRDayDateTransform.kt\ncom/health/sleep_breath_rate/day/model/SleepBRDayDateTransform\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,183:1\n215#2,2:184\n*S KotlinDebug\n*F\n+ 1 SleepBRDayDateTransform.kt\ncom/health/sleep_breath_rate/day/model/SleepBRDayDateTransform\n*L\n123#1:184,2\n*E\n"})
public final class edh {
    public static final int $stable = 0;

    public static final int d(BreathRate breathRate, BreathRate breathRate2) {
        long dataCreatedTimestamp = breathRate.getDataCreatedTimestamp() - breathRate2.getDataCreatedTimestamp();
        if (dataCreatedTimestamp > 0) {
            return 1;
        }
        return dataCreatedTimestamp < 0 ? -1 : 0;
    }

    public static final int e(d3k d3kVar, d3k d3kVar2) {
        long jD = d3kVar.d() - d3kVar2.d();
        if (jD > 0) {
            return 1;
        }
        return jD < 0 ? -1 : 0;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x005b  */
    public final bdh c(List<BreathRate> breathRateList, BreathRateStat curBreathRateStat, SleepDayStat curSleepDayStat, long startTime, long endTime, long curDayMinTimestamp) {
        if (breathRateList.isEmpty()) {
            return g(startTime, endTime, curDayMinTimestamp);
        }
        CollectionsKt.sortWith(breathRateList, new Comparator() { // from class: com.oplus.aiunit.vision.cdh
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return edh.d((BreathRate) obj, (BreathRate) obj2);
            }
        });
        ArrayList arrayList = new ArrayList();
        HashMap map = new HashMap(48);
        float f = 0.0f;
        float f2 = 0.0f;
        for (BreathRate breathRate : breathRateList) {
            long jH = h(breathRate.getDataCreatedTimestamp());
            float fIntValue = breathRate.getValue().intValue() / 10.0f;
            if (f > fIntValue) {
                f = fIntValue;
            } else if (f == 0.0f) {
                f = fIntValue;
            }
            if (f2 < fIntValue) {
                f2 = fIntValue;
            }
            if (map.containsKey(Long.valueOf(jH))) {
                d3k d3kVar = (d3k) map.get(Long.valueOf(jH));
                Intrinsics.checkNotNull(d3kVar);
                if (d3kVar.b() < fIntValue) {
                    d3kVar.f(fIntValue);
                }
                if (d3kVar.c() > fIntValue) {
                    d3kVar.g(fIntValue);
                }
            } else {
                map.put(Long.valueOf(jH), new d3k(jH, fIntValue, fIntValue));
            }
        }
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add(((Map.Entry) it.next()).getValue());
        }
        CollectionsKt.sortWith(arrayList, new Comparator() { // from class: com.oplus.aiunit.vision.ddh
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return edh.e((d3k) obj, (d3k) obj2);
            }
        });
        bdh bdhVar = new bdh();
        bdhVar.j(curDayMinTimestamp);
        bdhVar.r(curSleepDayStat != null ? curSleepDayStat.getSleepInTime() : startTime);
        bdhVar.q(curSleepDayStat != null ? curSleepDayStat.getSleepOutTime() : endTime);
        bdhVar.p(f);
        bdhVar.o(f2);
        bdhVar.b().addAll(arrayList);
        bdhVar.l(arrayList.isEmpty());
        bdhVar.n(gmk.b(curBreathRateStat != null ? Integer.valueOf(curBreathRateStat.getReasonableRangeLow()) : null) / 10.0f);
        bdhVar.m(gmk.b(curBreathRateStat != null ? Integer.valueOf(curBreathRateStat.getReasonableRangeHigh()) : null) / 10.0f);
        return bdhVar;
    }

    @NotNull
    public final List<bdh> f(@NotNull List<BreathRate> breathRateList, @NotNull List<BreathRateStat> breathRateStatList, @NotNull List<SleepDayStat> sleepDayStatList, long startTime, long endTime) {
        SleepDayStat sleepDayStat;
        BreathRateStat breathRateStat;
        List<BreathRate> list = breathRateList;
        Intrinsics.checkNotNullParameter(list, "breathRateList");
        Intrinsics.checkNotNullParameter(breathRateStatList, "breathRateStatList");
        Intrinsics.checkNotNullParameter(sleepDayStatList, "sleepDayStatList");
        long jM = pr8.INSTANCE.m(startTime, endTime);
        ZoneId zoneIdSystemDefault = ZoneId.systemDefault();
        LocalDateTime localDateTimeOfInstant = LocalDateTime.ofInstant(Instant.ofEpochMilli(startTime), zoneIdSystemDefault);
        ArrayList arrayList = new ArrayList();
        long j = 0;
        while (j < jM) {
            int i = 0;
            long epochMilli = localDateTimeOfInstant.plusDays(j).withHour(20).withMinute(0).withSecond(0).withNano(0).atZone(zoneIdSystemDefault).toInstant().toEpochMilli();
            j++;
            long epochMilli2 = localDateTimeOfInstant.plusDays(j).withHour(20).withMinute(0).withSecond(0).withNano(0).atZone(zoneIdSystemDefault).toInstant().toEpochMilli();
            pr8 pr8Var = pr8.INSTANCE;
            int iE = pr8Var.e(epochMilli2);
            long jC = pr8Var.c(epochMilli2);
            ArrayList arrayList2 = new ArrayList();
            int size = breathRateList.size();
            while (i < size) {
                BreathRate breathRate = list.get(i);
                long dataCreatedTimestamp = breathRate.getDataCreatedTimestamp();
                if (epochMilli <= dataCreatedTimestamp && dataCreatedTimestamp < epochMilli2) {
                    arrayList2.add(breathRate);
                }
                i++;
                list = breathRateList;
            }
            int size2 = sleepDayStatList.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size2) {
                    sleepDayStat = null;
                    break;
                }
                sleepDayStat = sleepDayStatList.get(i2);
                if (sleepDayStat.getDate() == iE) {
                    break;
                }
                i2++;
            }
            int size3 = breathRateStatList.size();
            int i3 = 0;
            while (true) {
                if (i3 >= size3) {
                    breathRateStat = null;
                    break;
                }
                BreathRateStat breathRateStat2 = breathRateStatList.get(i3);
                int i4 = size3;
                if (breathRateStat2.getDate() == iE) {
                    breathRateStat = breathRateStat2;
                    break;
                }
                i3++;
                size3 = i4;
            }
            arrayList.add(c(arrayList2, breathRateStat, sleepDayStat, epochMilli, epochMilli2, jC));
            list = breathRateList;
        }
        return arrayList;
    }

    public final bdh g(long startTime, long endTime, long curDayMinTimestamp) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new d3k(startTime, -10.0f, -10.0f));
        arrayList.add(new d3k(endTime, -10.0f, -10.0f));
        bdh bdhVar = new bdh();
        bdhVar.j(curDayMinTimestamp);
        bdhVar.r(startTime);
        bdhVar.q(endTime);
        bdhVar.k(arrayList);
        bdhVar.l(true);
        bdhVar.n(0.0f);
        bdhVar.m(0.0f);
        return bdhVar;
    }

    public final long h(long time) {
        LocalDateTime localDateTimeOfInstant = LocalDateTime.ofInstant(Instant.ofEpochMilli(time), ZoneId.systemDefault());
        int minute = localDateTimeOfInstant.getMinute();
        return localDateTimeOfInstant.withMinute(minute >= 0 && minute < 30 ? 0 : 30).withSecond(0).withNano(0).atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
    }
}
