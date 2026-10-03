package com.heytap.nearx.uikit.widget.panel;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Outline;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.heytap.nearx.uikit.R$dimen;
import com.heytap.nearx.uikit.R$styleable;
import com.heytap.nearx.uikit.widget.grid.NearPercentWidthFrameLayout;

/* JADX INFO: loaded from: classes18.dex */
public class NearPanelPercentFrameLayout extends NearPercentWidthFrameLayout {
    private int mMaxHeight;
    public int mPercentWidthResourceId;
    private float mRatio;

    public NearPanelPercentFrameLayout(@NonNull Context context) {
        this(context, null);
    }

    private void initAttr(AttributeSet attributeSet) {
        if (getContext() != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.NearPanelPercentFrameLayout);
            this.mMaxHeight = typedArrayObtainStyledAttributes.getDimensionPixelOffset(R$styleable.NearPanelPercentFrameLayout_maxPanelHeight, 0);
            typedArrayObtainStyledAttributes.recycle();
        }
        this.mRatio = NearPanelMultiWindowUtils.isSmallScreen(getContext(), null) ? 1.0f : 2.0f;
    }

    public float getRatio() {
        return this.mRatio;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.mRatio = NearPanelMultiWindowUtils.isSmallScreen(getContext(), null) ? 1.0f : 2.0f;
        setOutlineProvider(new ViewOutlineProvider() { // from class: com.heytap.nearx.uikit.widget.panel.NearPanelPercentFrameLayout.1
            @Override // android.view.ViewOutlineProvider
            public void getOutline(View view, Outline outline) {
                outline.setRoundRect(0, 0, view.getWidth(), view.getHeight() + NearPanelPercentFrameLayout.this.getContext().getResources().getDimensionPixelOffset(R$dimen.nx_bottom_sheet_bg_bottom_corner_radius), NearPanelPercentFrameLayout.this.getContext().getResources().getDimensionPixelOffset(R$dimen.nx_bottom_sheet_bg_top_corner_radius));
            }
        });
        setClipToOutline(true);
    }

    @Override // com.heytap.nearx.uikit.widget.grid.NearPercentWidthFrameLayout, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        Rect rect = new Rect();
        getWindowVisibleDisplayFrame(rect);
        int iHeight = rect.height();
        int i3 = this.mMaxHeight;
        if (iHeight > i3 && i3 > 0 && i3 < View.MeasureSpec.getSize(i2)) {
            i2 = View.MeasureSpec.makeMeasureSpec(this.mMaxHeight, View.MeasureSpec.getMode(i2));
        }
        setPercentIndentEnabled(!(!NearPanelMultiWindowUtils.isSmallScreen(getContext(), null) && View.MeasureSpec.getSize(i) < rect.width()));
        super.onMeasure(i, i2);
    }

    public void updateLayoutWhileConfigChange(Configuration configuration) {
        this.mRatio = NearPanelMultiWindowUtils.isSmallScreen(getContext(), configuration) ? 1.0f : 2.0f;
    }

    public NearPanelPercentFrameLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NearPanelPercentFrameLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mRatio = 1.0f;
        initAttr(attributeSet);
    }
}
