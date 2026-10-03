package com.health.sleep_breath_rate.view;

import android.content.Context;
import android.util.AttributeSet;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.ContextCompat;
import com.github.mikephil.charting.charts.Chart;
import com.github.mikephil.charting.model.GradientColor;
import com.health.sleep_breath_rate.R$color;
import com.heytap.health.core.widget.charts.GluCombineChart;
import com.heytap.health.lib_chart.R;
import com.oplus.aiunit.vision.if0;
import com.oplus.aiunit.vision.u88;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0013\b\u0016\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fB\u001d\b\u0016\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000b\u0010\u000fB%\b\u0016\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u000b\u0010\u0012J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0006\u0010\u0004\u001a\u00020\u0002J\u0016\u0010\b\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005¨\u0006\u0013"}, d2 = {"Lcom/health/sleep_breath_rate/view/SleepBRChart;", "Lcom/heytap/health/core/widget/charts/GluCombineChart;", "", "x", "K", "", "minValue", "maxValue", "J", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "sleep_breath_rate_release"}, k = 1, mv = {1, 8, 0})
public final class SleepBRChart extends GluCombineChart {
    public static final int $stable = 0;

    public SleepBRChart(@Nullable Context context) {
        super(context);
        x();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void x() {
        if (if0.y(getContext())) {
            u88 u88Var = ((Chart) this).mRenderer;
            Intrinsics.checkNotNull(u88Var, "null cannot be cast to non-null type com.heytap.health.core.widget.charts.renderer.GluCombinedChartRenderer");
            Context context = getContext();
            int i = R$color.health_sleep_br_0066FF;
            u88Var.e((GradientColor) null, new GradientColor(ContextCompat.getColor(context, i), ContextCompat.getColor(getContext(), i)), new GradientColor(ContextCompat.getColor(getContext(), i), ContextCompat.getColor(getContext(), i)), new GradientColor(ContextCompat.getColor(getContext(), i), ContextCompat.getColor(getContext(), i)));
            u88 u88Var2 = ((Chart) this).mRenderer;
            Intrinsics.checkNotNull(u88Var2, "null cannot be cast to non-null type com.heytap.health.core.widget.charts.renderer.GluCombinedChartRenderer");
            u88Var2.f(ContextCompat.getColor(getContext(), R.color.lib_chart_glu_mask_color_night));
            setLineColor(ContextCompat.getColor(getContext(), i));
            setLineColor2(ContextCompat.getColor(getContext(), R.color.lib_chart_B3B3B3));
            setBarColor(ContextCompat.getColor(getContext(), i));
        } else {
            u88 u88Var3 = ((Chart) this).mRenderer;
            Intrinsics.checkNotNull(u88Var3, "null cannot be cast to non-null type com.heytap.health.core.widget.charts.renderer.GluCombinedChartRenderer");
            Context context2 = getContext();
            int i2 = R$color.health_sleep_br_0066FF;
            u88Var3.e((GradientColor) null, new GradientColor(ContextCompat.getColor(context2, i2), i2), new GradientColor(ContextCompat.getColor(getContext(), i2), i2), new GradientColor(ContextCompat.getColor(getContext(), i2), i2));
            u88 u88Var4 = ((Chart) this).mRenderer;
            Intrinsics.checkNotNull(u88Var4, "null cannot be cast to non-null type com.heytap.health.core.widget.charts.renderer.GluCombinedChartRenderer");
            u88Var4.f(ContextCompat.getColor(getContext(), R.color.lib_chart_glu_mask_color));
            setLineColor(ContextCompat.getColor(getContext(), i2));
            setLineColor2(ContextCompat.getColor(getContext(), R.color.lib_chart_B3B3B3));
            setBarColor(ContextCompat.getColor(getContext(), i2));
        }
        u88 u88Var5 = ((Chart) this).mRenderer;
        Intrinsics.checkNotNull(u88Var5, "null cannot be cast to non-null type com.heytap.health.core.widget.charts.renderer.GluCombinedChartRenderer");
        u88Var5.j(24.0f);
    }

    public final void J(float minValue, float maxValue) {
        if (minValue == maxValue) {
            K();
            return;
        }
        double d = 5;
        double dCeil = (Math.ceil(((double) minValue) / 5.0d) * d) - d;
        if (dCeil < 0.0d) {
            dCeil = 0.0d;
        }
        double dFloor = (Math.floor(((double) maxValue) / 5.0d) * d) + d;
        double d2 = ((dFloor - dCeil) / ((double) 2)) + dCeil;
        float f = (float) dCeil;
        getAxisRight().setAxisMinimum(f);
        float f2 = (float) dFloor;
        getAxisRight().setAxisMaximum(f2);
        setYAxisRightValues(new float[]{f, (float) d2, f2});
    }

    public final void K() {
        getAxisRight().setLabelCount(3, true);
        getAxisRight().setAxisMinimum(10.0f);
        getAxisRight().setAxisMaximum(25.0f);
        setYAxisRightValues(new float[]{10.0f, 17.0f, 25.0f});
    }

    public SleepBRChart(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        x();
    }

    public SleepBRChart(@Nullable Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        x();
    }
}
