package com.heytap.nearx.uikit.widget.scrollview;

import android.content.Context;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.NearIOverScroller;
import com.heytap.nearx.uikit.scroll.SpringOverScroller;
import com.oplus.aiunit.vision.l0l;
import com.oplus.aiunit.vision.pjc;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes18.dex */
public class NearHorizontalScrollView extends HorizontalScrollView {
    static final int ANIMATED_SCROLL_GAP = 250;
    private static final int FLING_SCROLL_THRESHOLD = 1500;
    private static final float HORIZONTAL_SPRING_BACK_TENSION_MULTIPLE = 3.2f;
    private static final int INVALID_POINTER = -1;
    private static final int OVER_SCROLL_TOUCH_DURATION_THRESHOLD = 100;
    private static final int OVER_SCROLL_TOUCH_OFFSET_THRESHOLD = 10;
    private static final int SLOW_SCROLL_THRESHOLD = 250;
    private static final String TAG = "NearHorizontalScrollView";
    private int mActivePointerId;
    private View mChildToScrollTo;
    private boolean mFillViewport;
    private boolean mFlingStrictSpan;
    private float mFlingVelocityX;
    private float mHorizontalScrollFactor;
    private int mInitialTouchX;
    private boolean mIsBeingDragged;
    private boolean mIsLayoutDirty;
    private boolean mIsTouchDownWhileOverScrolling;
    private boolean mIsTouchDownWhileSlowScrolling;
    private boolean mItemClickableWhileOverScrolling;
    private boolean mItemClickableWhileSlowScrolling;
    private int mLastMotionX;
    private long mLastScroll;
    private int mMaximumVelocity;
    private int mMinimumVelocity;
    private NearIOverScroller mOverScroller;
    private int mOverflingDistance;
    private int mOverscrollDistance;
    private int mScreenWidth;
    private boolean mScrollStrictSpan;
    private boolean mSmoothScrollingEnabled;
    private SpringOverScroller mSpringOverScroller;
    private final Rect mTempRect;
    private int mTouchSlop;
    private long mTouchTime;
    private VelocityTracker mVelocityTracker;

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() { // from class: com.heytap.nearx.uikit.widget.scrollview.NearHorizontalScrollView.SavedState.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        };
        public int scrollOffsetFromStart;

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "HorizontalScrollView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " scrollPosition=" + this.scrollOffsetFromStart + "}";
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.scrollOffsetFromStart);
        }

        public SavedState(Parcel parcel) {
            super(parcel);
            this.scrollOffsetFromStart = parcel.readInt();
        }
    }

    public NearHorizontalScrollView(Context context) {
        super(context);
        this.mScreenWidth = 0;
        this.mTempRect = new Rect();
        this.mOverScroller = null;
        this.mSpringOverScroller = null;
        this.mIsLayoutDirty = true;
        this.mChildToScrollTo = null;
        this.mIsBeingDragged = false;
        this.mSmoothScrollingEnabled = true;
        this.mActivePointerId = -1;
        this.mItemClickableWhileSlowScrolling = true;
        this.mItemClickableWhileOverScrolling = true;
        this.mScrollStrictSpan = false;
        this.mFlingStrictSpan = false;
        initNearHorizontalScrollView(context);
    }

    private boolean canScroll() {
        View childAt = getChildAt(0);
        if (childAt != null) {
            return getWidth() < (childAt.getWidth() + getPaddingLeft()) + getPaddingRight();
        }
        return false;
    }

    private boolean dispatchClickEvent(@NonNull View view, @NonNull MotionEvent motionEvent) {
        boolean zDispatchTouchEvent = true;
        int[] iArr = {0, 1};
        for (int i = 0; i < 2; i++) {
            motionEvent.setAction(iArr[i]);
            zDispatchTouchEvent &= view.dispatchTouchEvent(motionEvent);
        }
        return zDispatchTouchEvent;
    }

    private void doScrollX(int i) {
        if (i != 0) {
            if (this.mSmoothScrollingEnabled) {
                smoothNearScrollBy(i, 0);
            } else {
                scrollBy(i, 0);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x004f  */
    private View findFocusableViewInBounds(boolean z, int i, int i2) {
        ArrayList<View> focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        boolean z2 = false;
        for (int i3 = 0; i3 < size; i3++) {
            View view2 = focusables.get(i3);
            int left = view2.getLeft();
            int right = view2.getRight();
            if (i < right && left < i2) {
                boolean z3 = i < left && right < i2;
                if (view == null) {
                    view = view2;
                    z2 = z3;
                } else {
                    boolean z4 = (z && left < view.getLeft()) || (!z && right > view.getRight());
                    if (z2) {
                        if (z3 && z4) {
                            view = view2;
                        }
                    } else if (z3) {
                        view = view2;
                        z2 = true;
                    } else if (z4) {
                        view = view2;
                    }
                }
            }
        }
        return view;
    }

    private View findFocusableViewInMyBounds(boolean z, int i, View view) {
        int horizontalFadingEdgeLength = getHorizontalFadingEdgeLength() / 2;
        int i2 = i + horizontalFadingEdgeLength;
        int width = (i + getWidth()) - horizontalFadingEdgeLength;
        return (view == null || view.getLeft() >= width || view.getRight() <= i2) ? findFocusableViewInBounds(z, i2, width) : view;
    }

    private View findViewToDispatchClickEvent(MotionEvent motionEvent) {
        View view = null;
        if (!isClickEvent(motionEvent)) {
            return null;
        }
        Rect rect = new Rect();
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (childAt.getVisibility() == 0 || childAt.getAnimation() != null) {
                childAt.getHitRect(rect);
                boolean zContains = rect.contains(((int) motionEvent.getX()) + getScrollX(), ((int) motionEvent.getY()) + getScrollY());
                MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                motionEventObtain.offsetLocation(getScrollX() - childAt.getLeft(), getScrollY() - childAt.getTop());
                if (zContains && dispatchClickEvent(childAt, motionEventObtain)) {
                    view = childAt;
                }
            }
        }
        return view;
    }

    private int getScrollRange() {
        if (getChildCount() > 0) {
            return Math.max(0, getChildAt(0).getWidth() - ((getWidth() - getPaddingLeft()) - getPaddingRight()));
        }
        return 0;
    }

    private boolean inChild(int i, int i2) {
        if (getChildCount() <= 0) {
            return false;
        }
        int scrollX = getScrollX();
        View childAt = getChildAt(0);
        return i2 >= childAt.getTop() && i2 < childAt.getBottom() && i >= childAt.getLeft() - scrollX && i < childAt.getRight() - scrollX;
    }

    private void initNearHorizontalScrollView(Context context) {
        if (this.mOverScroller == null) {
            SpringOverScroller springOverScroller = new SpringOverScroller(context);
            this.mSpringOverScroller = springOverScroller;
            springOverScroller.h(HORIZONTAL_SPRING_BACK_TENSION_MULTIPLE);
            this.mSpringOverScroller.setIsScrollView(true);
            this.mOverScroller = this.mSpringOverScroller;
            setEnableFlingSpeedIncrease(true);
        }
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.mTouchSlop = viewConfiguration.getScaledTouchSlop();
        this.mMinimumVelocity = viewConfiguration.getScaledMinimumFlingVelocity();
        this.mMaximumVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
        int i = displayMetrics.widthPixels;
        this.mOverscrollDistance = i;
        this.mOverflingDistance = i;
        this.mScreenWidth = i;
        this.mHorizontalScrollFactor = viewConfiguration.getScaledHorizontalScrollFactor();
        setOverScrollMode(0);
    }

    private void initOrResetVelocityTracker() {
        VelocityTracker velocityTracker = this.mVelocityTracker;
        if (velocityTracker == null) {
            this.mVelocityTracker = VelocityTracker.obtain();
        } else {
            velocityTracker.clear();
        }
    }

    private void initVelocityTrackerIfNotExists() {
        if (this.mVelocityTracker == null) {
            this.mVelocityTracker = VelocityTracker.obtain();
        }
    }

    private boolean isClickEvent(MotionEvent motionEvent) {
        int x = (int) (motionEvent.getX() - this.mInitialTouchX);
        return System.currentTimeMillis() - this.mTouchTime < 100 && ((int) Math.sqrt((double) (x * x))) < 10;
    }

    private boolean isOffScreen(View view) {
        return !isWithinDeltaOfScreen(view, 0);
    }

    private boolean isOverScrolling() {
        return getScrollX() < 0 || getScrollX() > getScrollRange();
    }

    private static boolean isViewDescendantOf(View view, View view2) {
        if (view == view2) {
            return true;
        }
        Object parent = view.getParent();
        return (parent instanceof ViewGroup) && isViewDescendantOf((View) parent, view2);
    }

    private boolean isWithinDeltaOfScreen(View view, int i) {
        view.getDrawingRect(this.mTempRect);
        offsetDescendantRectToMyCoords(view, this.mTempRect);
        return this.mTempRect.right + i >= getScrollX() && this.mTempRect.left - i <= getScrollX() + getWidth();
    }

    private void onSecondaryPointerUp(MotionEvent motionEvent) {
        int action = (motionEvent.getAction() & 65280) >> 8;
        if (motionEvent.getPointerId(action) == this.mActivePointerId) {
            int i = action == 0 ? 1 : 0;
            int x = (int) motionEvent.getX(i);
            this.mLastMotionX = x;
            this.mInitialTouchX = x;
            this.mActivePointerId = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.mVelocityTracker;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    private void recycleVelocityTracker() {
        VelocityTracker velocityTracker = this.mVelocityTracker;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.mVelocityTracker = null;
        }
    }

    private boolean scrollAndFocus(int i, int i2, int i3) {
        int width = getWidth();
        int scrollX = getScrollX();
        int i4 = width + scrollX;
        boolean z = false;
        boolean z2 = i == 17;
        View viewFindFocusableViewInBounds = findFocusableViewInBounds(z2, i2, i3);
        if (viewFindFocusableViewInBounds == null) {
            viewFindFocusableViewInBounds = this;
        }
        if (i2 < scrollX || i3 > i4) {
            doScrollX(z2 ? i2 - scrollX : i3 - i4);
            z = true;
        }
        if (viewFindFocusableViewInBounds != findFocus()) {
            viewFindFocusableViewInBounds.requestFocus(i);
        }
        return z;
    }

    private void scrollToChild(View view) {
        view.getDrawingRect(this.mTempRect);
        offsetDescendantRectToMyCoords(view, this.mTempRect);
        int iComputeScrollDeltaToGetChildRectOnScreen = computeScrollDeltaToGetChildRectOnScreen(this.mTempRect);
        if (iComputeScrollDeltaToGetChildRectOnScreen != 0) {
            scrollBy(iComputeScrollDeltaToGetChildRectOnScreen, 0);
        }
    }

    private boolean scrollToChildRect(Rect rect, boolean z) {
        int iComputeScrollDeltaToGetChildRectOnScreen = computeScrollDeltaToGetChildRectOnScreen(rect);
        boolean z2 = iComputeScrollDeltaToGetChildRectOnScreen != 0;
        if (z2) {
            if (z) {
                scrollBy(iComputeScrollDeltaToGetChildRectOnScreen, 0);
            } else {
                smoothNearScrollBy(iComputeScrollDeltaToGetChildRectOnScreen, 0);
            }
        }
        return z2;
    }

    @Override // android.widget.HorizontalScrollView
    public boolean arrowScroll(int i) {
        int right;
        View viewFindFocus = findFocus();
        if (viewFindFocus == this) {
            viewFindFocus = null;
        }
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, i);
        int maxScrollAmount = getMaxScrollAmount();
        if (viewFindNextFocus == null || !isWithinDeltaOfScreen(viewFindNextFocus, maxScrollAmount)) {
            if (i == 17 && getScrollX() < maxScrollAmount) {
                maxScrollAmount = getScrollX();
            } else if (i == 66 && getChildCount() > 0 && (right = getChildAt(0).getRight() - (getScrollX() + getWidth())) < maxScrollAmount) {
                maxScrollAmount = right;
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i != 66) {
                maxScrollAmount = -maxScrollAmount;
            }
            doScrollX(maxScrollAmount);
        } else {
            viewFindNextFocus.getDrawingRect(this.mTempRect);
            offsetDescendantRectToMyCoords(viewFindNextFocus, this.mTempRect);
            doScrollX(computeScrollDeltaToGetChildRectOnScreen(this.mTempRect));
            viewFindNextFocus.requestFocus(i);
        }
        if (viewFindFocus == null || !viewFindFocus.isFocused() || !isOffScreen(viewFindFocus)) {
            return true;
        }
        int descendantFocusability = getDescendantFocusability();
        setDescendantFocusability(131072);
        requestFocus();
        setDescendantFocusability(descendantFocusability);
        return true;
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public void computeScroll() {
        if (!this.mOverScroller.computeScrollOffset()) {
            if (this.mFlingStrictSpan) {
                this.mFlingStrictSpan = false;
                return;
            }
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int nearCurrX = this.mOverScroller.getNearCurrX();
        int nearCurrY = this.mOverScroller.getNearCurrY();
        if (scrollX != nearCurrX || scrollY != nearCurrY) {
            overScrollBy(nearCurrX - scrollX, nearCurrY - scrollY, scrollX, scrollY, getScrollRange(), 0, this.mOverflingDistance, 0, false);
            onScrollChanged(getScrollX(), getScrollY(), scrollX, scrollY);
        }
        if (awakenScrollBars()) {
            return;
        }
        postInvalidateOnAnimation();
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || executeKeyEvent(keyEvent);
    }

    @Override // android.widget.HorizontalScrollView
    public boolean executeKeyEvent(KeyEvent keyEvent) {
        this.mTempRect.setEmpty();
        if (!canScroll()) {
            if (!isFocused()) {
                return false;
            }
            View viewFindFocus = findFocus();
            if (viewFindFocus == this) {
                viewFindFocus = null;
            }
            View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, 66);
            return (viewFindNextFocus == null || viewFindNextFocus == this || !viewFindNextFocus.requestFocus(66)) ? false : true;
        }
        if (keyEvent.getAction() != 0) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 21) {
            return !keyEvent.isAltPressed() ? arrowScroll(17) : fullScroll(17);
        }
        if (keyCode == 22) {
            return !keyEvent.isAltPressed() ? arrowScroll(66) : fullScroll(66);
        }
        if (keyCode != 62) {
            return false;
        }
        pageScroll(keyEvent.isShiftPressed() ? 17 : 66);
        return false;
    }

    @Override // android.widget.HorizontalScrollView
    public void fling(int i) {
        this.mFlingVelocityX = i;
        if (getChildCount() > 0) {
            int width = (getWidth() - getPaddingRight()) - getPaddingLeft();
            this.mOverScroller.fling(getScrollX(), getScrollY(), i, 0, 0, Math.max(0, (getChildAt(0).getRight() - getPaddingLeft()) - width), 0, 0, width / 2, 0);
            if (!this.mFlingStrictSpan) {
                this.mFlingStrictSpan = true;
            }
            boolean z = i > 0;
            View viewFindFocus = findFocus();
            View viewFindFocusableViewInMyBounds = findFocusableViewInMyBounds(z, this.mOverScroller.getNearFinalX(), viewFindFocus);
            if (viewFindFocusableViewInMyBounds == null) {
                viewFindFocusableViewInMyBounds = this;
            }
            if (viewFindFocusableViewInMyBounds != viewFindFocus) {
                viewFindFocusableViewInMyBounds.requestFocus(z ? 66 : 17);
            }
            postInvalidateOnAnimation();
        }
    }

    @Override // android.widget.HorizontalScrollView
    public boolean fullScroll(int i) {
        boolean z = i == 66;
        int width = getWidth();
        Rect rect = this.mTempRect;
        rect.left = 0;
        rect.right = width;
        if (z && getChildCount() > 0) {
            this.mTempRect.right = getChildAt(0).getRight();
            Rect rect2 = this.mTempRect;
            rect2.left = rect2.right - width;
        }
        Rect rect3 = this.mTempRect;
        return scrollAndFocus(i, rect3.left, rect3.right);
    }

    public int getScrollableRange() {
        return (getWidth() - getPaddingLeft()) - getPaddingRight();
    }

    public void invalidateParentIfNeeded() {
        if (isHardwareAccelerated() && (getParent() instanceof View)) {
            ((View) getParent()).invalidate();
        }
    }

    public boolean isEnableFlingSpeedIncrease() {
        SpringOverScroller springOverScroller = this.mSpringOverScroller;
        if (springOverScroller != null) {
            return springOverScroller.d();
        }
        return false;
    }

    @Override // android.widget.HorizontalScrollView
    public boolean isFillViewport() {
        return this.mFillViewport;
    }

    @Override // android.widget.HorizontalScrollView
    public boolean isSmoothScrollingEnabled() {
        return this.mSmoothScrollingEnabled;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.mScrollStrictSpan) {
            this.mScrollStrictSpan = false;
        }
        if (this.mFlingStrictSpan) {
            this.mFlingStrictSpan = false;
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float axisValue;
        if (motionEvent.getAction() == 8 && !this.mIsBeingDragged) {
            if (motionEvent.isFromSource(2)) {
                axisValue = (motionEvent.getMetaState() & 1) != 0 ? -motionEvent.getAxisValue(9) : motionEvent.getAxisValue(10);
            } else {
                axisValue = motionEvent.isFromSource(4194304) ? motionEvent.getAxisValue(26) : 0.0f;
            }
            int iRound = Math.round(axisValue * this.mHorizontalScrollFactor);
            if (iRound != 0) {
                int scrollRange = getScrollRange();
                int scrollX = getScrollX();
                int i = iRound + scrollX;
                if (i < 0) {
                    scrollRange = 0;
                } else if (i <= scrollRange) {
                    scrollRange = i;
                }
                if (scrollRange != scrollX) {
                    super.scrollTo(scrollRange, getScrollY());
                    return true;
                }
            }
        }
        return super.onGenericMotionEvent(motionEvent);
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:37:0x00be  */
    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if ((action == 2 && this.mIsBeingDragged) || super.onInterceptTouchEvent(motionEvent)) {
            return true;
        }
        int i = action & 255;
        if (i == 0) {
            NearIOverScroller nearIOverScroller = this.mOverScroller;
            float currVelocityX = nearIOverScroller != null ? nearIOverScroller.getCurrVelocityX() : 0.0f;
            this.mIsTouchDownWhileSlowScrolling = Math.abs(currVelocityX) > 0.0f && Math.abs(currVelocityX) < 250.0f && ((Math.abs(this.mFlingVelocityX) > 1500.0f ? 1 : (Math.abs(this.mFlingVelocityX) == 1500.0f ? 0 : -1)) > 0);
            this.mIsTouchDownWhileOverScrolling = isOverScrolling();
            this.mTouchTime = System.currentTimeMillis();
            int x = (int) motionEvent.getX();
            if (inChild(x, (int) motionEvent.getY())) {
                this.mLastMotionX = x;
                this.mInitialTouchX = x;
                this.mActivePointerId = motionEvent.getPointerId(0);
                initOrResetVelocityTracker();
                this.mVelocityTracker.addMovement(motionEvent);
                this.mIsBeingDragged = !this.mOverScroller.isNearFinished();
            } else {
                this.mIsBeingDragged = false;
                recycleVelocityTracker();
            }
        } else if (i == 1) {
            this.mIsBeingDragged = false;
            this.mActivePointerId = -1;
            if (this.mOverScroller.springBack(getScrollX(), getScrollY(), 0, getScrollRange(), 0, 0)) {
                postInvalidateOnAnimation();
            }
        } else if (i == 2) {
            int i2 = this.mActivePointerId;
            if (i2 != -1) {
                int iFindPointerIndex = motionEvent.findPointerIndex(i2);
                if (iFindPointerIndex == -1) {
                    Log.e(TAG, "Invalid pointerId=" + i2 + " in onInterceptTouchEvent");
                } else {
                    int x2 = (int) motionEvent.getX(iFindPointerIndex);
                    if (Math.abs(x2 - this.mLastMotionX) > this.mTouchSlop) {
                        this.mIsBeingDragged = true;
                        this.mLastMotionX = x2;
                        initVelocityTrackerIfNotExists();
                        this.mVelocityTracker.addMovement(motionEvent);
                        ViewParent parent = getParent();
                        if (parent != null) {
                            parent.requestDisallowInterceptTouchEvent(true);
                        }
                    }
                }
            }
        } else if (i == 3) {
            this.mIsBeingDragged = false;
            this.mActivePointerId = -1;
            if (this.mOverScroller.springBack(getScrollX(), getScrollY(), 0, getScrollRange(), 0, 0)) {
                postInvalidateOnAnimation();
            }
        } else if (i == 5) {
            int actionIndex = motionEvent.getActionIndex();
            int x3 = (int) motionEvent.getX(actionIndex);
            this.mLastMotionX = x3;
            this.mInitialTouchX = x3;
            this.mActivePointerId = motionEvent.getPointerId(actionIndex);
        } else if (i == 6) {
            onSecondaryPointerUp(motionEvent);
            int x4 = (int) motionEvent.getX(motionEvent.findPointerIndex(this.mActivePointerId));
            this.mLastMotionX = x4;
            this.mInitialTouchX = x4;
        }
        return this.mIsBeingDragged;
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int paddingLeft;
        int paddingTop;
        int paddingBottom;
        super.onMeasure(i, i2);
        if (this.mFillViewport && View.MeasureSpec.getMode(i) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            if (getContext().getApplicationInfo().targetSdkVersion >= 23) {
                paddingLeft = getPaddingLeft() + getPaddingRight() + layoutParams.leftMargin + layoutParams.rightMargin;
                paddingTop = getPaddingTop() + getPaddingBottom() + layoutParams.topMargin;
                paddingBottom = layoutParams.bottomMargin;
            } else {
                paddingLeft = getPaddingLeft() + getPaddingRight();
                paddingTop = getPaddingTop();
                paddingBottom = getPaddingBottom();
            }
            int i3 = paddingTop + paddingBottom;
            int measuredWidth = getMeasuredWidth() - paddingLeft;
            if (childAt.getMeasuredWidth() < measuredWidth) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), ViewGroup.getChildMeasureSpec(i2, i3, layoutParams.height));
            }
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        if (getScrollY() == i2 && getScrollX() == i) {
            return;
        }
        if (isOverScrolling() && this.mFlingStrictSpan) {
            int scrollRange = i >= getScrollRange() ? getScrollRange() : 0;
            i = pjc.a(scrollRange, i - scrollRange, this.mScreenWidth);
        }
        if (getOverScrollMode() == 2 || (getOverScrollMode() == 1 && getChildAt(0).getWidth() <= getScrollableRange())) {
            i = Math.min(Math.max(i, 0), getScrollRange());
        }
        if (getScrollX() >= 0 && i < 0 && this.mFlingStrictSpan) {
            performHapticFeedback(307);
            this.mSpringOverScroller.notifyHorizontalEdgeReached(i, 0, this.mOverflingDistance);
        }
        if (getScrollX() <= getScrollRange() && i > getScrollRange() && this.mFlingStrictSpan) {
            performHapticFeedback(307);
            this.mSpringOverScroller.notifyHorizontalEdgeReached(i, getScrollRange(), this.mOverflingDistance);
        }
        l0l.b(this, i);
        l0l.c(this, i2);
        invalidateParentIfNeeded();
        awakenScrollBars();
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (i == 2) {
            i = 66;
        } else if (i == 1) {
            i = 17;
        }
        View viewFindNextFocus = rect == null ? FocusFinder.getInstance().findNextFocus(this, null, i) : FocusFinder.getInstance().findNextFocusFromRect(this, rect, i);
        if (viewFindNextFocus == null || isOffScreen(viewFindNextFocus)) {
            return false;
        }
        return viewFindNextFocus.requestFocus(i, rect);
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        int i5 = getContext().getResources().getDisplayMetrics().widthPixels;
        this.mOverscrollDistance = i5;
        this.mOverflingDistance = i5;
        this.mScreenWidth = i5;
        View viewFindFocus = findFocus();
        if (viewFindFocus == null || this == viewFindFocus || !isWithinDeltaOfScreen(viewFindFocus, getRight() - getLeft())) {
            return;
        }
        viewFindFocus.getDrawingRect(this.mTempRect);
        offsetDescendantRectToMyCoords(viewFindFocus, this.mTempRect);
        doScrollX(computeScrollDeltaToGetChildRectOnScreen(this.mTempRect));
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        ViewParent parent;
        initVelocityTrackerIfNotExists();
        this.mVelocityTracker.addMovement(motionEvent);
        int action = motionEvent.getAction() & 255;
        if (action != 0) {
            if (action == 1) {
                boolean zIsOverScrolling = isOverScrolling();
                boolean z = this.mItemClickableWhileSlowScrolling && this.mIsTouchDownWhileSlowScrolling;
                boolean z2 = this.mItemClickableWhileOverScrolling && this.mIsTouchDownWhileOverScrolling && zIsOverScrolling;
                if (z || z2) {
                    findViewToDispatchClickEvent(motionEvent);
                }
                if (this.mIsBeingDragged) {
                    initVelocityTrackerIfNotExists();
                    VelocityTracker velocityTracker = this.mVelocityTracker;
                    velocityTracker.computeCurrentVelocity(1000, this.mMaximumVelocity);
                    int xVelocity = (int) velocityTracker.getXVelocity(this.mActivePointerId);
                    if (Math.abs(xVelocity) > this.mMinimumVelocity) {
                        int i = -xVelocity;
                        this.mOverScroller.setCurrVelocityX(i);
                        if (getScrollX() < 0) {
                            if (xVelocity <= -1500) {
                                fling(i);
                            } else if (this.mOverScroller.springBack(getScrollX(), getScrollY(), 0, getScrollRange(), 0, 0)) {
                                postInvalidateOnAnimation();
                            }
                        } else if (getScrollX() <= getScrollRange() || xVelocity >= 1500) {
                            fling(i);
                        } else if (this.mOverScroller.springBack(getScrollX(), getScrollY(), 0, getScrollRange(), 0, 0)) {
                            postInvalidateOnAnimation();
                        }
                    } else if (this.mOverScroller.springBack(getScrollX(), getScrollY(), 0, getScrollRange(), 0, 0)) {
                        postInvalidateOnAnimation();
                    }
                    if (getScrollX() < 0 || getScrollX() > getScrollRange()) {
                        performHapticFeedback(307);
                    }
                    this.mActivePointerId = -1;
                    this.mIsBeingDragged = false;
                    recycleVelocityTracker();
                } else if (this.mOverScroller.springBack(getScrollX(), getScrollY(), 0, getScrollRange(), 0, 0)) {
                    postInvalidateOnAnimation();
                }
            } else if (action == 2) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.mActivePointerId);
                if (iFindPointerIndex == -1) {
                    Log.e(TAG, "Invalid pointerId=" + this.mActivePointerId + " in onTouchEvent");
                } else {
                    int x = (int) motionEvent.getX(iFindPointerIndex);
                    int iB = this.mLastMotionX - x;
                    if (!this.mIsBeingDragged && Math.abs(iB) > this.mTouchSlop) {
                        ViewParent parent2 = getParent();
                        if (parent2 != null) {
                            parent2.requestDisallowInterceptTouchEvent(true);
                        }
                        this.mIsBeingDragged = true;
                        iB = iB > 0 ? iB - this.mTouchSlop : iB + this.mTouchSlop;
                    }
                    if (this.mIsBeingDragged) {
                        this.mLastMotionX = x;
                        int scrollRange = getScrollRange();
                        if (getScrollX() < 0) {
                            iB = pjc.b(iB, getScrollX(), this.mOverscrollDistance);
                        } else if (getScrollX() > getScrollRange()) {
                            iB = pjc.b(iB, getScrollX() - getScrollRange(), this.mOverscrollDistance);
                        }
                        if (overScrollBy(iB, 0, getScrollX(), 0, scrollRange, 0, this.mOverscrollDistance, 0, true) && !hasNestedScrollingParent()) {
                            this.mVelocityTracker.clear();
                        }
                    }
                }
            } else if (action != 3) {
                if (action == 6) {
                    onSecondaryPointerUp(motionEvent);
                }
            } else if (this.mIsBeingDragged && getChildCount() > 0) {
                if (this.mOverScroller.springBack(getScrollX(), getScrollY(), 0, getScrollRange(), 0, 0)) {
                    postInvalidateOnAnimation();
                }
                this.mActivePointerId = -1;
                this.mIsBeingDragged = false;
                recycleVelocityTracker();
            }
        } else {
            if (getChildCount() == 0) {
                return false;
            }
            if (!this.mOverScroller.isNearFinished() && (parent = getParent()) != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            if (!this.mOverScroller.isNearFinished()) {
                this.mOverScroller.abortAnimation();
                if (this.mFlingStrictSpan) {
                    this.mFlingStrictSpan = false;
                }
            }
            int x2 = (int) motionEvent.getX();
            this.mLastMotionX = x2;
            this.mInitialTouchX = x2;
            this.mActivePointerId = motionEvent.getPointerId(0);
        }
        return true;
    }

    @Override // android.view.View
    public boolean overScrollBy(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z) {
        onOverScrolled(i3 + i, i4 + i2, false, false);
        return false;
    }

    @Override // android.widget.HorizontalScrollView
    public boolean pageScroll(int i) {
        boolean z = i == 66;
        int width = getWidth();
        if (z) {
            this.mTempRect.left = getScrollX() + width;
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                if (this.mTempRect.left + width > childAt.getRight()) {
                    this.mTempRect.left = childAt.getRight() - width;
                }
            }
        } else {
            this.mTempRect.left = getScrollX() - width;
            Rect rect = this.mTempRect;
            if (rect.left < 0) {
                rect.left = 0;
            }
        }
        Rect rect2 = this.mTempRect;
        int i2 = rect2.left;
        int i3 = width + i2;
        rect2.right = i3;
        return scrollAndFocus(i, i2, i3);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (view2 != null && view2.getRevealOnFocusHint()) {
            if (this.mIsLayoutDirty) {
                this.mChildToScrollTo = view2;
            } else {
                scrollToChild(view2);
            }
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        return scrollToChildRect(rect, z);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        if (z) {
            recycleVelocityTracker();
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override // android.widget.HorizontalScrollView, android.view.View, android.view.ViewParent
    public void requestLayout() {
        this.mIsLayoutDirty = true;
        super.requestLayout();
    }

    public void setEnableFlingSpeedIncrease(boolean z) {
        SpringOverScroller springOverScroller = this.mSpringOverScroller;
        if (springOverScroller != null) {
            springOverScroller.f(z);
        }
    }

    @Override // android.widget.HorizontalScrollView
    public void setFillViewport(boolean z) {
        if (z != this.mFillViewport) {
            this.mFillViewport = z;
            requestLayout();
        }
    }

    public void setItemClickableWhileOverScrolling(boolean z) {
        this.mItemClickableWhileOverScrolling = z;
    }

    public void setItemClickableWhileSlowScrolling(boolean z) {
        this.mItemClickableWhileSlowScrolling = z;
    }

    @Override // android.widget.HorizontalScrollView
    public void setSmoothScrollingEnabled(boolean z) {
        this.mSmoothScrollingEnabled = z;
    }

    public final void smoothNearScrollBy(int i, int i2) {
        if (getChildCount() == 0) {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - this.mLastScroll > 250) {
            int iMax = Math.max(0, getChildAt(0).getWidth() - ((getWidth() - getPaddingRight()) - getPaddingLeft()));
            int scrollX = getScrollX();
            this.mOverScroller.startScroll(scrollX, getScrollY(), Math.max(0, Math.min(i + scrollX, iMax)) - scrollX, 0);
            postInvalidateOnAnimation();
        } else {
            if (!this.mOverScroller.isNearFinished()) {
                this.mOverScroller.abortAnimation();
                if (this.mFlingStrictSpan) {
                    this.mFlingStrictSpan = false;
                }
            }
            scrollBy(i, i2);
        }
        this.mLastScroll = AnimationUtils.currentAnimationTimeMillis();
    }

    public final void smoothNearScrollTo(int i, int i2) {
        smoothNearScrollBy(i - getScrollX(), i2 - getScrollY());
    }

    public NearHorizontalScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mScreenWidth = 0;
        this.mTempRect = new Rect();
        this.mOverScroller = null;
        this.mSpringOverScroller = null;
        this.mIsLayoutDirty = true;
        this.mChildToScrollTo = null;
        this.mIsBeingDragged = false;
        this.mSmoothScrollingEnabled = true;
        this.mActivePointerId = -1;
        this.mItemClickableWhileSlowScrolling = true;
        this.mItemClickableWhileOverScrolling = true;
        this.mScrollStrictSpan = false;
        this.mFlingStrictSpan = false;
        initNearHorizontalScrollView(context);
    }

    public NearHorizontalScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mScreenWidth = 0;
        this.mTempRect = new Rect();
        this.mOverScroller = null;
        this.mSpringOverScroller = null;
        this.mIsLayoutDirty = true;
        this.mChildToScrollTo = null;
        this.mIsBeingDragged = false;
        this.mSmoothScrollingEnabled = true;
        this.mActivePointerId = -1;
        this.mItemClickableWhileSlowScrolling = true;
        this.mItemClickableWhileOverScrolling = true;
        this.mScrollStrictSpan = false;
        this.mFlingStrictSpan = false;
        initNearHorizontalScrollView(context);
    }

    public NearHorizontalScrollView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.mScreenWidth = 0;
        this.mTempRect = new Rect();
        this.mOverScroller = null;
        this.mSpringOverScroller = null;
        this.mIsLayoutDirty = true;
        this.mChildToScrollTo = null;
        this.mIsBeingDragged = false;
        this.mSmoothScrollingEnabled = true;
        this.mActivePointerId = -1;
        this.mItemClickableWhileSlowScrolling = true;
        this.mItemClickableWhileOverScrolling = true;
        this.mScrollStrictSpan = false;
        this.mFlingStrictSpan = false;
        initNearHorizontalScrollView(context);
    }
}
