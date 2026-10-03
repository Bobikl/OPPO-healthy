package com.heytap.health.health_archives.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.heytap.health.health_archives.R$id;
import com.heytap.health.health_archives.R$layout;

/* JADX INFO: loaded from: classes16.dex */
public final class HealthArchivesFocusIndicatorActivityBinding implements ViewBinding {

    @NonNull
    public final LinearLayout i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NonNull
    public final RecyclerView f4408j;

    @NonNull
    public final View k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NonNull
    public final AppCompatTextView f4409l;

    public HealthArchivesFocusIndicatorActivityBinding(@NonNull LinearLayout linearLayout, @NonNull RecyclerView recyclerView, @NonNull View view, @NonNull AppCompatTextView appCompatTextView) {
        this.i = linearLayout;
        this.f4408j = recyclerView;
        this.k = view;
        this.f4409l = appCompatTextView;
    }

    @NonNull
    public static HealthArchivesFocusIndicatorActivityBinding a(@NonNull View view) {
        View viewFindChildViewById;
        int i = R$id.rv_all_focus_indicator;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
        if (recyclerView != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = R$id.toolbar_focus_indicator))) != null) {
            i = R$id.tv_ai_tips;
            AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
            if (appCompatTextView != null) {
                return new HealthArchivesFocusIndicatorActivityBinding((LinearLayout) view, recyclerView, viewFindChildViewById, appCompatTextView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static HealthArchivesFocusIndicatorActivityBinding c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static HealthArchivesFocusIndicatorActivityBinding d(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R$layout.health_archives_focus_indicator_activity, viewGroup, false);
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
