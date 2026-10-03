package com.google.android.flexbox;

import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.core.view.MarginLayoutParamsCompat;
import androidx.core.widget.CompoundButtonCompat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
class FlexboxHelper {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final int INITIAL_CAPACITY = 10;
    private static final long MEASURE_SPEC_WIDTH_MASK = 4294967295L;
    private boolean[] mChildrenFrozen;
    private final FlexContainer mFlexContainer;

    @Nullable
    int[] mIndexToFlexLine;

    @Nullable
    long[] mMeasureSpecCache;

    @Nullable
    private long[] mMeasuredSizeCache;

    public static class FlexLinesResult {
        int mChildState;
        List<FlexLine> mFlexLines;

        public void reset() {
            this.mFlexLines = null;
            this.mChildState = 0;
        }
    }

    public static class Order implements Comparable<Order> {
        int index;
        int order;

        private Order() {
        }

        @NonNull
        public String toString() {
            return "Order{order=" + this.order + ", index=" + this.index + '}';
        }

        @Override // java.lang.Comparable
        public int compareTo(@NonNull Order order) {
            int i = this.order;
            int i2 = order.order;
            return i != i2 ? i - i2 : this.index - order.index;
        }
    }

    public FlexboxHelper(FlexContainer flexContainer) {
        this.mFlexContainer = flexContainer;
    }

    private void addFlexLine(List<FlexLine> list, FlexLine flexLine, int i, int i2) {
        flexLine.mSumCrossSizeBefore = i2;
        this.mFlexContainer.onNewFlexLineAdded(flexLine);
        flexLine.mLastIndex = i;
        list.add(flexLine);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x002d  */
    /* JADX WARN: Code duplicated, block: B:13:0x0032  */
    /* JADX WARN: Code duplicated, block: B:15:0x0038  */
    /* JADX WARN: Code duplicated, block: B:16:0x003d  */
    /* JADX WARN: Code duplicated, block: B:18:0x0040  */
    /* JADX WARN: Code duplicated, block: B:20:? A[RETURN, SYNTHETIC] */
    private void checkSizeConstraints(View view, int i) {
        boolean z;
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        boolean z2 = true;
        if (measuredWidth >= flexItem.getMinWidth()) {
            if (measuredWidth > flexItem.getMaxWidth()) {
                measuredWidth = flexItem.getMaxWidth();
            } else {
                z = false;
            }
            if (measuredHeight < flexItem.getMinHeight()) {
                measuredHeight = flexItem.getMinHeight();
            } else if (measuredHeight > flexItem.getMaxHeight()) {
                measuredHeight = flexItem.getMaxHeight();
            } else {
                z2 = z;
            }
            if (z2) {
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
                int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
                view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                updateMeasureCache(i, iMakeMeasureSpec, iMakeMeasureSpec2, view);
                this.mFlexContainer.updateViewCache(i, view);
            }
        }
        measuredWidth = flexItem.getMinWidth();
        z = true;
        if (measuredHeight < flexItem.getMinHeight()) {
            measuredHeight = flexItem.getMinHeight();
        } else if (measuredHeight > flexItem.getMaxHeight()) {
            measuredHeight = flexItem.getMaxHeight();
        } else {
            z2 = z;
        }
        if (z2) {
            int iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
            int iMakeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
            view.measure(iMakeMeasureSpec3, iMakeMeasureSpec4);
            updateMeasureCache(i, iMakeMeasureSpec3, iMakeMeasureSpec4, view);
            this.mFlexContainer.updateViewCache(i, view);
        }
    }

    private List<FlexLine> constructFlexLinesForAlignContentCenter(List<FlexLine> list, int i, int i2) {
        int i3 = (i - i2) / 2;
        ArrayList arrayList = new ArrayList();
        FlexLine flexLine = new FlexLine();
        flexLine.mCrossSize = i3;
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            if (i4 == 0) {
                arrayList.add(flexLine);
            }
            arrayList.add(list.get(i4));
            if (i4 == list.size() - 1) {
                arrayList.add(flexLine);
            }
        }
        return arrayList;
    }

    @NonNull
    private List<Order> createOrders(int i) {
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            FlexItem flexItem = (FlexItem) this.mFlexContainer.getFlexItemAt(i2).getLayoutParams();
            Order order = new Order();
            order.order = flexItem.getOrder();
            order.index = i2;
            arrayList.add(order);
        }
        return arrayList;
    }

    private void ensureChildrenFrozen(int i) {
        boolean[] zArr = this.mChildrenFrozen;
        if (zArr == null) {
            this.mChildrenFrozen = new boolean[Math.max(i, 10)];
        } else if (zArr.length < i) {
            this.mChildrenFrozen = new boolean[Math.max(zArr.length * 2, i)];
        } else {
            Arrays.fill(zArr, false);
        }
    }

    private void evaluateMinimumSizeForCompoundButton(CompoundButton compoundButton) {
        FlexItem flexItem = (FlexItem) compoundButton.getLayoutParams();
        int minWidth = flexItem.getMinWidth();
        int minHeight = flexItem.getMinHeight();
        Drawable buttonDrawable = CompoundButtonCompat.getButtonDrawable(compoundButton);
        int minimumWidth = buttonDrawable == null ? 0 : buttonDrawable.getMinimumWidth();
        int minimumHeight = buttonDrawable != null ? buttonDrawable.getMinimumHeight() : 0;
        if (minWidth == -1) {
            minWidth = minimumWidth;
        }
        flexItem.setMinWidth(minWidth);
        if (minHeight == -1) {
            minHeight = minimumHeight;
        }
        flexItem.setMinHeight(minHeight);
    }

    private void expandFlexItems(int i, int i2, FlexLine flexLine, int i3, int i4, boolean z) {
        int i5;
        int i6;
        int iMax;
        double d;
        double d2;
        float f = flexLine.mTotalFlexGrow;
        float f2 = 0.0f;
        if (f <= 0.0f || i3 < (i5 = flexLine.mMainSize)) {
            return;
        }
        float f3 = (i3 - i5) / f;
        flexLine.mMainSize = i4 + flexLine.mDividerLengthInMainSize;
        if (!z) {
            flexLine.mCrossSize = Integer.MIN_VALUE;
        }
        int i7 = 0;
        boolean z2 = false;
        int i8 = 0;
        float f4 = 0.0f;
        while (i7 < flexLine.mItemCount) {
            int i9 = flexLine.mFirstIndex + i7;
            View reorderedFlexItemAt = this.mFlexContainer.getReorderedFlexItemAt(i9);
            if (reorderedFlexItemAt == null || reorderedFlexItemAt.getVisibility() == 8) {
                i6 = i5;
            } else {
                FlexItem flexItem = (FlexItem) reorderedFlexItemAt.getLayoutParams();
                int flexDirection = this.mFlexContainer.getFlexDirection();
                if (flexDirection == 0 || flexDirection == 1) {
                    i6 = i5;
                    int measuredWidth = reorderedFlexItemAt.getMeasuredWidth();
                    long[] jArr = this.mMeasuredSizeCache;
                    if (jArr != null) {
                        measuredWidth = extractLowerInt(jArr[i9]);
                    }
                    int measuredHeight = reorderedFlexItemAt.getMeasuredHeight();
                    long[] jArr2 = this.mMeasuredSizeCache;
                    if (jArr2 != null) {
                        measuredHeight = extractHigherInt(jArr2[i9]);
                    }
                    if (!this.mChildrenFrozen[i9] && flexItem.getFlexGrow() > 0.0f) {
                        float flexGrow = measuredWidth + (flexItem.getFlexGrow() * f3);
                        if (i7 == flexLine.mItemCount - 1) {
                            flexGrow += f4;
                            f4 = 0.0f;
                        }
                        int iRound = Math.round(flexGrow);
                        if (iRound > flexItem.getMaxWidth()) {
                            iRound = flexItem.getMaxWidth();
                            this.mChildrenFrozen[i9] = true;
                            flexLine.mTotalFlexGrow -= flexItem.getFlexGrow();
                            z2 = true;
                        } else {
                            f4 += flexGrow - iRound;
                            double d3 = f4;
                            if (d3 > 1.0d) {
                                iRound++;
                                d = d3 - 1.0d;
                            } else if (d3 < -1.0d) {
                                iRound--;
                                d = d3 + 1.0d;
                            }
                            f4 = (float) d;
                        }
                        int childHeightMeasureSpecInternal = getChildHeightMeasureSpecInternal(i2, flexItem, flexLine.mSumCrossSizeBefore);
                        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iRound, 1073741824);
                        reorderedFlexItemAt.measure(iMakeMeasureSpec, childHeightMeasureSpecInternal);
                        int measuredWidth2 = reorderedFlexItemAt.getMeasuredWidth();
                        int measuredHeight2 = reorderedFlexItemAt.getMeasuredHeight();
                        updateMeasureCache(i9, iMakeMeasureSpec, childHeightMeasureSpecInternal, reorderedFlexItemAt);
                        this.mFlexContainer.updateViewCache(i9, reorderedFlexItemAt);
                        measuredWidth = measuredWidth2;
                        measuredHeight = measuredHeight2;
                    }
                    int iMax2 = Math.max(i8, measuredHeight + flexItem.getMarginTop() + flexItem.getMarginBottom() + this.mFlexContainer.getDecorationLengthCrossAxis(reorderedFlexItemAt));
                    flexLine.mMainSize += measuredWidth + flexItem.getMarginLeft() + flexItem.getMarginRight();
                    iMax = iMax2;
                } else {
                    int measuredHeight3 = reorderedFlexItemAt.getMeasuredHeight();
                    long[] jArr3 = this.mMeasuredSizeCache;
                    if (jArr3 != null) {
                        measuredHeight3 = extractHigherInt(jArr3[i9]);
                    }
                    int measuredWidth3 = reorderedFlexItemAt.getMeasuredWidth();
                    long[] jArr4 = this.mMeasuredSizeCache;
                    if (jArr4 != null) {
                        measuredWidth3 = extractLowerInt(jArr4[i9]);
                    }
                    if (this.mChildrenFrozen[i9] || flexItem.getFlexGrow() <= f2) {
                        i6 = i5;
                    } else {
                        float flexGrow2 = measuredHeight3 + (flexItem.getFlexGrow() * f3);
                        if (i7 == flexLine.mItemCount - 1) {
                            flexGrow2 += f4;
                            f4 = f2;
                        }
                        int iRound2 = Math.round(flexGrow2);
                        if (iRound2 > flexItem.getMaxHeight()) {
                            iRound2 = flexItem.getMaxHeight();
                            this.mChildrenFrozen[i9] = true;
                            flexLine.mTotalFlexGrow -= flexItem.getFlexGrow();
                            i6 = i5;
                            z2 = true;
                        } else {
                            f4 += flexGrow2 - iRound2;
                            i6 = i5;
                            double d4 = f4;
                            if (d4 > 1.0d) {
                                iRound2++;
                                d2 = d4 - 1.0d;
                            } else if (d4 < -1.0d) {
                                iRound2--;
                                d2 = d4 + 1.0d;
                            }
                            f4 = (float) d2;
                        }
                        int childWidthMeasureSpecInternal = getChildWidthMeasureSpecInternal(i, flexItem, flexLine.mSumCrossSizeBefore);
                        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iRound2, 1073741824);
                        reorderedFlexItemAt.measure(childWidthMeasureSpecInternal, iMakeMeasureSpec2);
                        measuredWidth3 = reorderedFlexItemAt.getMeasuredWidth();
                        int measuredHeight4 = reorderedFlexItemAt.getMeasuredHeight();
                        updateMeasureCache(i9, childWidthMeasureSpecInternal, iMakeMeasureSpec2, reorderedFlexItemAt);
                        this.mFlexContainer.updateViewCache(i9, reorderedFlexItemAt);
                        measuredHeight3 = measuredHeight4;
                    }
                    iMax = Math.max(i8, measuredWidth3 + flexItem.getMarginLeft() + flexItem.getMarginRight() + this.mFlexContainer.getDecorationLengthCrossAxis(reorderedFlexItemAt));
                    flexLine.mMainSize += measuredHeight3 + flexItem.getMarginTop() + flexItem.getMarginBottom();
                }
                flexLine.mCrossSize = Math.max(flexLine.mCrossSize, iMax);
                i8 = iMax;
            }
            i7++;
            i5 = i6;
            f2 = 0.0f;
        }
        int i10 = i5;
        if (!z2 || i10 == flexLine.mMainSize) {
            return;
        }
        expandFlexItems(i, i2, flexLine, i3, i4, true);
    }

    private int getChildHeightMeasureSpecInternal(int i, FlexItem flexItem, int i2) {
        FlexContainer flexContainer = this.mFlexContainer;
        int childHeightMeasureSpec = flexContainer.getChildHeightMeasureSpec(i, flexContainer.getPaddingTop() + this.mFlexContainer.getPaddingBottom() + flexItem.getMarginTop() + flexItem.getMarginBottom() + i2, flexItem.getHeight());
        int size = View.MeasureSpec.getSize(childHeightMeasureSpec);
        if (size > flexItem.getMaxHeight()) {
            return View.MeasureSpec.makeMeasureSpec(flexItem.getMaxHeight(), View.MeasureSpec.getMode(childHeightMeasureSpec));
        }
        return size < flexItem.getMinHeight() ? View.MeasureSpec.makeMeasureSpec(flexItem.getMinHeight(), View.MeasureSpec.getMode(childHeightMeasureSpec)) : childHeightMeasureSpec;
    }

    private int getChildWidthMeasureSpecInternal(int i, FlexItem flexItem, int i2) {
        FlexContainer flexContainer = this.mFlexContainer;
        int childWidthMeasureSpec = flexContainer.getChildWidthMeasureSpec(i, flexContainer.getPaddingLeft() + this.mFlexContainer.getPaddingRight() + flexItem.getMarginLeft() + flexItem.getMarginRight() + i2, flexItem.getWidth());
        int size = View.MeasureSpec.getSize(childWidthMeasureSpec);
        if (size > flexItem.getMaxWidth()) {
            return View.MeasureSpec.makeMeasureSpec(flexItem.getMaxWidth(), View.MeasureSpec.getMode(childWidthMeasureSpec));
        }
        return size < flexItem.getMinWidth() ? View.MeasureSpec.makeMeasureSpec(flexItem.getMinWidth(), View.MeasureSpec.getMode(childWidthMeasureSpec)) : childWidthMeasureSpec;
    }

    private int getFlexItemMarginEndCross(FlexItem flexItem, boolean z) {
        return z ? flexItem.getMarginBottom() : flexItem.getMarginRight();
    }

    private int getFlexItemMarginEndMain(FlexItem flexItem, boolean z) {
        return z ? flexItem.getMarginRight() : flexItem.getMarginBottom();
    }

    private int getFlexItemMarginStartCross(FlexItem flexItem, boolean z) {
        return z ? flexItem.getMarginTop() : flexItem.getMarginLeft();
    }

    private int getFlexItemMarginStartMain(FlexItem flexItem, boolean z) {
        return z ? flexItem.getMarginLeft() : flexItem.getMarginTop();
    }

    private int getFlexItemSizeCross(FlexItem flexItem, boolean z) {
        return z ? flexItem.getHeight() : flexItem.getWidth();
    }

    private int getFlexItemSizeMain(FlexItem flexItem, boolean z) {
        return z ? flexItem.getWidth() : flexItem.getHeight();
    }

    private int getPaddingEndCross(boolean z) {
        return z ? this.mFlexContainer.getPaddingBottom() : this.mFlexContainer.getPaddingEnd();
    }

    private int getPaddingEndMain(boolean z) {
        return z ? this.mFlexContainer.getPaddingEnd() : this.mFlexContainer.getPaddingBottom();
    }

    private int getPaddingStartCross(boolean z) {
        return z ? this.mFlexContainer.getPaddingTop() : this.mFlexContainer.getPaddingStart();
    }

    private int getPaddingStartMain(boolean z) {
        return z ? this.mFlexContainer.getPaddingStart() : this.mFlexContainer.getPaddingTop();
    }

    private int getViewMeasuredSizeCross(View view, boolean z) {
        return z ? view.getMeasuredHeight() : view.getMeasuredWidth();
    }

    private int getViewMeasuredSizeMain(View view, boolean z) {
        return z ? view.getMeasuredWidth() : view.getMeasuredHeight();
    }

    private boolean isLastFlexItem(int i, int i2, FlexLine flexLine) {
        return i == i2 - 1 && flexLine.getItemCountNotGone() != 0;
    }

    private boolean isWrapRequired(View view, int i, int i2, int i3, int i4, FlexItem flexItem, int i5, int i6, int i7) {
        if (this.mFlexContainer.getFlexWrap() == 0) {
            return false;
        }
        if (flexItem.isWrapBefore()) {
            return true;
        }
        if (i == 0) {
            return false;
        }
        int maxLine = this.mFlexContainer.getMaxLine();
        if (maxLine != -1 && maxLine <= i7 + 1) {
            return false;
        }
        int decorationLengthMainAxis = this.mFlexContainer.getDecorationLengthMainAxis(view, i5, i6);
        if (decorationLengthMainAxis > 0) {
            i4 += decorationLengthMainAxis;
        }
        return i2 < i3 + i4;
    }

    private void shrinkFlexItems(int i, int i2, FlexLine flexLine, int i3, int i4, boolean z) {
        int iMax;
        int i5 = flexLine.mMainSize;
        float f = flexLine.mTotalFlexShrink;
        float f2 = 0.0f;
        if (f <= 0.0f || i3 > i5) {
            return;
        }
        float f3 = (i5 - i3) / f;
        flexLine.mMainSize = i4 + flexLine.mDividerLengthInMainSize;
        if (!z) {
            flexLine.mCrossSize = Integer.MIN_VALUE;
        }
        int i6 = 0;
        boolean z2 = false;
        int i7 = 0;
        float f4 = 0.0f;
        while (i6 < flexLine.mItemCount) {
            int i8 = flexLine.mFirstIndex + i6;
            View reorderedFlexItemAt = this.mFlexContainer.getReorderedFlexItemAt(i8);
            if (reorderedFlexItemAt != null && reorderedFlexItemAt.getVisibility() != 8) {
                FlexItem flexItem = (FlexItem) reorderedFlexItemAt.getLayoutParams();
                int flexDirection = this.mFlexContainer.getFlexDirection();
                if (flexDirection == 0 || flexDirection == 1) {
                    int measuredWidth = reorderedFlexItemAt.getMeasuredWidth();
                    long[] jArr = this.mMeasuredSizeCache;
                    if (jArr != null) {
                        measuredWidth = extractLowerInt(jArr[i8]);
                    }
                    int measuredHeight = reorderedFlexItemAt.getMeasuredHeight();
                    long[] jArr2 = this.mMeasuredSizeCache;
                    if (jArr2 != null) {
                        measuredHeight = extractHigherInt(jArr2[i8]);
                    }
                    if (!this.mChildrenFrozen[i8] && flexItem.getFlexShrink() > 0.0f) {
                        float flexShrink = measuredWidth - (flexItem.getFlexShrink() * f3);
                        if (i6 == flexLine.mItemCount - 1) {
                            flexShrink += f4;
                            f4 = 0.0f;
                        }
                        int iRound = Math.round(flexShrink);
                        if (iRound < flexItem.getMinWidth()) {
                            iRound = flexItem.getMinWidth();
                            this.mChildrenFrozen[i8] = true;
                            flexLine.mTotalFlexShrink -= flexItem.getFlexShrink();
                            z2 = true;
                        } else {
                            f4 += flexShrink - iRound;
                            double d = f4;
                            if (d > 1.0d) {
                                iRound++;
                                f4 -= 1.0f;
                            } else if (d < -1.0d) {
                                iRound--;
                                f4 += 1.0f;
                            }
                        }
                        int childHeightMeasureSpecInternal = getChildHeightMeasureSpecInternal(i2, flexItem, flexLine.mSumCrossSizeBefore);
                        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iRound, 1073741824);
                        reorderedFlexItemAt.measure(iMakeMeasureSpec, childHeightMeasureSpecInternal);
                        int measuredWidth2 = reorderedFlexItemAt.getMeasuredWidth();
                        int measuredHeight2 = reorderedFlexItemAt.getMeasuredHeight();
                        updateMeasureCache(i8, iMakeMeasureSpec, childHeightMeasureSpecInternal, reorderedFlexItemAt);
                        this.mFlexContainer.updateViewCache(i8, reorderedFlexItemAt);
                        measuredWidth = measuredWidth2;
                        measuredHeight = measuredHeight2;
                    }
                    int iMax2 = Math.max(i7, measuredHeight + flexItem.getMarginTop() + flexItem.getMarginBottom() + this.mFlexContainer.getDecorationLengthCrossAxis(reorderedFlexItemAt));
                    flexLine.mMainSize += measuredWidth + flexItem.getMarginLeft() + flexItem.getMarginRight();
                    iMax = iMax2;
                } else {
                    int measuredHeight3 = reorderedFlexItemAt.getMeasuredHeight();
                    long[] jArr3 = this.mMeasuredSizeCache;
                    if (jArr3 != null) {
                        measuredHeight3 = extractHigherInt(jArr3[i8]);
                    }
                    int measuredWidth3 = reorderedFlexItemAt.getMeasuredWidth();
                    long[] jArr4 = this.mMeasuredSizeCache;
                    if (jArr4 != null) {
                        measuredWidth3 = extractLowerInt(jArr4[i8]);
                    }
                    if (!this.mChildrenFrozen[i8] && flexItem.getFlexShrink() > f2) {
                        float flexShrink2 = measuredHeight3 - (flexItem.getFlexShrink() * f3);
                        if (i6 == flexLine.mItemCount - 1) {
                            flexShrink2 += f4;
                            f4 = f2;
                        }
                        int iRound2 = Math.round(flexShrink2);
                        if (iRound2 < flexItem.getMinHeight()) {
                            iRound2 = flexItem.getMinHeight();
                            this.mChildrenFrozen[i8] = true;
                            flexLine.mTotalFlexShrink -= flexItem.getFlexShrink();
                            z2 = true;
                        } else {
                            f4 += flexShrink2 - iRound2;
                            double d2 = f4;
                            if (d2 > 1.0d) {
                                iRound2++;
                                f4 -= 1.0f;
                            } else if (d2 < -1.0d) {
                                iRound2--;
                                f4 += 1.0f;
                            }
                        }
                        int childWidthMeasureSpecInternal = getChildWidthMeasureSpecInternal(i, flexItem, flexLine.mSumCrossSizeBefore);
                        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iRound2, 1073741824);
                        reorderedFlexItemAt.measure(childWidthMeasureSpecInternal, iMakeMeasureSpec2);
                        measuredWidth3 = reorderedFlexItemAt.getMeasuredWidth();
                        int measuredHeight4 = reorderedFlexItemAt.getMeasuredHeight();
                        updateMeasureCache(i8, childWidthMeasureSpecInternal, iMakeMeasureSpec2, reorderedFlexItemAt);
                        this.mFlexContainer.updateViewCache(i8, reorderedFlexItemAt);
                        measuredHeight3 = measuredHeight4;
                    }
                    iMax = Math.max(i7, measuredWidth3 + flexItem.getMarginLeft() + flexItem.getMarginRight() + this.mFlexContainer.getDecorationLengthCrossAxis(reorderedFlexItemAt));
                    flexLine.mMainSize += measuredHeight3 + flexItem.getMarginTop() + flexItem.getMarginBottom();
                }
                flexLine.mCrossSize = Math.max(flexLine.mCrossSize, iMax);
                i7 = iMax;
            }
            i6++;
            f2 = 0.0f;
        }
        if (!z2 || i5 == flexLine.mMainSize) {
            return;
        }
        shrinkFlexItems(i, i2, flexLine, i3, i4, true);
    }

    private int[] sortOrdersIntoReorderedIndices(int i, List<Order> list, SparseIntArray sparseIntArray) {
        Collections.sort(list);
        sparseIntArray.clear();
        int[] iArr = new int[i];
        int i2 = 0;
        for (Order order : list) {
            int i3 = order.index;
            iArr[i2] = i3;
            sparseIntArray.append(i3, order.order);
            i2++;
        }
        return iArr;
    }

    private void stretchViewHorizontally(View view, int i, int i2) {
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        int iMin = Math.min(Math.max(((i - flexItem.getMarginLeft()) - flexItem.getMarginRight()) - this.mFlexContainer.getDecorationLengthCrossAxis(view), flexItem.getMinWidth()), flexItem.getMaxWidth());
        long[] jArr = this.mMeasuredSizeCache;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(jArr != null ? extractHigherInt(jArr[i2]) : view.getMeasuredHeight(), 1073741824);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMin, 1073741824);
        view.measure(iMakeMeasureSpec2, iMakeMeasureSpec);
        updateMeasureCache(i2, iMakeMeasureSpec2, iMakeMeasureSpec, view);
        this.mFlexContainer.updateViewCache(i2, view);
    }

    private void stretchViewVertically(View view, int i, int i2) {
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        int iMin = Math.min(Math.max(((i - flexItem.getMarginTop()) - flexItem.getMarginBottom()) - this.mFlexContainer.getDecorationLengthCrossAxis(view), flexItem.getMinHeight()), flexItem.getMaxHeight());
        long[] jArr = this.mMeasuredSizeCache;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(jArr != null ? extractLowerInt(jArr[i2]) : view.getMeasuredWidth(), 1073741824);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMin, 1073741824);
        view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        updateMeasureCache(i2, iMakeMeasureSpec, iMakeMeasureSpec2, view);
        this.mFlexContainer.updateViewCache(i2, view);
    }

    private void updateMeasureCache(int i, int i2, int i3, View view) {
        long[] jArr = this.mMeasureSpecCache;
        if (jArr != null) {
            jArr[i] = makeCombinedLong(i2, i3);
        }
        long[] jArr2 = this.mMeasuredSizeCache;
        if (jArr2 != null) {
            jArr2[i] = makeCombinedLong(view.getMeasuredWidth(), view.getMeasuredHeight());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void calculateFlexLines(FlexLinesResult flexLinesResult, int i, int i2, int i3, int i4, int i5, @Nullable List<FlexLine> list) {
        int i6;
        int i7;
        List<FlexLine> list2;
        int i8;
        View view;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15 = i2;
        int i16 = i5;
        boolean zIsMainAxisDirectionHorizontal = this.mFlexContainer.isMainAxisDirectionHorizontal();
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        List<FlexLine> arrayList = list == null ? new ArrayList() : list;
        flexLinesResult.mFlexLines = arrayList;
        int i17 = i16 == -1 ? 1 : 0;
        int paddingStartMain = getPaddingStartMain(zIsMainAxisDirectionHorizontal);
        int paddingEndMain = getPaddingEndMain(zIsMainAxisDirectionHorizontal);
        int paddingStartCross = getPaddingStartCross(zIsMainAxisDirectionHorizontal);
        int paddingEndCross = getPaddingEndCross(zIsMainAxisDirectionHorizontal);
        FlexLine flexLine = new FlexLine();
        int i18 = i4;
        flexLine.mFirstIndex = i18;
        int i19 = paddingEndMain + paddingStartMain;
        flexLine.mMainSize = i19;
        int flexItemCount = this.mFlexContainer.getFlexItemCount();
        int i20 = i17;
        int i21 = Integer.MIN_VALUE;
        int i22 = 0;
        int iCombineMeasuredStates = 0;
        int i23 = 0;
        while (i18 < flexItemCount) {
            View reorderedFlexItemAt = this.mFlexContainer.getReorderedFlexItemAt(i18);
            if (reorderedFlexItemAt != null) {
                if (reorderedFlexItemAt.getVisibility() == 8) {
                    flexLine.mGoneItemCount++;
                    flexLine.mItemCount++;
                    if (isLastFlexItem(i18, flexItemCount, flexLine)) {
                        addFlexLine(arrayList, flexLine, i18, i22);
                    }
                } else {
                    if (reorderedFlexItemAt instanceof CompoundButton) {
                        evaluateMinimumSizeForCompoundButton((CompoundButton) reorderedFlexItemAt);
                    }
                    FlexItem flexItem = (FlexItem) reorderedFlexItemAt.getLayoutParams();
                    int i24 = flexItemCount;
                    if (flexItem.getAlignSelf() == 4) {
                        flexLine.mIndicesAlignSelfStretch.add(Integer.valueOf(i18));
                    }
                    int flexItemSizeMain = getFlexItemSizeMain(flexItem, zIsMainAxisDirectionHorizontal);
                    if (flexItem.getFlexBasisPercent() != -1.0f && mode == 1073741824) {
                        flexItemSizeMain = Math.round(size * flexItem.getFlexBasisPercent());
                    }
                    if (zIsMainAxisDirectionHorizontal) {
                        int childWidthMeasureSpec = this.mFlexContainer.getChildWidthMeasureSpec(i, i19 + getFlexItemMarginStartMain(flexItem, true) + getFlexItemMarginEndMain(flexItem, true), flexItemSizeMain);
                        int childHeightMeasureSpec = this.mFlexContainer.getChildHeightMeasureSpec(i15, paddingStartCross + paddingEndCross + getFlexItemMarginStartCross(flexItem, true) + getFlexItemMarginEndCross(flexItem, true) + i22, getFlexItemSizeCross(flexItem, true));
                        reorderedFlexItemAt.measure(childWidthMeasureSpec, childHeightMeasureSpec);
                        updateMeasureCache(i18, childWidthMeasureSpec, childHeightMeasureSpec, reorderedFlexItemAt);
                        i7 = childWidthMeasureSpec;
                    } else {
                        int childWidthMeasureSpec2 = this.mFlexContainer.getChildWidthMeasureSpec(i15, paddingStartCross + paddingEndCross + getFlexItemMarginStartCross(flexItem, false) + getFlexItemMarginEndCross(flexItem, false) + i22, getFlexItemSizeCross(flexItem, false));
                        int childHeightMeasureSpec2 = this.mFlexContainer.getChildHeightMeasureSpec(i, getFlexItemMarginStartMain(flexItem, false) + i19 + getFlexItemMarginEndMain(flexItem, false), flexItemSizeMain);
                        reorderedFlexItemAt.measure(childWidthMeasureSpec2, childHeightMeasureSpec2);
                        updateMeasureCache(i18, childWidthMeasureSpec2, childHeightMeasureSpec2, reorderedFlexItemAt);
                        i7 = childHeightMeasureSpec2;
                    }
                    this.mFlexContainer.updateViewCache(i18, reorderedFlexItemAt);
                    checkSizeConstraints(reorderedFlexItemAt, i18);
                    iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, reorderedFlexItemAt.getMeasuredState());
                    int i25 = flexLine.mMainSize;
                    int i26 = i22;
                    int i27 = i19;
                    FlexLine flexLine2 = flexLine;
                    int i28 = size;
                    int i29 = i18;
                    list2 = arrayList;
                    int i30 = i7;
                    if (isWrapRequired(reorderedFlexItemAt, mode, i28, i25, getFlexItemMarginEndMain(flexItem, zIsMainAxisDirectionHorizontal) + getViewMeasuredSizeMain(reorderedFlexItemAt, zIsMainAxisDirectionHorizontal) + getFlexItemMarginStartMain(flexItem, zIsMainAxisDirectionHorizontal), flexItem, i29, i23, arrayList.size())) {
                        if (flexLine2.getItemCountNotGone() > 0) {
                            addFlexLine(list2, flexLine2, i29 > 0 ? i29 - 1 : 0, i26);
                            i22 = flexLine2.mCrossSize + i26;
                        } else {
                            i22 = i26;
                        }
                        if (!zIsMainAxisDirectionHorizontal) {
                            i8 = i2;
                            view = reorderedFlexItemAt;
                            i18 = i29;
                            if (flexItem.getWidth() == -1) {
                                FlexContainer flexContainer = this.mFlexContainer;
                                view.measure(flexContainer.getChildWidthMeasureSpec(i8, flexContainer.getPaddingLeft() + this.mFlexContainer.getPaddingRight() + flexItem.getMarginLeft() + flexItem.getMarginRight() + i22, flexItem.getWidth()), i30);
                                checkSizeConstraints(view, i18);
                            }
                        } else if (flexItem.getHeight() == -1) {
                            FlexContainer flexContainer2 = this.mFlexContainer;
                            i8 = i2;
                            i18 = i29;
                            view = reorderedFlexItemAt;
                            view.measure(i30, flexContainer2.getChildHeightMeasureSpec(i8, flexContainer2.getPaddingTop() + this.mFlexContainer.getPaddingBottom() + flexItem.getMarginTop() + flexItem.getMarginBottom() + i22, flexItem.getHeight()));
                            checkSizeConstraints(view, i18);
                        } else {
                            i8 = i2;
                            view = reorderedFlexItemAt;
                            i18 = i29;
                        }
                        flexLine = new FlexLine();
                        i10 = 1;
                        flexLine.mItemCount = 1;
                        i9 = i27;
                        flexLine.mMainSize = i9;
                        flexLine.mFirstIndex = i18;
                        i12 = Integer.MIN_VALUE;
                        i11 = 0;
                    } else {
                        i8 = i2;
                        view = reorderedFlexItemAt;
                        i18 = i29;
                        flexLine = flexLine2;
                        i9 = i27;
                        i10 = 1;
                        flexLine.mItemCount++;
                        i11 = i23 + 1;
                        i22 = i26;
                        i12 = i21;
                    }
                    flexLine.mAnyItemsHaveFlexGrow = (flexLine.mAnyItemsHaveFlexGrow ? 1 : 0) | (flexItem.getFlexGrow() != 0.0f ? i10 : 0);
                    flexLine.mAnyItemsHaveFlexShrink = (flexLine.mAnyItemsHaveFlexShrink ? 1 : 0) | (flexItem.getFlexShrink() != 0.0f ? i10 : 0);
                    int[] iArr = this.mIndexToFlexLine;
                    if (iArr != null) {
                        iArr[i18] = list2.size();
                    }
                    flexLine.mMainSize += getViewMeasuredSizeMain(view, zIsMainAxisDirectionHorizontal) + getFlexItemMarginStartMain(flexItem, zIsMainAxisDirectionHorizontal) + getFlexItemMarginEndMain(flexItem, zIsMainAxisDirectionHorizontal);
                    flexLine.mTotalFlexGrow += flexItem.getFlexGrow();
                    flexLine.mTotalFlexShrink += flexItem.getFlexShrink();
                    this.mFlexContainer.onNewFlexItemAdded(view, i18, i11, flexLine);
                    int iMax = Math.max(i12, getViewMeasuredSizeCross(view, zIsMainAxisDirectionHorizontal) + getFlexItemMarginStartCross(flexItem, zIsMainAxisDirectionHorizontal) + getFlexItemMarginEndCross(flexItem, zIsMainAxisDirectionHorizontal) + this.mFlexContainer.getDecorationLengthCrossAxis(view));
                    flexLine.mCrossSize = Math.max(flexLine.mCrossSize, iMax);
                    if (zIsMainAxisDirectionHorizontal) {
                        if (this.mFlexContainer.getFlexWrap() != 2) {
                            flexLine.mMaxBaseline = Math.max(flexLine.mMaxBaseline, view.getBaseline() + flexItem.getMarginTop());
                        } else {
                            flexLine.mMaxBaseline = Math.max(flexLine.mMaxBaseline, (view.getMeasuredHeight() - view.getBaseline()) + flexItem.getMarginBottom());
                        }
                    }
                    i13 = i24;
                    if (isLastFlexItem(i18, i13, flexLine)) {
                        addFlexLine(list2, flexLine, i18, i22);
                        i22 += flexLine.mCrossSize;
                    }
                    i14 = i5;
                    if (i14 != -1 && list2.size() > 0 && list2.get(list2.size() - i10).mLastIndex >= i14 && i18 >= i14 && i20 == 0) {
                        i22 = -flexLine.getCrossSize();
                        i20 = i10;
                    }
                    if (i22 > i3 && i20 != 0) {
                        i6 = iCombineMeasuredStates;
                        flexLinesResult.mChildState = i6;
                    } else {
                        i23 = i11;
                        i21 = iMax;
                    }
                }
                i18++;
                flexItemCount = i13;
                i15 = i8;
                i19 = i9;
                arrayList = list2;
                size = size;
                i16 = i14;
                mode = mode;
            } else if (isLastFlexItem(i18, flexItemCount, flexLine)) {
                addFlexLine(arrayList, flexLine, i18, i22);
            }
            size = size;
            mode = mode;
            i8 = i15;
            i14 = i16;
            list2 = arrayList;
            i9 = i19;
            i13 = flexItemCount;
            i18++;
            flexItemCount = i13;
            i15 = i8;
            i19 = i9;
            arrayList = list2;
            size = size;
            i16 = i14;
            mode = mode;
        }
        i6 = iCombineMeasuredStates;
        flexLinesResult.mChildState = i6;
    }

    public void calculateHorizontalFlexLines(FlexLinesResult flexLinesResult, int i, int i2) {
        calculateFlexLines(flexLinesResult, i, i2, Integer.MAX_VALUE, 0, -1, null);
    }

    public void calculateHorizontalFlexLinesToIndex(FlexLinesResult flexLinesResult, int i, int i2, int i3, int i4, List<FlexLine> list) {
        calculateFlexLines(flexLinesResult, i, i2, i3, 0, i4, list);
    }

    public void calculateVerticalFlexLines(FlexLinesResult flexLinesResult, int i, int i2) {
        calculateFlexLines(flexLinesResult, i2, i, Integer.MAX_VALUE, 0, -1, null);
    }

    public void calculateVerticalFlexLinesToIndex(FlexLinesResult flexLinesResult, int i, int i2, int i3, int i4, List<FlexLine> list) {
        calculateFlexLines(flexLinesResult, i2, i, i3, 0, i4, list);
    }

    public void clearFlexLines(List<FlexLine> list, int i) {
        int i2 = this.mIndexToFlexLine[i];
        if (i2 == -1) {
            i2 = 0;
        }
        if (list.size() > i2) {
            list.subList(i2, list.size()).clear();
        }
        int[] iArr = this.mIndexToFlexLine;
        int length = iArr.length - 1;
        if (i > length) {
            Arrays.fill(iArr, -1);
        } else {
            Arrays.fill(iArr, i, length, -1);
        }
        long[] jArr = this.mMeasureSpecCache;
        int length2 = jArr.length - 1;
        if (i > length2) {
            Arrays.fill(jArr, 0L);
        } else {
            Arrays.fill(jArr, i, length2, 0L);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int[] createReorderedIndices(View view, int i, ViewGroup.LayoutParams layoutParams, SparseIntArray sparseIntArray) {
        int flexItemCount = this.mFlexContainer.getFlexItemCount();
        List<Order> listCreateOrders = createOrders(flexItemCount);
        Order order = new Order();
        if (view == null || !(layoutParams instanceof FlexItem)) {
            order.order = 1;
        } else {
            order.order = ((FlexItem) layoutParams).getOrder();
        }
        if (i == -1 || i == flexItemCount || i >= this.mFlexContainer.getFlexItemCount()) {
            order.index = flexItemCount;
        } else {
            order.index = i;
            while (i < flexItemCount) {
                listCreateOrders.get(i).index++;
                i++;
            }
        }
        listCreateOrders.add(order);
        return sortOrdersIntoReorderedIndices(flexItemCount + 1, listCreateOrders, sparseIntArray);
    }

    public void determineCrossSize(int i, int i2, int i3) {
        int mode;
        int size;
        int flexDirection = this.mFlexContainer.getFlexDirection();
        if (flexDirection == 0 || flexDirection == 1) {
            int mode2 = View.MeasureSpec.getMode(i2);
            int size2 = View.MeasureSpec.getSize(i2);
            mode = mode2;
            size = size2;
        } else {
            if (flexDirection != 2 && flexDirection != 3) {
                throw new IllegalArgumentException("Invalid flex direction: " + flexDirection);
            }
            mode = View.MeasureSpec.getMode(i);
            size = View.MeasureSpec.getSize(i);
        }
        List<FlexLine> flexLinesInternal = this.mFlexContainer.getFlexLinesInternal();
        if (mode == 1073741824) {
            int sumOfCrossSize = this.mFlexContainer.getSumOfCrossSize() + i3;
            int i4 = 0;
            if (flexLinesInternal.size() == 1) {
                flexLinesInternal.get(0).mCrossSize = size - i3;
                return;
            }
            if (flexLinesInternal.size() >= 2) {
                int alignContent = this.mFlexContainer.getAlignContent();
                if (alignContent == 1) {
                    FlexLine flexLine = new FlexLine();
                    flexLine.mCrossSize = size - sumOfCrossSize;
                    flexLinesInternal.add(0, flexLine);
                    return;
                }
                if (alignContent == 2) {
                    this.mFlexContainer.setFlexLines(constructFlexLinesForAlignContentCenter(flexLinesInternal, size, sumOfCrossSize));
                    return;
                }
                if (alignContent == 3) {
                    if (sumOfCrossSize >= size) {
                        return;
                    }
                    float size3 = (size - sumOfCrossSize) / (flexLinesInternal.size() - 1);
                    ArrayList arrayList = new ArrayList();
                    int size4 = flexLinesInternal.size();
                    float f = 0.0f;
                    while (i4 < size4) {
                        arrayList.add(flexLinesInternal.get(i4));
                        if (i4 != flexLinesInternal.size() - 1) {
                            FlexLine flexLine2 = new FlexLine();
                            if (i4 == flexLinesInternal.size() - 2) {
                                flexLine2.mCrossSize = Math.round(f + size3);
                                f = 0.0f;
                            } else {
                                flexLine2.mCrossSize = Math.round(size3);
                            }
                            int i5 = flexLine2.mCrossSize;
                            f += size3 - i5;
                            if (f > 1.0f) {
                                flexLine2.mCrossSize = i5 + 1;
                                f -= 1.0f;
                            } else if (f < -1.0f) {
                                flexLine2.mCrossSize = i5 - 1;
                                f += 1.0f;
                            }
                            arrayList.add(flexLine2);
                        }
                        i4++;
                    }
                    this.mFlexContainer.setFlexLines(arrayList);
                    return;
                }
                if (alignContent == 4) {
                    if (sumOfCrossSize >= size) {
                        this.mFlexContainer.setFlexLines(constructFlexLinesForAlignContentCenter(flexLinesInternal, size, sumOfCrossSize));
                        return;
                    }
                    int size5 = (size - sumOfCrossSize) / (flexLinesInternal.size() * 2);
                    ArrayList arrayList2 = new ArrayList();
                    FlexLine flexLine3 = new FlexLine();
                    flexLine3.mCrossSize = size5;
                    for (FlexLine flexLine4 : flexLinesInternal) {
                        arrayList2.add(flexLine3);
                        arrayList2.add(flexLine4);
                        arrayList2.add(flexLine3);
                    }
                    this.mFlexContainer.setFlexLines(arrayList2);
                    return;
                }
                if (alignContent == 5 && sumOfCrossSize < size) {
                    float size6 = (size - sumOfCrossSize) / flexLinesInternal.size();
                    int size7 = flexLinesInternal.size();
                    float f2 = 0.0f;
                    while (i4 < size7) {
                        FlexLine flexLine5 = flexLinesInternal.get(i4);
                        float f3 = flexLine5.mCrossSize + size6;
                        if (i4 == flexLinesInternal.size() - 1) {
                            f3 += f2;
                            f2 = 0.0f;
                        }
                        int iRound = Math.round(f3);
                        f2 += f3 - iRound;
                        if (f2 > 1.0f) {
                            iRound++;
                            f2 -= 1.0f;
                        } else if (f2 < -1.0f) {
                            iRound--;
                            f2 += 1.0f;
                        }
                        flexLine5.mCrossSize = iRound;
                        i4++;
                    }
                }
            }
        }
    }

    public void determineMainSize(int i, int i2) {
        determineMainSize(i, i2, 0);
    }

    public void ensureIndexToFlexLine(int i) {
        int[] iArr = this.mIndexToFlexLine;
        if (iArr == null) {
            this.mIndexToFlexLine = new int[Math.max(i, 10)];
        } else if (iArr.length < i) {
            this.mIndexToFlexLine = Arrays.copyOf(this.mIndexToFlexLine, Math.max(iArr.length * 2, i));
        }
    }

    public void ensureMeasureSpecCache(int i) {
        long[] jArr = this.mMeasureSpecCache;
        if (jArr == null) {
            this.mMeasureSpecCache = new long[Math.max(i, 10)];
        } else if (jArr.length < i) {
            this.mMeasureSpecCache = Arrays.copyOf(this.mMeasureSpecCache, Math.max(jArr.length * 2, i));
        }
    }

    public void ensureMeasuredSizeCache(int i) {
        long[] jArr = this.mMeasuredSizeCache;
        if (jArr == null) {
            this.mMeasuredSizeCache = new long[Math.max(i, 10)];
        } else if (jArr.length < i) {
            this.mMeasuredSizeCache = Arrays.copyOf(this.mMeasuredSizeCache, Math.max(jArr.length * 2, i));
        }
    }

    public int extractHigherInt(long j2) {
        return (int) (j2 >> 32);
    }

    public int extractLowerInt(long j2) {
        return (int) j2;
    }

    public boolean isOrderChangedFromLastMeasurement(SparseIntArray sparseIntArray) {
        int flexItemCount = this.mFlexContainer.getFlexItemCount();
        if (sparseIntArray.size() != flexItemCount) {
            return true;
        }
        for (int i = 0; i < flexItemCount; i++) {
            View flexItemAt = this.mFlexContainer.getFlexItemAt(i);
            if (flexItemAt != null && ((FlexItem) flexItemAt.getLayoutParams()).getOrder() != sparseIntArray.get(i)) {
                return true;
            }
        }
        return false;
    }

    public void layoutSingleChildHorizontal(View view, FlexLine flexLine, int i, int i2, int i3, int i4) {
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        int alignItems = this.mFlexContainer.getAlignItems();
        if (flexItem.getAlignSelf() != -1) {
            alignItems = flexItem.getAlignSelf();
        }
        int i5 = flexLine.mCrossSize;
        if (alignItems != 0) {
            if (alignItems == 1) {
                if (this.mFlexContainer.getFlexWrap() == 2) {
                    view.layout(i, (i2 - i5) + view.getMeasuredHeight() + flexItem.getMarginTop(), i3, (i4 - i5) + view.getMeasuredHeight() + flexItem.getMarginTop());
                    return;
                } else {
                    int i6 = i2 + i5;
                    view.layout(i, (i6 - view.getMeasuredHeight()) - flexItem.getMarginBottom(), i3, i6 - flexItem.getMarginBottom());
                    return;
                }
            }
            if (alignItems == 2) {
                int measuredHeight = (((i5 - view.getMeasuredHeight()) + flexItem.getMarginTop()) - flexItem.getMarginBottom()) / 2;
                if (this.mFlexContainer.getFlexWrap() != 2) {
                    int i7 = i2 + measuredHeight;
                    view.layout(i, i7, i3, view.getMeasuredHeight() + i7);
                    return;
                } else {
                    int i8 = i2 - measuredHeight;
                    view.layout(i, i8, i3, view.getMeasuredHeight() + i8);
                    return;
                }
            }
            if (alignItems == 3) {
                if (this.mFlexContainer.getFlexWrap() != 2) {
                    int iMax = Math.max(flexLine.mMaxBaseline - view.getBaseline(), flexItem.getMarginTop());
                    view.layout(i, i2 + iMax, i3, i4 + iMax);
                    return;
                } else {
                    int iMax2 = Math.max((flexLine.mMaxBaseline - view.getMeasuredHeight()) + view.getBaseline(), flexItem.getMarginBottom());
                    view.layout(i, i2 - iMax2, i3, i4 - iMax2);
                    return;
                }
            }
            if (alignItems != 4) {
                return;
            }
        }
        if (this.mFlexContainer.getFlexWrap() != 2) {
            view.layout(i, i2 + flexItem.getMarginTop(), i3, i4 + flexItem.getMarginTop());
        } else {
            view.layout(i, i2 - flexItem.getMarginBottom(), i3, i4 - flexItem.getMarginBottom());
        }
    }

    public void layoutSingleChildVertical(View view, FlexLine flexLine, boolean z, int i, int i2, int i3, int i4) {
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        int alignItems = this.mFlexContainer.getAlignItems();
        if (flexItem.getAlignSelf() != -1) {
            alignItems = flexItem.getAlignSelf();
        }
        int i5 = flexLine.mCrossSize;
        if (alignItems != 0) {
            if (alignItems == 1) {
                if (z) {
                    view.layout((i - i5) + view.getMeasuredWidth() + flexItem.getMarginLeft(), i2, (i3 - i5) + view.getMeasuredWidth() + flexItem.getMarginLeft(), i4);
                    return;
                } else {
                    view.layout(((i + i5) - view.getMeasuredWidth()) - flexItem.getMarginRight(), i2, ((i3 + i5) - view.getMeasuredWidth()) - flexItem.getMarginRight(), i4);
                    return;
                }
            }
            if (alignItems == 2) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                int measuredWidth = (((i5 - view.getMeasuredWidth()) + MarginLayoutParamsCompat.getMarginStart(marginLayoutParams)) - MarginLayoutParamsCompat.getMarginEnd(marginLayoutParams)) / 2;
                if (z) {
                    view.layout(i - measuredWidth, i2, i3 - measuredWidth, i4);
                    return;
                } else {
                    view.layout(i + measuredWidth, i2, i3 + measuredWidth, i4);
                    return;
                }
            }
            if (alignItems != 3 && alignItems != 4) {
                return;
            }
        }
        if (z) {
            view.layout(i - flexItem.getMarginRight(), i2, i3 - flexItem.getMarginRight(), i4);
        } else {
            view.layout(i + flexItem.getMarginLeft(), i2, i3 + flexItem.getMarginLeft(), i4);
        }
    }

    @VisibleForTesting
    public long makeCombinedLong(int i, int i2) {
        return (((long) i) & MEASURE_SPEC_WIDTH_MASK) | (((long) i2) << 32);
    }

    public void stretchViews() {
        stretchViews(0);
    }

    public void calculateHorizontalFlexLines(FlexLinesResult flexLinesResult, int i, int i2, int i3, int i4, @Nullable List<FlexLine> list) {
        calculateFlexLines(flexLinesResult, i, i2, i3, i4, -1, list);
    }

    public void calculateVerticalFlexLines(FlexLinesResult flexLinesResult, int i, int i2, int i3, int i4, @Nullable List<FlexLine> list) {
        calculateFlexLines(flexLinesResult, i2, i, i3, i4, -1, list);
    }

    public void determineMainSize(int i, int i2, int i3) {
        int size;
        int paddingLeft;
        int paddingRight;
        ensureChildrenFrozen(this.mFlexContainer.getFlexItemCount());
        if (i3 >= this.mFlexContainer.getFlexItemCount()) {
            return;
        }
        int flexDirection = this.mFlexContainer.getFlexDirection();
        int flexDirection2 = this.mFlexContainer.getFlexDirection();
        if (flexDirection2 == 0 || flexDirection2 == 1) {
            int mode = View.MeasureSpec.getMode(i);
            size = View.MeasureSpec.getSize(i);
            int largestMainSize = this.mFlexContainer.getLargestMainSize();
            if (mode != 1073741824) {
                size = Math.min(largestMainSize, size);
            }
            paddingLeft = this.mFlexContainer.getPaddingLeft();
            paddingRight = this.mFlexContainer.getPaddingRight();
        } else {
            if (flexDirection2 != 2 && flexDirection2 != 3) {
                throw new IllegalArgumentException("Invalid flex direction: " + flexDirection);
            }
            int mode2 = View.MeasureSpec.getMode(i2);
            size = View.MeasureSpec.getSize(i2);
            if (mode2 != 1073741824) {
                size = this.mFlexContainer.getLargestMainSize();
            }
            paddingLeft = this.mFlexContainer.getPaddingTop();
            paddingRight = this.mFlexContainer.getPaddingBottom();
        }
        int i4 = paddingLeft + paddingRight;
        int[] iArr = this.mIndexToFlexLine;
        List<FlexLine> flexLinesInternal = this.mFlexContainer.getFlexLinesInternal();
        int size2 = flexLinesInternal.size();
        for (int i5 = iArr != null ? iArr[i3] : 0; i5 < size2; i5++) {
            FlexLine flexLine = flexLinesInternal.get(i5);
            int i6 = flexLine.mMainSize;
            if (i6 < size && flexLine.mAnyItemsHaveFlexGrow) {
                expandFlexItems(i, i2, flexLine, size, i4, false);
            } else if (i6 > size && flexLine.mAnyItemsHaveFlexShrink) {
                shrinkFlexItems(i, i2, flexLine, size, i4, false);
            }
        }
    }

    public void stretchViews(int i) {
        View reorderedFlexItemAt;
        if (i >= this.mFlexContainer.getFlexItemCount()) {
            return;
        }
        int flexDirection = this.mFlexContainer.getFlexDirection();
        if (this.mFlexContainer.getAlignItems() != 4) {
            for (FlexLine flexLine : this.mFlexContainer.getFlexLinesInternal()) {
                for (Integer num : flexLine.mIndicesAlignSelfStretch) {
                    View reorderedFlexItemAt2 = this.mFlexContainer.getReorderedFlexItemAt(num.intValue());
                    if (flexDirection == 0 || flexDirection == 1) {
                        stretchViewVertically(reorderedFlexItemAt2, flexLine.mCrossSize, num.intValue());
                    } else {
                        if (flexDirection != 2 && flexDirection != 3) {
                            throw new IllegalArgumentException("Invalid flex direction: " + flexDirection);
                        }
                        stretchViewHorizontally(reorderedFlexItemAt2, flexLine.mCrossSize, num.intValue());
                    }
                }
            }
            return;
        }
        int[] iArr = this.mIndexToFlexLine;
        List<FlexLine> flexLinesInternal = this.mFlexContainer.getFlexLinesInternal();
        int size = flexLinesInternal.size();
        for (int i2 = iArr != null ? iArr[i] : 0; i2 < size; i2++) {
            FlexLine flexLine2 = flexLinesInternal.get(i2);
            int i3 = flexLine2.mItemCount;
            for (int i4 = 0; i4 < i3; i4++) {
                int i5 = flexLine2.mFirstIndex + i4;
                if (i4 < this.mFlexContainer.getFlexItemCount() && (reorderedFlexItemAt = this.mFlexContainer.getReorderedFlexItemAt(i5)) != null && reorderedFlexItemAt.getVisibility() != 8) {
                    FlexItem flexItem = (FlexItem) reorderedFlexItemAt.getLayoutParams();
                    if (flexItem.getAlignSelf() == -1 || flexItem.getAlignSelf() == 4) {
                        if (flexDirection == 0 || flexDirection == 1) {
                            stretchViewVertically(reorderedFlexItemAt, flexLine2.mCrossSize, i5);
                        } else {
                            if (flexDirection != 2 && flexDirection != 3) {
                                throw new IllegalArgumentException("Invalid flex direction: " + flexDirection);
                            }
                            stretchViewHorizontally(reorderedFlexItemAt, flexLine2.mCrossSize, i5);
                        }
                    }
                }
            }
        }
    }

    public int[] createReorderedIndices(SparseIntArray sparseIntArray) {
        int flexItemCount = this.mFlexContainer.getFlexItemCount();
        return sortOrdersIntoReorderedIndices(flexItemCount, createOrders(flexItemCount), sparseIntArray);
    }
}
