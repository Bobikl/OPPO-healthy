package com.heytap.health.health_archives.databinding;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.heytap.health.health_archives.R$id;

/* JADX INFO: loaded from: classes16.dex */
public final class HealthArchivesRemindViewBinding implements ViewBinding {

    @NonNull
    public final ConstraintLayout i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f4430j;

    @NonNull
    public final AppCompatTextView k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NonNull
    public final AppCompatTextView f4431l;

    @NonNull
    public final LinearLayout m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NonNull
    public final ImageView f4432n;

    @NonNull
    public final ImageView o;

    @NonNull
    public final AppCompatTextView p;

    public HealthArchivesRemindViewBinding(@NonNull ConstraintLayout constraintLayout, @NonNull ConstraintLayout constraintLayout2, @NonNull AppCompatTextView appCompatTextView, @NonNull AppCompatTextView appCompatTextView2, @NonNull LinearLayout linearLayout, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull AppCompatTextView appCompatTextView3) {
        this.i = constraintLayout;
        this.f4430j = constraintLayout2;
        this.k = appCompatTextView;
        this.f4431l = appCompatTextView2;
        this.m = linearLayout;
        this.f4432n = imageView;
        this.o = imageView2;
        this.p = appCompatTextView3;
    }

    @NonNull
    public static HealthArchivesRemindViewBinding a(@NonNull View view) {
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        int i = R$id.health_archives_remind_title;
        AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
        if (appCompatTextView != null) {
            i = R$id.health_archives_tip_check;
            AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
            if (appCompatTextView2 != null) {
                i = R$id.health_archives_tip_check_ll;
                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                if (linearLayout != null) {
                    i = R$id.health_archives_tip_guide_iv;
                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                    if (imageView != null) {
                        i = R$id.health_archives_tip_time_im;
                        ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
                        if (imageView2 != null) {
                            i = R$id.health_archives_tip_time_tv;
                            AppCompatTextView appCompatTextView3 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                            if (appCompatTextView3 != null) {
                                return new HealthArchivesRemindViewBinding(constraintLayout, constraintLayout, appCompatTextView, appCompatTextView2, linearLayout, imageView, imageView2, appCompatTextView3);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.i;
    }
}
