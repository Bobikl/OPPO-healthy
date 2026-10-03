package com.heytap.health.hrv.hrv.model;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModel;
import com.heytap.databaseengine.model.physicalMental.PhysicalMentalStat;
import com.heytap.health.blood.glucose.BloodGlucoseWarningActivity;
import com.heytap.health.healthbase.util.HealthFrgType;
import com.heytap.health.hrv.hrv.util.HrvDataType;
import com.oplus.aiunit.vision.bh9;
import com.oplus.aiunit.vision.sh9;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Lazy;
import p010kotlin.LazyKt__LazyJVMKt;
import p010kotlin.Metadata;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0014\u0010\u0015J4\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nR\u001b\u0010\u0013\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, d2 = {"Lcom/heytap/health/hrv/hrv/model/HrvSameViewModel;", "Landroidx/lifecycle/ViewModel;", "", BloodGlucoseWarningActivity.CHART_LOWEST_VISIBLE_TIME, BloodGlucoseWarningActivity.CHART_HIGHEST_VISIBLE_TIME, "", "Lcom/heytap/databaseengine/model/physicalMental/PhysicalMentalStat;", "hrvStatList", "Lcom/heytap/health/healthbase/util/HealthFrgType;", "healthFrgType", "Lcom/heytap/health/hrv/hrv/util/HrvDataType;", "hrvDataType", "Lcom/oplus/aiunit/vision/sh9;", "u", "Lcom/oplus/aiunit/vision/bh9;", "i", "Lkotlin/Lazy;", "v", "()Lcom/oplus/aiunit/vision/bh9;", "transform", "<init>", "()V", "hrv_release"}, k = 1, mv = {1, 8, 0})
public final class HrvSameViewModel extends ViewModel {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final Lazy transform = LazyKt__LazyJVMKt.lazy(new Function0<bh9>() { // from class: com.heytap.health.hrv.hrv.model.HrvSameViewModel$transform$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p010kotlin.jvm.functions.Function0
        @NotNull
        public final bh9 invoke() {
            return new bh9();
        }
    });

    @NotNull
    public final sh9 u(long chartLowestVisibleTime, long chartHighestVisibleTime, @NotNull List<PhysicalMentalStat> hrvStatList, @NotNull HealthFrgType healthFrgType, @NotNull HrvDataType hrvDataType) {
        Intrinsics.checkNotNullParameter(hrvStatList, "hrvStatList");
        Intrinsics.checkNotNullParameter(healthFrgType, "healthFrgType");
        Intrinsics.checkNotNullParameter(hrvDataType, "hrvDataType");
        return v().a(chartLowestVisibleTime, chartHighestVisibleTime, hrvStatList, healthFrgType, hrvDataType);
    }

    public final bh9 v() {
        return (bh9) this.transform.getValue();
    }
}
