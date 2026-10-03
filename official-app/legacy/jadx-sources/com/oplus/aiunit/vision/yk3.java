package com.oplus.aiunit.vision;

import android.content.Context;
import com.heytap.health.core.widget.charts.data.HealthGradientColor;
import com.heytap.health.health_base.R$color;

/* JADX INFO: loaded from: classes16.dex */
public final class yk3 {
    public final Context a;

    public yk3(Context context) {
        this.a = context;
    }

    public int a() {
        return this.a.getResources().getColor(R$color.health_daily_activity_activity_frequency_OPlus, null);
    }

    public HealthGradientColor b() {
        Context context = this.a;
        int i = R$color.health_daily_activity_activity_frequency_OPlus;
        return new HealthGradientColor(context.getColor(i), this.a.getColor(i));
    }

    public int c() {
        return this.a.getResources().getColor(R$color.health_daily_activity_calories_OPlus, null);
    }

    public HealthGradientColor d() {
        Context context = this.a;
        int i = R$color.health_daily_activity_calories_OPlus;
        return new HealthGradientColor(context.getColor(i), this.a.getColor(i));
    }

    public int e() {
        return this.a.getResources().getColor(R$color.health_daily_activity_exercise_duration_OPlus, null);
    }

    public HealthGradientColor f() {
        Context context = this.a;
        int i = R$color.health_daily_activity_exercise_duration_OPlus;
        return new HealthGradientColor(context.getColor(i), this.a.getColor(i));
    }

    public int g() {
        return this.a.getResources().getColor(R$color.health_daily_activity_step_OPlus, null);
    }

    public HealthGradientColor h() {
        Context context = this.a;
        int i = R$color.health_daily_activity_step_OPlus;
        return new HealthGradientColor(context.getColor(i), this.a.getColor(i));
    }
}
