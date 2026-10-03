package com.heytap.health.health_archives.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.COUIRecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.heytap.health.health_archives.R$id;
import com.heytap.health.health_archives.R$layout;

/* JADX INFO: loaded from: classes16.dex */
public final class HealthArchivesDetailTableViewBinding implements ViewBinding {

    @NonNull
    public final View i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NonNull
    public final LinearLayout f4391j;

    @NonNull
    public final AppCompatTextView k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NonNull
    public final AppCompatTextView f4392l;

    @NonNull
    public final View m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NonNull
    public final AppCompatTextView f4393n;

    @NonNull
    public final View o;

    @NonNull
    public final COUIRecyclerView p;

    @NonNull
    public final View q;

    public HealthArchivesDetailTableViewBinding(@NonNull View view, @NonNull LinearLayout linearLayout, @NonNull AppCompatTextView appCompatTextView, @NonNull AppCompatTextView appCompatTextView2, @NonNull View view2, @NonNull AppCompatTextView appCompatTextView3, @NonNull View view3, @NonNull COUIRecyclerView cOUIRecyclerView, @NonNull View view4) {
        this.i = view;
        this.f4391j = linearLayout;
        this.k = appCompatTextView;
        this.f4392l = appCompatTextView2;
        this.m = view2;
        this.f4393n = appCompatTextView3;
        this.o = view3;
        this.p = cOUIRecyclerView;
        this.q = view4;
    }

    @NonNull
    public static HealthArchivesDetailTableViewBinding a(@NonNull View view) {
        View viewFindChildViewById;
        View viewFindChildViewById2;
        View viewFindChildViewById3;
        int i = R$id.archive_table_brief_ll;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
        if (linearLayout != null) {
            i = R$id.archive_table_brief_title;
            AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
            if (appCompatTextView != null) {
                i = R$id.archive_table_brief_value;
                AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                if (appCompatTextView2 != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = R$id.end_gradient))) != null) {
                    i = R$id.record_table_name;
                    AppCompatTextView appCompatTextView3 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                    if (appCompatTextView3 != null && (viewFindChildViewById2 = ViewBindings.findChildViewById(view, (i = R$id.start_gradient))) != null) {
                        i = R$id.table_view;
                        COUIRecyclerView cOUIRecyclerView = (COUIRecyclerView) ViewBindings.findChildViewById(view, i);
                        if (cOUIRecyclerView != null && (viewFindChildViewById3 = ViewBindings.findChildViewById(view, (i = R$id.view_gap))) != null) {
                            return new HealthArchivesDetailTableViewBinding(view, linearLayout, appCompatTextView, appCompatTextView2, viewFindChildViewById, appCompatTextView3, viewFindChildViewById2, cOUIRecyclerView, viewFindChildViewById3);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static HealthArchivesDetailTableViewBinding b(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R$layout.health_archives_detail_table_view, viewGroup);
        return a(viewGroup);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.i;
    }
}
