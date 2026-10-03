package com.heytap.health.health_archives.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.coui.appcompat.progressbar.COUICircularProgressBar;
import com.heytap.health.health_archives.R$id;
import com.heytap.health.health_archives.R$layout;
import com.heytap.health.health_archives.view.DotLoadingView;

/* JADX INFO: loaded from: classes16.dex */
public final class HealthArchivesSyncingStatusViewBinding implements ViewBinding {

    @NonNull
    public final View i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NonNull
    public final DotLoadingView f4445j;

    @NonNull
    public final AppCompatImageView k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NonNull
    public final COUICircularProgressBar f4446l;

    public HealthArchivesSyncingStatusViewBinding(@NonNull View view, @NonNull DotLoadingView dotLoadingView, @NonNull AppCompatImageView appCompatImageView, @NonNull COUICircularProgressBar cOUICircularProgressBar) {
        this.i = view;
        this.f4445j = dotLoadingView;
        this.k = appCompatImageView;
        this.f4446l = cOUICircularProgressBar;
    }

    @NonNull
    public static HealthArchivesSyncingStatusViewBinding a(@NonNull View view) {
        int i = R$id.dot_loading_view;
        DotLoadingView dotLoadingView = (DotLoadingView) ViewBindings.findChildViewById(view, i);
        if (dotLoadingView != null) {
            i = R$id.iv_syncing_upload;
            AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
            if (appCompatImageView != null) {
                i = R$id.syncing_progress_bar;
                COUICircularProgressBar cOUICircularProgressBar = (COUICircularProgressBar) ViewBindings.findChildViewById(view, i);
                if (cOUICircularProgressBar != null) {
                    return new HealthArchivesSyncingStatusViewBinding(view, dotLoadingView, appCompatImageView, cOUICircularProgressBar);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static HealthArchivesSyncingStatusViewBinding b(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R$layout.health_archives_syncing_status_view, viewGroup);
        return a(viewGroup);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.i;
    }
}
