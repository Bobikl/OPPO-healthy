package com.heytap.health.daily.ui;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.heytap.health.daily.R$drawable;
import com.heytap.health.daily.R$id;
import com.heytap.health.daily.R$string;
import com.heytap.health.daily.bean.DailyActivityCalendarDayBean;
import com.heytap.health.health_base.R$color;
import com.oplus.aiunit.vision.qe0;
import com.oplus.aiunit.vision.t4b;
import java.time.LocalDate;

/* JADX INFO: loaded from: classes16.dex */
public class DailyView extends LinearLayout {
    public Context i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f3859j;
    public int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f3860l;
    public int m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f3861n;
    public int o;
    public int p;
    public int q;
    public int r;
    public LocalDate s;
    public a t;
    public Boolean u;

    public interface a {
        void a(LocalDate localDate);
    }

    public DailyView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3861n = 8000;
        this.o = 300;
        this.p = 30;
        this.q = 12;
        this.r = 0;
        this.s = LocalDate.now();
        this.t = null;
        this.u = Boolean.FALSE;
        this.i = context;
        c();
    }

    public void a() {
        this.t.a(this.s);
    }

    public void b() {
        ((DailyProcessView) findViewById(R$id.health_iv_daily_activity)).a((this.f3859j * 1.0f) / this.f3861n, (this.k * 1.0f) / this.o, (this.f3860l * 1.0f) / this.p, (this.m * 1.0f) / this.q);
    }

    public void c() {
        this.f3859j = 0;
        this.k = 0;
        this.f3860l = 0;
        this.m = 0;
    }

    public void d(DailyActivityCalendarDayBean dailyActivityCalendarDayBean) {
        this.f3859j = dailyActivityCalendarDayBean.getSteps();
        this.f3861n = dailyActivityCalendarDayBean.getStepsTarget();
        this.k = dailyActivityCalendarDayBean.getCalories();
        this.o = dailyActivityCalendarDayBean.getCaloriesTarget();
        this.m = dailyActivityCalendarDayBean.getActives();
        this.q = dailyActivityCalendarDayBean.getActivesTarget();
        this.f3860l = dailyActivityCalendarDayBean.getTimes();
        this.p = dailyActivityCalendarDayBean.getTimesTarget();
        b();
    }

    @SuppressLint({"ResourceAsColor"})
    public void e() {
        TextView textView = (TextView) findViewById(R$id.health_tv_calendar_date);
        LocalDate localDateNow = LocalDate.now();
        LocalDate localDate = DailyActivityDetailActivity.currentSelectedDate;
        int year = (localDateNow.getYear() * 10000) + (localDateNow.getMonthValue() * 100) + localDateNow.getDayOfMonth();
        int year2 = (this.s.getYear() * 10000) + (this.s.getMonthValue() * 100) + this.s.getDayOfMonth();
        if ((localDate.getYear() * 10000) + (localDate.getMonthValue() * 100) + localDate.getDayOfMonth() == year2) {
            if (qe0.y(this.i)) {
                textView.setBackgroundResource(R$drawable.health_daily_calendar_toady_black_night);
            } else {
                textView.setBackgroundResource(R$drawable.health_daily_calendar_toady_black);
            }
        }
        if (t4b.b() && year == year2) {
            textView.setText(R$string.health_daily_activity_today);
        } else {
            textView.setText(this.s.getDayOfMonth() + "");
        }
        if (this.s.isAfter(localDateNow)) {
            textView.setTextColor(getResources().getColor(R$color.health_base_CECECE, null));
        } else {
            textView.setTextColor(getResources().getColor(com.heytap.health.base.R$color.lib_base_colorBlack, null));
        }
    }
}
