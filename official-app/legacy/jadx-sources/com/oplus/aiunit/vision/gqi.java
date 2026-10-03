package com.oplus.aiunit.vision;

import com.heytap.health.core.widget.charts.data.HealthSingleBarEntry;
import com.heytap.health.core.widget.charts.data.TimeStampedData;
import com.heytap.health.step.R$color;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.collections.CollectionsKt__CollectionsKt;
import p010kotlin.collections.CollectionsKt___CollectionsKt;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00112\u00020\u0001:\u0001\u0007B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002J<\u0010\u000e\u001a*\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\nj\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b`\r2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0002¨\u0006\u0012"}, d2 = {"Lcom/oplus/aiunit/vision/gqi;", "", "", "Lcom/oplus/aiunit/vision/hti;", "statList", "Ljava/util/concurrent/ConcurrentHashMap;", "Ljava/time/LocalDate;", "a", "Lcom/heytap/health/core/widget/charts/data/TimeStampedData;", "timeDbList", "Ljava/util/HashMap;", "", "Lcom/heytap/health/core/widget/charts/data/HealthSingleBarEntry;", "Lkotlin/collections/HashMap;", "b", "<init>", "()V", "Companion", "step_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nStepDataHandle.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StepDataHandle.kt\ncom/heytap/health/step/detail/ui/stephistory2/datamanager/StepDataHandle\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,66:1\n1855#2,2:67\n1855#2,2:69\n*S KotlinDebug\n*F\n+ 1 StepDataHandle.kt\ncom/heytap/health/step/detail/ui/stephistory2/datamanager/StepDataHandle\n*L\n20#1:67,2\n33#1:69,2\n*E\n"})
public final class gqi {

    @NotNull
    public static final String TAG = "StepDataHandler";

    @NotNull
    public final ConcurrentHashMap<LocalDate, StepStat> a(@NotNull List<StepStat> statList) {
        Intrinsics.checkNotNullParameter(statList, "statList");
        ConcurrentHashMap<LocalDate, StepStat> concurrentHashMap = new ConcurrentHashMap<>();
        for (StepStat stepStat : statList) {
            concurrentHashMap.put(com.heytap.health.step.detail.ui.stephistory2.datamanager.b.l(stepStat.getTimeStamp()), stepStat);
        }
        return concurrentHashMap;
    }

    @NotNull
    public final HashMap<LocalDate, List<HealthSingleBarEntry>> b(@NotNull List<? extends TimeStampedData> timeDbList) {
        Intrinsics.checkNotNullParameter(timeDbList, "timeDbList");
        HashMap<LocalDate, List<HealthSingleBarEntry>> map = new HashMap<>();
        for (TimeStampedData timeStampedData : timeDbList) {
            LocalDateTime localDateTimeM = com.heytap.health.step.detail.ui.stephistory2.datamanager.b.m(timeStampedData.getTimestamp());
            LocalDate date = localDateTimeM.toLocalDate();
            int hour = localDateTimeM.getHour();
            int minute = localDateTimeM.getMinute();
            if (map.containsKey(date)) {
                List<HealthSingleBarEntry> copyOnWriteArrayList = map.get(date);
                if (copyOnWriteArrayList == null) {
                    copyOnWriteArrayList = new CopyOnWriteArrayList<>();
                } else {
                    Intrinsics.checkNotNullExpressionValue(copyOnWriteArrayList, "hashMap[date] ?: CopyOnWriteArrayList()");
                }
                float f = minute < 30 ? hour : hour + 0.5f;
                if (((HealthSingleBarEntry) CollectionsKt___CollectionsKt.last((List) copyOnWriteArrayList)).getX() == f) {
                    HealthSingleBarEntry healthSingleBarEntry = (HealthSingleBarEntry) CollectionsKt___CollectionsKt.last((List) copyOnWriteArrayList);
                    healthSingleBarEntry.setY(healthSingleBarEntry.getY() + timeStampedData.getY());
                } else {
                    copyOnWriteArrayList.add(new HealthSingleBarEntry(f, timeStampedData.getY(), Long.valueOf(timeStampedData.getTimestamp()), rg7.b(R$color.step_29CD68)));
                }
            } else {
                Intrinsics.checkNotNullExpressionValue(date, "date");
                map.put(date, new CopyOnWriteArrayList(CollectionsKt__CollectionsKt.mutableListOf(new HealthSingleBarEntry(hour, timeStampedData.getY(), Long.valueOf(timeStampedData.getTimestamp()), rg7.b(R$color.step_29CD68)))));
            }
        }
        return map;
    }
}
