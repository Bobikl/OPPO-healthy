package com.oplus.aiunit.vision;

import com.heytap.databaseengine.model.stress.Stress;
import com.heytap.databaseengine.model.stress.StressDataStat;
import com.heytap.health.core.widget.charts.data.HealthSingleBarEntry;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.collections.CollectionsKt___CollectionsKt;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\f\u0010\rJ\u001c\u0010\b\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u0005J\u001c\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00022\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002¨\u0006\u000e"}, d2 = {"Lcom/oplus/aiunit/vision/gxi;", "", "", "Lcom/heytap/databaseengine/model/stress/Stress;", "stressList", "Lcom/heytap/databaseengine/model/stress/StressDataStat;", "stressDataStat", "Lcom/oplus/aiunit/vision/exi;", "a", "dataList", "Lcom/heytap/health/core/widget/charts/data/HealthSingleBarEntry;", "b", "<init>", "()V", "stress_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nStressCardTransform.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StressCardTransform.kt\ncom/heytap/health/stress/model/StressCardTransform\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,65:1\n1855#2,2:66\n215#3,2:68\n*S KotlinDebug\n*F\n+ 1 StressCardTransform.kt\ncom/heytap/health/stress/model/StressCardTransform\n*L\n41#1:66,2\n55#1:68,2\n*E\n"})
public final class gxi {
    @NotNull
    public final exi a(@NotNull List<Stress> stressList, @NotNull StressDataStat stressDataStat) {
        Intrinsics.checkNotNullParameter(stressList, "stressList");
        Intrinsics.checkNotNullParameter(stressDataStat, "stressDataStat");
        exi exiVar = new exi();
        exiVar.g(stressList);
        exiVar.e(b(stressList));
        exiVar.f(stressDataStat);
        exiVar.h(stressList.isEmpty());
        return exiVar;
    }

    public final List<HealthSingleBarEntry> b(List<Stress> dataList) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 24; i++) {
            arrayList.add(new HealthSingleBarEntry(i, -10.0f, 0));
        }
        ZoneId zoneIdSystemDefault = ZoneId.systemDefault();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Stress stress : dataList) {
            int hour = LocalDateTime.ofInstant(Instant.ofEpochMilli(stress.getDataCreatedTimestamp()), zoneIdSystemDefault).getHour();
            float stressValue = stress.getStressValue();
            if (!linkedHashMap.containsKey(Integer.valueOf(hour))) {
                linkedHashMap.put(Integer.valueOf(hour), new ArrayList());
            }
            List list = (List) linkedHashMap.get(Integer.valueOf(hour));
            if (list != null) {
                list.add(Float.valueOf(stressValue));
            }
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            int iIntValue = ((Number) entry.getKey()).intValue();
            List list2 = (List) entry.getValue();
            arrayList.set(iIntValue, new HealthSingleBarEntry(iIntValue, CollectionsKt___CollectionsKt.sumOfFloat(list2) / list2.size(), 0));
        }
        return arrayList;
    }
}
