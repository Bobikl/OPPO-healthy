package com.heytap.nearx.uikit.widget.statement;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.heytap.nearx.uikit.R$dimen;
import com.heytap.nearx.uikit.R$id;

/* JADX INFO: loaded from: classes18.dex */
public class NearStatementBehavior extends CoordinatorLayout.Behavior {
    private View mChild;
    private int mCurrentOffset;
    private View mDivider;
    private int mDividerAlphaChangeEndY;
    private int mDividerAlphaChangeOffset;
    private float mDividerAlphaRange;
    public int mDividerInitWidth;
    private ViewGroup.LayoutParams mDividerParams;
    private int mDividerWidthChangeEndY;
    private int mDividerWidthChangeInitY;
    private int mDividerWidthChangeOffset;
    private float mDividerWidthRange;
    private int mListFirstChildInitY;
    private int[] mLocation;
    private int mLocationY;
    private int mMarginLeftRight;
    private int mNewOffset;
    private Resources mResources;
    private View mScrollView;

    public NearStatementBehavior() {
        this.mLocation = new int[2];
    }

    private void init(Context context) {
        Resources resources = context.getResources();
        this.mResources = resources;
        this.mMarginLeftRight = resources.getDimensionPixelOffset(R$dimen.nx_preference_divider_margin_horizontal) * 2;
        this.mDividerAlphaChangeOffset = this.mResources.getDimensionPixelOffset(R$dimen.nx_preference_line_alpha_range_change_offset);
        this.mDividerWidthChangeOffset = this.mResources.getDimensionPixelOffset(R$dimen.nx_preference_divider_width_change_offset);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onScroll() {
        this.mChild = null;
        View view = this.mScrollView;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (viewGroup.getChildCount() > 0) {
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    if (viewGroup.getChildAt(i).getVisibility() == 0) {
                        this.mChild = viewGroup.getChildAt(i);
                        break;
                    }
                }
            }
        }
        if (this.mChild == null) {
            this.mChild = this.mScrollView;
        }
        this.mChild.getLocationOnScreen(this.mLocation);
        int i2 = this.mLocation[1];
        this.mLocationY = i2;
        this.mNewOffset = 0;
        if (i2 < this.mDividerAlphaChangeEndY) {
            this.mNewOffset = this.mDividerAlphaChangeOffset;
        } else {
            int i3 = this.mListFirstChildInitY;
            if (i2 > i3) {
                this.mNewOffset = 0;
            } else {
                this.mNewOffset = i3 - i2;
            }
        }
        int i4 = this.mNewOffset;
        this.mCurrentOffset = i4;
        if (this.mDividerAlphaRange <= 1.0f) {
            float fAbs = Math.abs(i4) / this.mDividerAlphaChangeOffset;
            this.mDividerAlphaRange = fAbs;
            this.mDivider.setAlpha(fAbs);
        }
        int i5 = this.mLocationY;
        if (i5 < this.mDividerWidthChangeEndY) {
            this.mNewOffset = this.mDividerWidthChangeOffset;
        } else {
            int i6 = this.mDividerWidthChangeInitY;
            if (i5 > i6) {
                this.mNewOffset = 0;
            } else {
                this.mNewOffset = i6 - i5;
            }
        }
        int i7 = this.mNewOffset;
        this.mCurrentOffset = i7;
        float fAbs2 = Math.abs(i7) / this.mDividerWidthChangeOffset;
        this.mDividerWidthRange = fAbs2;
        ViewGroup.LayoutParams layoutParams = this.mDividerParams;
        layoutParams.width = (int) (this.mDividerInitWidth - (this.mMarginLeftRight * (1.0f - fAbs2)));
        this.mDivider.setLayoutParams(layoutParams);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onStartNestedScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull View view2, @NonNull View view3, int i, int i2) {
        if (this.mListFirstChildInitY <= 0) {
            view.getLocationOnScreen(this.mLocation);
            this.mListFirstChildInitY = this.mLocation[1];
            this.mScrollView = view3;
            View viewFindViewById = view.findViewById(R$id.divider_line);
            this.mDivider = viewFindViewById;
            this.mDividerInitWidth = viewFindViewById.getWidth();
            this.mDividerParams = this.mDivider.getLayoutParams();
            int i3 = this.mListFirstChildInitY;
            this.mDividerAlphaChangeEndY = i3 - this.mDividerAlphaChangeOffset;
            int dimensionPixelOffset = i3 - this.mResources.getDimensionPixelOffset(R$dimen.nx_preference_divider_width_start_count_offset);
            this.mDividerWidthChangeInitY = dimensionPixelOffset;
            this.mDividerWidthChangeEndY = dimensionPixelOffset - this.mDividerWidthChangeOffset;
        }
        view3.setOnScrollChangeListener(new View.OnScrollChangeListener() { // from class: com.heytap.nearx.uikit.widget.statement.NearStatementBehavior.1
            @Override // android.view.View.OnScrollChangeListener
            public void onScrollChange(View view4, int i4, int i5, int i6, int i7) {
                NearStatementBehavior.this.onScroll();
            }
        });
        return false;
    }

    public NearStatementBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mLocation = new int[2];
        init(context);
    }
}
