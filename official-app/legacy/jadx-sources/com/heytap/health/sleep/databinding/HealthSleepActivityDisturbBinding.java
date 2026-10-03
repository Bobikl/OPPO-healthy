package com.heytap.health.sleep.databinding;

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
import com.heytap.health.sleep.R$id;
import com.heytap.health.sleep.R$layout;

/* JADX INFO: loaded from: classes18.dex */
public final class HealthSleepActivityDisturbBinding implements ViewBinding {

    @NonNull
    public final LinearLayout i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NonNull
    public final HealthSegmentButtonLayout f5686j;

    @NonNull
    public final ViewPager2 k;

    public HealthSleepActivityDisturbBinding(@NonNull LinearLayout linearLayout, @NonNull HealthSegmentButtonLayout healthSegmentButtonLayout, @NonNull ViewPager2 viewPager2) {
        this.i = linearLayout;
        this.f5686j = healthSegmentButtonLayout;
        this.k = viewPager2;
    }

    @NonNull
    public static HealthSleepActivityDisturbBinding a(@NonNull View view) {
        int i = R$id.segment_sleep_disturb_history;
        HealthSegmentButtonLayout healthSegmentButtonLayout = (HealthSegmentButtonLayout) ViewBindings.findChildViewById(view, i);
        if (healthSegmentButtonLayout != null) {
            i = R$id.vpDisturb;
            ViewPager2 viewPager2 = (ViewPager2) ViewBindings.findChildViewById(view, i);
            if (viewPager2 != null) {
                return new HealthSleepActivityDisturbBinding((LinearLayout) view, healthSegmentButtonLayout, viewPager2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static HealthSleepActivityDisturbBinding c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static HealthSleepActivityDisturbBinding d(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R$layout.health_sleep_activity_disturb, viewGroup, false);
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
