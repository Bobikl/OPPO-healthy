package com.heytap.store.base.widget.flexbox;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class FlexLine {
    int mCrossSize;
    int mDividerLengthInMainSize;
    int mItemCount;
    int mMainSize;
    int mMaxBaseline;
    float mTotalFlexGrow;
    float mTotalFlexShrink;
    int mLeft = Integer.MAX_VALUE;
    int mTop = Integer.MAX_VALUE;
    int mRight = Integer.MIN_VALUE;
    int mBottom = Integer.MIN_VALUE;
    final List<Integer> mIndicesAlignSelfStretch = new ArrayList();

    public int getBottom() {
        return this.mBottom;
    }

    public int getCrossSize() {
        return this.mCrossSize;
    }

    public int getItemCount() {
        return this.mItemCount;
    }

    public int getLeft() {
        return this.mLeft;
    }

    public int getMainSize() {
        return this.mMainSize;
    }

    public int getRight() {
        return this.mRight;
    }

    public int getTop() {
        return this.mTop;
    }

    public float getTotalFlexGrow() {
        return this.mTotalFlexGrow;
    }

    public float getTotalFlexShrink() {
        return this.mTotalFlexShrink;
    }
}
