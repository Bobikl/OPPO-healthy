package com.oplus.aiunit.vision;

import com.heytap.databaseengine.model.bloodsugar.BloodSugar;
import com.heytap.health.blood.glucose.bean.GluManualDataBean;
import com.heytap.health.blood.glucose.bean.ViewType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¨\u0006\t"}, d2 = {"Lcom/oplus/aiunit/vision/hq0;", "", "", "Lcom/heytap/databaseengine/model/bloodsugar/BloodSugar;", "dataList", "Lcom/heytap/health/blood/glucose/bean/GluManualDataBean;", "a", "<init>", "()V", "blood_glucose_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nBGHistoryTransform.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BGHistoryTransform.kt\ncom/heytap/health/blood/glucose/viewmodel/BGHistoryTransform\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,43:1\n1855#2,2:44\n1855#2,2:47\n215#3:46\n216#3:49\n*S KotlinDebug\n*F\n+ 1 BGHistoryTransform.kt\ncom/heytap/health/blood/glucose/viewmodel/BGHistoryTransform\n*L\n17#1:44,2\n35#1:47,2\n29#1:46\n29#1:49\n*E\n"})
public final class hq0 {
    @NotNull
    public final List<GluManualDataBean> a(@NotNull List<BloodSugar> dataList) {
        Intrinsics.checkNotNullParameter(dataList, "dataList");
        ArrayList arrayList = new ArrayList();
        if (dataList.isEmpty()) {
            return arrayList;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (BloodSugar bloodSugar : dataList) {
            long jC = mq8.INSTANCE.c(bloodSugar.getDataCreatedTimestamp());
            if (linkedHashMap.containsKey(Long.valueOf(jC))) {
                List list = (List) linkedHashMap.get(Long.valueOf(jC));
                if (list != null) {
                    list.add(bloodSugar);
                }
            } else {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(bloodSugar);
                linkedHashMap.put(Long.valueOf(jC), arrayList2);
            }
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            GluManualDataBean gluManualDataBean = new GluManualDataBean();
            gluManualDataBean.setViewType(ViewType.TITLE);
            gluManualDataBean.setDataCreatedTimestamp(((Number) entry.getKey()).longValue());
            arrayList.add(gluManualDataBean);
            Iterator it = ((Iterable) entry.getValue()).iterator();
            while (it.hasNext()) {
                GluManualDataBean gluManualDataBean2 = new GluManualDataBean((BloodSugar) it.next());
                gluManualDataBean2.setViewType(ViewType.CONTENT);
                arrayList.add(gluManualDataBean2);
            }
        }
        return arrayList;
    }
}
