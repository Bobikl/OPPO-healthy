package com.heytap.health.sleep.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.heytap.health.sleep.R$id;
import com.heytap.health.sleep.R$layout;
import com.heytap.health.sleep.view.BreathRateChart;

/* JADX INFO: loaded from: classes18.dex */
public final class HealthSleepActBreathRateBinding implements ViewBinding {

    @NonNull
    public final ConstraintLayout i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NonNull
    public final BreathRateChart f5677j;

    @NonNull
    public final ImageView k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NonNull
    public final LinearLayout f5678l;

    @NonNull
    public final View m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NonNull
    public final TextView f5679n;

    @NonNull
    public final TextView o;

    @NonNull
    public final TextView p;

    @NonNull
    public final TextView q;

    @NonNull
    public final TextView r;

    public HealthSleepActBreathRateBinding(@NonNull ConstraintLayout constraintLayout, @NonNull BreathRateChart breathRateChart, @NonNull ImageView imageView, @NonNull LinearLayout linearLayout, @NonNull View view, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull TextView textView5) {
        this.i = constraintLayout;
        this.f5677j = breathRateChart;
        this.k = imageView;
        this.f5678l = linearLayout;
        this.m = view;
        this.f5679n = textView;
        this.o = textView2;
        this.p = textView3;
        this.q = textView4;
        this.r = textView5;
    }

    @NonNull
    public static HealthSleepActBreathRateBinding a(@NonNull View view) {
        View viewFindChildViewById;
        int i = R$id.chart;
        BreathRateChart breathRateChart = (BreathRateChart) ViewBindings.findChildViewById(view, i);
        if (breathRateChart != null) {
            i = R$id.ivClose;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView != null) {
                i = R$id.linExplanationCard;
                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                if (linearLayout != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = R$id.loading))) != null) {
                    i = R$id.tvEndTime;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                    if (textView != null) {
                        i = R$id.tvMore;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                        if (textView2 != null) {
                            i = R$id.tvRange;
                            TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                            if (textView3 != null) {
                                i = R$id.tvStartTime;
                                TextView textView4 = (TextView) ViewBindings.findChildViewById(view, i);
                                if (textView4 != null) {
                                    i = R$id.tvUnit;
                                    TextView textView5 = (TextView) ViewBindings.findChildViewById(view, i);
                                    if (textView5 != null) {
                                        return new HealthSleepActBreathRateBinding((ConstraintLayout) view, breathRateChart, imageView, linearLayout, viewFindChildViewById, textView, textView2, textView3, textView4, textView5);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static HealthSleepActBreathRateBinding c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static HealthSleepActBreathRateBinding d(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R$layout.health_sleep_act_breath_rate, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.i;
    }
}
