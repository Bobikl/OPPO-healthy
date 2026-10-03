package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.databaseengine.model.BreathRate;
import com.heytap.databaseengine.model.SleepIndex;
import com.heytap.databaseengine.model.newsleep.BreathRateStat;
import com.heytap.health.core.widget.charts.data.HealthCandleEntry;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00132\u00020\u0001:\u0001\u000eB\u0007¢\u0006\u0004\b\u0011\u0010\u0012JB\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\n\u001a\u00020\t2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0006J$\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00062\u0006\u0010\u0004\u001a\u00020\u00022\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002¨\u0006\u0014"}, d2 = {"Lcom/oplus/aiunit/vision/ych;", "", "", "dayTime", "chartStartTime", "chartEndTime", "", "Lcom/heytap/databaseengine/model/BreathRate;", "breathRateList", "Lcom/heytap/databaseengine/model/newsleep/BreathRateStat;", "breathRateStat", "Lcom/heytap/databaseengine/model/SleepIndex;", "sleepIndexList", "Lcom/oplus/aiunit/vision/xch;", "a", "Lcom/heytap/health/core/widget/charts/data/HealthCandleEntry;", "b", "<init>", "()V", "Companion", "sleep_breath_rate_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSleepBRCardDataTransform.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SleepBRCardDataTransform.kt\ncom/health/sleep_breath_rate/day/model/SleepBRCardDataTransform\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,76:1\n1855#2,2:77\n1855#2,2:79\n*S KotlinDebug\n*F\n+ 1 SleepBRCardDataTransform.kt\ncom/health/sleep_breath_rate/day/model/SleepBRCardDataTransform\n*L\n25#1:77,2\n49#1:79,2\n*E\n"})
public final class ych {
    public static final int $stable = 0;

    @NotNull
    public static final String TAG = "SleepBRCardDataTransform";

    @NotNull
    public final xch a(long dayTime, long chartStartTime, long chartEndTime, @NotNull List<BreathRate> breathRateList, @NotNull BreathRateStat breathRateStat, @NotNull List<SleepIndex> sleepIndexList) {
        Intrinsics.checkNotNullParameter(breathRateList, "breathRateList");
        Intrinsics.checkNotNullParameter(breathRateStat, "breathRateStat");
        Intrinsics.checkNotNullParameter(sleepIndexList, "sleepIndexList");
        m8b.f(TAG, "breathRateList size:" + breathRateList.size());
        SleepIndex sleepIndex = null;
        for (SleepIndex sleepIndex2 : sleepIndexList) {
            if (sleepIndex2.getDataTimestamp() == dayTime) {
                sleepIndex = sleepIndex2;
            }
        }
        xch xchVar = new xch();
        xchVar.e(dayTime);
        xchVar.d(chartStartTime);
        xchVar.c(chartEndTime);
        xchVar.g(breathRateList.isEmpty());
        xchVar.a().addAll(b(chartStartTime, breathRateList));
        xchVar.f(breathRateStat);
        xchVar.h(sleepIndex);
        return xchVar;
    }

    public final List<HealthCandleEntry> b(long chartStartTime, List<BreathRate> breathRateList) {
        ArrayList arrayList = new ArrayList();
        for (BreathRate breathRate : breathRateList) {
            int dataCreatedTimestamp = (int) ((breathRate.getDataCreatedTimestamp() - chartStartTime) / ((long) 3600000));
            float fB = gmk.b(breathRate.getValue()) / 10.0f;
            if (arrayList.isEmpty()) {
                arrayList.add(new HealthCandleEntry(dataCreatedTimestamp, fB, fB));
            } else {
                HealthCandleEntry healthCandleEntry = (HealthCandleEntry) arrayList.get(arrayList.size() - 1);
                float f = dataCreatedTimestamp;
                if (healthCandleEntry.getX() == f) {
                    healthCandleEntry.setLow(Math.min(healthCandleEntry.getLow(), fB));
                    healthCandleEntry.setHigh(Math.max(healthCandleEntry.getHigh(), fB));
                } else {
                    arrayList.add(new HealthCandleEntry(f, fB, fB));
                }
            }
        }
        if (arrayList.isEmpty()) {
            arrayList.add(new HealthCandleEntry(-1.0f, 0.0f, 0.0f));
        }
        return arrayList;
    }
}
