package com.coui.appcompat.grid;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridLayout;
import com.coui.component.responsiveui.ResponsiveUIModel;
import com.coui.component.responsiveui.layoutgrid.MarginType;
import com.oplus.aiunit.vision.ifk;
import com.support.grid.R$styleable;

/* JADX INFO: loaded from: classes13.dex */
public class COUIGridLayout extends GridLayout {
    public static final int GRID_MODE = 0;
    private static final int LARGE_MARGIN = 0;
    private static final int SMALL_MARGIN = 1;
    public static final int SPECIFIC_GAP_MODE = 1;
    public static final int SPECIFIC_SIZE_MODE = 2;
    private int[] mBottomMargin;
    private int mChildGridNumber;
    private float mChildHeight;
    private float mChildMinHeight;
    private float mChildMinWidth;
    private float mChildWidth;
    private int mColumn;
    private int[] mEndMargin;
    private int mGridMargin;
    private int mGridMarginType;
    private float[] mGridModeColumnWidth;
    private float mHorizontalGap;
    private boolean mIsIgnoreChildMargin;
    private int[] mMaxHorizontalMargin;
    private int[] mMaxVerticalMargin;
    private float mMinHorizontalGap;
    private ResponsiveUIModel mResponsiveUIModel;
    private int[] mStartMargin;
    private int[] mTopMargin;
    private int mType;
    private float mVerticalGap;

    public COUIGridLayout(Context context) {
        this(context, null);
    }

    private int adjustHorizontalMargin() {
        if (this.mIsIgnoreChildMargin) {
            return 0;
        }
        this.mMaxHorizontalMargin = new int[this.mColumn + 1];
        int i = 0;
        for (int i2 = 0; i2 <= this.mColumn; i2++) {
            int i3 = i2;
            while (true) {
                int[] iArr = this.mStartMargin;
                if (i3 < iArr.length) {
                    int i4 = this.mColumn;
                    if (i2 < i4) {
                        int[] iArr2 = this.mMaxHorizontalMargin;
                        int i5 = iArr2[i2];
                        int i6 = iArr[i3];
                        if (i5 < i6) {
                            iArr2[i2] = i6;
                        }
                    }
                    if (i2 > 0 && i3 > 0) {
                        int[] iArr3 = this.mEndMargin;
                        if (i3 <= iArr3.length) {
                            int[] iArr4 = this.mMaxHorizontalMargin;
                            int i7 = iArr4[i2];
                            int i8 = iArr3[i3 - 1];
                            if (i7 < i8) {
                                iArr4[i2] = i8;
                            }
                        }
                    }
                    i3 += i4;
                }
            }
            i += this.mMaxHorizontalMargin[i2];
        }
        return i;
    }

    private float calculateChildHeight() {
        float f = this.mChildHeight;
        if (f != 0.0f) {
            return f;
        }
        float f2 = this.mChildMinHeight;
        if (f2 == 0.0f) {
            return 0.0f;
        }
        return (f2 / this.mChildMinWidth) * this.mChildWidth;
    }

    private int calculateHorizontalMargin() {
        int i;
        int i2;
        if (this.mIsIgnoreChildMargin) {
            return 0;
        }
        int i3 = 0;
        for (int i4 = 0; i4 <= this.mColumn; i4++) {
            int i5 = i4;
            int i6 = 0;
            while (true) {
                int[] iArr = this.mStartMargin;
                if (i5 < iArr.length) {
                    int i7 = this.mColumn;
                    if (i4 < i7 && i6 < (i2 = iArr[i5])) {
                        i6 = i2;
                    }
                    if (i4 > 0 && i5 > 0) {
                        int[] iArr2 = this.mEndMargin;
                        if (i5 <= iArr2.length && i6 < (i = iArr2[i5 - 1])) {
                            i6 = i;
                        }
                    }
                    i5 += i7;
                }
            }
            i3 += i6;
        }
        return i3;
    }

    private void calculateInGridMode() {
        if (getContext() == null) {
            return;
        }
        this.mResponsiveUIModel.rebuild(getMeasuredWidth(), ifk.j(getContext())).chooseMargin(this.mGridMarginType == 1 ? MarginType.MARGIN_SMALL : MarginType.MARGIN_LARGE);
        this.mGridMargin = this.mResponsiveUIModel.margin();
        this.mHorizontalGap = this.mResponsiveUIModel.gutter();
        int iColumnCount = this.mResponsiveUIModel.columnCount();
        int i = this.mChildGridNumber;
        this.mColumn = iColumnCount / i;
        int i2 = 0;
        this.mChildWidth = this.mResponsiveUIModel.width(0, i - 1);
        this.mGridModeColumnWidth = new float[this.mChildGridNumber];
        while (true) {
            int i3 = this.mColumn;
            if (i2 >= i3) {
                this.mMaxHorizontalMargin = new int[i3 + 1];
                return;
            }
            float[] fArr = this.mGridModeColumnWidth;
            ResponsiveUIModel responsiveUIModel = this.mResponsiveUIModel;
            int i4 = this.mChildGridNumber;
            int i5 = i2 + 1;
            fArr[i2] = responsiveUIModel.width(i2 * i4, (i4 * i5) - 1);
            i2 = i5;
        }
    }

    private void calculateInSpecificGapMode() {
        float widthWithoutPadding = getWidthWithoutPadding();
        float f = this.mHorizontalGap;
        this.mColumn = Math.max(1, (int) ((widthWithoutPadding + f) / (f + this.mChildMinWidth)));
        float widthWithoutPadding2 = getWidthWithoutPadding() - calculateHorizontalMargin();
        float f2 = this.mHorizontalGap;
        this.mColumn = Math.max(1, (int) ((widthWithoutPadding2 + f2) / (f2 + this.mChildMinWidth)));
        float widthWithoutPadding3 = getWidthWithoutPadding() - adjustHorizontalMargin();
        float f3 = this.mHorizontalGap;
        int i = this.mColumn;
        this.mChildWidth = Math.max(0.0f, (widthWithoutPadding3 - (f3 * (i - 1))) / i);
        this.mChildHeight = calculateChildHeight();
    }

    private void calculateInSpecificSizeMode() {
        float widthWithoutPadding = getWidthWithoutPadding();
        float f = this.mMinHorizontalGap;
        this.mColumn = Math.max(1, (int) ((widthWithoutPadding + f) / (f + this.mChildWidth)));
        float widthWithoutPadding2 = getWidthWithoutPadding() - calculateHorizontalMargin();
        float f2 = this.mMinHorizontalGap;
        this.mColumn = Math.max(1, (int) ((widthWithoutPadding2 + f2) / (f2 + this.mChildWidth)));
        float widthWithoutPadding3 = getWidthWithoutPadding() - adjustHorizontalMargin();
        float f3 = this.mChildWidth;
        int i = this.mColumn;
        this.mHorizontalGap = Math.max(0.0f, (widthWithoutPadding3 - (f3 * i)) / (i - 1));
    }

    private void calculateMargins() {
        int childCount = getChildCount();
        this.mTopMargin = new int[childCount];
        this.mBottomMargin = new int[childCount];
        this.mStartMargin = new int[childCount];
        this.mEndMargin = new int[childCount];
        if (this.mIsIgnoreChildMargin) {
            return;
        }
        int i = 0;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
            if (childAt.getVisibility() != 8) {
                this.mTopMargin[i] = marginLayoutParams.topMargin;
                this.mBottomMargin[i] = marginLayoutParams.bottomMargin;
                this.mStartMargin[i] = marginLayoutParams.getMarginStart();
                this.mEndMargin[i] = marginLayoutParams.getMarginEnd();
                i++;
            }
        }
    }

    private int calculateVerticalMargin(int i) {
        int i2;
        int i3 = 0;
        if (this.mIsIgnoreChildMargin) {
            return 0;
        }
        this.mMaxVerticalMargin = new int[i + 1];
        int i4 = 0;
        while (i3 <= i) {
            int i5 = this.mColumn * i3;
            while (true) {
                i2 = i3 + 1;
                int i6 = this.mColumn;
                if (i5 < i2 * i6) {
                    int[] iArr = this.mTopMargin;
                    if (i5 < iArr.length) {
                        int[] iArr2 = this.mMaxVerticalMargin;
                        int i7 = iArr2[i3];
                        int i8 = iArr[i5];
                        if (i7 < i8) {
                            iArr2[i3] = i8;
                        }
                    }
                    if (i3 > 0 && i5 > 0) {
                        int i9 = i5 - i6;
                        int[] iArr3 = this.mBottomMargin;
                        if (i9 < iArr3.length) {
                            int[] iArr4 = this.mMaxVerticalMargin;
                            if (iArr4[i3] < iArr3[i5 - i6]) {
                                iArr4[i3] = iArr3[i5 - i6];
                            }
                        }
                    }
                    i5++;
                }
            }
            i4 += this.mMaxVerticalMargin[i3];
            i3 = i2;
        }
        return i4;
    }

    private int getVisibleChildCount() {
        int i = 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            if (getChildAt(i2).getVisibility() != 8) {
                i++;
            }
        }
        return i;
    }

    private int getWidthWithoutPadding() {
        return (getMeasuredWidth() - getPaddingStart()) - getPaddingEnd();
    }

    private void initAttr(AttributeSet attributeSet) {
        if (getContext() != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.COUIGridLayout);
            this.mHorizontalGap = typedArrayObtainStyledAttributes.getDimension(R$styleable.COUIGridLayout_couiHorizontalGap, 0.0f);
            this.mMinHorizontalGap = typedArrayObtainStyledAttributes.getDimension(R$styleable.COUIGridLayout_minHorizontalGap, 0.0f);
            this.mVerticalGap = typedArrayObtainStyledAttributes.getDimension(R$styleable.COUIGridLayout_couiVerticalGap, 0.0f);
            this.mChildMinWidth = typedArrayObtainStyledAttributes.getDimension(R$styleable.COUIGridLayout_childMinWidth, 0.0f);
            this.mChildMinHeight = typedArrayObtainStyledAttributes.getDimension(R$styleable.COUIGridLayout_childMinHeight, 0.0f);
            this.mChildHeight = typedArrayObtainStyledAttributes.getDimension(R$styleable.COUIGridLayout_childHeight, 0.0f);
            this.mChildWidth = typedArrayObtainStyledAttributes.getDimension(R$styleable.COUIGridLayout_childWidth, 0.0f);
            this.mChildGridNumber = typedArrayObtainStyledAttributes.getInteger(R$styleable.COUIGridLayout_childGridNumber, 0);
            this.mGridMarginType = typedArrayObtainStyledAttributes.getInteger(R$styleable.COUIGridLayout_gridMarginType, 1);
            this.mType = typedArrayObtainStyledAttributes.getInteger(R$styleable.COUIGridLayout_specificType, 0);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    private void initUIManager() {
        if (getContext() != null) {
            this.mResponsiveUIModel = new ResponsiveUIModel(getContext(), 0, 0);
        }
    }

    private boolean isLayoutRTL() {
        return getLayoutDirection() == 1;
    }

    private int measureHeight(int i, double d) {
        int iCalculateVerticalMargin = calculateVerticalMargin((int) d);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == Integer.MIN_VALUE) {
            return Math.min(size, (int) ((((double) this.mChildHeight) * d) + ((d - 1.0d) * ((double) this.mVerticalGap)) + ((double) iCalculateVerticalMargin)));
        }
        if (mode == 0) {
            return (int) ((((double) this.mChildHeight) * d) + ((d - 1.0d) * ((double) this.mVerticalGap)) + ((double) iCalculateVerticalMargin));
        }
        if (mode != 1073741824) {
            return 0;
        }
        return size;
    }

    @Override // android.widget.GridLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int width;
        super.onLayout(z, i, i2, i3, i4);
        int paddingStart = getPaddingStart() + this.mGridMargin;
        int paddingTop = getPaddingTop();
        int i6 = 0;
        for (int i7 = 0; i7 < getChildCount(); i7++) {
            View childAt = getChildAt(i7);
            float f = this.mType == 0 ? this.mGridModeColumnWidth[i7 % this.mColumn] : this.mChildWidth;
            int iMax = this.mIsIgnoreChildMargin ? 0 : Math.max(0, this.mMaxHorizontalMargin[i6 % this.mColumn]);
            int iMax2 = this.mIsIgnoreChildMargin ? 0 : Math.max(0, this.mMaxVerticalMargin[i6 / this.mColumn]);
            if (childAt.getVisibility() != 8) {
                if (isLayoutRTL()) {
                    width = (getWidth() - paddingStart) - iMax;
                    i5 = (int) (width - f);
                } else {
                    i5 = paddingStart + iMax;
                    width = (int) (i5 + f);
                }
                int i8 = paddingTop + iMax2;
                childAt.layout(i5, i8, width, (int) (i8 + this.mChildHeight));
                i6++;
                if (i6 % this.mColumn == 0) {
                    paddingStart = getPaddingStart() + this.mGridMargin;
                    paddingTop = (int) (paddingTop + this.mChildHeight + this.mVerticalGap + iMax2);
                } else {
                    paddingStart = (int) (paddingStart + this.mHorizontalGap + f + iMax);
                }
            }
        }
    }

    @Override // android.widget.GridLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        calculateMargins();
        int i3 = this.mType;
        if (i3 == 0) {
            calculateInGridMode();
        } else if (i3 == 1) {
            calculateInSpecificGapMode();
        } else if (i3 == 2) {
            calculateInSpecificSizeMode();
        }
        for (int i4 = 0; i4 < getChildCount(); i4++) {
            View childAt = getChildAt(i4);
            if (this.mChildHeight == 0.0f) {
                this.mChildHeight = childAt.getMeasuredHeight();
            }
            measureChild(childAt, ViewGroup.getChildMeasureSpec(i, 0, (int) this.mChildWidth), ViewGroup.getChildMeasureSpec(i2, 0, (int) this.mChildHeight));
        }
        setMeasuredDimension(View.resolveSizeAndState(View.MeasureSpec.getSize(i), i, 0), measureHeight(i2, Math.ceil(getVisibleChildCount() / this.mColumn)));
    }

    public void setChildGridNumber(int i) {
        this.mChildGridNumber = i;
        requestLayout();
    }

    public void setChildHeight(float f) {
        this.mChildHeight = f;
        requestLayout();
    }

    public void setChildMinHeight(float f) {
        this.mChildMinHeight = f;
        requestLayout();
    }

    public void setChildMinWidth(float f) {
        this.mChildMinWidth = f;
        requestLayout();
    }

    public void setChildWidth(float f) {
        this.mChildWidth = f;
        requestLayout();
    }

    public void setGridMarginType(int i) {
        this.mGridMarginType = i;
        requestLayout();
    }

    public void setHorizontalGap(float f) {
        this.mHorizontalGap = f;
        requestLayout();
    }

    public void setIsIgnoreChildMargin(boolean z) {
        this.mIsIgnoreChildMargin = z;
    }

    public void setMinHorizontalGap(float f) {
        this.mMinHorizontalGap = f;
        requestLayout();
    }

    public void setType(int i) {
        this.mType = i;
        requestLayout();
    }

    public void setVerticalGap(float f) {
        this.mVerticalGap = f;
        requestLayout();
    }

    public COUIGridLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public COUIGridLayout(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public COUIGridLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.mIsIgnoreChildMargin = true;
        initUIManager();
        initAttr(attributeSet);
    }
}
