package com.heytap.nearx.uikit.provider;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.view.ActionProvider;
import com.heytap.nearx.uikit.R$id;
import com.heytap.nearx.uikit.R$layout;
import com.heytap.nearx.uikit.widget.NearHintRedDot;

/* JADX INFO: loaded from: classes18.dex */
public class NearActionProvider extends ActionProvider {
    public AppCompatImageView a;
    public NearHintRedDot b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public FrameLayout f7537c;

    @Override // androidx.core.view.ActionProvider
    public View onCreateActionView() {
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        View viewInflate = LayoutInflater.from(getContext()).inflate(R$layout.nx_action_provider_layout, (ViewGroup) null, false);
        viewInflate.setLayoutParams(layoutParams);
        this.a = (AppCompatImageView) viewInflate.findViewById(R$id.nx_icon);
        this.b = (NearHintRedDot) viewInflate.findViewById(R$id.nx_red_dot);
        this.f7537c = (FrameLayout) viewInflate.findViewById(R$id.nx_icon_container);
        return viewInflate;
    }

    public void setOnMenuItemClickListener(View.OnClickListener onClickListener) {
        if (onClickListener != null) {
            this.f7537c.setOnClickListener(onClickListener);
        }
    }
}
