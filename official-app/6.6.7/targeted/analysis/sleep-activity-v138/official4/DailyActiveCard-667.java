package com.heytap.health.daily.ui.card;

import android.content.Context;
import android.graphics.DashPathEffect;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.Observer;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.model.GradientColor;
import com.heytap.health.core.widget.charts.HealthBarChart;
import com.heytap.health.core.widget.charts.data.TimeStampedData;
import com.heytap.health.core.widget.charts.data.TimeUnit;
import com.heytap.health.core.widget.charts.utils.AnimatorUtil;
import com.heytap.health.daily.R$color;
import com.heytap.health.daily.R$id;
import com.heytap.health.daily.R$layout;
import com.heytap.health.daily.R$string;
import com.heytap.health.daily.bean.DailyActivityDayBean;
import com.heytap.health.daily.bean.DailyActivityDetailBean;
import com.heytap.health.daily.ui.card.DailyActiveCard;
import com.heytap.health.daily.viewmodel.DailyActivityDetailViewModel;
import com.heytap.log.formatter.LogFieldKey;
import com.oplus.aiunit.vision.DailyCardParams;
import com.oplus.aiunit.vision.if0;
import com.oplus.aiunit.vision.jjk;
import com.oplus.aiunit.vision.qmg;
import com.oplus.aiunit.vision.xp0;
import io.protostuff.MapSchema;
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
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001eB\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u000f¢\u0006\u0004\b\u001b\u0010\u001cJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u001c\u0010\t\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\b\u0010\n\u001a\u00020\bH\u0002J\u0012\u0010\r\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002J\b\u0010\u000e\u001a\u00020\bH\u0002R\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0016\u001a\u00020\u00138\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u001a\u001a\u00020\u00178\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001f"}, d2 = {"Lcom/heytap/health/daily/ui/card/DailyActiveCard;", "Lcom/heytap/health/daily/ui/card/DailyActBaseCard;", "", MapSchema.FIELD_NAME_ENTRY, "Landroid/content/Context;", "context", "Landroid/view/View;", "cardView", "", LogFieldKey.LEVEL_KEY, "D", "Lcom/heytap/health/daily/bean/DailyActivityDetailBean;", "data", "G", "H", "Lcom/oplus/aiunit/vision/ir4;", "q", "Lcom/oplus/aiunit/vision/ir4;", "params", "Landroid/widget/TextView;", "r", "Landroid/widget/TextView;", "mTvNumber", "Lcom/heytap/health/core/widget/charts/HealthBarChart;", "s", "Lcom/heytap/health/core/widget/charts/HealthBarChart;", "mChartActive", "<init>", "(Lcom/oplus/aiunit/vision/ir4;)V", "Companion", "a", "daily_release"}, k = 1, mv = {1, 8, 0})
public final class DailyActiveCard extends DailyActBaseCard {

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    @NotNull
    public final DailyCardParams params;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    public TextView mTvNumber;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    public HealthBarChart mChartActive;
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

    public DailyActiveCard(@NotNull DailyCardParams params) {
        Intrinsics.checkNotNullParameter(params, "params");
        this.params = params;
    }

    public static final String E(int i, double d) {
        return "";
    }

    public static final String F(int i, double d) {
        double d2 = 60;
        return String.valueOf((int) ((((d * d2) * d2) * ((double) 1000)) / ((double) 3600000)));
    }

    public final void D() {
        Context contextRequireContext = this.params.getFragment().requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "params.fragment.requireContext()");
        HealthBarChart healthBarChart = this.mChartActive;
        HealthBarChart healthBarChart2 = null;
        if (healthBarChart == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mChartActive");
            healthBarChart = null;
        }
        healthBarChart.setYAxisMaximum(5.0f);
        HealthBarChart healthBarChart3 = this.mChartActive;
        if (healthBarChart3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mChartActive");
            healthBarChart3 = null;
        }
        healthBarChart3.setYAxisMinimum(0.0f);
        HealthBarChart healthBarChart4 = this.mChartActive;
        if (healthBarChart4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mChartActive");
            healthBarChart4 = null;
        }
        healthBarChart4.setYAxisValueFormatter(new xp0() { // from class: com.oplus.aiunit.vision.eq4
            @Override // com.oplus.aiunit.vision.xp0
            public final String a(int i, double d) {
                return DailyActiveCard.E(i, d);
            }
        });
        HealthBarChart healthBarChart5 = this.mChartActive;
        if (healthBarChart5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mChartActive");
            healthBarChart5 = null;
        }
        healthBarChart5.setShowYAxisStartLine(true);
        HealthBarChart healthBarChart6 = this.mChartActive;
        if (healthBarChart6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mChartActive");
            healthBarChart6 = null;
        }
        healthBarChart6.setYAxisLabelCount(2);
        if (if0.y(this.params.getFragment().getContext())) {
            HealthBarChart healthBarChart7 = this.mChartActive;
            if (healthBarChart7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mChartActive");
                healthBarChart7 = null;
            }
            healthBarChart7.getAxisRight().setGridColor(this.params.getFragment().getResources().getColor(R$color.health_daily_grid_line_night, null));
        } else {
            HealthBarChart healthBarChart8 = this.mChartActive;
            if (healthBarChart8 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mChartActive");
                healthBarChart8 = null;
            }
            healthBarChart8.getAxisRight().setGridColor(this.params.getFragment().getResources().getColor(R$color.health_daily_grid_line, null));
        }
        HealthBarChart healthBarChart9 = this.mChartActive;
        if (healthBarChart9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mChartActive");
            healthBarChart9 = null;
        }
        healthBarChart9.getAxisRight().setGridDashedLine(new DashPathEffect(new float[]{jjk.a(contextRequireContext, 3.67f), jjk.a(contextRequireContext, 3.67f)}, 3.67f));
        HealthBarChart healthBarChart10 = this.mChartActive;
        if (healthBarChart10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mChartActive");
            healthBarChart10 = null;
        }
        healthBarChart10.setXAxisTimeUnit(TimeUnit.HOUR);
        HealthBarChart healthBarChart11 = this.mChartActive;
        if (healthBarChart11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mChartActive");
            healthBarChart11 = null;
        }
        healthBarChart11.setXAxisValueFormatter(new xp0() { // from class: com.oplus.aiunit.vision.fq4
            @Override // com.oplus.aiunit.vision.xp0
            public final String a(int i, double d) {
                return DailyActiveCard.F(i, d);
            }
        });
        HealthBarChart healthBarChart12 = this.mChartActive;
        if (healthBarChart12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mChartActive");
            healthBarChart12 = null;
        }
        healthBarChart12.setGridLinePos(new float[]{jjk.a(this.params.getFragment().requireContext(), 20.0f), qmg.f(contextRequireContext) - jjk.a(contextRequireContext, 48.0f)});
        HealthBarChart healthBarChart13 = this.mChartActive;
        if (healthBarChart13 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mChartActive");
            healthBarChart13 = null;
        }
        healthBarChart13.setBarWidth(0.8333333f);
        HealthBarChart healthBarChart14 = this.mChartActive;
        if (healthBarChart14 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mChartActive");
            healthBarChart14 = null;
        }
        healthBarChart14.setXAxisMinimum(0.0f);
        HealthBarChart healthBarChart15 = this.mChartActive;
        if (healthBarChart15 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mChartActive");
            healthBarChart15 = null;
        }
        healthBarChart15.setXAxisMaximum(24.0f);
        HealthBarChart healthBarChart16 = this.mChartActive;
        if (healthBarChart16 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mChartActive");
            healthBarChart16 = null;
        }
        healthBarChart16.getXAxis().setLabelCount(5);
        HealthBarChart healthBarChart17 = this.mChartActive;
        if (healthBarChart17 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mChartActive");
            healthBarChart17 = null;
        }
        healthBarChart17.setRadius(3.0f);
        HealthBarChart healthBarChart18 = this.mChartActive;
        if (healthBarChart18 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mChartActive");
            healthBarChart18 = null;
        }
        healthBarChart18.setExtraTopOffset(0.0f);
        HealthBarChart healthBarChart19 = this.mChartActive;
        if (healthBarChart19 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mChartActive");
            healthBarChart19 = null;
        }
        healthBarChart19.setBarColor(q().a());
        HealthBarChart healthBarChart20 = this.mChartActive;
        if (healthBarChart20 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mChartActive");
            healthBarChart20 = null;
        }
        healthBarChart20.setDefaultBatHeightScale(0.0f);
        HealthBarChart healthBarChart21 = this.mChartActive;
        if (healthBarChart21 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mChartActive");
            healthBarChart21 = null;
        }
        healthBarChart21.setBarGradientColor(new GradientColor(q().a(), q().a()));
        HealthBarChart healthBarChart22 = this.mChartActive;
        if (healthBarChart22 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mChartActive");
            healthBarChart22 = null;
        }
        healthBarChart22.setVibrate(false);
        HealthBarChart healthBarChart23 = this.mChartActive;
        if (healthBarChart23 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mChartActive");
        } else {
            healthBarChart2 = healthBarChart23;
        }
        healthBarChart2.setData(new BarData());
    }

    public final void G(DailyActivityDetailBean data) {
        if (data == null) {
            return;
        }
        List<TimeStampedData> actives = data.getActives();
        Intrinsics.checkNotNullExpressionValue(actives, "data.actives");
        TimeStampedData timeStampedDataW = w(actives, DailyActivityDetailViewModel.ChartType.ACTIVE);
        HealthBarChart healthBarChart = null;
        if (timeStampedDataW.getY() > 0.0f) {
            HealthBarChart healthBarChart2 = this.mChartActive;
            if (healthBarChart2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mChartActive");
                healthBarChart2 = null;
            }
            healthBarChart2.setYAxisMaximum(timeStampedDataW.getY() + 0.176f);
        } else {
            HealthBarChart healthBarChart3 = this.mChartActive;
            if (healthBarChart3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mChartActive");
                healthBarChart3 = null;
            }
            healthBarChart3.setYAxisMaximum(1.176f);
        }
        HealthBarChart healthBarChart4 = this.mChartActive;
        if (healthBarChart4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mChartActive");
        } else {
            healthBarChart = healthBarChart4;
        }
        healthBarChart.setBarData(data.getActives());
    }

    public final void H() {
        HealthBarChart healthBarChart = this.mChartActive;
        HealthBarChart healthBarChart2 = null;
        if (healthBarChart == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mChartActive");
            healthBarChart = null;
        }
        if (healthBarChart.getBarData().getEntryCount() > 0) {
            HealthBarChart healthBarChart3 = this.mChartActive;
            if (healthBarChart3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mChartActive");
            } else {
                healthBarChart2 = healthBarChart3;
            }
            healthBarChart2.animateY(700, AnimatorUtil.INSTANCE.j());
        }
    }

    @Override // com.heytap.health.base.view.recyclercard.a
    public int e() {
        return R$layout.health_daily_active_item;
    }

    @Override // com.heytap.health.daily.ui.card.DailyActBaseCard, com.heytap.health.base.view.recyclercard.a
    public void l(@Nullable final Context context, @Nullable View cardView) {
        super.l(context, cardView);
        if (context == null) {
            return;
        }
        View viewA = a(cardView, R$id.tv_daily_detail_sport_times);
        Intrinsics.checkNotNull(viewA, "null cannot be cast to non-null type android.widget.TextView");
        this.mTvNumber = (TextView) viewA;
        View viewA2 = a(cardView, R$id.view_daily_detail_sport_active_chart);
        Intrinsics.checkNotNull(viewA2, "null cannot be cast to non-null type com.heytap.health.core.widget.charts.HealthBarChart");
        this.mChartActive = (HealthBarChart) viewA2;
        D();
        this.params.d().observe(this.params.getFragment(), new b(new Function1<DailyActivityDayBean, Unit>() { // from class: com.heytap.health.daily.ui.card.DailyActiveCard$renderView$1
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
                String string = context.getResources().getString(R$string.health_daily_detail_sport_times);
                Intrinsics.checkNotNullExpressionValue(string, "context.resources.getStr…daily_detail_sport_times)");
                String str = String.format(string, Arrays.copyOf(new Object[]{Integer.valueOf(dailyActivityDayBean.getCurrentActive()), Integer.valueOf(dailyActivityDayBean.getTargetActive())}, 2));
                Intrinsics.checkNotNullExpressionValue(str, "format(...)");
                TextView textView = this.mTvNumber;
                if (textView == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mTvNumber");
                    textView = null;
                }
                DailyActiveCard dailyActiveCard = this;
                Context context2 = context;
                textView.setText(dailyActiveCard.v(context2, str, context2.getResources().getColor(com.heytap.health.base.R$color.lib_base_colorBlack, null)));
            }
        }));
        this.params.b().observe(this.params.getFragment(), new b(new Function1<DailyActivityDetailBean, Unit>() { // from class: com.heytap.health.daily.ui.card.DailyActiveCard$renderView$2
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
                this.this$0.G(dailyActivityDetailBean);
                this.this$0.H();
            }
        }));
    }
}