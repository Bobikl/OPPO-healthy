package com.heytap.health.health_archives.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.coui.appcompat.button.COUIButton;
import com.coui.appcompat.reddot.COUIHintRedDot;
import com.heytap.health.health_archives.R$id;
import com.heytap.health.health_archives.R$layout;

/* JADX INFO: loaded from: classes16.dex */
public final class HealthArchivesOwnersViewBinding implements ViewBinding {

    @NonNull
    public final View i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NonNull
    public final COUIHintRedDot f4429j;

    @NonNull
    public final COUIButton k;

    public HealthArchivesOwnersViewBinding(@NonNull View view, @NonNull COUIHintRedDot cOUIHintRedDot, @NonNull COUIButton cOUIButton) {
        this.i = view;
        this.f4429j = cOUIHintRedDot;
        this.k = cOUIButton;
    }

    @NonNull
    public static HealthArchivesOwnersViewBinding a(@NonNull View view) {
        int i = R$id.red_dot_owner;
        COUIHintRedDot cOUIHintRedDot = (COUIHintRedDot) ViewBindings.findChildViewById(view, i);
        if (cOUIHintRedDot != null) {
            i = R$id.tv_owner;
            COUIButton cOUIButton = (COUIButton) ViewBindings.findChildViewById(view, i);
            if (cOUIButton != null) {
                return new HealthArchivesOwnersViewBinding(view, cOUIHintRedDot, cOUIButton);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static HealthArchivesOwnersViewBinding b(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R$layout.health_archives_owners_view, viewGroup);
        return a(viewGroup);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.i;
    }
}
