package com.scwang.smartrefresh.layout;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.Scroller;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import androidx.core.view.NestedScrollingChildHelper;
import androidx.core.view.NestedScrollingParent;
import androidx.core.view.NestedScrollingParentHelper;
import androidx.core.view.ViewCompat;
import com.scwang.smartrefresh.R;
import com.scwang.smartrefresh.layout.api.DefaultRefreshFooterCreator;
import com.scwang.smartrefresh.layout.api.DefaultRefreshHeaderCreator;
import com.scwang.smartrefresh.layout.api.DefaultRefreshInitializer;
import com.scwang.smartrefresh.layout.api.RefreshContent;
import com.scwang.smartrefresh.layout.api.RefreshFooter;
import com.scwang.smartrefresh.layout.api.RefreshHeader;
import com.scwang.smartrefresh.layout.api.RefreshInternal;
import com.scwang.smartrefresh.layout.api.RefreshKernel;
import com.scwang.smartrefresh.layout.api.RefreshLayout;
import com.scwang.smartrefresh.layout.api.ScrollBoundaryDecider;
import com.scwang.smartrefresh.layout.constant.DimensionStatus;
import com.scwang.smartrefresh.layout.constant.RefreshState;
import com.scwang.smartrefresh.layout.constant.SpinnerStyle;
import com.scwang.smartrefresh.layout.footer.BallPulseFooter;
import com.scwang.smartrefresh.layout.header.BezierRadarHeader;
import com.scwang.smartrefresh.layout.impl.RefreshContentWrapper;
import com.scwang.smartrefresh.layout.impl.RefreshFooterWrapper;
import com.scwang.smartrefresh.layout.impl.RefreshHeaderWrapper;
import com.scwang.smartrefresh.layout.listener.OnLoadMoreListener;
import com.scwang.smartrefresh.layout.listener.OnMultiPurposeListener;
import com.scwang.smartrefresh.layout.listener.OnRefreshListener;
import com.scwang.smartrefresh.layout.listener.OnRefreshLoadMoreListener;
import com.scwang.smartrefresh.layout.util.SmartUtil;

/* JADX INFO: loaded from: classes9.dex */
@SuppressLint({"RestrictedApi"})
public class SmartRefreshLayout extends ViewGroup implements RefreshLayout, NestedScrollingParent {
    protected static ViewGroup.MarginLayoutParams sDefaultMarginLP = new ViewGroup.MarginLayoutParams(-1, -1);
    protected static DefaultRefreshFooterCreator sFooterCreator;
    protected static DefaultRefreshHeaderCreator sHeaderCreator;
    protected static DefaultRefreshInitializer sRefreshInitializer;
    protected Runnable animationRunnable;
    protected boolean mAttachedToWindow;
    protected int mCurrentVelocity;
    protected boolean mDisableContentWhenLoading;
    protected boolean mDisableContentWhenRefresh;
    protected char mDragDirection;
    protected float mDragRate;
    protected boolean mEnableAutoLoadMore;
    protected boolean mEnableClipFooterWhenFixedBehind;
    protected boolean mEnableClipHeaderWhenFixedBehind;
    protected boolean mEnableDisallowIntercept;
    protected boolean mEnableFooterFollowWhenNoMoreData;
    protected boolean mEnableFooterTranslationContent;
    protected boolean mEnableHeaderTranslationContent;
    protected boolean mEnableLoadMore;
    protected boolean mEnableLoadMoreWhenContentNotFull;
    protected boolean mEnableNestedScrolling;
    protected boolean mEnableOverScrollBounce;
    protected boolean mEnableOverScrollDrag;
    protected boolean mEnablePreviewInEditMode;
    protected boolean mEnablePureScrollMode;
    protected boolean mEnableRefresh;
    protected boolean mEnableScrollContentWhenLoaded;
    protected boolean mEnableScrollContentWhenRefreshed;
    protected MotionEvent mFalsifyEvent;
    protected int mFixedFooterViewId;
    protected int mFixedHeaderViewId;
    protected float mFloorBottomDragLayoutRate;
    protected int mFloorDuration;
    protected float mFloorOpenLayoutRate;
    protected int mFooterBackgroundColor;
    protected int mFooterHeight;
    protected DimensionStatus mFooterHeightStatus;
    protected int mFooterInsetStart;
    protected boolean mFooterLocked;
    protected float mFooterMaxDragRate;
    protected boolean mFooterNeedTouchEventWhenLoading;
    protected boolean mFooterNoMoreData;
    protected boolean mFooterNoMoreDataEffective;
    protected int mFooterTranslationViewId;
    protected float mFooterTriggerRate;
    protected Handler mHandler;
    protected int mHeaderBackgroundColor;
    protected int mHeaderHeight;
    protected DimensionStatus mHeaderHeightStatus;
    protected int mHeaderInsetStart;
    protected float mHeaderMaxDragRate;
    protected boolean mHeaderNeedTouchEventWhenRefreshing;
    protected int mHeaderTranslationViewId;
    protected float mHeaderTriggerRate;
    protected boolean mIsBeingDragged;
    protected RefreshKernel mKernel;
    protected long mLastOpenTime;
    protected int mLastSpinner;
    protected float mLastTouchX;
    protected float mLastTouchY;
    protected OnLoadMoreListener mLoadMoreListener;
    protected boolean mManualFooterTranslationContent;
    protected boolean mManualHeaderTranslationContent;
    protected boolean mManualLoadMore;
    protected int mMaximumVelocity;
    protected int mMinimumVelocity;
    protected NestedScrollingChildHelper mNestedChild;
    protected boolean mNestedInProgress;
    protected NestedScrollingParentHelper mNestedParent;
    protected OnMultiPurposeListener mOnMultiPurposeListener;
    protected Paint mPaint;
    protected int[] mParentOffsetInWindow;
    protected int[] mPrimaryColors;
    protected int mReboundDuration;
    protected Interpolator mReboundInterpolator;
    protected RefreshContent mRefreshContent;
    protected RefreshInternal mRefreshFooter;
    protected RefreshInternal mRefreshHeader;
    protected OnRefreshListener mRefreshListener;
    protected int mScreenHeightPixels;
    protected ScrollBoundaryDecider mScrollBoundaryDecider;
    protected Scroller mScroller;
    protected int mSpinner;
    protected RefreshState mState;
    protected boolean mSuperDispatchTouchEvent;
    protected int mTotalUnconsumed;
    protected int mTouchSlop;
    protected int mTouchSpinner;
    protected float mTouchX;
    protected float mTouchY;
    protected VelocityTracker mVelocityTracker;
    protected boolean mVerticalPermit;
    protected RefreshState mViceState;
    protected ValueAnimator reboundAnimator;

    /* JADX INFO: renamed from: com.scwang.smartrefresh.layout.SmartRefreshLayout$10, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass10 {
        static final /* synthetic */ int[] $SwitchMap$com$scwang$smartrefresh$layout$constant$RefreshState;

        static {
            int[] iArr = new int[RefreshState.values().length];
            $SwitchMap$com$scwang$smartrefresh$layout$constant$RefreshState = iArr;
            try {
                iArr[RefreshState.None.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$scwang$smartrefresh$layout$constant$RefreshState[RefreshState.PullDownToRefresh.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$scwang$smartrefresh$layout$constant$RefreshState[RefreshState.PullUpToLoad.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$scwang$smartrefresh$layout$constant$RefreshState[RefreshState.PullDownCanceled.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$scwang$smartrefresh$layout$constant$RefreshState[RefreshState.PullUpCanceled.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$scwang$smartrefresh$layout$constant$RefreshState[RefreshState.ReleaseToRefresh.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$scwang$smartrefresh$layout$constant$RefreshState[RefreshState.ReleaseToLoad.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$scwang$smartrefresh$layout$constant$RefreshState[RefreshState.ReleaseToTwoLevel.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$scwang$smartrefresh$layout$constant$RefreshState[RefreshState.RefreshReleased.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$scwang$smartrefresh$layout$constant$RefreshState[RefreshState.LoadReleased.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$scwang$smartrefresh$layout$constant$RefreshState[RefreshState.Refreshing.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$com$scwang$smartrefresh$layout$constant$RefreshState[RefreshState.Loading.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    /* JADX INFO: renamed from: com.scwang.smartrefresh.layout.SmartRefreshLayout$7, reason: invalid class name */
    public class AnonymousClass7 implements Runnable {
        int count = 0;
        final /* synthetic */ int val$more;
        final /* synthetic */ boolean val$noMoreData;
        final /* synthetic */ boolean val$success;

        public AnonymousClass7(int i, boolean z, boolean z2) {
            this.val$more = i;
            this.val$noMoreData = z;
            this.val$success = z2;
        }

        /* JADX WARN: Code duplicated, block: B:48:0x00b3  */
        @Override // java.lang.Runnable
        public void run() {
            boolean z;
            int i = this.count;
            if (i == 0) {
                SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
                RefreshState refreshState = smartRefreshLayout.mState;
                RefreshState refreshState2 = RefreshState.None;
                if (refreshState == refreshState2 && smartRefreshLayout.mViceState == RefreshState.Loading) {
                    smartRefreshLayout.mViceState = refreshState2;
                } else {
                    ValueAnimator valueAnimator = smartRefreshLayout.reboundAnimator;
                    if (valueAnimator != null && ((refreshState.isDragging || refreshState == RefreshState.LoadReleased) && refreshState.isFooter)) {
                        valueAnimator.setDuration(0L);
                        SmartRefreshLayout.this.reboundAnimator.cancel();
                        SmartRefreshLayout smartRefreshLayout2 = SmartRefreshLayout.this;
                        smartRefreshLayout2.reboundAnimator = null;
                        if (smartRefreshLayout2.mKernel.animSpinner(0) == null) {
                            SmartRefreshLayout.this.notifyStateChanged(refreshState2);
                        } else {
                            SmartRefreshLayout.this.notifyStateChanged(RefreshState.PullUpCanceled);
                        }
                    } else if (refreshState == RefreshState.Loading && smartRefreshLayout.mRefreshFooter != null && smartRefreshLayout.mRefreshContent != null) {
                        this.count = i + 1;
                        smartRefreshLayout.mHandler.postDelayed(this, this.val$more);
                        SmartRefreshLayout.this.notifyStateChanged(RefreshState.LoadFinish);
                        return;
                    }
                }
                if (this.val$noMoreData) {
                    SmartRefreshLayout.this.setNoMoreData(true);
                    return;
                }
                return;
            }
            SmartRefreshLayout smartRefreshLayout3 = SmartRefreshLayout.this;
            int iOnFinish = smartRefreshLayout3.mRefreshFooter.onFinish(smartRefreshLayout3, this.val$success);
            SmartRefreshLayout smartRefreshLayout4 = SmartRefreshLayout.this;
            OnMultiPurposeListener onMultiPurposeListener = smartRefreshLayout4.mOnMultiPurposeListener;
            if (onMultiPurposeListener != null) {
                RefreshInternal refreshInternal = smartRefreshLayout4.mRefreshFooter;
                if (refreshInternal instanceof RefreshFooter) {
                    onMultiPurposeListener.onFooterFinish((RefreshFooter) refreshInternal, this.val$success);
                }
            }
            if (iOnFinish < Integer.MAX_VALUE) {
                if (this.val$noMoreData) {
                    SmartRefreshLayout smartRefreshLayout5 = SmartRefreshLayout.this;
                    z = smartRefreshLayout5.mEnableFooterFollowWhenNoMoreData && smartRefreshLayout5.mSpinner < 0 && smartRefreshLayout5.mRefreshContent.canLoadMore();
                }
                SmartRefreshLayout smartRefreshLayout6 = SmartRefreshLayout.this;
                int i2 = smartRefreshLayout6.mSpinner;
                final int iMax = i2 - (z ? Math.max(i2, -smartRefreshLayout6.mFooterHeight) : 0);
                SmartRefreshLayout smartRefreshLayout7 = SmartRefreshLayout.this;
                if (smartRefreshLayout7.mIsBeingDragged || smartRefreshLayout7.mNestedInProgress) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    SmartRefreshLayout smartRefreshLayout8 = SmartRefreshLayout.this;
                    if (smartRefreshLayout8.mIsBeingDragged) {
                        float f = smartRefreshLayout8.mLastTouchY;
                        smartRefreshLayout8.mTouchY = f;
                        smartRefreshLayout8.mTouchSpinner = smartRefreshLayout8.mSpinner - iMax;
                        smartRefreshLayout8.mIsBeingDragged = false;
                        float f2 = smartRefreshLayout8.mEnableFooterTranslationContent ? iMax : 0;
                        SmartRefreshLayout.super.dispatchTouchEvent(MotionEvent.obtain(jCurrentTimeMillis, jCurrentTimeMillis, 0, smartRefreshLayout8.mLastTouchX, f + f2 + (smartRefreshLayout8.mTouchSlop * 2), 0));
                        SmartRefreshLayout smartRefreshLayout9 = SmartRefreshLayout.this;
                        SmartRefreshLayout.super.dispatchTouchEvent(MotionEvent.obtain(jCurrentTimeMillis, jCurrentTimeMillis, 2, smartRefreshLayout9.mLastTouchX, smartRefreshLayout9.mLastTouchY + f2, 0));
                    }
                    SmartRefreshLayout smartRefreshLayout10 = SmartRefreshLayout.this;
                    if (smartRefreshLayout10.mNestedInProgress) {
                        smartRefreshLayout10.mTotalUnconsumed = 0;
                        SmartRefreshLayout.super.dispatchTouchEvent(MotionEvent.obtain(jCurrentTimeMillis, jCurrentTimeMillis, 1, smartRefreshLayout10.mLastTouchX, smartRefreshLayout10.mLastTouchY, 0));
                        SmartRefreshLayout smartRefreshLayout11 = SmartRefreshLayout.this;
                        smartRefreshLayout11.mNestedInProgress = false;
                        smartRefreshLayout11.mTouchSpinner = 0;
                    }
                }
                SmartRefreshLayout.this.mHandler.postDelayed(new Runnable() { // from class: com.scwang.smartrefresh.layout.SmartRefreshLayout.7.1
                    @Override // java.lang.Runnable
                    public void run() {
                        ValueAnimator.AnimatorUpdateListener animatorUpdateListenerScrollContentWhenFinished;
                        ValueAnimator valueAnimatorAnimSpinner;
                        SmartRefreshLayout smartRefreshLayout12 = SmartRefreshLayout.this;
                        if (!smartRefreshLayout12.mEnableScrollContentWhenLoaded || iMax >= 0) {
                            animatorUpdateListenerScrollContentWhenFinished = null;
                        } else {
                            animatorUpdateListenerScrollContentWhenFinished = smartRefreshLayout12.mRefreshContent.scrollContentWhenFinished(smartRefreshLayout12.mSpinner);
                            if (animatorUpdateListenerScrollContentWhenFinished != null) {
                                animatorUpdateListenerScrollContentWhenFinished.onAnimationUpdate(ValueAnimator.ofInt(0, 0));
                            }
                        }
                        AnimatorListenerAdapter animatorListenerAdapter = new AnimatorListenerAdapter() { // from class: com.scwang.smartrefresh.layout.SmartRefreshLayout.7.1.1
                            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                            public void onAnimationEnd(Animator animator) {
                                if (animator == null || animator.getDuration() != 0) {
                                    AnonymousClass7 anonymousClass7 = AnonymousClass7.this;
                                    SmartRefreshLayout smartRefreshLayout13 = SmartRefreshLayout.this;
                                    smartRefreshLayout13.mFooterLocked = false;
                                    if (anonymousClass7.val$noMoreData) {
                                        smartRefreshLayout13.setNoMoreData(true);
                                    }
                                    SmartRefreshLayout smartRefreshLayout14 = SmartRefreshLayout.this;
                                    if (smartRefreshLayout14.mState == RefreshState.LoadFinish) {
                                        smartRefreshLayout14.notifyStateChanged(RefreshState.None);
                                    }
                                }
                            }
                        };
                        AnonymousClass7 anonymousClass7 = AnonymousClass7.this;
                        SmartRefreshLayout smartRefreshLayout13 = SmartRefreshLayout.this;
                        int i3 = smartRefreshLayout13.mSpinner;
                        if (i3 > 0) {
                            valueAnimatorAnimSpinner = smartRefreshLayout13.mKernel.animSpinner(0);
                        } else {
                            if (animatorUpdateListenerScrollContentWhenFinished != null || i3 == 0) {
                                ValueAnimator valueAnimator2 = smartRefreshLayout13.reboundAnimator;
                                if (valueAnimator2 != null) {
                                    valueAnimator2.setDuration(0L);
                                    SmartRefreshLayout.this.reboundAnimator.cancel();
                                    SmartRefreshLayout.this.reboundAnimator = null;
                                }
                                SmartRefreshLayout.this.mKernel.moveSpinner(0, false);
                                SmartRefreshLayout.this.mKernel.setState(RefreshState.None);
                            } else if (anonymousClass7.val$noMoreData && smartRefreshLayout13.mEnableFooterFollowWhenNoMoreData) {
                                int i4 = smartRefreshLayout13.mFooterHeight;
                                if (i3 >= (-i4)) {
                                    smartRefreshLayout13.notifyStateChanged(RefreshState.None);
                                } else {
                                    valueAnimatorAnimSpinner = smartRefreshLayout13.mKernel.animSpinner(-i4);
                                }
                            } else {
                                valueAnimatorAnimSpinner = smartRefreshLayout13.mKernel.animSpinner(0);
                            }
                            valueAnimatorAnimSpinner = null;
                        }
                        if (valueAnimatorAnimSpinner != null) {
                            valueAnimatorAnimSpinner.addListener(animatorListenerAdapter);
                        } else {
                            animatorListenerAdapter.onAnimationEnd(null);
                        }
                    }
                }, SmartRefreshLayout.this.mSpinner < 0 ? iOnFinish : 0L);
            }
        }
    }

    public class BounceRunnable implements Runnable {
        int mSmoothDistance;
        float mVelocity;
        int mFrame = 0;
        int mFrameDelay = 10;
        float mOffset = 0.0f;
        long mLastTime = AnimationUtils.currentAnimationTimeMillis();

        public BounceRunnable(float f, int i) {
            this.mVelocity = f;
            this.mSmoothDistance = i;
            SmartRefreshLayout.this.mHandler.postDelayed(this, this.mFrameDelay);
            if (f > 0.0f) {
                SmartRefreshLayout.this.mKernel.setState(RefreshState.PullDownToRefresh);
            } else {
                SmartRefreshLayout.this.mKernel.setState(RefreshState.PullUpToLoad);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
            if (smartRefreshLayout.animationRunnable != this || smartRefreshLayout.mState.isFinishing) {
                return;
            }
            if (Math.abs(smartRefreshLayout.mSpinner) < Math.abs(this.mSmoothDistance)) {
                double d = this.mVelocity;
                int i = this.mFrame + 1;
                this.mFrame = i;
                this.mVelocity = (float) (d * Math.pow(0.949999988079071d, i * 2));
            } else if (this.mSmoothDistance != 0) {
                double d2 = this.mVelocity;
                int i2 = this.mFrame + 1;
                this.mFrame = i2;
                this.mVelocity = (float) (d2 * Math.pow(0.44999998807907104d, i2 * 2));
            } else {
                double d3 = this.mVelocity;
                int i3 = this.mFrame + 1;
                this.mFrame = i3;
                this.mVelocity = (float) (d3 * Math.pow(0.8500000238418579d, i3 * 2));
            }
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            float f = this.mVelocity * (((jCurrentAnimationTimeMillis - this.mLastTime) * 1.0f) / 1000.0f);
            if (Math.abs(f) >= 1.0f) {
                this.mLastTime = jCurrentAnimationTimeMillis;
                float f2 = this.mOffset + f;
                this.mOffset = f2;
                SmartRefreshLayout.this.moveSpinnerInfinitely(f2);
                SmartRefreshLayout.this.mHandler.postDelayed(this, this.mFrameDelay);
                return;
            }
            SmartRefreshLayout smartRefreshLayout2 = SmartRefreshLayout.this;
            RefreshState refreshState = smartRefreshLayout2.mViceState;
            boolean z = refreshState.isDragging;
            if (z && refreshState.isHeader) {
                smartRefreshLayout2.mKernel.setState(RefreshState.PullDownCanceled);
            } else if (z && refreshState.isFooter) {
                smartRefreshLayout2.mKernel.setState(RefreshState.PullUpCanceled);
            }
            SmartRefreshLayout smartRefreshLayout3 = SmartRefreshLayout.this;
            smartRefreshLayout3.animationRunnable = null;
            if (Math.abs(smartRefreshLayout3.mSpinner) >= Math.abs(this.mSmoothDistance)) {
                int iMin = Math.min(Math.max((int) SmartUtil.px2dp(Math.abs(SmartRefreshLayout.this.mSpinner - this.mSmoothDistance)), 30), 100) * 10;
                SmartRefreshLayout smartRefreshLayout4 = SmartRefreshLayout.this;
                smartRefreshLayout4.animSpinner(this.mSmoothDistance, 0, smartRefreshLayout4.mReboundInterpolator, iMin);
            }
        }
    }

    public class FlingRunnable implements Runnable {
        int mOffset;
        float mVelocity;
        int mFrame = 0;
        int mFrameDelay = 10;
        float mDamping = 0.98f;
        long mStartTime = 0;
        long mLastTime = AnimationUtils.currentAnimationTimeMillis();

        public FlingRunnable(float f) {
            this.mVelocity = f;
            this.mOffset = SmartRefreshLayout.this.mSpinner;
        }

        @Override // java.lang.Runnable
        public void run() {
            SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
            if (smartRefreshLayout.animationRunnable != this || smartRefreshLayout.mState.isFinishing) {
                return;
            }
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            long j2 = jCurrentAnimationTimeMillis - this.mLastTime;
            float fPow = (float) (((double) this.mVelocity) * Math.pow(this.mDamping, (jCurrentAnimationTimeMillis - this.mStartTime) / (1000.0f / this.mFrameDelay)));
            this.mVelocity = fPow;
            float f = fPow * ((j2 * 1.0f) / 1000.0f);
            if (Math.abs(f) <= 1.0f) {
                SmartRefreshLayout.this.animationRunnable = null;
                return;
            }
            this.mLastTime = jCurrentAnimationTimeMillis;
            int i = (int) (this.mOffset + f);
            this.mOffset = i;
            SmartRefreshLayout smartRefreshLayout2 = SmartRefreshLayout.this;
            if (smartRefreshLayout2.mSpinner * i > 0) {
                smartRefreshLayout2.mKernel.moveSpinner(i, true);
                SmartRefreshLayout.this.mHandler.postDelayed(this, this.mFrameDelay);
                return;
            }
            smartRefreshLayout2.animationRunnable = null;
            smartRefreshLayout2.mKernel.moveSpinner(0, true);
            SmartUtil.fling(SmartRefreshLayout.this.mRefreshContent.getScrollableView(), (int) (-this.mVelocity));
            SmartRefreshLayout smartRefreshLayout3 = SmartRefreshLayout.this;
            if (!smartRefreshLayout3.mFooterLocked || f <= 0.0f) {
                return;
            }
            smartRefreshLayout3.mFooterLocked = false;
        }

        /* JADX WARN: Code duplicated, block: B:29:0x004b  */
        /* JADX WARN: Code duplicated, block: B:33:0x0059  */
        /* JADX WARN: Code duplicated, block: B:36:0x0065  */
        /* JADX WARN: Code duplicated, block: B:40:0x0093  */
        /* JADX WARN: Code duplicated, block: B:48:0x00a3 A[LOOP:0: B:34:0x0061->B:48:0x00a3, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:52:0x008b A[SYNTHETIC] */
        public Runnable start() {
            SmartRefreshLayout smartRefreshLayout;
            int i;
            float fPow;
            int i2;
            int i3;
            float f;
            RefreshState refreshState;
            RefreshState refreshState2;
            SmartRefreshLayout smartRefreshLayout2 = SmartRefreshLayout.this;
            RefreshState refreshState3 = smartRefreshLayout2.mState;
            if (refreshState3.isFinishing) {
                return null;
            }
            if (smartRefreshLayout2.mSpinner != 0) {
                if (refreshState3.isOpening || (smartRefreshLayout2.mFooterNoMoreData && smartRefreshLayout2.mEnableFooterFollowWhenNoMoreData && smartRefreshLayout2.mFooterNoMoreDataEffective && smartRefreshLayout2.isEnableRefreshOrLoadMore(smartRefreshLayout2.mEnableLoadMore))) {
                    SmartRefreshLayout smartRefreshLayout3 = SmartRefreshLayout.this;
                    if (smartRefreshLayout3.mState == RefreshState.Loading || (smartRefreshLayout3.mFooterNoMoreData && smartRefreshLayout3.mEnableFooterFollowWhenNoMoreData && smartRefreshLayout3.mFooterNoMoreDataEffective && smartRefreshLayout3.isEnableRefreshOrLoadMore(smartRefreshLayout3.mEnableLoadMore))) {
                        SmartRefreshLayout smartRefreshLayout4 = SmartRefreshLayout.this;
                        if (smartRefreshLayout4.mSpinner >= (-smartRefreshLayout4.mFooterHeight)) {
                            smartRefreshLayout = SmartRefreshLayout.this;
                            if (smartRefreshLayout.mState == RefreshState.Refreshing && smartRefreshLayout.mSpinner > smartRefreshLayout.mHeaderHeight) {
                                i = SmartRefreshLayout.this.mSpinner;
                                fPow = this.mVelocity;
                                i2 = 0;
                                i3 = i;
                                while (i * i3 > 0) {
                                    i2++;
                                    fPow = (float) (((double) fPow) * Math.pow(this.mDamping, (this.mFrameDelay * i2) / 10.0f));
                                    f = ((this.mFrameDelay * 1.0f) / 1000.0f) * fPow;
                                    if (Math.abs(f) < 1.0f) {
                                        SmartRefreshLayout smartRefreshLayout5 = SmartRefreshLayout.this;
                                        refreshState = smartRefreshLayout5.mState;
                                        if (!refreshState.isOpening && ((refreshState != (refreshState2 = RefreshState.Refreshing) || i3 <= smartRefreshLayout5.mHeaderHeight) && (refreshState == refreshState2 || i3 >= (-smartRefreshLayout5.mFooterHeight)))) {
                                            break;
                                            break;
                                        }
                                        return null;
                                    }
                                    i3 = (int) (i3 + f);
                                }
                            }
                        } else {
                            i = SmartRefreshLayout.this.mSpinner;
                            fPow = this.mVelocity;
                            i2 = 0;
                            i3 = i;
                            while (i * i3 > 0) {
                                i2++;
                                fPow = (float) (((double) fPow) * Math.pow(this.mDamping, (this.mFrameDelay * i2) / 10.0f));
                                f = ((this.mFrameDelay * 1.0f) / 1000.0f) * fPow;
                                if (Math.abs(f) < 1.0f) {
                                    SmartRefreshLayout smartRefreshLayout6 = SmartRefreshLayout.this;
                                    refreshState = smartRefreshLayout6.mState;
                                    if (!refreshState.isOpening) {
                                    }
                                    return null;
                                }
                                i3 = (int) (i3 + f);
                            }
                        }
                    } else {
                        smartRefreshLayout = SmartRefreshLayout.this;
                        if (smartRefreshLayout.mState == RefreshState.Refreshing) {
                            i = SmartRefreshLayout.this.mSpinner;
                            fPow = this.mVelocity;
                            i2 = 0;
                            i3 = i;
                            while (i * i3 > 0) {
                                i2++;
                                fPow = (float) (((double) fPow) * Math.pow(this.mDamping, (this.mFrameDelay * i2) / 10.0f));
                                f = ((this.mFrameDelay * 1.0f) / 1000.0f) * fPow;
                                if (Math.abs(f) < 1.0f) {
                                    SmartRefreshLayout smartRefreshLayout7 = SmartRefreshLayout.this;
                                    refreshState = smartRefreshLayout7.mState;
                                    if (!refreshState.isOpening) {
                                    }
                                    return null;
                                }
                                i3 = (int) (i3 + f);
                            }
                        }
                    }
                } else {
                    i = SmartRefreshLayout.this.mSpinner;
                    fPow = this.mVelocity;
                    i2 = 0;
                    i3 = i;
                    while (i * i3 > 0) {
                        i2++;
                        fPow = (float) (((double) fPow) * Math.pow(this.mDamping, (this.mFrameDelay * i2) / 10.0f));
                        f = ((this.mFrameDelay * 1.0f) / 1000.0f) * fPow;
                        if (Math.abs(f) < 1.0f) {
                            SmartRefreshLayout smartRefreshLayout8 = SmartRefreshLayout.this;
                            refreshState = smartRefreshLayout8.mState;
                            if (!refreshState.isOpening) {
                            }
                            return null;
                        }
                        i3 = (int) (i3 + f);
                    }
                }
            }
            this.mStartTime = AnimationUtils.currentAnimationTimeMillis();
            SmartRefreshLayout.this.mHandler.postDelayed(this, this.mFrameDelay);
            return this;
        }
    }

    public class RefreshKernelImpl implements RefreshKernel {
        public RefreshKernelImpl() {
        }

        @Override // com.scwang.smartrefresh.layout.api.RefreshKernel
        public ValueAnimator animSpinner(int i) {
            SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
            return smartRefreshLayout.animSpinner(i, 0, smartRefreshLayout.mReboundInterpolator, smartRefreshLayout.mReboundDuration);
        }

        @Override // com.scwang.smartrefresh.layout.api.RefreshKernel
        public RefreshKernel finishTwoLevel() {
            SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
            if (smartRefreshLayout.mState == RefreshState.TwoLevel) {
                smartRefreshLayout.mKernel.setState(RefreshState.TwoLevelFinish);
                if (SmartRefreshLayout.this.mSpinner == 0) {
                    moveSpinner(0, false);
                    SmartRefreshLayout.this.notifyStateChanged(RefreshState.None);
                } else {
                    animSpinner(0).setDuration(SmartRefreshLayout.this.mFloorDuration);
                }
            }
            return this;
        }

        @Override // com.scwang.smartrefresh.layout.api.RefreshKernel
        @NonNull
        public RefreshContent getRefreshContent() {
            return SmartRefreshLayout.this.mRefreshContent;
        }

        @Override // com.scwang.smartrefresh.layout.api.RefreshKernel
        @NonNull
        public RefreshLayout getRefreshLayout() {
            return SmartRefreshLayout.this;
        }

        /* JADX WARN: Code duplicated, block: B:45:0x0099  */
        @Override // com.scwang.smartrefresh.layout.api.RefreshKernel
        public RefreshKernel moveSpinner(int i, boolean z) {
            OnMultiPurposeListener onMultiPurposeListener;
            OnMultiPurposeListener onMultiPurposeListener2;
            int i2;
            boolean z2;
            RefreshInternal refreshInternal;
            RefreshInternal refreshInternal2;
            SmartRefreshLayout smartRefreshLayout;
            RefreshInternal refreshInternal3;
            RefreshInternal refreshInternal4;
            RefreshInternal refreshInternal5;
            RefreshInternal refreshInternal6;
            SmartRefreshLayout smartRefreshLayout2 = SmartRefreshLayout.this;
            if (smartRefreshLayout2.mSpinner == i && (((refreshInternal5 = smartRefreshLayout2.mRefreshHeader) == null || !refreshInternal5.isSupportHorizontalDrag()) && ((refreshInternal6 = SmartRefreshLayout.this.mRefreshFooter) == null || !refreshInternal6.isSupportHorizontalDrag()))) {
                return this;
            }
            SmartRefreshLayout smartRefreshLayout3 = SmartRefreshLayout.this;
            int i3 = smartRefreshLayout3.mSpinner;
            smartRefreshLayout3.mSpinner = i;
            if (z) {
                RefreshState refreshState = smartRefreshLayout3.mViceState;
                if (refreshState.isDragging || refreshState.isOpening) {
                    if (i > smartRefreshLayout3.mHeaderHeight * smartRefreshLayout3.mHeaderTriggerRate) {
                        if (smartRefreshLayout3.mState != RefreshState.ReleaseToTwoLevel) {
                            smartRefreshLayout3.mKernel.setState(RefreshState.ReleaseToRefresh);
                        }
                    } else if ((-i) > smartRefreshLayout3.mFooterHeight * smartRefreshLayout3.mFooterTriggerRate && !smartRefreshLayout3.mFooterNoMoreData) {
                        smartRefreshLayout3.mKernel.setState(RefreshState.ReleaseToLoad);
                    } else if (i < 0 && !smartRefreshLayout3.mFooterNoMoreData) {
                        smartRefreshLayout3.mKernel.setState(RefreshState.PullUpToLoad);
                    } else if (i > 0) {
                        smartRefreshLayout3.mKernel.setState(RefreshState.PullDownToRefresh);
                    }
                }
            }
            SmartRefreshLayout smartRefreshLayout4 = SmartRefreshLayout.this;
            if (smartRefreshLayout4.mRefreshContent != null) {
                if (i < 0 || (refreshInternal4 = smartRefreshLayout4.mRefreshHeader) == null) {
                    i2 = 0;
                    z2 = false;
                } else if (smartRefreshLayout4.isEnableTranslationContent(smartRefreshLayout4.mEnableHeaderTranslationContent, refreshInternal4)) {
                    i2 = i;
                    z2 = true;
                } else if (i3 < 0) {
                    z2 = true;
                    i2 = 0;
                } else {
                    i2 = 0;
                    z2 = false;
                }
                if (i <= 0 && (refreshInternal3 = (smartRefreshLayout = SmartRefreshLayout.this).mRefreshFooter) != null) {
                    if (smartRefreshLayout.isEnableTranslationContent(smartRefreshLayout.mEnableFooterTranslationContent, refreshInternal3)) {
                        i2 = i;
                        z2 = true;
                    } else if (i3 > 0) {
                        z2 = true;
                        i2 = 0;
                    }
                }
                if (z2) {
                    SmartRefreshLayout smartRefreshLayout5 = SmartRefreshLayout.this;
                    smartRefreshLayout5.mRefreshContent.moveSpinner(i2, smartRefreshLayout5.mHeaderTranslationViewId, smartRefreshLayout5.mFooterTranslationViewId);
                    SmartRefreshLayout smartRefreshLayout6 = SmartRefreshLayout.this;
                    if (smartRefreshLayout6.mFooterNoMoreData && smartRefreshLayout6.mFooterNoMoreDataEffective && smartRefreshLayout6.mEnableFooterFollowWhenNoMoreData) {
                        RefreshInternal refreshInternal7 = smartRefreshLayout6.mRefreshFooter;
                        if ((refreshInternal7 instanceof RefreshFooter) && refreshInternal7.getSpinnerStyle() == SpinnerStyle.Translate) {
                            SmartRefreshLayout smartRefreshLayout7 = SmartRefreshLayout.this;
                            if (smartRefreshLayout7.isEnableRefreshOrLoadMore(smartRefreshLayout7.mEnableLoadMore)) {
                                SmartRefreshLayout.this.mRefreshFooter.getView().setTranslationY(Math.max(0, i2));
                            }
                        }
                    }
                    SmartRefreshLayout smartRefreshLayout8 = SmartRefreshLayout.this;
                    boolean z3 = (smartRefreshLayout8.mEnableClipHeaderWhenFixedBehind && (refreshInternal2 = smartRefreshLayout8.mRefreshHeader) != null && refreshInternal2.getSpinnerStyle() == SpinnerStyle.FixedBehind) || SmartRefreshLayout.this.mHeaderBackgroundColor != 0;
                    SmartRefreshLayout smartRefreshLayout9 = SmartRefreshLayout.this;
                    boolean z4 = (smartRefreshLayout9.mEnableClipFooterWhenFixedBehind && (refreshInternal = smartRefreshLayout9.mRefreshFooter) != null && refreshInternal.getSpinnerStyle() == SpinnerStyle.FixedBehind) || SmartRefreshLayout.this.mFooterBackgroundColor != 0;
                    if ((z3 && (i2 >= 0 || i3 > 0)) || (z4 && (i2 <= 0 || i3 < 0))) {
                        smartRefreshLayout3.invalidate();
                    }
                }
            }
            if ((i >= 0 || i3 > 0) && SmartRefreshLayout.this.mRefreshHeader != null) {
                int iMax = Math.max(i, 0);
                SmartRefreshLayout smartRefreshLayout10 = SmartRefreshLayout.this;
                int i4 = smartRefreshLayout10.mHeaderHeight;
                int i5 = (int) (i4 * smartRefreshLayout10.mHeaderMaxDragRate);
                float f = (iMax * 1.0f) / (i4 == 0 ? 1 : i4);
                if (smartRefreshLayout10.isEnableRefreshOrLoadMore(smartRefreshLayout10.mEnableRefresh) || (SmartRefreshLayout.this.mState == RefreshState.RefreshFinish && !z)) {
                    SmartRefreshLayout smartRefreshLayout11 = SmartRefreshLayout.this;
                    if (i3 != smartRefreshLayout11.mSpinner) {
                        if (smartRefreshLayout11.mRefreshHeader.getSpinnerStyle() == SpinnerStyle.Translate) {
                            SmartRefreshLayout.this.mRefreshHeader.getView().setTranslationY(SmartRefreshLayout.this.mSpinner);
                            SmartRefreshLayout smartRefreshLayout12 = SmartRefreshLayout.this;
                            if (smartRefreshLayout12.mHeaderBackgroundColor != 0 && smartRefreshLayout12.mPaint != null && !smartRefreshLayout12.isEnableTranslationContent(smartRefreshLayout12.mEnableHeaderTranslationContent, smartRefreshLayout12.mRefreshHeader)) {
                                smartRefreshLayout3.invalidate();
                            }
                        } else if (SmartRefreshLayout.this.mRefreshHeader.getSpinnerStyle().scale) {
                            View view = SmartRefreshLayout.this.mRefreshHeader.getView();
                            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : SmartRefreshLayout.sDefaultMarginLP;
                            view.measure(View.MeasureSpec.makeMeasureSpec(view.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(Math.max((SmartRefreshLayout.this.mSpinner - marginLayoutParams.bottomMargin) - marginLayoutParams.topMargin, 0), 1073741824));
                            int i6 = marginLayoutParams.leftMargin;
                            int i7 = marginLayoutParams.topMargin + SmartRefreshLayout.this.mHeaderInsetStart;
                            view.layout(i6, i7, view.getMeasuredWidth() + i6, view.getMeasuredHeight() + i7);
                        }
                        SmartRefreshLayout.this.mRefreshHeader.onMoving(z, f, iMax, i4, i5);
                    }
                    if (z && SmartRefreshLayout.this.mRefreshHeader.isSupportHorizontalDrag()) {
                        int i8 = (int) SmartRefreshLayout.this.mLastTouchX;
                        int width = smartRefreshLayout3.getWidth();
                        SmartRefreshLayout smartRefreshLayout13 = SmartRefreshLayout.this;
                        smartRefreshLayout13.mRefreshHeader.onHorizontalDrag(smartRefreshLayout13.mLastTouchX / (width == 0 ? 1 : width), i8, width);
                    }
                } else {
                    i5 = i5;
                }
                SmartRefreshLayout smartRefreshLayout14 = SmartRefreshLayout.this;
                if (i3 != smartRefreshLayout14.mSpinner && (onMultiPurposeListener = smartRefreshLayout14.mOnMultiPurposeListener) != null) {
                    RefreshInternal refreshInternal8 = smartRefreshLayout14.mRefreshHeader;
                    if (refreshInternal8 instanceof RefreshHeader) {
                        onMultiPurposeListener.onHeaderMoving((RefreshHeader) refreshInternal8, z, f, iMax, i4, i5);
                    }
                }
            }
            if ((i <= 0 || i3 < 0) && SmartRefreshLayout.this.mRefreshFooter != null) {
                int i9 = -Math.min(i, 0);
                SmartRefreshLayout smartRefreshLayout15 = SmartRefreshLayout.this;
                int i10 = smartRefreshLayout15.mFooterHeight;
                int i11 = (int) (i10 * smartRefreshLayout15.mFooterMaxDragRate);
                float f2 = (i9 * 1.0f) / (i10 == 0 ? 1 : i10);
                if (smartRefreshLayout15.isEnableRefreshOrLoadMore(smartRefreshLayout15.mEnableLoadMore) || (SmartRefreshLayout.this.mState == RefreshState.LoadFinish && !z)) {
                    SmartRefreshLayout smartRefreshLayout16 = SmartRefreshLayout.this;
                    if (i3 != smartRefreshLayout16.mSpinner) {
                        if (smartRefreshLayout16.mRefreshFooter.getSpinnerStyle() == SpinnerStyle.Translate) {
                            SmartRefreshLayout.this.mRefreshFooter.getView().setTranslationY(SmartRefreshLayout.this.mSpinner);
                            SmartRefreshLayout smartRefreshLayout17 = SmartRefreshLayout.this;
                            if (smartRefreshLayout17.mFooterBackgroundColor != 0 && smartRefreshLayout17.mPaint != null && !smartRefreshLayout17.isEnableTranslationContent(smartRefreshLayout17.mEnableFooterTranslationContent, smartRefreshLayout17.mRefreshFooter)) {
                                smartRefreshLayout3.invalidate();
                            }
                        } else if (SmartRefreshLayout.this.mRefreshFooter.getSpinnerStyle().scale) {
                            View view2 = SmartRefreshLayout.this.mRefreshFooter.getView();
                            ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
                            ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : SmartRefreshLayout.sDefaultMarginLP;
                            view2.measure(View.MeasureSpec.makeMeasureSpec(view2.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(Math.max(((-SmartRefreshLayout.this.mSpinner) - marginLayoutParams2.bottomMargin) - marginLayoutParams2.topMargin, 0), 1073741824));
                            int i12 = marginLayoutParams2.leftMargin;
                            int measuredHeight = (marginLayoutParams2.topMargin + smartRefreshLayout3.getMeasuredHeight()) - SmartRefreshLayout.this.mFooterInsetStart;
                            view2.layout(i12, measuredHeight - view2.getMeasuredHeight(), view2.getMeasuredWidth() + i12, measuredHeight);
                        }
                        SmartRefreshLayout.this.mRefreshFooter.onMoving(z, f2, i9, i10, i11);
                    }
                    if (z && SmartRefreshLayout.this.mRefreshFooter.isSupportHorizontalDrag()) {
                        int i13 = (int) SmartRefreshLayout.this.mLastTouchX;
                        int width2 = smartRefreshLayout3.getWidth();
                        SmartRefreshLayout smartRefreshLayout18 = SmartRefreshLayout.this;
                        smartRefreshLayout18.mRefreshFooter.onHorizontalDrag(smartRefreshLayout18.mLastTouchX / (width2 != 0 ? width2 : 1), i13, width2);
                    }
                }
                SmartRefreshLayout smartRefreshLayout19 = SmartRefreshLayout.this;
                if (i3 != smartRefreshLayout19.mSpinner && (onMultiPurposeListener2 = smartRefreshLayout19.mOnMultiPurposeListener) != null) {
                    RefreshInternal refreshInternal9 = smartRefreshLayout19.mRefreshFooter;
                    if (refreshInternal9 instanceof RefreshFooter) {
                        onMultiPurposeListener2.onFooterMoving((RefreshFooter) refreshInternal9, z, f2, i9, i10, i11);
                    }
                }
            }
            return this;
        }

        @Override // com.scwang.smartrefresh.layout.api.RefreshKernel
        public RefreshKernel requestDefaultTranslationContentFor(@NonNull RefreshInternal refreshInternal, boolean z) {
            if (refreshInternal.equals(SmartRefreshLayout.this.mRefreshHeader)) {
                SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
                if (!smartRefreshLayout.mManualHeaderTranslationContent) {
                    smartRefreshLayout.mManualHeaderTranslationContent = true;
                    smartRefreshLayout.mEnableHeaderTranslationContent = z;
                }
            } else if (refreshInternal.equals(SmartRefreshLayout.this.mRefreshFooter)) {
                SmartRefreshLayout smartRefreshLayout2 = SmartRefreshLayout.this;
                if (!smartRefreshLayout2.mManualFooterTranslationContent) {
                    smartRefreshLayout2.mManualFooterTranslationContent = true;
                    smartRefreshLayout2.mEnableFooterTranslationContent = z;
                }
            }
            return this;
        }

        @Override // com.scwang.smartrefresh.layout.api.RefreshKernel
        public RefreshKernel requestDrawBackgroundFor(@NonNull RefreshInternal refreshInternal, int i) {
            SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
            if (smartRefreshLayout.mPaint == null && i != 0) {
                smartRefreshLayout.mPaint = new Paint();
            }
            if (refreshInternal.equals(SmartRefreshLayout.this.mRefreshHeader)) {
                SmartRefreshLayout.this.mHeaderBackgroundColor = i;
            } else if (refreshInternal.equals(SmartRefreshLayout.this.mRefreshFooter)) {
                SmartRefreshLayout.this.mFooterBackgroundColor = i;
            }
            return this;
        }

        @Override // com.scwang.smartrefresh.layout.api.RefreshKernel
        public RefreshKernel requestFloorParams(int i, float f, float f2) {
            SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
            smartRefreshLayout.mFloorDuration = i;
            smartRefreshLayout.mFloorOpenLayoutRate = f;
            smartRefreshLayout.mFloorBottomDragLayoutRate = f2;
            return this;
        }

        @Override // com.scwang.smartrefresh.layout.api.RefreshKernel
        public RefreshKernel requestNeedTouchEventFor(@NonNull RefreshInternal refreshInternal, boolean z) {
            if (refreshInternal.equals(SmartRefreshLayout.this.mRefreshHeader)) {
                SmartRefreshLayout.this.mHeaderNeedTouchEventWhenRefreshing = z;
            } else if (refreshInternal.equals(SmartRefreshLayout.this.mRefreshFooter)) {
                SmartRefreshLayout.this.mFooterNeedTouchEventWhenLoading = z;
            }
            return this;
        }

        @Override // com.scwang.smartrefresh.layout.api.RefreshKernel
        public RefreshKernel requestRemeasureHeightFor(@NonNull RefreshInternal refreshInternal) {
            if (refreshInternal.equals(SmartRefreshLayout.this.mRefreshHeader)) {
                SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
                DimensionStatus dimensionStatus = smartRefreshLayout.mHeaderHeightStatus;
                if (dimensionStatus.notified) {
                    smartRefreshLayout.mHeaderHeightStatus = dimensionStatus.unNotify();
                }
            } else if (refreshInternal.equals(SmartRefreshLayout.this.mRefreshFooter)) {
                SmartRefreshLayout smartRefreshLayout2 = SmartRefreshLayout.this;
                DimensionStatus dimensionStatus2 = smartRefreshLayout2.mFooterHeightStatus;
                if (dimensionStatus2.notified) {
                    smartRefreshLayout2.mFooterHeightStatus = dimensionStatus2.unNotify();
                }
            }
            return this;
        }

        @Override // com.scwang.smartrefresh.layout.api.RefreshKernel
        public RefreshKernel setState(@NonNull RefreshState refreshState) {
            switch (AnonymousClass10.$SwitchMap$com$scwang$smartrefresh$layout$constant$RefreshState[refreshState.ordinal()]) {
                case 1:
                    SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
                    RefreshState refreshState2 = smartRefreshLayout.mState;
                    RefreshState refreshState3 = RefreshState.None;
                    if (refreshState2 != refreshState3 && smartRefreshLayout.mSpinner == 0) {
                        smartRefreshLayout.notifyStateChanged(refreshState3);
                    } else if (smartRefreshLayout.mSpinner != 0) {
                        animSpinner(0);
                    }
                    break;
                case 2:
                    SmartRefreshLayout smartRefreshLayout2 = SmartRefreshLayout.this;
                    if (!smartRefreshLayout2.mState.isOpening && smartRefreshLayout2.isEnableRefreshOrLoadMore(smartRefreshLayout2.mEnableRefresh)) {
                        SmartRefreshLayout.this.notifyStateChanged(RefreshState.PullDownToRefresh);
                    } else {
                        SmartRefreshLayout.this.setViceState(RefreshState.PullDownToRefresh);
                    }
                    break;
                case 3:
                    SmartRefreshLayout smartRefreshLayout3 = SmartRefreshLayout.this;
                    if (smartRefreshLayout3.isEnableRefreshOrLoadMore(smartRefreshLayout3.mEnableLoadMore)) {
                        SmartRefreshLayout smartRefreshLayout4 = SmartRefreshLayout.this;
                        RefreshState refreshState4 = smartRefreshLayout4.mState;
                        if (!refreshState4.isOpening && !refreshState4.isFinishing && (!smartRefreshLayout4.mFooterNoMoreData || !smartRefreshLayout4.mEnableFooterFollowWhenNoMoreData || !smartRefreshLayout4.mFooterNoMoreDataEffective)) {
                            smartRefreshLayout4.notifyStateChanged(RefreshState.PullUpToLoad);
                        }
                    }
                    SmartRefreshLayout.this.setViceState(RefreshState.PullUpToLoad);
                    break;
                case 4:
                    SmartRefreshLayout smartRefreshLayout5 = SmartRefreshLayout.this;
                    if (!smartRefreshLayout5.mState.isOpening && smartRefreshLayout5.isEnableRefreshOrLoadMore(smartRefreshLayout5.mEnableRefresh)) {
                        SmartRefreshLayout.this.notifyStateChanged(RefreshState.PullDownCanceled);
                        setState(RefreshState.None);
                    } else {
                        SmartRefreshLayout.this.setViceState(RefreshState.PullDownCanceled);
                    }
                    break;
                case 5:
                    SmartRefreshLayout smartRefreshLayout6 = SmartRefreshLayout.this;
                    if (smartRefreshLayout6.isEnableRefreshOrLoadMore(smartRefreshLayout6.mEnableLoadMore)) {
                        SmartRefreshLayout smartRefreshLayout7 = SmartRefreshLayout.this;
                        if (!smartRefreshLayout7.mState.isOpening && (!smartRefreshLayout7.mFooterNoMoreData || !smartRefreshLayout7.mEnableFooterFollowWhenNoMoreData || !smartRefreshLayout7.mFooterNoMoreDataEffective)) {
                            smartRefreshLayout7.notifyStateChanged(RefreshState.PullUpCanceled);
                            setState(RefreshState.None);
                        }
                    }
                    SmartRefreshLayout.this.setViceState(RefreshState.PullUpCanceled);
                    break;
                case 6:
                    SmartRefreshLayout smartRefreshLayout8 = SmartRefreshLayout.this;
                    if (!smartRefreshLayout8.mState.isOpening && smartRefreshLayout8.isEnableRefreshOrLoadMore(smartRefreshLayout8.mEnableRefresh)) {
                        SmartRefreshLayout.this.notifyStateChanged(RefreshState.ReleaseToRefresh);
                    } else {
                        SmartRefreshLayout.this.setViceState(RefreshState.ReleaseToRefresh);
                    }
                    break;
                case 7:
                    SmartRefreshLayout smartRefreshLayout9 = SmartRefreshLayout.this;
                    if (smartRefreshLayout9.isEnableRefreshOrLoadMore(smartRefreshLayout9.mEnableLoadMore)) {
                        SmartRefreshLayout smartRefreshLayout10 = SmartRefreshLayout.this;
                        RefreshState refreshState5 = smartRefreshLayout10.mState;
                        if (!refreshState5.isOpening && !refreshState5.isFinishing && (!smartRefreshLayout10.mFooterNoMoreData || !smartRefreshLayout10.mEnableFooterFollowWhenNoMoreData || !smartRefreshLayout10.mFooterNoMoreDataEffective)) {
                            smartRefreshLayout10.notifyStateChanged(RefreshState.ReleaseToLoad);
                        }
                    }
                    SmartRefreshLayout.this.setViceState(RefreshState.ReleaseToLoad);
                    break;
                case 8:
                    SmartRefreshLayout smartRefreshLayout11 = SmartRefreshLayout.this;
                    if (!smartRefreshLayout11.mState.isOpening && smartRefreshLayout11.isEnableRefreshOrLoadMore(smartRefreshLayout11.mEnableRefresh)) {
                        SmartRefreshLayout.this.notifyStateChanged(RefreshState.ReleaseToTwoLevel);
                    } else {
                        SmartRefreshLayout.this.setViceState(RefreshState.ReleaseToTwoLevel);
                    }
                    break;
                case 9:
                    SmartRefreshLayout smartRefreshLayout12 = SmartRefreshLayout.this;
                    if (!smartRefreshLayout12.mState.isOpening && smartRefreshLayout12.isEnableRefreshOrLoadMore(smartRefreshLayout12.mEnableRefresh)) {
                        SmartRefreshLayout.this.notifyStateChanged(RefreshState.RefreshReleased);
                    } else {
                        SmartRefreshLayout.this.setViceState(RefreshState.RefreshReleased);
                    }
                    break;
                case 10:
                    SmartRefreshLayout smartRefreshLayout13 = SmartRefreshLayout.this;
                    if (!smartRefreshLayout13.mState.isOpening && smartRefreshLayout13.isEnableRefreshOrLoadMore(smartRefreshLayout13.mEnableLoadMore)) {
                        SmartRefreshLayout.this.notifyStateChanged(RefreshState.LoadReleased);
                    } else {
                        SmartRefreshLayout.this.setViceState(RefreshState.LoadReleased);
                    }
                    break;
                case 11:
                    SmartRefreshLayout.this.setStateRefreshing(true);
                    break;
                case 12:
                    SmartRefreshLayout.this.setStateLoading(true);
                    break;
                default:
                    SmartRefreshLayout.this.notifyStateChanged(refreshState);
                    break;
            }
            return null;
        }

        /* JADX WARN: Code duplicated, block: B:12:0x0032  */
        @Override // com.scwang.smartrefresh.layout.api.RefreshKernel
        public RefreshKernel startTwoLevel(boolean z) {
            if (z) {
                AnimatorListenerAdapter animatorListenerAdapter = new AnimatorListenerAdapter() { // from class: com.scwang.smartrefresh.layout.SmartRefreshLayout.RefreshKernelImpl.1
                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator animator) {
                        if (animator == null || animator.getDuration() != 0) {
                            SmartRefreshLayout.this.mKernel.setState(RefreshState.TwoLevel);
                        }
                    }
                };
                int measuredHeight = SmartRefreshLayout.this.getMeasuredHeight();
                float f = SmartRefreshLayout.this.mFloorOpenLayoutRate;
                ValueAnimator valueAnimatorAnimSpinner = animSpinner(f > 1.0f ? (int) f : (int) (measuredHeight * f));
                if (valueAnimatorAnimSpinner != null) {
                    SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
                    if (valueAnimatorAnimSpinner == smartRefreshLayout.reboundAnimator) {
                        valueAnimatorAnimSpinner.setDuration(smartRefreshLayout.mFloorDuration);
                        valueAnimatorAnimSpinner.addListener(animatorListenerAdapter);
                    } else {
                        animatorListenerAdapter.onAnimationEnd(null);
                    }
                } else {
                    animatorListenerAdapter.onAnimationEnd(null);
                }
            } else if (animSpinner(0) == null) {
                SmartRefreshLayout.this.notifyStateChanged(RefreshState.None);
            }
            return this;
        }
    }

    public SmartRefreshLayout(Context context) {
        this(context, null);
    }

    public static void setDefaultRefreshFooterCreator(@NonNull DefaultRefreshFooterCreator defaultRefreshFooterCreator) {
        sFooterCreator = defaultRefreshFooterCreator;
    }

    public static void setDefaultRefreshHeaderCreator(@NonNull DefaultRefreshHeaderCreator defaultRefreshHeaderCreator) {
        sHeaderCreator = defaultRefreshHeaderCreator;
    }

    public static void setDefaultRefreshInitializer(@NonNull DefaultRefreshInitializer defaultRefreshInitializer) {
        sRefreshInitializer = defaultRefreshInitializer;
    }

    public ValueAnimator animSpinner(int i, int i2, Interpolator interpolator, int i3) {
        if (this.mSpinner == i) {
            return null;
        }
        ValueAnimator valueAnimator = this.reboundAnimator;
        if (valueAnimator != null) {
            valueAnimator.setDuration(0L);
            this.reboundAnimator.cancel();
            this.reboundAnimator = null;
        }
        this.animationRunnable = null;
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(this.mSpinner, i);
        this.reboundAnimator = valueAnimatorOfInt;
        valueAnimatorOfInt.setDuration(i3);
        this.reboundAnimator.setInterpolator(interpolator);
        this.reboundAnimator.addListener(new AnimatorListenerAdapter() { // from class: com.scwang.smartrefresh.layout.SmartRefreshLayout.3
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                RefreshState refreshState;
                RefreshState refreshState2;
                if (animator == null || animator.getDuration() != 0) {
                    SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
                    smartRefreshLayout.reboundAnimator = null;
                    if (smartRefreshLayout.mSpinner == 0 && (refreshState = smartRefreshLayout.mState) != (refreshState2 = RefreshState.None) && !refreshState.isOpening && !refreshState.isDragging) {
                        smartRefreshLayout.notifyStateChanged(refreshState2);
                        return;
                    }
                    RefreshState refreshState3 = smartRefreshLayout.mState;
                    if (refreshState3 != smartRefreshLayout.mViceState) {
                        smartRefreshLayout.setViceState(refreshState3);
                    }
                }
            }
        });
        this.reboundAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.scwang.smartrefresh.layout.SmartRefreshLayout.4
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator2) {
                SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
                if (smartRefreshLayout.reboundAnimator != null) {
                    smartRefreshLayout.mKernel.moveSpinner(((Integer) valueAnimator2.getAnimatedValue()).intValue(), false);
                }
            }
        });
        this.reboundAnimator.setStartDelay(i2);
        this.reboundAnimator.start();
        return this.reboundAnimator;
    }

    public void animSpinnerBounce(float f) {
        RefreshState refreshState;
        if (this.reboundAnimator == null) {
            if (f > 0.0f && ((refreshState = this.mState) == RefreshState.Refreshing || refreshState == RefreshState.TwoLevel)) {
                this.animationRunnable = new BounceRunnable(f, this.mHeaderHeight);
                return;
            }
            if (f < 0.0f && (this.mState == RefreshState.Loading || ((this.mEnableFooterFollowWhenNoMoreData && this.mFooterNoMoreData && this.mFooterNoMoreDataEffective && isEnableRefreshOrLoadMore(this.mEnableLoadMore)) || (this.mEnableAutoLoadMore && !this.mFooterNoMoreData && isEnableRefreshOrLoadMore(this.mEnableLoadMore) && this.mState != RefreshState.Refreshing)))) {
                this.animationRunnable = new BounceRunnable(f, -this.mFooterHeight);
            } else if (this.mSpinner == 0 && this.mEnableOverScrollBounce) {
                this.animationRunnable = new BounceRunnable(f, 0);
            }
        }
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshLayout
    public boolean autoLoadMore() {
        int i = this.mReboundDuration;
        int i2 = this.mFooterHeight;
        float f = i2 * ((this.mFooterMaxDragRate / 2.0f) + 0.5f) * 1.0f;
        if (i2 == 0) {
            i2 = 1;
        }
        return autoLoadMore(0, i, f / i2, false);
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshLayout
    public boolean autoLoadMoreAnimationOnly() {
        int i = this.mReboundDuration;
        int i2 = this.mFooterHeight;
        float f = i2 * ((this.mFooterMaxDragRate / 2.0f) + 0.5f) * 1.0f;
        if (i2 == 0) {
            i2 = 1;
        }
        return autoLoadMore(0, i, f / i2, true);
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshLayout
    public boolean autoRefresh() {
        int i = this.mAttachedToWindow ? 0 : 400;
        int i2 = this.mReboundDuration;
        float f = (this.mHeaderMaxDragRate / 2.0f) + 0.5f;
        int i3 = this.mHeaderHeight;
        float f2 = f * i3 * 1.0f;
        if (i3 == 0) {
            i3 = 1;
        }
        return autoRefresh(i, i2, f2 / i3, false);
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshLayout
    public boolean autoRefreshAnimationOnly() {
        int i = this.mAttachedToWindow ? 0 : 400;
        int i2 = this.mReboundDuration;
        float f = (this.mHeaderMaxDragRate / 2.0f) + 0.5f;
        int i3 = this.mHeaderHeight;
        float f2 = f * i3 * 1.0f;
        if (i3 == 0) {
            i3 = 1;
        }
        return autoRefresh(i, i2, f2 / i3, true);
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshLayout
    public RefreshLayout closeHeaderOrFooter() {
        RefreshState refreshState;
        RefreshState refreshState2 = this.mState;
        RefreshState refreshState3 = RefreshState.None;
        if (refreshState2 == refreshState3 && ((refreshState = this.mViceState) == RefreshState.Refreshing || refreshState == RefreshState.Loading)) {
            this.mViceState = refreshState3;
        }
        if (refreshState2 == RefreshState.Refreshing) {
            finishRefresh();
        } else if (refreshState2 == RefreshState.Loading) {
            finishLoadMore();
        } else if (this.mKernel.animSpinner(0) == null) {
            notifyStateChanged(refreshState3);
        } else if (this.mState.isHeader) {
            notifyStateChanged(RefreshState.PullDownCanceled);
        } else {
            notifyStateChanged(RefreshState.PullUpCanceled);
        }
        return this;
    }

    @Override // android.view.View
    public void computeScroll() {
        this.mScroller.getCurrY();
        if (this.mScroller.computeScrollOffset()) {
            int finalY = this.mScroller.getFinalY();
            if ((finalY >= 0 || !((this.mEnableRefresh || this.mEnableOverScrollDrag) && this.mRefreshContent.canRefresh())) && (finalY <= 0 || !((this.mEnableLoadMore || this.mEnableOverScrollDrag) && this.mRefreshContent.canLoadMore()))) {
                this.mVerticalPermit = true;
                invalidate();
            } else {
                if (this.mVerticalPermit) {
                    animSpinnerBounce(finalY > 0 ? -this.mScroller.getCurrVelocity() : this.mScroller.getCurrVelocity());
                }
                this.mScroller.forceFinished(true);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:121:0x0163  */
    /* JADX WARN: Code duplicated, block: B:123:0x0169  */
    /* JADX WARN: Code duplicated, block: B:132:0x0187  */
    /* JADX WARN: Code duplicated, block: B:134:0x018b  */
    /* JADX WARN: Code duplicated, block: B:149:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:151:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:154:0x01c7 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:159:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:162:0x01de  */
    /* JADX WARN: Code duplicated, block: B:165:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:177:0x020b  */
    /* JADX WARN: Code duplicated, block: B:180:0x0240  */
    /* JADX WARN: Code duplicated, block: B:186:0x024f  */
    /* JADX WARN: Code duplicated, block: B:193:0x026d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:194:0x026f  */
    /* JADX WARN: Code duplicated, block: B:201:0x028d  */
    /* JADX WARN: Code duplicated, block: B:204:0x0294 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:205:0x0296  */
    /* JADX WARN: Code duplicated, block: B:210:0x02a0  */
    /* JADX WARN: Code duplicated, block: B:214:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:218:0x02b9  */
    /* JADX WARN: Code duplicated, block: B:225:0x02cb  */
    /* JADX WARN: Code duplicated, block: B:228:0x02f3  */
    /* JADX WARN: Code duplicated, block: B:231:0x0311  */
    /* JADX WARN: Code duplicated, block: B:235:0x0319  */
    /* JADX WARN: Code duplicated, block: B:237:0x033f  */
    /* JADX WARN: Code duplicated, block: B:251:0x036f  */
    /* JADX WARN: Code duplicated, block: B:69:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:71:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:75:0x00da  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:93:0x0102  */
    /* JADX WARN: Code duplicated, block: B:95:0x0105  */
    /* JADX WARN: Code duplicated, block: B:97:0x0108 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:99:0x010c  */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x00dc, code lost:
    
        if (r2.isFooter != false) goto L254;
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        RefreshState refreshState;
        RefreshState refreshState2;
        RefreshContent refreshContent;
        float f;
        MotionEvent motionEvent2;
        float f2;
        float f3;
        int i;
        RefreshState refreshState3;
        long eventTime;
        MotionEvent motionEventObtain;
        RefreshState refreshState4;
        char c2;
        int i2;
        RefreshState refreshState5;
        ViewParent parent;
        RefreshState refreshState6;
        RefreshInternal refreshInternal;
        RefreshInternal refreshInternal2;
        int actionMasked = motionEvent.getActionMasked();
        int i3 = 0;
        boolean z = actionMasked == 6;
        int actionIndex = z ? motionEvent.getActionIndex() : -1;
        int pointerCount = motionEvent.getPointerCount();
        float x = 0.0f;
        float y = 0.0f;
        for (int i4 = 0; i4 < pointerCount; i4++) {
            if (actionIndex != i4) {
                x += motionEvent.getX(i4);
                y += motionEvent.getY(i4);
            }
        }
        if (z) {
            pointerCount--;
        }
        float f4 = pointerCount;
        float f5 = x / f4;
        float f6 = y / f4;
        if ((actionMasked == 6 || actionMasked == 5) && this.mIsBeingDragged) {
            this.mTouchY += f6 - this.mLastTouchY;
        }
        this.mLastTouchX = f5;
        this.mLastTouchY = f6;
        if (this.mNestedInProgress) {
            int i5 = this.mTotalUnconsumed;
            boolean zDispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
            if (actionMasked == 2 && i5 == this.mTotalUnconsumed) {
                int i6 = (int) this.mLastTouchX;
                int width = getWidth();
                float f7 = this.mLastTouchX / (width != 0 ? width : 1);
                if (isEnableRefreshOrLoadMore(this.mEnableRefresh) && this.mSpinner > 0 && (refreshInternal2 = this.mRefreshHeader) != null && refreshInternal2.isSupportHorizontalDrag()) {
                    this.mRefreshHeader.onHorizontalDrag(f7, i6, width);
                } else if (isEnableRefreshOrLoadMore(this.mEnableLoadMore) && this.mSpinner < 0 && (refreshInternal = this.mRefreshFooter) != null && refreshInternal.isSupportHorizontalDrag()) {
                    this.mRefreshFooter.onHorizontalDrag(f7, i6, width);
                }
            }
            return zDispatchTouchEvent;
        }
        if (isEnabled() && (this.mEnableRefresh || this.mEnableLoadMore || this.mEnableOverScrollDrag)) {
            if (!this.mHeaderNeedTouchEventWhenRefreshing) {
                if (this.mFooterNeedTouchEventWhenLoading) {
                    refreshState6 = this.mState;
                    if (refreshState6.isOpening) {
                        if (refreshState6.isFinishing) {
                        }
                    }
                }
                if (!interceptAnimatorByAction(actionMasked)) {
                    refreshState = this.mState;
                    if (!refreshState.isFinishing) {
                        if (actionMasked != 0) {
                            this.mCurrentVelocity = 0;
                            this.mVelocityTracker.addMovement(motionEvent);
                            this.mScroller.forceFinished(true);
                            this.mTouchX = f5;
                            this.mTouchY = f6;
                            this.mLastSpinner = 0;
                            this.mTouchSpinner = this.mSpinner;
                            this.mIsBeingDragged = false;
                            this.mEnableDisallowIntercept = false;
                            this.mSuperDispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
                            if (this.mState == RefreshState.TwoLevel) {
                                int measuredHeight = getMeasuredHeight();
                                f = this.mFloorBottomDragLayoutRate;
                                if (f > 1.0f) {
                                }
                                if (f > 1.0f) {
                                    this.mDragDirection = 'h';
                                    return this.mSuperDispatchTouchEvent;
                                }
                            }
                            refreshContent = this.mRefreshContent;
                            if (refreshContent != null) {
                                refreshContent.onActionDown(motionEvent);
                            }
                            return true;
                        }
                        if (actionMasked != 1) {
                            if (actionMasked != 2) {
                                f2 = f5 - this.mTouchX;
                                f3 = f6 - this.mTouchY;
                                this.mVelocityTracker.addMovement(motionEvent);
                                if (!this.mIsBeingDragged) {
                                    if (c2 != 'v') {
                                        this.mDragDirection = 'v';
                                        if (f3 <= 0.0f) {
                                            if (f3 < 0.0f) {
                                                this.mIsBeingDragged = true;
                                                this.mTouchY = this.mTouchSlop + f6;
                                            }
                                        } else if (f3 < 0.0f) {
                                            this.mIsBeingDragged = true;
                                            this.mTouchY = this.mTouchSlop + f6;
                                        }
                                        if (this.mIsBeingDragged) {
                                            f3 = f6 - this.mTouchY;
                                            if (this.mSuperDispatchTouchEvent) {
                                                motionEvent.setAction(3);
                                                super.dispatchTouchEvent(motionEvent);
                                            }
                                            RefreshKernel refreshKernel = this.mKernel;
                                            i2 = this.mSpinner;
                                            if (i2 <= 0) {
                                                refreshState5 = RefreshState.PullDownToRefresh;
                                            } else {
                                                refreshState5 = RefreshState.PullDownToRefresh;
                                            }
                                            refreshKernel.setState(refreshState5);
                                            parent = getParent();
                                            if (parent instanceof ViewGroup) {
                                                ((ViewGroup) parent).requestDisallowInterceptTouchEvent(true);
                                            }
                                        }
                                    } else {
                                        this.mDragDirection = 'v';
                                        if (f3 <= 0.0f) {
                                            if (f3 < 0.0f) {
                                                this.mIsBeingDragged = true;
                                                this.mTouchY = this.mTouchSlop + f6;
                                            }
                                        } else if (f3 < 0.0f) {
                                            this.mIsBeingDragged = true;
                                            this.mTouchY = this.mTouchSlop + f6;
                                        }
                                        if (this.mIsBeingDragged) {
                                            f3 = f6 - this.mTouchY;
                                            if (this.mSuperDispatchTouchEvent) {
                                                motionEvent.setAction(3);
                                                super.dispatchTouchEvent(motionEvent);
                                            }
                                            RefreshKernel refreshKernel2 = this.mKernel;
                                            i2 = this.mSpinner;
                                            if (i2 <= 0) {
                                                refreshState5 = RefreshState.PullDownToRefresh;
                                            } else {
                                                refreshState5 = RefreshState.PullDownToRefresh;
                                            }
                                            refreshKernel2.setState(refreshState5);
                                            parent = getParent();
                                            if (parent instanceof ViewGroup) {
                                                ((ViewGroup) parent).requestDisallowInterceptTouchEvent(true);
                                            }
                                        }
                                    }
                                }
                                if (this.mIsBeingDragged) {
                                    i = ((int) f3) + this.mTouchSpinner;
                                    refreshState3 = this.mViceState;
                                    if (refreshState3.isHeader) {
                                        this.mLastSpinner = i;
                                        eventTime = motionEvent.getEventTime();
                                        if (this.mFalsifyEvent == null) {
                                            MotionEvent motionEventObtain2 = MotionEvent.obtain(eventTime, eventTime, 0, this.mTouchX + f2, this.mTouchY, 0);
                                            this.mFalsifyEvent = motionEventObtain2;
                                            super.dispatchTouchEvent(motionEventObtain2);
                                        }
                                        motionEventObtain = MotionEvent.obtain(eventTime, eventTime, 2, this.mTouchX + f2, this.mTouchY + i, 0);
                                        super.dispatchTouchEvent(motionEventObtain);
                                        if (this.mFooterLocked) {
                                            this.mFooterLocked = false;
                                        }
                                        if (i <= 0) {
                                            if (i < 0) {
                                                i3 = i;
                                            } else {
                                                i3 = i;
                                            }
                                        } else if (i < 0) {
                                            i3 = i;
                                        } else {
                                            i3 = i;
                                        }
                                        refreshState4 = this.mViceState;
                                        if (!refreshState4.isHeader) {
                                            if (this.mFalsifyEvent != null) {
                                                this.mFalsifyEvent = null;
                                                motionEventObtain.setAction(3);
                                                super.dispatchTouchEvent(motionEventObtain);
                                            }
                                            motionEventObtain.recycle();
                                            i = i3;
                                        } else {
                                            if (this.mFalsifyEvent != null) {
                                                this.mFalsifyEvent = null;
                                                motionEventObtain.setAction(3);
                                                super.dispatchTouchEvent(motionEventObtain);
                                            }
                                            motionEventObtain.recycle();
                                            i = i3;
                                        }
                                        if (this.mSpinner != 0) {
                                            moveSpinnerInfinitely(0.0f);
                                        }
                                        return true;
                                    }
                                    this.mLastSpinner = i;
                                    eventTime = motionEvent.getEventTime();
                                    if (this.mFalsifyEvent == null) {
                                        MotionEvent motionEventObtain3 = MotionEvent.obtain(eventTime, eventTime, 0, this.mTouchX + f2, this.mTouchY, 0);
                                        this.mFalsifyEvent = motionEventObtain3;
                                        super.dispatchTouchEvent(motionEventObtain3);
                                    }
                                    motionEventObtain = MotionEvent.obtain(eventTime, eventTime, 2, this.mTouchX + f2, this.mTouchY + i, 0);
                                    super.dispatchTouchEvent(motionEventObtain);
                                    if (this.mFooterLocked) {
                                        this.mFooterLocked = false;
                                    }
                                    if (i <= 0) {
                                        if (i < 0) {
                                            i3 = i;
                                        } else {
                                            i3 = i;
                                        }
                                    } else if (i < 0) {
                                        i3 = i;
                                    } else {
                                        i3 = i;
                                    }
                                    refreshState4 = this.mViceState;
                                    if (!refreshState4.isHeader) {
                                        if (this.mFalsifyEvent != null) {
                                            this.mFalsifyEvent = null;
                                            motionEventObtain.setAction(3);
                                            super.dispatchTouchEvent(motionEventObtain);
                                        }
                                        motionEventObtain.recycle();
                                        i = i3;
                                    } else {
                                        if (this.mFalsifyEvent != null) {
                                            this.mFalsifyEvent = null;
                                            motionEventObtain.setAction(3);
                                            super.dispatchTouchEvent(motionEventObtain);
                                        }
                                        motionEventObtain.recycle();
                                        i = i3;
                                    }
                                    if (this.mSpinner != 0) {
                                        moveSpinnerInfinitely(0.0f);
                                    }
                                    return true;
                                    moveSpinnerInfinitely(i);
                                    return true;
                                }
                                if (this.mFooterLocked) {
                                    this.mFooterLocked = false;
                                }
                            } else if (actionMasked == 3) {
                            }
                            return super.dispatchTouchEvent(motionEvent);
                        }
                        this.mVelocityTracker.addMovement(motionEvent);
                        this.mVelocityTracker.computeCurrentVelocity(1000, this.mMaximumVelocity);
                        this.mCurrentVelocity = (int) this.mVelocityTracker.getYVelocity();
                        startFlingIfNeed(0.0f);
                        this.mVelocityTracker.clear();
                        this.mDragDirection = 'n';
                        motionEvent2 = this.mFalsifyEvent;
                        if (motionEvent2 != null) {
                            motionEvent2.recycle();
                            this.mFalsifyEvent = null;
                            long eventTime2 = motionEvent.getEventTime();
                            MotionEvent motionEventObtain4 = MotionEvent.obtain(eventTime2, eventTime2, actionMasked, this.mTouchX, f6, 0);
                            super.dispatchTouchEvent(motionEventObtain4);
                            motionEventObtain4.recycle();
                        }
                        overSpinner();
                        if (this.mIsBeingDragged) {
                            this.mIsBeingDragged = false;
                            return true;
                        }
                        return super.dispatchTouchEvent(motionEvent);
                    }
                }
                return false;
            }
            RefreshState refreshState7 = this.mState;
            if ((!refreshState7.isOpening && !refreshState7.isFinishing) || !refreshState7.isHeader) {
                if (this.mFooterNeedTouchEventWhenLoading) {
                    refreshState6 = this.mState;
                    if (refreshState6.isOpening) {
                        if (refreshState6.isFinishing) {
                        }
                    }
                }
                if (!interceptAnimatorByAction(actionMasked)) {
                    refreshState = this.mState;
                    if (!refreshState.isFinishing && ((refreshState != (refreshState2 = RefreshState.Loading) || !this.mDisableContentWhenLoading) && (refreshState != RefreshState.Refreshing || !this.mDisableContentWhenRefresh))) {
                        if (actionMasked != 0) {
                            this.mCurrentVelocity = 0;
                            this.mVelocityTracker.addMovement(motionEvent);
                            this.mScroller.forceFinished(true);
                            this.mTouchX = f5;
                            this.mTouchY = f6;
                            this.mLastSpinner = 0;
                            this.mTouchSpinner = this.mSpinner;
                            this.mIsBeingDragged = false;
                            this.mEnableDisallowIntercept = false;
                            this.mSuperDispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
                            if (this.mState == RefreshState.TwoLevel) {
                                int measuredHeight2 = getMeasuredHeight();
                                f = this.mFloorBottomDragLayoutRate;
                                if (f > 1.0f && this.mTouchY < measuredHeight2 * (1.0f - f)) {
                                    this.mDragDirection = 'h';
                                    return this.mSuperDispatchTouchEvent;
                                }
                                if (f > 1.0f && this.mTouchY < measuredHeight2 - f) {
                                    this.mDragDirection = 'h';
                                    return this.mSuperDispatchTouchEvent;
                                }
                            }
                            refreshContent = this.mRefreshContent;
                            if (refreshContent != null) {
                                refreshContent.onActionDown(motionEvent);
                            }
                            return true;
                        }
                        if (actionMasked != 1) {
                            if (actionMasked != 2) {
                                f2 = f5 - this.mTouchX;
                                f3 = f6 - this.mTouchY;
                                this.mVelocityTracker.addMovement(motionEvent);
                                if (!this.mIsBeingDragged && !this.mEnableDisallowIntercept && (c2 = this.mDragDirection) != 'h' && this.mRefreshContent != null) {
                                    if (c2 != 'v' || (Math.abs(f3) >= this.mTouchSlop && Math.abs(f2) < Math.abs(f3))) {
                                        this.mDragDirection = 'v';
                                        if (f3 <= 0.0f && (this.mSpinner < 0 || ((this.mEnableOverScrollDrag || this.mEnableRefresh) && this.mRefreshContent.canRefresh()))) {
                                            this.mIsBeingDragged = true;
                                            this.mTouchY = f6 - this.mTouchSlop;
                                        } else if (f3 < 0.0f && (this.mSpinner > 0 || ((this.mEnableOverScrollDrag || this.mEnableLoadMore) && ((this.mState == refreshState2 && this.mFooterLocked) || this.mRefreshContent.canLoadMore())))) {
                                            this.mIsBeingDragged = true;
                                            this.mTouchY = this.mTouchSlop + f6;
                                        }
                                        if (this.mIsBeingDragged) {
                                            f3 = f6 - this.mTouchY;
                                            if (this.mSuperDispatchTouchEvent) {
                                                motionEvent.setAction(3);
                                                super.dispatchTouchEvent(motionEvent);
                                            }
                                            RefreshKernel refreshKernel3 = this.mKernel;
                                            i2 = this.mSpinner;
                                            if (i2 <= 0 || (i2 == 0 && f3 > 0.0f)) {
                                                refreshState5 = RefreshState.PullDownToRefresh;
                                            } else {
                                                refreshState5 = RefreshState.PullUpToLoad;
                                            }
                                            refreshKernel3.setState(refreshState5);
                                            parent = getParent();
                                            if (parent instanceof ViewGroup) {
                                                ((ViewGroup) parent).requestDisallowInterceptTouchEvent(true);
                                            }
                                        }
                                    } else if (Math.abs(f2) >= this.mTouchSlop && Math.abs(f2) > Math.abs(f3) && this.mDragDirection != 'v') {
                                        this.mDragDirection = 'h';
                                    }
                                }
                                if (this.mIsBeingDragged) {
                                    i = ((int) f3) + this.mTouchSpinner;
                                    refreshState3 = this.mViceState;
                                    if ((refreshState3.isHeader && (i < 0 || this.mLastSpinner < 0)) || (refreshState3.isFooter && (i > 0 || this.mLastSpinner > 0))) {
                                        this.mLastSpinner = i;
                                        eventTime = motionEvent.getEventTime();
                                        if (this.mFalsifyEvent == null) {
                                            MotionEvent motionEventObtain5 = MotionEvent.obtain(eventTime, eventTime, 0, this.mTouchX + f2, this.mTouchY, 0);
                                            this.mFalsifyEvent = motionEventObtain5;
                                            super.dispatchTouchEvent(motionEventObtain5);
                                        }
                                        motionEventObtain = MotionEvent.obtain(eventTime, eventTime, 2, this.mTouchX + f2, this.mTouchY + i, 0);
                                        super.dispatchTouchEvent(motionEventObtain);
                                        if (this.mFooterLocked && f3 > this.mTouchSlop && this.mSpinner < 0) {
                                            this.mFooterLocked = false;
                                        }
                                        if (i <= 0 && ((this.mEnableOverScrollDrag || this.mEnableRefresh) && this.mRefreshContent.canRefresh())) {
                                            this.mLastTouchY = f6;
                                            this.mTouchY = f6;
                                            this.mTouchSpinner = 0;
                                            this.mKernel.setState(RefreshState.PullDownToRefresh);
                                        } else if (i < 0 || !((this.mEnableOverScrollDrag || this.mEnableLoadMore) && this.mRefreshContent.canLoadMore())) {
                                            i3 = i;
                                        } else {
                                            this.mLastTouchY = f6;
                                            this.mTouchY = f6;
                                            this.mTouchSpinner = 0;
                                            this.mKernel.setState(RefreshState.PullUpToLoad);
                                        }
                                        refreshState4 = this.mViceState;
                                        if ((!refreshState4.isHeader && i3 < 0) || (refreshState4.isFooter && i3 > 0)) {
                                            if (this.mSpinner != 0) {
                                                moveSpinnerInfinitely(0.0f);
                                            }
                                            return true;
                                        }
                                        if (this.mFalsifyEvent != null) {
                                            this.mFalsifyEvent = null;
                                            motionEventObtain.setAction(3);
                                            super.dispatchTouchEvent(motionEventObtain);
                                        }
                                        motionEventObtain.recycle();
                                        i = i3;
                                    }
                                    moveSpinnerInfinitely(i);
                                    return true;
                                }
                                if (this.mFooterLocked && f3 > this.mTouchSlop && this.mSpinner < 0) {
                                    this.mFooterLocked = false;
                                }
                            } else if (actionMasked == 3) {
                            }
                            return super.dispatchTouchEvent(motionEvent);
                        }
                        this.mVelocityTracker.addMovement(motionEvent);
                        this.mVelocityTracker.computeCurrentVelocity(1000, this.mMaximumVelocity);
                        this.mCurrentVelocity = (int) this.mVelocityTracker.getYVelocity();
                        startFlingIfNeed(0.0f);
                        this.mVelocityTracker.clear();
                        this.mDragDirection = 'n';
                        motionEvent2 = this.mFalsifyEvent;
                        if (motionEvent2 != null) {
                            motionEvent2.recycle();
                            this.mFalsifyEvent = null;
                            long eventTime3 = motionEvent.getEventTime();
                            MotionEvent motionEventObtain6 = MotionEvent.obtain(eventTime3, eventTime3, actionMasked, this.mTouchX, f6, 0);
                            super.dispatchTouchEvent(motionEventObtain6);
                            motionEventObtain6.recycle();
                        }
                        overSpinner();
                        if (this.mIsBeingDragged) {
                            this.mIsBeingDragged = false;
                            return true;
                        }
                        return super.dispatchTouchEvent(motionEvent);
                    }
                }
                return false;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j2) {
        Paint paint;
        Paint paint2;
        RefreshContent refreshContent = this.mRefreshContent;
        View view2 = refreshContent != null ? refreshContent.getView() : null;
        RefreshInternal refreshInternal = this.mRefreshHeader;
        if (refreshInternal != null && refreshInternal.getView() == view) {
            if (!isEnableRefreshOrLoadMore(this.mEnableRefresh) || (!this.mEnablePreviewInEditMode && isInEditMode())) {
                return true;
            }
            if (view2 != null) {
                int iMax = Math.max(view2.getTop() + view2.getPaddingTop() + this.mSpinner, view.getTop());
                int i = this.mHeaderBackgroundColor;
                if (i != 0 && (paint2 = this.mPaint) != null) {
                    paint2.setColor(i);
                    if (this.mRefreshHeader.getSpinnerStyle().scale) {
                        iMax = view.getBottom();
                    } else if (this.mRefreshHeader.getSpinnerStyle() == SpinnerStyle.Translate) {
                        iMax = view.getBottom() + this.mSpinner;
                    }
                    canvas.drawRect(0.0f, view.getTop(), getWidth(), iMax, this.mPaint);
                }
                if ((this.mEnableClipHeaderWhenFixedBehind && this.mRefreshHeader.getSpinnerStyle() == SpinnerStyle.FixedBehind) || this.mRefreshHeader.getSpinnerStyle().scale) {
                    canvas.save();
                    canvas.clipRect(view.getLeft(), view.getTop(), view.getRight(), iMax);
                    boolean zDrawChild = super.drawChild(canvas, view, j2);
                    canvas.restore();
                    return zDrawChild;
                }
            }
        }
        RefreshInternal refreshInternal2 = this.mRefreshFooter;
        if (refreshInternal2 != null && refreshInternal2.getView() == view) {
            if (!isEnableRefreshOrLoadMore(this.mEnableLoadMore) || (!this.mEnablePreviewInEditMode && isInEditMode())) {
                return true;
            }
            if (view2 != null) {
                int iMin = Math.min((view2.getBottom() - view2.getPaddingBottom()) + this.mSpinner, view.getBottom());
                int i2 = this.mFooterBackgroundColor;
                if (i2 != 0 && (paint = this.mPaint) != null) {
                    paint.setColor(i2);
                    if (this.mRefreshFooter.getSpinnerStyle().scale) {
                        iMin = view.getTop();
                    } else if (this.mRefreshFooter.getSpinnerStyle() == SpinnerStyle.Translate) {
                        iMin = view.getTop() + this.mSpinner;
                    }
                    canvas.drawRect(0.0f, iMin, getWidth(), view.getBottom(), this.mPaint);
                }
                if ((this.mEnableClipFooterWhenFixedBehind && this.mRefreshFooter.getSpinnerStyle() == SpinnerStyle.FixedBehind) || this.mRefreshFooter.getSpinnerStyle().scale) {
                    canvas.save();
                    canvas.clipRect(view.getLeft(), iMin, view.getRight(), view.getBottom());
                    boolean zDrawChild2 = super.drawChild(canvas, view, j2);
                    canvas.restore();
                    return zDrawChild2;
                }
            }
        }
        return super.drawChild(canvas, view, j2);
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshLayout
    public RefreshLayout finishLoadMore() {
        return finishLoadMore(true);
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshLayout
    public RefreshLayout finishLoadMoreWithNoMoreData() {
        return finishLoadMore(Math.min(Math.max(0, 300 - ((int) (System.currentTimeMillis() - this.mLastOpenTime))), 300) << 16, true, true);
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshLayout
    public RefreshLayout finishRefresh() {
        return finishRefresh(true);
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshLayout
    public RefreshLayout finishRefreshWithNoMoreData() {
        return finishRefresh(Math.min(Math.max(0, 300 - ((int) (System.currentTimeMillis() - this.mLastOpenTime))), 300) << 16, true, Boolean.TRUE);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshLayout
    @NonNull
    public ViewGroup getLayout() {
        return this;
    }

    @Override // android.view.ViewGroup, androidx.core.view.NestedScrollingParent
    public int getNestedScrollAxes() {
        return this.mNestedParent.getNestedScrollAxes();
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshLayout
    @Nullable
    public RefreshFooter getRefreshFooter() {
        RefreshInternal refreshInternal = this.mRefreshFooter;
        if (refreshInternal instanceof RefreshFooter) {
            return (RefreshFooter) refreshInternal;
        }
        return null;
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshLayout
    @Nullable
    public RefreshHeader getRefreshHeader() {
        RefreshInternal refreshInternal = this.mRefreshHeader;
        if (refreshInternal instanceof RefreshHeader) {
            return (RefreshHeader) refreshInternal;
        }
        return null;
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshLayout
    @NonNull
    public RefreshState getState() {
        return this.mState;
    }

    public boolean interceptAnimatorByAction(int i) {
        if (i == 0) {
            if (this.reboundAnimator != null) {
                RefreshState refreshState = this.mState;
                if (refreshState.isFinishing || refreshState == RefreshState.TwoLevelReleased || refreshState == RefreshState.RefreshReleased || refreshState == RefreshState.LoadReleased) {
                    return true;
                }
                if (refreshState == RefreshState.PullDownCanceled) {
                    this.mKernel.setState(RefreshState.PullDownToRefresh);
                } else if (refreshState == RefreshState.PullUpCanceled) {
                    this.mKernel.setState(RefreshState.PullUpToLoad);
                }
                this.reboundAnimator.setDuration(0L);
                this.reboundAnimator.cancel();
                this.reboundAnimator = null;
            }
            this.animationRunnable = null;
        }
        return this.reboundAnimator != null;
    }

    public boolean isEnableRefreshOrLoadMore(boolean z) {
        return z && !this.mEnablePureScrollMode;
    }

    public boolean isEnableTranslationContent(boolean z, RefreshInternal refreshInternal) {
        return z || this.mEnablePureScrollMode || refreshInternal == null || refreshInternal.getSpinnerStyle() == SpinnerStyle.FixedBehind;
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return this.mEnableNestedScrolling && (this.mEnableOverScrollDrag || this.mEnableRefresh || this.mEnableLoadMore);
    }

    public void moveSpinnerInfinitely(float f) {
        RefreshState refreshState;
        if (this.mNestedInProgress && !this.mEnableLoadMoreWhenContentNotFull && f < 0.0f && !this.mRefreshContent.canLoadMore()) {
            f = 0.0f;
        }
        RefreshState refreshState2 = this.mState;
        if (refreshState2 == RefreshState.TwoLevel && f > 0.0f && this.mRefreshContent != null) {
            int measuredHeight = getMeasuredHeight();
            float f2 = this.mFloorOpenLayoutRate;
            this.mKernel.moveSpinner(Math.min((int) f, f2 > 1.0f ? (int) f2 : (int) (measuredHeight * f2)), true);
        } else if (refreshState2 == RefreshState.Refreshing && f >= 0.0f) {
            int i = this.mHeaderHeight;
            if (f < i) {
                this.mKernel.moveSpinner((int) f, true);
            } else {
                float f3 = (this.mHeaderMaxDragRate - 1.0f) * i;
                int iMax = Math.max((this.mScreenHeightPixels * 4) / 3, getHeight());
                int i2 = this.mHeaderHeight;
                float f4 = iMax - i2;
                float fMax = Math.max(0.0f, (f - i2) * this.mDragRate);
                float f5 = -fMax;
                if (f4 == 0.0f) {
                    f4 = 1.0f;
                }
                this.mKernel.moveSpinner(((int) Math.min(f3 * (1.0f - ((float) Math.pow(100.0d, f5 / f4))), fMax)) + this.mHeaderHeight, true);
            }
        } else if (f < 0.0f && (refreshState2 == RefreshState.Loading || ((this.mEnableFooterFollowWhenNoMoreData && this.mFooterNoMoreData && this.mFooterNoMoreDataEffective && isEnableRefreshOrLoadMore(this.mEnableLoadMore)) || (this.mEnableAutoLoadMore && !this.mFooterNoMoreData && isEnableRefreshOrLoadMore(this.mEnableLoadMore))))) {
            int i3 = this.mFooterHeight;
            if (f > (-i3)) {
                this.mKernel.moveSpinner((int) f, true);
            } else {
                float f6 = (this.mFooterMaxDragRate - 1.0f) * i3;
                int iMax2 = Math.max((this.mScreenHeightPixels * 4) / 3, getHeight());
                int i4 = this.mFooterHeight;
                float f7 = iMax2 - i4;
                float f8 = -Math.min(0.0f, (i4 + f) * this.mDragRate);
                float f9 = -f8;
                if (f7 == 0.0f) {
                    f7 = 1.0f;
                }
                this.mKernel.moveSpinner(((int) (-Math.min(f6 * (1.0f - ((float) Math.pow(100.0d, f9 / f7))), f8))) - this.mFooterHeight, true);
            }
        } else if (f >= 0.0f) {
            float f10 = this.mHeaderMaxDragRate * this.mHeaderHeight;
            float fMax2 = Math.max(this.mScreenHeightPixels / 2, getHeight());
            float fMax3 = Math.max(0.0f, this.mDragRate * f);
            float f11 = -fMax3;
            if (fMax2 == 0.0f) {
                fMax2 = 1.0f;
            }
            this.mKernel.moveSpinner((int) Math.min(f10 * (1.0f - ((float) Math.pow(100.0d, f11 / fMax2))), fMax3), true);
        } else {
            float f12 = this.mFooterMaxDragRate * this.mFooterHeight;
            float fMax4 = Math.max(this.mScreenHeightPixels / 2, getHeight());
            float f13 = -Math.min(0.0f, this.mDragRate * f);
            float f14 = -f13;
            if (fMax4 == 0.0f) {
                fMax4 = 1.0f;
            }
            this.mKernel.moveSpinner((int) (-Math.min(f12 * (1.0f - ((float) Math.pow(100.0d, f14 / fMax4))), f13)), true);
        }
        if (!this.mEnableAutoLoadMore || this.mFooterNoMoreData || !isEnableRefreshOrLoadMore(this.mEnableLoadMore) || f >= 0.0f || (refreshState = this.mState) == RefreshState.Refreshing || refreshState == RefreshState.Loading || refreshState == RefreshState.LoadFinish) {
            return;
        }
        if (this.mDisableContentWhenLoading) {
            this.animationRunnable = null;
            this.mKernel.animSpinner(-this.mFooterHeight);
        }
        setStateDirectLoading(false);
        this.mHandler.postDelayed(new Runnable() { // from class: com.scwang.smartrefresh.layout.SmartRefreshLayout.5
            @Override // java.lang.Runnable
            public void run() {
                SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
                OnLoadMoreListener onLoadMoreListener = smartRefreshLayout.mLoadMoreListener;
                if (onLoadMoreListener != null) {
                    onLoadMoreListener.onLoadMore(smartRefreshLayout);
                } else if (smartRefreshLayout.mOnMultiPurposeListener == null) {
                    smartRefreshLayout.finishLoadMore(2000);
                }
                SmartRefreshLayout smartRefreshLayout2 = SmartRefreshLayout.this;
                OnMultiPurposeListener onMultiPurposeListener = smartRefreshLayout2.mOnMultiPurposeListener;
                if (onMultiPurposeListener != null) {
                    onMultiPurposeListener.onLoadMore(smartRefreshLayout2);
                }
            }
        }, this.mReboundDuration);
    }

    public void notifyStateChanged(RefreshState refreshState) {
        RefreshState refreshState2 = this.mState;
        if (refreshState2 == refreshState) {
            if (this.mViceState != refreshState2) {
                this.mViceState = refreshState2;
                return;
            }
            return;
        }
        this.mState = refreshState;
        this.mViceState = refreshState;
        RefreshInternal refreshInternal = this.mRefreshHeader;
        RefreshInternal refreshInternal2 = this.mRefreshFooter;
        OnMultiPurposeListener onMultiPurposeListener = this.mOnMultiPurposeListener;
        if (refreshInternal != null) {
            refreshInternal.onStateChanged(this, refreshState2, refreshState);
        }
        if (refreshInternal2 != null) {
            refreshInternal2.onStateChanged(this, refreshState2, refreshState);
        }
        if (onMultiPurposeListener != null) {
            onMultiPurposeListener.onStateChanged(this, refreshState2, refreshState);
        }
        if (refreshState == RefreshState.LoadFinish) {
            this.mFooterLocked = false;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        RefreshInternal refreshInternal;
        super.onAttachedToWindow();
        boolean z = true;
        this.mAttachedToWindow = true;
        if (!isInEditMode()) {
            if (this.mRefreshHeader == null) {
                DefaultRefreshHeaderCreator defaultRefreshHeaderCreator = sHeaderCreator;
                if (defaultRefreshHeaderCreator != null) {
                    RefreshHeader refreshHeaderCreateRefreshHeader = defaultRefreshHeaderCreator.createRefreshHeader(getContext(), this);
                    if (refreshHeaderCreateRefreshHeader == null) {
                        throw new RuntimeException("DefaultRefreshHeaderCreator can not return null");
                    }
                    setRefreshHeader(refreshHeaderCreateRefreshHeader);
                } else {
                    setRefreshHeader(new BezierRadarHeader(getContext()));
                }
            }
            if (this.mRefreshFooter == null) {
                DefaultRefreshFooterCreator defaultRefreshFooterCreator = sFooterCreator;
                if (defaultRefreshFooterCreator != null) {
                    RefreshFooter refreshFooterCreateRefreshFooter = defaultRefreshFooterCreator.createRefreshFooter(getContext(), this);
                    if (refreshFooterCreateRefreshFooter == null) {
                        throw new RuntimeException("DefaultRefreshFooterCreator can not return null");
                    }
                    setRefreshFooter(refreshFooterCreateRefreshFooter);
                } else {
                    boolean z2 = this.mEnableLoadMore;
                    setRefreshFooter(new BallPulseFooter(getContext()));
                    this.mEnableLoadMore = z2;
                }
            } else {
                if (!this.mEnableLoadMore && this.mManualLoadMore) {
                    z = false;
                }
                this.mEnableLoadMore = z;
            }
            if (this.mRefreshContent == null) {
                int childCount = getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = getChildAt(i);
                    RefreshInternal refreshInternal2 = this.mRefreshHeader;
                    if ((refreshInternal2 == null || childAt != refreshInternal2.getView()) && ((refreshInternal = this.mRefreshFooter) == null || childAt != refreshInternal.getView())) {
                        this.mRefreshContent = new RefreshContentWrapper(childAt);
                    }
                }
            }
            if (this.mRefreshContent == null) {
                int iDp2px = SmartUtil.dp2px(20.0f);
                TextView textView = new TextView(getContext());
                textView.setTextColor(-39424);
                textView.setGravity(17);
                textView.setTextSize(20.0f);
                textView.setText(R.string.srl_content_empty);
                super.addView(textView, 0, new LayoutParams(-1, -1));
                RefreshContentWrapper refreshContentWrapper = new RefreshContentWrapper(textView);
                this.mRefreshContent = refreshContentWrapper;
                refreshContentWrapper.getView().setPadding(iDp2px, iDp2px, iDp2px, iDp2px);
            }
            View viewFindViewById = findViewById(this.mFixedHeaderViewId);
            View viewFindViewById2 = findViewById(this.mFixedFooterViewId);
            this.mRefreshContent.setScrollBoundaryDecider(this.mScrollBoundaryDecider);
            this.mRefreshContent.setEnableLoadMoreWhenContentNotFull(this.mEnableLoadMoreWhenContentNotFull);
            this.mRefreshContent.setUpComponent(this.mKernel, viewFindViewById, viewFindViewById2);
            if (this.mSpinner != 0) {
                notifyStateChanged(RefreshState.None);
                RefreshContent refreshContent = this.mRefreshContent;
                this.mSpinner = 0;
                refreshContent.moveSpinner(0, this.mHeaderTranslationViewId, this.mFooterTranslationViewId);
            }
        }
        int[] iArr = this.mPrimaryColors;
        if (iArr != null) {
            RefreshInternal refreshInternal3 = this.mRefreshHeader;
            if (refreshInternal3 != null) {
                refreshInternal3.setPrimaryColors(iArr);
            }
            RefreshInternal refreshInternal4 = this.mRefreshFooter;
            if (refreshInternal4 != null) {
                refreshInternal4.setPrimaryColors(this.mPrimaryColors);
            }
        }
        RefreshContent refreshContent2 = this.mRefreshContent;
        if (refreshContent2 != null) {
            super.bringChildToFront(refreshContent2.getView());
        }
        RefreshInternal refreshInternal5 = this.mRefreshHeader;
        if (refreshInternal5 != null && refreshInternal5.getSpinnerStyle().front) {
            super.bringChildToFront(this.mRefreshHeader.getView());
        }
        RefreshInternal refreshInternal6 = this.mRefreshFooter;
        if (refreshInternal6 == null || !refreshInternal6.getSpinnerStyle().front) {
            return;
        }
        super.bringChildToFront(this.mRefreshFooter.getView());
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.mAttachedToWindow = false;
        this.mManualLoadMore = true;
        this.animationRunnable = null;
        ValueAnimator valueAnimator = this.reboundAnimator;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.reboundAnimator.removeAllUpdateListeners();
            this.reboundAnimator.setDuration(0L);
            this.reboundAnimator.cancel();
            this.reboundAnimator = null;
        }
        RefreshInternal refreshInternal = this.mRefreshHeader;
        if (refreshInternal != null && this.mState == RefreshState.Refreshing) {
            refreshInternal.onFinish(this, false);
        }
        RefreshInternal refreshInternal2 = this.mRefreshFooter;
        if (refreshInternal2 != null && this.mState == RefreshState.Loading) {
            refreshInternal2.onFinish(this, false);
        }
        if (this.mSpinner != 0) {
            this.mKernel.moveSpinner(0, true);
        }
        RefreshState refreshState = this.mState;
        RefreshState refreshState2 = RefreshState.None;
        if (refreshState != refreshState2) {
            notifyStateChanged(refreshState2);
        }
        Handler handler = this.mHandler;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        this.mFooterLocked = false;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x004d  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View
    public void onFinishInflate() {
        int i;
        int i2;
        super.onFinishInflate();
        int childCount = super.getChildCount();
        if (childCount > 3) {
            throw new RuntimeException("最多只支持3个子View，Most only support three sub view");
        }
        int i3 = -1;
        int i4 = 0;
        char c2 = 0;
        while (true) {
            if (i4 >= childCount) {
                break;
            }
            View childAt = super.getChildAt(i4);
            if (SmartUtil.isContentView(childAt) && (c2 < 2 || i4 == 1)) {
                i3 = i4;
                c2 = 2;
            } else if (!(childAt instanceof RefreshInternal) && c2 < 1) {
                c2 = i4 > 0 ? (char) 1 : (char) 0;
                i3 = i4;
            }
            i4++;
        }
        if (i3 >= 0) {
            this.mRefreshContent = new RefreshContentWrapper(super.getChildAt(i3));
            if (i3 == 1) {
                i2 = childCount != 3 ? -1 : 2;
                i = 0;
            } else if (childCount == 2) {
                i = -1;
                i2 = 1;
            } else {
                i = -1;
                i2 = -1;
            }
        } else {
            i = -1;
            i2 = -1;
        }
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt2 = super.getChildAt(i5);
            if (i5 == i || (i5 != i2 && i == -1 && this.mRefreshHeader == null && (childAt2 instanceof RefreshHeader))) {
                this.mRefreshHeader = childAt2 instanceof RefreshHeader ? (RefreshHeader) childAt2 : new RefreshHeaderWrapper(childAt2);
            } else if (i5 == i2 || (i2 == -1 && (childAt2 instanceof RefreshFooter))) {
                this.mEnableLoadMore = this.mEnableLoadMore || !this.mManualLoadMore;
                this.mRefreshFooter = childAt2 instanceof RefreshFooter ? (RefreshFooter) childAt2 : new RefreshFooterWrapper(childAt2);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int iMax;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        getPaddingBottom();
        int childCount = super.getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = super.getChildAt(i5);
            if (childAt.getVisibility() != 8 && childAt.getTag(R.string.srl_component_falsify) != childAt) {
                RefreshContent refreshContent = this.mRefreshContent;
                if (refreshContent != null && refreshContent.getView() == childAt) {
                    boolean z2 = isInEditMode() && this.mEnablePreviewInEditMode && isEnableRefreshOrLoadMore(this.mEnableRefresh) && this.mRefreshHeader != null;
                    View view = this.mRefreshContent.getView();
                    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : sDefaultMarginLP;
                    int i6 = marginLayoutParams.leftMargin + paddingLeft;
                    int i7 = marginLayoutParams.topMargin + paddingTop;
                    int measuredWidth = view.getMeasuredWidth() + i6;
                    int measuredHeight = view.getMeasuredHeight() + i7;
                    if (z2 && isEnableTranslationContent(this.mEnableHeaderTranslationContent, this.mRefreshHeader)) {
                        int i8 = this.mHeaderHeight;
                        i7 += i8;
                        measuredHeight += i8;
                    }
                    view.layout(i6, i7, measuredWidth, measuredHeight);
                }
                RefreshInternal refreshInternal = this.mRefreshHeader;
                if (refreshInternal != null && refreshInternal.getView() == childAt) {
                    boolean z3 = isInEditMode() && this.mEnablePreviewInEditMode && isEnableRefreshOrLoadMore(this.mEnableRefresh);
                    View view2 = this.mRefreshHeader.getView();
                    ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : sDefaultMarginLP;
                    int i9 = marginLayoutParams2.leftMargin;
                    int i10 = marginLayoutParams2.topMargin + this.mHeaderInsetStart;
                    int measuredWidth2 = view2.getMeasuredWidth() + i9;
                    int measuredHeight2 = view2.getMeasuredHeight() + i10;
                    if (!z3 && this.mRefreshHeader.getSpinnerStyle() == SpinnerStyle.Translate) {
                        int i11 = this.mHeaderHeight;
                        i10 -= i11;
                        measuredHeight2 -= i11;
                    }
                    view2.layout(i9, i10, measuredWidth2, measuredHeight2);
                }
                RefreshInternal refreshInternal2 = this.mRefreshFooter;
                if (refreshInternal2 != null && refreshInternal2.getView() == childAt) {
                    boolean z4 = isInEditMode() && this.mEnablePreviewInEditMode && isEnableRefreshOrLoadMore(this.mEnableLoadMore);
                    View view3 = this.mRefreshFooter.getView();
                    ViewGroup.LayoutParams layoutParams3 = view3.getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams3 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams3 : sDefaultMarginLP;
                    SpinnerStyle spinnerStyle = this.mRefreshFooter.getSpinnerStyle();
                    int i12 = marginLayoutParams3.leftMargin;
                    int measuredHeight3 = (marginLayoutParams3.topMargin + getMeasuredHeight()) - this.mFooterInsetStart;
                    if (this.mFooterNoMoreData && this.mFooterNoMoreDataEffective && this.mEnableFooterFollowWhenNoMoreData && this.mRefreshContent != null && this.mRefreshFooter.getSpinnerStyle() == SpinnerStyle.Translate && isEnableRefreshOrLoadMore(this.mEnableLoadMore)) {
                        View view4 = this.mRefreshContent.getView();
                        ViewGroup.LayoutParams layoutParams4 = view4.getLayoutParams();
                        measuredHeight3 = view4.getMeasuredHeight() + paddingTop + paddingTop + (layoutParams4 instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams4).topMargin : 0);
                    }
                    if (spinnerStyle == SpinnerStyle.MatchLayout) {
                        measuredHeight3 = marginLayoutParams3.topMargin - this.mFooterInsetStart;
                    } else {
                        if (z4 || spinnerStyle == SpinnerStyle.FixedFront || spinnerStyle == SpinnerStyle.FixedBehind) {
                            iMax = this.mFooterHeight;
                        } else if (spinnerStyle.scale && this.mSpinner < 0) {
                            iMax = Math.max(isEnableRefreshOrLoadMore(this.mEnableLoadMore) ? -this.mSpinner : 0, 0);
                        }
                        measuredHeight3 -= iMax;
                    }
                    view3.layout(i12, measuredHeight3, view3.getMeasuredWidth() + i12, view3.getMeasuredHeight() + measuredHeight3);
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:109:0x020c  */
    /* JADX WARN: Code duplicated, block: B:112:0x0225  */
    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        int iMax;
        DimensionStatus dimensionStatus;
        int i4;
        int i5;
        boolean z = isInEditMode() && this.mEnablePreviewInEditMode;
        int childCount = super.getChildCount();
        int measuredHeight = 0;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = super.getChildAt(i6);
            if (childAt.getVisibility() != 8 && childAt.getTag(R.string.srl_component_falsify) != childAt) {
                RefreshInternal refreshInternal = this.mRefreshHeader;
                if (refreshInternal != null && refreshInternal.getView() == childAt) {
                    View view = this.mRefreshHeader.getView();
                    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : sDefaultMarginLP;
                    int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, marginLayoutParams.leftMargin + marginLayoutParams.rightMargin, layoutParams.width);
                    int iMax2 = this.mHeaderHeight;
                    DimensionStatus dimensionStatus2 = this.mHeaderHeightStatus;
                    if (dimensionStatus2.ordinal < DimensionStatus.XmlLayoutUnNotify.ordinal) {
                        int i7 = layoutParams.height;
                        if (i7 > 0) {
                            int i8 = i7 + marginLayoutParams.bottomMargin + marginLayoutParams.topMargin;
                            DimensionStatus dimensionStatus3 = DimensionStatus.XmlExactUnNotify;
                            if (dimensionStatus2.canReplaceWith(dimensionStatus3)) {
                                this.mHeaderHeight = layoutParams.height + marginLayoutParams.bottomMargin + marginLayoutParams.topMargin;
                                this.mHeaderHeightStatus = dimensionStatus3;
                            }
                            iMax2 = i8;
                        } else if (i7 == -2 && (this.mRefreshHeader.getSpinnerStyle() != SpinnerStyle.MatchLayout || !this.mHeaderHeightStatus.notified)) {
                            int iMax3 = Math.max((View.MeasureSpec.getSize(i2) - marginLayoutParams.bottomMargin) - marginLayoutParams.topMargin, 0);
                            view.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(iMax3, Integer.MIN_VALUE));
                            int measuredHeight2 = view.getMeasuredHeight();
                            if (measuredHeight2 > 0) {
                                if (measuredHeight2 != iMax3) {
                                    DimensionStatus dimensionStatus4 = this.mHeaderHeightStatus;
                                    DimensionStatus dimensionStatus5 = DimensionStatus.XmlWrapUnNotify;
                                    if (dimensionStatus4.canReplaceWith(dimensionStatus5)) {
                                        this.mHeaderHeight = measuredHeight2 + marginLayoutParams.bottomMargin + marginLayoutParams.topMargin;
                                        this.mHeaderHeightStatus = dimensionStatus5;
                                    }
                                }
                                iMax2 = -1;
                            }
                        }
                    }
                    if (this.mRefreshHeader.getSpinnerStyle() == SpinnerStyle.MatchLayout) {
                        iMax2 = View.MeasureSpec.getSize(i2);
                        i5 = -1;
                        i4 = 0;
                    } else {
                        if (!this.mRefreshHeader.getSpinnerStyle().scale || z) {
                            i4 = 0;
                        } else {
                            i4 = 0;
                            iMax2 = Math.max(0, isEnableRefreshOrLoadMore(this.mEnableRefresh) ? this.mSpinner : 0);
                        }
                        i5 = -1;
                    }
                    if (iMax2 != i5) {
                        view.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(Math.max((iMax2 - marginLayoutParams.bottomMargin) - marginLayoutParams.topMargin, i4), 1073741824));
                    }
                    DimensionStatus dimensionStatus6 = this.mHeaderHeightStatus;
                    if (!dimensionStatus6.notified) {
                        this.mHeaderHeightStatus = dimensionStatus6.notified();
                        RefreshInternal refreshInternal2 = this.mRefreshHeader;
                        RefreshKernel refreshKernel = this.mKernel;
                        int i9 = this.mHeaderHeight;
                        refreshInternal2.onInitialized(refreshKernel, i9, (int) (this.mHeaderMaxDragRate * i9));
                    }
                    if (z && isEnableRefreshOrLoadMore(this.mEnableRefresh)) {
                        measuredHeight += view.getMeasuredHeight();
                    }
                }
                RefreshInternal refreshInternal3 = this.mRefreshFooter;
                if (refreshInternal3 == null || refreshInternal3.getView() != childAt) {
                    i3 = 0;
                } else {
                    View view2 = this.mRefreshFooter.getView();
                    ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : sDefaultMarginLP;
                    int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i, marginLayoutParams2.leftMargin + marginLayoutParams2.rightMargin, layoutParams2.width);
                    int i10 = this.mFooterHeight;
                    DimensionStatus dimensionStatus7 = this.mFooterHeightStatus;
                    if (dimensionStatus7.ordinal >= DimensionStatus.XmlLayoutUnNotify.ordinal) {
                        iMax = i10;
                    } else {
                        int i11 = layoutParams2.height;
                        if (i11 > 0) {
                            i10 = marginLayoutParams2.bottomMargin + i11 + marginLayoutParams2.topMargin;
                            DimensionStatus dimensionStatus8 = DimensionStatus.XmlExactUnNotify;
                            if (dimensionStatus7.canReplaceWith(dimensionStatus8)) {
                                this.mFooterHeight = layoutParams2.height + marginLayoutParams2.topMargin + marginLayoutParams2.bottomMargin;
                                this.mFooterHeightStatus = dimensionStatus8;
                            }
                        } else if (i11 == -2 && (this.mRefreshFooter.getSpinnerStyle() != SpinnerStyle.MatchLayout || !this.mFooterHeightStatus.notified)) {
                            int iMax4 = Math.max((View.MeasureSpec.getSize(i2) - marginLayoutParams2.bottomMargin) - marginLayoutParams2.topMargin, 0);
                            view2.measure(childMeasureSpec2, View.MeasureSpec.makeMeasureSpec(iMax4, Integer.MIN_VALUE));
                            int measuredHeight3 = view2.getMeasuredHeight();
                            if (measuredHeight3 > 0) {
                                if (measuredHeight3 != iMax4) {
                                    DimensionStatus dimensionStatus9 = this.mFooterHeightStatus;
                                    DimensionStatus dimensionStatus10 = DimensionStatus.XmlWrapUnNotify;
                                    if (dimensionStatus9.canReplaceWith(dimensionStatus10)) {
                                        this.mFooterHeight = measuredHeight3 + marginLayoutParams2.topMargin + marginLayoutParams2.bottomMargin;
                                        this.mFooterHeightStatus = dimensionStatus10;
                                    }
                                }
                                iMax = -1;
                            }
                        }
                        iMax = i10;
                    }
                    if (this.mRefreshFooter.getSpinnerStyle() == SpinnerStyle.MatchLayout) {
                        iMax = View.MeasureSpec.getSize(i2);
                    } else {
                        if (this.mRefreshFooter.getSpinnerStyle().scale && !z) {
                            i3 = 0;
                            iMax = Math.max(0, isEnableRefreshOrLoadMore(this.mEnableLoadMore) ? -this.mSpinner : 0);
                        }
                        if (iMax != -1) {
                            view2.measure(childMeasureSpec2, View.MeasureSpec.makeMeasureSpec(Math.max((iMax - marginLayoutParams2.bottomMargin) - marginLayoutParams2.topMargin, i3), 1073741824));
                        }
                        dimensionStatus = this.mFooterHeightStatus;
                        if (!dimensionStatus.notified) {
                            this.mFooterHeightStatus = dimensionStatus.notified();
                            RefreshInternal refreshInternal4 = this.mRefreshFooter;
                            RefreshKernel refreshKernel2 = this.mKernel;
                            int i12 = this.mFooterHeight;
                            refreshInternal4.onInitialized(refreshKernel2, i12, (int) (this.mFooterMaxDragRate * i12));
                        }
                        if (z && isEnableRefreshOrLoadMore(this.mEnableLoadMore)) {
                            measuredHeight += view2.getMeasuredHeight();
                        }
                    }
                    i3 = 0;
                    if (iMax != -1) {
                        view2.measure(childMeasureSpec2, View.MeasureSpec.makeMeasureSpec(Math.max((iMax - marginLayoutParams2.bottomMargin) - marginLayoutParams2.topMargin, i3), 1073741824));
                    }
                    dimensionStatus = this.mFooterHeightStatus;
                    if (!dimensionStatus.notified) {
                        this.mFooterHeightStatus = dimensionStatus.notified();
                        RefreshInternal refreshInternal5 = this.mRefreshFooter;
                        RefreshKernel refreshKernel3 = this.mKernel;
                        int i13 = this.mFooterHeight;
                        refreshInternal5.onInitialized(refreshKernel3, i13, (int) (this.mFooterMaxDragRate * i13));
                    }
                    if (z) {
                        measuredHeight += view2.getMeasuredHeight();
                    }
                }
                RefreshContent refreshContent = this.mRefreshContent;
                if (refreshContent != null && refreshContent.getView() == childAt) {
                    View view3 = this.mRefreshContent.getView();
                    ViewGroup.LayoutParams layoutParams3 = view3.getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams3 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams3 : sDefaultMarginLP;
                    view3.measure(ViewGroup.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + marginLayoutParams3.leftMargin + marginLayoutParams3.rightMargin, layoutParams3.width), ViewGroup.getChildMeasureSpec(i2, getPaddingTop() + getPaddingBottom() + marginLayoutParams3.topMargin + marginLayoutParams3.bottomMargin + ((!z || ((this.mRefreshHeader == null || !isEnableRefreshOrLoadMore(this.mEnableRefresh) || !isEnableTranslationContent(this.mEnableHeaderTranslationContent, this.mRefreshHeader)) ? i3 : 1) == 0) ? i3 : this.mHeaderHeight) + ((!z || ((this.mRefreshFooter == null || !isEnableRefreshOrLoadMore(this.mEnableLoadMore) || !isEnableTranslationContent(this.mEnableFooterTranslationContent, this.mRefreshFooter)) ? i3 : 1) == 0) ? i3 : this.mFooterHeight), layoutParams3.height));
                    measuredHeight += view3.getMeasuredHeight();
                }
            }
        }
        super.setMeasuredDimension(View.resolveSize(super.getSuggestedMinimumWidth(), i), View.resolveSize(measuredHeight, i2));
        this.mLastTouchX = getMeasuredWidth() / 2.0f;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public boolean onNestedFling(@NonNull View view, float f, float f2, boolean z) {
        return this.mNestedChild.dispatchNestedFling(f, f2, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public boolean onNestedPreFling(@NonNull View view, float f, float f2) {
        return (this.mFooterLocked && f2 > 0.0f) || startFlingIfNeed(-f2) || this.mNestedChild.dispatchNestedPreFling(f, f2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public void onNestedPreScroll(@NonNull View view, int i, int i2, @NonNull int[] iArr) {
        int i3 = this.mTotalUnconsumed;
        int i4 = 0;
        if (i2 * i3 > 0) {
            if (Math.abs(i2) > Math.abs(this.mTotalUnconsumed)) {
                int i5 = this.mTotalUnconsumed;
                this.mTotalUnconsumed = 0;
                i4 = i5;
            } else {
                this.mTotalUnconsumed -= i2;
                i4 = i2;
            }
            moveSpinnerInfinitely(this.mTotalUnconsumed);
        } else if (i2 > 0 && this.mFooterLocked) {
            int i6 = i3 - i2;
            this.mTotalUnconsumed = i6;
            moveSpinnerInfinitely(i6);
            i4 = i2;
        }
        this.mNestedChild.dispatchNestedPreScroll(i, i2 - i4, iArr, null);
        iArr[1] = iArr[1] + i4;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public void onNestedScroll(@NonNull View view, int i, int i2, int i3, int i4) {
        ScrollBoundaryDecider scrollBoundaryDecider;
        ScrollBoundaryDecider scrollBoundaryDecider2;
        boolean zDispatchNestedScroll = this.mNestedChild.dispatchNestedScroll(i, i2, i3, i4, this.mParentOffsetInWindow);
        int i5 = i4 + this.mParentOffsetInWindow[1];
        if ((i5 < 0 && ((this.mEnableRefresh || this.mEnableOverScrollDrag) && (this.mTotalUnconsumed != 0 || (scrollBoundaryDecider2 = this.mScrollBoundaryDecider) == null || scrollBoundaryDecider2.canRefresh(this.mRefreshContent.getView())))) || (i5 > 0 && ((this.mEnableLoadMore || this.mEnableOverScrollDrag) && (this.mTotalUnconsumed != 0 || (scrollBoundaryDecider = this.mScrollBoundaryDecider) == null || scrollBoundaryDecider.canLoadMore(this.mRefreshContent.getView()))))) {
            RefreshState refreshState = this.mViceState;
            if (refreshState == RefreshState.None || refreshState.isOpening) {
                this.mKernel.setState(i5 > 0 ? RefreshState.PullUpToLoad : RefreshState.PullDownToRefresh);
                if (!zDispatchNestedScroll) {
                    ViewParent parent = getParent();
                    if (parent instanceof ViewGroup) {
                        ((ViewGroup) parent).requestDisallowInterceptTouchEvent(true);
                    }
                }
            }
            int i6 = this.mTotalUnconsumed - i5;
            this.mTotalUnconsumed = i6;
            moveSpinnerInfinitely(i6);
        }
        if (!this.mFooterLocked || i2 >= 0) {
            return;
        }
        this.mFooterLocked = false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public void onNestedScrollAccepted(@NonNull View view, @NonNull View view2, int i) {
        this.mNestedParent.onNestedScrollAccepted(view, view2, i);
        this.mNestedChild.startNestedScroll(i & 2);
        this.mTotalUnconsumed = this.mSpinner;
        this.mNestedInProgress = true;
        interceptAnimatorByAction(0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public boolean onStartNestedScroll(@NonNull View view, @NonNull View view2, int i) {
        return (isEnabled() && isNestedScrollingEnabled() && (i & 2) != 0) && (this.mEnableOverScrollDrag || this.mEnableRefresh || this.mEnableLoadMore);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public void onStopNestedScroll(@NonNull View view) {
        this.mNestedParent.onStopNestedScroll(view);
        this.mNestedInProgress = false;
        this.mTotalUnconsumed = 0;
        overSpinner();
        this.mNestedChild.stopNestedScroll();
    }

    public void overSpinner() {
        RefreshState refreshState = this.mState;
        if (refreshState == RefreshState.TwoLevel) {
            int measuredHeight = getMeasuredHeight();
            float f = this.mFloorOpenLayoutRate;
            int i = f > 1.0f ? (int) f : (int) (measuredHeight * f);
            if (this.mCurrentVelocity <= -1000 || this.mSpinner <= i / 2) {
                if (this.mIsBeingDragged) {
                    this.mKernel.finishTwoLevel();
                    return;
                }
                return;
            } else {
                ValueAnimator valueAnimatorAnimSpinner = this.mKernel.animSpinner(i);
                if (valueAnimatorAnimSpinner != null) {
                    valueAnimatorAnimSpinner.setDuration(this.mFloorDuration);
                    return;
                }
                return;
            }
        }
        RefreshState refreshState2 = RefreshState.Loading;
        if (refreshState == refreshState2 || (this.mEnableFooterFollowWhenNoMoreData && this.mFooterNoMoreData && this.mFooterNoMoreDataEffective && this.mSpinner < 0 && isEnableRefreshOrLoadMore(this.mEnableLoadMore))) {
            int i2 = this.mSpinner;
            int i3 = this.mFooterHeight;
            if (i2 < (-i3)) {
                this.mKernel.animSpinner(-i3);
                return;
            } else {
                if (i2 > 0) {
                    this.mKernel.animSpinner(0);
                    return;
                }
                return;
            }
        }
        RefreshState refreshState3 = this.mState;
        RefreshState refreshState4 = RefreshState.Refreshing;
        if (refreshState3 == refreshState4) {
            int i4 = this.mSpinner;
            int i5 = this.mHeaderHeight;
            if (i4 > i5) {
                this.mKernel.animSpinner(i5);
                return;
            } else {
                if (i4 < 0) {
                    this.mKernel.animSpinner(0);
                    return;
                }
                return;
            }
        }
        if (refreshState3 == RefreshState.PullDownToRefresh) {
            this.mKernel.setState(RefreshState.PullDownCanceled);
            return;
        }
        if (refreshState3 == RefreshState.PullUpToLoad) {
            this.mKernel.setState(RefreshState.PullUpCanceled);
            return;
        }
        if (refreshState3 == RefreshState.ReleaseToRefresh) {
            this.mKernel.setState(refreshState4);
            return;
        }
        if (refreshState3 == RefreshState.ReleaseToLoad) {
            this.mKernel.setState(refreshState2);
            return;
        }
        if (refreshState3 == RefreshState.ReleaseToTwoLevel) {
            this.mKernel.setState(RefreshState.TwoLevelReleased);
            return;
        }
        if (refreshState3 == RefreshState.RefreshReleased) {
            if (this.reboundAnimator == null) {
                this.mKernel.animSpinner(this.mHeaderHeight);
            }
        } else if (refreshState3 == RefreshState.LoadReleased) {
            if (this.reboundAnimator == null) {
                this.mKernel.animSpinner(-this.mFooterHeight);
            }
        } else {
            if (refreshState3 == RefreshState.LoadFinish || this.mSpinner == 0) {
                return;
            }
            this.mKernel.animSpinner(0);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        if (ViewCompat.isNestedScrollingEnabled(this.mRefreshContent.getScrollableView())) {
            this.mEnableDisallowIntercept = z;
            super.requestDisallowInterceptTouchEvent(z);
        }
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshLayout
    public RefreshLayout resetNoMoreData() {
        return setNoMoreData(false);
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshLayout
    public RefreshLayout setDisableContentWhenLoading(boolean z) {
        this.mDisableContentWhenLoading = z;
        return this;
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshLayout
    public RefreshLayout setDisableContentWhenRefresh(boolean z) {
        this.mDisableContentWhenRefresh = z;
        return this;
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshLayout
    public RefreshLayout setDragRate(float f) {
        this.mDragRate = f;
        return this;
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshLayout
    public RefreshLayout setEnableAutoLoadMore(boolean z) {
        this.mEnableAutoLoadMore = z;
        return this;
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshLayout
    public RefreshLayout setEnableClipFooterWhenFixedBehind(boolean z) {
        this.mEnableClipFooterWhenFixedBehind = z;
        return this;
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshLayout
    public RefreshLayout setEnableClipHeaderWhenFixedBehind(boolean z) {
        this.mEnableClipHeaderWhenFixedBehind = z;
        return this;
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshLayout
    @Deprecated
    public RefreshLayout setEnableFooterFollowWhenLoadFinished(boolean z) {
        this.mEnableFooterFollowWhenNoMoreData = z;
        return this;
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshLayout
    public RefreshLayout setEnableFooterFollowWhenNoMoreData(boolean z) {
        this.mEnableFooterFollowWhenNoMoreData = z;
        return this;
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshLayout
    public RefreshLayout setEnableFooterTranslationContent(boolean z) {
        this.mEnableFooterTranslationContent = z;
        this.mManualFooterTranslationContent = true;
        return this;
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshLayout
    public RefreshLayout setEnableHeaderTranslationContent(boolean z) {
        this.mEnableHeaderTranslationContent = z;
        this.mManualHeaderTranslationContent = true;
        return this;
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshLayout
    public RefreshLayout setEnableLoadMore(boolean z) {
        this.mManualLoadMore = true;
        this.mEnableLoadMore = z;
        return this;
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshLayout
    public RefreshLayout setEnableLoadMoreWhenContentNotFull(boolean z) {
        this.mEnableLoadMoreWhenContentNotFull = z;
        RefreshContent refreshContent = this.mRefreshContent;
        if (refreshContent != null) {
            refreshContent.setEnableLoadMoreWhenContentNotFull(z);
        }
        return this;
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshLayout
    public RefreshLayout setEnableNestedScroll(boolean z) {
        setNestedScrollingEnabled(z);
        return this;
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshLayout
    public RefreshLayout setEnableOverScrollBounce(boolean z) {
        this.mEnableOverScrollBounce = z;
        return this;
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshLayout
    public RefreshLayout setEnableOverScrollDrag(boolean z) {
        this.mEnableOverScrollDrag = z;
        return this;
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshLayout
    public RefreshLayout setEnablePureScrollMode(boolean z) {
        this.mEnablePureScrollMode = z;
        return this;
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshLayout
    public RefreshLayout setEnableRefresh(boolean z) {
        this.mEnableRefresh = z;
        return this;
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshLayout
    public RefreshLayout setEnableScrollContentWhenLoaded(boolean z) {
        this.mEnableScrollContentWhenLoaded = z;
        return this;
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshLayout
    public RefreshLayout setEnableScrollContentWhenRefreshed(boolean z) {
        this.mEnableScrollContentWhenRefreshed = z;
        return this;
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshLayout
    public RefreshLayout setFooterHeight(float f) {
        int iDp2px = SmartUtil.dp2px(f);
        if (iDp2px == this.mFooterHeight) {
            return this;
        }
        DimensionStatus dimensionStatus = this.mFooterHeightStatus;
        DimensionStatus dimensionStatus2 = DimensionStatus.CodeExact;
        if (dimensionStatus.canReplaceWith(dimensionStatus2)) {
            this.mFooterHeight = iDp2px;
            RefreshInternal refreshInternal = this.mRefreshFooter;
            if (refreshInternal != null && this.mAttachedToWindow && this.mFooterHeightStatus.notified) {
                SpinnerStyle spinnerStyle = refreshInternal.getSpinnerStyle();
                if (spinnerStyle != SpinnerStyle.MatchLayout && !spinnerStyle.scale) {
                    View view = this.mRefreshFooter.getView();
                    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : sDefaultMarginLP;
                    view.measure(View.MeasureSpec.makeMeasureSpec(view.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(Math.max((this.mFooterHeight - marginLayoutParams.bottomMargin) - marginLayoutParams.topMargin, 0), 1073741824));
                    int i = marginLayoutParams.leftMargin;
                    int measuredHeight = ((marginLayoutParams.topMargin + getMeasuredHeight()) - this.mFooterInsetStart) - (spinnerStyle != SpinnerStyle.Translate ? this.mFooterHeight : 0);
                    view.layout(i, measuredHeight, view.getMeasuredWidth() + i, view.getMeasuredHeight() + measuredHeight);
                }
                this.mFooterHeightStatus = dimensionStatus2;
                RefreshInternal refreshInternal2 = this.mRefreshFooter;
                RefreshKernel refreshKernel = this.mKernel;
                int i2 = this.mFooterHeight;
                refreshInternal2.onInitialized(refreshKernel, i2, (int) (this.mFooterMaxDragRate * i2));
            } else {
                this.mFooterHeightStatus = DimensionStatus.CodeExactUnNotify;
            }
        }
        return this;
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshLayout
    public RefreshLayout setFooterInsetStart(float f) {
        this.mFooterInsetStart = SmartUtil.dp2px(f);
        return this;
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshLayout
    public RefreshLayout setFooterMaxDragRate(float f) {
        this.mFooterMaxDragRate = f;
        RefreshInternal refreshInternal = this.mRefreshFooter;
        if (refreshInternal == null || !this.mAttachedToWindow) {
            this.mFooterHeightStatus = this.mFooterHeightStatus.unNotify();
        } else {
            RefreshKernel refreshKernel = this.mKernel;
            int i = this.mFooterHeight;
            refreshInternal.onInitialized(refreshKernel, i, (int) (i * f));
        }
        return this;
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshLayout
    public RefreshLayout setFooterTriggerRate(float f) {
        this.mFooterTriggerRate = f;
        return this;
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshLayout
    public RefreshLayout setHeaderHeight(float f) {
        int iDp2px = SmartUtil.dp2px(f);
        if (iDp2px == this.mHeaderHeight) {
            return this;
        }
        DimensionStatus dimensionStatus = this.mHeaderHeightStatus;
        DimensionStatus dimensionStatus2 = DimensionStatus.CodeExact;
        if (dimensionStatus.canReplaceWith(dimensionStatus2)) {
            this.mHeaderHeight = iDp2px;
            RefreshInternal refreshInternal = this.mRefreshHeader;
            if (refreshInternal != null && this.mAttachedToWindow && this.mHeaderHeightStatus.notified) {
                SpinnerStyle spinnerStyle = refreshInternal.getSpinnerStyle();
                if (spinnerStyle != SpinnerStyle.MatchLayout && !spinnerStyle.scale) {
                    View view = this.mRefreshHeader.getView();
                    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : sDefaultMarginLP;
                    view.measure(View.MeasureSpec.makeMeasureSpec(view.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(Math.max((this.mHeaderHeight - marginLayoutParams.bottomMargin) - marginLayoutParams.topMargin, 0), 1073741824));
                    int i = marginLayoutParams.leftMargin;
                    int i2 = (marginLayoutParams.topMargin + this.mHeaderInsetStart) - (spinnerStyle == SpinnerStyle.Translate ? this.mHeaderHeight : 0);
                    view.layout(i, i2, view.getMeasuredWidth() + i, view.getMeasuredHeight() + i2);
                }
                this.mHeaderHeightStatus = dimensionStatus2;
                RefreshInternal refreshInternal2 = this.mRefreshHeader;
                RefreshKernel refreshKernel = this.mKernel;
                int i3 = this.mHeaderHeight;
                refreshInternal2.onInitialized(refreshKernel, i3, (int) (this.mHeaderMaxDragRate * i3));
            } else {
                this.mHeaderHeightStatus = DimensionStatus.CodeExactUnNotify;
            }
        }
        return this;
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshLayout
    public RefreshLayout setHeaderInsetStart(float f) {
        this.mHeaderInsetStart = SmartUtil.dp2px(f);
        return this;
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshLayout
    public RefreshLayout setHeaderMaxDragRate(float f) {
        this.mHeaderMaxDragRate = f;
        RefreshInternal refreshInternal = this.mRefreshHeader;
        if (refreshInternal == null || !this.mAttachedToWindow) {
            this.mHeaderHeightStatus = this.mHeaderHeightStatus.unNotify();
        } else {
            RefreshKernel refreshKernel = this.mKernel;
            int i = this.mHeaderHeight;
            refreshInternal.onInitialized(refreshKernel, i, (int) (f * i));
        }
        return this;
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshLayout
    public RefreshLayout setHeaderTriggerRate(float f) {
        this.mHeaderTriggerRate = f;
        return this;
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        this.mEnableNestedScrolling = z;
        this.mNestedChild.setNestedScrollingEnabled(z);
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshLayout
    public RefreshLayout setNoMoreData(boolean z) {
        RefreshState refreshState = this.mState;
        if (refreshState == RefreshState.Refreshing && z) {
            finishRefreshWithNoMoreData();
        } else if (refreshState == RefreshState.Loading && z) {
            finishLoadMoreWithNoMoreData();
        } else if (this.mFooterNoMoreData != z) {
            this.mFooterNoMoreData = z;
            RefreshInternal refreshInternal = this.mRefreshFooter;
            if (refreshInternal instanceof RefreshFooter) {
                if (((RefreshFooter) refreshInternal).setNoMoreData(z)) {
                    this.mFooterNoMoreDataEffective = true;
                    if (this.mFooterNoMoreData && this.mEnableFooterFollowWhenNoMoreData && this.mSpinner > 0 && this.mRefreshFooter.getSpinnerStyle() == SpinnerStyle.Translate && isEnableRefreshOrLoadMore(this.mEnableLoadMore) && isEnableTranslationContent(this.mEnableRefresh, this.mRefreshHeader)) {
                        this.mRefreshFooter.getView().setTranslationY(this.mSpinner);
                    }
                } else {
                    this.mFooterNoMoreDataEffective = false;
                    new RuntimeException("Footer:" + this.mRefreshFooter + " NoMoreData is not supported.(不支持NoMoreData，请使用[ClassicsFooter]或者[自定义Footer并实现setNoMoreData方法且返回true])").printStackTrace();
                }
            }
        }
        return this;
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshLayout
    public RefreshLayout setOnLoadMoreListener(OnLoadMoreListener onLoadMoreListener) {
        this.mLoadMoreListener = onLoadMoreListener;
        this.mEnableLoadMore = this.mEnableLoadMore || !(this.mManualLoadMore || onLoadMoreListener == null);
        return this;
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshLayout
    public RefreshLayout setOnMultiPurposeListener(OnMultiPurposeListener onMultiPurposeListener) {
        this.mOnMultiPurposeListener = onMultiPurposeListener;
        return this;
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshLayout
    public RefreshLayout setOnRefreshListener(OnRefreshListener onRefreshListener) {
        this.mRefreshListener = onRefreshListener;
        return this;
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshLayout
    public RefreshLayout setOnRefreshLoadMoreListener(OnRefreshLoadMoreListener onRefreshLoadMoreListener) {
        this.mRefreshListener = onRefreshLoadMoreListener;
        this.mLoadMoreListener = onRefreshLoadMoreListener;
        this.mEnableLoadMore = this.mEnableLoadMore || !(this.mManualLoadMore || onRefreshLoadMoreListener == null);
        return this;
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshLayout
    public RefreshLayout setPrimaryColors(@ColorInt int... iArr) {
        RefreshInternal refreshInternal = this.mRefreshHeader;
        if (refreshInternal != null) {
            refreshInternal.setPrimaryColors(iArr);
        }
        RefreshInternal refreshInternal2 = this.mRefreshFooter;
        if (refreshInternal2 != null) {
            refreshInternal2.setPrimaryColors(iArr);
        }
        this.mPrimaryColors = iArr;
        return this;
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshLayout
    public RefreshLayout setPrimaryColorsId(@ColorRes int... iArr) {
        int[] iArr2 = new int[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            iArr2[i] = ContextCompat.getColor(getContext(), iArr[i]);
        }
        setPrimaryColors(iArr2);
        return this;
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshLayout
    public RefreshLayout setReboundDuration(int i) {
        this.mReboundDuration = i;
        return this;
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshLayout
    public RefreshLayout setReboundInterpolator(@NonNull Interpolator interpolator) {
        this.mReboundInterpolator = interpolator;
        return this;
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshLayout
    public RefreshLayout setRefreshContent(@NonNull View view) {
        return setRefreshContent(view, 0, 0);
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshLayout
    public RefreshLayout setRefreshFooter(@NonNull RefreshFooter refreshFooter) {
        return setRefreshFooter(refreshFooter, 0, 0);
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshLayout
    public RefreshLayout setRefreshHeader(@NonNull RefreshHeader refreshHeader) {
        return setRefreshHeader(refreshHeader, 0, 0);
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshLayout
    public RefreshLayout setScrollBoundaryDecider(ScrollBoundaryDecider scrollBoundaryDecider) {
        this.mScrollBoundaryDecider = scrollBoundaryDecider;
        RefreshContent refreshContent = this.mRefreshContent;
        if (refreshContent != null) {
            refreshContent.setScrollBoundaryDecider(scrollBoundaryDecider);
        }
        return this;
    }

    public void setStateDirectLoading(boolean z) {
        RefreshState refreshState = this.mState;
        RefreshState refreshState2 = RefreshState.Loading;
        if (refreshState != refreshState2) {
            this.mLastOpenTime = System.currentTimeMillis();
            this.mFooterLocked = true;
            notifyStateChanged(refreshState2);
            OnLoadMoreListener onLoadMoreListener = this.mLoadMoreListener;
            if (onLoadMoreListener != null) {
                if (z) {
                    onLoadMoreListener.onLoadMore(this);
                }
            } else if (this.mOnMultiPurposeListener == null) {
                finishLoadMore(2000);
            }
            RefreshInternal refreshInternal = this.mRefreshFooter;
            if (refreshInternal != null) {
                int i = this.mFooterHeight;
                refreshInternal.onStartAnimator(this, i, (int) (this.mFooterMaxDragRate * i));
            }
            OnMultiPurposeListener onMultiPurposeListener = this.mOnMultiPurposeListener;
            if (onMultiPurposeListener == null || !(this.mRefreshFooter instanceof RefreshFooter)) {
                return;
            }
            if (z) {
                onMultiPurposeListener.onLoadMore(this);
            }
            OnMultiPurposeListener onMultiPurposeListener2 = this.mOnMultiPurposeListener;
            RefreshFooter refreshFooter = (RefreshFooter) this.mRefreshFooter;
            int i2 = this.mFooterHeight;
            onMultiPurposeListener2.onFooterStartAnimator(refreshFooter, i2, (int) (this.mFooterMaxDragRate * i2));
        }
    }

    public void setStateLoading(final boolean z) {
        AnimatorListenerAdapter animatorListenerAdapter = new AnimatorListenerAdapter() { // from class: com.scwang.smartrefresh.layout.SmartRefreshLayout.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                if (animator == null || animator.getDuration() != 0) {
                    SmartRefreshLayout.this.setStateDirectLoading(z);
                }
            }
        };
        notifyStateChanged(RefreshState.LoadReleased);
        ValueAnimator valueAnimatorAnimSpinner = this.mKernel.animSpinner(-this.mFooterHeight);
        if (valueAnimatorAnimSpinner != null) {
            valueAnimatorAnimSpinner.addListener(animatorListenerAdapter);
        }
        RefreshInternal refreshInternal = this.mRefreshFooter;
        if (refreshInternal != null) {
            int i = this.mFooterHeight;
            refreshInternal.onReleased(this, i, (int) (this.mFooterMaxDragRate * i));
        }
        OnMultiPurposeListener onMultiPurposeListener = this.mOnMultiPurposeListener;
        if (onMultiPurposeListener != null) {
            RefreshInternal refreshInternal2 = this.mRefreshFooter;
            if (refreshInternal2 instanceof RefreshFooter) {
                int i2 = this.mFooterHeight;
                onMultiPurposeListener.onFooterReleased((RefreshFooter) refreshInternal2, i2, (int) (this.mFooterMaxDragRate * i2));
            }
        }
        if (valueAnimatorAnimSpinner == null) {
            animatorListenerAdapter.onAnimationEnd(null);
        }
    }

    public void setStateRefreshing(final boolean z) {
        AnimatorListenerAdapter animatorListenerAdapter = new AnimatorListenerAdapter() { // from class: com.scwang.smartrefresh.layout.SmartRefreshLayout.2
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                if (animator == null || animator.getDuration() != 0) {
                    SmartRefreshLayout.this.mLastOpenTime = System.currentTimeMillis();
                    SmartRefreshLayout.this.notifyStateChanged(RefreshState.Refreshing);
                    SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
                    OnRefreshListener onRefreshListener = smartRefreshLayout.mRefreshListener;
                    if (onRefreshListener != null) {
                        if (z) {
                            onRefreshListener.onRefresh(smartRefreshLayout);
                        }
                    } else if (smartRefreshLayout.mOnMultiPurposeListener == null) {
                        smartRefreshLayout.finishRefresh(3000);
                    }
                    SmartRefreshLayout smartRefreshLayout2 = SmartRefreshLayout.this;
                    RefreshInternal refreshInternal = smartRefreshLayout2.mRefreshHeader;
                    if (refreshInternal != null) {
                        int i = smartRefreshLayout2.mHeaderHeight;
                        refreshInternal.onStartAnimator(smartRefreshLayout2, i, (int) (smartRefreshLayout2.mHeaderMaxDragRate * i));
                    }
                    SmartRefreshLayout smartRefreshLayout3 = SmartRefreshLayout.this;
                    OnMultiPurposeListener onMultiPurposeListener = smartRefreshLayout3.mOnMultiPurposeListener;
                    if (onMultiPurposeListener == null || !(smartRefreshLayout3.mRefreshHeader instanceof RefreshHeader)) {
                        return;
                    }
                    if (z) {
                        onMultiPurposeListener.onRefresh(smartRefreshLayout3);
                    }
                    SmartRefreshLayout smartRefreshLayout4 = SmartRefreshLayout.this;
                    OnMultiPurposeListener onMultiPurposeListener2 = smartRefreshLayout4.mOnMultiPurposeListener;
                    RefreshHeader refreshHeader = (RefreshHeader) smartRefreshLayout4.mRefreshHeader;
                    int i2 = smartRefreshLayout4.mHeaderHeight;
                    onMultiPurposeListener2.onHeaderStartAnimator(refreshHeader, i2, (int) (smartRefreshLayout4.mHeaderMaxDragRate * i2));
                }
            }
        };
        notifyStateChanged(RefreshState.RefreshReleased);
        ValueAnimator valueAnimatorAnimSpinner = this.mKernel.animSpinner(this.mHeaderHeight);
        if (valueAnimatorAnimSpinner != null) {
            valueAnimatorAnimSpinner.addListener(animatorListenerAdapter);
        }
        RefreshInternal refreshInternal = this.mRefreshHeader;
        if (refreshInternal != null) {
            int i = this.mHeaderHeight;
            refreshInternal.onReleased(this, i, (int) (this.mHeaderMaxDragRate * i));
        }
        OnMultiPurposeListener onMultiPurposeListener = this.mOnMultiPurposeListener;
        if (onMultiPurposeListener != null) {
            RefreshInternal refreshInternal2 = this.mRefreshHeader;
            if (refreshInternal2 instanceof RefreshHeader) {
                int i2 = this.mHeaderHeight;
                onMultiPurposeListener.onHeaderReleased((RefreshHeader) refreshInternal2, i2, (int) (this.mHeaderMaxDragRate * i2));
            }
        }
        if (valueAnimatorAnimSpinner == null) {
            animatorListenerAdapter.onAnimationEnd(null);
        }
    }

    public void setViceState(RefreshState refreshState) {
        RefreshState refreshState2 = this.mState;
        if (refreshState2.isDragging && refreshState2.isHeader != refreshState.isHeader) {
            notifyStateChanged(RefreshState.None);
        }
        if (this.mViceState != refreshState) {
            this.mViceState = refreshState;
        }
    }

    public boolean startFlingIfNeed(float f) {
        if (f == 0.0f) {
            f = this.mCurrentVelocity;
        }
        if (this.mRefreshContent != null) {
            getScaleY();
            View view = this.mRefreshContent.getView();
            if (getScaleY() == -1.0f && view.getScaleY() == -1.0f) {
                f = -f;
            }
        }
        if (Math.abs(f) > this.mMinimumVelocity) {
            int i = this.mSpinner;
            if (i * f < 0.0f) {
                RefreshState refreshState = this.mState;
                if (refreshState == RefreshState.Refreshing || refreshState == RefreshState.Loading || (i < 0 && this.mFooterNoMoreData)) {
                    this.animationRunnable = new FlingRunnable(f).start();
                    return true;
                }
                if (refreshState.isReleaseToOpening) {
                    return true;
                }
            }
            if ((f < 0.0f && ((this.mEnableOverScrollBounce && (this.mEnableLoadMore || this.mEnableOverScrollDrag)) || ((this.mState == RefreshState.Loading && i >= 0) || (this.mEnableAutoLoadMore && isEnableRefreshOrLoadMore(this.mEnableLoadMore))))) || (f > 0.0f && ((this.mEnableOverScrollBounce && this.mEnableRefresh) || this.mEnableOverScrollDrag || (this.mState == RefreshState.Refreshing && this.mSpinner <= 0)))) {
                this.mVerticalPermit = false;
                this.mScroller.fling(0, 0, 0, (int) (-f), 0, 0, -2147483647, Integer.MAX_VALUE);
                this.mScroller.computeScrollOffset();
                invalidate();
            }
        }
        return false;
    }

    public SmartRefreshLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mFloorDuration = 300;
        this.mReboundDuration = 300;
        this.mFloorOpenLayoutRate = 1.0f;
        this.mFloorBottomDragLayoutRate = 0.16666667f;
        this.mDragRate = 0.5f;
        this.mDragDirection = 'n';
        this.mFixedHeaderViewId = -1;
        this.mFixedFooterViewId = -1;
        this.mHeaderTranslationViewId = -1;
        this.mFooterTranslationViewId = -1;
        this.mEnableRefresh = true;
        this.mEnableLoadMore = false;
        this.mEnableClipHeaderWhenFixedBehind = true;
        this.mEnableClipFooterWhenFixedBehind = true;
        this.mEnableHeaderTranslationContent = true;
        this.mEnableFooterTranslationContent = true;
        this.mEnableFooterFollowWhenNoMoreData = false;
        this.mEnablePreviewInEditMode = true;
        this.mEnableOverScrollBounce = true;
        this.mEnableOverScrollDrag = false;
        this.mEnableAutoLoadMore = true;
        this.mEnablePureScrollMode = false;
        this.mEnableScrollContentWhenLoaded = true;
        this.mEnableScrollContentWhenRefreshed = true;
        this.mEnableLoadMoreWhenContentNotFull = true;
        this.mEnableNestedScrolling = true;
        this.mDisableContentWhenRefresh = false;
        this.mDisableContentWhenLoading = false;
        this.mFooterNoMoreData = false;
        this.mFooterNoMoreDataEffective = false;
        this.mManualLoadMore = false;
        this.mManualHeaderTranslationContent = false;
        this.mManualFooterTranslationContent = false;
        this.mParentOffsetInWindow = new int[2];
        this.mNestedChild = new NestedScrollingChildHelper(this);
        this.mNestedParent = new NestedScrollingParentHelper(this);
        DimensionStatus dimensionStatus = DimensionStatus.DefaultUnNotify;
        this.mHeaderHeightStatus = dimensionStatus;
        this.mFooterHeightStatus = dimensionStatus;
        this.mHeaderMaxDragRate = 2.5f;
        this.mFooterMaxDragRate = 2.5f;
        this.mHeaderTriggerRate = 1.0f;
        this.mFooterTriggerRate = 1.0f;
        this.mKernel = new RefreshKernelImpl();
        RefreshState refreshState = RefreshState.None;
        this.mState = refreshState;
        this.mViceState = refreshState;
        this.mLastOpenTime = 0L;
        this.mHeaderBackgroundColor = 0;
        this.mFooterBackgroundColor = 0;
        this.mFooterLocked = false;
        this.mVerticalPermit = false;
        this.mFalsifyEvent = null;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.mHandler = new Handler();
        this.mScroller = new Scroller(context);
        this.mVelocityTracker = VelocityTracker.obtain();
        this.mScreenHeightPixels = context.getResources().getDisplayMetrics().heightPixels;
        this.mReboundInterpolator = new SmartUtil(SmartUtil.INTERPOLATOR_VISCOUS_FLUID);
        this.mTouchSlop = viewConfiguration.getScaledTouchSlop();
        this.mMinimumVelocity = viewConfiguration.getScaledMinimumFlingVelocity();
        this.mMaximumVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
        this.mFooterHeight = SmartUtil.dp2px(60.0f);
        this.mHeaderHeight = SmartUtil.dp2px(100.0f);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.SmartRefreshLayout);
        if (!typedArrayObtainStyledAttributes.hasValue(R.styleable.SmartRefreshLayout_android_clipToPadding)) {
            super.setClipToPadding(false);
        }
        if (!typedArrayObtainStyledAttributes.hasValue(R.styleable.SmartRefreshLayout_android_clipChildren)) {
            super.setClipChildren(false);
        }
        DefaultRefreshInitializer defaultRefreshInitializer = sRefreshInitializer;
        if (defaultRefreshInitializer != null) {
            defaultRefreshInitializer.initialize(context, this);
        }
        this.mDragRate = typedArrayObtainStyledAttributes.getFloat(R.styleable.SmartRefreshLayout_srlDragRate, this.mDragRate);
        this.mHeaderMaxDragRate = typedArrayObtainStyledAttributes.getFloat(R.styleable.SmartRefreshLayout_srlHeaderMaxDragRate, this.mHeaderMaxDragRate);
        this.mFooterMaxDragRate = typedArrayObtainStyledAttributes.getFloat(R.styleable.SmartRefreshLayout_srlFooterMaxDragRate, this.mFooterMaxDragRate);
        this.mHeaderTriggerRate = typedArrayObtainStyledAttributes.getFloat(R.styleable.SmartRefreshLayout_srlHeaderTriggerRate, this.mHeaderTriggerRate);
        this.mFooterTriggerRate = typedArrayObtainStyledAttributes.getFloat(R.styleable.SmartRefreshLayout_srlFooterTriggerRate, this.mFooterTriggerRate);
        this.mEnableRefresh = typedArrayObtainStyledAttributes.getBoolean(R.styleable.SmartRefreshLayout_srlEnableRefresh, this.mEnableRefresh);
        this.mReboundDuration = typedArrayObtainStyledAttributes.getInt(R.styleable.SmartRefreshLayout_srlReboundDuration, this.mReboundDuration);
        int i = R.styleable.SmartRefreshLayout_srlEnableLoadMore;
        this.mEnableLoadMore = typedArrayObtainStyledAttributes.getBoolean(i, this.mEnableLoadMore);
        int i2 = R.styleable.SmartRefreshLayout_srlHeaderHeight;
        this.mHeaderHeight = typedArrayObtainStyledAttributes.getDimensionPixelOffset(i2, this.mHeaderHeight);
        int i3 = R.styleable.SmartRefreshLayout_srlFooterHeight;
        this.mFooterHeight = typedArrayObtainStyledAttributes.getDimensionPixelOffset(i3, this.mFooterHeight);
        this.mHeaderInsetStart = typedArrayObtainStyledAttributes.getDimensionPixelOffset(R.styleable.SmartRefreshLayout_srlHeaderInsetStart, this.mHeaderInsetStart);
        this.mFooterInsetStart = typedArrayObtainStyledAttributes.getDimensionPixelOffset(R.styleable.SmartRefreshLayout_srlFooterInsetStart, this.mFooterInsetStart);
        this.mDisableContentWhenRefresh = typedArrayObtainStyledAttributes.getBoolean(R.styleable.SmartRefreshLayout_srlDisableContentWhenRefresh, this.mDisableContentWhenRefresh);
        this.mDisableContentWhenLoading = typedArrayObtainStyledAttributes.getBoolean(R.styleable.SmartRefreshLayout_srlDisableContentWhenLoading, this.mDisableContentWhenLoading);
        int i4 = R.styleable.SmartRefreshLayout_srlEnableHeaderTranslationContent;
        this.mEnableHeaderTranslationContent = typedArrayObtainStyledAttributes.getBoolean(i4, this.mEnableHeaderTranslationContent);
        int i5 = R.styleable.SmartRefreshLayout_srlEnableFooterTranslationContent;
        this.mEnableFooterTranslationContent = typedArrayObtainStyledAttributes.getBoolean(i5, this.mEnableFooterTranslationContent);
        this.mEnablePreviewInEditMode = typedArrayObtainStyledAttributes.getBoolean(R.styleable.SmartRefreshLayout_srlEnablePreviewInEditMode, this.mEnablePreviewInEditMode);
        this.mEnableAutoLoadMore = typedArrayObtainStyledAttributes.getBoolean(R.styleable.SmartRefreshLayout_srlEnableAutoLoadMore, this.mEnableAutoLoadMore);
        this.mEnableOverScrollBounce = typedArrayObtainStyledAttributes.getBoolean(R.styleable.SmartRefreshLayout_srlEnableOverScrollBounce, this.mEnableOverScrollBounce);
        this.mEnablePureScrollMode = typedArrayObtainStyledAttributes.getBoolean(R.styleable.SmartRefreshLayout_srlEnablePureScrollMode, this.mEnablePureScrollMode);
        this.mEnableScrollContentWhenLoaded = typedArrayObtainStyledAttributes.getBoolean(R.styleable.SmartRefreshLayout_srlEnableScrollContentWhenLoaded, this.mEnableScrollContentWhenLoaded);
        this.mEnableScrollContentWhenRefreshed = typedArrayObtainStyledAttributes.getBoolean(R.styleable.SmartRefreshLayout_srlEnableScrollContentWhenRefreshed, this.mEnableScrollContentWhenRefreshed);
        this.mEnableLoadMoreWhenContentNotFull = typedArrayObtainStyledAttributes.getBoolean(R.styleable.SmartRefreshLayout_srlEnableLoadMoreWhenContentNotFull, this.mEnableLoadMoreWhenContentNotFull);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(R.styleable.SmartRefreshLayout_srlEnableFooterFollowWhenLoadFinished, this.mEnableFooterFollowWhenNoMoreData);
        this.mEnableFooterFollowWhenNoMoreData = z;
        this.mEnableFooterFollowWhenNoMoreData = typedArrayObtainStyledAttributes.getBoolean(R.styleable.SmartRefreshLayout_srlEnableFooterFollowWhenNoMoreData, z);
        this.mEnableClipHeaderWhenFixedBehind = typedArrayObtainStyledAttributes.getBoolean(R.styleable.SmartRefreshLayout_srlEnableClipHeaderWhenFixedBehind, this.mEnableClipHeaderWhenFixedBehind);
        this.mEnableClipFooterWhenFixedBehind = typedArrayObtainStyledAttributes.getBoolean(R.styleable.SmartRefreshLayout_srlEnableClipFooterWhenFixedBehind, this.mEnableClipFooterWhenFixedBehind);
        this.mEnableOverScrollDrag = typedArrayObtainStyledAttributes.getBoolean(R.styleable.SmartRefreshLayout_srlEnableOverScrollDrag, this.mEnableOverScrollDrag);
        this.mFixedHeaderViewId = typedArrayObtainStyledAttributes.getResourceId(R.styleable.SmartRefreshLayout_srlFixedHeaderViewId, this.mFixedHeaderViewId);
        this.mFixedFooterViewId = typedArrayObtainStyledAttributes.getResourceId(R.styleable.SmartRefreshLayout_srlFixedFooterViewId, this.mFixedFooterViewId);
        this.mHeaderTranslationViewId = typedArrayObtainStyledAttributes.getResourceId(R.styleable.SmartRefreshLayout_srlHeaderTranslationViewId, this.mHeaderTranslationViewId);
        this.mFooterTranslationViewId = typedArrayObtainStyledAttributes.getResourceId(R.styleable.SmartRefreshLayout_srlFooterTranslationViewId, this.mFooterTranslationViewId);
        boolean z2 = typedArrayObtainStyledAttributes.getBoolean(R.styleable.SmartRefreshLayout_srlEnableNestedScrolling, this.mEnableNestedScrolling);
        this.mEnableNestedScrolling = z2;
        this.mNestedChild.setNestedScrollingEnabled(z2);
        this.mManualLoadMore = this.mManualLoadMore || typedArrayObtainStyledAttributes.hasValue(i);
        this.mManualHeaderTranslationContent = this.mManualHeaderTranslationContent || typedArrayObtainStyledAttributes.hasValue(i4);
        this.mManualFooterTranslationContent = this.mManualFooterTranslationContent || typedArrayObtainStyledAttributes.hasValue(i5);
        this.mHeaderHeightStatus = typedArrayObtainStyledAttributes.hasValue(i2) ? DimensionStatus.XmlLayoutUnNotify : this.mHeaderHeightStatus;
        this.mFooterHeightStatus = typedArrayObtainStyledAttributes.hasValue(i3) ? DimensionStatus.XmlLayoutUnNotify : this.mFooterHeightStatus;
        int color = typedArrayObtainStyledAttributes.getColor(R.styleable.SmartRefreshLayout_srlAccentColor, 0);
        int color2 = typedArrayObtainStyledAttributes.getColor(R.styleable.SmartRefreshLayout_srlPrimaryColor, 0);
        if (color2 != 0) {
            if (color != 0) {
                this.mPrimaryColors = new int[]{color2, color};
            } else {
                this.mPrimaryColors = new int[]{color2};
            }
        } else if (color != 0) {
            this.mPrimaryColors = new int[]{0, color};
        }
        if (this.mEnablePureScrollMode && !this.mManualLoadMore && !this.mEnableLoadMore) {
            this.mEnableLoadMore = true;
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshLayout
    public boolean autoLoadMore(int i, final int i2, final float f, final boolean z) {
        if (this.mState != RefreshState.None || !isEnableRefreshOrLoadMore(this.mEnableLoadMore) || this.mFooterNoMoreData) {
            return false;
        }
        Runnable runnable = new Runnable() { // from class: com.scwang.smartrefresh.layout.SmartRefreshLayout.9
            @Override // java.lang.Runnable
            public void run() {
                SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
                if (smartRefreshLayout.mViceState != RefreshState.Loading) {
                    return;
                }
                ValueAnimator valueAnimator = smartRefreshLayout.reboundAnimator;
                if (valueAnimator != null) {
                    valueAnimator.setDuration(0L);
                    SmartRefreshLayout.this.reboundAnimator.cancel();
                    SmartRefreshLayout.this.reboundAnimator = null;
                }
                SmartRefreshLayout smartRefreshLayout2 = SmartRefreshLayout.this;
                smartRefreshLayout2.mLastTouchX = smartRefreshLayout2.getMeasuredWidth() / 2.0f;
                SmartRefreshLayout.this.mKernel.setState(RefreshState.PullUpToLoad);
                SmartRefreshLayout smartRefreshLayout3 = SmartRefreshLayout.this;
                smartRefreshLayout3.reboundAnimator = ValueAnimator.ofInt(smartRefreshLayout3.mSpinner, -((int) (smartRefreshLayout3.mFooterHeight * f)));
                SmartRefreshLayout.this.reboundAnimator.setDuration(i2);
                SmartRefreshLayout.this.reboundAnimator.setInterpolator(new SmartUtil(SmartUtil.INTERPOLATOR_VISCOUS_FLUID));
                SmartRefreshLayout.this.reboundAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.scwang.smartrefresh.layout.SmartRefreshLayout.9.1
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public void onAnimationUpdate(ValueAnimator valueAnimator2) {
                        SmartRefreshLayout smartRefreshLayout4 = SmartRefreshLayout.this;
                        if (smartRefreshLayout4.reboundAnimator == null || smartRefreshLayout4.mRefreshFooter == null) {
                            return;
                        }
                        smartRefreshLayout4.mKernel.moveSpinner(((Integer) valueAnimator2.getAnimatedValue()).intValue(), true);
                    }
                });
                SmartRefreshLayout.this.reboundAnimator.addListener(new AnimatorListenerAdapter() { // from class: com.scwang.smartrefresh.layout.SmartRefreshLayout.9.2
                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator animator) {
                        if (animator == null || animator.getDuration() != 0) {
                            SmartRefreshLayout smartRefreshLayout4 = SmartRefreshLayout.this;
                            smartRefreshLayout4.reboundAnimator = null;
                            if (smartRefreshLayout4.mRefreshFooter == null) {
                                smartRefreshLayout4.mKernel.setState(RefreshState.None);
                                return;
                            }
                            RefreshState refreshState = smartRefreshLayout4.mState;
                            RefreshState refreshState2 = RefreshState.ReleaseToLoad;
                            if (refreshState != refreshState2) {
                                smartRefreshLayout4.mKernel.setState(refreshState2);
                            }
                            AnonymousClass9 anonymousClass9 = AnonymousClass9.this;
                            SmartRefreshLayout.this.setStateLoading(!z);
                        }
                    }
                });
                SmartRefreshLayout.this.reboundAnimator.start();
            }
        };
        setViceState(RefreshState.Loading);
        if (i > 0) {
            this.mHandler.postDelayed(runnable, i);
            return true;
        }
        runnable.run();
        return true;
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshLayout
    @Deprecated
    public boolean autoRefresh(int i) {
        int i2 = this.mReboundDuration;
        float f = (this.mHeaderMaxDragRate / 2.0f) + 0.5f;
        int i3 = this.mHeaderHeight;
        float f2 = f * i3 * 1.0f;
        if (i3 == 0) {
            i3 = 1;
        }
        return autoRefresh(i, i2, f2 / i3, false);
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshLayout
    public RefreshLayout finishLoadMore(int i) {
        return finishLoadMore(i, true, false);
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshLayout
    public RefreshLayout finishRefresh(int i) {
        return finishRefresh(i, true, Boolean.FALSE);
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshLayout
    public RefreshLayout setRefreshContent(@NonNull View view, int i, int i2) {
        RefreshContent refreshContent = this.mRefreshContent;
        if (refreshContent != null) {
            super.removeView(refreshContent.getView());
        }
        if (i == 0) {
            i = -1;
        }
        if (i2 == 0) {
            i2 = -1;
        }
        LayoutParams layoutParams = new LayoutParams(i, i2);
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        if (layoutParams2 instanceof LayoutParams) {
            layoutParams = (LayoutParams) layoutParams2;
        }
        super.addView(view, getChildCount(), layoutParams);
        this.mRefreshContent = new RefreshContentWrapper(view);
        if (this.mAttachedToWindow) {
            View viewFindViewById = findViewById(this.mFixedHeaderViewId);
            View viewFindViewById2 = findViewById(this.mFixedFooterViewId);
            this.mRefreshContent.setScrollBoundaryDecider(this.mScrollBoundaryDecider);
            this.mRefreshContent.setEnableLoadMoreWhenContentNotFull(this.mEnableLoadMoreWhenContentNotFull);
            this.mRefreshContent.setUpComponent(this.mKernel, viewFindViewById, viewFindViewById2);
        }
        RefreshInternal refreshInternal = this.mRefreshHeader;
        if (refreshInternal != null && refreshInternal.getSpinnerStyle().front) {
            super.bringChildToFront(this.mRefreshHeader.getView());
        }
        RefreshInternal refreshInternal2 = this.mRefreshFooter;
        if (refreshInternal2 != null && refreshInternal2.getSpinnerStyle().front) {
            super.bringChildToFront(this.mRefreshFooter.getView());
        }
        return this;
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshLayout
    public RefreshLayout setRefreshFooter(@NonNull RefreshFooter refreshFooter, int i, int i2) {
        RefreshInternal refreshInternal;
        RefreshInternal refreshInternal2 = this.mRefreshFooter;
        if (refreshInternal2 != null) {
            super.removeView(refreshInternal2.getView());
        }
        this.mRefreshFooter = refreshFooter;
        this.mFooterLocked = false;
        this.mFooterBackgroundColor = 0;
        this.mFooterNoMoreDataEffective = false;
        this.mFooterNeedTouchEventWhenLoading = false;
        this.mFooterHeightStatus = DimensionStatus.DefaultUnNotify;
        this.mEnableLoadMore = !this.mManualLoadMore || this.mEnableLoadMore;
        if (i == 0) {
            i = -1;
        }
        if (i2 == 0) {
            i2 = -2;
        }
        LayoutParams layoutParams = new LayoutParams(i, i2);
        ViewGroup.LayoutParams layoutParams2 = this.mRefreshFooter.getView().getLayoutParams();
        if (layoutParams2 instanceof LayoutParams) {
            layoutParams = (LayoutParams) layoutParams2;
        }
        if (this.mRefreshFooter.getSpinnerStyle().front) {
            super.addView(this.mRefreshFooter.getView(), getChildCount(), layoutParams);
        } else {
            super.addView(this.mRefreshFooter.getView(), 0, layoutParams);
        }
        int[] iArr = this.mPrimaryColors;
        if (iArr != null && (refreshInternal = this.mRefreshFooter) != null) {
            refreshInternal.setPrimaryColors(iArr);
        }
        return this;
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshLayout
    public RefreshLayout setRefreshHeader(@NonNull RefreshHeader refreshHeader, int i, int i2) {
        RefreshInternal refreshInternal;
        RefreshInternal refreshInternal2 = this.mRefreshHeader;
        if (refreshInternal2 != null) {
            super.removeView(refreshInternal2.getView());
        }
        this.mRefreshHeader = refreshHeader;
        this.mHeaderBackgroundColor = 0;
        this.mHeaderNeedTouchEventWhenRefreshing = false;
        this.mHeaderHeightStatus = DimensionStatus.DefaultUnNotify;
        if (i == 0) {
            i = -1;
        }
        if (i2 == 0) {
            i2 = -2;
        }
        LayoutParams layoutParams = new LayoutParams(i, i2);
        ViewGroup.LayoutParams layoutParams2 = this.mRefreshHeader.getView().getLayoutParams();
        if (layoutParams2 instanceof LayoutParams) {
            layoutParams = (LayoutParams) layoutParams2;
        }
        if (this.mRefreshHeader.getSpinnerStyle().front) {
            super.addView(this.mRefreshHeader.getView(), getChildCount(), layoutParams);
        } else {
            super.addView(this.mRefreshHeader.getView(), 0, layoutParams);
        }
        int[] iArr = this.mPrimaryColors;
        if (iArr != null && (refreshInternal = this.mRefreshHeader) != null) {
            refreshInternal.setPrimaryColors(iArr);
        }
        return this;
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshLayout
    public boolean autoRefresh(int i, final int i2, final float f, final boolean z) {
        if (this.mState != RefreshState.None || !isEnableRefreshOrLoadMore(this.mEnableRefresh)) {
            return false;
        }
        Runnable runnable = new Runnable() { // from class: com.scwang.smartrefresh.layout.SmartRefreshLayout.8
            @Override // java.lang.Runnable
            public void run() {
                SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
                if (smartRefreshLayout.mViceState != RefreshState.Refreshing) {
                    return;
                }
                ValueAnimator valueAnimator = smartRefreshLayout.reboundAnimator;
                if (valueAnimator != null) {
                    valueAnimator.setDuration(0L);
                    SmartRefreshLayout.this.reboundAnimator.cancel();
                    SmartRefreshLayout.this.reboundAnimator = null;
                }
                SmartRefreshLayout smartRefreshLayout2 = SmartRefreshLayout.this;
                smartRefreshLayout2.mLastTouchX = smartRefreshLayout2.getMeasuredWidth() / 2.0f;
                SmartRefreshLayout.this.mKernel.setState(RefreshState.PullDownToRefresh);
                SmartRefreshLayout smartRefreshLayout3 = SmartRefreshLayout.this;
                smartRefreshLayout3.reboundAnimator = ValueAnimator.ofInt(smartRefreshLayout3.mSpinner, (int) (smartRefreshLayout3.mHeaderHeight * f));
                SmartRefreshLayout.this.reboundAnimator.setDuration(i2);
                SmartRefreshLayout.this.reboundAnimator.setInterpolator(new SmartUtil(SmartUtil.INTERPOLATOR_VISCOUS_FLUID));
                SmartRefreshLayout.this.reboundAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.scwang.smartrefresh.layout.SmartRefreshLayout.8.1
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public void onAnimationUpdate(ValueAnimator valueAnimator2) {
                        SmartRefreshLayout smartRefreshLayout4 = SmartRefreshLayout.this;
                        if (smartRefreshLayout4.reboundAnimator == null || smartRefreshLayout4.mRefreshHeader == null) {
                            return;
                        }
                        smartRefreshLayout4.mKernel.moveSpinner(((Integer) valueAnimator2.getAnimatedValue()).intValue(), true);
                    }
                });
                SmartRefreshLayout.this.reboundAnimator.addListener(new AnimatorListenerAdapter() { // from class: com.scwang.smartrefresh.layout.SmartRefreshLayout.8.2
                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator animator) {
                        if (animator == null || animator.getDuration() != 0) {
                            SmartRefreshLayout smartRefreshLayout4 = SmartRefreshLayout.this;
                            smartRefreshLayout4.reboundAnimator = null;
                            if (smartRefreshLayout4.mRefreshHeader == null) {
                                smartRefreshLayout4.mKernel.setState(RefreshState.None);
                                return;
                            }
                            RefreshState refreshState = smartRefreshLayout4.mState;
                            RefreshState refreshState2 = RefreshState.ReleaseToRefresh;
                            if (refreshState != refreshState2) {
                                smartRefreshLayout4.mKernel.setState(refreshState2);
                            }
                            AnonymousClass8 anonymousClass8 = AnonymousClass8.this;
                            SmartRefreshLayout.this.setStateRefreshing(!z);
                        }
                    }
                });
                SmartRefreshLayout.this.reboundAnimator.start();
            }
        };
        setViceState(RefreshState.Refreshing);
        if (i > 0) {
            this.mHandler.postDelayed(runnable, i);
            return true;
        }
        runnable.run();
        return true;
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshLayout
    public RefreshLayout finishLoadMore(boolean z) {
        return finishLoadMore(z ? Math.min(Math.max(0, 300 - ((int) (System.currentTimeMillis() - this.mLastOpenTime))), 300) << 16 : 0, z, false);
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshLayout
    public RefreshLayout finishRefresh(boolean z) {
        if (z) {
            return finishRefresh(Math.min(Math.max(0, 300 - ((int) (System.currentTimeMillis() - this.mLastOpenTime))), 300) << 16, true, Boolean.FALSE);
        }
        return finishRefresh(0, false, null);
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshLayout
    public RefreshLayout finishLoadMore(int i, boolean z, boolean z2) {
        int i2 = i >> 16;
        int i3 = (i << 16) >> 16;
        AnonymousClass7 anonymousClass7 = new AnonymousClass7(i2, z2, z);
        if (i3 > 0) {
            this.mHandler.postDelayed(anonymousClass7, i3);
        } else {
            anonymousClass7.run();
        }
        return this;
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshLayout
    public RefreshLayout finishRefresh(int i, final boolean z, final Boolean bool) {
        final int i2 = i >> 16;
        int i3 = (i << 16) >> 16;
        Runnable runnable = new Runnable() { // from class: com.scwang.smartrefresh.layout.SmartRefreshLayout.6
            int count = 0;

            @Override // java.lang.Runnable
            public void run() {
                int i4 = this.count;
                if (i4 == 0) {
                    SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
                    RefreshState refreshState = smartRefreshLayout.mState;
                    RefreshState refreshState2 = RefreshState.None;
                    if (refreshState == refreshState2 && smartRefreshLayout.mViceState == RefreshState.Refreshing) {
                        smartRefreshLayout.mViceState = refreshState2;
                    } else {
                        ValueAnimator valueAnimator = smartRefreshLayout.reboundAnimator;
                        if (valueAnimator != null && refreshState.isHeader && (refreshState.isDragging || refreshState == RefreshState.RefreshReleased)) {
                            valueAnimator.setDuration(0L);
                            SmartRefreshLayout.this.reboundAnimator.cancel();
                            SmartRefreshLayout smartRefreshLayout2 = SmartRefreshLayout.this;
                            smartRefreshLayout2.reboundAnimator = null;
                            if (smartRefreshLayout2.mKernel.animSpinner(0) == null) {
                                SmartRefreshLayout.this.notifyStateChanged(refreshState2);
                            } else {
                                SmartRefreshLayout.this.notifyStateChanged(RefreshState.PullDownCanceled);
                            }
                        } else if (refreshState == RefreshState.Refreshing && smartRefreshLayout.mRefreshHeader != null && smartRefreshLayout.mRefreshContent != null) {
                            this.count = i4 + 1;
                            smartRefreshLayout.mHandler.postDelayed(this, i2);
                            SmartRefreshLayout.this.notifyStateChanged(RefreshState.RefreshFinish);
                            if (bool == Boolean.FALSE) {
                                SmartRefreshLayout.this.setNoMoreData(false);
                            }
                        }
                    }
                    if (bool == Boolean.TRUE) {
                        SmartRefreshLayout.this.setNoMoreData(true);
                        return;
                    }
                    return;
                }
                SmartRefreshLayout smartRefreshLayout3 = SmartRefreshLayout.this;
                int iOnFinish = smartRefreshLayout3.mRefreshHeader.onFinish(smartRefreshLayout3, z);
                SmartRefreshLayout smartRefreshLayout4 = SmartRefreshLayout.this;
                OnMultiPurposeListener onMultiPurposeListener = smartRefreshLayout4.mOnMultiPurposeListener;
                if (onMultiPurposeListener != null) {
                    RefreshInternal refreshInternal = smartRefreshLayout4.mRefreshHeader;
                    if (refreshInternal instanceof RefreshHeader) {
                        onMultiPurposeListener.onHeaderFinish((RefreshHeader) refreshInternal, z);
                    }
                }
                if (iOnFinish < Integer.MAX_VALUE) {
                    SmartRefreshLayout smartRefreshLayout5 = SmartRefreshLayout.this;
                    if (smartRefreshLayout5.mIsBeingDragged || smartRefreshLayout5.mNestedInProgress) {
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        SmartRefreshLayout smartRefreshLayout6 = SmartRefreshLayout.this;
                        if (smartRefreshLayout6.mIsBeingDragged) {
                            float f = smartRefreshLayout6.mLastTouchY;
                            smartRefreshLayout6.mTouchY = f;
                            smartRefreshLayout6.mTouchSpinner = 0;
                            smartRefreshLayout6.mIsBeingDragged = false;
                            SmartRefreshLayout.super.dispatchTouchEvent(MotionEvent.obtain(jCurrentTimeMillis, jCurrentTimeMillis, 0, smartRefreshLayout6.mLastTouchX, (f + smartRefreshLayout6.mSpinner) - (smartRefreshLayout6.mTouchSlop * 2), 0));
                            SmartRefreshLayout smartRefreshLayout7 = SmartRefreshLayout.this;
                            SmartRefreshLayout.super.dispatchTouchEvent(MotionEvent.obtain(jCurrentTimeMillis, jCurrentTimeMillis, 2, smartRefreshLayout7.mLastTouchX, smartRefreshLayout7.mLastTouchY + smartRefreshLayout7.mSpinner, 0));
                        }
                        SmartRefreshLayout smartRefreshLayout8 = SmartRefreshLayout.this;
                        if (smartRefreshLayout8.mNestedInProgress) {
                            smartRefreshLayout8.mTotalUnconsumed = 0;
                            SmartRefreshLayout.super.dispatchTouchEvent(MotionEvent.obtain(jCurrentTimeMillis, jCurrentTimeMillis, 1, smartRefreshLayout8.mLastTouchX, smartRefreshLayout8.mLastTouchY, 0));
                            SmartRefreshLayout smartRefreshLayout9 = SmartRefreshLayout.this;
                            smartRefreshLayout9.mNestedInProgress = false;
                            smartRefreshLayout9.mTouchSpinner = 0;
                        }
                    }
                    SmartRefreshLayout smartRefreshLayout10 = SmartRefreshLayout.this;
                    int i5 = smartRefreshLayout10.mSpinner;
                    if (i5 <= 0) {
                        if (i5 < 0) {
                            smartRefreshLayout10.animSpinner(0, iOnFinish, smartRefreshLayout10.mReboundInterpolator, smartRefreshLayout10.mReboundDuration);
                            return;
                        } else {
                            smartRefreshLayout10.mKernel.moveSpinner(0, false);
                            SmartRefreshLayout.this.mKernel.setState(RefreshState.None);
                            return;
                        }
                    }
                    ValueAnimator valueAnimatorAnimSpinner = smartRefreshLayout10.animSpinner(0, iOnFinish, smartRefreshLayout10.mReboundInterpolator, smartRefreshLayout10.mReboundDuration);
                    SmartRefreshLayout smartRefreshLayout11 = SmartRefreshLayout.this;
                    ValueAnimator.AnimatorUpdateListener animatorUpdateListenerScrollContentWhenFinished = smartRefreshLayout11.mEnableScrollContentWhenRefreshed ? smartRefreshLayout11.mRefreshContent.scrollContentWhenFinished(smartRefreshLayout11.mSpinner) : null;
                    if (valueAnimatorAnimSpinner == null || animatorUpdateListenerScrollContentWhenFinished == null) {
                        return;
                    }
                    valueAnimatorAnimSpinner.addUpdateListener(animatorUpdateListenerScrollContentWhenFinished);
                }
            }
        };
        if (i3 > 0) {
            this.mHandler.postDelayed(runnable, i3);
        } else {
            runnable.run();
        }
        return this;
    }

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {
        public int backgroundColor;
        public SpinnerStyle spinnerStyle;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.backgroundColor = 0;
            this.spinnerStyle = null;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.SmartRefreshLayout_Layout);
            this.backgroundColor = typedArrayObtainStyledAttributes.getColor(R.styleable.SmartRefreshLayout_Layout_layout_srlBackgroundColor, this.backgroundColor);
            int i = R.styleable.SmartRefreshLayout_Layout_layout_srlSpinnerStyle;
            if (typedArrayObtainStyledAttributes.hasValue(i)) {
                this.spinnerStyle = SpinnerStyle.values[typedArrayObtainStyledAttributes.getInt(i, SpinnerStyle.Translate.ordinal)];
            }
            typedArrayObtainStyledAttributes.recycle();
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
            this.backgroundColor = 0;
            this.spinnerStyle = null;
        }
    }
}
