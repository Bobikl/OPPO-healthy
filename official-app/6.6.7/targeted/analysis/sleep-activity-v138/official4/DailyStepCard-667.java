package com.heytap.health.daily.ui.card;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.Observer;
import com.github.mikephil.charting.data.BarData;
import com.heytap.databaseengine.model.UserInfo;
import com.heytap.health.base.R$color;
import com.heytap.health.base.track.a;
import com.heytap.health.core.widget.charts.HealthBarChart;
import com.heytap.health.core.widget.charts.data.TimeStampedData;
import com.heytap.health.core.widget.charts.utils.AnimatorUtil;
import com.heytap.health.daily.R$id;
import com.heytap.health.daily.R$layout;
import com.heytap.health.daily.R$string;
import com.heytap.health.daily.bean.DailyActivityDayBean;
import com.heytap.health.daily.bean.DailyActivityDetailBean;
import com.heytap.health.daily.ui.card.DailyStepCard;
import com.heytap.health.daily.viewmodel.DailyActivityDetailViewModel;
import com.heytap.log.formatter.LogFieldKey;
import com.oplus.aiunit.vision.DailyCardParams;
import com.oplus.aiunit.vision.c7n;
import com.oplus.aiunit.vision.e1;
import com.oplus.aiunit.vision.xmk;
import com.oplus.aiunit.vision.xp0;
import io.protostuff.MapSchema;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Function;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.FunctionAdapter;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.StringCompanionObject;

/* JADX INFO: loaded from: classes16.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \"2\u00020\u0001:\u0001#B\u000f\u0012\u0006\u0010\u0017\u001a\u00020\u0014¢\u0006\u0004\b \u0010!J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u001c\u0010\t\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010\u000b\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0006H\u0016J\b\u0010\f\u001a\u00020\bH\u0002J\u0010\u0010\u000f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0002J\u0012\u0010\u0012\u001a\u00020\b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0002J\b\u0010\u0013\u001a\u00020\bH\u0002R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u001b\u001a\u00020\u00188\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001f\u001a\u00020\u001c8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006$"}, d2 = {"Lcom/heytap/health/daily/ui/card/DailyStepCard;", "Lcom/heytap/health/daily/ui/card/DailyActBaseCard;", "", MapSchema.FIELD_NAME_ENTRY, "Landroid/content/Context;", "context", "Landroid/view/View;", "cardView", "", LogFieldKey.LEVEL_KEY, "view", c7n.f, "D", "", "distance", "C", "Lcom/heytap/health/daily/bean/DailyActivityDetailBean;", "data", UserInfo.SEX_FEMALE, "G", "Lcom/oplus/aiunit/vision/ir4;", "q", "Lcom/oplus/aiunit/vision/ir4;", "params", "Landroid/widget/TextView;", "r", "Landroid/widget/TextView;", "mTvStep", "Lcom/heytap/health/core/widget/charts/HealthBarChart;", "s", "Lcom/heytap/health/core/widget/charts/HealthBarChart;", "mChartStep", "<init>", "(Lcom/oplus/aiunit/vision/ir4;)V", "Companion", "a", "daily_release"}, k = 1, mv = {1, 8, 0})
public final class DailyStepCard extends DailyActBaseCard {

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    @NotNull
    public final DailyCardParams params;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    public TextView mTvStep;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    public HealthBarChart mChartStep;
    public static final int $stable = 8;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class b implements Observer, FunctionAdapter {
        public final /* synthetic */ Function1 i;

        public b(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.i = function;
        }

        public final boolean equals(@Nullable Object obj) {
            if ((obj instanceof Observer) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p010kotlin.jvm.internal.FunctionAdapter
        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.i;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.i.invoke(obj);
        }
    }

    public DailyStepCard(@NotNull DailyCardParams params) {
        Intrinsics.checkNotNullParameter(params, "params");
        this.params = params;
    }

    public static final String E(DailyStepCard this$0, int i, double d) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (d < 1000.0d) {
            return String.valueOf((int) d);
        }
        double d2 = 1000;
        if (d % d2 == 0.0d) {
            return ((int) Math.ceil(d / d2)) + MapSchema.FIELD_NAME_KEY;
        }
        return this$0.C(((float) d) / 1000) + MapSchema.FIELD_NAME_KEY;
    }

    public final float C(float distance) {
        BigDecimal scale = new BigDecimal(distance).setScale(2, RoundingMode.DOWN);
        Intrinsics.checkNotNullExpressionValue(scale, "bd.setScale(2, RoundingMode.DOWN)");
        return scale.floatValue();
    }

    public final void D() {
        HealthBarChart healthBarChart = this.mChartStep;
        HealthBarChart healthBarChart2 = null;
        if (healthBarChart == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mChartStep");
            healthBarChart = null;
        }
        t(healthBarChart);
        HealthBarChart healthBarChart3 = this.mChartStep;
        if (healthBarChart3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mChartStep");
            healthBarChart3 = null;
        }
        healthBarChart3.setYAxisValueFormatter(new xp0() { // from class: com.oplus.aiunit.vision.os4
            @Override // com.oplus.aiunit.vision.xp0
            public final String a(int i, double d) {
                return DailyStepCard.E(this.a, i, d);
            }
        });
        HealthBarChart healthBarChart4 = this.mChartStep;
        if (healthBarChart4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mChartStep");
            healthBarChart4 = null;
        }
        healthBarChart4.setBarColor(q().g());
        HealthBarChart healthBarChart5 = this.mChartStep;
        if (healthBarChart5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mChartStep");
            healthBarChart5 = null;
        }
        healthBarChart5.setYAxisLabelCount(2);
        HealthBarChart healthBarChart6 = this.mChartStep;
        if (healthBarChart6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mChartStep");
            healthBarChart6 = null;
        }
        healthBarChart6.setShowYAxisStartLine(true);
        HealthBarChart healthBarChart7 = this.mChartStep;
        if (healthBarChart7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mChartStep");
            healthBarChart7 = null;
        }
        healthBarChart7.setDefaultBatHeightScale(0.0f);
        HealthBarChart healthBarChart8 = this.mChartStep;
        if (healthBarChart8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mChartStep");
        } else {
            healthBarChart2 = healthBarChart8;
        }
        healthBarChart2.setData(new BarData());
    }

    public final void F(DailyActivityDetailBean data) {
        if (data == null) {
            return;
        }
        List<TimeStampedData> steps = data.getSteps();
        Intrinsics.checkNotNullExpressionValue(steps, "data.steps");
        TimeStampedData timeStampedDataW = w(steps, DailyActivityDetailViewModel.ChartType.STEP);
        HealthBarChart healthBarChart = null;
        if (timeStampedDataW.getY() > 0.0f) {
            HealthBarChart healthBarChart2 = this.mChartStep;
            if (healthBarChart2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mChartStep");
                healthBarChart2 = null;
            }
            healthBarChart2.setYAxisMaximum(timeStampedDataW.getY());
            HealthBarChart healthBarChart3 = this.mChartStep;
            if (healthBarChart3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mChartStep");
            } else {
                healthBarChart = healthBarChart3;
            }
            healthBarChart.setBarData(data.getSteps());
            return;
        }
        HealthBarChart healthBarChart4 = this.mChartStep;
        if (healthBarChart4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mChartStep");
            healthBarChart4 = null;
        }
        healthBarChart4.setYAxisMaximum(500.0f);
        HealthBarChart healthBarChart5 = this.mChartStep;
        if (healthBarChart5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mChartStep");
        } else {
            healthBarChart = healthBarChart5;
        }
        healthBarChart.setData(new BarData());
    }

    public final void G() {
        HealthBarChart healthBarChart = this.mChartStep;
        HealthBarChart healthBarChart2 = null;
        if (healthBarChart == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mChartStep");
            healthBarChart = null;
        }
        if (healthBarChart.getBarData().getEntryCount() > 0) {
            HealthBarChart healthBarChart3 = this.mChartStep;
            if (healthBarChart3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mChartStep");
            } else {
                healthBarChart2 = healthBarChart3;
            }
            healthBarChart2.animateY(700, AnimatorUtil.INSTANCE.j());
        }
    }

    @Override // com.heytap.health.base.view.recyclercard.a
    public int e() {
        return R$layout.health_daily_step_item;
    }

    @Override // com.heytap.health.base.view.recyclercard.a
    public void g(@Nullable View view) {
        super.g(view);
        if (this.params.getIsFamily()) {
            return;
        }
        a.k().a(xmk.TAG_MODULE_ID, 3).a(xmk.TAG_POSTION1, 1).a("element", this.params.getFragment().getString(R$string.health_daily_step_count)).b();
        e1.d().b("/step/StepHistoryActivity").withSerializable("jump_date", this.params.getDate()).navigation();
    }

    @Override // com.heytap.health.daily.ui.card.DailyActBaseCard, com.heytap.health.base.view.recyclercard.a
    public void l(@Nullable final Context context, @Nullable View cardView) {
        View viewA;
        super.l(context, cardView);
        if (context == null) {
            return;
        }
        View viewA2 = a(cardView, R$id.tv_daily_detail_step);
        Intrinsics.checkNotNull(viewA2, "null cannot be cast to non-null type android.widget.TextView");
        this.mTvStep = (TextView) viewA2;
        View viewA3 = a(cardView, R$id.view_daily_detail_step_chart);
        Intrinsics.checkNotNull(viewA3, "null cannot be cast to non-null type com.heytap.health.core.widget.charts.HealthBarChart");
        this.mChartStep = (HealthBarChart) viewA3;
        D();
        if (this.params.getIsFamily() && (viewA = a(cardView, R$id.iv_step_arrow_right)) != null) {
            viewA.setVisibility(8);
        }
        this.params.d().observe(this.params.getFragment(), new b(new Function1<DailyActivityDayBean, Unit>() { // from class: com.heytap.health.daily.ui.card.DailyStepCard$renderView$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p010kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(DailyActivityDayBean dailyActivityDayBean) {
                invoke2(dailyActivityDayBean);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(DailyActivityDayBean dailyActivityDayBean) {
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                String string = context.getResources().getString(R$string.health_daily_detail_step);
                Intrinsics.checkNotNullExpressionValue(string, "context.resources.getStr…health_daily_detail_step)");
                String str = String.format(string, Arrays.copyOf(new Object[]{Integer.valueOf(dailyActivityDayBean.getCurrentStep()), Integer.valueOf(dailyActivityDayBean.getTargetStep())}, 2));
                Intrinsics.checkNotNullExpressionValue(str, "format(...)");
                TextView textView = this.mTvStep;
                if (textView == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mTvStep");
                    textView = null;
                }
                DailyStepCard dailyStepCard = this;
                Context context2 = context;
                textView.setText(dailyStepCard.v(context2, str, context2.getResources().getColor(R$color.lib_base_colorBlack, null)));
            }
        }));
        this.params.b().observe(this.params.getFragment(), new b(new Function1<DailyActivityDetailBean, Unit>() { // from class: com.heytap.health.daily.ui.card.DailyStepCard$renderView$2
            {
                super(1);
            }

            @Override // p010kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(DailyActivityDetailBean dailyActivityDetailBean) {
                invoke2(dailyActivityDetailBean);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(DailyActivityDetailBean dailyActivityDetailBean) {
                this.this$0.F(dailyActivityDetailBean);
                this.this$0.G();
            }
        }));
    }
}