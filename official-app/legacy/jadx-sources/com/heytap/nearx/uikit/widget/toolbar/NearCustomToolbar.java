package com.heytap.nearx.uikit.widget.toolbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.LayoutRes;
import androidx.annotation.Nullable;
import com.google.android.material.appbar.NearCollapsingToolbarLayout;
import com.google.android.material.appbar.OnToolbarLayoutScrollStateListener;
import com.heytap.nearx.uikit.R$attr;
import com.heytap.nearx.uikit.widget.NearToolbar;
import java.math.BigDecimal;

/* JADX INFO: loaded from: classes18.dex */
public abstract class NearCustomToolbar extends NearToolbar {
    private View customView;

    public NearCustomToolbar(Context context) {
        this(context, null);
    }

    @LayoutRes
    public abstract int getCustomResId();

    @Nullable
    public View getCustomView() {
        return this.customView;
    }

    public void init() {
        setCustomView(getCustomResId());
        if (getCustomView() == null) {
            return;
        }
        getCustomView().setVisibility(4);
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (getParent() instanceof NearCollapsingToolbarLayout) {
            ((NearCollapsingToolbarLayout) getParent()).setOnToolbarLayoutScrollStateListener(new OnToolbarLayoutScrollStateListener() { // from class: com.oplus.aiunit.vision.uhc
                @Override // com.google.android.material.appbar.OnToolbarLayoutScrollStateListener
                public final void onScrollData(int i, int i2, int i3) {
                    this.a.onScrollData(i, i2, i3);
                }
            });
        }
    }

    public void onScrollData(int i, int i2, int i3) {
        if (getCustomView() == null) {
            return;
        }
        if (i3 == 0) {
            getCustomView().setVisibility(4);
            getCustomView().setAlpha(0.0f);
        } else {
            if (i3 == 1) {
                getCustomView().setVisibility(0);
                getCustomView().setAlpha(1.0f);
                return;
            }
            if (getCustomView().getVisibility() != 0) {
                getCustomView().setVisibility(0);
            }
            float fFloatValue = new BigDecimal(Math.abs(i)).divide(new BigDecimal(i2), 2, 4).floatValue();
            if (getCustomView().getAlpha() != fFloatValue) {
                getCustomView().setAlpha(fFloatValue);
            }
        }
    }

    public void setCustomView(@LayoutRes int i) {
        if (i == 0) {
            return;
        }
        setCustomView(LayoutInflater.from(getContext()).inflate(i, (ViewGroup) this, false));
    }

    public NearCustomToolbar(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.toolbarStyle);
    }

    public void setCustomView(View view) {
        if (this.customView != null) {
            throw new RuntimeException("Repeat calls are not allowed!!");
        }
        this.customView = view;
        addView(view);
    }

    public NearCustomToolbar(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init();
    }
}
