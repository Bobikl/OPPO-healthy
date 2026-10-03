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
import androidx.constraintlayout.widget.Group;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.heytap.health.base.view.NoPauseInBackgroundAnimView;
import com.heytap.health.heartrate.R$id;
import com.heytap.health.heartrate.R$layout;

/* JADX INFO: loaded from: classes16.dex */
public final class HealthHeartRateActivityMeasureBinding implements ViewBinding {

    @NonNull
    public final TextView A;

    @NonNull
    public final TextView B;

    @NonNull
    public final TextView C;

    @NonNull
    public final LinearLayout i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NonNull
    public final NoPauseInBackgroundAnimView f4648j;

    @NonNull
    public final NoPauseInBackgroundAnimView k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f4649l;

    @NonNull
    public final ConstraintLayout m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NonNull
    public final Group f4650n;

    @NonNull
    public final Group o;

    @NonNull
    public final Guideline p;

    @NonNull
    public final Guideline q;

    @NonNull
    public final ImageView r;

    @NonNull
    public final ImageView s;

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

    @NonNull
    public final TextView z;

    public HealthHeartRateActivityMeasureBinding(@NonNull LinearLayout linearLayout, @NonNull NoPauseInBackgroundAnimView noPauseInBackgroundAnimView, @NonNull NoPauseInBackgroundAnimView noPauseInBackgroundAnimView2, @NonNull ConstraintLayout constraintLayout, @NonNull ConstraintLayout constraintLayout2, @NonNull Group group, @NonNull Group group2, @NonNull Guideline guideline, @NonNull Guideline guideline2, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull View view, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull TextView textView5, @NonNull TextView textView6, @NonNull TextView textView7, @NonNull TextView textView8, @NonNull TextView textView9) {
        this.i = linearLayout;
        this.f4648j = noPauseInBackgroundAnimView;
        this.k = noPauseInBackgroundAnimView2;
        this.f4649l = constraintLayout;
        this.m = constraintLayout2;
        this.f4650n = group;
        this.o = group2;
        this.p = guideline;
        this.q = guideline2;
        this.r = imageView;
        this.s = imageView2;
        this.t = view;
        this.u = textView;
        this.v = textView2;
        this.w = textView3;
        this.x = textView4;
        this.y = textView5;
        this.z = textView6;
        this.A = textView7;
        this.B = textView8;
        this.C = textView9;
    }

    @NonNull
    public static HealthHeartRateActivityMeasureBinding a(@NonNull View view) {
        View viewFindChildViewById;
        int i = R$id.animMeasure;
        NoPauseInBackgroundAnimView noPauseInBackgroundAnimView = (NoPauseInBackgroundAnimView) ViewBindings.findChildViewById(view, i);
        if (noPauseInBackgroundAnimView != null) {
            i = R$id.animMeasureReady;
            NoPauseInBackgroundAnimView noPauseInBackgroundAnimView2 = (NoPauseInBackgroundAnimView) ViewBindings.findChildViewById(view, i);
            if (noPauseInBackgroundAnimView2 != null) {
                i = R$id.clMeasureAnim;
                ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                if (constraintLayout != null) {
                    i = R$id.clMeasureDesc;
                    ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                    if (constraintLayout2 != null) {
                        i = R$id.groupMeasureReady;
                        Group group = (Group) ViewBindings.findChildViewById(view, i);
                        if (group != null) {
                            i = R$id.groupMeasuring;
                            Group group2 = (Group) ViewBindings.findChildViewById(view, i);
                            if (group2 != null) {
                                i = R$id.health_heart_rateGuideline;
                                Guideline guideline = (Guideline) ViewBindings.findChildViewById(view, i);
                                if (guideline != null) {
                                    i = R$id.health_heart_rateGuideline2;
                                    Guideline guideline2 = (Guideline) ViewBindings.findChildViewById(view, i);
                                    if (guideline2 != null) {
                                        i = R$id.ivMeasureBody;
                                        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                                        if (imageView != null) {
                                            i = R$id.ivMeasurePhone;
                                            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
                                            if (imageView2 != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = R$id.toolbarMeasure))) != null) {
                                                i = R$id.tvMeasureDesc;
                                                TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                                                if (textView != null) {
                                                    i = R$id.tvMeasureDesc1;
                                                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                                                    if (textView2 != null) {
                                                        i = R$id.tvMeasureDesc1Point;
                                                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                                                        if (textView3 != null) {
                                                            i = R$id.tvMeasureDesc2;
                                                            TextView textView4 = (TextView) ViewBindings.findChildViewById(view, i);
                                                            if (textView4 != null) {
                                                                i = R$id.tvMeasureDesc2Point;
                                                                TextView textView5 = (TextView) ViewBindings.findChildViewById(view, i);
                                                                if (textView5 != null) {
                                                                    i = R$id.tvMeasureTitle;
                                                                    TextView textView6 = (TextView) ViewBindings.findChildViewById(view, i);
                                                                    if (textView6 != null) {
                                                                        i = R$id.tvMeasureValue;
                                                                        TextView textView7 = (TextView) ViewBindings.findChildViewById(view, i);
                                                                        if (textView7 != null) {
                                                                            i = R$id.tvMeasureValueDesc;
                                                                            TextView textView8 = (TextView) ViewBindings.findChildViewById(view, i);
                                                                            if (textView8 != null) {
                                                                                i = R$id.tvMeasureValueUnit;
                                                                                TextView textView9 = (TextView) ViewBindings.findChildViewById(view, i);
                                                                                if (textView9 != null) {
                                                                                    return new HealthHeartRateActivityMeasureBinding((LinearLayout) view, noPauseInBackgroundAnimView, noPauseInBackgroundAnimView2, constraintLayout, constraintLayout2, group, group2, guideline, guideline2, imageView, imageView2, viewFindChildViewById, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9);
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
    public static HealthHeartRateActivityMeasureBinding c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static HealthHeartRateActivityMeasureBinding d(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R$layout.health_heart_rate_activity_measure, viewGroup, false);
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
