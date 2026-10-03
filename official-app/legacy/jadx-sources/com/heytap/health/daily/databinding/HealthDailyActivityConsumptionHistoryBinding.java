package com.heytap.health.daily.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager2.widget.ViewPager2;
import com.heytap.health.base.ui.widget.HealthSegmentButtonLayout;
import com.heytap.health.daily.R$id;
import com.heytap.health.daily.R$layout;

/* JADX INFO: loaded from: classes16.dex */
public final class HealthDailyActivityConsumptionHistoryBinding implements ViewBinding {

    @NonNull
    public final LinearLayout i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NonNull
    public final HealthSegmentButtonLayout f3842j;

    @NonNull
    public final LinearLayout k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NonNull
    public final ViewPager2 f3843l;

    public HealthDailyActivityConsumptionHistoryBinding(@NonNull LinearLayout linearLayout, @NonNull HealthSegmentButtonLayout healthSegmentButtonLayout, @NonNull LinearLayout linearLayout2, @NonNull ViewPager2 viewPager2) {
        this.i = linearLayout;
        this.f3842j = healthSegmentButtonLayout;
        this.k = linearLayout2;
        this.f3843l = viewPager2;
    }

    @NonNull
    public static HealthDailyActivityConsumptionHistoryBinding a(@NonNull View view) {
        int i = R$id.segment_consumption_history;
        HealthSegmentButtonLayout healthSegmentButtonLayout = (HealthSegmentButtonLayout) ViewBindings.findChildViewById(view, i);
        if (healthSegmentButtonLayout != null) {
            LinearLayout linearLayout = (LinearLayout) view;
            int i2 = R$id.viewpager_consumption_history;
            ViewPager2 viewPager2 = (ViewPager2) ViewBindings.findChildViewById(view, i2);
            if (viewPager2 != null) {
                return new HealthDailyActivityConsumptionHistoryBinding(linearLayout, healthSegmentButtonLayout, linearLayout, viewPager2);
            }
            i = i2;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static HealthDailyActivityConsumptionHistoryBinding c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static HealthDailyActivityConsumptionHistoryBinding d(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R$layout.health_daily_activity_consumption_history, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.i;
    }
}
