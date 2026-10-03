package com.heytap.health.stress.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.ColorRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.constraintlayout.widget.Group;
import com.heytap.databaseengine.model.stress.StressDataStat;
import com.heytap.health.healthbase.view.HealthProgressBarView;
import com.heytap.health.stress.R$color;
import com.heytap.health.stress.R$id;
import com.heytap.health.stress.R$layout;
import com.heytap.health.stress.R$string;
import com.oplus.aiunit.vision.a0j;
import com.oplus.aiunit.vision.ejg;
import com.oplus.aiunit.vision.o0j;
import com.oplus.aiunit.vision.rye;
import com.oplus.aiunit.vision.weg;
import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public class StressPercentPieView extends FrameLayout {
    public TextView i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public TextView f6040j;
    public HealthProgressBarView k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public TextView f6041l;
    public TextView m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public TextView f6042n;
    public TextView o;
    public TextView p;
    public TextView q;
    public TextView r;
    public TextView s;
    public TextView t;
    public Group u;

    public StressPercentPieView(@NonNull Context context) {
        super(context);
        e(context);
    }

    private void setPieData(int... iArr) {
        setTextData(iArr);
        this.p.setText(b(iArr[0]));
        this.q.setText(b(iArr[1]));
        this.r.setText(b(iArr[2]));
        this.s.setText(b(iArr[3]));
    }

    private void setTextData(int... iArr) {
        double d = 0.0d;
        for (int i : iArr) {
            d += (double) i;
        }
        int iD = d(iArr[0], d);
        int iD2 = d(iArr[1], d);
        int iD3 = d(iArr[2], d);
        int iD4 = d(iArr[3], d);
        int i2 = iD + iD2 + iD3 + iD4;
        if (i2 != 100) {
            int iC = c(iArr);
            if (iC == 0) {
                iD -= i2 - 100;
            } else if (iC == 1) {
                iD2 -= i2 - 100;
            } else if (iC == 2) {
                iD3 -= i2 - 100;
            } else if (iC == 3) {
                iD4 -= i2 - 100;
            }
        }
        f(this.f6041l, iD);
        f(this.m, iD2);
        f(this.f6042n, iD3);
        f(this.o, iD4);
        h(iD, iD2, iD3, iD4);
    }

    public final void a(List<rye> list, @ColorRes int i, float f, float f2) {
        float f3 = f + f2;
        if (f == f3) {
            return;
        }
        a0j.c("StressPercentPieView", "start: " + f + ", length: " + f2);
        list.add(new rye(f, f3, getContext().getColor(i), "", ""));
    }

    public final String b(int i) {
        if (i == 0) {
            return getContext().getString(R$string.health_stress_format_minute, String.valueOf(0));
        }
        if (i % weg.WINDOW_NIGHT_END == 0) {
            return getContext().getString(R$string.health_stress_format_day, String.valueOf(i / weg.WINDOW_NIGHT_END));
        }
        int i2 = i / weg.WINDOW_NIGHT_END;
        if (i2 > 0) {
            i -= i2 * weg.WINDOW_NIGHT_END;
        }
        int i3 = i / 60;
        int i4 = i % 60;
        if (i2 == 0) {
            if (i3 == 0) {
                return getContext().getString(R$string.health_stress_format_minute, String.valueOf(i4));
            }
            return i4 == 0 ? getContext().getString(R$string.health_stress_format_hour, String.valueOf(i3)) : getContext().getString(R$string.health_stress_format_time, String.valueOf(i3), String.valueOf(i4));
        }
        if (i3 <= 0 || i4 <= 0) {
            return (i3 <= 0 || i4 != 0) ? getContext().getString(R$string.health_stress_format_day_minute, String.valueOf(i2), String.valueOf(i4)) : getContext().getString(R$string.health_stress_format_day_hour, String.valueOf(i2), String.valueOf(i3));
        }
        return getContext().getString(R$string.health_stress_format_day_hour_minute, String.valueOf(i2), String.valueOf(i3), String.valueOf(i4));
    }

    public final int c(int[] iArr) {
        int i = 0;
        int i2 = iArr[0];
        int i3 = 0;
        while (i < iArr.length - 1) {
            i++;
            int i4 = iArr[i];
            if (i2 < i4) {
                i3 = i;
                i2 = i4;
            }
        }
        return i3;
    }

    public final int d(double d, double d2) {
        NumberFormat integerInstance = NumberFormat.getIntegerInstance();
        integerInstance.setMaximumIntegerDigits(3);
        integerInstance.setMinimumIntegerDigits(1);
        integerInstance.setMaximumFractionDigits(0);
        integerInstance.setRoundingMode(RoundingMode.HALF_UP);
        return Integer.parseInt(integerInstance.format((d / d2) * 100.0d));
    }

    public final void e(Context context) {
        View.inflate(context, R$layout.health_stress_view_percent, this);
        TextView textView = (TextView) findViewById(R$id.tv_health_stress_percent_relax);
        TextView textView2 = (TextView) findViewById(R$id.tv_health_stress_percent_normal);
        TextView textView3 = (TextView) findViewById(R$id.tv_health_stress_percent_medium);
        TextView textView4 = (TextView) findViewById(R$id.tv_health_stress_percent_high);
        textView.setText(R$string.health_stress_relax);
        textView2.setText(R$string.health_stress_normal);
        textView3.setText(R$string.health_stress_medium);
        textView4.setText(R$string.health_stress_high);
        this.i = (TextView) findViewById(R$id.tv_health_stress_percent_title);
        this.f6040j = (TextView) findViewById(R$id.tv_health_stress_high_warning);
        this.k = (HealthProgressBarView) findViewById(R$id.health_stress_progress);
        this.f6041l = (TextView) findViewById(R$id.tv_health_stress_percent_relax_value);
        this.m = (TextView) findViewById(R$id.tv_health_stress_percent_normal_value);
        this.f6042n = (TextView) findViewById(R$id.tv_health_stress_percent_medium_value);
        this.o = (TextView) findViewById(R$id.tv_health_stress_percent_high_value);
        this.p = (TextView) findViewById(R$id.tv_health_stress_percent_relax_time);
        this.q = (TextView) findViewById(R$id.tv_health_stress_percent_normal_time);
        this.r = (TextView) findViewById(R$id.tv_health_stress_percent_medium_time);
        this.s = (TextView) findViewById(R$id.tv_health_stress_percent_high_time);
        this.t = (TextView) findViewById(R$id.health_stress_no_data);
        this.u = (Group) findViewById(R$id.health_data_group);
        this.k.setDrawCursor(false);
        this.k.setIntervalPx(ejg.a(getContext(), 2.0f));
        this.k.setRange(0.0f, 100.0f);
        this.k.setDescribeType(HealthProgressBarView.DescribeTextType.CENTER);
        this.k.setCurSorType(HealthProgressBarView.CurSorType.CENTER);
        g();
    }

    public final void f(TextView textView, int i) {
        textView.setText(i + "%");
    }

    public void g() {
        f(this.f6041l, 0);
        f(this.m, 0);
        f(this.f6042n, 0);
        f(this.o, 0);
        String string = getContext().getString(R$string.health_stress_format_minute, String.valueOf(0));
        this.p.setText(string);
        this.q.setText(string);
        this.r.setText(string);
        this.s.setText(string);
        this.f6040j.setText("");
        this.f6040j.setVisibility(4);
        this.k.setVisibility(8);
        this.t.setVisibility(0);
        this.u.setVisibility(8);
    }

    public final void h(float f, float f2, float f3, float f4) {
        ArrayList arrayList = new ArrayList();
        a(arrayList, R$color.health_stress_relax, 0.0f, f);
        a(arrayList, R$color.health_stress_normal, f, f2);
        float f5 = f + f2;
        a(arrayList, R$color.health_stress_medium, f5, f3);
        a(arrayList, R$color.health_stress_high, f5 + f3, f4);
        a0j.c("StressPercentPieView", "progressSegments: " + arrayList.size());
        this.k.setData(arrayList);
        if (f == 0.0f && f2 == 0.0f && f3 == 0.0f && f4 == 0.0f) {
            return;
        }
        this.k.setVisibility(0);
    }

    public void setData(StressDataStat stressDataStat) {
        if (o0j.e(stressDataStat)) {
            this.u.setVisibility(8);
            this.t.setVisibility(0);
            return;
        }
        this.u.setVisibility(0);
        this.t.setVisibility(8);
        a0j.a("StressPercentPieView", "setData, " + stressDataStat.toString());
        setPieData(stressDataStat.getRelaxStressTotalTime(), stressDataStat.getNormalStressTotalTime(), stressDataStat.getMiddleStressTotalTime(), stressDataStat.getHighStressTotalTime());
    }

    public void setTitle(@StringRes int i) {
        this.i.setText(i);
    }

    public StressPercentPieView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        e(context);
    }

    public StressPercentPieView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        e(context);
    }
}
