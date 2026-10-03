package com.heytap.health.health_archives.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.heytap.health.health_archives.R$id;
import com.heytap.health.health_archives.R$layout;

/* JADX INFO: loaded from: classes16.dex */
public final class HealthArchivesViewFilterBinding implements ViewBinding {

    @NonNull
    public final View i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NonNull
    public final RecyclerView f4454j;

    @NonNull
    public final AppCompatTextView k;

    public HealthArchivesViewFilterBinding(@NonNull View view, @NonNull RecyclerView recyclerView, @NonNull AppCompatTextView appCompatTextView) {
        this.i = view;
        this.f4454j = recyclerView;
        this.k = appCompatTextView;
    }

    @NonNull
    public static HealthArchivesViewFilterBinding a(@NonNull View view) {
        int i = R$id.filter_content_list;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
        if (recyclerView != null) {
            i = R$id.filter_title;
            AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
            if (appCompatTextView != null) {
                return new HealthArchivesViewFilterBinding(view, recyclerView, appCompatTextView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static HealthArchivesViewFilterBinding b(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R$layout.health_archives_view_filter, viewGroup);
        return a(viewGroup);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.i;
    }
}
