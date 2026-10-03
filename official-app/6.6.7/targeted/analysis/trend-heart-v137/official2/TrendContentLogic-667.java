package com.heytap.health.insight.singledimen.step;

import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.health.health.insight.ModuleType;
import com.heytap.health.health.insight.Step;
import com.heytap.log.formatter.LogFieldKey;
import com.oplus.aiunit.vision.DateRangeStat;
import com.oplus.aiunit.vision.RelativeDateRange;
import com.oplus.aiunit.vision.StepStat;
import com.oplus.aiunit.vision.c7n;
import com.oplus.aiunit.vision.i08;
import com.oplus.aiunit.vision.m8b;
import com.oplus.aiunit.vision.oba;
import com.oplus.aiunit.vision.r9b;
import io.protostuff.MapSchema;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Lazy;
import p010kotlin.LazyKt__LazyJVMKt;
import p010kotlin.Metadata;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes16.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\f\b\u0007\u0018\u0000 42\u00020\u0001:\u0001\u000bB\u0007¢\u0006\u0004\b2\u00103J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0010\u0010\n\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002R$\u0010\u0011\u001a\u0004\u0018\u00010\u00068\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R$\u0010\u0015\u001a\u0004\u0018\u00010\u00068\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\f\u001a\u0004\b\u0013\u0010\u000e\"\u0004\b\u0014\u0010\u0010R$\u0010\u001b\u001a\u0004\u0018\u00010\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR$\u0010\"\u001a\u0004\u0018\u00010\u001c8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001b\u0010(\u001a\u00020#8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\"\u0010.\u001a\u00020)8V@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010*\u001a\u0004\b$\u0010+\"\u0004\b,\u0010-R\"\u00101\u001a\u00020)8V@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b/\u0010*\u001a\u0004\b/\u0010+\"\u0004\b0\u0010-¨\u00065"}, d2 = {"Lcom/heytap/health/insight/singledimen/step/TrendContentLogic;", "Lcom/heytap/health/insight/singledimen/step/c;", "Lcom/oplus/aiunit/vision/r9b;", "n", "", "q", "Lcom/oplus/aiunit/vision/i15;", "rangeStat", "", "r", "s", "a", "Lcom/oplus/aiunit/vision/i15;", "c", "()Lcom/oplus/aiunit/vision/i15;", "d", "(Lcom/oplus/aiunit/vision/i15;)V", "monthRangeStat", "b", MapSchema.FIELD_NAME_KEY, "j", "weekRangeStat", "Lcom/oplus/aiunit/vision/r9b;", c7n.g, "()Lcom/oplus/aiunit/vision/r9b;", LogFieldKey.MESSAGE_KEY, "(Lcom/oplus/aiunit/vision/r9b;)V", "finalVisibleType", "Lcom/oplus/aiunit/vision/gof;", "Lcom/oplus/aiunit/vision/gof;", "f", "()Lcom/oplus/aiunit/vision/gof;", LogFieldKey.LEVEL_KEY, "(Lcom/oplus/aiunit/vision/gof;)V", "finalDateRange", "Lcom/oplus/aiunit/vision/oba;", MapSchema.FIELD_NAME_ENTRY, "Lkotlin/Lazy;", LogFieldKey.PROCESS_NAME_KEY, "()Lcom/oplus/aiunit/vision/oba;", "insightWord", "", "Ljava/lang/String;", "()Ljava/lang/String;", "setDeviceTitle", "(Ljava/lang/String;)V", "deviceTitle", c7n.f, "setDeviceContent", "deviceContent", "<init>", "()V", "Companion", "health_impl_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nTrendContentLogic.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TrendContentLogic.kt\ncom/heytap/health/insight/singledimen/step/TrendContentLogic\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,117:1\n1#2:118\n*E\n"})
public final class TrendContentLogic implements c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public DateRangeStat monthRangeStat;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public DateRangeStat weekRangeStat;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public r9b finalVisibleType;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public RelativeDateRange finalDateRange;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Lazy insightWord = LazyKt__LazyJVMKt.lazy(new Function0<oba>() { // from class: com.heytap.health.insight.singledimen.step.TrendContentLogic$insightWord$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p010kotlin.jvm.functions.Function0
        @NotNull
        public final oba invoke() {
            return new oba();
        }
    });

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public String deviceTitle = "";

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public String deviceContent = "";
    public static final int $stable = 8;

    @Override // com.heytap.health.insight.singledimen.step.c, com.oplus.aiunit.vision.u11
    public boolean a() {
        return c.a.c(this);
    }

    @Override // com.heytap.health.insight.singledimen.step.c, com.oplus.aiunit.vision.u11
    public boolean b() {
        return c.a.d(this);
    }

    @Override // com.heytap.health.insight.singledimen.step.c
    @Nullable
    /* JADX INFO: renamed from: c, reason: from getter */
    public DateRangeStat getMonthRangeStat() {
        return this.monthRangeStat;
    }

    @Override // com.heytap.health.insight.singledimen.step.c
    public void d(@Nullable DateRangeStat dateRangeStat) {
        this.monthRangeStat = dateRangeStat;
    }

    @Override // com.oplus.aiunit.vision.u11
    @NotNull
    public String e() {
        if (getFinalVisibleType() != null) {
            String strP = p().p(q());
            if (strP != null) {
                return strP;
            }
        }
        return "";
    }

    @Override // com.oplus.aiunit.vision.u11
    @Nullable
    /* JADX INFO: renamed from: f, reason: from getter */
    public RelativeDateRange getFinalDateRange() {
        return this.finalDateRange;
    }

    @Override // com.oplus.aiunit.vision.u11
    @NotNull
    public String g() {
        if (a() && getMonthRangeStat() != null) {
            DateRangeStat monthRangeStat = getMonthRangeStat();
            Intrinsics.checkNotNull(monthRangeStat);
            return p().o(monthRangeStat.f().getAverageStep() - monthRangeStat.d().getAverageStep(), true);
        }
        if (!b() || getWeekRangeStat() == null) {
            return "";
        }
        DateRangeStat weekRangeStat = getWeekRangeStat();
        Intrinsics.checkNotNull(weekRangeStat);
        return p().o(weekRangeStat.f().getAverageStep() - weekRangeStat.d().getAverageStep(), false);
    }

    @Override // com.oplus.aiunit.vision.u11
    @Nullable
    /* JADX INFO: renamed from: h, reason: from getter */
    public r9b getFinalVisibleType() {
        return this.finalVisibleType;
    }

    @Override // com.heytap.health.insight.singledimen.step.c
    @Nullable
    public r9b i(@NotNull RelativeDateRange relativeDateRange, @NotNull RelativeDateRange relativeDateRange2, @Nullable DateRangeStat dateRangeStat, @Nullable DateRangeStat dateRangeStat2) {
        return c.a.a(this, relativeDateRange, relativeDateRange2, dateRangeStat, dateRangeStat2);
    }

    @Override // com.heytap.health.insight.singledimen.step.c
    public void j(@Nullable DateRangeStat dateRangeStat) {
        this.weekRangeStat = dateRangeStat;
    }

    @Override // com.heytap.health.insight.singledimen.step.c
    @Nullable
    /* JADX INFO: renamed from: k, reason: from getter */
    public DateRangeStat getWeekRangeStat() {
        return this.weekRangeStat;
    }

    @Override // com.oplus.aiunit.vision.u11
    public void l(@Nullable RelativeDateRange relativeDateRange) {
        this.finalDateRange = relativeDateRange;
    }

    @Override // com.oplus.aiunit.vision.u11
    public void m(@Nullable r9b r9bVar) {
        this.finalVisibleType = r9bVar;
    }

    @Override // com.oplus.aiunit.vision.u11
    @Nullable
    public r9b n() {
        ArrayList arrayList = new ArrayList();
        DateRangeStat monthRangeStat = getMonthRangeStat();
        if (monthRangeStat != null && r(monthRangeStat)) {
            arrayList.add(Step.STEP_TRENT_MONTH);
        }
        DateRangeStat weekRangeStat = getWeekRangeStat();
        if (weekRangeStat != null && s(weekRangeStat)) {
            arrayList.add(Step.STEP_TRENT_WEEK);
        }
        return o().f(ModuleType.STEP, arrayList);
    }

    @NotNull
    public i08 o() {
        return c.a.b(this);
    }

    public final oba p() {
        return (oba) this.insightWord.getValue();
    }

    public final int q() {
        int averageStep;
        int averageStep2;
        if (a() && getMonthRangeStat() != null) {
            DateRangeStat monthRangeStat = getMonthRangeStat();
            Intrinsics.checkNotNull(monthRangeStat);
            averageStep = monthRangeStat.f().getAverageStep();
            averageStep2 = monthRangeStat.d().getAverageStep();
        } else {
            if (!b() || getWeekRangeStat() == null) {
                return 1;
            }
            DateRangeStat weekRangeStat = getWeekRangeStat();
            Intrinsics.checkNotNull(weekRangeStat);
            averageStep = weekRangeStat.f().getAverageStep();
            averageStep2 = weekRangeStat.d().getAverageStep();
        }
        return averageStep - averageStep2;
    }

    public final boolean r(DateRangeStat rangeStat) {
        StepStat beforeAvgStat = rangeStat.getBeforeAvgStat();
        StepStat curAvgStat = rangeStat.getCurAvgStat();
        m8b.f("InsightTrentContentLogic", "needShowMonth total:(" + beforeAvgStat.getTotalStepValidDays() + "," + curAvgStat.getTotalStepValidDays() + "), avg:(" + beforeAvgStat.getAverageStep() + ", " + curAvgStat.getAverageStep() + ")");
        return beforeAvgStat.getTotalStepValidDays() >= 20 && curAvgStat.getTotalStepValidDays() >= 20 && Math.abs(curAvgStat.getAverageStep() - beforeAvgStat.getAverageStep()) >= 1000;
    }

    public final boolean s(DateRangeStat rangeStat) {
        StepStat beforeAvgStat = rangeStat.getBeforeAvgStat();
        StepStat curAvgStat = rangeStat.getCurAvgStat();
        m8b.f("InsightTrentContentLogic", "needShowWeek total:(" + beforeAvgStat.getTotalStepValidDays() + "," + curAvgStat.getTotalStepValidDays() + "), avg(" + beforeAvgStat.getAverageStep() + ", " + curAvgStat.getAverageStep() + ")");
        return beforeAvgStat.getTotalStepValidDays() >= 3 && curAvgStat.getTotalStepValidDays() >= 3 && Math.abs(curAvgStat.getAverageStep() - beforeAvgStat.getAverageStep()) >= 500;
    }
}