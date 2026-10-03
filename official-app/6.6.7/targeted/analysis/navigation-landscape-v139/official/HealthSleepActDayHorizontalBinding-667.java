package com.heytap.health.sleep.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.coui.appcompat.toolbar.COUIToolbar;
import com.heytap.health.core.widget.charts.SleepCombinedChart;
import com.heytap.health.sleep.R$id;
import com.heytap.health.sleep.R$layout;

/* JADX INFO: loaded from: classes18.dex */
public final class HealthSleepActDayHorizontalBinding implements ViewBinding {

    @NonNull
    public final ConstraintLayout i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NonNull
    public final TextView f6702j;

    @NonNull
    public final View k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NonNull
    public final TextView f6703l;

    @NonNull
    public final COUIToolbar m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NonNull
    public final TextView f6704n;

    @NonNull
    public final ConstraintLayout o;

    @NonNull
    public final View p;

    @NonNull
    public final TextView q;

    @NonNull
    public final ConstraintLayout r;

    @NonNull
    public final SleepCombinedChart s;

    @NonNull
    public final TextView t;

    @NonNull
    public final TextView u;

    @NonNull
    public final TextView v;

    @NonNull
    public final TextView w;

    public HealthSleepActDayHorizontalBinding(@NonNull ConstraintLayout constraintLayout, @NonNull TextView textView, @NonNull View view, @NonNull TextView textView2, @NonNull COUIToolbar cOUIToolbar, @NonNull TextView textView3, @NonNull ConstraintLayout constraintLayout2, @NonNull View view2, @NonNull TextView textView4, @NonNull ConstraintLayout constraintLayout3, @NonNull SleepCombinedChart sleepCombinedChart, @NonNull TextView textView5, @NonNull TextView textView6, @NonNull TextView textView7, @NonNull TextView textView8) {
        this.i = constraintLayout;
        this.f6702j = textView;
        this.k = view;
        this.f6703l = textView2;
        this.m = cOUIToolbar;
        this.f6704n = textView3;
        this.o = constraintLayout2;
        this.p = view2;
        this.q = textView4;
        this.r = constraintLayout3;
        this.s = sleepCombinedChart;
        this.t = textView5;
        this.u = textView6;
        this.v = textView7;
        this.w = textView8;
    }

    @NonNull
    public static HealthSleepActDayHorizontalBinding a(@NonNull View view) {
        View viewFindChildViewById;
        View viewFindChildViewById2;
        int i = R$id.deepSleep;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
        if (textView != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = R$id.endView))) != null) {
            i = R$id.heartRate;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
            if (textView2 != null) {
                i = R$id.lib_base_toolbar;
                COUIToolbar cOUIToolbar = (COUIToolbar) ViewBindings.findChildViewById(view, i);
                if (cOUIToolbar != null) {
                    i = R$id.lightSleep;
                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                    if (textView3 != null) {
                        i = R$id.linButton;
                        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                        if (constraintLayout != null && (viewFindChildViewById2 = ViewBindings.findChildViewById(view, (i = R$id.rank_loading_layout))) != null) {
                            i = R$id.remSleep;
                            TextView textView4 = (TextView) ViewBindings.findChildViewById(view, i);
                            if (textView4 != null) {
                                ConstraintLayout constraintLayout2 = (ConstraintLayout) view;
                                i = R$id.sleepCombinedChart;
                                SleepCombinedChart sleepCombinedChart = (SleepCombinedChart) ViewBindings.findChildViewById(view, i);
                                if (sleepCombinedChart != null) {
                                    i = R$id.spo2;
                                    TextView textView5 = (TextView) ViewBindings.findChildViewById(view, i);
                                    if (textView5 != null) {
                                        i = R$id.tv_sleep_time;
                                        TextView textView6 = (TextView) ViewBindings.findChildViewById(view, i);
                                        if (textView6 != null) {
                                            i = R$id.tv_sleep_title;
                                            TextView textView7 = (TextView) ViewBindings.findChildViewById(view, i);
                                            if (textView7 != null) {
                                                i = R$id.wakeSleep;
                                                TextView textView8 = (TextView) ViewBindings.findChildViewById(view, i);
                                                if (textView8 != null) {
                                                    return new HealthSleepActDayHorizontalBinding(constraintLayout2, textView, viewFindChildViewById, textView2, cOUIToolbar, textView3, constraintLayout, viewFindChildViewById2, textView4, constraintLayout2, sleepCombinedChart, textView5, textView6, textView7, textView8);
                                                }
                                            }
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
    public static HealthSleepActDayHorizontalBinding c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static HealthSleepActDayHorizontalBinding d(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R$layout.health_sleep_act_day_horizontal, viewGroup, false);
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