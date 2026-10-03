package com.heytap.nearx.uikit.widget.panel;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.heytap.nearx.uikit.R$styleable;

/* JADX INFO: loaded from: classes18.dex */
public class NearIgnoreWindowInsetsFrameLayout extends FrameLayout {
    private boolean mIsIgnoreWindowInsetsBottom;
    private boolean mIsIgnoreWindowInsetsLeft;
    private boolean mIsIgnoreWindowInsetsRight;
    private boolean mIsIgnoreWindowInsetsTop;
    private int mWindowInsetsBottomOffset;
    private int mWindowInsetsLeftOffset;
    private int mWindowInsetsRightOffset;
    private int mWindowInsetsTopOffset;

    public NearIgnoreWindowInsetsFrameLayout(@NonNull Context context) {
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
        }
    }

    @Override // android.view.View
    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        setPadding(this.mIsIgnoreWindowInsetsLeft ? 0 : Math.max(0, windowInsets.getSystemWindowInsetLeft() + this.mWindowInsetsLeftOffset), this.mIsIgnoreWindowInsetsTop ? 0 : Math.max(0, windowInsets.getSystemWindowInsetTop() + this.mWindowInsetsTopOffset), this.mIsIgnoreWindowInsetsRight ? 0 : Math.max(0, windowInsets.getSystemWindowInsetRight() + this.mWindowInsetsRightOffset), this.mIsIgnoreWindowInsetsBottom ? 0 : Math.max(0, windowInsets.getSystemWindowInsetBottom() + this.mWindowInsetsBottomOffset));
        this.mWindowInsetsLeftOffset = 0;
        this.mWindowInsetsTopOffset = 0;
        this.mWindowInsetsRightOffset = 0;
        this.mWindowInsetsBottomOffset = 0;
        return windowInsets.consumeSystemWindowInsets();
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

    public NearIgnoreWindowInsetsFrameLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mIsIgnoreWindowInsetsLeft = true;
        this.mIsIgnoreWindowInsetsTop = true;
        this.mIsIgnoreWindowInsetsRight = true;
        this.mIsIgnoreWindowInsetsBottom = true;
        initAttr(attributeSet);
    }

    public NearIgnoreWindowInsetsFrameLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mIsIgnoreWindowInsetsLeft = true;
        this.mIsIgnoreWindowInsetsTop = true;
        this.mIsIgnoreWindowInsetsRight = true;
        this.mIsIgnoreWindowInsetsBottom = true;
        initAttr(attributeSet);
    }
}
