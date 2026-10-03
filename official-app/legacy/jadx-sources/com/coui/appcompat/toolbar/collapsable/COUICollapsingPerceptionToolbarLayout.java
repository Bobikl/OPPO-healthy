package com.coui.appcompat.toolbar.collapsable;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.COUICollapsingToolbarLayout;

/* JADX INFO: loaded from: classes13.dex */
public class COUICollapsingPerceptionToolbarLayout extends COUICollapsingToolbarLayout {
    private AppBarLayout.OnOffsetChangedListener onOffsetChangedListener;
    private OnToolbarLayoutScrollStateListener onToolbarLayoutScrollStateListener;

    public COUICollapsingPerceptionToolbarLayout(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onAttachedToWindow$0(AppBarLayout appBarLayout, int i) {
        int i2;
        if (i == 0) {
            i2 = 0;
        } else {
            i2 = Math.abs(i) >= appBarLayout.getTotalScrollRange() ? 1 : 2;
        }
        OnToolbarLayoutScrollStateListener onToolbarLayoutScrollStateListener = this.onToolbarLayoutScrollStateListener;
        if (onToolbarLayoutScrollStateListener != null) {
            onToolbarLayoutScrollStateListener.onScrollData(i, appBarLayout.getTotalScrollRange(), i2);
        }
    }

    @Override // com.google.android.material.appbar.COUICollapsingToolbarLayout, com.google.android.material.appbar.CollapsingToolbarLayout, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (getParent() instanceof AppBarLayout) {
            this.onOffsetChangedListener = new AppBarLayout.OnOffsetChangedListener() { // from class: com.oplus.aiunit.vision.jh2
                @Override // com.google.android.material.appbar.AppBarLayout.OnOffsetChangedListener, com.google.android.material.appbar.AppBarLayout.BaseOnOffsetChangedListener
                public final void onOffsetChanged(AppBarLayout appBarLayout, int i) {
                    this.a.lambda$onAttachedToWindow$0(appBarLayout, i);
                }
            };
            ((AppBarLayout) getParent()).addOnOffsetChangedListener(this.onOffsetChangedListener);
        }
    }

    @Override // com.google.android.material.appbar.COUICollapsingToolbarLayout, com.google.android.material.appbar.CollapsingToolbarLayout, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (getParent() instanceof AppBarLayout) {
            ((AppBarLayout) getParent()).removeOnOffsetChangedListener(this.onOffsetChangedListener);
        }
    }

    public void setOnToolbarLayoutScrollStateListener(OnToolbarLayoutScrollStateListener onToolbarLayoutScrollStateListener) {
        this.onToolbarLayoutScrollStateListener = onToolbarLayoutScrollStateListener;
    }

    public COUICollapsingPerceptionToolbarLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public COUICollapsingPerceptionToolbarLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
