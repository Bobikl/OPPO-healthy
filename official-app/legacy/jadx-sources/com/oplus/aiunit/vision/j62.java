package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.databaseengine.model.BreathRate;
import com.oplus.smartenginehelper.entity.ClickApiEntity;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.collections.CollectionsKt__MutableCollectionsJVMKt;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes18.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\r\u0010\u000eJ$\u0010\t\u001a\u00020\b2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005J\u0018\u0010\n\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0002J\u0010\u0010\f\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0005H\u0002¨\u0006\u000f"}, d2 = {"Lcom/oplus/aiunit/vision/j62;", "", "", "Lcom/heytap/databaseengine/model/BreathRate;", "breathRateList", "", "startTime", "endTime", "Lcom/oplus/aiunit/vision/v52;", "c", "f", ClickApiEntity.TIME, b2n.f, "<init>", "()V", "sleep_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nBreathRateTransform.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BreathRateTransform.kt\ncom/heytap/health/sleep/day/model/BreathRateTransform\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,122:1\n215#2,2:123\n*S KotlinDebug\n*F\n+ 1 BreathRateTransform.kt\ncom/heytap/health/sleep/day/model/BreathRateTransform\n*L\n60#1:123,2\n*E\n"})
public final class j62 {
    public static final int $stable = 0;

    public static final int d(BreathRate breathRate, BreathRate breathRate2) {
        long dataCreatedTimestamp = breathRate.getDataCreatedTimestamp() - breathRate2.getDataCreatedTimestamp();
        if (dataCreatedTimestamp > 0) {
            return 1;
        }
        return dataCreatedTimestamp < 0 ? -1 : 0;
    }

    public static final int e(czj czjVar, czj czjVar2) {
        long jH = czjVar.h() - czjVar2.h();
        if (jH > 0) {
            return 1;
        }
        return jH < 0 ? -1 : 0;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x006a  */
    @NotNull
    public final v52 c(@NotNull List<BreathRate> breathRateList, long startTime, long endTime) {
        Intrinsics.checkNotNullParameter(breathRateList, "breathRateList");
        if (breathRateList.isEmpty()) {
            return f(startTime, endTime);
        }
        CollectionsKt__MutableCollectionsJVMKt.sortWith(breathRateList, new Comparator() { // from class: com.oplus.aiunit.vision.h62
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return j62.d((BreathRate) obj, (BreathRate) obj2);
            }
        });
        ArrayList arrayList = new ArrayList();
        HashMap map = new HashMap(48);
        float f = 0.0f;
        float f2 = 0.0f;
        float f3 = 0.0f;
        for (BreathRate breathRate : breathRateList) {
            long jG = g(breathRate.getDataCreatedTimestamp());
            long j2 = ap6.CDP_MIN_MANUAL_SYNC_TIME_INTERVAL + jG;
            float fIntValue = breathRate.getValue().intValue() / 10.0f;
            if (f2 > fIntValue) {
                f2 = fIntValue;
            } else if (f2 == f) {
                f2 = fIntValue;
            }
            if (f3 < fIntValue) {
                f3 = fIntValue;
            }
            if (map.containsKey(Long.valueOf(jG))) {
                czj czjVar = (czj) map.get(Long.valueOf(jG));
                Intrinsics.checkNotNull(czjVar);
                if (czjVar.b() < fIntValue) {
                    czjVar.j(fIntValue);
                }
                if (czjVar.c() > fIntValue) {
                    czjVar.k(fIntValue);
                }
            } else {
                czj czjVar2 = new czj();
                czjVar2.v(jG);
                czjVar2.i(j2);
                czjVar2.k(fIntValue);
                czjVar2.j(fIntValue);
                map.put(Long.valueOf(jG), czjVar2);
            }
            f = 0.0f;
        }
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add(((Map.Entry) it.next()).getValue());
        }
        CollectionsKt__MutableCollectionsJVMKt.sortWith(arrayList, new Comparator() { // from class: com.oplus.aiunit.vision.i62
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return j62.e((czj) obj, (czj) obj2);
            }
        });
        v52 v52Var = new v52();
        v52Var.h(startTime);
        v52Var.g(endTime);
        v52Var.f(f2);
        v52Var.e(f3);
        v52Var.d(arrayList);
        return v52Var;
    }

    public final v52 f(long startTime, long endTime) {
        ArrayList arrayList = new ArrayList();
        czj czjVar = new czj();
        czjVar.k(0.0f);
        czjVar.j(0.0f);
        czjVar.v(startTime);
        czj czjVar2 = new czj();
        czjVar2.k(0.0f);
        czjVar2.j(0.0f);
        czjVar2.v(endTime);
        arrayList.add(czjVar);
        arrayList.add(czjVar2);
        v52 v52Var = new v52();
        v52Var.h(startTime);
        v52Var.g(endTime);
        v52Var.d(arrayList);
        return v52Var;
    }

    public final long g(long time) {
        LocalDateTime localDateTimeOfInstant = LocalDateTime.ofInstant(Instant.ofEpochMilli(time), ZoneId.systemDefault());
        int minute = localDateTimeOfInstant.getMinute();
        return localDateTimeOfInstant.withMinute(minute >= 0 && minute < 30 ? 0 : 30).withSecond(0).withNano(0).atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
    }
}
