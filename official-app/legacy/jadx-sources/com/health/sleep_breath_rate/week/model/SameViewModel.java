package com.health.sleep_breath_rate.week.model;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModel;
import com.heytap.databaseengine.model.newsleep.BreathRateStat;
import com.heytap.health.blood.glucose.BloodGlucoseWarningActivity;
import com.oplus.aiunit.vision.rcg;
import com.oplus.aiunit.vision.x9h;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Lazy;
import p010kotlin.LazyKt__LazyJVMKt;
import p010kotlin.Metadata;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes14.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0010\u0010\u0011J$\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005R\u001b\u0010\u000f\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/health/sleep_breath_rate/week/model/SameViewModel;", "Landroidx/lifecycle/ViewModel;", "", BloodGlucoseWarningActivity.CHART_LOWEST_VISIBLE_TIME, BloodGlucoseWarningActivity.CHART_HIGHEST_VISIBLE_TIME, "", "Lcom/heytap/databaseengine/model/newsleep/BreathRateStat;", "breathRateStatList", "Lcom/oplus/aiunit/vision/x9h;", "u", "Lcom/oplus/aiunit/vision/rcg;", "i", "Lkotlin/Lazy;", "v", "()Lcom/oplus/aiunit/vision/rcg;", "transform", "<init>", "()V", "sleep_breath_rate_release"}, k = 1, mv = {1, 8, 0})
public final class SameViewModel extends ViewModel {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final Lazy transform = LazyKt__LazyJVMKt.lazy(new Function0<rcg>() { // from class: com.health.sleep_breath_rate.week.model.SameViewModel$transform$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p010kotlin.jvm.functions.Function0
        @NotNull
        public final rcg invoke() {
            return new rcg();
        }
    });

    @NotNull
    public final x9h u(long chartLowestVisibleTime, long chartHighestVisibleTime, @NotNull List<BreathRateStat> breathRateStatList) {
        Intrinsics.checkNotNullParameter(breathRateStatList, "breathRateStatList");
        return v().a(chartLowestVisibleTime, chartHighestVisibleTime, breathRateStatList);
    }

    public final rcg v() {
        return (rcg) this.transform.getValue();
    }
}
