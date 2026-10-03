package com.heytap.health.health_archives.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.coui.appcompat.reddot.COUIHintRedDot;
import com.heytap.health.health_archives.R$id;
import com.heytap.health.health_archives.R$layout;

/* JADX INFO: loaded from: classes16.dex */
public final class HealthArchivesBadgeTextLayoutBinding implements ViewBinding {

    @NonNull
    public final View i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NonNull
    public final COUIHintRedDot f4387j;

    @NonNull
    public final AppCompatTextView k;

    public HealthArchivesBadgeTextLayoutBinding(@NonNull View view, @NonNull COUIHintRedDot cOUIHintRedDot, @NonNull AppCompatTextView appCompatTextView) {
        this.i = view;
        this.f4387j = cOUIHintRedDot;
        this.k = appCompatTextView;
    }

    @NonNull
    public static HealthArchivesBadgeTextLayoutBinding a(@NonNull View view) {
        int i = R$id.dot_nervous_system;
        COUIHintRedDot cOUIHintRedDot = (COUIHintRedDot) ViewBindings.findChildViewById(view, i);
        if (cOUIHintRedDot != null) {
            i = R$id.tv_system;
            AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
            if (appCompatTextView != null) {
                return new HealthArchivesBadgeTextLayoutBinding(view, cOUIHintRedDot, appCompatTextView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static HealthArchivesBadgeTextLayoutBinding b(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R$layout.health_archives_badge_text_layout, viewGroup);
        return a(viewGroup);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.i;
    }
}
