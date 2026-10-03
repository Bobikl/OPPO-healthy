package com.google.android.flexbox;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class FlexboxLayout extends ViewGroup implements FlexContainer {
    public static final int SHOW_DIVIDER_BEGINNING = 1;
    public static final int SHOW_DIVIDER_END = 4;
    public static final int SHOW_DIVIDER_MIDDLE = 2;
    public static final int SHOW_DIVIDER_NONE = 0;
    private int mAlignContent;
    private int mAlignItems;

    @Nullable
    private Drawable mDividerDrawableHorizontal;

    @Nullable
    private Drawable mDividerDrawableVertical;
    private int mDividerHorizontalHeight;
    private int mDividerVerticalWidth;
    private int mFlexDirection;
    private List<FlexLine> mFlexLines;
    private FlexboxHelper.FlexLinesResult mFlexLinesResult;
    private int mFlexWrap;
    private FlexboxHelper mFlexboxHelper;
    private int mJustifyContent;
    private int mMaxLine;
    private SparseIntArray mOrderCache;
    private int[] mReorderedIndices;
    private int mShowDividerHorizontal;
    private int mShowDividerVertical;

    @Retention(RetentionPolicy.SOURCE)
    public @interface DividerMode {
    }

    public FlexboxLayout(Context context) {
        this(context, null);
    }

    private boolean allFlexLinesAreDummyBefore(int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (this.mFlexLines.get(i2).getItemCountNotGone() > 0) {
                return false;
            }
        }
        return true;
    }

    private boolean allViewsAreGoneBefore(int i, int i2) {
        for (int i3 = 1; i3 <= i2; i3++) {
            View reorderedChildAt = getReorderedChildAt(i - i3);
            if (reorderedChildAt != null && reorderedChildAt.getVisibility() != 8) {
                return false;
            }
        }
        return true;
    }

    private void drawDividersHorizontal(Canvas canvas, boolean z, boolean z2) {
        int paddingLeft = getPaddingLeft();
        int iMax = Math.max(0, (getWidth() - getPaddingRight()) - paddingLeft);
        int size = this.mFlexLines.size();
        for (int i = 0; i < size; i++) {
            FlexLine flexLine = this.mFlexLines.get(i);
            for (int i2 = 0; i2 < flexLine.mItemCount; i2++) {
                int i3 = flexLine.mFirstIndex + i2;
                View reorderedChildAt = getReorderedChildAt(i3);
                if (reorderedChildAt != null && reorderedChildAt.getVisibility() != 8) {
                    LayoutParams layoutParams = (LayoutParams) reorderedChildAt.getLayoutParams();
                    if (hasDividerBeforeChildAtAlongMainAxis(i3, i2)) {
                        drawVerticalDivider(canvas, z ? reorderedChildAt.getRight() + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin : (reorderedChildAt.getLeft() - ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin) - this.mDividerVerticalWidth, flexLine.mTop, flexLine.mCrossSize);
                    }
                    if (i2 == flexLine.mItemCount - 1 && (this.mShowDividerVertical & 4) > 0) {
                        drawVerticalDivider(canvas, z ? (reorderedChildAt.getLeft() - ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin) - this.mDividerVerticalWidth : reorderedChildAt.getRight() + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, flexLine.mTop, flexLine.mCrossSize);
                    }
                }
            }
            if (hasDividerBeforeFlexLine(i)) {
                drawHorizontalDivider(canvas, paddingLeft, z2 ? flexLine.mBottom : flexLine.mTop - this.mDividerHorizontalHeight, iMax);
            }
            if (hasEndDividerAfterFlexLine(i) && (this.mShowDividerHorizontal & 4) > 0) {
                drawHorizontalDivider(canvas, paddingLeft, z2 ? flexLine.mTop - this.mDividerHorizontalHeight : flexLine.mBottom, iMax);
            }
        }
    }

    private void drawDividersVertical(Canvas canvas, boolean z, boolean z2) {
        int paddingTop = getPaddingTop();
        int iMax = Math.max(0, (getHeight() - getPaddingBottom()) - paddingTop);
        int size = this.mFlexLines.size();
        for (int i = 0; i < size; i++) {
            FlexLine flexLine = this.mFlexLines.get(i);
            for (int i2 = 0; i2 < flexLine.mItemCount; i2++) {
                int i3 = flexLine.mFirstIndex + i2;
                View reorderedChildAt = getReorderedChildAt(i3);
                if (reorderedChildAt != null && reorderedChildAt.getVisibility() != 8) {
                    LayoutParams layoutParams = (LayoutParams) reorderedChildAt.getLayoutParams();
                    if (hasDividerBeforeChildAtAlongMainAxis(i3, i2)) {
                        drawHorizontalDivider(canvas, flexLine.mLeft, z2 ? reorderedChildAt.getBottom() + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin : (reorderedChildAt.getTop() - ((ViewGroup.MarginLayoutParams) layoutParams).topMargin) - this.mDividerHorizontalHeight, flexLine.mCrossSize);
                    }
                    if (i2 == flexLine.mItemCount - 1 && (this.mShowDividerHorizontal & 4) > 0) {
                        drawHorizontalDivider(canvas, flexLine.mLeft, z2 ? (reorderedChildAt.getTop() - ((ViewGroup.MarginLayoutParams) layoutParams).topMargin) - this.mDividerHorizontalHeight : reorderedChildAt.getBottom() + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin, flexLine.mCrossSize);
                    }
                }
            }
            if (hasDividerBeforeFlexLine(i)) {
                drawVerticalDivider(canvas, z ? flexLine.mRight : flexLine.mLeft - this.mDividerVerticalWidth, paddingTop, iMax);
            }
            if (hasEndDividerAfterFlexLine(i) && (this.mShowDividerVertical & 4) > 0) {
                drawVerticalDivider(canvas, z ? flexLine.mLeft - this.mDividerVerticalWidth : flexLine.mRight, paddingTop, iMax);
            }
        }
    }

    private void drawHorizontalDivider(Canvas canvas, int i, int i2, int i3) {
        Drawable drawable = this.mDividerDrawableHorizontal;
        if (drawable == null) {
            return;
        }
        drawable.setBounds(i, i2, i3 + i, this.mDividerHorizontalHeight + i2);
        this.mDividerDrawableHorizontal.draw(canvas);
    }

    private void drawVerticalDivider(Canvas canvas, int i, int i2, int i3) {
        Drawable drawable = this.mDividerDrawableVertical;
        if (drawable == null) {
            return;
        }
        drawable.setBounds(i, i2, this.mDividerVerticalWidth + i, i3 + i2);
        this.mDividerDrawableVertical.draw(canvas);
    }

    private boolean hasDividerBeforeChildAtAlongMainAxis(int i, int i2) {
        if (allViewsAreGoneBefore(i, i2)) {
            if (isMainAxisDirectionHorizontal()) {
                return (this.mShowDividerVertical & 1) != 0;
            }
            return (this.mShowDividerHorizontal & 1) != 0;
        }
        if (isMainAxisDirectionHorizontal()) {
            return (this.mShowDividerVertical & 2) != 0;
        }
        return (this.mShowDividerHorizontal & 2) != 0;
    }

    private boolean hasDividerBeforeFlexLine(int i) {
        if (i < 0 || i >= this.mFlexLines.size()) {
            return false;
        }
        if (allFlexLinesAreDummyBefore(i)) {
            if (isMainAxisDirectionHorizontal()) {
                return (this.mShowDividerHorizontal & 1) != 0;
            }
            return (this.mShowDividerVertical & 1) != 0;
        }
        if (isMainAxisDirectionHorizontal()) {
            return (this.mShowDividerHorizontal & 2) != 0;
        }
        return (this.mShowDividerVertical & 2) != 0;
    }

    private boolean hasEndDividerAfterFlexLine(int i) {
        if (i < 0 || i >= this.mFlexLines.size()) {
            return false;
        }
        for (int i2 = i + 1; i2 < this.mFlexLines.size(); i2++) {
            if (this.mFlexLines.get(i2).getItemCountNotGone() > 0) {
                return false;
            }
        }
        if (isMainAxisDirectionHorizontal()) {
            return (this.mShowDividerHorizontal & 4) != 0;
        }
        return (this.mShowDividerVertical & 4) != 0;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:43:0x00de  */
    /* JADX WARN: Code duplicated, block: B:45:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:46:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:48:0x0107  */
    /* JADX WARN: Code duplicated, block: B:49:0x0111  */
    /* JADX WARN: Code duplicated, block: B:52:0x011a  */
    /* JADX WARN: Code duplicated, block: B:54:0x0122  */
    /* JADX WARN: Code duplicated, block: B:55:0x0127  */
    /* JADX WARN: Code duplicated, block: B:59:0x0130 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:60:0x0132  */
    /* JADX WARN: Code duplicated, block: B:61:0x0163  */
    /* JADX WARN: Code duplicated, block: B:62:0x018d  */
    /* JADX WARN: Code duplicated, block: B:64:0x019a  */
    /* JADX WARN: Code duplicated, block: B:65:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:68:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:69:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:71:0x020c  */
    private void layoutHorizontal(boolean z, int i, int i2, int i3, int i4) {
        float measuredWidth;
        float f;
        float f2;
        float fMax;
        int i5;
        int i6;
        View reorderedChildAt;
        int i7;
        int i8;
        int i9;
        char c2;
        LayoutParams layoutParams;
        float f3;
        float f4;
        float f5;
        int i10;
        char c3;
        int i11;
        LayoutParams layoutParams2;
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int i12 = i3 - i;
        int paddingBottom = (i4 - i2) - getPaddingBottom();
        int paddingTop = getPaddingTop();
        int size = this.mFlexLines.size();
        int i13 = 0;
        while (i13 < size) {
            FlexLine flexLine = this.mFlexLines.get(i13);
            if (hasDividerBeforeFlexLine(i13)) {
                int i14 = this.mDividerHorizontalHeight;
                paddingBottom -= i14;
                paddingTop += i14;
            }
            int i15 = this.mJustifyContent;
            char c4 = 4;
            int i16 = 1;
            if (i15 == 0) {
                measuredWidth = paddingLeft;
                f = i12 - paddingRight;
            } else if (i15 != 1) {
                if (i15 == 2) {
                    int i17 = flexLine.mMainSize;
                    measuredWidth = paddingLeft + ((i12 - i17) / 2.0f);
                    f = (i12 - paddingRight) - ((i12 - i17) / 2.0f);
                } else if (i15 == 3) {
                    measuredWidth = paddingLeft;
                    int itemCountNotGone = flexLine.getItemCountNotGone();
                    f2 = (i12 - flexLine.mMainSize) / (itemCountNotGone != 1 ? itemCountNotGone - 1 : 1.0f);
                    f = i12 - paddingRight;
                } else if (i15 == 4) {
                    int itemCountNotGone2 = flexLine.getItemCountNotGone();
                    f2 = itemCountNotGone2 != 0 ? (i12 - flexLine.mMainSize) / itemCountNotGone2 : 0.0f;
                    float f6 = f2 / 2.0f;
                    measuredWidth = paddingLeft + f6;
                    f = (i12 - paddingRight) - f6;
                } else {
                    if (i15 != 5) {
                        throw new IllegalStateException("Invalid justifyContent is set: " + this.mJustifyContent);
                    }
                    int itemCountNotGone3 = flexLine.getItemCountNotGone();
                    f2 = itemCountNotGone3 != 0 ? (i12 - flexLine.mMainSize) / (itemCountNotGone3 + 1) : 0.0f;
                    measuredWidth = paddingLeft + f2;
                    f = (i12 - paddingRight) - f2;
                }
                fMax = Math.max(f2, 0.0f);
                i5 = 0;
                while (i5 < flexLine.mItemCount) {
                    i6 = flexLine.mFirstIndex + i5;
                    reorderedChildAt = getReorderedChildAt(i6);
                    if (reorderedChildAt != null) {
                        i7 = paddingLeft;
                        i8 = i16;
                        i9 = i5;
                        c2 = c4;
                    } else if (reorderedChildAt.getVisibility() == 8) {
                        i7 = paddingLeft;
                        i8 = i16;
                        i9 = i5;
                        c2 = 4;
                    } else {
                        layoutParams = (LayoutParams) reorderedChildAt.getLayoutParams();
                        f3 = measuredWidth + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
                        f4 = f - ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
                        if (hasDividerBeforeChildAtAlongMainAxis(i6, i5)) {
                            int i18 = this.mDividerVerticalWidth;
                            float f7 = i18;
                            f3 += f7;
                            i10 = i18;
                            f5 = f4 - f7;
                        } else {
                            f5 = f4;
                            i10 = 0;
                        }
                        if (i5 == flexLine.mItemCount - i16) {
                            c3 = 4;
                            i11 = (this.mShowDividerVertical & 4) > 0 ? this.mDividerVerticalWidth : 0;
                            if (this.mFlexWrap == 2) {
                                i7 = paddingLeft;
                                i8 = i16;
                                i9 = i5;
                                layoutParams2 = layoutParams;
                                c2 = c3;
                                if (z) {
                                    this.mFlexboxHelper.layoutSingleChildHorizontal(reorderedChildAt, flexLine, Math.round(f5) - reorderedChildAt.getMeasuredWidth(), paddingTop, Math.round(f5), paddingTop + reorderedChildAt.getMeasuredHeight());
                                } else {
                                    this.mFlexboxHelper.layoutSingleChildHorizontal(reorderedChildAt, flexLine, Math.round(f3), paddingTop, Math.round(f3) + reorderedChildAt.getMeasuredWidth(), paddingTop + reorderedChildAt.getMeasuredHeight());
                                }
                            } else if (z) {
                                i8 = i16;
                                i9 = i5;
                                i7 = paddingLeft;
                                layoutParams2 = layoutParams;
                                c2 = c3;
                                this.mFlexboxHelper.layoutSingleChildHorizontal(reorderedChildAt, flexLine, Math.round(f5) - reorderedChildAt.getMeasuredWidth(), paddingBottom - reorderedChildAt.getMeasuredHeight(), Math.round(f5), paddingBottom);
                            } else {
                                i7 = paddingLeft;
                                i8 = i16;
                                i9 = i5;
                                layoutParams2 = layoutParams;
                                c2 = c3;
                                this.mFlexboxHelper.layoutSingleChildHorizontal(reorderedChildAt, flexLine, Math.round(f3), paddingBottom - reorderedChildAt.getMeasuredHeight(), Math.round(f3) + reorderedChildAt.getMeasuredWidth(), paddingBottom);
                            }
                            measuredWidth = f3 + reorderedChildAt.getMeasuredWidth() + fMax + ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin;
                            float measuredWidth2 = f5 - ((reorderedChildAt.getMeasuredWidth() + fMax) + ((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin);
                            if (z) {
                                flexLine.updatePositionFromView(reorderedChildAt, i11, 0, i10, 0);
                            } else {
                                flexLine.updatePositionFromView(reorderedChildAt, i10, 0, i11, 0);
                            }
                            f = measuredWidth2;
                        } else {
                            c3 = 4;
                        }
                        if (this.mFlexWrap == 2) {
                            i7 = paddingLeft;
                            i8 = i16;
                            i9 = i5;
                            layoutParams2 = layoutParams;
                            c2 = c3;
                            if (z) {
                                this.mFlexboxHelper.layoutSingleChildHorizontal(reorderedChildAt, flexLine, Math.round(f5) - reorderedChildAt.getMeasuredWidth(), paddingTop, Math.round(f5), paddingTop + reorderedChildAt.getMeasuredHeight());
                            } else {
                                this.mFlexboxHelper.layoutSingleChildHorizontal(reorderedChildAt, flexLine, Math.round(f3), paddingTop, Math.round(f3) + reorderedChildAt.getMeasuredWidth(), paddingTop + reorderedChildAt.getMeasuredHeight());
                            }
                        } else if (z) {
                            i8 = i16;
                            i9 = i5;
                            i7 = paddingLeft;
                            layoutParams2 = layoutParams;
                            c2 = c3;
                            this.mFlexboxHelper.layoutSingleChildHorizontal(reorderedChildAt, flexLine, Math.round(f5) - reorderedChildAt.getMeasuredWidth(), paddingBottom - reorderedChildAt.getMeasuredHeight(), Math.round(f5), paddingBottom);
                        } else {
                            i7 = paddingLeft;
                            i8 = i16;
                            i9 = i5;
                            layoutParams2 = layoutParams;
                            c2 = c3;
                            this.mFlexboxHelper.layoutSingleChildHorizontal(reorderedChildAt, flexLine, Math.round(f3), paddingBottom - reorderedChildAt.getMeasuredHeight(), Math.round(f3) + reorderedChildAt.getMeasuredWidth(), paddingBottom);
                        }
                        measuredWidth = f3 + reorderedChildAt.getMeasuredWidth() + fMax + ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin;
                        float measuredWidth3 = f5 - ((reorderedChildAt.getMeasuredWidth() + fMax) + ((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin);
                        if (z) {
                            flexLine.updatePositionFromView(reorderedChildAt, i11, 0, i10, 0);
                        } else {
                            flexLine.updatePositionFromView(reorderedChildAt, i10, 0, i11, 0);
                        }
                        f = measuredWidth3;
                    }
                    i5 = i9 + 1;
                    paddingLeft = i7;
                    i16 = i8;
                    c4 = c2;
                }
                int i19 = paddingLeft;
                int i20 = flexLine.mCrossSize;
                paddingTop += i20;
                paddingBottom -= i20;
                i13++;
                paddingLeft = i19;
            } else {
                int i21 = flexLine.mMainSize;
                f = i21 - paddingLeft;
                measuredWidth = (i12 - i21) + paddingRight;
            }
            f2 = 0.0f;
            fMax = Math.max(f2, 0.0f);
            i5 = 0;
            while (i5 < flexLine.mItemCount) {
                i6 = flexLine.mFirstIndex + i5;
                reorderedChildAt = getReorderedChildAt(i6);
                if (reorderedChildAt != null) {
                    i7 = paddingLeft;
                    i8 = i16;
                    i9 = i5;
                    c2 = c4;
                } else if (reorderedChildAt.getVisibility() == 8) {
                    i7 = paddingLeft;
                    i8 = i16;
                    i9 = i5;
                    c2 = 4;
                } else {
                    layoutParams = (LayoutParams) reorderedChildAt.getLayoutParams();
                    f3 = measuredWidth + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
                    f4 = f - ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
                    if (hasDividerBeforeChildAtAlongMainAxis(i6, i5)) {
                        int i110 = this.mDividerVerticalWidth;
                        float f8 = i110;
                        f3 += f8;
                        i10 = i110;
                        f5 = f4 - f8;
                    } else {
                        f5 = f4;
                        i10 = 0;
                    }
                    if (i5 == flexLine.mItemCount - i16) {
                        c3 = 4;
                        if ((this.mShowDividerVertical & 4) > 0) {
                        }
                        if (this.mFlexWrap == 2) {
                            i7 = paddingLeft;
                            i8 = i16;
                            i9 = i5;
                            layoutParams2 = layoutParams;
                            c2 = c3;
                            if (z) {
                                this.mFlexboxHelper.layoutSingleChildHorizontal(reorderedChildAt, flexLine, Math.round(f5) - reorderedChildAt.getMeasuredWidth(), paddingTop, Math.round(f5), paddingTop + reorderedChildAt.getMeasuredHeight());
                            } else {
                                this.mFlexboxHelper.layoutSingleChildHorizontal(reorderedChildAt, flexLine, Math.round(f3), paddingTop, Math.round(f3) + reorderedChildAt.getMeasuredWidth(), paddingTop + reorderedChildAt.getMeasuredHeight());
                            }
                        } else if (z) {
                            i8 = i16;
                            i9 = i5;
                            i7 = paddingLeft;
                            layoutParams2 = layoutParams;
                            c2 = c3;
                            this.mFlexboxHelper.layoutSingleChildHorizontal(reorderedChildAt, flexLine, Math.round(f5) - reorderedChildAt.getMeasuredWidth(), paddingBottom - reorderedChildAt.getMeasuredHeight(), Math.round(f5), paddingBottom);
                        } else {
                            i7 = paddingLeft;
                            i8 = i16;
                            i9 = i5;
                            layoutParams2 = layoutParams;
                            c2 = c3;
                            this.mFlexboxHelper.layoutSingleChildHorizontal(reorderedChildAt, flexLine, Math.round(f3), paddingBottom - reorderedChildAt.getMeasuredHeight(), Math.round(f3) + reorderedChildAt.getMeasuredWidth(), paddingBottom);
                        }
                        measuredWidth = f3 + reorderedChildAt.getMeasuredWidth() + fMax + ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin;
                        float measuredWidth4 = f5 - ((reorderedChildAt.getMeasuredWidth() + fMax) + ((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin);
                        if (z) {
                            flexLine.updatePositionFromView(reorderedChildAt, i11, 0, i10, 0);
                        } else {
                            flexLine.updatePositionFromView(reorderedChildAt, i10, 0, i11, 0);
                        }
                        f = measuredWidth4;
                    } else {
                        c3 = 4;
                    }
                    if (this.mFlexWrap == 2) {
                        i7 = paddingLeft;
                        i8 = i16;
                        i9 = i5;
                        layoutParams2 = layoutParams;
                        c2 = c3;
                        if (z) {
                            this.mFlexboxHelper.layoutSingleChildHorizontal(reorderedChildAt, flexLine, Math.round(f5) - reorderedChildAt.getMeasuredWidth(), paddingTop, Math.round(f5), paddingTop + reorderedChildAt.getMeasuredHeight());
                        } else {
                            this.mFlexboxHelper.layoutSingleChildHorizontal(reorderedChildAt, flexLine, Math.round(f3), paddingTop, Math.round(f3) + reorderedChildAt.getMeasuredWidth(), paddingTop + reorderedChildAt.getMeasuredHeight());
                        }
                    } else if (z) {
                        i8 = i16;
                        i9 = i5;
                        i7 = paddingLeft;
                        layoutParams2 = layoutParams;
                        c2 = c3;
                        this.mFlexboxHelper.layoutSingleChildHorizontal(reorderedChildAt, flexLine, Math.round(f5) - reorderedChildAt.getMeasuredWidth(), paddingBottom - reorderedChildAt.getMeasuredHeight(), Math.round(f5), paddingBottom);
                    } else {
                        i7 = paddingLeft;
                        i8 = i16;
                        i9 = i5;
                        layoutParams2 = layoutParams;
                        c2 = c3;
                        this.mFlexboxHelper.layoutSingleChildHorizontal(reorderedChildAt, flexLine, Math.round(f3), paddingBottom - reorderedChildAt.getMeasuredHeight(), Math.round(f3) + reorderedChildAt.getMeasuredWidth(), paddingBottom);
                    }
                    measuredWidth = f3 + reorderedChildAt.getMeasuredWidth() + fMax + ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin;
                    float measuredWidth5 = f5 - ((reorderedChildAt.getMeasuredWidth() + fMax) + ((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin);
                    if (z) {
                        flexLine.updatePositionFromView(reorderedChildAt, i11, 0, i10, 0);
                    } else {
                        flexLine.updatePositionFromView(reorderedChildAt, i10, 0, i11, 0);
                    }
                    f = measuredWidth5;
                }
                i5 = i9 + 1;
                paddingLeft = i7;
                i16 = i8;
                c4 = c2;
            }
            int i111 = paddingLeft;
            int i22 = flexLine.mCrossSize;
            paddingTop += i22;
            paddingBottom -= i22;
            i13++;
            paddingLeft = i111;
        }
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:44:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:46:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:47:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:49:0x0101  */
    /* JADX WARN: Code duplicated, block: B:50:0x010d  */
    /* JADX WARN: Code duplicated, block: B:53:0x0119  */
    /* JADX WARN: Code duplicated, block: B:55:0x0121  */
    /* JADX WARN: Code duplicated, block: B:56:0x0126  */
    /* JADX WARN: Code duplicated, block: B:59:0x012c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:60:0x012e  */
    /* JADX WARN: Code duplicated, block: B:61:0x015d  */
    /* JADX WARN: Code duplicated, block: B:62:0x0185  */
    /* JADX WARN: Code duplicated, block: B:64:0x018f  */
    /* JADX WARN: Code duplicated, block: B:65:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:68:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:69:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:71:0x0206  */
    private void layoutVertical(boolean z, boolean z2, int i, int i2, int i3, int i4) {
        float f;
        int i5;
        float f2;
        float f3;
        float fMax;
        int i6;
        int i7;
        View reorderedChildAt;
        int i8;
        boolean z3;
        char c2;
        LayoutParams layoutParams;
        float f4;
        float f5;
        float f6;
        float f7;
        int i9;
        char c3;
        int i10;
        LayoutParams layoutParams2;
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int paddingRight = getPaddingRight();
        int paddingLeft = getPaddingLeft();
        int i11 = i4 - i2;
        int i12 = (i3 - i) - paddingRight;
        int size = this.mFlexLines.size();
        for (int i13 = 0; i13 < size; i13++) {
            FlexLine flexLine = this.mFlexLines.get(i13);
            if (hasDividerBeforeFlexLine(i13)) {
                int i14 = this.mDividerVerticalWidth;
                paddingLeft += i14;
                i12 -= i14;
            }
            int i15 = this.mJustifyContent;
            char c4 = 4;
            boolean z4 = true;
            if (i15 != 0) {
                if (i15 == 1) {
                    int i16 = flexLine.mMainSize;
                    f = (i11 - i16) + paddingBottom;
                    i5 = i16 - paddingTop;
                } else if (i15 == 2) {
                    int i17 = flexLine.mMainSize;
                    f2 = (i11 - paddingBottom) - ((i11 - i17) / 2.0f);
                    f = paddingTop + ((i11 - i17) / 2.0f);
                    f3 = 0.0f;
                } else if (i15 == 3) {
                    f = paddingTop;
                    int itemCountNotGone = flexLine.getItemCountNotGone();
                    f3 = (i11 - flexLine.mMainSize) / (itemCountNotGone != 1 ? itemCountNotGone - 1 : 1.0f);
                    f2 = i11 - paddingBottom;
                } else if (i15 == 4) {
                    int itemCountNotGone2 = flexLine.getItemCountNotGone();
                    f3 = itemCountNotGone2 != 0 ? (i11 - flexLine.mMainSize) / itemCountNotGone2 : 0.0f;
                    float f8 = f3 / 2.0f;
                    f = paddingTop + f8;
                    f2 = (i11 - paddingBottom) - f8;
                } else {
                    if (i15 != 5) {
                        throw new IllegalStateException("Invalid justifyContent is set: " + this.mJustifyContent);
                    }
                    int itemCountNotGone3 = flexLine.getItemCountNotGone();
                    f3 = itemCountNotGone3 != 0 ? (i11 - flexLine.mMainSize) / (itemCountNotGone3 + 1) : 0.0f;
                    f = paddingTop + f3;
                    f2 = (i11 - paddingBottom) - f3;
                }
                fMax = Math.max(f3, 0.0f);
                i6 = 0;
                while (i6 < flexLine.mItemCount) {
                    i7 = flexLine.mFirstIndex + i6;
                    reorderedChildAt = getReorderedChildAt(i7);
                    if (reorderedChildAt != null) {
                        i8 = i6;
                        z3 = z4;
                        c2 = c4;
                    } else if (reorderedChildAt.getVisibility() == 8) {
                        i8 = i6;
                        z3 = true;
                        c2 = 4;
                    } else {
                        layoutParams = (LayoutParams) reorderedChildAt.getLayoutParams();
                        f4 = f + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
                        f5 = f2 - ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
                        if (hasDividerBeforeChildAtAlongMainAxis(i7, i6)) {
                            int i18 = this.mDividerHorizontalHeight;
                            float f9 = i18;
                            f6 = f4 + f9;
                            i9 = i18;
                            f7 = f5 - f9;
                        } else {
                            f6 = f4;
                            f7 = f5;
                            i9 = 0;
                        }
                        if (i6 == flexLine.mItemCount - 1) {
                            c3 = 4;
                            i10 = (this.mShowDividerHorizontal & 4) > 0 ? this.mDividerHorizontalHeight : 0;
                            if (z) {
                                i8 = i6;
                                z3 = true;
                                layoutParams2 = layoutParams;
                                c2 = c3;
                                if (z2) {
                                    this.mFlexboxHelper.layoutSingleChildVertical(reorderedChildAt, flexLine, false, paddingLeft, Math.round(f7) - reorderedChildAt.getMeasuredHeight(), paddingLeft + reorderedChildAt.getMeasuredWidth(), Math.round(f7));
                                } else {
                                    this.mFlexboxHelper.layoutSingleChildVertical(reorderedChildAt, flexLine, false, paddingLeft, Math.round(f6), paddingLeft + reorderedChildAt.getMeasuredWidth(), Math.round(f6) + reorderedChildAt.getMeasuredHeight());
                                }
                            } else if (z2) {
                                i8 = i6;
                                z3 = true;
                                layoutParams2 = layoutParams;
                                c2 = c3;
                                this.mFlexboxHelper.layoutSingleChildVertical(reorderedChildAt, flexLine, true, i12 - reorderedChildAt.getMeasuredWidth(), Math.round(f7) - reorderedChildAt.getMeasuredHeight(), i12, Math.round(f7));
                            } else {
                                i8 = i6;
                                z3 = true;
                                layoutParams2 = layoutParams;
                                c2 = c3;
                                this.mFlexboxHelper.layoutSingleChildVertical(reorderedChildAt, flexLine, true, i12 - reorderedChildAt.getMeasuredWidth(), Math.round(f6), i12, Math.round(f6) + reorderedChildAt.getMeasuredHeight());
                            }
                            LayoutParams layoutParams3 = layoutParams2;
                            float measuredHeight = f6 + reorderedChildAt.getMeasuredHeight() + fMax + ((ViewGroup.MarginLayoutParams) layoutParams3).bottomMargin;
                            float measuredHeight2 = f7 - ((reorderedChildAt.getMeasuredHeight() + fMax) + ((ViewGroup.MarginLayoutParams) layoutParams3).topMargin);
                            if (z2) {
                                flexLine.updatePositionFromView(reorderedChildAt, 0, i10, 0, i9);
                            } else {
                                flexLine.updatePositionFromView(reorderedChildAt, 0, i9, 0, i10);
                            }
                            f = measuredHeight;
                            f2 = measuredHeight2;
                        } else {
                            c3 = 4;
                        }
                        if (z) {
                            i8 = i6;
                            z3 = true;
                            layoutParams2 = layoutParams;
                            c2 = c3;
                            if (z2) {
                                this.mFlexboxHelper.layoutSingleChildVertical(reorderedChildAt, flexLine, false, paddingLeft, Math.round(f7) - reorderedChildAt.getMeasuredHeight(), paddingLeft + reorderedChildAt.getMeasuredWidth(), Math.round(f7));
                            } else {
                                this.mFlexboxHelper.layoutSingleChildVertical(reorderedChildAt, flexLine, false, paddingLeft, Math.round(f6), paddingLeft + reorderedChildAt.getMeasuredWidth(), Math.round(f6) + reorderedChildAt.getMeasuredHeight());
                            }
                        } else if (z2) {
                            i8 = i6;
                            z3 = true;
                            layoutParams2 = layoutParams;
                            c2 = c3;
                            this.mFlexboxHelper.layoutSingleChildVertical(reorderedChildAt, flexLine, true, i12 - reorderedChildAt.getMeasuredWidth(), Math.round(f7) - reorderedChildAt.getMeasuredHeight(), i12, Math.round(f7));
                        } else {
                            i8 = i6;
                            z3 = true;
                            layoutParams2 = layoutParams;
                            c2 = c3;
                            this.mFlexboxHelper.layoutSingleChildVertical(reorderedChildAt, flexLine, true, i12 - reorderedChildAt.getMeasuredWidth(), Math.round(f6), i12, Math.round(f6) + reorderedChildAt.getMeasuredHeight());
                        }
                        LayoutParams layoutParams4 = layoutParams2;
                        float measuredHeight3 = f6 + reorderedChildAt.getMeasuredHeight() + fMax + ((ViewGroup.MarginLayoutParams) layoutParams4).bottomMargin;
                        float measuredHeight4 = f7 - ((reorderedChildAt.getMeasuredHeight() + fMax) + ((ViewGroup.MarginLayoutParams) layoutParams4).topMargin);
                        if (z2) {
                            flexLine.updatePositionFromView(reorderedChildAt, 0, i10, 0, i9);
                        } else {
                            flexLine.updatePositionFromView(reorderedChildAt, 0, i9, 0, i10);
                        }
                        f = measuredHeight3;
                        f2 = measuredHeight4;
                    }
                    i6 = i8 + 1;
                    z4 = z3;
                    c4 = c2;
                }
                int i19 = flexLine.mCrossSize;
                paddingLeft += i19;
                i12 -= i19;
            } else {
                f = paddingTop;
                i5 = i11 - paddingBottom;
            }
            f2 = i5;
            f3 = 0.0f;
            fMax = Math.max(f3, 0.0f);
            i6 = 0;
            while (i6 < flexLine.mItemCount) {
                i7 = flexLine.mFirstIndex + i6;
                reorderedChildAt = getReorderedChildAt(i7);
                if (reorderedChildAt != null) {
                    i8 = i6;
                    z3 = z4;
                    c2 = c4;
                } else if (reorderedChildAt.getVisibility() == 8) {
                    i8 = i6;
                    z3 = true;
                    c2 = 4;
                } else {
                    layoutParams = (LayoutParams) reorderedChildAt.getLayoutParams();
                    f4 = f + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
                    f5 = f2 - ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
                    if (hasDividerBeforeChildAtAlongMainAxis(i7, i6)) {
                        int i110 = this.mDividerHorizontalHeight;
                        float f10 = i110;
                        f6 = f4 + f10;
                        i9 = i110;
                        f7 = f5 - f10;
                    } else {
                        f6 = f4;
                        f7 = f5;
                        i9 = 0;
                    }
                    if (i6 == flexLine.mItemCount - 1) {
                        c3 = 4;
                        if ((this.mShowDividerHorizontal & 4) > 0) {
                        }
                        if (z) {
                            i8 = i6;
                            z3 = true;
                            layoutParams2 = layoutParams;
                            c2 = c3;
                            if (z2) {
                                this.mFlexboxHelper.layoutSingleChildVertical(reorderedChildAt, flexLine, false, paddingLeft, Math.round(f7) - reorderedChildAt.getMeasuredHeight(), paddingLeft + reorderedChildAt.getMeasuredWidth(), Math.round(f7));
                            } else {
                                this.mFlexboxHelper.layoutSingleChildVertical(reorderedChildAt, flexLine, false, paddingLeft, Math.round(f6), paddingLeft + reorderedChildAt.getMeasuredWidth(), Math.round(f6) + reorderedChildAt.getMeasuredHeight());
                            }
                        } else if (z2) {
                            i8 = i6;
                            z3 = true;
                            layoutParams2 = layoutParams;
                            c2 = c3;
                            this.mFlexboxHelper.layoutSingleChildVertical(reorderedChildAt, flexLine, true, i12 - reorderedChildAt.getMeasuredWidth(), Math.round(f7) - reorderedChildAt.getMeasuredHeight(), i12, Math.round(f7));
                        } else {
                            i8 = i6;
                            z3 = true;
                            layoutParams2 = layoutParams;
                            c2 = c3;
                            this.mFlexboxHelper.layoutSingleChildVertical(reorderedChildAt, flexLine, true, i12 - reorderedChildAt.getMeasuredWidth(), Math.round(f6), i12, Math.round(f6) + reorderedChildAt.getMeasuredHeight());
                        }
                        LayoutParams layoutParams5 = layoutParams2;
                        float measuredHeight5 = f6 + reorderedChildAt.getMeasuredHeight() + fMax + ((ViewGroup.MarginLayoutParams) layoutParams5).bottomMargin;
                        float measuredHeight6 = f7 - ((reorderedChildAt.getMeasuredHeight() + fMax) + ((ViewGroup.MarginLayoutParams) layoutParams5).topMargin);
                        if (z2) {
                            flexLine.updatePositionFromView(reorderedChildAt, 0, i10, 0, i9);
                        } else {
                            flexLine.updatePositionFromView(reorderedChildAt, 0, i9, 0, i10);
                        }
                        f = measuredHeight5;
                        f2 = measuredHeight6;
                    } else {
                        c3 = 4;
                    }
                    if (z) {
                        i8 = i6;
                        z3 = true;
                        layoutParams2 = layoutParams;
                        c2 = c3;
                        if (z2) {
                            this.mFlexboxHelper.layoutSingleChildVertical(reorderedChildAt, flexLine, false, paddingLeft, Math.round(f7) - reorderedChildAt.getMeasuredHeight(), paddingLeft + reorderedChildAt.getMeasuredWidth(), Math.round(f7));
                        } else {
                            this.mFlexboxHelper.layoutSingleChildVertical(reorderedChildAt, flexLine, false, paddingLeft, Math.round(f6), paddingLeft + reorderedChildAt.getMeasuredWidth(), Math.round(f6) + reorderedChildAt.getMeasuredHeight());
                        }
                    } else if (z2) {
                        i8 = i6;
                        z3 = true;
                        layoutParams2 = layoutParams;
                        c2 = c3;
                        this.mFlexboxHelper.layoutSingleChildVertical(reorderedChildAt, flexLine, true, i12 - reorderedChildAt.getMeasuredWidth(), Math.round(f7) - reorderedChildAt.getMeasuredHeight(), i12, Math.round(f7));
                    } else {
                        i8 = i6;
                        z3 = true;
                        layoutParams2 = layoutParams;
                        c2 = c3;
                        this.mFlexboxHelper.layoutSingleChildVertical(reorderedChildAt, flexLine, true, i12 - reorderedChildAt.getMeasuredWidth(), Math.round(f6), i12, Math.round(f6) + reorderedChildAt.getMeasuredHeight());
                    }
                    LayoutParams layoutParams6 = layoutParams2;
                    float measuredHeight7 = f6 + reorderedChildAt.getMeasuredHeight() + fMax + ((ViewGroup.MarginLayoutParams) layoutParams6).bottomMargin;
                    float measuredHeight8 = f7 - ((reorderedChildAt.getMeasuredHeight() + fMax) + ((ViewGroup.MarginLayoutParams) layoutParams6).topMargin);
                    if (z2) {
                        flexLine.updatePositionFromView(reorderedChildAt, 0, i10, 0, i9);
                    } else {
                        flexLine.updatePositionFromView(reorderedChildAt, 0, i9, 0, i10);
                    }
                    f = measuredHeight7;
                    f2 = measuredHeight8;
                }
                i6 = i8 + 1;
                z4 = z3;
                c4 = c2;
            }
            int i111 = flexLine.mCrossSize;
            paddingLeft += i111;
            i12 -= i111;
        }
    }

    private void measureHorizontal(int i, int i2) {
        this.mFlexLines.clear();
        this.mFlexLinesResult.reset();
        this.mFlexboxHelper.calculateHorizontalFlexLines(this.mFlexLinesResult, i, i2);
        this.mFlexLines = this.mFlexLinesResult.mFlexLines;
        this.mFlexboxHelper.determineMainSize(i, i2);
        if (this.mAlignItems == 3) {
            for (FlexLine flexLine : this.mFlexLines) {
                int iMax = Integer.MIN_VALUE;
                for (int i3 = 0; i3 < flexLine.mItemCount; i3++) {
                    View reorderedChildAt = getReorderedChildAt(flexLine.mFirstIndex + i3);
                    if (reorderedChildAt != null && reorderedChildAt.getVisibility() != 8) {
                        LayoutParams layoutParams = (LayoutParams) reorderedChildAt.getLayoutParams();
                        iMax = this.mFlexWrap != 2 ? Math.max(iMax, reorderedChildAt.getMeasuredHeight() + Math.max(flexLine.mMaxBaseline - reorderedChildAt.getBaseline(), ((ViewGroup.MarginLayoutParams) layoutParams).topMargin) + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin) : Math.max(iMax, reorderedChildAt.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + Math.max((flexLine.mMaxBaseline - reorderedChildAt.getMeasuredHeight()) + reorderedChildAt.getBaseline(), ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin));
                    }
                }
                flexLine.mCrossSize = iMax;
            }
        }
        this.mFlexboxHelper.determineCrossSize(i, i2, getPaddingTop() + getPaddingBottom());
        this.mFlexboxHelper.stretchViews();
        setMeasuredDimensionForFlex(this.mFlexDirection, i, i2, this.mFlexLinesResult.mChildState);
    }

    private void measureVertical(int i, int i2) {
        this.mFlexLines.clear();
        this.mFlexLinesResult.reset();
        this.mFlexboxHelper.calculateVerticalFlexLines(this.mFlexLinesResult, i, i2);
        this.mFlexLines = this.mFlexLinesResult.mFlexLines;
        this.mFlexboxHelper.determineMainSize(i, i2);
        this.mFlexboxHelper.determineCrossSize(i, i2, getPaddingLeft() + getPaddingRight());
        this.mFlexboxHelper.stretchViews();
        setMeasuredDimensionForFlex(this.mFlexDirection, i, i2, this.mFlexLinesResult.mChildState);
    }

    private void setMeasuredDimensionForFlex(int i, int i2, int i3, int i4) {
        int sumOfCrossSize;
        int largestMainSize;
        int iResolveSizeAndState;
        int iResolveSizeAndState2;
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int size2 = View.MeasureSpec.getSize(i3);
        if (i == 0 || i == 1) {
            sumOfCrossSize = getSumOfCrossSize() + getPaddingTop() + getPaddingBottom();
            largestMainSize = getLargestMainSize();
        } else {
            if (i != 2 && i != 3) {
                throw new IllegalArgumentException("Invalid flex direction: " + i);
            }
            sumOfCrossSize = getLargestMainSize();
            largestMainSize = getSumOfCrossSize() + getPaddingLeft() + getPaddingRight();
        }
        if (mode == Integer.MIN_VALUE) {
            if (size < largestMainSize) {
                i4 = View.combineMeasuredStates(i4, 16777216);
            } else {
                size = largestMainSize;
            }
            iResolveSizeAndState = View.resolveSizeAndState(size, i2, i4);
        } else if (mode == 0) {
            iResolveSizeAndState = View.resolveSizeAndState(largestMainSize, i2, i4);
        } else {
            if (mode != 1073741824) {
                throw new IllegalStateException("Unknown width mode is set: " + mode);
            }
            if (size < largestMainSize) {
                i4 = View.combineMeasuredStates(i4, 16777216);
            }
            iResolveSizeAndState = View.resolveSizeAndState(size, i2, i4);
        }
        if (mode2 == Integer.MIN_VALUE) {
            if (size2 < sumOfCrossSize) {
                i4 = View.combineMeasuredStates(i4, 256);
            } else {
                size2 = sumOfCrossSize;
            }
            iResolveSizeAndState2 = View.resolveSizeAndState(size2, i3, i4);
        } else if (mode2 == 0) {
            iResolveSizeAndState2 = View.resolveSizeAndState(sumOfCrossSize, i3, i4);
        } else {
            if (mode2 != 1073741824) {
                throw new IllegalStateException("Unknown height mode is set: " + mode2);
            }
            if (size2 < sumOfCrossSize) {
                i4 = View.combineMeasuredStates(i4, 256);
            }
            iResolveSizeAndState2 = View.resolveSizeAndState(size2, i3, i4);
        }
        setMeasuredDimension(iResolveSizeAndState, iResolveSizeAndState2);
    }

    private void setWillNotDrawFlag() {
        if (this.mDividerDrawableHorizontal == null && this.mDividerDrawableVertical == null) {
            setWillNotDraw(true);
        } else {
            setWillNotDraw(false);
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (this.mOrderCache == null) {
            this.mOrderCache = new SparseIntArray(getChildCount());
        }
        this.mReorderedIndices = this.mFlexboxHelper.createReorderedIndices(view, i, layoutParams, this.mOrderCache);
        super.addView(view, i, layoutParams);
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    @Override // com.google.android.flexbox.FlexContainer
    public int getAlignContent() {
        return this.mAlignContent;
    }

    @Override // com.google.android.flexbox.FlexContainer
    public int getAlignItems() {
        return this.mAlignItems;
    }

    @Override // com.google.android.flexbox.FlexContainer
    public int getChildHeightMeasureSpec(int i, int i2, int i3) {
        return ViewGroup.getChildMeasureSpec(i, i2, i3);
    }

    @Override // com.google.android.flexbox.FlexContainer
    public int getChildWidthMeasureSpec(int i, int i2, int i3) {
        return ViewGroup.getChildMeasureSpec(i, i2, i3);
    }

    @Override // com.google.android.flexbox.FlexContainer
    public int getDecorationLengthCrossAxis(View view) {
        return 0;
    }

    @Override // com.google.android.flexbox.FlexContainer
    public int getDecorationLengthMainAxis(View view, int i, int i2) {
        int i3;
        int i4;
        if (isMainAxisDirectionHorizontal()) {
            i3 = hasDividerBeforeChildAtAlongMainAxis(i, i2) ? 0 + this.mDividerVerticalWidth : 0;
            if ((this.mShowDividerVertical & 4) <= 0) {
                return i3;
            }
            i4 = this.mDividerVerticalWidth;
        } else {
            i3 = hasDividerBeforeChildAtAlongMainAxis(i, i2) ? 0 + this.mDividerHorizontalHeight : 0;
            if ((this.mShowDividerHorizontal & 4) <= 0) {
                return i3;
            }
            i4 = this.mDividerHorizontalHeight;
        }
        return i3 + i4;
    }

    @Nullable
    public Drawable getDividerDrawableHorizontal() {
        return this.mDividerDrawableHorizontal;
    }

    @Nullable
    public Drawable getDividerDrawableVertical() {
        return this.mDividerDrawableVertical;
    }

    @Override // com.google.android.flexbox.FlexContainer
    public int getFlexDirection() {
        return this.mFlexDirection;
    }

    @Override // com.google.android.flexbox.FlexContainer
    public View getFlexItemAt(int i) {
        return getChildAt(i);
    }

    @Override // com.google.android.flexbox.FlexContainer
    public int getFlexItemCount() {
        return getChildCount();
    }

    @Override // com.google.android.flexbox.FlexContainer
    public List<FlexLine> getFlexLines() {
        ArrayList arrayList = new ArrayList(this.mFlexLines.size());
        for (FlexLine flexLine : this.mFlexLines) {
            if (flexLine.getItemCountNotGone() != 0) {
                arrayList.add(flexLine);
            }
        }
        return arrayList;
    }

    @Override // com.google.android.flexbox.FlexContainer
    public List<FlexLine> getFlexLinesInternal() {
        return this.mFlexLines;
    }

    @Override // com.google.android.flexbox.FlexContainer
    public int getFlexWrap() {
        return this.mFlexWrap;
    }

    @Override // com.google.android.flexbox.FlexContainer
    public int getJustifyContent() {
        return this.mJustifyContent;
    }

    @Override // com.google.android.flexbox.FlexContainer
    public int getLargestMainSize() {
        Iterator<FlexLine> it = this.mFlexLines.iterator();
        int iMax = Integer.MIN_VALUE;
        while (it.hasNext()) {
            iMax = Math.max(iMax, it.next().mMainSize);
        }
        return iMax;
    }

    @Override // com.google.android.flexbox.FlexContainer
    public int getMaxLine() {
        return this.mMaxLine;
    }

    public View getReorderedChildAt(int i) {
        if (i < 0) {
            return null;
        }
        int[] iArr = this.mReorderedIndices;
        if (i >= iArr.length) {
            return null;
        }
        return getChildAt(iArr[i]);
    }

    @Override // com.google.android.flexbox.FlexContainer
    public View getReorderedFlexItemAt(int i) {
        return getReorderedChildAt(i);
    }

    public int getShowDividerHorizontal() {
        return this.mShowDividerHorizontal;
    }

    public int getShowDividerVertical() {
        return this.mShowDividerVertical;
    }

    @Override // com.google.android.flexbox.FlexContainer
    public int getSumOfCrossSize() {
        int size = this.mFlexLines.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            FlexLine flexLine = this.mFlexLines.get(i2);
            if (hasDividerBeforeFlexLine(i2)) {
                i += isMainAxisDirectionHorizontal() ? this.mDividerHorizontalHeight : this.mDividerVerticalWidth;
            }
            if (hasEndDividerAfterFlexLine(i2)) {
                i += isMainAxisDirectionHorizontal() ? this.mDividerHorizontalHeight : this.mDividerVerticalWidth;
            }
            i += flexLine.mCrossSize;
        }
        return i;
    }

    @Override // com.google.android.flexbox.FlexContainer
    public boolean isMainAxisDirectionHorizontal() {
        int i = this.mFlexDirection;
        return i == 0 || i == 1;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (this.mDividerDrawableVertical == null && this.mDividerDrawableHorizontal == null) {
            return;
        }
        if (this.mShowDividerHorizontal == 0 && this.mShowDividerVertical == 0) {
            return;
        }
        int layoutDirection = ViewCompat.getLayoutDirection(this);
        int i = this.mFlexDirection;
        if (i == 0) {
            drawDividersHorizontal(canvas, layoutDirection == 1, this.mFlexWrap == 2);
            return;
        }
        if (i == 1) {
            drawDividersHorizontal(canvas, layoutDirection != 1, this.mFlexWrap == 2);
            return;
        }
        if (i == 2) {
            boolean z = layoutDirection == 1;
            if (this.mFlexWrap == 2) {
                z = !z;
            }
            drawDividersVertical(canvas, z, false);
            return;
        }
        if (i != 3) {
            return;
        }
        boolean z2 = layoutDirection == 1;
        if (this.mFlexWrap == 2) {
            z2 = !z2;
        }
        drawDividersVertical(canvas, z2, true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2;
        int layoutDirection = ViewCompat.getLayoutDirection(this);
        int i5 = this.mFlexDirection;
        if (i5 == 0) {
            layoutHorizontal(layoutDirection == 1, i, i2, i3, i4);
            return;
        }
        if (i5 == 1) {
            layoutHorizontal(layoutDirection != 1, i, i2, i3, i4);
            return;
        }
        if (i5 == 2) {
            z2 = layoutDirection == 1;
            layoutVertical(this.mFlexWrap == 2 ? !z2 : z2, false, i, i2, i3, i4);
        } else if (i5 == 3) {
            z2 = layoutDirection == 1;
            layoutVertical(this.mFlexWrap == 2 ? !z2 : z2, true, i, i2, i3, i4);
        } else {
            throw new IllegalStateException("Invalid flex direction is set: " + this.mFlexDirection);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        if (this.mOrderCache == null) {
            this.mOrderCache = new SparseIntArray(getChildCount());
        }
        if (this.mFlexboxHelper.isOrderChangedFromLastMeasurement(this.mOrderCache)) {
            this.mReorderedIndices = this.mFlexboxHelper.createReorderedIndices(this.mOrderCache);
        }
        int i3 = this.mFlexDirection;
        if (i3 == 0 || i3 == 1) {
            measureHorizontal(i, i2);
            return;
        }
        if (i3 == 2 || i3 == 3) {
            measureVertical(i, i2);
            return;
        }
        throw new IllegalStateException("Invalid value for the flex direction is set: " + this.mFlexDirection);
    }

    @Override // com.google.android.flexbox.FlexContainer
    public void onNewFlexItemAdded(View view, int i, int i2, FlexLine flexLine) {
        if (hasDividerBeforeChildAtAlongMainAxis(i, i2)) {
            if (isMainAxisDirectionHorizontal()) {
                int i3 = flexLine.mMainSize;
                int i4 = this.mDividerVerticalWidth;
                flexLine.mMainSize = i3 + i4;
                flexLine.mDividerLengthInMainSize += i4;
                return;
            }
            int i5 = flexLine.mMainSize;
            int i6 = this.mDividerHorizontalHeight;
            flexLine.mMainSize = i5 + i6;
            flexLine.mDividerLengthInMainSize += i6;
        }
    }

    @Override // com.google.android.flexbox.FlexContainer
    public void onNewFlexLineAdded(FlexLine flexLine) {
        if (isMainAxisDirectionHorizontal()) {
            if ((this.mShowDividerVertical & 4) > 0) {
                int i = flexLine.mMainSize;
                int i2 = this.mDividerVerticalWidth;
                flexLine.mMainSize = i + i2;
                flexLine.mDividerLengthInMainSize += i2;
                return;
            }
            return;
        }
        if ((this.mShowDividerHorizontal & 4) > 0) {
            int i3 = flexLine.mMainSize;
            int i4 = this.mDividerHorizontalHeight;
            flexLine.mMainSize = i3 + i4;
            flexLine.mDividerLengthInMainSize += i4;
        }
    }

    @Override // com.google.android.flexbox.FlexContainer
    public void setAlignContent(int i) {
        if (this.mAlignContent != i) {
            this.mAlignContent = i;
            requestLayout();
        }
    }

    @Override // com.google.android.flexbox.FlexContainer
    public void setAlignItems(int i) {
        if (this.mAlignItems != i) {
            this.mAlignItems = i;
            requestLayout();
        }
    }

    public void setDividerDrawable(Drawable drawable) {
        setDividerDrawableHorizontal(drawable);
        setDividerDrawableVertical(drawable);
    }

    public void setDividerDrawableHorizontal(@Nullable Drawable drawable) {
        if (drawable == this.mDividerDrawableHorizontal) {
            return;
        }
        this.mDividerDrawableHorizontal = drawable;
        if (drawable != null) {
            this.mDividerHorizontalHeight = drawable.getIntrinsicHeight();
        } else {
            this.mDividerHorizontalHeight = 0;
        }
        setWillNotDrawFlag();
        requestLayout();
    }

    public void setDividerDrawableVertical(@Nullable Drawable drawable) {
        if (drawable == this.mDividerDrawableVertical) {
            return;
        }
        this.mDividerDrawableVertical = drawable;
        if (drawable != null) {
            this.mDividerVerticalWidth = drawable.getIntrinsicWidth();
        } else {
            this.mDividerVerticalWidth = 0;
        }
        setWillNotDrawFlag();
        requestLayout();
    }

    @Override // com.google.android.flexbox.FlexContainer
    public void setFlexDirection(int i) {
        if (this.mFlexDirection != i) {
            this.mFlexDirection = i;
            requestLayout();
        }
    }

    @Override // com.google.android.flexbox.FlexContainer
    public void setFlexLines(List<FlexLine> list) {
        this.mFlexLines = list;
    }

    @Override // com.google.android.flexbox.FlexContainer
    public void setFlexWrap(int i) {
        if (this.mFlexWrap != i) {
            this.mFlexWrap = i;
            requestLayout();
        }
    }

    @Override // com.google.android.flexbox.FlexContainer
    public void setJustifyContent(int i) {
        if (this.mJustifyContent != i) {
            this.mJustifyContent = i;
            requestLayout();
        }
    }

    @Override // com.google.android.flexbox.FlexContainer
    public void setMaxLine(int i) {
        if (this.mMaxLine != i) {
            this.mMaxLine = i;
            requestLayout();
        }
    }

    public void setShowDivider(int i) {
        setShowDividerVertical(i);
        setShowDividerHorizontal(i);
    }

    public void setShowDividerHorizontal(int i) {
        if (i != this.mShowDividerHorizontal) {
            this.mShowDividerHorizontal = i;
            requestLayout();
        }
    }

    public void setShowDividerVertical(int i) {
        if (i != this.mShowDividerVertical) {
            this.mShowDividerVertical = i;
            requestLayout();
        }
    }

    @Override // com.google.android.flexbox.FlexContainer
    public void updateViewCache(int i, View view) {
    }

    public FlexboxLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.view.ViewGroup
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public FlexboxLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mMaxLine = -1;
        this.mFlexboxHelper = new FlexboxHelper(this);
        this.mFlexLines = new ArrayList();
        this.mFlexLinesResult = new FlexboxHelper.FlexLinesResult();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.FlexboxLayout, i, 0);
        this.mFlexDirection = typedArrayObtainStyledAttributes.getInt(R.styleable.FlexboxLayout_flexDirection, 0);
        this.mFlexWrap = typedArrayObtainStyledAttributes.getInt(R.styleable.FlexboxLayout_flexWrap, 0);
        this.mJustifyContent = typedArrayObtainStyledAttributes.getInt(R.styleable.FlexboxLayout_justifyContent, 0);
        this.mAlignItems = typedArrayObtainStyledAttributes.getInt(R.styleable.FlexboxLayout_alignItems, 0);
        this.mAlignContent = typedArrayObtainStyledAttributes.getInt(R.styleable.FlexboxLayout_alignContent, 0);
        this.mMaxLine = typedArrayObtainStyledAttributes.getInt(R.styleable.FlexboxLayout_maxLine, -1);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(R.styleable.FlexboxLayout_dividerDrawable);
        if (drawable != null) {
            setDividerDrawableHorizontal(drawable);
            setDividerDrawableVertical(drawable);
        }
        Drawable drawable2 = typedArrayObtainStyledAttributes.getDrawable(R.styleable.FlexboxLayout_dividerDrawableHorizontal);
        if (drawable2 != null) {
            setDividerDrawableHorizontal(drawable2);
        }
        Drawable drawable3 = typedArrayObtainStyledAttributes.getDrawable(R.styleable.FlexboxLayout_dividerDrawableVertical);
        if (drawable3 != null) {
            setDividerDrawableVertical(drawable3);
        }
        int i2 = typedArrayObtainStyledAttributes.getInt(R.styleable.FlexboxLayout_showDivider, 0);
        if (i2 != 0) {
            this.mShowDividerVertical = i2;
            this.mShowDividerHorizontal = i2;
        }
        int i3 = typedArrayObtainStyledAttributes.getInt(R.styleable.FlexboxLayout_showDividerVertical, 0);
        if (i3 != 0) {
            this.mShowDividerVertical = i3;
        }
        int i4 = typedArrayObtainStyledAttributes.getInt(R.styleable.FlexboxLayout_showDividerHorizontal, 0);
        if (i4 != 0) {
            this.mShowDividerHorizontal = i4;
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LayoutParams) {
            return new LayoutParams((LayoutParams) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new LayoutParams(layoutParams);
    }

    public static class LayoutParams extends ViewGroup.MarginLayoutParams implements FlexItem {
        public static final Parcelable.Creator<LayoutParams> CREATOR = new Parcelable.Creator<LayoutParams>() { // from class: com.google.android.flexbox.FlexboxLayout.LayoutParams.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public LayoutParams createFromParcel(Parcel parcel) {
                return new LayoutParams(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public LayoutParams[] newArray(int i) {
                return new LayoutParams[i];
            }
        };
        private int mAlignSelf;
        private float mFlexBasisPercent;
        private float mFlexGrow;
        private float mFlexShrink;
        private int mMaxHeight;
        private int mMaxWidth;
        private int mMinHeight;
        private int mMinWidth;
        private int mOrder;
        private boolean mWrapBefore;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.mOrder = 1;
            this.mFlexGrow = 0.0f;
            this.mFlexShrink = 1.0f;
            this.mAlignSelf = -1;
            this.mFlexBasisPercent = -1.0f;
            this.mMinWidth = -1;
            this.mMinHeight = -1;
            this.mMaxWidth = 16777215;
            this.mMaxHeight = 16777215;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.FlexboxLayout_Layout);
            this.mOrder = typedArrayObtainStyledAttributes.getInt(R.styleable.FlexboxLayout_Layout_layout_order, 1);
            this.mFlexGrow = typedArrayObtainStyledAttributes.getFloat(R.styleable.FlexboxLayout_Layout_layout_flexGrow, 0.0f);
            this.mFlexShrink = typedArrayObtainStyledAttributes.getFloat(R.styleable.FlexboxLayout_Layout_layout_flexShrink, 1.0f);
            this.mAlignSelf = typedArrayObtainStyledAttributes.getInt(R.styleable.FlexboxLayout_Layout_layout_alignSelf, -1);
            this.mFlexBasisPercent = typedArrayObtainStyledAttributes.getFraction(R.styleable.FlexboxLayout_Layout_layout_flexBasisPercent, 1, 1, -1.0f);
            this.mMinWidth = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.FlexboxLayout_Layout_layout_minWidth, -1);
            this.mMinHeight = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.FlexboxLayout_Layout_layout_minHeight, -1);
            this.mMaxWidth = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.FlexboxLayout_Layout_layout_maxWidth, 16777215);
            this.mMaxHeight = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.FlexboxLayout_Layout_layout_maxHeight, 16777215);
            this.mWrapBefore = typedArrayObtainStyledAttributes.getBoolean(R.styleable.FlexboxLayout_Layout_layout_wrapBefore, false);
            typedArrayObtainStyledAttributes.recycle();
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int getAlignSelf() {
            return this.mAlignSelf;
        }

        @Override // com.google.android.flexbox.FlexItem
        public float getFlexBasisPercent() {
            return this.mFlexBasisPercent;
        }

        @Override // com.google.android.flexbox.FlexItem
        public float getFlexGrow() {
            return this.mFlexGrow;
        }

        @Override // com.google.android.flexbox.FlexItem
        public float getFlexShrink() {
            return this.mFlexShrink;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int getHeight() {
            return ((ViewGroup.MarginLayoutParams) this).height;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int getMarginBottom() {
            return ((ViewGroup.MarginLayoutParams) this).bottomMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int getMarginLeft() {
            return ((ViewGroup.MarginLayoutParams) this).leftMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int getMarginRight() {
            return ((ViewGroup.MarginLayoutParams) this).rightMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int getMarginTop() {
            return ((ViewGroup.MarginLayoutParams) this).topMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int getMaxHeight() {
            return this.mMaxHeight;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int getMaxWidth() {
            return this.mMaxWidth;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int getMinHeight() {
            return this.mMinHeight;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int getMinWidth() {
            return this.mMinWidth;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int getOrder() {
            return this.mOrder;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int getWidth() {
            return ((ViewGroup.MarginLayoutParams) this).width;
        }

        @Override // com.google.android.flexbox.FlexItem
        public boolean isWrapBefore() {
            return this.mWrapBefore;
        }

        @Override // com.google.android.flexbox.FlexItem
        public void setAlignSelf(int i) {
            this.mAlignSelf = i;
        }

        @Override // com.google.android.flexbox.FlexItem
        public void setFlexBasisPercent(float f) {
            this.mFlexBasisPercent = f;
        }

        @Override // com.google.android.flexbox.FlexItem
        public void setFlexGrow(float f) {
            this.mFlexGrow = f;
        }

        @Override // com.google.android.flexbox.FlexItem
        public void setFlexShrink(float f) {
            this.mFlexShrink = f;
        }

        @Override // com.google.android.flexbox.FlexItem
        public void setHeight(int i) {
            ((ViewGroup.MarginLayoutParams) this).height = i;
        }

        @Override // com.google.android.flexbox.FlexItem
        public void setMaxHeight(int i) {
            this.mMaxHeight = i;
        }

        @Override // com.google.android.flexbox.FlexItem
        public void setMaxWidth(int i) {
            this.mMaxWidth = i;
        }

        @Override // com.google.android.flexbox.FlexItem
        public void setMinHeight(int i) {
            this.mMinHeight = i;
        }

        @Override // com.google.android.flexbox.FlexItem
        public void setMinWidth(int i) {
            this.mMinWidth = i;
        }

        @Override // com.google.android.flexbox.FlexItem
        public void setOrder(int i) {
            this.mOrder = i;
        }

        @Override // com.google.android.flexbox.FlexItem
        public void setWidth(int i) {
            ((ViewGroup.MarginLayoutParams) this).width = i;
        }

        @Override // com.google.android.flexbox.FlexItem
        public void setWrapBefore(boolean z) {
            this.mWrapBefore = z;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.mOrder);
            parcel.writeFloat(this.mFlexGrow);
            parcel.writeFloat(this.mFlexShrink);
            parcel.writeInt(this.mAlignSelf);
            parcel.writeFloat(this.mFlexBasisPercent);
            parcel.writeInt(this.mMinWidth);
            parcel.writeInt(this.mMinHeight);
            parcel.writeInt(this.mMaxWidth);
            parcel.writeInt(this.mMaxHeight);
            parcel.writeByte(this.mWrapBefore ? (byte) 1 : (byte) 0);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).bottomMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).leftMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).rightMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).topMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).height);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).width);
        }

        public LayoutParams(LayoutParams layoutParams) {
            super((ViewGroup.MarginLayoutParams) layoutParams);
            this.mOrder = 1;
            this.mFlexGrow = 0.0f;
            this.mFlexShrink = 1.0f;
            this.mAlignSelf = -1;
            this.mFlexBasisPercent = -1.0f;
            this.mMinWidth = -1;
            this.mMinHeight = -1;
            this.mMaxWidth = 16777215;
            this.mMaxHeight = 16777215;
            this.mOrder = layoutParams.mOrder;
            this.mFlexGrow = layoutParams.mFlexGrow;
            this.mFlexShrink = layoutParams.mFlexShrink;
            this.mAlignSelf = layoutParams.mAlignSelf;
            this.mFlexBasisPercent = layoutParams.mFlexBasisPercent;
            this.mMinWidth = layoutParams.mMinWidth;
            this.mMinHeight = layoutParams.mMinHeight;
            this.mMaxWidth = layoutParams.mMaxWidth;
            this.mMaxHeight = layoutParams.mMaxHeight;
            this.mWrapBefore = layoutParams.mWrapBefore;
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.mOrder = 1;
            this.mFlexGrow = 0.0f;
            this.mFlexShrink = 1.0f;
            this.mAlignSelf = -1;
            this.mFlexBasisPercent = -1.0f;
            this.mMinWidth = -1;
            this.mMinHeight = -1;
            this.mMaxWidth = 16777215;
            this.mMaxHeight = 16777215;
        }

        public LayoutParams(int i, int i2) {
            super(new ViewGroup.LayoutParams(i, i2));
            this.mOrder = 1;
            this.mFlexGrow = 0.0f;
            this.mFlexShrink = 1.0f;
            this.mAlignSelf = -1;
            this.mFlexBasisPercent = -1.0f;
            this.mMinWidth = -1;
            this.mMinHeight = -1;
            this.mMaxWidth = 16777215;
            this.mMaxHeight = 16777215;
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.mOrder = 1;
            this.mFlexGrow = 0.0f;
            this.mFlexShrink = 1.0f;
            this.mAlignSelf = -1;
            this.mFlexBasisPercent = -1.0f;
            this.mMinWidth = -1;
            this.mMinHeight = -1;
            this.mMaxWidth = 16777215;
            this.mMaxHeight = 16777215;
        }

        public LayoutParams(Parcel parcel) {
            super(0, 0);
            this.mOrder = 1;
            this.mFlexGrow = 0.0f;
            this.mFlexShrink = 1.0f;
            this.mAlignSelf = -1;
            this.mFlexBasisPercent = -1.0f;
            this.mMinWidth = -1;
            this.mMinHeight = -1;
            this.mMaxWidth = 16777215;
            this.mMaxHeight = 16777215;
            this.mOrder = parcel.readInt();
            this.mFlexGrow = parcel.readFloat();
            this.mFlexShrink = parcel.readFloat();
            this.mAlignSelf = parcel.readInt();
            this.mFlexBasisPercent = parcel.readFloat();
            this.mMinWidth = parcel.readInt();
            this.mMinHeight = parcel.readInt();
            this.mMaxWidth = parcel.readInt();
            this.mMaxHeight = parcel.readInt();
            this.mWrapBefore = parcel.readByte() != 0;
            ((ViewGroup.MarginLayoutParams) this).bottomMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).leftMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).rightMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).topMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).height = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).width = parcel.readInt();
        }
    }
}
