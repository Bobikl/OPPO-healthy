package com.heytap.health.heartrate.model;

import com.heytap.databaseengine.model.HeartRate;
import com.heytap.health.core.widget.charts.data.HealthCandleEntry;
import com.heytap.health.heartrate.model.HeartRateCardTransform;
import com.oplus.aiunit.vision.g59;
import com.oplus.aiunit.vision.m8b;
import com.oplus.aiunit.vision.or8;
import com.oplus.aiunit.vision.v39;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.collections.CollectionsKt__MutableCollectionsJVMKt;
import p010kotlin.jvm.functions.Function2;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \r2\u00020\u0001:\u0001\u000eB\u0007¢\u0006\u0004\b\u000b\u0010\fJ\"\u0010\b\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002J\u001c\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002¨\u0006\u000f"}, d2 = {"Lcom/heytap/health/heartrate/model/HeartRateCardTransform;", "", "", "Lcom/heytap/databaseengine/model/HeartRate;", "heartRates", "Lcom/oplus/aiunit/vision/g59;", "heartRateStatList", "Lcom/oplus/aiunit/vision/v39;", "b", "Lcom/heytap/health/core/widget/charts/data/HealthCandleEntry;", "d", "<init>", "()V", "Companion", "a", "heartrate_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nHeartRateCardTransform.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HeartRateCardTransform.kt\ncom/heytap/health/heartrate/model/HeartRateCardTransform\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,87:1\n1855#2:88\n1856#2:91\n1855#2,2:92\n13330#3,2:89\n*S KotlinDebug\n*F\n+ 1 HeartRateCardTransform.kt\ncom/heytap/health/heartrate/model/HeartRateCardTransform\n*L\n26#1:88\n26#1:91\n61#1:92,2\n28#1:89,2\n*E\n"})
public final class HeartRateCardTransform {

    @NotNull
    public static final String TAG = "HeartRateCardTransform";

    public static final int c(Function2 tmp0, Object obj, Object obj2) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Number) tmp0.invoke(obj, obj2)).intValue();
    }

    @NotNull
    public final v39 b(@NotNull List<HeartRate> heartRates, @NotNull List<g59> heartRateStatList) {
        Intrinsics.checkNotNullParameter(heartRates, "heartRates");
        Intrinsics.checkNotNullParameter(heartRateStatList, "heartRateStatList");
        m8b.f(TAG, "heartRates size:" + heartRates.size() + "/heartRateStatList size:" + heartRateStatList.size());
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = heartRates.iterator();
        while (true) {
            boolean z = true;
            if (!it.hasNext()) {
                break;
            }
            HeartRate heartRate = (HeartRate) it.next();
            int[] NOT_SHOW_IN_DETAIL = or8.NOT_SHOW_IN_DETAIL;
            Intrinsics.checkNotNullExpressionValue(NOT_SHOW_IN_DETAIL, "NOT_SHOW_IN_DETAIL");
            for (int i : NOT_SHOW_IN_DETAIL) {
                if (heartRate.getHeartRateType() == i) {
                    z = false;
                }
            }
            if (z) {
                arrayList.add(heartRate);
            }
        }
        if (arrayList.size() > 1) {
            final HeartRateCardTransform$buildData$2 heartRateCardTransform$buildData$2 = new Function2<HeartRate, HeartRate, Integer>() { // from class: com.heytap.health.heartrate.model.HeartRateCardTransform$buildData$2
                @Override // p010kotlin.jvm.functions.Function2
                @NotNull
                public final Integer invoke(@NotNull HeartRate o1, @NotNull HeartRate o2) {
                    Intrinsics.checkNotNullParameter(o1, "o1");
                    Intrinsics.checkNotNullParameter(o2, "o2");
                    return Integer.valueOf(Intrinsics.compare(o1.getDataCreatedTimestamp(), o2.getDataCreatedTimestamp()));
                }
            };
            CollectionsKt__MutableCollectionsJVMKt.sortWith(arrayList, new Comparator() { // from class: com.oplus.aiunit.vision.q49
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return HeartRateCardTransform.c(heartRateCardTransform$buildData$2, obj, obj2);
                }
            });
        }
        v39 v39Var = new v39();
        if (!heartRateStatList.isEmpty()) {
            v39Var.h(heartRateStatList.get(0));
        }
        v39Var.i(arrayList);
        v39Var.g(d(arrayList));
        return v39Var;
    }

    public final List<HealthCandleEntry> d(List<HeartRate> heartRates) {
        ArrayList arrayList = new ArrayList();
        if (heartRates.isEmpty()) {
            arrayList.add(new HealthCandleEntry(-1.0f, 0.0f, 0.0f));
        } else {
            for (HeartRate heartRate : heartRates) {
                int hour = LocalDateTime.ofInstant(Instant.ofEpochMilli(heartRate.getDataCreatedTimestamp()), ZoneId.systemDefault()).getHour();
                if (arrayList.isEmpty()) {
                    arrayList.add(new HealthCandleEntry(hour, heartRate.getHeartRateValue(), heartRate.getHeartRateValue()));
                } else {
                    HealthCandleEntry healthCandleEntry = (HealthCandleEntry) arrayList.get(arrayList.size() - 1);
                    float f = hour;
                    if (healthCandleEntry.getX() == f) {
                        healthCandleEntry.setLow(Math.min(healthCandleEntry.getLow(), heartRate.getHeartRateValue()));
                        healthCandleEntry.setHigh(Math.max(healthCandleEntry.getHigh(), heartRate.getHeartRateValue()));
                    } else {
                        arrayList.add(new HealthCandleEntry(f, heartRate.getHeartRateValue(), heartRate.getHeartRateValue()));
                    }
                }
            }
        }
        if (arrayList.isEmpty()) {
            arrayList.add(new HealthCandleEntry(-1.0f, 0.0f, 0.0f));
        }
        return arrayList;
    }
}