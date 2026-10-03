package com.heytap.health.insight.singledimen.step;

import com.heytap.health.health.insight.Step;
import com.oplus.aiunit.vision.DateRangeStat;
import com.oplus.aiunit.vision.RelativeDateRange;
import com.oplus.aiunit.vision.i08;
import com.oplus.aiunit.vision.r9b;
import com.oplus.aiunit.vision.u11;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\bf\u0018\u00002\u00020\u0001J.\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005H\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\f\u001a\u00020\nH\u0016R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u00058&@&X¦\u000e¢\u0006\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\u00058&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0011\u0010\u000e\"\u0004\b\u0012\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/heytap/health/insight/singledimen/step/c;", "Lcom/oplus/aiunit/vision/u11;", "Lcom/oplus/aiunit/vision/gof;", "monthDateRange", "weekDateRange", "Lcom/oplus/aiunit/vision/i15;", "monthRangeStat", "weekRangeStat", "Lcom/oplus/aiunit/vision/r9b;", "i", "", "a", "b", "c", "()Lcom/oplus/aiunit/vision/i15;", "d", "(Lcom/oplus/aiunit/vision/i15;)V", MapSchema.FIELD_NAME_KEY, "j", "health_impl_release"}, k = 1, mv = {1, 8, 0})
public interface c extends u11 {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        @Nullable
        public static r9b a(@NotNull c cVar, @NotNull RelativeDateRange monthDateRange, @NotNull RelativeDateRange weekDateRange, @Nullable DateRangeStat i15Var, @Nullable DateRangeStat i15Var2) {
            Intrinsics.checkNotNullParameter(monthDateRange, "monthDateRange");
            Intrinsics.checkNotNullParameter(weekDateRange, "weekDateRange");
            cVar.d(i15Var);
            cVar.j(i15Var2);
            cVar.m(cVar.n());
            if (!cVar.a()) {
                monthDateRange = cVar.b() ? weekDateRange : null;
            }
            cVar.l(monthDateRange);
            return cVar.getFinalVisibleType();
        }

        @NotNull
        public static i08 b(@NotNull c cVar) {
            return u11.a.a(cVar);
        }

        public static boolean c(@NotNull c cVar) {
            return cVar.getFinalVisibleType() == Step.STEP_TRENT_MONTH || cVar.getFinalVisibleType() == Step.STEP_DISTANCE_MONTH || cVar.getFinalVisibleType() == Step.STEP_REACH_GOAL_MONTH;
        }

        public static boolean d(@NotNull c cVar) {
            return cVar.getFinalVisibleType() == Step.STEP_TRENT_WEEK || cVar.getFinalVisibleType() == Step.STEP_DISTANCE_WEEK || cVar.getFinalVisibleType() == Step.STEP_REACH_GOAL_WEEK;
        }
    }

    @Override // com.oplus.aiunit.vision.u11
    boolean a();

    @Override // com.oplus.aiunit.vision.u11
    boolean b();

    @Nullable
    /* JADX INFO: renamed from: c */
    DateRangeStat getMonthRangeStat();

    void d(@Nullable DateRangeStat i15Var);

    @Nullable
    r9b i(@NotNull RelativeDateRange monthDateRange, @NotNull RelativeDateRange weekDateRange, @Nullable DateRangeStat monthRangeStat, @Nullable DateRangeStat weekRangeStat);

    void j(@Nullable DateRangeStat i15Var);

    @Nullable
    /* JADX INFO: renamed from: k */
    DateRangeStat getWeekRangeStat();
}