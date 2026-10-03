package com.heytap.health.heartrate.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.heytap.health.base.ui.widget.HealthButton;
import com.heytap.health.heartrate.R$id;
import com.heytap.health.heartrate.R$layout;

/* JADX INFO: loaded from: classes16.dex */
public final class HealthHeartRateActivityMeasureFinishBinding implements ViewBinding {

    @NonNull
    public final TextView A;

    @NonNull
    public final TextView B;

    @NonNull
    public final TextView C;

    @NonNull
    public final ConstraintLayout i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NonNull
    public final TextView f4651j;

    @NonNull
    public final HealthButton k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f4652l;

    @NonNull
    public final ImageView m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NonNull
    public final NestedScrollView f4653n;

    @NonNull
    public final LinearLayout o;

    @NonNull
    public final LinearLayout p;

    @NonNull
    public final View q;

    @NonNull
    public final TextView r;

    @NonNull
    public final TextView s;

    @NonNull
    public final TextView t;

    @NonNull
    public final TextView u;

    @NonNull
    public final TextView v;

    @NonNull
    public final TextView w;

    @NonNull
    public final TextView x;

    @NonNull
    public final TextView y;

    @NonNull
    public final TextView z;

    public HealthHeartRateActivityMeasureFinishBinding(@NonNull ConstraintLayout constraintLayout, @NonNull TextView textView, @NonNull HealthButton healthButton, @NonNull ConstraintLayout constraintLayout2, @NonNull ImageView imageView, @NonNull NestedScrollView nestedScrollView, @NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull View view, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull TextView textView5, @NonNull TextView textView6, @NonNull TextView textView7, @NonNull TextView textView8, @NonNull TextView textView9, @NonNull TextView textView10, @NonNull TextView textView11, @NonNull TextView textView12, @NonNull TextView textView13) {
        this.i = constraintLayout;
        this.f4651j = textView;
        this.k = healthButton;
        this.f4652l = constraintLayout2;
        this.m = imageView;
        this.f4653n = nestedScrollView;
        this.o = linearLayout;
        this.p = linearLayout2;
        this.q = view;
        this.r = textView2;
        this.s = textView3;
        this.t = textView4;
        this.u = textView5;
        this.v = textView6;
        this.w = textView7;
        this.x = textView8;
        this.y = textView9;
        this.z = textView10;
        this.A = textView11;
        this.B = textView12;
        this.C = textView13;
    }

    @NonNull
    public static HealthHeartRateActivityMeasureFinishBinding a(@NonNull View view) {
        View viewFindChildViewById;
        int i = R$id.btnMeasureFinishNeg;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
        if (textView != null) {
            i = R$id.btnMeasureFinishPos;
            HealthButton healthButton = (HealthButton) ViewBindings.findChildViewById(view, i);
            if (healthButton != null) {
                i = R$id.clMeasureFinishValue;
                ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                if (constraintLayout != null) {
                    i = R$id.health_heart_rateImageview;
                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                    if (imageView != null) {
                        i = R$id.health_heart_rateNestedscrollview;
                        NestedScrollView nestedScrollView = (NestedScrollView) ViewBindings.findChildViewById(view, i);
                        if (nestedScrollView != null) {
                            i = R$id.llMeasureFinishBtn;
                            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                            if (linearLayout != null) {
                                i = R$id.llMeasureFinishDesc;
                                LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                if (linearLayout2 != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = R$id.toolbarMeasureFinish))) != null) {
                                    i = R$id.tvMeasureFinishAuthorize;
                                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                                    if (textView2 != null) {
                                        i = R$id.tvMeasureFinishError;
                                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                                        if (textView3 != null) {
                                            i = R$id.tvMeasureFinishErrorTipDesc;
                                            TextView textView4 = (TextView) ViewBindings.findChildViewById(view, i);
                                            if (textView4 != null) {
                                                i = R$id.tvMeasureFinishErrorTipTitle;
                                                TextView textView5 = (TextView) ViewBindings.findChildViewById(view, i);
                                                if (textView5 != null) {
                                                    i = R$id.tvMeasureFinishTime1;
                                                    TextView textView6 = (TextView) ViewBindings.findChildViewById(view, i);
                                                    if (textView6 != null) {
                                                        i = R$id.tvMeasureFinishTime2;
                                                        TextView textView7 = (TextView) ViewBindings.findChildViewById(view, i);
                                                        if (textView7 != null) {
                                                            i = R$id.tvMeasureFinishTipDesc1;
                                                            TextView textView8 = (TextView) ViewBindings.findChildViewById(view, i);
                                                            if (textView8 != null) {
                                                                i = R$id.tvMeasureFinishTipDesc2;
                                                                TextView textView9 = (TextView) ViewBindings.findChildViewById(view, i);
                                                                if (textView9 != null) {
                                                                    i = R$id.tvMeasureFinishTipTitle;
                                                                    TextView textView10 = (TextView) ViewBindings.findChildViewById(view, i);
                                                                    if (textView10 != null) {
                                                                        i = R$id.tvMeasureFinishTitle;
                                                                        TextView textView11 = (TextView) ViewBindings.findChildViewById(view, i);
                                                                        if (textView11 != null) {
                                                                            i = R$id.tvMeasureFinishValue;
                                                                            TextView textView12 = (TextView) ViewBindings.findChildViewById(view, i);
                                                                            if (textView12 != null) {
                                                                                i = R$id.tvMeasureFinishValueUnit;
                                                                                TextView textView13 = (TextView) ViewBindings.findChildViewById(view, i);
                                                                                if (textView13 != null) {
                                                                                    return new HealthHeartRateActivityMeasureFinishBinding((ConstraintLayout) view, textView, healthButton, constraintLayout, imageView, nestedScrollView, linearLayout, linearLayout2, viewFindChildViewById, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, textView10, textView11, textView12, textView13);
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
    public static HealthHeartRateActivityMeasureFinishBinding c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static HealthHeartRateActivityMeasureFinishBinding d(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R$layout.health_heart_rate_activity_measure_finish, viewGroup, false);
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
