package com.heytap.health.health_archives.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.heytap.health.health_archives.R$id;
import com.heytap.health.health_archives.R$layout;

/* JADX INFO: loaded from: classes16.dex */
public final class HealthArchivesDetailTextInfoViewBinding implements ViewBinding {

    @NonNull
    public final View i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NonNull
    public final LinearLayout f4394j;

    @NonNull
    public final AppCompatTextView k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NonNull
    public final RecyclerView f4395l;

    @NonNull
    public final View m;

    public HealthArchivesDetailTextInfoViewBinding(@NonNull View view, @NonNull LinearLayout linearLayout, @NonNull AppCompatTextView appCompatTextView, @NonNull RecyclerView recyclerView, @NonNull View view2) {
        this.i = view;
        this.f4394j = linearLayout;
        this.k = appCompatTextView;
        this.f4395l = recyclerView;
        this.m = view2;
    }

    @NonNull
    public static HealthArchivesDetailTextInfoViewBinding a(@NonNull View view) {
        View viewFindChildViewById;
        int i = R$id.archive_text_info;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
        if (linearLayout != null) {
            i = R$id.record_text_title;
            AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
            if (appCompatTextView != null) {
                i = R$id.text_list_view;
                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                if (recyclerView != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = R$id.view_gap3))) != null) {
                    return new HealthArchivesDetailTextInfoViewBinding(view, linearLayout, appCompatTextView, recyclerView, viewFindChildViewById);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static HealthArchivesDetailTextInfoViewBinding b(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R$layout.health_archives_detail_text_info_view, viewGroup);
        return a(viewGroup);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.i;
    }
}
