package com.heytap.health.health_archives.databinding;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.heytap.health.health_archives.R$id;

/* JADX INFO: loaded from: classes16.dex */
public final class HealthArchivesMriIndicatorDetailViewBinding implements ViewBinding {

    @NonNull
    public final ConstraintLayout i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NonNull
    public final RecyclerView f4428j;

    public HealthArchivesMriIndicatorDetailViewBinding(@NonNull ConstraintLayout constraintLayout, @NonNull RecyclerView recyclerView) {
        this.i = constraintLayout;
        this.f4428j = recyclerView;
    }

    @NonNull
    public static HealthArchivesMriIndicatorDetailViewBinding a(@NonNull View view) {
        int i = R$id.rv_mri_indicator;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
        if (recyclerView != null) {
            return new HealthArchivesMriIndicatorDetailViewBinding((ConstraintLayout) view, recyclerView);
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
