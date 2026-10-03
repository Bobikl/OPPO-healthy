package com.heytap.health.daily.ui.card;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.exifinterface.media.ExifInterface;
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
import com.heytap.health.daily.ui.card.DailyTimeCard;
import com.heytap.health.daily.viewmodel.DailyActivityDetailViewModel;
import com.heytap.log.formatter.LogFieldKey;
import com.oplus.aiunit.vision.DailyCardParams;
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
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001eB\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u000f¢\u0006\u0004\b\u001b\u0010\u001cJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u001c\u0010\t\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\b\u0010\n\u001a\u00020\bH\u0002J\u0012\u0010\r\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002J\b\u0010\u000e\u001a\u00020\bH\u0002R\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0016\u001a\u00020\u00138\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u001a\u001a\u00020\u00178\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001f"}, d2 = {"Lcom/heytap/health/daily/ui/card/DailyTimeCard;", "Lcom/heytap/health/daily/ui/card/DailyActBaseCard;", "", MapSchema.FIELD_NAME_ENTRY, "Landroid/content/Context;", "context", "Landroid/view/View;", "cardView", "", LogFieldKey.LEVEL_KEY, "C", "Lcom/heytap/health/daily/bean/DailyActivityDetailBean;", "data", ExifInterface.LONGITUDE_EAST, UserInfo.SEX_FEMALE, "Lcom/oplus/aiunit/vision/ir4;", "q", "Lcom/oplus/aiunit/vision/ir4;", "params", "Landroid/widget/TextView;", "r", "Landroid/widget/TextView;", "mTvTime", "Lcom/heytap/health/core/widget/charts/HealthBarChart;", "s", "Lcom/heytap/health/core/widget/charts/HealthBarChart;", "mChartTime", "<init>", "(Lcom/oplus/aiunit/vision/ir4;)V", "Companion", "a", "daily_release"}, k = 1, mv = {1, 8, 0})
public final class DailyTimeCard extends DailyActBaseCard {

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    @NotNull
    public final DailyCardParams params;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    public TextView mTvTime;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    public HealthBarChart mChartTime;
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

    public DailyTimeCard(@NotNull DailyCardParams params) {
        Intrinsics.checkNotNullParameter(params, "params");
        this.params = params;
    }

    public static final String D(int i, double d) {
        return String.valueOf((int) d);
    }

    public final void C() {
        HealthBarChart healthBarChart = this.mChartTime;
        HealthBarChart healthBarChart2 = null;
        if (healthBarChart == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mChartTime");
            healthBarChart = null;
        }
        t(healthBarChart);
        HealthBarChart healthBarChart3 = this.mChartTime;
        if (healthBarChart3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mChartTime");
            healthBarChart3 = null;
        }
        healthBarChart3.setBarColor(q().e());
        HealthBarChart healthBarChart4 = this.mChartTime;
        if (healthBarChart4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mChartTime");
            healthBarChart4 = null;
        }
        healthBarChart4.setYAxisValueFormatter(new xp0() { // from class: com.oplus.aiunit.vision.qs4
            @Override // com.oplus.aiunit.vision.xp0
            public final String a(int i, double d) {
                return DailyTimeCard.D(i, d);
            }
        });
        HealthBarChart healthBarChart5 = this.mChartTime;
        if (healthBarChart5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mChartTime");
            healthBarChart5 = null;
        }
        healthBarChart5.setYAxisLabelCount(2);
        HealthBarChart healthBarChart6 = this.mChartTime;
        if (healthBarChart6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mChartTime");
            healthBarChart6 = null;
        }
        healthBarChart6.setShowYAxisStartLine(true);
        HealthBarChart healthBarChart7 = this.mChartTime;
        if (healthBarChart7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mChartTime");
            healthBarChart7 = null;
        }
        healthBarChart7.setDefaultBatHeightScale(0.0f);
        HealthBarChart healthBarChart8 = this.mChartTime;
        if (healthBarChart8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mChartTime");
        } else {
            healthBarChart2 = healthBarChart8;
        }
        healthBarChart2.setData(new BarData());
    }

    public final void E(DailyActivityDetailBean data) {
        if (data == null) {
            return;
        }
        List<TimeStampedData> times = data.getTimes();
        Intrinsics.checkNotNullExpressionValue(times, "data.times");
        TimeStampedData timeStampedDataW = w(times, DailyActivityDetailViewModel.ChartType.TIME);
        HealthBarChart healthBarChart = null;
        if (timeStampedDataW.getY() > 0.0f) {
            HealthBarChart healthBarChart2 = this.mChartTime;
            if (healthBarChart2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mChartTime");
                healthBarChart2 = null;
            }
            healthBarChart2.setYAxisMaximum(timeStampedDataW.getY());
            HealthBarChart healthBarChart3 = this.mChartTime;
            if (healthBarChart3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mChartTime");
            } else {
                healthBarChart = healthBarChart3;
            }
            healthBarChart.setBarData(data.getTimes());
            return;
        }
        HealthBarChart healthBarChart4 = this.mChartTime;
        if (healthBarChart4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mChartTime");
            healthBarChart4 = null;
        }
        healthBarChart4.setYAxisMaximum(10.0f);
        HealthBarChart healthBarChart5 = this.mChartTime;
        if (healthBarChart5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mChartTime");
        } else {
            healthBarChart = healthBarChart5;
        }
        healthBarChart.setData(new BarData());
    }

    public final void F() {
        HealthBarChart healthBarChart = this.mChartTime;
        HealthBarChart healthBarChart2 = null;
        if (healthBarChart == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mChartTime");
            healthBarChart = null;
        }
        if (healthBarChart.getBarData().getEntryCount() > 0) {
            HealthBarChart healthBarChart3 = this.mChartTime;
            if (healthBarChart3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mChartTime");
            } else {
                healthBarChart2 = healthBarChart3;
            }
            healthBarChart2.animateY(700, AnimatorUtil.INSTANCE.j());
        }
    }

    @Override // com.heytap.health.base.view.recyclercard.a
    public int e() {
        return R$layout.health_daily_time_item;
    }

    @Override // com.heytap.health.daily.ui.card.DailyActBaseCard, com.heytap.health.base.view.recyclercard.a
    public void l(@Nullable final Context context, @Nullable View cardView) {
        super.l(context, cardView);
        if (context == null) {
            return;
        }
        View viewA = a(cardView, R$id.tv_daily_detail_exercise_time);
        Intrinsics.checkNotNull(viewA, "null cannot be cast to non-null type android.widget.TextView");
        this.mTvTime = (TextView) viewA;
        View viewA2 = a(cardView, R$id.view_daily_detail_exercise_time_chart);
        Intrinsics.checkNotNull(viewA2, "null cannot be cast to non-null type com.heytap.health.core.widget.charts.HealthBarChart");
        this.mChartTime = (HealthBarChart) viewA2;
        C();
        this.params.d().observe(this.params.getFragment(), new b(new Function1<DailyActivityDayBean, Unit>() { // from class: com.heytap.health.daily.ui.card.DailyTimeCard$renderView$1
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
                String string = context.getResources().getString(R$string.health_daily_detail_exercise_time);
                Intrinsics.checkNotNullExpressionValue(string, "context.resources.getStr…ily_detail_exercise_time)");
                String str = String.format(string, Arrays.copyOf(new Object[]{Integer.valueOf(dailyActivityDayBean.getCurrentTime()), Integer.valueOf(dailyActivityDayBean.getTargetTime())}, 2));
                Intrinsics.checkNotNullExpressionValue(str, "format(...)");
                TextView textView = this.mTvTime;
                if (textView == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mTvTime");
                    textView = null;
                }
                DailyTimeCard dailyTimeCard = this;
                Context context2 = context;
                textView.setText(dailyTimeCard.v(context2, str, context2.getResources().getColor(R$color.lib_base_colorBlack, null)));
            }
        }));
        this.params.b().observe(this.params.getFragment(), new b(new Function1<DailyActivityDetailBean, Unit>() { // from class: com.heytap.health.daily.ui.card.DailyTimeCard$renderView$2
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
                this.this$0.E(dailyActivityDetailBean);
                this.this$0.F();
            }
        }));
    }
}