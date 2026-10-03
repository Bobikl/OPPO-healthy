package com.heytap.health.health_archives.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.heytap.health.health_archives.R$id;
import com.heytap.health.health_archives.R$layout;

/* JADX INFO: loaded from: classes16.dex */
public final class HealthArchivesReviewPlanTipViewBinding implements ViewBinding {

    @NonNull
    public final View i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NonNull
    public final AppCompatTextView f4433j;

    @NonNull
    public final ConstraintLayout k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NonNull
    public final AppCompatTextView f4434l;

    @NonNull
    public final View m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NonNull
    public final AppCompatTextView f4435n;

    @NonNull
    public final AppCompatTextView o;

    @NonNull
    public final ImageView p;

    @NonNull
    public final AppCompatTextView q;

    public HealthArchivesReviewPlanTipViewBinding(@NonNull View view, @NonNull AppCompatTextView appCompatTextView, @NonNull ConstraintLayout constraintLayout, @NonNull AppCompatTextView appCompatTextView2, @NonNull View view2, @NonNull AppCompatTextView appCompatTextView3, @NonNull AppCompatTextView appCompatTextView4, @NonNull ImageView imageView, @NonNull AppCompatTextView appCompatTextView5) {
        this.i = view;
        this.f4433j = appCompatTextView;
        this.k = constraintLayout;
        this.f4434l = appCompatTextView2;
        this.m = view2;
        this.f4435n = appCompatTextView3;
        this.o = appCompatTextView4;
        this.p = imageView;
        this.q = appCompatTextView5;
    }

    @NonNull
    public static HealthArchivesReviewPlanTipViewBinding a(@NonNull View view) {
        View viewFindChildViewById;
        int i = R$id.add_review_plan_tips_content;
        AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
        if (appCompatTextView != null) {
            i = R$id.add_review_plan_tips_ll;
            ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
            if (constraintLayout != null) {
                i = R$id.add_review_plan_tips_title;
                AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                if (appCompatTextView2 != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = R$id.health_archives_review_plan_tips_divider))) != null) {
                    i = R$id.review_plan_tips_action;
                    AppCompatTextView appCompatTextView3 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                    if (appCompatTextView3 != null) {
                        i = R$id.review_plan_tips_add;
                        AppCompatTextView appCompatTextView4 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                        if (appCompatTextView4 != null) {
                            i = R$id.review_plan_tips_icon;
                            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                            if (imageView != null) {
                                i = R$id.review_plan_tips_ignore;
                                AppCompatTextView appCompatTextView5 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                if (appCompatTextView5 != null) {
                                    return new HealthArchivesReviewPlanTipViewBinding(view, appCompatTextView, constraintLayout, appCompatTextView2, viewFindChildViewById, appCompatTextView3, appCompatTextView4, imageView, appCompatTextView5);
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
    public static HealthArchivesReviewPlanTipViewBinding b(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R$layout.health_archives_review_plan_tip_view, viewGroup);
        return a(viewGroup);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.i;
    }
}
