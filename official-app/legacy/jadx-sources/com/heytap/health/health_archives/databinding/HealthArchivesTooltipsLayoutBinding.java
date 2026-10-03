package com.heytap.health.health_archives.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.heytap.health.health_archives.R$id;
import com.heytap.health.health_archives.R$layout;

/* JADX INFO: loaded from: classes16.dex */
public final class HealthArchivesTooltipsLayoutBinding implements ViewBinding {

    @NonNull
    public final View i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NonNull
    public final AppCompatTextView f4447j;

    @NonNull
    public final AppCompatTextView k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NonNull
    public final AppCompatImageView f4448l;

    @NonNull
    public final AppCompatTextView m;

    public HealthArchivesTooltipsLayoutBinding(@NonNull View view, @NonNull AppCompatTextView appCompatTextView, @NonNull AppCompatTextView appCompatTextView2, @NonNull AppCompatImageView appCompatImageView, @NonNull AppCompatTextView appCompatTextView3) {
        this.i = view;
        this.f4447j = appCompatTextView;
        this.k = appCompatTextView2;
        this.f4448l = appCompatImageView;
        this.m = appCompatTextView3;
    }

    @NonNull
    public static HealthArchivesTooltipsLayoutBinding a(@NonNull View view) {
        int i = R$id.action;
        AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
        if (appCompatTextView != null) {
            i = R$id.ignore;
            AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
            if (appCompatTextView2 != null) {
                i = R$id.iv_tooltips_icon;
                AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                if (appCompatImageView != null) {
                    i = R$id.tv_tooltips_content;
                    AppCompatTextView appCompatTextView3 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                    if (appCompatTextView3 != null) {
                        return new HealthArchivesTooltipsLayoutBinding(view, appCompatTextView, appCompatTextView2, appCompatImageView, appCompatTextView3);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static HealthArchivesTooltipsLayoutBinding b(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R$layout.health_archives_tooltips_layout, viewGroup);
        return a(viewGroup);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.i;
    }
}
