package com.heytap.nearx.uikit.widget.scrollview;

import android.R;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.ScrollView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.AccessibilityRecordCompat;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.NearIOverScroller;
import com.heytap.nearx.uikit.scroll.SpringOverScroller;
import com.oplus.aiunit.vision.l0l;
import com.oplus.aiunit.vision.pjc;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes18.dex */
public class NearNestedScrollView extends NestedScrollView {
    static final int ANIMATED_SCROLL_GAP = 250;
    private static final boolean DEBUG = true;
    private static final int DEBUG_PAINT_TEXT_OFFSET_Y = 50;
    private static final int DEBUG_PAINT_TEXT_SIZE = 30;
    private static final int DEFAULT_SMOOTH_SCROLL_DURATION = 250;
    private static final int FLING_SCROLL_THRESHOLD = 1500;
    private static final int INVALID_POINTER = -1;
    private static final int OVER_SCROLL_TOUCH_DURATION_THRESHOLD = 100;
    private static final int OVER_SCROLL_TOUCH_OFFSET_THRESHOLD = 10;
    private static final int SLOW_SCROLL_THRESHOLD = 250;
    private static final String TAG = "NearNestedScrollView";
    private static final float VERTICAL_SPRING_BACK_TENSION_MULTIPLE = 2.15f;
    private int mActivePointerId;
    private View mChildToScrollTo;
    private Paint mDebugPaint;
    private boolean mFlingStrictSpan;
    private float mFlingVelocityY;
    private int mInitialTouchY;
    private boolean mIsBeingDragged;
    private boolean mIsLaidOut;
    private boolean mIsLayoutDirty;
    private boolean mIsTouchDownWhileOverScrolling;
    private boolean mIsTouchDownWhileSlowScrolling;
    private boolean mItemClickableWhileOverScrolling;
    private boolean mItemClickableWhileSlowScrolling;
    private int mLastMotionY;
    private long mLastScroll;
    private int mLastScrollerY;
    private int mMaximumVelocity;
    private int mMinimumVelocity;
    private int mNestedYOffset;
    private OnScrollChangeListener mOnScrollChangeListener;
    private NearIOverScroller mOverScroller;
    private int mOverflingDistance;
    private int mOverscrollDistance;
    private SavedState mSavedState;
    private int mScreenHeight;
    private final int[] mScrollConsumed;
    private final int[] mScrollOffset;
    private boolean mSmoothScrollingEnabled;
    private SpringOverScroller mSpringOverScroller;
    private final Rect mTempRect;
    private int mTouchSlop;
    private long mTouchTime;
    private VelocityTracker mVelocityTracker;
    private float mVerticalScrollFactor;

    public static class AccessibilityDelegate extends AccessibilityDelegateCompat {
        @Override // androidx.core.view.AccessibilityDelegateCompat
        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            NearNestedScrollView nearNestedScrollView = (NearNestedScrollView) view;
            accessibilityEvent.setClassName(NearScrollView.class.getName());
            accessibilityEvent.setScrollable(nearNestedScrollView.getScrollRange() > 0);
            accessibilityEvent.setScrollX(nearNestedScrollView.getScrollX());
            accessibilityEvent.setScrollY(nearNestedScrollView.getScrollY());
            AccessibilityRecordCompat.setMaxScrollX(accessibilityEvent, nearNestedScrollView.getScrollX());
            AccessibilityRecordCompat.setMaxScrollY(accessibilityEvent, nearNestedScrollView.getScrollRange());
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            int scrollRange;
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
            NearNestedScrollView nearNestedScrollView = (NearNestedScrollView) view;
            accessibilityNodeInfoCompat.setClassName(ScrollView.class.getName());
            if (!nearNestedScrollView.isEnabled() || (scrollRange = nearNestedScrollView.getScrollRange()) <= 0) {
                return;
            }
            accessibilityNodeInfoCompat.setScrollable(true);
            if (nearNestedScrollView.getScrollY() > 0) {
                accessibilityNodeInfoCompat.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_BACKWARD);
                accessibilityNodeInfoCompat.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_UP);
            }
            if (nearNestedScrollView.getScrollY() < scrollRange) {
                accessibilityNodeInfoCompat.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_FORWARD);
                accessibilityNodeInfoCompat.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_DOWN);
            }
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
            if (super.performAccessibilityAction(view, i, bundle)) {
                return true;
            }
            NearNestedScrollView nearNestedScrollView = (NearNestedScrollView) view;
            if (!nearNestedScrollView.isEnabled()) {
                return false;
            }
            if (i != 4096) {
                if (i == 8192 || i == 16908344) {
                    int iMax = Math.max(nearNestedScrollView.getScrollY() - ((nearNestedScrollView.getHeight() - nearNestedScrollView.getPaddingBottom()) - nearNestedScrollView.getPaddingTop()), 0);
                    if (iMax == nearNestedScrollView.getScrollY()) {
                        return false;
                    }
                    nearNestedScrollView.smoothNearScrollTo(0, iMax, true);
                    return true;
                }
                if (i != 16908346) {
                    return false;
                }
            }
            int iMin = Math.min(nearNestedScrollView.getScrollY() + ((nearNestedScrollView.getHeight() - nearNestedScrollView.getPaddingBottom()) - nearNestedScrollView.getPaddingTop()), nearNestedScrollView.getScrollRange());
            if (iMin == nearNestedScrollView.getScrollY()) {
                return false;
            }
            nearNestedScrollView.smoothNearScrollTo(0, iMin, true);
            return true;
        }
    }

    public interface OnScrollChangeListener {
        void onScrollChange(NearNestedScrollView nearNestedScrollView, int i, int i2, int i3, int i4);
    }

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() { // from class: com.heytap.nearx.uikit.widget.scrollview.NearNestedScrollView.SavedState.1
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

        @NonNull
        public String toString() {
            return "HorizontalScrollView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " scrollPosition=" + this.scrollPosition + "}";
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

    public NearNestedScrollView(@NonNull Context context) {
        this(context, null);
    }

    private void abortAnimatedScroll() {
        this.mOverScroller.abortAnimation();
        stopNestedScroll(1);
    }

    private boolean canScroll() {
        if (getChildCount() <= 0) {
            return false;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom();
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
                smoothScrollBy(0, i);
            } else {
                scrollBy(0, i);
            }
        }
    }

    private void endDrag() {
        this.mIsBeingDragged = false;
        recycleVelocityTracker();
        stopNestedScroll(0);
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

    private float getVerticalScrollFactorCompat() {
        if (this.mVerticalScrollFactor == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (!context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
            this.mVerticalScrollFactor = typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return this.mVerticalScrollFactor;
    }

    private boolean inChild(int i, int i2) {
        if (getChildCount() <= 0) {
            return false;
        }
        int scrollY = getScrollY();
        View childAt = getChildAt(0);
        return i2 >= childAt.getTop() - scrollY && i2 < childAt.getBottom() - scrollY && i >= childAt.getLeft() && i < childAt.getRight();
    }

    private void initOrResetVelocityTracker() {
        VelocityTracker velocityTracker = this.mVelocityTracker;
        if (velocityTracker == null) {
            this.mVelocityTracker = VelocityTracker.obtain();
        } else {
            velocityTracker.clear();
        }
    }

    private void initScrollView(Context context) {
        if (this.mOverScroller == null) {
            SpringOverScroller springOverScroller = new SpringOverScroller(context);
            this.mSpringOverScroller = springOverScroller;
            springOverScroller.h(VERTICAL_SPRING_BACK_TENSION_MULTIPLE);
            this.mSpringOverScroller.setIsScrollView(true);
            this.mOverScroller = this.mSpringOverScroller;
            setEnableFlingSpeedIncrease(true);
        }
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.mTouchSlop = viewConfiguration.getScaledTouchSlop();
        this.mMinimumVelocity = viewConfiguration.getScaledMinimumFlingVelocity();
        this.mMaximumVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
        int i = displayMetrics.heightPixels;
        this.mOverscrollDistance = i;
        this.mOverflingDistance = i;
        this.mScreenHeight = i;
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

    /* JADX WARN: Code duplicated, block: B:14:0x0043  */
    private void onNestedScrollInternal(int i, int i2, @Nullable int[] iArr) {
        int scrollRange;
        int scrollY = getScrollY();
        if (getOverScrollMode() != 2 && (getOverScrollMode() != 1 || getChildAt(0).getHeight() > getHeight())) {
            scrollRange = i;
        } else if (getScrollY() + i < 0) {
            scrollRange = -getScrollY();
        } else if (getScrollY() + i > getScrollRange()) {
            scrollRange = getScrollRange() - getScrollY();
        } else {
            scrollRange = i;
        }
        scrollBy(0, scrollRange);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        dispatchNestedScroll(0, scrollY2, 0, scrollRange - scrollY2, null, i2, iArr);
    }

    private void onSecondaryPointerUp(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.mActivePointerId) {
            int i = actionIndex == 0 ? 1 : 0;
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

    private void runAnimatedScroll(boolean z) {
        if (z) {
            startNestedScroll(2, 1);
        } else {
            stopNestedScroll(1);
        }
        this.mLastScrollerY = getScrollY();
        ViewCompat.postInvalidateOnAnimation(this);
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

    private void scrollToChild(View view) {
        view.getDrawingRect(this.mTempRect);
        offsetDescendantRectToMyCoords(view, this.mTempRect);
        int iComputeScrollDeltaToGetChildRectOnScreen = computeScrollDeltaToGetChildRectOnScreen(this.mTempRect);
        if (iComputeScrollDeltaToGetChildRectOnScreen != 0) {
            scrollBy(0, iComputeScrollDeltaToGetChildRectOnScreen);
        }
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

    @Override // androidx.core.widget.NestedScrollView
    public boolean arrowScroll(int i) {
        View viewFindFocus = findFocus();
        if (viewFindFocus == this) {
            viewFindFocus = null;
        }
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, i);
        int maxScrollAmount = getMaxScrollAmount();
        if (viewFindNextFocus == null || !isWithinDeltaOfScreen(viewFindNextFocus, maxScrollAmount, getHeight())) {
            if (i == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getScrollY() + getHeight()) - getPaddingBottom()), maxScrollAmount);
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

    @Override // androidx.core.widget.NestedScrollView, android.view.View
    public void computeScroll() {
        if (!this.mOverScroller.computeScrollOffset()) {
            if (this.mFlingStrictSpan) {
                this.mFlingStrictSpan = false;
                return;
            }
            return;
        }
        int nearCurrY = this.mOverScroller.getNearCurrY();
        if (!canScroll() && getOverScrollMode() != 0 && (nearCurrY < 0 || nearCurrY > getScrollRange())) {
            abortAnimatedScroll();
            this.mOverScroller.abortAnimation();
            return;
        }
        int i = nearCurrY - this.mLastScrollerY;
        this.mLastScrollerY = nearCurrY;
        int[] iArr = this.mScrollConsumed;
        iArr[1] = 0;
        dispatchNestedPreScroll(0, i, iArr, null, 1);
        int i2 = i - this.mScrollConsumed[1];
        int scrollRange = getScrollRange();
        if (i2 != 0) {
            int scrollY = getScrollY();
            overScrollByCompat(0, i2, getScrollX(), scrollY, 0, scrollRange, 0, this.mOverflingDistance, false);
            int scrollY2 = getScrollY() - scrollY;
            int[] iArr2 = this.mScrollConsumed;
            iArr2[1] = 0;
            dispatchNestedScroll(0, scrollY2, 0, i2 - scrollY2, this.mScrollOffset, 1, iArr2);
            int i3 = this.mScrollConsumed[1];
        }
        if (this.mOverScroller.isNearFinished()) {
            stopNestedScroll(1);
        } else {
            ViewCompat.postInvalidateOnAnimation(this);
        }
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || executeKeyEvent(keyEvent);
    }

    @Override // androidx.core.widget.NestedScrollView
    public boolean executeKeyEvent(@NonNull KeyEvent keyEvent) {
        this.mTempRect.setEmpty();
        if (!canScroll()) {
            if (!isFocused() || keyEvent.getKeyCode() == 4) {
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

    @Override // androidx.core.widget.NestedScrollView
    public void fling(int i) {
        this.mFlingVelocityY = i;
        if (getChildCount() > 0) {
            this.mOverScroller.fling(getScrollX(), getScrollY(), 0, i, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            runAnimatedScroll(true);
            if (this.mFlingStrictSpan) {
                return;
            }
            this.mFlingStrictSpan = true;
        }
    }

    @Override // androidx.core.widget.NestedScrollView
    public boolean fullScroll(int i) {
        int childCount;
        boolean z = i == 130;
        int height = getHeight();
        Rect rect = this.mTempRect;
        rect.top = 0;
        rect.bottom = height;
        if (z && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            this.mTempRect.bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
            Rect rect2 = this.mTempRect;
            rect2.top = rect2.bottom - height;
        }
        Rect rect3 = this.mTempRect;
        return scrollAndFocus(i, rect3.top, rect3.bottom);
    }

    public int getScrollRange() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
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

    @Override // androidx.core.widget.NestedScrollView
    public boolean isSmoothScrollingEnabled() {
        return this.mSmoothScrollingEnabled;
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.mIsLaidOut = false;
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.View
    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        if ((motionEvent.getSource() & 2) != 0 && motionEvent.getAction() == 8 && !this.mIsBeingDragged) {
            float axisValue = motionEvent.getAxisValue(9);
            if (axisValue != 0.0f) {
                int verticalScrollFactorCompat = (int) (axisValue * getVerticalScrollFactorCompat());
                int scrollRange = getScrollRange();
                int scrollY = getScrollY();
                int i = scrollY - verticalScrollFactorCompat;
                if (i < 0) {
                    scrollRange = 0;
                } else if (i <= scrollRange) {
                    scrollRange = i;
                }
                if (scrollRange != scrollY) {
                    scrollTo(getScrollX(), scrollRange);
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x008a  */
    /* JADX WARN: Code duplicated, block: B:36:0x00a8  */
    @Override // androidx.core.widget.NestedScrollView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 2 && this.mIsBeingDragged) {
            return true;
        }
        int i = action & 255;
        if (i == 0) {
            NearIOverScroller nearIOverScroller = this.mOverScroller;
            float currVelocityY = nearIOverScroller != null ? nearIOverScroller.getCurrVelocityY() : 0.0f;
            boolean z = Math.abs(this.mFlingVelocityY) > 1500.0f;
            this.mIsTouchDownWhileSlowScrolling = Math.abs(currVelocityY) > 0.0f && Math.abs(currVelocityY) < 250.0f && z;
            this.mIsTouchDownWhileOverScrolling = isOverScrolling();
            this.mTouchTime = System.currentTimeMillis();
            StringBuilder sb = new StringBuilder();
            sb.append("onInterceptTouchEvent: ACTION_DOWN, isFastFlingY = ");
            sb.append(z);
            sb.append(", isSlowScrolling = ");
            sb.append(this.mIsTouchDownWhileSlowScrolling);
            sb.append(", \nMath.abs(scrollVelocityY) > 0 = ");
            sb.append(Math.abs(currVelocityY) > 0.0f);
            sb.append(", \nscrollVelocityY = ");
            sb.append(currVelocityY);
            sb.append(", \nMath.abs(scrollVelocityY) < SLOW_SCROLL_THRESHOLD = ");
            sb.append(Math.abs(currVelocityY) < 250.0f);
            sb.append(", \nisOverScrolling = ");
            sb.append(this.mIsTouchDownWhileOverScrolling);
            sb.append(", scrollVelocityY = ");
            sb.append(Math.abs(currVelocityY));
            sb.append(", mFlingVelocityY = ");
            sb.append(this.mFlingVelocityY);
            Log.d(TAG, sb.toString());
            int y = (int) motionEvent.getY();
            if (inChild((int) motionEvent.getX(), y)) {
                this.mLastMotionY = y;
                this.mInitialTouchY = y;
                this.mActivePointerId = motionEvent.getPointerId(0);
                initOrResetVelocityTracker();
                this.mVelocityTracker.addMovement(motionEvent);
                this.mOverScroller.computeScrollOffset();
                this.mIsBeingDragged = !this.mOverScroller.isNearFinished();
                startNestedScroll(2, 0);
            } else {
                this.mIsBeingDragged = false;
                recycleVelocityTracker();
            }
        } else if (i == 1) {
            this.mIsBeingDragged = false;
            this.mActivePointerId = -1;
            recycleVelocityTracker();
            if (this.mOverScroller.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                ViewCompat.postInvalidateOnAnimation(this);
            }
            stopNestedScroll(0);
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
                ViewCompat.postInvalidateOnAnimation(this);
            }
            stopNestedScroll(0);
        } else if (i == 5) {
            this.mInitialTouchY = (int) motionEvent.getY(0);
        } else if (i == 6) {
            onSecondaryPointerUp(motionEvent);
        }
        return this.mIsBeingDragged;
    }

    @Override // androidx.core.widget.NestedScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int scrollY = getScrollY();
        super.onLayout(z, i, i2, i3, i4);
        this.mIsLayoutDirty = false;
        View view = this.mChildToScrollTo;
        if (view != null && isViewDescendantOf(view, this)) {
            scrollToChild(this.mChildToScrollTo);
        }
        this.mChildToScrollTo = null;
        if (!this.mIsLaidOut) {
            if (this.mSavedState != null) {
                scrollTo(getScrollX(), this.mSavedState.scrollPosition);
                this.mSavedState = null;
            }
            l0l.c(this, scrollY);
        }
        l0l.c(this, scrollY);
        scrollTo(getScrollX(), getScrollY());
        this.mIsLaidOut = true;
    }

    @Override // androidx.core.widget.NestedScrollView, androidx.core.view.NestedScrollingParent3
    public void onNestedScroll(@NonNull View view, int i, int i2, int i3, int i4, int i5, @NonNull int[] iArr) {
        onNestedScrollInternal(i4, i5, iArr);
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.View
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
        this.mLastScrollerY = i2;
        scrollTo(i, i2);
        invalidateParentIfNeeded();
        awakenScrollBars();
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.ViewGroup
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

    @Override // androidx.core.widget.NestedScrollView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.mSavedState = savedState;
        requestLayout();
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.scrollPosition = getScrollY();
        return savedState;
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.View
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        OnScrollChangeListener onScrollChangeListener = this.mOnScrollChangeListener;
        if (onScrollChangeListener != null) {
            onScrollChangeListener.onScrollChange(this, i, i2, i3, i4);
        }
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.View
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

    @Override // androidx.core.widget.NestedScrollView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        ViewParent parent;
        initVelocityTrackerIfNotExists();
        int actionMasked = motionEvent.getActionMasked();
        boolean z = false;
        if (actionMasked == 0) {
            this.mNestedYOffset = 0;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
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
                        int i = -yVelocity;
                        float f = i;
                        this.mOverScroller.setCurrVelocityY(f);
                        if (getScrollY() < 0) {
                            if (yVelocity > -1500) {
                                if (this.mOverScroller.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                                    ViewCompat.postInvalidateOnAnimation(this);
                                }
                            } else if (!dispatchNestedPreFling(0.0f, f)) {
                                dispatchNestedFling(0.0f, f, true);
                                fling(i);
                            }
                        } else if (getScrollY() > getScrollRange()) {
                            if (yVelocity < 1500) {
                                if (this.mOverScroller.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                                    ViewCompat.postInvalidateOnAnimation(this);
                                }
                            } else if (!dispatchNestedPreFling(0.0f, f)) {
                                dispatchNestedFling(0.0f, f, true);
                                fling(i);
                            }
                        } else if (!dispatchNestedPreFling(0.0f, f)) {
                            dispatchNestedFling(0.0f, f, true);
                            fling(i);
                        }
                    } else if (this.mOverScroller.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                        ViewCompat.postInvalidateOnAnimation(this);
                    }
                    if (getScrollY() < 0 || getScrollY() > getScrollRange()) {
                        performHapticFeedback(307);
                    }
                    this.mActivePointerId = -1;
                    endDrag();
                }
            } else if (actionMasked == 2) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.mActivePointerId);
                if (iFindPointerIndex == -1) {
                    Log.e(TAG, "Invalid pointerId=" + this.mActivePointerId + " in onTouchEvent");
                } else {
                    int y = (int) motionEvent.getY(iFindPointerIndex);
                    int i2 = this.mLastMotionY - y;
                    if (!this.mIsBeingDragged && Math.abs(i2) > this.mTouchSlop) {
                        ViewParent parent2 = getParent();
                        if (parent2 != null) {
                            parent2.requestDisallowInterceptTouchEvent(true);
                        }
                        this.mIsBeingDragged = true;
                        i2 = i2 > 0 ? i2 - this.mTouchSlop : i2 + this.mTouchSlop;
                    }
                    int iB = i2;
                    if (this.mIsBeingDragged) {
                        if (dispatchNestedPreScroll(0, iB, this.mScrollConsumed, this.mScrollOffset, 0)) {
                            iB -= this.mScrollConsumed[1];
                            this.mNestedYOffset += this.mScrollOffset[1];
                        }
                        this.mLastMotionY = y - this.mScrollOffset[1];
                        int scrollY = getScrollY();
                        int scrollRange = getScrollRange();
                        if (getScrollY() < 0) {
                            iB = pjc.b(iB, getScrollY(), this.mOverscrollDistance);
                        } else if (getScrollY() > getScrollRange()) {
                            iB = pjc.b(iB, getScrollY() - getScrollRange(), this.mOverscrollDistance);
                        }
                        int i3 = iB;
                        if (overScrollByCompat(0, i3, 0, getScrollY(), 0, scrollRange, 0, this.mOverflingDistance, true) && !hasNestedScrollingParent(0)) {
                            this.mVelocityTracker.clear();
                        }
                        int scrollY2 = getScrollY() - scrollY;
                        int[] iArr = this.mScrollConsumed;
                        iArr[1] = 0;
                        dispatchNestedScroll(0, scrollY2, 0, i3 - scrollY2, this.mScrollOffset, 0, iArr);
                        int i4 = this.mLastMotionY;
                        int i5 = this.mScrollOffset[1];
                        this.mLastMotionY = i4 - i5;
                        this.mNestedYOffset += i5;
                    }
                }
            } else if (actionMasked == 3) {
                if (this.mIsBeingDragged && getChildCount() > 0 && this.mOverScroller.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    ViewCompat.postInvalidateOnAnimation(this);
                }
                this.mActivePointerId = -1;
                endDrag();
            } else if (actionMasked == 5) {
                int actionIndex = motionEvent.getActionIndex();
                int y2 = (int) motionEvent.getY(actionIndex);
                this.mLastMotionY = y2;
                this.mInitialTouchY = y2;
                this.mActivePointerId = motionEvent.getPointerId(actionIndex);
            } else if (actionMasked == 6) {
                onSecondaryPointerUp(motionEvent);
                this.mLastMotionY = (int) motionEvent.getY(motionEvent.findPointerIndex(this.mActivePointerId));
            }
        } else {
            if (getChildCount() == 0) {
                return false;
            }
            boolean z3 = !this.mOverScroller.isNearFinished();
            this.mIsBeingDragged = z3;
            if (z3 && (parent = getParent()) != null) {
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
            startNestedScroll(2, 0);
        }
        VelocityTracker velocityTracker2 = this.mVelocityTracker;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(motionEventObtain);
        }
        motionEventObtain.recycle();
        return true;
    }

    public boolean overScrollByCompat(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z) {
        boolean z2;
        boolean z3;
        int overScrollMode = getOverScrollMode();
        boolean z4 = computeHorizontalScrollRange() > computeHorizontalScrollExtent();
        boolean z5 = computeVerticalScrollRange() > computeVerticalScrollExtent();
        boolean z6 = overScrollMode == 0 || (overScrollMode == 1 && z4);
        boolean z7 = overScrollMode == 0 || (overScrollMode == 1 && z5);
        int i9 = i3 + i;
        int i10 = !z6 ? 0 : i7;
        int i11 = i4 + i2;
        int i12 = !z7 ? 0 : i8;
        int i13 = -i10;
        int i14 = i10 + i5;
        int i15 = -i12;
        int i16 = i12 + i6;
        if (i9 > i14) {
            i9 = i14;
            z2 = true;
        } else if (i9 < i13) {
            z2 = true;
            i9 = i13;
        } else {
            z2 = false;
        }
        if (i11 > i16) {
            i11 = i16;
            z3 = true;
        } else if (i11 < i15) {
            z3 = true;
            i11 = i15;
        } else {
            z3 = false;
        }
        if (z3 && !hasNestedScrollingParent(1)) {
            this.mOverScroller.springBack(i9, i11, 0, 0, 0, getScrollRange());
        }
        onOverScrolled(i9, i11, z2, z3);
        return z2 || z3;
    }

    @Override // androidx.core.widget.NestedScrollView
    public boolean pageScroll(int i) {
        boolean z = i == 130;
        int height = getHeight();
        if (z) {
            this.mTempRect.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
                Rect rect = this.mTempRect;
                if (rect.top + height > bottom) {
                    rect.top = bottom - height;
                }
            }
        } else {
            this.mTempRect.top = getScrollY() - height;
            Rect rect2 = this.mTempRect;
            if (rect2.top < 0) {
                rect2.top = 0;
            }
        }
        Rect rect3 = this.mTempRect;
        int i2 = rect3.top;
        int i3 = height + i2;
        rect3.bottom = i3;
        return scrollAndFocus(i, i2, i3);
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (this.mIsLayoutDirty) {
            this.mChildToScrollTo = view2;
        } else {
            scrollToChild(view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        if (z) {
            recycleVelocityTracker();
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.View, android.view.ViewParent
    public void requestLayout() {
        this.mIsLayoutDirty = true;
        super.requestLayout();
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.View
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

    public void setEnableFlingSpeedIncrease(boolean z) {
        SpringOverScroller springOverScroller = this.mSpringOverScroller;
        if (springOverScroller != null) {
            springOverScroller.f(z);
        }
    }

    public void setItemClickableWhileOverScrolling(boolean z) {
        this.mItemClickableWhileOverScrolling = z;
    }

    public void setItemClickableWhileSlowScrolling(boolean z) {
        this.mItemClickableWhileSlowScrolling = z;
    }

    public void setOnScrollChangeListener(@Nullable OnScrollChangeListener onScrollChangeListener) {
        this.mOnScrollChangeListener = onScrollChangeListener;
    }

    @Override // androidx.core.widget.NestedScrollView
    public void setSmoothScrollingEnabled(boolean z) {
        this.mSmoothScrollingEnabled = z;
    }

    public final void smoothNearScrollBy(int i, int i2) {
        smoothNearScrollBy(i, i2, 250, false);
    }

    public final void smoothNearScrollTo(int i, int i2) {
        smoothNearScrollTo(i, i2, 250, false);
    }

    @Override // androidx.core.widget.NestedScrollView, androidx.core.view.NestedScrollingChild2
    public void stopNestedScroll(int i) {
        super.stopNestedScroll(i);
        if (isOverScrolling() && this.mOverScroller.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
            ViewCompat.postInvalidateOnAnimation(this);
        }
    }

    public NearNestedScrollView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // androidx.core.widget.NestedScrollView, androidx.core.view.NestedScrollingParent2
    public void onNestedScroll(@NonNull View view, int i, int i2, int i3, int i4, int i5) {
        onNestedScrollInternal(i4, i5, null);
    }

    public final void smoothNearScrollBy(int i, int i2, int i3) {
        smoothNearScrollBy(i, i2, i3, false);
    }

    public final void smoothNearScrollTo(int i, int i2, int i3) {
        smoothNearScrollTo(i, i2, i3, false);
    }

    public NearNestedScrollView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mScreenHeight = 0;
        this.mItemClickableWhileSlowScrolling = true;
        this.mItemClickableWhileOverScrolling = true;
        this.mDebugPaint = new Paint();
        this.mTempRect = new Rect();
        this.mOverScroller = null;
        this.mSpringOverScroller = null;
        this.mIsLayoutDirty = true;
        this.mIsLaidOut = false;
        this.mChildToScrollTo = null;
        this.mIsBeingDragged = false;
        this.mSmoothScrollingEnabled = true;
        this.mActivePointerId = -1;
        this.mScrollOffset = new int[2];
        this.mScrollConsumed = new int[2];
        this.mFlingStrictSpan = false;
        initScrollView(context);
    }

    private void smoothNearScrollBy(int i, int i2, int i3, boolean z) {
        if (getChildCount() == 0) {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - this.mLastScroll > 250) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int height = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            this.mOverScroller.startScroll(getScrollX(), scrollY, 0, Math.max(0, Math.min(i2 + scrollY, Math.max(0, height - height2))) - scrollY, i3);
            runAnimatedScroll(z);
        } else {
            if (!this.mOverScroller.isNearFinished()) {
                abortAnimatedScroll();
                if (this.mFlingStrictSpan) {
                    this.mFlingStrictSpan = false;
                }
            }
            scrollBy(i, i2);
        }
        this.mLastScroll = AnimationUtils.currentAnimationTimeMillis();
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public void onNestedScroll(@NonNull View view, int i, int i2, int i3, int i4) {
        onNestedScrollInternal(i4, 0, null);
        this.mLastScrollerY += i4;
    }

    public void smoothNearScrollTo(int i, int i2, boolean z) {
        smoothNearScrollTo(i, i2, 250, z);
    }

    public void smoothNearScrollTo(int i, int i2, int i3, boolean z) {
        smoothNearScrollBy(i - getScrollX(), i2 - getScrollY(), i3, z);
    }
}
