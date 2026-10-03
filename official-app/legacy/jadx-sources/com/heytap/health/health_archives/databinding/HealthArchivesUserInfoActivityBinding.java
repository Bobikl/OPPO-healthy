package com.heytap.health.health_archives.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.heytap.health.health_archives.R$id;
import com.heytap.health.health_archives.R$layout;

/* JADX INFO: loaded from: classes16.dex */
public final class HealthArchivesUserInfoActivityBinding implements ViewBinding {

    @NonNull
    public final LinearLayout i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NonNull
    public final FrameLayout f4452j;

    @NonNull
    public final NestedScrollView k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NonNull
    public final FrameLayout f4453l;

    public HealthArchivesUserInfoActivityBinding(@NonNull LinearLayout linearLayout, @NonNull FrameLayout frameLayout, @NonNull NestedScrollView nestedScrollView, @NonNull FrameLayout frameLayout2) {
        this.i = linearLayout;
        this.f4452j = frameLayout;
        this.k = nestedScrollView;
        this.f4453l = frameLayout2;
    }

    @NonNull
    public static HealthArchivesUserInfoActivityBinding a(@NonNull View view) {
        int i = R$id.health_tags;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
        if (frameLayout != null) {
            i = R$id.scroll_view;
            NestedScrollView nestedScrollView = (NestedScrollView) ViewBindings.findChildViewById(view, i);
            if (nestedScrollView != null) {
                i = R$id.user_info;
                FrameLayout frameLayout2 = (FrameLayout) ViewBindings.findChildViewById(view, i);
                if (frameLayout2 != null) {
                    return new HealthArchivesUserInfoActivityBinding((LinearLayout) view, frameLayout, nestedScrollView, frameLayout2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static HealthArchivesUserInfoActivityBinding c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static HealthArchivesUserInfoActivityBinding d(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R$layout.health_archives_user_info_activity, viewGroup, false);
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
