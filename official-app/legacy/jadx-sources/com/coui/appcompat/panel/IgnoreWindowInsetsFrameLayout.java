package com.coui.appcompat.panel;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.support.panel.R$styleable;

/* JADX INFO: loaded from: classes13.dex */
public class IgnoreWindowInsetsFrameLayout extends FrameLayout {
    private boolean mCouiPanelEdgeToEdgeEnable;
    private boolean mIsIgnoreWindowInsetsBottom;
    private boolean mIsIgnoreWindowInsetsLeft;
    private boolean mIsIgnoreWindowInsetsRight;
    private boolean mIsIgnoreWindowInsetsTop;
    private int mWindowInsetsBottomOffset;
    private int mWindowInsetsLeftOffset;
    private int mWindowInsetsRightOffset;
    private int mWindowInsetsTopOffset;

    public IgnoreWindowInsetsFrameLayout(@NonNull Context context) {
        super(context);
        this.mIsIgnoreWindowInsetsLeft = true;
        this.mIsIgnoreWindowInsetsTop = true;
        this.mIsIgnoreWindowInsetsRight = true;
        this.mIsIgnoreWindowInsetsBottom = true;
    }

    private void initAttr(AttributeSet attributeSet) {
        if (getContext() != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.IgnoreWindowInsetsFrameLayout);
            this.mIsIgnoreWindowInsetsLeft = typedArrayObtainStyledAttributes.getBoolean(R$styleable.IgnoreWindowInsetsFrameLayout_ignoreWindowInsetsLeft, true);
            this.mIsIgnoreWindowInsetsTop = typedArrayObtainStyledAttributes.getBoolean(R$styleable.IgnoreWindowInsetsFrameLayout_ignoreWindowInsetsTop, true);
            this.mIsIgnoreWindowInsetsRight = typedArrayObtainStyledAttributes.getBoolean(R$styleable.IgnoreWindowInsetsFrameLayout_ignoreWindowInsetsRight, true);
            this.mIsIgnoreWindowInsetsBottom = typedArrayObtainStyledAttributes.getBoolean(R$styleable.IgnoreWindowInsetsFrameLayout_ignoreWindowInsetsBottom, true);
            typedArrayObtainStyledAttributes.recycle();
            if (Build.VERSION.SDK_INT < 30 || COUINavigationBarUtil.isGestureNavigation(getContext())) {
                return;
            }
            this.mIsIgnoreWindowInsetsBottom = false;
            setFitsSystemWindows(false);
            setClipToPadding(true);
        }
    }

    @Override // android.view.View
    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        int iMax;
        int systemWindowInsetBottom = Build.VERSION.SDK_INT >= 30 ? windowInsets.getInsets(WindowInsets.Type.navigationBars()).bottom : windowInsets.getSystemWindowInsetBottom();
        int iMax2 = this.mIsIgnoreWindowInsetsLeft ? 0 : Math.max(0, windowInsets.getSystemWindowInsetLeft() + this.mWindowInsetsLeftOffset);
        int iMax3 = this.mIsIgnoreWindowInsetsTop ? 0 : Math.max(0, windowInsets.getSystemWindowInsetTop() + this.mWindowInsetsTopOffset);
        int iMax4 = this.mIsIgnoreWindowInsetsRight ? 0 : Math.max(0, windowInsets.getSystemWindowInsetRight() + this.mWindowInsetsRightOffset);
        if (this.mIsIgnoreWindowInsetsBottom) {
            iMax = 0;
        } else {
            if (this.mCouiPanelEdgeToEdgeEnable) {
                systemWindowInsetBottom = 0;
            }
            iMax = Math.max(0, systemWindowInsetBottom + this.mWindowInsetsBottomOffset);
        }
        setPadding(iMax2, iMax3, iMax4, iMax);
        this.mWindowInsetsLeftOffset = 0;
        this.mWindowInsetsTopOffset = 0;
        this.mWindowInsetsRightOffset = 0;
        this.mWindowInsetsBottomOffset = 0;
        return windowInsets.consumeSystemWindowInsets();
    }

    public void setCouiPanelEdgeToEdgeEnable(boolean z) {
        this.mCouiPanelEdgeToEdgeEnable = z;
    }

    public void setIgnoreWindowInsetsBottom(boolean z) {
        this.mIsIgnoreWindowInsetsBottom = z;
    }

    public void setIgnoreWindowInsetsLeft(boolean z) {
        this.mIsIgnoreWindowInsetsLeft = z;
    }

    public void setIgnoreWindowInsetsRight(boolean z) {
        this.mIsIgnoreWindowInsetsRight = z;
    }

    public void setIgnoreWindowInsetsTop(boolean z) {
        this.mIsIgnoreWindowInsetsTop = z;
    }

    public void setWindowInsetsBottomOffset(int i) {
        this.mWindowInsetsBottomOffset = i;
    }

    public void setWindowInsetsLeftOffset(int i) {
        this.mWindowInsetsLeftOffset = i;
    }

    public void setWindowInsetsRightOffset(int i) {
        this.mWindowInsetsRightOffset = i;
    }

    public void setWindowInsetsTopOffset(int i) {
        this.mWindowInsetsTopOffset = i;
    }

    public IgnoreWindowInsetsFrameLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mIsIgnoreWindowInsetsLeft = true;
        this.mIsIgnoreWindowInsetsTop = true;
        this.mIsIgnoreWindowInsetsRight = true;
        this.mIsIgnoreWindowInsetsBottom = true;
        initAttr(attributeSet);
    }

    public IgnoreWindowInsetsFrameLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mIsIgnoreWindowInsetsLeft = true;
        this.mIsIgnoreWindowInsetsTop = true;
        this.mIsIgnoreWindowInsetsRight = true;
        this.mIsIgnoreWindowInsetsBottom = true;
        initAttr(attributeSet);
    }
}
