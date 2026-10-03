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
import androidx.constraintlayout.widget.Guideline;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.heytap.health.base.ui.widget.HealthButton;
import com.heytap.health.base.view.NoPauseInBackgroundAnimView;
import com.heytap.health.heartrate.R$id;
import com.heytap.health.heartrate.R$layout;

/* JADX INFO: loaded from: classes16.dex */
public final class HealthHeartRateActivityMeasureGuideBinding implements ViewBinding {

    @NonNull
    public final ConstraintLayout i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NonNull
    public final NoPauseInBackgroundAnimView f4654j;

    @NonNull
    public final HealthButton k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f4655l;

    @NonNull
    public final ConstraintLayout m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NonNull
    public final Guideline f4656n;

    @NonNull
    public final Guideline o;

    @NonNull
    public final ImageView p;

    @NonNull
    public final ImageView q;

    @NonNull
    public final LinearLayout r;

    @NonNull
    public final NestedScrollView s;

    @NonNull
    public final View t;

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

    public HealthHeartRateActivityMeasureGuideBinding(@NonNull ConstraintLayout constraintLayout, @NonNull NoPauseInBackgroundAnimView noPauseInBackgroundAnimView, @NonNull HealthButton healthButton, @NonNull ConstraintLayout constraintLayout2, @NonNull ConstraintLayout constraintLayout3, @NonNull Guideline guideline, @NonNull Guideline guideline2, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull LinearLayout linearLayout, @NonNull NestedScrollView nestedScrollView, @NonNull View view, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull TextView textView5) {
        this.i = constraintLayout;
        this.f4654j = noPauseInBackgroundAnimView;
        this.k = healthButton;
        this.f4655l = constraintLayout2;
        this.m = constraintLayout3;
        this.f4656n = guideline;
        this.o = guideline2;
        this.p = imageView;
        this.q = imageView2;
        this.r = linearLayout;
        this.s = nestedScrollView;
        this.t = view;
        this.u = textView;
        this.v = textView2;
        this.w = textView3;
        this.x = textView4;
        this.y = textView5;
    }

    @NonNull
    public static HealthHeartRateActivityMeasureGuideBinding a(@NonNull View view) {
        View viewFindChildViewById;
        int i = R$id.animMeasureGuideReady;
        NoPauseInBackgroundAnimView noPauseInBackgroundAnimView = (NoPauseInBackgroundAnimView) ViewBindings.findChildViewById(view, i);
        if (noPauseInBackgroundAnimView != null) {
            i = R$id.btnMeasureGuide;
            HealthButton healthButton = (HealthButton) ViewBindings.findChildViewById(view, i);
            if (healthButton != null) {
                i = R$id.clMeasureGuideAnim;
                ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                if (constraintLayout != null) {
                    i = R$id.clMeasureGuideDesc;
                    ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                    if (constraintLayout2 != null) {
                        i = R$id.health_heart_rateGuideline;
                        Guideline guideline = (Guideline) ViewBindings.findChildViewById(view, i);
                        if (guideline != null) {
                            i = R$id.health_heart_rateGuideline2;
                            Guideline guideline2 = (Guideline) ViewBindings.findChildViewById(view, i);
                            if (guideline2 != null) {
                                i = R$id.ivMeasureGuideBody;
                                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                                if (imageView != null) {
                                    i = R$id.ivMeasureGuidePhone;
                                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
                                    if (imageView2 != null) {
                                        i = R$id.llMeasureGuideBtn;
                                        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                        if (linearLayout != null) {
                                            i = R$id.scrollMeasureGuide;
                                            NestedScrollView nestedScrollView = (NestedScrollView) ViewBindings.findChildViewById(view, i);
                                            if (nestedScrollView != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = R$id.toolbarMeasureGuide))) != null) {
                                                i = R$id.tvMeasureGuideDesc1;
                                                TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                                                if (textView != null) {
                                                    i = R$id.tvMeasureGuideDesc1Point;
                                                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                                                    if (textView2 != null) {
                                                        i = R$id.tvMeasureGuideDesc2;
                                                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                                                        if (textView3 != null) {
                                                            i = R$id.tvMeasureGuideDesc2Point;
                                                            TextView textView4 = (TextView) ViewBindings.findChildViewById(view, i);
                                                            if (textView4 != null) {
                                                                i = R$id.tvMeasureGuideTitle;
                                                                TextView textView5 = (TextView) ViewBindings.findChildViewById(view, i);
                                                                if (textView5 != null) {
                                                                    return new HealthHeartRateActivityMeasureGuideBinding((ConstraintLayout) view, noPauseInBackgroundAnimView, healthButton, constraintLayout, constraintLayout2, guideline, guideline2, imageView, imageView2, linearLayout, nestedScrollView, viewFindChildViewById, textView, textView2, textView3, textView4, textView5);
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
    public static HealthHeartRateActivityMeasureGuideBinding c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static HealthHeartRateActivityMeasureGuideBinding d(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R$layout.health_heart_rate_activity_measure_guide, viewGroup, false);
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
