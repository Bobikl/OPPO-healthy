package com.heytap.store.base.widget.refresh;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.Transformation;
import androidx.annotation.NonNull;
import androidx.core.view.MotionEventCompat;
import androidx.core.view.NestedScrollingChild;
import androidx.core.view.NestedScrollingChildHelper;
import androidx.core.view.NestedScrollingParent;
import androidx.core.view.NestedScrollingParentHelper;
import androidx.core.view.ViewCompat;
import com.heytap.store.platform.tools.LogUtils;

/* JADX INFO: loaded from: classes3.dex */
public class RefreshLayout extends ViewGroup implements NestedScrollingParent, NestedScrollingChild {
    private static final float DECELERATE_INTERPOLATION_FACTOR = 2.0f;
    private static final int DEFAULT_ANIMATE_DURATION = 300;
    private static final int DEFAULT_REFRESH_SIZE_DP = 30;
    private static final int DEFAULT_REFRESH_TARGET_OFFSET_DP = 50;
    private static final int INVALID_INDEX = -1;
    private static final int INVALID_POINTER = -1;
    private int mActivePointerId;
    private int mAnimateToRefreshDuration;
    private Interpolator mAnimateToRefreshInterpolator;
    private final Animation mAnimateToRefreshingAnimation;
    private final Animation mAnimateToStartAnimation;
    private int mAnimateToStartDuration;
    private Interpolator mAnimateToStartInterpolator;
    private float mCurrentTouchOffsetY;
    private boolean mDispatchTargetTouchDown;
    private IDragDistanceConverter mDragDistanceConverter;
    private int mFrom;
    private float mInitialDownY;
    private float mInitialMotionY;
    private float mInitialScrollY;
    private boolean mIsAnimatingToStart;
    private boolean mIsBeingDragged;
    private boolean mIsFitRefresh;
    private boolean mIsRefreshing;
    private boolean mNestedScrollInProgress;
    private final NestedScrollingChildHelper mNestedScrollingChildHelper;
    private final NestedScrollingParentHelper mNestedScrollingParentHelper;
    private boolean mNotifyListener;
    private OnRefreshListener mOnRefreshListener;
    private final int[] mParentOffsetInWindow;
    private final int[] mParentScrollConsumed;
    private float mRefreshInitialOffset;
    private IRefreshStatus mRefreshStatus;
    private RefreshStyle mRefreshStyle;
    private float mRefreshTargetOffset;
    private View mRefreshView;
    private int mRefreshViewIndex;
    private boolean mRefreshViewMeasured;
    private final int mRefreshViewSize;
    private final Animation.AnimationListener mRefreshingListener;
    private final Animation.AnimationListener mResetListener;
    private View mTarget;
    private float mTargetOrRefreshViewOffsetY;
    private float mTotalUnconsumed;
    private final int mTouchSlop;
    private boolean mUsingCustomRefreshInitialOffset;
    private boolean mUsingCustomRefreshTargetOffset;

    /* JADX INFO: renamed from: com.heytap.store.base.widget.refresh.RefreshLayout$5, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass5 {
        static final /* synthetic */ int[] $SwitchMap$com$heytap$store$base$widget$refresh$RefreshLayout$RefreshStyle;

        static {
            int[] iArr = new int[RefreshStyle.values().length];
            $SwitchMap$com$heytap$store$base$widget$refresh$RefreshLayout$RefreshStyle = iArr;
            try {
                iArr[RefreshStyle.FLOAT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$heytap$store$base$widget$refresh$RefreshLayout$RefreshStyle[RefreshStyle.PINNED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {
        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public interface OnRefreshListener {
        void onRefresh();
    }

    public enum RefreshStyle {
        NORMAL,
        PINNED,
        FLOAT
    }

    public RefreshLayout(Context context) {
        this(context, null);
    }

    private void animateOffsetToStartPosition(int i, Animation.AnimationListener animationListener) {
        clearAnimation();
        float f = i;
        if (computeAnimateToStartDuration(f) <= 0) {
            animationListener.onAnimationStart(null);
            animationListener.onAnimationEnd(null);
            return;
        }
        this.mFrom = i;
        this.mAnimateToStartAnimation.reset();
        this.mAnimateToStartAnimation.setDuration(computeAnimateToStartDuration(f));
        this.mAnimateToStartAnimation.setInterpolator(this.mAnimateToStartInterpolator);
        if (animationListener != null) {
            this.mAnimateToStartAnimation.setAnimationListener(animationListener);
        }
        startAnimation(this.mAnimateToStartAnimation);
    }

    private void animateToRefreshingPosition(int i, Animation.AnimationListener animationListener) {
        clearAnimation();
        float f = i;
        if (computeAnimateToRefreshingDuration(f) <= 0) {
            animationListener.onAnimationStart(null);
            animationListener.onAnimationEnd(null);
            return;
        }
        this.mFrom = i;
        this.mAnimateToRefreshingAnimation.reset();
        this.mAnimateToRefreshingAnimation.setDuration(computeAnimateToRefreshingDuration(f));
        this.mAnimateToRefreshingAnimation.setInterpolator(this.mAnimateToRefreshInterpolator);
        if (animationListener != null) {
            this.mAnimateToRefreshingAnimation.setAnimationListener(animationListener);
        }
        startAnimation(this.mAnimateToRefreshingAnimation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void animateToTargetOffset(float f, float f2, float f3) {
        int i = this.mFrom;
        setTargetOrRefreshViewOffsetY((int) (((int) (i + ((f - i) * f3))) - f2));
    }

    private boolean canChildScrollUp(View view) {
        if (view == null) {
            return false;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                if (canChildScrollUp(viewGroup.getChildAt(i))) {
                    return true;
                }
            }
        }
        return ViewCompat.canScrollVertically(view, -1);
    }

    private int computeAnimateToRefreshingDuration(float f) {
        float fMax;
        int i;
        LogUtils.INSTANCE.d("RecyclerRefreshLayout", "from -- refreshing " + f);
        if (f < this.mRefreshInitialOffset) {
            return 0;
        }
        if (AnonymousClass5.$SwitchMap$com$heytap$store$base$widget$refresh$RefreshLayout$RefreshStyle[this.mRefreshStyle.ordinal()] != 1) {
            fMax = Math.max(0.0f, Math.min(1.0f, Math.abs(f - this.mRefreshTargetOffset) / this.mRefreshTargetOffset));
            i = this.mAnimateToRefreshDuration;
        } else {
            fMax = Math.max(0.0f, Math.min(1.0f, Math.abs((f - this.mRefreshInitialOffset) - this.mRefreshTargetOffset) / this.mRefreshTargetOffset));
            i = this.mAnimateToRefreshDuration;
        }
        return (int) (fMax * i);
    }

    private int computeAnimateToStartDuration(float f) {
        float fMax;
        int i;
        LogUtils.INSTANCE.d("RecyclerRefreshLayout", "from -- start " + f);
        if (f < this.mRefreshInitialOffset) {
            return 0;
        }
        if (AnonymousClass5.$SwitchMap$com$heytap$store$base$widget$refresh$RefreshLayout$RefreshStyle[this.mRefreshStyle.ordinal()] != 1) {
            fMax = Math.max(0.0f, Math.min(1.0f, Math.abs(f) / this.mRefreshTargetOffset));
            i = this.mAnimateToStartDuration;
        } else {
            fMax = Math.max(0.0f, Math.min(1.0f, Math.abs(f - this.mRefreshInitialOffset) / this.mRefreshTargetOffset));
            i = this.mAnimateToStartDuration;
        }
        return (int) (fMax * i);
    }

    private void ensureTarget() {
        if (isTargetValid()) {
            return;
        }
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (!childAt.equals(this.mRefreshView)) {
                this.mTarget = childAt;
                return;
            }
        }
    }

    private void finishSpinner() {
        if (this.mIsRefreshing || this.mIsAnimatingToStart) {
            return;
        }
        if (getTargetOrRefreshViewOffset() > this.mRefreshTargetOffset) {
            setRefreshing(true, true);
        } else {
            this.mIsRefreshing = false;
            animateOffsetToStartPosition((int) this.mTargetOrRefreshViewOffsetY, this.mResetListener);
        }
    }

    private float getMotionEventY(MotionEvent motionEvent, int i) {
        int iFindPointerIndex = MotionEventCompat.findPointerIndex(motionEvent, i);
        if (iFindPointerIndex < 0) {
            return -1.0f;
        }
        return MotionEventCompat.getY(motionEvent, iFindPointerIndex);
    }

    private int getTargetOrRefreshViewOffset() {
        return AnonymousClass5.$SwitchMap$com$heytap$store$base$widget$refresh$RefreshLayout$RefreshStyle[this.mRefreshStyle.ordinal()] != 1 ? this.mTarget.getTop() : (int) (this.mRefreshView.getTop() - this.mRefreshInitialOffset);
    }

    private int getTargetOrRefreshViewTop() {
        return AnonymousClass5.$SwitchMap$com$heytap$store$base$widget$refresh$RefreshLayout$RefreshStyle[this.mRefreshStyle.ordinal()] != 1 ? this.mTarget.getTop() : this.mRefreshView.getTop();
    }

    private void initDragDistanceConverter() {
        this.mDragDistanceConverter = new ResistanceDragDistanceConvert();
    }

    private void initDragStatus(float f) {
        float f2 = f - this.mInitialDownY;
        if (this.mIsRefreshing && (f2 > this.mTouchSlop || this.mTargetOrRefreshViewOffsetY > 0.0f)) {
            LogUtils.INSTANCE.d("RecyclerRefreshLayout", "set mIsBeingDragged 1");
            this.mIsBeingDragged = true;
            this.mInitialMotionY = this.mInitialDownY + this.mTouchSlop;
        } else {
            if (this.mIsBeingDragged || f2 <= this.mTouchSlop) {
                return;
            }
            LogUtils.INSTANCE.d("RecyclerRefreshLayout", "set mIsBeingDragged 2");
            this.mInitialMotionY = this.mInitialDownY + this.mTouchSlop;
            this.mIsBeingDragged = true;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void initRefreshView() {
        RefreshView refreshView = new RefreshView(getContext());
        this.mRefreshView = refreshView;
        refreshView.setVisibility(8);
        View view = this.mRefreshView;
        if (!(view instanceof IRefreshStatus)) {
            throw new ClassCastException("the refreshView must implement the interface IRefreshStatus");
        }
        this.mRefreshStatus = (IRefreshStatus) view;
        addView(view);
    }

    private boolean isTargetValid() {
        for (int i = 0; i < getChildCount(); i++) {
            if (this.mTarget == getChildAt(i)) {
                return true;
            }
        }
        return false;
    }

    private void measureTarget() {
        this.mTarget.measure(View.MeasureSpec.makeMeasureSpec((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), 1073741824));
    }

    private void measureView(int i, int i2, View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(marginLayoutParams.width == -1 ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight()) - marginLayoutParams.leftMargin) - marginLayoutParams.rightMargin), 1073741824) : ViewGroup.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin, marginLayoutParams.width), marginLayoutParams.height == -1 ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - marginLayoutParams.topMargin) - marginLayoutParams.bottomMargin), 1073741824) : ViewGroup.getChildMeasureSpec(i2, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height));
    }

    private void moveSpinner(float f) {
        float f2;
        float fConvert;
        this.mCurrentTouchOffsetY = f;
        if (this.mIsRefreshing) {
            f2 = this.mRefreshTargetOffset;
            fConvert = f > f2 ? f2 : f;
            if (fConvert < 0.0f) {
                fConvert = 0.0f;
            }
        } else if (AnonymousClass5.$SwitchMap$com$heytap$store$base$widget$refresh$RefreshLayout$RefreshStyle[this.mRefreshStyle.ordinal()] != 1) {
            fConvert = this.mDragDistanceConverter.convert(f, this.mRefreshTargetOffset);
            f2 = this.mRefreshTargetOffset;
        } else {
            fConvert = this.mRefreshInitialOffset + this.mDragDistanceConverter.convert(f, this.mRefreshTargetOffset);
            f2 = this.mRefreshTargetOffset;
        }
        if (!this.mIsRefreshing) {
            if (fConvert > f2 && !this.mIsFitRefresh) {
                this.mIsFitRefresh = true;
                this.mRefreshStatus.pullToRefresh();
            } else if (fConvert <= f2 && this.mIsFitRefresh) {
                this.mIsFitRefresh = false;
                this.mRefreshStatus.releaseToRefresh();
            }
        }
        LogUtils.INSTANCE.d("RecyclerRefreshLayout", f + " -- " + f2 + " -- " + fConvert + " -- " + this.mTargetOrRefreshViewOffsetY + " -- " + this.mRefreshTargetOffset);
        setTargetOrRefreshViewOffsetY((int) (fConvert - this.mTargetOrRefreshViewOffsetY));
    }

    private void onNewerPointerDown(MotionEvent motionEvent) {
        int pointerId = MotionEventCompat.getPointerId(motionEvent, MotionEventCompat.getActionIndex(motionEvent));
        this.mActivePointerId = pointerId;
        this.mInitialMotionY = getMotionEventY(motionEvent, pointerId) - this.mCurrentTouchOffsetY;
        LogUtils.INSTANCE.d("RecyclerRefreshLayout", " onDown " + this.mInitialMotionY);
    }

    private void onSecondaryPointerUp(MotionEvent motionEvent) {
        int actionIndex = MotionEventCompat.getActionIndex(motionEvent);
        if (MotionEventCompat.getPointerId(motionEvent, actionIndex) == this.mActivePointerId) {
            this.mActivePointerId = MotionEventCompat.getPointerId(motionEvent, actionIndex == 0 ? 1 : 0);
        }
        this.mInitialMotionY = getMotionEventY(motionEvent, this.mActivePointerId) - this.mCurrentTouchOffsetY;
        LogUtils.INSTANCE.d("RecyclerRefreshLayout", " onUp " + this.mInitialMotionY);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void reset() {
        setTargetOrRefreshViewToInitial();
        this.mCurrentTouchOffsetY = 0.0f;
        this.mRefreshStatus.reset();
        this.mRefreshView.setVisibility(8);
        this.mIsRefreshing = false;
        this.mIsAnimatingToStart = false;
    }

    private void resetTouchEvent() {
        this.mInitialScrollY = 0.0f;
        this.mIsBeingDragged = false;
        this.mDispatchTargetTouchDown = false;
        this.mActivePointerId = -1;
    }

    private int reviseRefreshViewLayoutTop(int i) {
        int i2 = AnonymousClass5.$SwitchMap$com$heytap$store$base$widget$refresh$RefreshLayout$RefreshStyle[this.mRefreshStyle.ordinal()];
        if (i2 != 1 && i2 == 2) {
            return i;
        }
        float f = this.mTargetOrRefreshViewOffsetY;
        return i + ((int) f);
    }

    private int reviseTargetLayoutTop(int i) {
        int i2 = AnonymousClass5.$SwitchMap$com$heytap$store$base$widget$refresh$RefreshLayout$RefreshStyle[this.mRefreshStyle.ordinal()];
        if (i2 != 1) {
            return i + ((int) (i2 != 2 ? this.mTargetOrRefreshViewOffsetY : this.mTargetOrRefreshViewOffsetY));
        }
        return i;
    }

    private void setTargetOrRefreshViewOffsetY(int i) {
        if (this.mTarget == null) {
            return;
        }
        int[] iArr = AnonymousClass5.$SwitchMap$com$heytap$store$base$widget$refresh$RefreshLayout$RefreshStyle;
        int i2 = iArr[this.mRefreshStyle.ordinal()];
        if (i2 == 1) {
            this.mRefreshView.offsetTopAndBottom(i);
            this.mTargetOrRefreshViewOffsetY = this.mRefreshView.getTop();
        } else if (i2 != 2) {
            this.mTarget.offsetTopAndBottom(i);
            this.mRefreshView.offsetTopAndBottom(i);
            this.mTargetOrRefreshViewOffsetY = this.mTarget.getTop();
        } else {
            this.mTarget.offsetTopAndBottom(i);
            this.mTargetOrRefreshViewOffsetY = this.mTarget.getTop();
        }
        LogUtils.INSTANCE.d("RecyclerRefreshLayout", "current offset" + this.mTargetOrRefreshViewOffsetY);
        if (iArr[this.mRefreshStyle.ordinal()] != 1) {
            IRefreshStatus iRefreshStatus = this.mRefreshStatus;
            float f = this.mTargetOrRefreshViewOffsetY;
            iRefreshStatus.pullProgress(f, f / this.mRefreshTargetOffset);
        } else {
            IRefreshStatus iRefreshStatus2 = this.mRefreshStatus;
            float f2 = this.mTargetOrRefreshViewOffsetY;
            iRefreshStatus2.pullProgress(f2, (f2 - this.mRefreshInitialOffset) / this.mRefreshTargetOffset);
        }
        if (this.mRefreshView.getVisibility() != 0) {
            this.mRefreshView.setVisibility(0);
        }
        invalidate();
    }

    private void setTargetOrRefreshViewToInitial() {
        if (AnonymousClass5.$SwitchMap$com$heytap$store$base$widget$refresh$RefreshLayout$RefreshStyle[this.mRefreshStyle.ordinal()] != 1) {
            setTargetOrRefreshViewOffsetY((int) (0.0f - this.mTargetOrRefreshViewOffsetY));
        } else {
            setTargetOrRefreshViewOffsetY((int) (this.mRefreshInitialOffset - this.mTargetOrRefreshViewOffsetY));
        }
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.mNestedScrollingChildHelper.dispatchNestedFling(f, f2, z);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean dispatchNestedPreFling(float f, float f2) {
        return this.mNestedScrollingChildHelper.dispatchNestedPreFling(f, f2);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return this.mNestedScrollingChildHelper.dispatchNestedPreScroll(i, i2, iArr, iArr2);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.mNestedScrollingChildHelper.dispatchNestedScroll(i, i2, i3, i4, iArr);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int actionMasked = MotionEventCompat.getActionMasked(motionEvent);
        if (actionMasked == 1 || actionMasked == 3) {
            onStopNestedScroll(this);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i, int i2) {
        if (AnonymousClass5.$SwitchMap$com$heytap$store$base$widget$refresh$RefreshLayout$RefreshStyle[this.mRefreshStyle.ordinal()] != 1) {
            int i3 = this.mRefreshViewIndex;
            if (i3 < 0) {
                return i2;
            }
            if (i2 == 0) {
                return i3;
            }
            return i2 <= i3 ? i2 - 1 : i2;
        }
        int i4 = this.mRefreshViewIndex;
        if (i4 < 0) {
            return i2;
        }
        if (i2 == i - 1) {
            return i4;
        }
        return i2 >= i4 ? i2 + 1 : i2;
    }

    @Override // android.view.ViewGroup, androidx.core.view.NestedScrollingParent
    public int getNestedScrollAxes() {
        return this.mNestedScrollingParentHelper.getNestedScrollAxes();
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean hasNestedScrollingParent() {
        return this.mNestedScrollingChildHelper.hasNestedScrollingParent();
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean isNestedScrollingEnabled() {
        return this.mNestedScrollingChildHelper.isNestedScrollingEnabled();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        reset();
        clearAnimation();
        super.onDetachedFromWindow();
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00a0  */
    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        ensureTarget();
        LogUtils logUtils = LogUtils.INSTANCE;
        logUtils.d("RecyclerRefreshLayout", "onInterceptTouchEvent");
        if (this.mTarget == null) {
            return false;
        }
        if (AnonymousClass5.$SwitchMap$com$heytap$store$base$widget$refresh$RefreshLayout$RefreshStyle[this.mRefreshStyle.ordinal()] != 1) {
            if (!isEnabled() || (canChildScrollUp(this.mTarget) && !this.mDispatchTargetTouchDown)) {
                logUtils.d("RecyclerRefreshLayout", "onInterceptTouchEvent 3");
                return false;
            }
        } else if (!isEnabled() || canChildScrollUp(this.mTarget) || this.mIsRefreshing || this.mNestedScrollInProgress) {
            logUtils.d("RecyclerRefreshLayout", "onInterceptTouchEvent 2");
            return false;
        }
        int actionMasked = MotionEventCompat.getActionMasked(motionEvent);
        logUtils.d("RecyclerRefreshLayout", "onInterceptTouchEvent get:" + actionMasked + ",resouse:" + motionEvent);
        if (actionMasked == 0) {
            int pointerId = MotionEventCompat.getPointerId(motionEvent, 0);
            this.mActivePointerId = pointerId;
            this.mIsBeingDragged = false;
            float motionEventY = getMotionEventY(motionEvent, pointerId);
            logUtils.d("RecyclerRefreshLayout", "onInterceptTouchEvent 4:" + motionEventY);
            if (motionEventY == -1.0f) {
                logUtils.d("RecyclerRefreshLayout", "onInterceptTouchEvent 5");
                return false;
            }
            if (this.mAnimateToRefreshingAnimation.hasEnded() && this.mAnimateToStartAnimation.hasEnded()) {
                this.mIsAnimatingToStart = false;
            }
            this.mInitialDownY = motionEventY;
            this.mInitialScrollY = this.mTargetOrRefreshViewOffsetY;
            this.mDispatchTargetTouchDown = false;
        } else if (actionMasked == 1) {
            this.mIsBeingDragged = false;
            this.mActivePointerId = -1;
        } else if (actionMasked == 2) {
            logUtils.d("RecyclerRefreshLayout", "onInterceptTouchEvent 6");
            int i = this.mActivePointerId;
            if (i == -1) {
                logUtils.d("RecyclerRefreshLayout", "onInterceptTouchEvent 7");
                return false;
            }
            float motionEventY2 = getMotionEventY(motionEvent, i);
            if (motionEventY2 == -1.0f) {
                return false;
            }
            initDragStatus(motionEventY2);
        } else if (actionMasked == 3) {
            this.mIsBeingDragged = false;
            this.mActivePointerId = -1;
        } else if (actionMasked == 6) {
            onSecondaryPointerUp(motionEvent);
        }
        logUtils.d("RecyclerRefreshLayout", "mIsBeingDragged :" + this.mIsBeingDragged);
        return this.mIsBeingDragged;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (getChildCount() == 0) {
            return;
        }
        ensureTarget();
        if (this.mTarget == null) {
            return;
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        int iReviseTargetLayoutTop = reviseTargetLayoutTop(getPaddingTop());
        int paddingLeft = getPaddingLeft();
        try {
            this.mTarget.layout(paddingLeft, iReviseTargetLayoutTop, ((paddingLeft + measuredWidth) - getPaddingLeft()) - getPaddingRight(), ((measuredHeight + iReviseTargetLayoutTop) - getPaddingTop()) - getPaddingBottom());
        } catch (Exception e2) {
            LogUtils.INSTANCE.d("RecyclerRefreshLayout", "error: ignored=" + e2.toString() + " " + e2.getStackTrace().toString());
        }
        int measuredWidth2 = (measuredWidth - this.mRefreshView.getMeasuredWidth()) / 2;
        int iReviseRefreshViewLayoutTop = reviseRefreshViewLayoutTop((int) this.mRefreshInitialOffset);
        this.mRefreshView.layout(measuredWidth2, iReviseRefreshViewLayoutTop, (measuredWidth + this.mRefreshView.getMeasuredWidth()) / 2, this.mRefreshView.getMeasuredHeight() + iReviseRefreshViewLayoutTop);
        LogUtils.INSTANCE.d("RecyclerRefreshLayout", "onLayout: " + i + " : " + i2 + " : " + i3 + " : " + i4);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        ensureTarget();
        if (this.mTarget == null) {
            return;
        }
        measureTarget();
        measureView(i, i2, this.mRefreshView);
        if (!this.mRefreshViewMeasured && !this.mUsingCustomRefreshInitialOffset) {
            int i3 = AnonymousClass5.$SwitchMap$com$heytap$store$base$widget$refresh$RefreshLayout$RefreshStyle[this.mRefreshStyle.ordinal()];
            if (i3 == 1) {
                float f = -this.mRefreshView.getMeasuredHeight();
                this.mRefreshInitialOffset = f;
                this.mTargetOrRefreshViewOffsetY = f;
            } else if (i3 != 2) {
                this.mTargetOrRefreshViewOffsetY = 0.0f;
                this.mRefreshInitialOffset = -this.mRefreshView.getMeasuredHeight();
            } else {
                this.mRefreshInitialOffset = 0.0f;
                this.mTargetOrRefreshViewOffsetY = 0.0f;
            }
        }
        if (!this.mRefreshViewMeasured && !this.mUsingCustomRefreshTargetOffset && this.mRefreshTargetOffset < this.mRefreshView.getMeasuredHeight()) {
            this.mRefreshTargetOffset = this.mRefreshView.getMeasuredHeight();
        }
        this.mRefreshViewMeasured = true;
        this.mRefreshViewIndex = -1;
        for (int i4 = 0; i4 < getChildCount(); i4++) {
            if (getChildAt(i4) == this.mRefreshView) {
                this.mRefreshViewIndex = i4;
                return;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        return dispatchNestedFling(f, f2, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public boolean onNestedPreFling(View view, float f, float f2) {
        return dispatchNestedPreFling(f, f2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        if (i2 > 0) {
            float f = this.mTotalUnconsumed;
            if (f > 0.0f) {
                float f2 = i2;
                if (f2 > f) {
                    iArr[1] = i2 - ((int) f);
                    this.mTotalUnconsumed = 0.0f;
                } else {
                    this.mTotalUnconsumed = f - f2;
                    iArr[1] = i2;
                }
                moveSpinner(this.mTotalUnconsumed);
            }
        }
        int[] iArr2 = this.mParentScrollConsumed;
        if (dispatchNestedPreScroll(i - iArr[0], i2 - iArr[1], iArr2, null)) {
            iArr[0] = iArr[0] + iArr2[0];
            iArr[1] = iArr[1] + iArr2[1];
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        dispatchNestedScroll(i, i2, i3, i4, this.mParentOffsetInWindow);
        int i5 = i4 + this.mParentOffsetInWindow[1];
        if (i5 < 0) {
            float fAbs = this.mTotalUnconsumed + Math.abs(i5);
            this.mTotalUnconsumed = fAbs;
            moveSpinner(fAbs);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public void onNestedScrollAccepted(View view, View view2, int i) {
        this.mNestedScrollingParentHelper.onNestedScrollAccepted(view, view2, i);
        startNestedScroll(i & 2);
        this.mTotalUnconsumed = 0.0f;
        this.mNestedScrollInProgress = true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public boolean onStartNestedScroll(View view, View view2, int i) {
        if (AnonymousClass5.$SwitchMap$com$heytap$store$base$widget$refresh$RefreshLayout$RefreshStyle[this.mRefreshStyle.ordinal()] != 1) {
            return isEnabled() && canChildScrollUp(this.mTarget) && (i & 2) != 0;
        }
        return isEnabled() && canChildScrollUp(this.mTarget) && !this.mIsRefreshing && (i & 2) != 0;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public void onStopNestedScroll(View view) {
        this.mNestedScrollingParentHelper.onStopNestedScroll(view);
        this.mNestedScrollInProgress = false;
        if (this.mTotalUnconsumed > 0.0f) {
            finishSpinner();
            this.mTotalUnconsumed = 0.0f;
        }
        stopNestedScroll();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        float targetOrRefreshViewTop;
        LogUtils logUtils = LogUtils.INSTANCE;
        logUtils.d("RecyclerRefreshLayout", "onTouchEvent");
        ensureTarget();
        if (this.mTarget == null) {
            logUtils.d("RecyclerRefreshLayout", "mTarget == null");
            return false;
        }
        if (AnonymousClass5.$SwitchMap$com$heytap$store$base$widget$refresh$RefreshLayout$RefreshStyle[this.mRefreshStyle.ordinal()] != 1) {
            if (!isEnabled() || (canChildScrollUp(this.mTarget) && !this.mDispatchTargetTouchDown)) {
                logUtils.d("RecyclerRefreshLayout", "isEnabled2");
                return false;
            }
        } else if (!isEnabled() || canChildScrollUp(this.mTarget) || this.mNestedScrollInProgress) {
            logUtils.d("RecyclerRefreshLayout", "isEnabled1");
            return false;
        }
        if (this.mRefreshStyle == RefreshStyle.FLOAT && (canChildScrollUp(this.mTarget) || this.mNestedScrollInProgress)) {
            logUtils.d("RecyclerRefreshLayout", "isEnabled3");
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action == 2) {
                    logUtils.d("RecyclerRefreshLayout", "ontouch move");
                    int i = this.mActivePointerId;
                    if (i == -1) {
                        logUtils.d("RecyclerRefreshLayout", "INVALID_POINTER");
                        return false;
                    }
                    float motionEventY = getMotionEventY(motionEvent, i);
                    if (motionEventY == -1.0f) {
                        logUtils.d("RecyclerRefreshLayout", "activeMoveY == -1");
                        return false;
                    }
                    if (this.mIsAnimatingToStart) {
                        targetOrRefreshViewTop = getTargetOrRefreshViewTop();
                        this.mInitialMotionY = motionEventY;
                        this.mInitialScrollY = targetOrRefreshViewTop;
                        logUtils.d("RecyclerRefreshLayout", "animatetostart overscrolly " + targetOrRefreshViewTop + " -- " + this.mInitialMotionY);
                    } else {
                        targetOrRefreshViewTop = (motionEventY - this.mInitialMotionY) + this.mInitialScrollY;
                        logUtils.d("RecyclerRefreshLayout", "overscrolly " + targetOrRefreshViewTop + " --" + this.mInitialMotionY + " -- " + this.mInitialScrollY);
                    }
                    if (this.mIsRefreshing) {
                        if (targetOrRefreshViewTop <= 0.0f) {
                            if (this.mDispatchTargetTouchDown) {
                                this.mTarget.dispatchTouchEvent(motionEvent);
                            } else {
                                MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                                motionEventObtain.setAction(0);
                                this.mDispatchTargetTouchDown = true;
                                this.mTarget.dispatchTouchEvent(motionEventObtain);
                            }
                        } else if (targetOrRefreshViewTop > 0.0f && targetOrRefreshViewTop < this.mRefreshTargetOffset && this.mDispatchTargetTouchDown) {
                            MotionEvent motionEventObtain2 = MotionEvent.obtain(motionEvent);
                            motionEventObtain2.setAction(3);
                            this.mDispatchTargetTouchDown = false;
                            this.mTarget.dispatchTouchEvent(motionEventObtain2);
                        }
                        logUtils.d("RecyclerRefreshLayout", "moveSpinner refreshing -- " + this.mInitialScrollY + " -- " + (motionEventY - this.mInitialMotionY));
                        moveSpinner(targetOrRefreshViewTop);
                    } else if (this.mIsBeingDragged) {
                        logUtils.d("RecyclerRefreshLayout", "ontouch IsBeingDragged");
                        if (targetOrRefreshViewTop <= 0.0f) {
                            return false;
                        }
                        moveSpinner(targetOrRefreshViewTop);
                    } else {
                        logUtils.d("RecyclerRefreshLayout", "ontouch no IsBeingDragged");
                        initDragStatus(motionEventY);
                    }
                } else if (action != 3) {
                    if (action == 5) {
                        onNewerPointerDown(motionEvent);
                    } else if (action == 6) {
                        onSecondaryPointerUp(motionEvent);
                    }
                }
            }
            int i2 = this.mActivePointerId;
            if (i2 == -1 || getMotionEventY(motionEvent, i2) == -1.0f) {
                resetTouchEvent();
                return false;
            }
            if (!this.mIsRefreshing && !this.mIsAnimatingToStart) {
                resetTouchEvent();
                finishSpinner();
                return false;
            }
            if (this.mDispatchTargetTouchDown) {
                this.mTarget.dispatchTouchEvent(motionEvent);
            }
            resetTouchEvent();
            return false;
        }
        this.mActivePointerId = MotionEventCompat.getPointerId(motionEvent, 0);
        this.mIsBeingDragged = false;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        View view = this.mTarget;
        if (view == null || ViewCompat.isNestedScrollingEnabled(view)) {
            super.requestDisallowInterceptTouchEvent(z);
        }
    }

    public void setAnimateToRefreshDuration(int i) {
        this.mAnimateToRefreshDuration = i;
    }

    public void setAnimateToRefreshInterpolator(@NonNull Interpolator interpolator) {
        if (interpolator == null) {
            throw new NullPointerException("the animateToRefreshInterpolator can't be null");
        }
        this.mAnimateToRefreshInterpolator = interpolator;
    }

    public void setAnimateToStartDuration(int i) {
        this.mAnimateToStartDuration = i;
    }

    public void setAnimateToStartInterpolator(@NonNull Interpolator interpolator) {
        if (interpolator == null) {
            throw new NullPointerException("the animateToStartInterpolator can't be null");
        }
        this.mAnimateToStartInterpolator = interpolator;
    }

    public void setDragDistanceConverter(@NonNull IDragDistanceConverter iDragDistanceConverter) {
        if (iDragDistanceConverter == null) {
            throw new NullPointerException("the dragDistanceConverter can't be null");
        }
        this.mDragDistanceConverter = iDragDistanceConverter;
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public void setNestedScrollingEnabled(boolean z) {
        this.mNestedScrollingChildHelper.setNestedScrollingEnabled(z);
    }

    public void setOnRefreshListener(OnRefreshListener onRefreshListener) {
        this.mOnRefreshListener = onRefreshListener;
    }

    public void setRefreshInitialOffset(float f) {
        this.mRefreshInitialOffset = f;
        this.mUsingCustomRefreshInitialOffset = true;
        requestLayout();
    }

    public void setRefreshStyle(@NonNull RefreshStyle refreshStyle) {
        this.mRefreshStyle = refreshStyle;
    }

    public void setRefreshTargetOffset(float f) {
        this.mRefreshTargetOffset = f;
        this.mUsingCustomRefreshTargetOffset = true;
        requestLayout();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setRefreshView(@NonNull View view, ViewGroup.LayoutParams layoutParams) {
        if (view == 0) {
            throw new NullPointerException("the refreshView can't be null");
        }
        View view2 = this.mRefreshView;
        if (view2 == view) {
            return;
        }
        if (view2 != null && view2.getParent() != null) {
            ((ViewGroup) this.mRefreshView.getParent()).removeView(this.mRefreshView);
        }
        if (!(view instanceof IRefreshStatus)) {
            throw new ClassCastException("the refreshView must implement the interface IRefreshStatus");
        }
        this.mRefreshStatus = (IRefreshStatus) view;
        view.setVisibility(8);
        addView(view, layoutParams);
        this.mRefreshView = view;
    }

    public void setRefreshing(boolean z) {
        if (!z || this.mIsRefreshing == z) {
            setRefreshing(z, false);
            return;
        }
        this.mIsRefreshing = z;
        this.mNotifyListener = false;
        animateToRefreshingPosition((int) this.mTargetOrRefreshViewOffsetY, this.mRefreshingListener);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean startNestedScroll(int i) {
        return this.mNestedScrollingChildHelper.startNestedScroll(i);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public void stopNestedScroll() {
        this.mNestedScrollingChildHelper.stopNestedScroll();
    }

    public RefreshLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mParentScrollConsumed = new int[2];
        this.mParentOffsetInWindow = new int[2];
        this.mRefreshViewIndex = -1;
        this.mActivePointerId = -1;
        this.mAnimateToStartDuration = 300;
        this.mAnimateToRefreshDuration = 300;
        this.mUsingCustomRefreshTargetOffset = false;
        this.mUsingCustomRefreshInitialOffset = false;
        this.mRefreshViewMeasured = false;
        this.mRefreshStyle = RefreshStyle.NORMAL;
        this.mAnimateToStartInterpolator = new DecelerateInterpolator(2.0f);
        this.mAnimateToRefreshInterpolator = new DecelerateInterpolator(2.0f);
        this.mAnimateToRefreshingAnimation = new Animation() { // from class: com.heytap.store.base.widget.refresh.RefreshLayout.1
            @Override // android.view.animation.Animation
            public void applyTransformation(float f, Transformation transformation) {
                if (AnonymousClass5.$SwitchMap$com$heytap$store$base$widget$refresh$RefreshLayout$RefreshStyle[RefreshLayout.this.mRefreshStyle.ordinal()] != 1) {
                    RefreshLayout refreshLayout = RefreshLayout.this;
                    refreshLayout.animateToTargetOffset(refreshLayout.mRefreshTargetOffset, RefreshLayout.this.mTarget.getTop(), f);
                } else {
                    float f2 = RefreshLayout.this.mRefreshTargetOffset + RefreshLayout.this.mRefreshInitialOffset;
                    RefreshLayout refreshLayout2 = RefreshLayout.this;
                    refreshLayout2.animateToTargetOffset(f2, refreshLayout2.mRefreshView.getTop(), f);
                }
            }
        };
        this.mAnimateToStartAnimation = new Animation() { // from class: com.heytap.store.base.widget.refresh.RefreshLayout.2
            @Override // android.view.animation.Animation
            public void applyTransformation(float f, Transformation transformation) {
                if (AnonymousClass5.$SwitchMap$com$heytap$store$base$widget$refresh$RefreshLayout$RefreshStyle[RefreshLayout.this.mRefreshStyle.ordinal()] != 1) {
                    RefreshLayout refreshLayout = RefreshLayout.this;
                    refreshLayout.animateToTargetOffset(0.0f, refreshLayout.mTarget.getTop(), f);
                } else {
                    RefreshLayout refreshLayout2 = RefreshLayout.this;
                    refreshLayout2.animateToTargetOffset(refreshLayout2.mRefreshInitialOffset, RefreshLayout.this.mRefreshView.getTop(), f);
                }
            }
        };
        this.mRefreshingListener = new Animation.AnimationListener() { // from class: com.heytap.store.base.widget.refresh.RefreshLayout.3
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                if (RefreshLayout.this.mNotifyListener) {
                    if (!RefreshLayout.this.mRefreshStatus.isNetAvailable() || RefreshLayout.this.mOnRefreshListener == null) {
                        RefreshLayout.this.setRefreshing(false);
                    } else {
                        RefreshLayout.this.mOnRefreshListener.onRefresh();
                    }
                }
                RefreshLayout.this.mIsAnimatingToStart = false;
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
                RefreshLayout.this.mIsAnimatingToStart = true;
                RefreshLayout.this.mRefreshStatus.refreshing();
            }
        };
        this.mResetListener = new Animation.AnimationListener() { // from class: com.heytap.store.base.widget.refresh.RefreshLayout.4
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                RefreshLayout.this.reset();
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
                RefreshLayout.this.mIsAnimatingToStart = true;
                RefreshLayout.this.mRefreshStatus.refreshComplete();
            }
        };
        this.mTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
        float f = getResources().getDisplayMetrics().density;
        this.mRefreshViewSize = (int) (30.0f * f);
        this.mRefreshTargetOffset = f * 50.0f;
        this.mTargetOrRefreshViewOffsetY = 0.0f;
        this.mRefreshInitialOffset = 0.0f;
        this.mNestedScrollingParentHelper = new NestedScrollingParentHelper(this);
        this.mNestedScrollingChildHelper = new NestedScrollingChildHelper(this);
        initRefreshView();
        initDragDistanceConverter();
        setNestedScrollingEnabled(true);
        setChildrenDrawingOrderEnabled(true);
    }

    @Override // android.view.ViewGroup
    public LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-2, -2);
    }

    @Override // android.view.ViewGroup
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new LayoutParams(layoutParams);
    }

    private void setRefreshing(boolean z, boolean z2) {
        if (this.mIsRefreshing != z) {
            this.mNotifyListener = z2;
            this.mIsRefreshing = z;
            if (z) {
                animateToRefreshingPosition((int) this.mTargetOrRefreshViewOffsetY, this.mRefreshingListener);
            } else {
                animateOffsetToStartPosition((int) this.mTargetOrRefreshViewOffsetY, this.mResetListener);
            }
        }
    }
}
