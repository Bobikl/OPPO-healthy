package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.databaseengine.model.newsleep.BreathRateStat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\f"}, d2 = {"Lcom/oplus/aiunit/vision/dgg;", "", "", "chartLowestVisibleTime", "chartHighestVisibleTime", "", "Lcom/heytap/databaseengine/model/newsleep/BreathRateStat;", "breathRateStatList", "Lcom/oplus/aiunit/vision/pdh;", "a", "<init>", "()V", "sleep_breath_rate_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSameTransform.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SameTransform.kt\ncom/health/sleep_breath_rate/week/model/SameTransform\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,51:1\n1855#2,2:52\n1855#2,2:54\n*S KotlinDebug\n*F\n+ 1 SameTransform.kt\ncom/health/sleep_breath_rate/week/model/SameTransform\n*L\n14#1:52,2\n23#1:54,2\n*E\n"})
public final class dgg {
    public static final int $stable = 0;

    @NotNull
    public final pdh a(long chartLowestVisibleTime, long chartHighestVisibleTime, @NotNull List<BreathRateStat> breathRateStatList) {
        Intrinsics.checkNotNullParameter(breathRateStatList, "breathRateStatList");
        ArrayList<BreathRateStat> arrayList = new ArrayList();
        Iterator<T> it = breathRateStatList.iterator();
        while (true) {
            boolean z = false;
            if (!it.hasNext()) {
                break;
            }
            BreathRateStat breathRateStat = (BreathRateStat) it.next();
            long jG = pr8.INSTANCE.g(breathRateStat.getDate());
            if (chartLowestVisibleTime <= jG && jG <= chartHighestVisibleTime) {
                z = true;
            }
            if (z) {
                arrayList.add(breathRateStat);
            }
        }
        float f = 0.0f;
        float f2 = 0.0f;
        for (BreathRateStat breathRateStat2 : arrayList) {
            float min = breathRateStat2.getMin() / 10.0f;
            float max = breathRateStat2.getMax() / 10.0f;
            if ((f == 0.0f) || f > min) {
                f = min;
            }
            if (f2 < max) {
                f2 = max;
            }
        }
        BreathRateStat breathRateStat3 = arrayList.isEmpty() ^ true ? (BreathRateStat) arrayList.get(arrayList.size() - 1) : null;
        pdh pdhVar = new pdh();
        pdhVar.j(arrayList.isEmpty());
        pdhVar.i(f);
        pdhVar.h(f2);
        if (breathRateStat3 != null) {
            pdhVar.g(breathRateStat3.getReasonableRangeLow() / 10.0f);
            pdhVar.f(breathRateStat3.getReasonableRangeHigh() / 10.0f);
        }
        return pdhVar;
    }
}
