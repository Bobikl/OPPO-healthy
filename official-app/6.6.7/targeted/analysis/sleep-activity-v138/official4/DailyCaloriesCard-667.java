package com.heytap.health.daily.ui.card;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.Observer;
import com.github.mikephil.charting.data.BarData;
import com.heytap.databaseengine.model.UserInfo;
import com.heytap.health.base.R$color;
import com.heytap.health.core.widget.charts.HealthBarChart;
import com.heytap.health.core.widget.charts.data.TimeStampedData;
import com.heytap.health.core.widget.charts.utils.AnimatorUtil;
import com.heytap.health.daily.R$id;
import com.heytap.health.daily.R$layout;
import com.heytap.health.daily.R$string;
import com.heytap.health.daily.bean.DailyActivityDayBean;
import com.heytap.health.daily.bean.DailyActivityDetailBean;
import com.heytap.health.daily.ui.card.DailyCaloriesCard;
import com.heytap.health.daily.viewmodel.DailyActivityDetailViewModel;
import com.heytap.log.formatter.LogFieldKey;
import com.oplus.aiunit.vision.DailyCardParams;
import com.oplus.aiunit.vision.c7n;
import com.oplus.aiunit.vision.e1;
import com.oplus.aiunit.vision.xmk;
import com.oplus.aiunit.vision.xp0;
import io.protostuff.MapSchema;
import java.time.ZoneId;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
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
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u0011¢\u0006\u0004\b\u001d\u0010\u001eJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u001c\u0010\t\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010\u000b\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010\u000e\u001a\u00020\b2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002J\b\u0010\u000f\u001a\u00020\bH\u0002J\b\u0010\u0010\u001a\u00020\bH\u0002R\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0018\u001a\u00020\u00158\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001c\u001a\u00020\u00198\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001f"}, d2 = {"Lcom/heytap/health/daily/ui/card/DailyCaloriesCard;", "Lcom/heytap/health/daily/ui/card/DailyActBaseCard;", "", MapSchema.FIELD_NAME_ENTRY, "Landroid/content/Context;", "context", "Landroid/view/View;", "cardView", "", LogFieldKey.LEVEL_KEY, "view", c7n.f, "Lcom/heytap/health/daily/bean/DailyActivityDetailBean;", "data", UserInfo.SEX_FEMALE, "C", "D", "Lcom/oplus/aiunit/vision/ir4;", "q", "Lcom/oplus/aiunit/vision/ir4;", "params", "Landroid/widget/TextView;", "r", "Landroid/widget/TextView;", "mTvConsumption", "Lcom/heytap/health/core/widget/charts/HealthBarChart;", "s", "Lcom/heytap/health/core/widget/charts/HealthBarChart;", "mChartCalorie", "<init>", "(Lcom/oplus/aiunit/vision/ir4;)V", "daily_release"}, k = 1, mv = {1, 8, 0})
public final class DailyCaloriesCard extends DailyActBaseCard {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    @NotNull
    public final DailyCardParams params;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    public TextView mTvConsumption;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    public HealthBarChart mChartCalorie;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a implements Observer, FunctionAdapter {
        public final /* synthetic */ Function1 i;

        public a(Function1 function) {
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

    public DailyCaloriesCard(@NotNull DailyCardParams params) {
        Intrinsics.checkNotNullParameter(params, "params");
        this.params = params;
    }

    public static final String E(int i, double d) {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format(Locale.getDefault(), "%.0f", Arrays.copyOf(new Object[]{Double.valueOf(d / ((double) 1000))}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }

    public final void C() {
        HealthBarChart healthBarChart = this.mChartCalorie;
        HealthBarChart healthBarChart2 = null;
        if (healthBarChart == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mChartCalorie");
            healthBarChart = null;
        }
        if (healthBarChart.getBarData().getEntryCount() > 0) {
            HealthBarChart healthBarChart3 = this.mChartCalorie;
            if (healthBarChart3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mChartCalorie");
            } else {
                healthBarChart2 = healthBarChart3;
            }
            healthBarChart2.animateY(700, AnimatorUtil.INSTANCE.j());
        }
    }

    public final void D() {
        HealthBarChart healthBarChart = this.mChartCalorie;
        HealthBarChart healthBarChart2 = null;
        if (healthBarChart == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mChartCalorie");
            healthBarChart = null;
        }
        t(healthBarChart);
        HealthBarChart healthBarChart3 = this.mChartCalorie;
        if (healthBarChart3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mChartCalorie");
            healthBarChart3 = null;
        }
        healthBarChart3.setYAxisValueFormatter(new xp0() { // from class: com.oplus.aiunit.vision.gr4
            @Override // com.oplus.aiunit.vision.xp0
            public final String a(int i, double d) {
                return DailyCaloriesCard.E(i, d);
            }
        });
        HealthBarChart healthBarChart4 = this.mChartCalorie;
        if (healthBarChart4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mChartCalorie");
            healthBarChart4 = null;
        }
        healthBarChart4.setBarColor(q().c());
        HealthBarChart healthBarChart5 = this.mChartCalorie;
        if (healthBarChart5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mChartCalorie");
            healthBarChart5 = null;
        }
        healthBarChart5.setYAxisLabelCount(2);
        HealthBarChart healthBarChart6 = this.mChartCalorie;
        if (healthBarChart6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mChartCalorie");
            healthBarChart6 = null;
        }
        healthBarChart6.setShowYAxisStartLine(true);
        HealthBarChart healthBarChart7 = this.mChartCalorie;
        if (healthBarChart7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mChartCalorie");
            healthBarChart7 = null;
        }
        healthBarChart7.setDefaultBatHeightScale(0.0f);
        HealthBarChart healthBarChart8 = this.mChartCalorie;
        if (healthBarChart8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mChartCalorie");
        } else {
            healthBarChart2 = healthBarChart8;
        }
        healthBarChart2.setData(new BarData());
    }

    public final void F(DailyActivityDetailBean data) {
        if (data == null) {
            return;
        }
        List<TimeStampedData> calories = data.getCalories();
        Intrinsics.checkNotNullExpressionValue(calories, "data.calories");
        TimeStampedData timeStampedDataW = w(calories, DailyActivityDetailViewModel.ChartType.CALORIE);
        HealthBarChart healthBarChart = null;
        if (timeStampedDataW.getY() > 0.0f) {
            HealthBarChart healthBarChart2 = this.mChartCalorie;
            if (healthBarChart2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mChartCalorie");
                healthBarChart2 = null;
            }
            healthBarChart2.setYAxisMaximum(timeStampedDataW.getY());
            HealthBarChart healthBarChart3 = this.mChartCalorie;
            if (healthBarChart3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mChartCalorie");
            } else {
                healthBarChart = healthBarChart3;
            }
            healthBarChart.setBarData(data.getCalories());
            return;
        }
        HealthBarChart healthBarChart4 = this.mChartCalorie;
        if (healthBarChart4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mChartCalorie");
            healthBarChart4 = null;
        }
        healthBarChart4.setYAxisMaximum(20000.0f);
        HealthBarChart healthBarChart5 = this.mChartCalorie;
        if (healthBarChart5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mChartCalorie");
        } else {
            healthBarChart = healthBarChart5;
        }
        healthBarChart.setData(new BarData());
    }

    @Override // com.heytap.health.base.view.recyclercard.a
    public int e() {
        return R$layout.health_daily_calories_item;
    }

    @Override // com.heytap.health.base.view.recyclercard.a
    public void g(@Nullable View view) {
        super.g(view);
        if (this.params.getIsFamily()) {
            return;
        }
        com.heytap.health.base.track.a.k().a(xmk.TAG_MODULE_ID, 4).a(xmk.TAG_POSTION1, 1).a("element", this.params.getFragment().getString(R$string.health_daily_active_consumption)).b();
        e1.d().b("/daily/ConsumptionHistoryActivity").withLong("jump_date", this.params.getDate().atStartOfDay(ZoneId.systemDefault()).toInstant().toEpochMilli()).navigation();
    }

    @Override // com.heytap.health.daily.ui.card.DailyActBaseCard, com.heytap.health.base.view.recyclercard.a
    public void l(@Nullable final Context context, @Nullable View cardView) {
        View viewA;
        super.l(context, cardView);
        if (context == null) {
            return;
        }
        View viewA2 = a(cardView, R$id.tv_daily_detail_consumption);
        Intrinsics.checkNotNull(viewA2, "null cannot be cast to non-null type android.widget.TextView");
        this.mTvConsumption = (TextView) viewA2;
        View viewA3 = a(cardView, R$id.view_daily_detail_consumption_chart);
        Intrinsics.checkNotNull(viewA3, "null cannot be cast to non-null type com.heytap.health.core.widget.charts.HealthBarChart");
        this.mChartCalorie = (HealthBarChart) viewA3;
        D();
        if (this.params.getIsFamily() && (viewA = a(cardView, R$id.iv_consumption_arrow_right)) != null) {
            viewA.setVisibility(8);
        }
        this.params.d().observe(this.params.getFragment(), new a(new Function1<DailyActivityDayBean, Unit>() { // from class: com.heytap.health.daily.ui.card.DailyCaloriesCard$renderView$1
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
                String string = context.getResources().getString(R$string.health_daily_detail_consumption);
                Intrinsics.checkNotNullExpressionValue(string, "context.resources.getStr…daily_detail_consumption)");
                String str = String.format(string, Arrays.copyOf(new Object[]{Integer.valueOf(dailyActivityDayBean.getCurrentCalorie()), Integer.valueOf(dailyActivityDayBean.getTargetCalorie())}, 2));
                Intrinsics.checkNotNullExpressionValue(str, "format(...)");
                TextView textView = this.mTvConsumption;
                if (textView == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mTvConsumption");
                    textView = null;
                }
                DailyCaloriesCard dailyCaloriesCard = this;
                Context context2 = context;
                textView.setText(dailyCaloriesCard.v(context2, str, context2.getResources().getColor(R$color.lib_base_colorBlack, null)));
            }
        }));
        this.params.b().observe(this.params.getFragment(), new a(new Function1<DailyActivityDetailBean, Unit>() { // from class: com.heytap.health.daily.ui.card.DailyCaloriesCard$renderView$2
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
                this.this$0.C();
            }
        }));
    }
}