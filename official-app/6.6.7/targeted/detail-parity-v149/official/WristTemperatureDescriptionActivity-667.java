package com.heytap.health.wrist_temperature.ui;

import android.content.Context;
import android.graphics.DashPathEffect;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.view.View;
import android.widget.TextView;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.coui.appcompat.toolbar.COUIToolbar;
import com.heytap.health.base.R$anim;
import com.heytap.health.base.R$id;
import com.heytap.health.base.base.BaseActivity;
import com.heytap.health.core.widget.charts.data.TimeStampedData;
import com.heytap.health.core.widget.charts.data.TimeUnit;
import com.heytap.health.health_base.R$color;
import com.heytap.health.wrist_temperature.R$layout;
import com.heytap.health.wrist_temperature.R$string;
import com.heytap.health.wrist_temperature.ui.WristTemperatureDescriptionActivity;
import com.heytap.health.wrist_temperature.view.WristTemperatureChart;
import com.oplus.aiunit.vision.god;
import com.oplus.aiunit.vision.jjk;
import com.oplus.aiunit.vision.lo9;
import com.oplus.aiunit.vision.m6m;
import com.oplus.aiunit.vision.qmg;
import com.oplus.aiunit.vision.u5e;
import com.oplus.aiunit.vision.u7k;
import com.oplus.aiunit.vision.xmk;
import com.oplus.aiunit.vision.xp0;
import com.oplus.aiunit.vision.zh2;
import com.support.appcompat.R$attr;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Arrays;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.StringCompanionObject;

/* JADX INFO: loaded from: classes19.dex */
@Route(path = "/wrist_temperature/WristTemperatureDescriptionActivity")
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0014J\b\u0010\u0007\u001a\u00020\u0005H\u0016J\u0018\u0010\f\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002J \u0010\u0012\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002J\f\u0010\u0015\u001a\u00020\u0014*\u00020\u0013H\u0002¨\u0006\u0018"}, d2 = {"Lcom/heytap/health/wrist_temperature/ui/WristTemperatureDescriptionActivity;", "Lcom/heytap/health/base/base/BaseActivity;", "Lcom/oplus/aiunit/vision/u7k;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "finish", "Lcom/heytap/health/wrist_temperature/view/WristTemperatureChart;", "mChart", "Landroid/content/Context;", "context", "r7", "", "str1", "str2", "Landroid/widget/TextView;", "textView", "v7", "Ljava/time/LocalDate;", "", "w7", "<init>", "()V", "wrist_temperature_release"}, k = 1, mv = {1, 8, 0})
public final class WristTemperatureDescriptionActivity extends BaseActivity implements u7k {
    public static final String s7(WristTemperatureDescriptionActivity this$0, Context context, int i, double d) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(context, "$context");
        double dFloor = d > 0.0d ? Math.floor(d) : Math.ceil(d);
        if (d == 0.0d) {
            return this$0.getString(R$string.health_wrist_temperature_base_line);
        }
        return m6m.INSTANCE.g((float) dFloor, context) + this$0.getString(R$string.health_wrist_temperature_unit);
    }

    public static final String t7(WristTemperatureChart mChart, Context context, int i, double d) {
        Intrinsics.checkNotNullParameter(mChart, "$mChart");
        Intrinsics.checkNotNullParameter(context, "$context");
        return lo9.c(context, (long) (d * mChart.getXAxisTimeUnit().getUnit()));
    }

    public static final void u7(View view) {
        god.c().a(Uri.parse("healthap://app/path=113?extra_launch_type=7&jumpUrl=health-guide/index.html?page=devices&steerCode=wristtemperature"), null);
    }

    @Override // android.app.Activity
    public void finish() {
        super.finish();
        overridePendingTransition(R$anim.lib_base_top_to_bottom_in, R$anim.lib_base_top_to_bottom_out);
    }

    @Override // com.heytap.health.base.base.BaseActivity, com.heytap.health.base.base.BaseViewSizeControl
    public /* bridge */ /* synthetic */ void handleContentView(View view) {
        super.handleContentView(view);
    }

    @Override // com.heytap.health.base.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R$layout.health_wrist_activity_explanation);
        COUIToolbar cOUIToolbar = (COUIToolbar) findViewById(R$id.lib_base_toolbar);
        cOUIToolbar.setTitle(getString(R$string.health_wrist_temperature_description));
        S1(this, cOUIToolbar, true);
        TextView tvInBaseLine = (TextView) findViewById(com.heytap.health.wrist_temperature.R$id.tv_in_baseline);
        TextView tvHighBaseLine = (TextView) findViewById(com.heytap.health.wrist_temperature.R$id.tv_high_baseline);
        TextView tvLowBaseLine = (TextView) findViewById(com.heytap.health.wrist_temperature.R$id.tv_low_baseline);
        WristTemperatureChart chart = (WristTemperatureChart) findViewById(com.heytap.health.wrist_temperature.R$id.health_wrist_base_chart);
        Intrinsics.checkNotNullExpressionValue(chart, "chart");
        r7(chart, this);
        String string = getString(R$string.health_wrist_temperature_in_base_line);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.healt…temperature_in_base_line)");
        String string2 = getString(R$string.health_wrist_temperature_in_base_line_content);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.healt…ure_in_base_line_content)");
        Intrinsics.checkNotNullExpressionValue(tvInBaseLine, "tvInBaseLine");
        v7(string, string2, tvInBaseLine);
        String string3 = getString(R$string.health_wrist_temperature_high_base_line);
        Intrinsics.checkNotNullExpressionValue(string3, "getString(R.string.healt…mperature_high_base_line)");
        String string4 = getString(R$string.health_wrist_temperature_high_base_line_content);
        Intrinsics.checkNotNullExpressionValue(string4, "getString(R.string.healt…e_high_base_line_content)");
        Intrinsics.checkNotNullExpressionValue(tvHighBaseLine, "tvHighBaseLine");
        v7(string3, string4, tvHighBaseLine);
        String string5 = getString(R$string.health_wrist_temperature_low_base_line);
        Intrinsics.checkNotNullExpressionValue(string5, "getString(R.string.healt…emperature_low_base_line)");
        String string6 = getString(R$string.health_wrist_temperature_low_base_line_content);
        Intrinsics.checkNotNullExpressionValue(string6, "getString(R.string.healt…re_low_base_line_content)");
        Intrinsics.checkNotNullExpressionValue(tvLowBaseLine, "tvLowBaseLine");
        v7(string5, string6, tvLowBaseLine);
        TextView textView = (TextView) findViewById(com.heytap.health.wrist_temperature.R$id.tv_wrist_go_view);
        if (u5e.b(this)) {
            textView.setTextColor(zh2.a(this, R$attr.couiColorPrimary));
            textView.setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.y6m
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    WristTemperatureDescriptionActivity.u7(view);
                }
            });
        } else {
            textView.setVisibility(8);
        }
        com.heytap.health.base.track.a.x().a(xmk.TAG_MODULE_ID, -1).b();
    }

    public final void r7(final WristTemperatureChart mChart, final Context context) {
        mChart.getXAxis().setLabelCount(7);
        mChart.setXAxisTimeUnit(TimeUnit.DAY);
        mChart.setExtraXAxisSpace(0.5f);
        mChart.setExtraTopOffset(0.0f);
        mChart.setChartType(1);
        mChart.setIfIntercept(true);
        mChart.setDrawZeroGridLine(true);
        mChart.setYAxisValueFormatter(new xp0() { // from class: com.oplus.aiunit.vision.z6m
            @Override // com.oplus.aiunit.vision.xp0
            public final String a(int i, double d) {
                return WristTemperatureDescriptionActivity.s7(this.a, context, i, d);
            }
        });
        mChart.setXAxisValueFormatter(new xp0() { // from class: com.oplus.aiunit.vision.a7m
            @Override // com.oplus.aiunit.vision.xp0
            public final String a(int i, double d) {
                return WristTemperatureDescriptionActivity.t7(mChart, context, i, d);
            }
        });
        mChart.getAxisRight().setGridDashedLine(new DashPathEffect(new float[]{qmg.a(context, 3.0f), qmg.a(context, 3.0f)}, 0.0f));
        mChart.setGridLinePos(new float[]{0.0f, qmg.f(context) - jjk.a(context, 82.0f), (qmg.f(context) / 2) - jjk.a(context, 41.0f)});
        LocalDate localDateOf = LocalDate.of(2023, 1, 2);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 7; i++) {
            LocalDate localDatePlusDays = localDateOf.plusDays(i);
            Intrinsics.checkNotNullExpressionValue(localDatePlusDays, "startDate.plusDays(i.toLong())");
            arrayList.add(new TimeStampedData(w7(localDatePlusDays), 0.0f));
        }
        ((TimeStampedData) arrayList.get(0)).setY(0.5f);
        ((TimeStampedData) arrayList.get(1)).setY(0.0f);
        ((TimeStampedData) arrayList.get(2)).setY(1.8f);
        ((TimeStampedData) arrayList.get(3)).setY(-1.8f);
        ((TimeStampedData) arrayList.get(4)).setY(0.9f);
        ((TimeStampedData) arrayList.get(5)).setY(0.1f);
        ((TimeStampedData) arrayList.get(6)).setY(0.6f);
        mChart.setTimeXAxisMinimum(((TimeStampedData) arrayList.get(0)).getTimestamp());
        mChart.setTimeXAxisMaximum(((TimeStampedData) arrayList.get(arrayList.size() - 1)).getTimestamp());
        mChart.setVisibleXRange(7.0f, 7.0f);
        mChart.setEntryData(arrayList);
    }

    public final void v7(String str1, String str2, TextView textView) {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format(str2, Arrays.copyOf(new Object[]{str1}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(getColor(R$color.health_base_black_85alpha)), 0, str1.length(), 33);
        spannableStringBuilder.setSpan(new StyleSpan(1), 0, str1.length(), 33);
        textView.setText(spannableStringBuilder);
    }

    public final long w7(LocalDate localDate) {
        return localDate.atStartOfDay(ZoneId.systemDefault()).toInstant().toEpochMilli();
    }
}