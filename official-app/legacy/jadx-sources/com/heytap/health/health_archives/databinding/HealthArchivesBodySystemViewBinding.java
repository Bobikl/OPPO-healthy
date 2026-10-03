package com.heytap.health.health_archives.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.heytap.health.health_archives.R$id;
import com.heytap.health.health_archives.R$layout;
import com.heytap.health.health_archives.view.ArchiveBadgeTextView;

/* JADX INFO: loaded from: classes16.dex */
public final class HealthArchivesBodySystemViewBinding implements ViewBinding {

    @NonNull
    public final View i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NonNull
    public final ArchiveBadgeTextView f4388j;

    @NonNull
    public final ArchiveBadgeTextView k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NonNull
    public final ArchiveBadgeTextView f4389l;

    @NonNull
    public final ArchiveBadgeTextView m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NonNull
    public final AppCompatImageView f4390n;

    @NonNull
    public final ArchiveBadgeTextView o;

    @NonNull
    public final ArchiveBadgeTextView p;

    @NonNull
    public final ArchiveBadgeTextView q;

    @NonNull
    public final ArchiveBadgeTextView r;

    @NonNull
    public final ArchiveBadgeTextView s;

    @NonNull
    public final ArchiveBadgeTextView t;

    public HealthArchivesBodySystemViewBinding(@NonNull View view, @NonNull ArchiveBadgeTextView archiveBadgeTextView, @NonNull ArchiveBadgeTextView archiveBadgeTextView2, @NonNull ArchiveBadgeTextView archiveBadgeTextView3, @NonNull ArchiveBadgeTextView archiveBadgeTextView4, @NonNull AppCompatImageView appCompatImageView, @NonNull ArchiveBadgeTextView archiveBadgeTextView5, @NonNull ArchiveBadgeTextView archiveBadgeTextView6, @NonNull ArchiveBadgeTextView archiveBadgeTextView7, @NonNull ArchiveBadgeTextView archiveBadgeTextView8, @NonNull ArchiveBadgeTextView archiveBadgeTextView9, @NonNull ArchiveBadgeTextView archiveBadgeTextView10) {
        this.i = view;
        this.f4388j = archiveBadgeTextView;
        this.k = archiveBadgeTextView2;
        this.f4389l = archiveBadgeTextView3;
        this.m = archiveBadgeTextView4;
        this.f4390n = appCompatImageView;
        this.o = archiveBadgeTextView5;
        this.p = archiveBadgeTextView6;
        this.q = archiveBadgeTextView7;
        this.r = archiveBadgeTextView8;
        this.s = archiveBadgeTextView9;
        this.t = archiveBadgeTextView10;
    }

    @NonNull
    public static HealthArchivesBodySystemViewBinding a(@NonNull View view) {
        int i = R$id.cardiovascular_system_badge;
        ArchiveBadgeTextView archiveBadgeTextView = (ArchiveBadgeTextView) ViewBindings.findChildViewById(view, i);
        if (archiveBadgeTextView != null) {
            i = R$id.digestive_system_badge;
            ArchiveBadgeTextView archiveBadgeTextView2 = (ArchiveBadgeTextView) ViewBindings.findChildViewById(view, i);
            if (archiveBadgeTextView2 != null) {
                i = R$id.endocrine_system_badge;
                ArchiveBadgeTextView archiveBadgeTextView3 = (ArchiveBadgeTextView) ViewBindings.findChildViewById(view, i);
                if (archiveBadgeTextView3 != null) {
                    i = R$id.immune_system_badge;
                    ArchiveBadgeTextView archiveBadgeTextView4 = (ArchiveBadgeTextView) ViewBindings.findChildViewById(view, i);
                    if (archiveBadgeTextView4 != null) {
                        i = R$id.iv_body_system;
                        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                        if (appCompatImageView != null) {
                            i = R$id.musculoskeletal_system_badge;
                            ArchiveBadgeTextView archiveBadgeTextView5 = (ArchiveBadgeTextView) ViewBindings.findChildViewById(view, i);
                            if (archiveBadgeTextView5 != null) {
                                i = R$id.nervous_system_badge;
                                ArchiveBadgeTextView archiveBadgeTextView6 = (ArchiveBadgeTextView) ViewBindings.findChildViewById(view, i);
                                if (archiveBadgeTextView6 != null) {
                                    i = R$id.other_system_badge;
                                    ArchiveBadgeTextView archiveBadgeTextView7 = (ArchiveBadgeTextView) ViewBindings.findChildViewById(view, i);
                                    if (archiveBadgeTextView7 != null) {
                                        i = R$id.respiratory_system_badge;
                                        ArchiveBadgeTextView archiveBadgeTextView8 = (ArchiveBadgeTextView) ViewBindings.findChildViewById(view, i);
                                        if (archiveBadgeTextView8 != null) {
                                            i = R$id.sensory_organs_system_badge;
                                            ArchiveBadgeTextView archiveBadgeTextView9 = (ArchiveBadgeTextView) ViewBindings.findChildViewById(view, i);
                                            if (archiveBadgeTextView9 != null) {
                                                i = R$id.urogenital_system_badge;
                                                ArchiveBadgeTextView archiveBadgeTextView10 = (ArchiveBadgeTextView) ViewBindings.findChildViewById(view, i);
                                                if (archiveBadgeTextView10 != null) {
                                                    return new HealthArchivesBodySystemViewBinding(view, archiveBadgeTextView, archiveBadgeTextView2, archiveBadgeTextView3, archiveBadgeTextView4, appCompatImageView, archiveBadgeTextView5, archiveBadgeTextView6, archiveBadgeTextView7, archiveBadgeTextView8, archiveBadgeTextView9, archiveBadgeTextView10);
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
    public static HealthArchivesBodySystemViewBinding b(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R$layout.health_archives_body_system_view, viewGroup);
        return a(viewGroup);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.i;
    }
}
