package com.oplus.aiunit.vision;

import android.app.usage.UsageEvents;
import android.app.usage.UsageStatsManager;
import android.content.Context;
import androidx.annotation.VisibleForTesting;
import com.oplus.pantanal.seedling.constants.TraceConstants;
import com.oplus.weatherservicesdk.data.Weather;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b;\u0010<J1\u0010\n\u001a\u00020\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0001¢\u0006\u0004\b\n\u0010\u000bJL\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0003\u001a\u00020\u00022\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\tH\u0007J.\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00120\u00112\u0018\u0010\u0017\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00150\u0014H\u0003J6\u0010!\u001a\u00020 2\u0006\u0010\u0019\u001a\u00020\u00052\u0018\u0010\u001c\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001b0\u001a0\u00042\n\u0010\u001f\u001a\u00060\u001dj\u0002`\u001eH\u0003J\u001e\u0010#\u001a\u00020\u00122\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\u0006\u0010\u0019\u001a\u00020\u0005H\u0003Jp\u0010&\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00150\u00142\u0006\u0010\u0003\u001a\u00020\u00022\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042$\u0010%\u001a \u0012\u0004\u0012\u00020\u0005\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020$0\u00150\u00110\u00112\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\tH\u0003JD\u0010(\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020$0\u001a0\u00152\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\f2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020$0\u00152\n\u0010\u001f\u001a\u00060\u001dj\u0002`\u001eH\u0003J.\u0010*\u001a\u00020 2\u0018\u0010)\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020$0\u001a0\u00152\n\u0010\u001f\u001a\u00060\u001dj\u0002`\u001eH\u0003J\\\u0010,\u001a\u00020 2$\u0010+\u001a \u0012\u0004\u0012\u00020\u0005\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020$0\u00150\u00110\u00142\f\u0010'\u001a\b\u0012\u0004\u0012\u00020$0\u00152\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\fH\u0003J\\\u0010.\u001a\u00020 2$\u0010-\u001a \u0012\u0004\u0012\u00020\u0005\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020$0\u00150\u00110\u00142\f\u0010'\u001a\b\u0012\u0004\u0012\u00020$0\u00152\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\fH\u0003JV\u00100\u001a \u0012\u0004\u0012\u00020\u0005\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020$0\u00150\u00110\u00112\u0006\u0010\u0003\u001a\u00020\u00022\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010/\u001a\u00020\tH\u0003J.\u00102\u001a\u00020 2$\u00101\u001a \u0012\u0004\u0012\u00020\u0005\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020$0\u00150\u00110\u0011H\u0003J\u001c\u00104\u001a\u00020 2\u0006\u00103\u001a\u00020\u00052\n\u0010\u001f\u001a\u00060\u001dj\u0002`\u001eH\u0003J6\u00105\u001a\u00020 2\u0006\u0010\b\u001a\u00020\u00072$\u00101\u001a \u0012\u0004\u0012\u00020\u0005\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020$0\u00150\u00140\u0014H\u0003J\u0010\u00107\u001a\u0002062\u0006\u0010\b\u001a\u00020\u0007H\u0003R\u0014\u00108\u001a\u0002068\u0006X\u0086T¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010:\u001a\u0002068\u0006X\u0086T¢\u0006\u0006\n\u0004\b:\u00109¨\u0006="}, d2 = {"Lcom/oplus/aiunit/vision/z07;", "", "Landroid/content/Context;", "context", "", "", "pkgList", "Landroid/app/usage/UsageEvents$Event;", "event", "", "d", "(Landroid/content/Context;Ljava/util/List;Landroid/app/usage/UsageEvents$Event;)Z", "", "startTime", "endTime", "earlyStartTime", "shouldCheckLast", "", "Lcom/oplus/aiunit/vision/nc0;", "g", "", "", "Lcom/oplus/aiunit/vision/cp;", "map", "b", TraceConstants.KEY_PKG_NAME, "Lkotlin/Pair;", "Lcom/oplus/aiunit/vision/w07;", "appExtraAppUsage", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "stringBuilder", "", "l", "list", "c", "Lcom/oplus/aiunit/vision/bp;", "activityEventInfo", "i", "infoList", "n", "pairs", "h", "nextDailyData", "k", "perDailyData", "j", "isGetCurrentDate", "e", "result", "o", "tag", "m", "a", "", "f", "FOREGROUND", "I", "BACKGROUND", "<init>", "()V", "usagecalculate_release"}, k = 1, mv = {1, 6, 0})
public final class z07 {
    public static final int BACKGROUND = 2;
    public static final int FOREGROUND = 1;

    @NotNull
    public static final z07 INSTANCE = new z07();

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2"}, k = 3, mv = {1, 6, 0}, xi = 48)
    public static final class a<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return ComparisonsKt.compareValues(Long.valueOf(((bp) t).getTimeStamp()), Long.valueOf(((bp) t2).getTimeStamp()));
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2"}, k = 3, mv = {1, 6, 0}, xi = 48)
    public static final class b<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return ComparisonsKt.compareValues(Long.valueOf(((bp) ((Pair) t).getFirst()).getTimeStamp()), Long.valueOf(((bp) ((Pair) t2).getFirst()).getTimeStamp()));
        }
    }

    @JvmStatic
    public static final void a(UsageEvents.Event event, Map<String, Map<String, List<bp>>> result) {
        String packageName = event.getPackageName();
        Map<String, List<bp>> linkedHashMap = result.get(packageName);
        if (linkedHashMap == null) {
            linkedHashMap = new LinkedHashMap<>();
        }
        Map<String, List<bp>> map = linkedHashMap;
        StringBuilder sb = new StringBuilder();
        sb.append((Object) event.getClassName());
        sb.append('/');
        sb.append(f(event));
        String string = sb.toString();
        List<bp> arrayList = map.get(string);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
        }
        List<bp> list = arrayList;
        Intrinsics.checkNotNullExpressionValue(packageName, "packageName");
        list.add(new bp(packageName, string, event.getTimeStamp(), event.getEventType()));
        if (list.size() > 1) {
            CollectionsKt.sortWith(list, new a());
        }
        map.put(string, list);
        result.put(packageName, map);
    }

    @JvmStatic
    public static final Map<String, nc0> b(Map<String, List<cp>> map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        StringBuilder sb = new StringBuilder();
        boolean zD = zp2.d();
        for (Map.Entry<String, List<cp>> entry : map.entrySet()) {
            String key = entry.getKey();
            nc0 nc0VarC = c(entry.getValue(), key);
            linkedHashMap.put(key, nc0VarC);
            if (zD) {
                l(key, nc0VarC.a(), sb);
            }
        }
        return linkedHashMap;
    }

    @JvmStatic
    public static final nc0 c(List<cp> list, String pkgName) {
        ArrayList arrayList = new ArrayList();
        nc0 nc0Var = new nc0(pkgName, arrayList);
        if (list.isEmpty()) {
            return nc0Var;
        }
        ArrayList<Pair> arrayList2 = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList2.addAll(((cp) it.next()).a());
        }
        if (arrayList2.size() > 1) {
            CollectionsKt.sortWith(arrayList2, new b());
        }
        long j = 0;
        for (Pair pair : arrayList2) {
            long timeStamp = ((bp) pair.getFirst()).getTimeStamp();
            if (timeStamp >= j) {
                long jMax = Math.max(((bp) pair.getSecond()).getTimeStamp(), j);
                for (Pair pair2 : arrayList2) {
                    long timeStamp2 = ((bp) pair2.getFirst()).getTimeStamp();
                    if (timeStamp2 >= timeStamp && timeStamp2 <= jMax) {
                        jMax = Math.max(jMax, ((bp) pair2.getSecond()).getTimeStamp());
                        j = jMax;
                    }
                }
                arrayList.add(new Pair(new ExtraAppUsage(pkgName, timeStamp, 1), new ExtraAppUsage(pkgName, j, 2)));
            }
        }
        return nc0Var;
    }

    @JvmStatic
    @VisibleForTesting
    public static final boolean d(@Nullable Context context, @NotNull List<String> pkgList, @NotNull UsageEvents.Event event) {
        Intrinsics.checkNotNullParameter(pkgList, "pkgList");
        Intrinsics.checkNotNullParameter(event, "event");
        if ((event.getEventType() == 1 || event.getEventType() == 2 || event.getEventType() == 23) && pkgList.contains(event.getPackageName())) {
            return !cb0.b(context).a(event.getPackageName());
        }
        return false;
    }

    @JvmStatic
    public static final Map<String, Map<String, List<bp>>> e(Context context, List<String> pkgList, long startTime, long endTime, boolean isGetCurrentDate) {
        int i;
        Object obj;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int i2 = 0;
        try {
            Result.Companion companion = Result.Companion;
            Object systemService = context.getSystemService("usagestats");
            if (systemService == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.app.usage.UsageStatsManager");
            }
            UsageEvents usageEventsQueryEvents = ((UsageStatsManager) systemService).queryEvents(startTime, endTime);
            UsageEvents.Event event = new UsageEvents.Event();
            i = 0;
            while (usageEventsQueryEvents.hasNextEvent()) {
                try {
                    i2++;
                    usageEventsQueryEvents.getNextEvent(event);
                    if (d(context, pkgList, event)) {
                        i++;
                        a(event, linkedHashMap);
                    }
                } catch (Throwable th) {
                    th = th;
                    Result.Companion companion2 = Result.Companion;
                    obj = Result.constructor-impl(ResultKt.createFailure(th));
                }
            }
            obj = Result.constructor-impl(Unit.INSTANCE);
            Throwable th2 = Result.exceptionOrNull-impl(obj);
            if (th2 != null) {
                zp2.b("ExtraUsageUtils", Intrinsics.stringPlus("getActivityEventInfo error ", th2));
            }
            if (!isGetCurrentDate) {
                return linkedHashMap;
            }
            zp2.c("ExtraUsageUtils", "getActivityEventInfo: totalCounts = " + i2 + ", usedCounts = " + i);
            if (zp2.d()) {
                o(linkedHashMap);
            }
            return linkedHashMap;
        } catch (Throwable th3) {
            th = th3;
            i = 0;
        }
    }

    @JvmStatic
    public static final int f(UsageEvents.Event event) {
        Object obj;
        int iIntValue = 0;
        try {
            Result.Companion companion = Result.Companion;
            Object objInvoke = event.getClass().getMethod("getInstanceId", new Class[0]).invoke(event, new Object[0]);
            if (objInvoke == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
            }
            iIntValue = ((Integer) objInvoke).intValue();
            obj = Result.constructor-impl(Unit.INSTANCE);
            Throwable th = Result.exceptionOrNull-impl(obj);
            if (th != null) {
                zp2.b("ExtraUsageUtils", Intrinsics.stringPlus("getActivityInstanceId ", th.getMessage()));
            }
            return iIntValue;
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th2));
        }
    }

    @JvmStatic
    @NotNull
    public static final Map<String, nc0> g(@NotNull Context context, @NotNull List<String> pkgList, long startTime, long endTime, long earlyStartTime, boolean shouldCheckLast) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(pkgList, "pkgList");
        return b(i(context, pkgList, e(context, pkgList, earlyStartTime, endTime, true), startTime, earlyStartTime, shouldCheckLast));
    }

    @JvmStatic
    public static final void h(List<Pair<bp, bp>> pairs, StringBuilder stringBuilder) {
        Iterator<T> it = pairs.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            stringBuilder.append(((Object) b5e.f(((bp) pair.getFirst()).getActivityName())) + " activityResumedTime:" + (((bp) pair.getSecond()).getTimeStamp() - ((bp) pair.getFirst()).getTimeStamp()) + " resumeTime:" + ((bp) pair.getFirst()).getTimeStamp() + ' ' + ((Object) q3k.a(((bp) pair.getFirst()).getTimeStamp())) + " pausedTime:" + ((bp) pair.getSecond()).getTimeStamp() + ' ' + ((Object) q3k.a(((bp) pair.getSecond()).getTimeStamp())));
            stringBuilder.append(Weather.SEPARATOR);
            m("handWillPrintActivityPairData", stringBuilder);
        }
    }

    @JvmStatic
    public static final Map<String, List<cp>> i(Context context, List<String> pkgList, Map<String, ? extends Map<String, ? extends List<bp>>> activityEventInfo, long startTime, long earlyStartTime, boolean shouldCheckLast) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        boolean z = q3k.b(System.currentTimeMillis()) != earlyStartTime;
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        boolean zD = zp2.d();
        StringBuilder sb = new StringBuilder();
        Iterator<T> it = activityEventInfo.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            String str = (String) entry.getKey();
            Map map = (Map) entry.getValue();
            ArrayList arrayList = new ArrayList();
            if (zD) {
                sb.append("appName:" + ((Object) b5e.f(str)) + '\n');
            }
            for (Map.Entry entry2 : map.entrySet()) {
                String str2 = (String) entry2.getKey();
                List list = (List) entry2.getValue();
                j(linkedHashMap, list, pkgList, context, earlyStartTime);
                if (z) {
                    k(linkedHashMap2, list, pkgList, context, earlyStartTime);
                } else if (shouldCheckLast && ((bp) CollectionsKt.last(list)).getForeground() == 1) {
                    list.add(new bp(str, str2, System.currentTimeMillis(), 2));
                }
                String str3 = str;
                ArrayList arrayList2 = arrayList;
                StringBuilder sb2 = sb;
                arrayList2.add(new cp(str3, str2, n(startTime, earlyStartTime, list, sb2)));
                linkedHashMap3 = linkedHashMap3;
                str = str3;
                arrayList = arrayList2;
                sb = sb2;
            }
            linkedHashMap3.put(str, arrayList);
        }
        return linkedHashMap3;
    }

    @JvmStatic
    public static final void j(Map<String, Map<String, List<bp>>> perDailyData, List<bp> infoList, List<String> pkgList, Context context, long earlyStartTime) {
        List<bp> list = infoList;
        if (list == null || list.isEmpty()) {
            return;
        }
        bp bpVar = (bp) CollectionsKt.first(infoList);
        if (bpVar.getForeground() == 1) {
            return;
        }
        if (perDailyData.isEmpty()) {
            perDailyData.putAll(e(context, pkgList, earlyStartTime - 86400000, earlyStartTime - 1, false));
        }
        if (perDailyData.isEmpty()) {
            return;
        }
        Map<String, List<bp>> mapEmptyMap = perDailyData.get(bpVar.getA());
        if (mapEmptyMap == null) {
            mapEmptyMap = MapsKt.emptyMap();
        }
        if (mapEmptyMap == null || mapEmptyMap.isEmpty()) {
            return;
        }
        List<bp> listEmptyList = mapEmptyMap.get(bpVar.getActivityName());
        if (listEmptyList == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        List<bp> list2 = listEmptyList;
        if (!(list2 == null || list2.isEmpty()) && ((bp) CollectionsKt.last(listEmptyList)).getForeground() == 1) {
            infoList.add(0, new bp(bpVar.getA(), bpVar.getActivityName(), earlyStartTime, 1));
        }
    }

    @JvmStatic
    public static final void k(Map<String, Map<String, List<bp>>> nextDailyData, List<bp> infoList, List<String> pkgList, Context context, long earlyStartTime) {
        List<bp> list = infoList;
        if (list == null || list.isEmpty()) {
            return;
        }
        bp bpVar = (bp) CollectionsKt.last(infoList);
        if (bpVar.getForeground() != 1) {
            return;
        }
        if (nextDailyData.isEmpty()) {
            nextDailyData.putAll(e(context, pkgList, earlyStartTime + 86400000, earlyStartTime + 172800000, false));
        }
        if (nextDailyData.isEmpty()) {
            return;
        }
        Map<String, List<bp>> mapEmptyMap = nextDailyData.get(bpVar.getA());
        if (mapEmptyMap == null) {
            mapEmptyMap = MapsKt.emptyMap();
        }
        if (mapEmptyMap == null || mapEmptyMap.isEmpty()) {
            return;
        }
        List<bp> listEmptyList = mapEmptyMap.get(bpVar.getActivityName());
        if (listEmptyList == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        List<bp> list2 = listEmptyList;
        if ((list2 == null || list2.isEmpty()) || ((bp) CollectionsKt.first(listEmptyList)).getForeground() == 1) {
            return;
        }
        infoList.add(new bp(bpVar.getA(), bpVar.getActivityName(), (earlyStartTime + 86400000) - 1, 2));
    }

    @JvmStatic
    public static final void l(String pkgName, List<Pair<ExtraAppUsage, ExtraAppUsage>> appExtraAppUsage, StringBuilder stringBuilder) {
        stringBuilder.append("packageName:" + ((Object) b5e.f(pkgName)) + " \n");
        Iterator<T> it = appExtraAppUsage.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            ExtraAppUsage extraAppUsage = (ExtraAppUsage) pair.getFirst();
            ExtraAppUsage extraAppUsage2 = (ExtraAppUsage) pair.getSecond();
            stringBuilder.append(((Object) b5e.f(pkgName)) + " resumedTime:" + (extraAppUsage2.getTimeStamp() - extraAppUsage.getTimeStamp()) + " resumeTime:" + extraAppUsage.getTimeStamp() + ' ' + ((Object) q3k.a(extraAppUsage.getTimeStamp())) + " endTime:" + extraAppUsage2.getTimeStamp() + ' ' + ((Object) q3k.a(extraAppUsage2.getTimeStamp())));
            stringBuilder.append(Weather.SEPARATOR);
            m("handlePrintAppOriginDataInfo", stringBuilder);
        }
        stringBuilder.append(Weather.SEPARATOR);
    }

    @JvmStatic
    public static final void m(String tag, StringBuilder stringBuilder) {
        Object obj;
        zp2.a("ExtraUsageUtils", tag + " info with :\n " + ((Object) stringBuilder));
        try {
            Result.Companion companion = Result.Companion;
            if (stringBuilder.length() >= 512000) {
                zp2.a("ExtraUsageUtils", Intrinsics.stringPlus(tag, " stringBuilder length more than 500kb, need to clear"));
                stringBuilder.delete(0, stringBuilder.length() - 1);
            }
            obj = Result.constructor-impl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        if (Result.exceptionOrNull-impl(obj) != null) {
            zp2.b("ExtraUsageUtils", "judgeStringBuilderLength error");
        }
    }

    @JvmStatic
    public static final List<Pair<bp, bp>> n(long startTime, long earlyStartTime, List<bp> infoList, StringBuilder stringBuilder) {
        ArrayList arrayList = new ArrayList();
        List<bp> list = infoList;
        int i = 0;
        if (!(list == null || list.isEmpty()) && infoList.size() != 1) {
            bp bpVar = (bp) CollectionsKt.first(infoList);
            ArrayList<bp> arrayList2 = new ArrayList();
            arrayList2.add(bpVar);
            for (bp bpVar2 : infoList) {
                if (bpVar.getForeground() != 1 || bpVar2.getForeground() != 1) {
                    if (bpVar.getForeground() == 1 || bpVar2.getForeground() == 1) {
                        arrayList2.add(bpVar2);
                        bpVar = bpVar2;
                    } else if (bpVar.getForeground() == 23) {
                        zp2.f("ExtraUsageUtils", "pairActivityEvent perEventInfo is stop and nextEventInfo is also not resume, there lost a resume event between perEventInfo and nextEventInfo ,should ignore, perEventInfo:" + bpVar + "  nextEventInfo:" + bpVar2);
                    } else if (bpVar.getForeground() == 2 && bpVar2.getForeground() == 23) {
                        zp2.f("ExtraUsageUtils", "onResume-onPause-onStop ignore stop,because the onResume and onPause is the really pair");
                    } else {
                        zp2.f("ExtraUsageUtils", "pairActivityEvent perEventInfo is pause and nextEventInfo is also pause, there lost a resume event between perEventInfo and nextEventInfo ,should ignore, perEventInfo:" + bpVar + "  nextEventInfo:" + bpVar2);
                    }
                }
            }
            for (bp bpVar3 : arrayList2) {
                if (bpVar3.getForeground() == 23) {
                    bpVar3.e(2);
                }
            }
            if (startTime != earlyStartTime) {
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                int i2 = 0;
                for (Object obj : arrayList2) {
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    bp bpVar4 = (bp) obj;
                    if (bpVar4.getTimeStamp() > startTime) {
                        arrayList4.add(bpVar4);
                    } else {
                        arrayList3.add(bpVar4);
                    }
                    i2 = i3;
                }
                if ((!arrayList4.isEmpty()) && (!arrayList3.isEmpty()) && ((bp) CollectionsKt.first(arrayList4)).getForeground() == 2) {
                    arrayList4.add(0, new bp(bpVar.getA(), bpVar.getActivityName(), startTime, 1));
                }
                arrayList2 = arrayList4;
            }
            if ((!arrayList2.isEmpty()) && ((bp) CollectionsKt.first(arrayList2)).getForeground() == 2) {
                arrayList2.remove(0);
            }
            for (Object obj2 : arrayList2) {
                int i4 = i + 1;
                if (i < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                bp bpVar5 = (bp) obj2;
                if (i % 2 == 1) {
                    arrayList.add(new Pair(arrayList2.get(i - 1), bpVar5));
                }
                i = i4;
            }
            if (zp2.d()) {
                h(arrayList, stringBuilder);
            }
        }
        return arrayList;
    }

    @JvmStatic
    public static final void o(Map<String, ? extends Map<String, ? extends List<bp>>> result) {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, ? extends Map<String, ? extends List<bp>>> entry : result.entrySet()) {
            sb.append(Weather.SEPARATOR);
            sb.append("packageName:" + ((Object) b5e.f(entry.getKey())) + "->\n");
            for (Map.Entry<String, ? extends List<bp>> entry2 : entry.getValue().entrySet()) {
                sb.append("activity:" + ((Object) b5e.f(entry2.getKey())) + "->\n");
                for (bp bpVar : entry2.getValue()) {
                    sb.append("activity:" + ((Object) b5e.f(bpVar.getActivityName())) + ' ' + bpVar.getForeground() + ' ' + bpVar.getTimeStamp() + ' ' + ((Object) q3k.a(bpVar.getTimeStamp())));
                    sb.append(Weather.SEPARATOR);
                }
                sb.append(Weather.SEPARATOR);
            }
            sb.append(Weather.SEPARATOR);
            m("printActivityOriginData", sb);
        }
        sb.append(Weather.SEPARATOR);
    }
}
