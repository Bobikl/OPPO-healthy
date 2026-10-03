package com.health.sleep_breath_rate.week.model;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModel;
import com.heytap.databaseengine.model.newsleep.BreathRateStat;
import com.oplus.aiunit.vision.dgg;
import com.oplus.aiunit.vision.pdh;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0010\u0010\u0011J$\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005R\u001b\u0010\u000f\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/health/sleep_breath_rate/week/model/SameViewModel;", "Landroidx/lifecycle/ViewModel;", "", "chartLowestVisibleTime", "chartHighestVisibleTime", "", "Lcom/heytap/databaseengine/model/newsleep/BreathRateStat;", "breathRateStatList", "Lcom/oplus/aiunit/vision/pdh;", "u", "Lcom/oplus/aiunit/vision/dgg;", "i", "Lkotlin/Lazy;", "v", "()Lcom/oplus/aiunit/vision/dgg;", "transform", "<init>", "()V", "sleep_breath_rate_release"}, k = 1, mv = {1, 8, 0})
public final class SameViewModel extends ViewModel {
    public static final int $stable = 8;

    @NotNull
    public final Lazy i = LazyKt.lazy(new Function0<dgg>() { // from class: com.health.sleep_breath_rate.week.model.SameViewModel$transform$2
        @NotNull
        public final dgg invoke() {
            return new dgg();
        }
    });

    @NotNull
    public final pdh u(long chartLowestVisibleTime, long chartHighestVisibleTime, @NotNull List<BreathRateStat> breathRateStatList) {
        Intrinsics.checkNotNullParameter(breathRateStatList, "breathRateStatList");
        return v().a(chartLowestVisibleTime, chartHighestVisibleTime, breathRateStatList);
    }

    public final dgg v() {
        return (dgg) this.i.getValue();
    }
}
