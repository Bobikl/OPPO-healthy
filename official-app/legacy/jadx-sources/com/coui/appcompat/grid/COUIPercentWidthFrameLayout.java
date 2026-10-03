package com.coui.appcompat.grid;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.support.grid.R$integer;
import com.support.grid.R$styleable;

/* JADX INFO: loaded from: classes13.dex */
public class COUIPercentWidthFrameLayout extends FrameLayout {
    private static final int CARD_LIST_FLAG = 2;
    private static final int DEFAULT_FLAG = 0;
    private static final int LARGE_PADDING = 0;
    private static final int LIST_FLAG = 1;
    private static final int PADDING_MODE = 0;
    private static final int REMEASURE_MODE = 1;
    private static final int SMALL_PADDING = 1;
    protected int mGridNumber;
    private int mGridNumberResourceId;
    private int mInitPaddingEnd;
    private int mInitPaddingStart;
    private boolean mIsActivityEmbedded;
    private boolean mIsParentChildHierarchy;
    public int mMode;
    protected int mPaddingSize;
    protected int mPaddingType;
    private boolean mPercentEnabled;
    private int mScreenPhysicalWidth;

    public COUIPercentWidthFrameLayout(@NonNull Context context) {
        this(context, null);
    }

    private void initAttr(AttributeSet attributeSet) {
        if (getContext() != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.COUIPercentWidthFrameLayout);
            int i = R$styleable.COUIPercentWidthFrameLayout_gridNumber;
            this.mGridNumberResourceId = typedArrayObtainStyledAttributes.getResourceId(i, 0);
            this.mGridNumber = typedArrayObtainStyledAttributes.getInteger(i, getContext().getResources().getInteger(R$integer.grid_guide_column_preference));
            this.mPaddingType = typedArrayObtainStyledAttributes.getInteger(R$styleable.COUIPercentWidthFrameLayout_paddingType, 0);
            this.mPaddingSize = typedArrayObtainStyledAttributes.getInteger(R$styleable.COUIPercentWidthFrameLayout_paddingSize, 0);
            this.mPercentEnabled = typedArrayObtainStyledAttributes.getBoolean(R$styleable.COUIPercentWidthFrameLayout_percentIndentEnabled, true);
            this.mMode = typedArrayObtainStyledAttributes.getInt(R$styleable.COUIPercentWidthFrameLayout_percentMode, 0);
            this.mIsParentChildHierarchy = typedArrayObtainStyledAttributes.getBoolean(R$styleable.COUIPercentWidthFrameLayout_isParentChildHierarchy, false);
            this.mInitPaddingStart = getPaddingStart();
            this.mInitPaddingEnd = getPaddingEnd();
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    private void prepareForMeasure() {
        Context context = getContext();
        if (context != null) {
            this.mIsActivityEmbedded = COUIResponsiveUtils.isActivityEmbedded(getContext());
            if (context instanceof Activity) {
                this.mScreenPhysicalWidth = COUIResponsiveUtils.getScreenPhysicalWidth((Activity) context);
            } else {
                this.mScreenPhysicalWidth = -1;
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (getContext() != null && this.mGridNumberResourceId != 0) {
            this.mGridNumber = getContext().getResources().getInteger(this.mGridNumberResourceId);
        }
        prepareForMeasure();
        requestLayout();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int iMeasureLayout;
        if (this.mPercentEnabled) {
            iMeasureLayout = COUIResponsiveUtils.measureLayout(this, i, this.mGridNumber, this.mPaddingType, this.mPaddingSize, this.mMode, this.mInitPaddingStart, this.mInitPaddingEnd, this.mScreenPhysicalWidth, this.mIsParentChildHierarchy, this.mIsActivityEmbedded);
            for (int i3 = 0; i3 < getChildCount(); i3++) {
                LayoutParams layoutParams = (LayoutParams) getChildAt(i3).getLayoutParams();
                COUIResponsiveUtils.measureChildWithPercent(getContext(), getChildAt(i3), iMeasureLayout, this.mPaddingType, this.mPaddingSize, layoutParams.mGridNumber, layoutParams.mPercentMode);
            }
        } else {
            iMeasureLayout = i;
        }
        super.onMeasure(iMeasureLayout, i2);
    }

    public void setIsParentChildHierarchy(boolean z) {
        this.mIsParentChildHierarchy = z;
        requestLayout();
    }

    public void setPercentIndentEnabled(boolean z) {
        this.mPercentEnabled = z;
        requestLayout();
    }

    public static class LayoutParams extends FrameLayout.LayoutParams {
        public int mGridNumber;
        public int mPercentMode;

        public LayoutParams(@NonNull Context context, @Nullable AttributeSet attributeSet) {
            super(context, attributeSet);
            init(context, attributeSet);
        }

        private void init(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.COUIPercentWidthFrameLayout_Layout);
            this.mGridNumber = typedArrayObtainStyledAttributes.getInt(R$styleable.COUIPercentWidthFrameLayout_Layout_layout_gridNumber, 0);
            this.mPercentMode = typedArrayObtainStyledAttributes.getInt(R$styleable.COUIPercentWidthFrameLayout_Layout_layout_percentMode, 0);
            typedArrayObtainStyledAttributes.recycle();
        }

        public void setGridNumber(int i) {
            this.mGridNumber = i;
        }

        public void setPercentMode(int i) {
            this.mPercentMode = i;
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
        }

        public LayoutParams(int i, int i2, int i3) {
            super(i, i2, i3);
        }

        public LayoutParams(@NonNull ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(@NonNull ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public LayoutParams(@NonNull FrameLayout.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public COUIPercentWidthFrameLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public COUIPercentWidthFrameLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mMode = 0;
        this.mPercentEnabled = true;
        this.mIsActivityEmbedded = false;
        this.mScreenPhysicalWidth = 0;
        initAttr(attributeSet);
        prepareForMeasure();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-1, -1);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new LayoutParams(layoutParams);
    }
}
