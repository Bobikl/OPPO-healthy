package com.heytap.nearx.uikit.widget.grid;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.IntegerRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.heytap.nearx.uikit.R$styleable;

/* JADX INFO: loaded from: classes18.dex */
public class NearPercentWidthFrameLayout extends FrameLayout {
    private static final int PADDING_MODE = 0;
    private static final int REMEASURE_MODE = 1;
    private int mFlag;
    private int mInitPaddingEnd;
    private int mInitPaddingStart;
    private boolean mIsUnder;
    public int mMode;
    private boolean mPercentEnabled;
    public int mPercentWidthResourceId;

    public NearPercentWidthFrameLayout(@NonNull Context context) {
        this(context, null);
    }

    private void initAttr(AttributeSet attributeSet) {
        if (getContext() != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.UiKitPercentWidthFrameLayout);
            this.mPercentWidthResourceId = typedArrayObtainStyledAttributes.getResourceId(R$styleable.UiKitPercentWidthFrameLayout_gridNumber, 0);
            this.mFlag = typedArrayObtainStyledAttributes.getInteger(R$styleable.UiKitPercentWidthFrameLayout_specialFlag, 0);
            this.mPercentEnabled = typedArrayObtainStyledAttributes.getBoolean(R$styleable.UiKitPercentWidthFrameLayout_percentIndentEnabled, true);
            this.mMode = typedArrayObtainStyledAttributes.getInt(R$styleable.UiKitPercentWidthFrameLayout_upwfpercentMode, 0);
            this.mIsUnder = typedArrayObtainStyledAttributes.getBoolean(R$styleable.UiKitPercentWidthFrameLayout_underParent, false);
            this.mInitPaddingStart = getPaddingStart();
            this.mInitPaddingEnd = getPaddingEnd();
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public int getFlag() {
        return this.mFlag;
    }

    public int getPercentWidthResourceId() {
        return this.mPercentWidthResourceId;
    }

    public void measureUnderParent(boolean z) {
        this.mIsUnder = z;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        if (this.mPercentEnabled) {
            Rect rect = new Rect();
            getWindowVisibleDisplayFrame(rect);
            int i3 = 0;
            int integer = this.mPercentWidthResourceId > 0 ? getResources().getInteger(this.mPercentWidthResourceId) : 0;
            if (integer <= 0 || rect.width() <= 0 || View.MeasureSpec.getSize(i) > rect.width()) {
                if (this.mMode == 0) {
                    while (i3 < getChildCount()) {
                        getChildAt(i3).setPadding(this.mInitPaddingStart, getChildAt(i3).getPaddingTop(), this.mInitPaddingEnd, getChildAt(i3).getPaddingBottom());
                        i3++;
                    }
                }
            } else if (this.mMode == 1) {
                int iCalculateWidth = (int) NearPercentUtils.calculateWidth(rect.width(), integer, NearPercentUtils.getTotalGridSize(getContext()), this.mFlag, getContext());
                if (this.mIsUnder) {
                    int mode = View.MeasureSpec.getMode(i);
                    int size = View.MeasureSpec.getSize(i);
                    if (size > 0 && (mode == 1073741824 || mode == Integer.MIN_VALUE)) {
                        iCalculateWidth = Math.min(iCalculateWidth, size);
                    }
                }
                i = View.MeasureSpec.makeMeasureSpec(iCalculateWidth, 1073741824);
            } else {
                int iWidth = (rect.width() - ((int) NearPercentUtils.calculateWidth(rect.width(), integer, NearPercentUtils.getTotalGridSize(getContext()), this.mFlag, getContext()))) / 2;
                while (i3 < getChildCount()) {
                    getChildAt(i3).setPadding(iWidth, getChildAt(i3).getPaddingTop(), iWidth, getChildAt(i3).getPaddingBottom());
                    i3++;
                }
            }
        }
        super.onMeasure(i, i2);
    }

    public void setFlag(int i) {
        this.mFlag = i;
    }

    public void setPercentIndentEnabled(boolean z) {
        this.mPercentEnabled = z;
        requestLayout();
    }

    public void setPercentWidthResourceId(@IntegerRes int i) {
        this.mPercentWidthResourceId = i;
    }

    public NearPercentWidthFrameLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NearPercentWidthFrameLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mMode = 0;
        this.mPercentEnabled = true;
        this.mIsUnder = false;
        initAttr(attributeSet);
    }
}
