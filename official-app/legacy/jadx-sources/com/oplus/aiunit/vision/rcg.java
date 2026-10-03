package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.databaseengine.model.newsleep.BreathRateStat;
import com.heytap.health.blood.glucose.BloodGlucoseWarningActivity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes14.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\f"}, d2 = {"Lcom/oplus/aiunit/vision/rcg;", "", "", BloodGlucoseWarningActivity.CHART_LOWEST_VISIBLE_TIME, BloodGlucoseWarningActivity.CHART_HIGHEST_VISIBLE_TIME, "", "Lcom/heytap/databaseengine/model/newsleep/BreathRateStat;", "breathRateStatList", "Lcom/oplus/aiunit/vision/x9h;", "a", "<init>", "()V", "sleep_breath_rate_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSameTransform.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SameTransform.kt\ncom/health/sleep_breath_rate/week/model/SameTransform\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,51:1\n1855#2,2:52\n1855#2,2:54\n*S KotlinDebug\n*F\n+ 1 SameTransform.kt\ncom/health/sleep_breath_rate/week/model/SameTransform\n*L\n14#1:52,2\n23#1:54,2\n*E\n"})
public final class rcg {
    public static final int $stable = 0;

    @NotNull
    public final x9h a(long chartLowestVisibleTime, long chartHighestVisibleTime, @NotNull List<BreathRateStat> breathRateStatList) {
        Intrinsics.checkNotNullParameter(breathRateStatList, "breathRateStatList");
        ArrayList<BreathRateStat> arrayList = new ArrayList();
        Iterator<T> it = breathRateStatList.iterator();
        while (true) {
            boolean z = false;
            if (!it.hasNext()) {
                break;
            }
            BreathRateStat breathRateStat = (BreathRateStat) it.next();
            long jG = mq8.INSTANCE.g(breathRateStat.getDate());
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
        x9h x9hVar = new x9h();
        x9hVar.j(arrayList.isEmpty());
        x9hVar.i(f);
        x9hVar.h(f2);
        if (breathRateStat3 != null) {
            x9hVar.g(breathRateStat3.getReasonableRangeLow() / 10.0f);
            x9hVar.f(breathRateStat3.getReasonableRangeHigh() / 10.0f);
        }
        return x9hVar;
    }
}
