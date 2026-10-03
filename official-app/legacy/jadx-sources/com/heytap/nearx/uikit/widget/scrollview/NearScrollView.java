package com.heytap.nearx.uikit.widget.scrollview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
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
import android.widget.ScrollView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.NearIOverScroller;
import com.heytap.nearx.uikit.scroll.SpringOverScroller;
import com.oplus.aiunit.vision.l0l;
import com.oplus.aiunit.vision.pjc;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes18.dex */
public class NearScrollView extends ScrollView {
    static final int ANIMATED_SCROLL_GAP = 250;
    private static final boolean DEBUG = false;
    private static final int DEBUG_PAINT_TEXT_OFFSET_Y = 50;
    private static final int DEBUG_PAINT_TEXT_SIZE = 30;
    private static final int FLING_SCROLL_THRESHOLD = 1500;
    private static final int INVALID_POINTER = -1;
    private static final int OVER_SCROLL_TOUCH_DURATION_THRESHOLD = 100;
    private static final int OVER_SCROLL_TOUCH_OFFSET_THRESHOLD = 10;
    private static final int SLOW_SCROLL_THRESHOLD = 250;
    private static final String TAG = "NScrollView";
    private static final float VERTICAL_SPRING_BACK_TENSION_MULTIPLE = 2.15f;
    private int mActivePointerId;
    private View mChildToScrollTo;
    private Paint mDebugPaint;
    private boolean mFillViewport;
    private boolean mFlingStrictSpan;
    private float mFlingVelocityY;
    private int mInitialTouchY;
    private boolean mIsBeingDragged;
    private boolean mIsLayoutDirty;
    private boolean mIsTouchDownWhileOverScrolling;
    private boolean mIsTouchDownWhileSlowScrolling;
    private boolean mItemClickableWhileOverScrolling;
    private boolean mItemClickableWhileSlowScrolling;
    private int mLastMotionY;
    private long mLastScroll;
    private int mMaximumVelocity;
    private int mMinimumVelocity;
    private int mNestedYOffset;
    private NearIOverScroller mOverScroller;
    private int mOverflingDistance;
    private int mOverscrollDistance;
    private SavedState mSavedState;
    private int mScreenHeight;
    private final int[] mScrollConsumed;
    private final int[] mScrollOffset;
    private boolean mScrollStrictSpan;
    private boolean mSmoothScrollingEnabled;
    private SpringOverScroller mSpringOverScroller;
    private final Rect mTempRect;
    private int mTouchSlop;
    private long mTouchTime;
    private VelocityTracker mVelocityTracker;
    private float mVerticalScrollFactor;

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() { // from class: com.heytap.nearx.uikit.widget.scrollview.NearScrollView.SavedState.1
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
        public int scrollPosition;

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "ScrollView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " scrollPosition=" + this.scrollPosition + "}";
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.scrollPosition);
        }

        public SavedState(Parcel parcel) {
            super(parcel);
            this.scrollPosition = parcel.readInt();
        }
    }

    public NearScrollView(Context context) {
        super(context);
        this.mScreenHeight = 0;
        this.mTempRect = new Rect();
        this.mOverScroller = null;
        this.mSpringOverScroller = null;
        this.mIsLayoutDirty = true;
        this.mChildToScrollTo = null;
        this.mIsBeingDragged = false;
        this.mSmoothScrollingEnabled = true;
        this.mActivePointerId = -1;
        this.mScrollOffset = new int[2];
        this.mScrollConsumed = new int[2];
        this.mScrollStrictSpan = false;
        this.mFlingStrictSpan = false;
        this.mItemClickableWhileSlowScrolling = true;
        this.mItemClickableWhileOverScrolling = true;
        this.mDebugPaint = new Paint();
        initNearScrollView(context);
    }

    private boolean canScroll() {
        View childAt = getChildAt(0);
        if (childAt != null) {
            return getHeight() < (childAt.getHeight() + getPaddingTop()) + getPaddingBottom();
        }
        return false;
    }

    private static int clamp(int i, int i2, int i3) {
        if (i2 >= i3 || i < 0) {
            return 0;
        }
        return i2 + i > i3 ? i3 - i2 : i;
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

    private void doScrollY(int i) {
        if (i != 0) {
            if (this.mSmoothScrollingEnabled) {
                smoothNearScrollBy(0, i);
            } else {
                scrollBy(0, i);
            }
        }
    }

    private void endDrag() {
        this.mIsBeingDragged = false;
        recycleVelocityTracker();
        if (this.mScrollStrictSpan) {
            this.mScrollStrictSpan = false;
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
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i < bottom && top < i2) {
                boolean z3 = i < top && bottom < i2;
                if (view == null) {
                    view = view2;
                    z2 = z3;
                } else {
                    boolean z4 = (z && top < view.getTop()) || (!z && bottom > view.getBottom());
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
        Log.d(TAG, "findViewToDispatchClickEvent: target: " + view);
        return view;
    }

    private void flingWithNestedDispatch(int i) {
        boolean z = (getScrollY() > 0 || i > 0) && (getScrollY() < getScrollRange() || i < 0);
        float f = i;
        if (dispatchNestedPreFling(0.0f, f)) {
            return;
        }
        dispatchNestedFling(0.0f, f, z);
        if (z) {
            fling(i);
        }
    }

    private int getScrollRange() {
        if (getChildCount() > 0) {
            return Math.max(0, getChildAt(0).getHeight() - ((getHeight() - getPaddingBottom()) - getPaddingTop()));
        }
        return 0;
    }

    private boolean inChild(int i, int i2) {
        if (getChildCount() <= 0) {
            return false;
        }
        int scrollY = getScrollY();
        View childAt = getChildAt(0);
        return i2 >= childAt.getTop() - scrollY && i2 < childAt.getBottom() - scrollY && i >= childAt.getLeft() && i < childAt.getRight();
    }

    private void initNearScrollView(Context context) {
        if (this.mOverScroller == null) {
            SpringOverScroller springOverScroller = new SpringOverScroller(context);
            this.mSpringOverScroller = springOverScroller;
            springOverScroller.h(VERTICAL_SPRING_BACK_TENSION_MULTIPLE);
            this.mSpringOverScroller.setIsScrollView(true);
            this.mOverScroller = this.mSpringOverScroller;
            setEnableFlingSpeedIncrease(true);
        }
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.mTouchSlop = viewConfiguration.getScaledTouchSlop();
        this.mMinimumVelocity = viewConfiguration.getScaledMinimumFlingVelocity();
        this.mMaximumVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
        int i = displayMetrics.heightPixels;
        this.mOverscrollDistance = i;
        this.mOverflingDistance = i;
        this.mVerticalScrollFactor = viewConfiguration.getScaledVerticalScrollFactor();
        this.mScreenHeight = displayMetrics.heightPixels;
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
        int y = (int) (motionEvent.getY() - this.mInitialTouchY);
        return System.currentTimeMillis() - this.mTouchTime < 100 && ((int) Math.sqrt((double) (y * y))) < 10;
    }

    private boolean isOffScreen(View view) {
        return !isWithinDeltaOfScreen(view, 0, getHeight());
    }

    private boolean isOverScrolling() {
        return getScrollY() < 0 || getScrollY() > getScrollRange();
    }

    private static boolean isViewDescendantOf(View view, View view2) {
        if (view == view2) {
            return true;
        }
        Object parent = view.getParent();
        return (parent instanceof ViewGroup) && isViewDescendantOf((View) parent, view2);
    }

    private boolean isWithinDeltaOfScreen(View view, int i, int i2) {
        view.getDrawingRect(this.mTempRect);
        offsetDescendantRectToMyCoords(view, this.mTempRect);
        return this.mTempRect.bottom + i >= getScrollY() && this.mTempRect.top - i <= getScrollY() + i2;
    }

    private void onSecondaryPointerUp(MotionEvent motionEvent) {
        int action = (motionEvent.getAction() & 65280) >> 8;
        if (motionEvent.getPointerId(action) == this.mActivePointerId) {
            int i = action == 0 ? 1 : 0;
            int y = (int) motionEvent.getY(i);
            this.mLastMotionY = y;
            this.mInitialTouchY = y;
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
        int height = getHeight();
        int scrollY = getScrollY();
        int i4 = height + scrollY;
        boolean z = false;
        boolean z2 = i == 33;
        View viewFindFocusableViewInBounds = findFocusableViewInBounds(z2, i2, i3);
        if (viewFindFocusableViewInBounds == null) {
            viewFindFocusableViewInBounds = this;
        }
        if (i2 < scrollY || i3 > i4) {
            doScrollY(z2 ? i2 - scrollY : i3 - i4);
            z = true;
        }
        if (viewFindFocusableViewInBounds != findFocus()) {
            viewFindFocusableViewInBounds.requestFocus(i);
        }
        return z;
    }

    private boolean scrollToChildRect(Rect rect, boolean z) {
        int iComputeScrollDeltaToGetChildRectOnScreen = computeScrollDeltaToGetChildRectOnScreen(rect);
        boolean z2 = iComputeScrollDeltaToGetChildRectOnScreen != 0;
        if (z2) {
            if (z) {
                scrollBy(0, iComputeScrollDeltaToGetChildRectOnScreen);
            } else {
                smoothNearScrollBy(0, iComputeScrollDeltaToGetChildRectOnScreen);
            }
        }
        return z2;
    }

    private void scrollToWithClamp(int i, int i2) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            int iClamp = clamp(i, (getWidth() - getPaddingRight()) - getPaddingLeft(), childAt.getWidth());
            int iClamp2 = clamp(i2, (getHeight() - getPaddingBottom()) - getPaddingTop(), childAt.getHeight());
            if (iClamp == getScrollX() && iClamp2 == getScrollY()) {
                return;
            }
            scrollTo(iClamp, iClamp2);
        }
    }

    @Override // android.widget.ScrollView
    public boolean arrowScroll(int i) {
        int bottom;
        View viewFindFocus = findFocus();
        if (viewFindFocus == this) {
            viewFindFocus = null;
        }
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, i);
        int maxScrollAmount = getMaxScrollAmount();
        if (viewFindNextFocus == null || !isWithinDeltaOfScreen(viewFindNextFocus, maxScrollAmount, getHeight())) {
            if (i == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i == 130 && getChildCount() > 0 && (bottom = getChildAt(0).getBottom() - ((getScrollY() + getHeight()) - getPaddingBottom())) < maxScrollAmount) {
                maxScrollAmount = bottom;
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            doScrollY(maxScrollAmount);
        } else {
            viewFindNextFocus.getDrawingRect(this.mTempRect);
            offsetDescendantRectToMyCoords(viewFindNextFocus, this.mTempRect);
            doScrollY(computeScrollDeltaToGetChildRectOnScreen(this.mTempRect));
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

    @Override // android.widget.ScrollView, android.view.View
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
            overScrollBy(nearCurrX - scrollX, nearCurrY - scrollY, scrollX, scrollY, 0, getScrollRange(), 0, this.mOverflingDistance, false);
        }
        if (awakenScrollBars()) {
            return;
        }
        postInvalidateOnAnimation();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || executeKeyEvent(keyEvent);
    }

    @Override // android.widget.ScrollView
    public boolean executeKeyEvent(KeyEvent keyEvent) {
        this.mTempRect.setEmpty();
        if (!canScroll()) {
            if (!isFocused() || keyEvent.getKeyCode() == 4 || keyEvent.getKeyCode() == 111) {
                return false;
            }
            View viewFindFocus = findFocus();
            if (viewFindFocus == this) {
                viewFindFocus = null;
            }
            View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, 130);
            return (viewFindNextFocus == null || viewFindNextFocus == this || !viewFindNextFocus.requestFocus(130)) ? false : true;
        }
        if (keyEvent.getAction() != 0) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 19) {
            return !keyEvent.isAltPressed() ? arrowScroll(33) : fullScroll(33);
        }
        if (keyCode == 20) {
            return !keyEvent.isAltPressed() ? arrowScroll(130) : fullScroll(130);
        }
        if (keyCode != 62) {
            return false;
        }
        pageScroll(keyEvent.isShiftPressed() ? 33 : 130);
        return false;
    }

    @Override // android.widget.ScrollView
    public void fling(int i) {
        this.mFlingVelocityY = i;
        if (getChildCount() > 0) {
            int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
            this.mOverScroller.fling(getScrollX(), getScrollY(), 0, i, 0, 0, 0, Math.max(0, getChildAt(0).getHeight() - height), 0, height / 2);
            if (!this.mFlingStrictSpan) {
                this.mFlingStrictSpan = true;
            }
            postInvalidateOnAnimation();
        }
    }

    @Override // android.widget.ScrollView
    public boolean fullScroll(int i) {
        int childCount;
        boolean z = i == 130;
        int height = getHeight();
        Rect rect = this.mTempRect;
        rect.top = 0;
        rect.bottom = height;
        if (z && (childCount = getChildCount()) > 0) {
            this.mTempRect.bottom = getChildAt(childCount - 1).getBottom() + getPaddingBottom();
            Rect rect2 = this.mTempRect;
            rect2.top = rect2.bottom - height;
        }
        Rect rect3 = this.mTempRect;
        return scrollAndFocus(i, rect3.top, rect3.bottom);
    }

    public int getScrollableRange() {
        return (getHeight() - getPaddingTop()) - getPaddingBottom();
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

    @Override // android.widget.ScrollView
    public boolean isFillViewport() {
        return this.mFillViewport;
    }

    @Override // android.widget.ScrollView
    public boolean isSmoothScrollingEnabled() {
        return this.mSmoothScrollingEnabled;
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.mScrollStrictSpan) {
            this.mScrollStrictSpan = false;
        }
        if (this.mFlingStrictSpan) {
            this.mFlingStrictSpan = false;
        }
    }

    @Override // android.widget.ScrollView, android.view.View
    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float axisValue;
        if (motionEvent.getAction() == 8) {
            if (motionEvent.isFromSource(2)) {
                axisValue = motionEvent.getAxisValue(9);
            } else {
                axisValue = motionEvent.isFromSource(4194304) ? motionEvent.getAxisValue(26) : 0.0f;
            }
            int iRound = Math.round(axisValue * this.mVerticalScrollFactor);
            if (iRound != 0) {
                int scrollRange = getScrollRange();
                int scrollY = getScrollY();
                int i = scrollY - iRound;
                if (i < 0) {
                    scrollRange = 0;
                } else if (i <= scrollRange) {
                    scrollRange = i;
                }
                if (scrollRange != scrollY) {
                    super.scrollTo(getScrollX(), scrollRange);
                    return true;
                }
            }
        }
        return super.onGenericMotionEvent(motionEvent);
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0097  */
    /* JADX WARN: Code duplicated, block: B:42:0x00b5  */
    @Override // android.widget.ScrollView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if ((action == 2 && this.mIsBeingDragged) || super.onInterceptTouchEvent(motionEvent)) {
            return true;
        }
        int i = action & 255;
        if (i == 0) {
            NearIOverScroller nearIOverScroller = this.mOverScroller;
            float currVelocityY = nearIOverScroller != null ? nearIOverScroller.getCurrVelocityY() : 0.0f;
            this.mIsTouchDownWhileSlowScrolling = Math.abs(currVelocityY) > 0.0f && Math.abs(currVelocityY) < 250.0f && ((Math.abs(this.mFlingVelocityY) > 1500.0f ? 1 : (Math.abs(this.mFlingVelocityY) == 1500.0f ? 0 : -1)) > 0);
            this.mIsTouchDownWhileOverScrolling = isOverScrolling();
            this.mTouchTime = System.currentTimeMillis();
            int y = (int) motionEvent.getY();
            if (inChild((int) motionEvent.getX(), y)) {
                this.mLastMotionY = y;
                this.mInitialTouchY = y;
                this.mActivePointerId = motionEvent.getPointerId(0);
                initOrResetVelocityTracker();
                this.mVelocityTracker.addMovement(motionEvent);
                this.mOverScroller.computeScrollOffset();
                boolean z = !this.mOverScroller.isNearFinished();
                this.mIsBeingDragged = z;
                if (z && !this.mScrollStrictSpan) {
                    this.mScrollStrictSpan = true;
                }
                startNestedScroll(2);
            } else {
                this.mIsBeingDragged = false;
                recycleVelocityTracker();
            }
        } else if (i == 1) {
            this.mIsBeingDragged = false;
            this.mActivePointerId = -1;
            recycleVelocityTracker();
            if (this.mOverScroller.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                postInvalidateOnAnimation();
            }
            stopNestedScroll();
        } else if (i == 2) {
            int i2 = this.mActivePointerId;
            if (i2 != -1) {
                int iFindPointerIndex = motionEvent.findPointerIndex(i2);
                if (iFindPointerIndex == -1) {
                    Log.e(TAG, "Invalid pointerId=" + i2 + " in onInterceptTouchEvent");
                } else {
                    int y2 = (int) motionEvent.getY(iFindPointerIndex);
                    if (Math.abs(y2 - this.mLastMotionY) > this.mTouchSlop && (2 & getNestedScrollAxes()) == 0) {
                        this.mIsBeingDragged = true;
                        this.mLastMotionY = y2;
                        initVelocityTrackerIfNotExists();
                        this.mVelocityTracker.addMovement(motionEvent);
                        this.mNestedYOffset = 0;
                        if (!this.mScrollStrictSpan) {
                            this.mScrollStrictSpan = true;
                        }
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
            recycleVelocityTracker();
            if (this.mOverScroller.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                postInvalidateOnAnimation();
            }
            stopNestedScroll();
        } else if (i == 5) {
            this.mInitialTouchY = (int) motionEvent.getY(0);
        } else if (i == 6) {
            onSecondaryPointerUp(motionEvent);
        }
        return this.mIsBeingDragged;
    }

    @Override // android.widget.ScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.mIsLayoutDirty = false;
        View view = this.mChildToScrollTo;
        if (view != null && isViewDescendantOf(view, this)) {
            scrollToDescendant(this.mChildToScrollTo);
        }
        this.mChildToScrollTo = null;
        if (!isLaidOut()) {
            SavedState savedState = this.mSavedState;
            if (savedState != null) {
                l0l.c(this, savedState.scrollPosition);
                this.mSavedState = null;
            }
            int iMax = Math.max(0, (getChildCount() > 0 ? getChildAt(0).getMeasuredHeight() : 0) - (((i4 - i2) - getPaddingBottom()) - getPaddingTop()));
            if (getScrollY() > iMax) {
                l0l.c(this, iMax);
            } else if (getScrollY() < 0) {
                l0l.c(this, 0);
            }
        }
        this.mOverScroller.abortAnimation();
        scrollToWithClamp(getScrollX(), getScrollY());
    }

    @Override // android.widget.ScrollView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int paddingLeft;
        int paddingTop;
        int paddingBottom;
        super.onMeasure(i, i2);
        if (this.mFillViewport && View.MeasureSpec.getMode(i2) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            int i3 = getContext().getApplicationInfo().targetSdkVersion;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            if (i3 >= 23) {
                paddingLeft = getPaddingLeft() + getPaddingRight() + layoutParams.leftMargin + layoutParams.rightMargin;
                paddingTop = getPaddingTop() + getPaddingBottom() + layoutParams.topMargin;
                paddingBottom = layoutParams.bottomMargin;
            } else {
                paddingLeft = getPaddingLeft() + getPaddingRight();
                paddingTop = getPaddingTop();
                paddingBottom = getPaddingBottom();
            }
            int measuredHeight = getMeasuredHeight() - (paddingTop + paddingBottom);
            if (childAt.getMeasuredHeight() < measuredHeight) {
                childAt.measure(ViewGroup.getChildMeasureSpec(i, paddingLeft, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
            }
        }
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (z) {
            return false;
        }
        flingWithNestedDispatch((int) f2);
        return true;
    }

    @Override // android.widget.ScrollView, android.view.View
    public void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        if (getScrollY() == i2 && getScrollX() == i) {
            return;
        }
        if (isOverScrolling() && this.mFlingStrictSpan) {
            int scrollRange = i2 >= getScrollRange() ? getScrollRange() : 0;
            i2 = pjc.a(scrollRange, i2 - scrollRange, this.mScreenHeight);
        }
        if (getOverScrollMode() == 2 || (getOverScrollMode() == 1 && getChildAt(0).getHeight() <= getScrollableRange())) {
            i2 = Math.min(Math.max(i2, 0), getScrollRange());
        }
        if (getScrollY() >= 0 && i2 < 0 && this.mFlingStrictSpan) {
            performHapticFeedback(307);
            this.mSpringOverScroller.notifyVerticalEdgeReached(i2, 0, this.mOverflingDistance);
        }
        if (getScrollY() <= getScrollRange() && i2 > getScrollRange() && this.mFlingStrictSpan) {
            performHapticFeedback(307);
            this.mSpringOverScroller.notifyVerticalEdgeReached(i2, getScrollRange(), this.mOverflingDistance);
        }
        scrollTo(i, i2);
        invalidateParentIfNeeded();
        awakenScrollBars();
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (i == 2) {
            i = 130;
        } else if (i == 1) {
            i = 33;
        }
        View viewFindNextFocus = rect == null ? FocusFinder.getInstance().findNextFocus(this, null, i) : FocusFinder.getInstance().findNextFocusFromRect(this, rect, i);
        if (viewFindNextFocus == null || isOffScreen(viewFindNextFocus)) {
            return false;
        }
        return viewFindNextFocus.requestFocus(i, rect);
    }

    @Override // android.widget.ScrollView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (getContext().getApplicationInfo().targetSdkVersion <= 18) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.mSavedState = savedState;
        requestLayout();
    }

    @Override // android.widget.ScrollView, android.view.View
    public Parcelable onSaveInstanceState() {
        if (getContext().getApplicationInfo().targetSdkVersion <= 18) {
            return super.onSaveInstanceState();
        }
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.scrollPosition = getScrollY();
        return savedState;
    }

    @Override // android.widget.ScrollView, android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.mScreenHeight = getContext().getResources().getDisplayMetrics().heightPixels;
        View viewFindFocus = findFocus();
        if (viewFindFocus == null || this == viewFindFocus || !isWithinDeltaOfScreen(viewFindFocus, 0, i4)) {
            return;
        }
        viewFindFocus.getDrawingRect(this.mTempRect);
        offsetDescendantRectToMyCoords(viewFindFocus, this.mTempRect);
        doScrollY(computeScrollDeltaToGetChildRectOnScreen(this.mTempRect));
    }

    /* JADX WARN: Code duplicated, block: B:61:0x016a  */
    @Override // android.widget.ScrollView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        ViewParent parent;
        int i;
        int iB;
        int scrollY;
        initVelocityTrackerIfNotExists();
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        boolean z = false;
        if (actionMasked == 0) {
            this.mNestedYOffset = 0;
        }
        motionEventObtain.offsetLocation(0.0f, this.mNestedYOffset);
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                boolean zIsOverScrolling = isOverScrolling();
                boolean z2 = this.mItemClickableWhileSlowScrolling && this.mIsTouchDownWhileSlowScrolling;
                if (this.mItemClickableWhileOverScrolling && this.mIsTouchDownWhileOverScrolling && zIsOverScrolling) {
                    z = true;
                }
                if (z2 || z) {
                    findViewToDispatchClickEvent(motionEvent);
                }
                if (this.mIsBeingDragged) {
                    initVelocityTrackerIfNotExists();
                    VelocityTracker velocityTracker = this.mVelocityTracker;
                    velocityTracker.computeCurrentVelocity(1000, this.mMaximumVelocity);
                    int yVelocity = (int) velocityTracker.getYVelocity(this.mActivePointerId);
                    if (Math.abs(yVelocity) > this.mMinimumVelocity) {
                        int i2 = -yVelocity;
                        this.mOverScroller.setCurrVelocityY(i2);
                        if (getScrollY() < 0) {
                            if (yVelocity <= -1500) {
                                flingWithNestedDispatch(i2);
                            } else if (this.mOverScroller.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                                postInvalidateOnAnimation();
                            }
                        } else if (getScrollY() <= getScrollRange() || yVelocity >= 1500) {
                            flingWithNestedDispatch(i2);
                        } else if (this.mOverScroller.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                            postInvalidateOnAnimation();
                        }
                    } else if (this.mOverScroller.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                        postInvalidateOnAnimation();
                    }
                    if (getScrollY() < 0 || getScrollY() > getScrollRange()) {
                        performHapticFeedback(307);
                    }
                    this.mActivePointerId = -1;
                    endDrag();
                } else if (this.mOverScroller.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    postInvalidateOnAnimation();
                }
            } else if (actionMasked == 2) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.mActivePointerId);
                if (iFindPointerIndex == -1) {
                    Log.e(TAG, "Invalid pointerId=" + this.mActivePointerId + " in onTouchEvent");
                } else {
                    int y = (int) motionEvent.getY(iFindPointerIndex);
                    int i3 = this.mLastMotionY - y;
                    if (dispatchNestedPreScroll(0, i3, this.mScrollConsumed, this.mScrollOffset)) {
                        i3 -= this.mScrollConsumed[1];
                        motionEventObtain.offsetLocation(0.0f, this.mScrollOffset[1]);
                        this.mNestedYOffset += this.mScrollOffset[1];
                    }
                    if (!this.mIsBeingDragged && Math.abs(i3) > this.mTouchSlop) {
                        ViewParent parent2 = getParent();
                        if (parent2 != null) {
                            parent2.requestDisallowInterceptTouchEvent(true);
                        }
                        this.mIsBeingDragged = true;
                        i3 = i3 > 0 ? i3 - this.mTouchSlop : i3 + this.mTouchSlop;
                    }
                    int i4 = i3;
                    if (this.mIsBeingDragged) {
                        this.mLastMotionY = y - this.mScrollOffset[1];
                        int scrollY2 = getScrollY();
                        int scrollRange = getScrollRange();
                        getOverScrollMode();
                        if (getScrollY() < 0) {
                            iB = pjc.b(i4, getScrollY(), this.mOverscrollDistance);
                        } else {
                            if (getScrollY() > getScrollRange()) {
                                iB = pjc.b(i4, getScrollY() - getScrollRange(), this.mOverscrollDistance);
                            } else {
                                i = i4;
                            }
                            if (overScrollBy(0, i, 0, getScrollY(), 0, scrollRange, 0, this.mOverscrollDistance, true) && !hasNestedScrollingParent()) {
                                this.mVelocityTracker.clear();
                            }
                            scrollY = getScrollY() - scrollY2;
                            if (dispatchNestedScroll(0, scrollY, 0, i4 - scrollY, this.mScrollOffset)) {
                                int i5 = this.mLastMotionY;
                                int i6 = this.mScrollOffset[1];
                                this.mLastMotionY = i5 - i6;
                                motionEventObtain.offsetLocation(0.0f, i6);
                                this.mNestedYOffset += this.mScrollOffset[1];
                            }
                        }
                        i = iB;
                        if (overScrollBy(0, i, 0, getScrollY(), 0, scrollRange, 0, this.mOverscrollDistance, true)) {
                            this.mVelocityTracker.clear();
                        }
                        scrollY = getScrollY() - scrollY2;
                        if (dispatchNestedScroll(0, scrollY, 0, i4 - scrollY, this.mScrollOffset)) {
                            int i7 = this.mLastMotionY;
                            int i8 = this.mScrollOffset[1];
                            this.mLastMotionY = i7 - i8;
                            motionEventObtain.offsetLocation(0.0f, i8);
                            this.mNestedYOffset += this.mScrollOffset[1];
                        }
                    }
                }
            } else if (actionMasked != 3) {
                if (actionMasked == 5) {
                    int actionIndex = motionEvent.getActionIndex();
                    int y2 = (int) motionEvent.getY(actionIndex);
                    this.mLastMotionY = y2;
                    this.mInitialTouchY = y2;
                    this.mActivePointerId = motionEvent.getPointerId(actionIndex);
                } else if (actionMasked == 6) {
                    onSecondaryPointerUp(motionEvent);
                    this.mLastMotionY = (int) motionEvent.getY(motionEvent.findPointerIndex(this.mActivePointerId));
                }
            } else if (this.mIsBeingDragged && getChildCount() > 0) {
                if (this.mOverScroller.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    postInvalidateOnAnimation();
                }
                this.mActivePointerId = -1;
                endDrag();
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
            int y3 = (int) motionEvent.getY();
            this.mLastMotionY = y3;
            this.mInitialTouchY = y3;
            this.mActivePointerId = motionEvent.getPointerId(0);
            startNestedScroll(2);
        }
        VelocityTracker velocityTracker2 = this.mVelocityTracker;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(motionEventObtain);
        }
        motionEventObtain.recycle();
        return true;
    }

    @Override // android.view.View
    public boolean overScrollBy(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z) {
        onOverScrolled(i3 + i, i4 + i2, false, false);
        return false;
    }

    @Override // android.widget.ScrollView
    public boolean pageScroll(int i) {
        boolean z = i == 130;
        int height = getHeight();
        if (z) {
            this.mTempRect.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                if (this.mTempRect.top + height > childAt.getBottom()) {
                    this.mTempRect.top = childAt.getBottom() - height;
                }
            }
        } else {
            this.mTempRect.top = getScrollY() - height;
            Rect rect = this.mTempRect;
            if (rect.top < 0) {
                rect.top = 0;
            }
        }
        Rect rect2 = this.mTempRect;
        int i2 = rect2.top;
        int i3 = height + i2;
        rect2.bottom = i3;
        return scrollAndFocus(i, i2, i3);
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (view2 != null && view2.getRevealOnFocusHint()) {
            if (this.mIsLayoutDirty) {
                this.mChildToScrollTo = view2;
            } else {
                scrollToDescendant(view2);
            }
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        return scrollToChildRect(rect, z);
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        if (z) {
            recycleVelocityTracker();
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override // android.widget.ScrollView, android.view.View, android.view.ViewParent
    public void requestLayout() {
        this.mIsLayoutDirty = true;
        super.requestLayout();
    }

    @Override // android.widget.ScrollView, android.view.View
    public void scrollTo(int i, int i2) {
        if (getChildCount() > 0) {
            if (getScrollX() == i && getScrollY() == i2) {
                return;
            }
            int scrollX = getScrollX();
            int scrollY = getScrollY();
            l0l.b(this, i);
            l0l.c(this, i2);
            onScrollChanged(i, i2, scrollX, scrollY);
            if (awakenScrollBars()) {
                return;
            }
            postInvalidateOnAnimation();
        }
    }

    @Override // android.widget.ScrollView
    public void scrollToDescendant(View view) {
        if (this.mIsLayoutDirty) {
            this.mChildToScrollTo = view;
            return;
        }
        view.getDrawingRect(this.mTempRect);
        offsetDescendantRectToMyCoords(view, this.mTempRect);
        int iComputeScrollDeltaToGetChildRectOnScreen = computeScrollDeltaToGetChildRectOnScreen(this.mTempRect);
        if (iComputeScrollDeltaToGetChildRectOnScreen != 0) {
            scrollBy(0, iComputeScrollDeltaToGetChildRectOnScreen);
        }
    }

    public void setEnableFlingSpeedIncrease(boolean z) {
        SpringOverScroller springOverScroller = this.mSpringOverScroller;
        if (springOverScroller != null) {
            springOverScroller.f(z);
        }
    }

    @Override // android.widget.ScrollView
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

    @Override // android.widget.ScrollView
    public void setSmoothScrollingEnabled(boolean z) {
        this.mSmoothScrollingEnabled = z;
    }

    public final void smoothNearScrollBy(int i, int i2) {
        if (getChildCount() == 0) {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - this.mLastScroll > 250) {
            int iMax = Math.max(0, getChildAt(0).getHeight() - ((getHeight() - getPaddingBottom()) - getPaddingTop()));
            int scrollY = getScrollY();
            this.mOverScroller.startScroll(getScrollX(), scrollY, 0, Math.max(0, Math.min(i2 + scrollY, iMax)) - scrollY);
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

    public NearScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mScreenHeight = 0;
        this.mTempRect = new Rect();
        this.mOverScroller = null;
        this.mSpringOverScroller = null;
        this.mIsLayoutDirty = true;
        this.mChildToScrollTo = null;
        this.mIsBeingDragged = false;
        this.mSmoothScrollingEnabled = true;
        this.mActivePointerId = -1;
        this.mScrollOffset = new int[2];
        this.mScrollConsumed = new int[2];
        this.mScrollStrictSpan = false;
        this.mFlingStrictSpan = false;
        this.mItemClickableWhileSlowScrolling = true;
        this.mItemClickableWhileOverScrolling = true;
        this.mDebugPaint = new Paint();
        initNearScrollView(context);
    }

    public NearScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mScreenHeight = 0;
        this.mTempRect = new Rect();
        this.mOverScroller = null;
        this.mSpringOverScroller = null;
        this.mIsLayoutDirty = true;
        this.mChildToScrollTo = null;
        this.mIsBeingDragged = false;
        this.mSmoothScrollingEnabled = true;
        this.mActivePointerId = -1;
        this.mScrollOffset = new int[2];
        this.mScrollConsumed = new int[2];
        this.mScrollStrictSpan = false;
        this.mFlingStrictSpan = false;
        this.mItemClickableWhileSlowScrolling = true;
        this.mItemClickableWhileOverScrolling = true;
        this.mDebugPaint = new Paint();
        initNearScrollView(context);
    }

    public NearScrollView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.mScreenHeight = 0;
        this.mTempRect = new Rect();
        this.mOverScroller = null;
        this.mSpringOverScroller = null;
        this.mIsLayoutDirty = true;
        this.mChildToScrollTo = null;
        this.mIsBeingDragged = false;
        this.mSmoothScrollingEnabled = true;
        this.mActivePointerId = -1;
        this.mScrollOffset = new int[2];
        this.mScrollConsumed = new int[2];
        this.mScrollStrictSpan = false;
        this.mFlingStrictSpan = false;
        this.mItemClickableWhileSlowScrolling = true;
        this.mItemClickableWhileOverScrolling = true;
        this.mDebugPaint = new Paint();
        initNearScrollView(context);
    }
}
