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
import com.heytap.health.sleep.view.SnoreEnvNoiseChart;

/* JADX INFO: loaded from: classes18.dex */
public final class HealthSleepActEnvNoiseBinding implements ViewBinding {

    @NonNull
    public final ConstraintLayout i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NonNull
    public final SnoreEnvNoiseChart f5683j;

    @NonNull
    public final ImageView k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NonNull
    public final LinearLayout f5684l;

    @NonNull
    public final View m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NonNull
    public final TextView f5685n;

    @NonNull
    public final TextView o;

    @NonNull
    public final TextView p;

    @NonNull
    public final TextView q;

    @NonNull
    public final TextView r;

    @NonNull
    public final TextView s;

    public HealthSleepActEnvNoiseBinding(@NonNull ConstraintLayout constraintLayout, @NonNull SnoreEnvNoiseChart snoreEnvNoiseChart, @NonNull ImageView imageView, @NonNull LinearLayout linearLayout, @NonNull View view, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull TextView textView5, @NonNull TextView textView6) {
        this.i = constraintLayout;
        this.f5683j = snoreEnvNoiseChart;
        this.k = imageView;
        this.f5684l = linearLayout;
        this.m = view;
        this.f5685n = textView;
        this.o = textView2;
        this.p = textView3;
        this.q = textView4;
        this.r = textView5;
        this.s = textView6;
    }

    @NonNull
    public static HealthSleepActEnvNoiseBinding a(@NonNull View view) {
        View viewFindChildViewById;
        int i = R$id.chart;
        SnoreEnvNoiseChart snoreEnvNoiseChart = (SnoreEnvNoiseChart) ViewBindings.findChildViewById(view, i);
        if (snoreEnvNoiseChart != null) {
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
                                    i = R$id.tvTitleTip;
                                    TextView textView5 = (TextView) ViewBindings.findChildViewById(view, i);
                                    if (textView5 != null) {
                                        i = R$id.tvUnit;
                                        TextView textView6 = (TextView) ViewBindings.findChildViewById(view, i);
                                        if (textView6 != null) {
                                            return new HealthSleepActEnvNoiseBinding((ConstraintLayout) view, snoreEnvNoiseChart, imageView, linearLayout, viewFindChildViewById, textView, textView2, textView3, textView4, textView5, textView6);
                                        }
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
    public static HealthSleepActEnvNoiseBinding c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static HealthSleepActEnvNoiseBinding d(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R$layout.health_sleep_act_env_noise, viewGroup, false);
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
