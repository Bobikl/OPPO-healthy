package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.Interpolator;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.core.view.MotionEventCompat;
import androidx.core.view.ViewCompat;
import com.heytap.nearx.uikit.widget.NearRecyclerView;
import com.oplus.aiunit.vision.l0l;
import com.oplus.aiunit.vision.pjc;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes12.dex */
public class InnerColorRecyclerView extends RecyclerView {
    public static final int CENTER_ALIGN = 2;
    private static final int DEBUG_PAINT_TEXT_OFFSET_Y = 50;
    private static final int DEBUG_PAINT_TEXT_SIZE = 30;
    public static final int FLING = 1;
    private static final int FLING_SCROLL_THRESHOLD = 1500;
    private static final float HORIZONTAL_SPRING_BACK_TENSION_MULTIPLE = 3.2f;
    private static final int INVALID_POINTER = -1;
    private static final boolean Near_DEBUG = false;
    public static final int OVER_FLING = 3;
    public static final int OVER_SCROLLING = 2;
    private static final int OVER_SCROLL_TOUCH_DURATION_THRESHOLD = 100;
    private static final int OVER_SCROLL_TOUCH_OFFSET_THRESHOLD = 10;
    public static final int SCROLLING = 0;
    private static final int SLOW_SCROLL_THRESHOLD = 250;
    public static final int START_ALIGN = 1;
    static final String TAG = "NearRecyclerView";
    private static final float VERTICAL_SPRING_BACK_TENSION_MULTIPLE = 2.15f;
    private float mClickVelocityX;
    private float mClickVelocityY;
    private Paint mDebugPaint;
    private boolean mEnableFlingSpeedIncrease;
    private boolean mEnablePointerDown;
    private float mFlingVelocityX;
    private float mFlingVelocityY;
    private boolean mIgnoreMotionEventTillDown;
    private int mInitialTouchX;
    private int mInitialTouchY;
    private RecyclerView.OnItemTouchListener mInterceptingOnItemTouchListener;
    private boolean mIsOverScrollingFling;
    private boolean mIsTouchDownWhileOverScrolling;
    private boolean mIsTouchDownWhileSlowScrolling;
    private boolean mIsUseNativeOverScroll;
    private boolean mItemClickableWhileOverScrolling;
    private boolean mItemClickableWhileSlowScrolling;
    private int mLastTouchX;
    private int mLastTouchY;
    private NearFlingLocateHelper mLocateHelper;
    private final int mMaxFlingVelocity;
    private final int mMinFlingVelocity;
    private NearLocateOverScroller mNearLocateOverScroller;
    private final int[] mNestedOffsets;
    private RecyclerView.OnFlingListener mOnFlingListener;
    private ArrayList<RecyclerView.OnItemTouchListener> mOnItemTouchListeners;
    boolean mOverScrollEnable;
    private NearIOverScroller mOverScroller;
    private int mOverflingDistance;
    private int mOverscrollDistance;
    private int mScreenHeight;
    private int mScreenWidth;
    private final int[] mScrollOffset;
    private int mScrollPointerId;
    private int mScrollState;
    private int mScrollType;
    private SpringOverScroller mSpringOverScroller;
    private int mTouchSlop;
    private long mTouchTime;
    private VelocityTracker mVelocityTracker;
    private ViewFlinger mViewFlinger;

    public class ViewFlinger implements Runnable {
        private int mLastFlingX;
        private int mLastFlingY;
        Interpolator mInterpolator = RecyclerView.sQuinticInterpolator;
        private boolean mEatRunOnAnimationRequest = false;
        private boolean mReSchedulePostAnimationCallback = false;

        public ViewFlinger() {
        }

        private int computeScrollDuration(int i, int i2, int i3, int i4) {
            int iRound;
            int iAbs = Math.abs(i);
            int iAbs2 = Math.abs(i2);
            boolean z = iAbs > iAbs2;
            int iSqrt = (int) Math.sqrt((i3 * i3) + (i4 * i4));
            int iSqrt2 = (int) Math.sqrt((i * i) + (i2 * i2));
            InnerColorRecyclerView innerColorRecyclerView = InnerColorRecyclerView.this;
            int width = z ? innerColorRecyclerView.getWidth() : innerColorRecyclerView.getHeight();
            int i5 = width / 2;
            float f = width;
            float f2 = i5;
            float fDistanceInfluenceForSnapDuration = f2 + (distanceInfluenceForSnapDuration(Math.min(1.0f, (iSqrt2 * 1.0f) / f)) * f2);
            if (iSqrt > 0) {
                iRound = Math.round(Math.abs(fDistanceInfluenceForSnapDuration / iSqrt) * 1000.0f) * 4;
            } else {
                if (!z) {
                    iAbs = iAbs2;
                }
                iRound = (int) (((iAbs / f) + 1.0f) * 300.0f);
            }
            return Math.min(iRound, 2000);
        }

        private float distanceInfluenceForSnapDuration(float f) {
            return (float) Math.sin((f - 0.5f) * 0.47123894f);
        }

        private void internalPostOnAnimation() {
            InnerColorRecyclerView.this.removeCallbacks(this);
            ViewCompat.postOnAnimation(InnerColorRecyclerView.this, this);
        }

        public void fling(int i, int i2) {
            InnerColorRecyclerView.this.mFlingVelocityX = i;
            InnerColorRecyclerView.this.mFlingVelocityY = i2;
            InnerColorRecyclerView.this.setScrollState(2);
            this.mLastFlingY = 0;
            this.mLastFlingX = 0;
            Interpolator interpolator = this.mInterpolator;
            Interpolator interpolator2 = RecyclerView.sQuinticInterpolator;
            if (interpolator != interpolator2) {
                this.mInterpolator = interpolator2;
                InnerColorRecyclerView.this.mOverScroller.setInterpolator(interpolator2);
            }
            InnerColorRecyclerView.this.mOverScroller.fling(0, 0, i, i2, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
            InnerColorRecyclerView.this.mOverScroller.setFinalX(InnerColorRecyclerView.this.mLocateHelper.getTargetViewDistance(InnerColorRecyclerView.this.mOverScroller.getNearFinalX()));
            postOnAnimation();
        }

        public void postOnAnimation() {
            if (this.mEatRunOnAnimationRequest) {
                this.mReSchedulePostAnimationCallback = true;
            } else {
                internalPostOnAnimation();
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            int i;
            int i2;
            InnerColorRecyclerView innerColorRecyclerView = InnerColorRecyclerView.this;
            if (innerColorRecyclerView.mLayout == null) {
                stop();
                return;
            }
            this.mReSchedulePostAnimationCallback = false;
            this.mEatRunOnAnimationRequest = true;
            innerColorRecyclerView.consumePendingUpdateOperations();
            NearIOverScroller nearIOverScroller = InnerColorRecyclerView.this.mOverScroller;
            if (nearIOverScroller.computeScrollOffset()) {
                int nearCurrX = nearIOverScroller.getNearCurrX();
                int nearCurrY = nearIOverScroller.getNearCurrY();
                int i3 = nearCurrX - this.mLastFlingX;
                int i4 = nearCurrY - this.mLastFlingY;
                this.mLastFlingX = nearCurrX;
                this.mLastFlingY = nearCurrY;
                InnerColorRecyclerView innerColorRecyclerView2 = InnerColorRecyclerView.this;
                int[] iArr = innerColorRecyclerView2.mReusableIntPair;
                iArr[0] = 0;
                iArr[1] = 0;
                if (innerColorRecyclerView2.dispatchNestedPreScroll(i3, i4, iArr, null, 1)) {
                    int[] iArr2 = InnerColorRecyclerView.this.mReusableIntPair;
                    i3 -= iArr2[0];
                    i4 -= iArr2[1];
                }
                InnerColorRecyclerView innerColorRecyclerView3 = InnerColorRecyclerView.this;
                if (innerColorRecyclerView3.mAdapter != null) {
                    int[] iArr3 = innerColorRecyclerView3.mReusableIntPair;
                    iArr3[0] = 0;
                    iArr3[1] = 0;
                    innerColorRecyclerView3.scrollStep(i3, i4, iArr3);
                    InnerColorRecyclerView innerColorRecyclerView4 = InnerColorRecyclerView.this;
                    int[] iArr4 = innerColorRecyclerView4.mReusableIntPair;
                    i2 = iArr4[0];
                    i = iArr4[1];
                    i3 -= i2;
                    i4 -= i;
                    RecyclerView.SmoothScroller smoothScroller = innerColorRecyclerView4.mLayout.mSmoothScroller;
                    if (smoothScroller != null && !smoothScroller.isPendingInitialRun() && smoothScroller.isRunning()) {
                        int itemCount = InnerColorRecyclerView.this.mState.getItemCount();
                        if (itemCount == 0) {
                            smoothScroller.stop();
                        } else if (smoothScroller.getTargetPosition() >= itemCount) {
                            smoothScroller.setTargetPosition(itemCount - 1);
                            smoothScroller.onAnimation(i2, i);
                        } else {
                            smoothScroller.onAnimation(i2, i);
                        }
                    }
                } else {
                    i = 0;
                    i2 = 0;
                }
                if (!InnerColorRecyclerView.this.mItemDecorations.isEmpty()) {
                    InnerColorRecyclerView.this.invalidate();
                }
                InnerColorRecyclerView innerColorRecyclerView5 = InnerColorRecyclerView.this;
                int[] iArr5 = innerColorRecyclerView5.mReusableIntPair;
                iArr5[0] = 0;
                iArr5[1] = 0;
                innerColorRecyclerView5.dispatchNestedScroll(i2, i, i3, i4, null, 1, iArr5);
                InnerColorRecyclerView innerColorRecyclerView6 = InnerColorRecyclerView.this;
                int[] iArr6 = innerColorRecyclerView6.mReusableIntPair;
                int i5 = i3 - iArr6[0];
                int i6 = i4 - iArr6[1];
                if (i2 != 0 || i != 0) {
                    innerColorRecyclerView6.dispatchOnScrolled(i2, i);
                }
                if (i6 != 0) {
                    InnerColorRecyclerView innerColorRecyclerView7 = InnerColorRecyclerView.this;
                    if (innerColorRecyclerView7.mOverScrollEnable) {
                        innerColorRecyclerView7.mScrollType = 3;
                        InnerColorRecyclerView.this.performHapticFeedback(307);
                        InnerColorRecyclerView innerColorRecyclerView8 = InnerColorRecyclerView.this;
                        innerColorRecyclerView8.overScrollBy(0, i6, 0, innerColorRecyclerView8.getScrollY(), 0, 0, 0, InnerColorRecyclerView.this.mOverflingDistance, false);
                        if (InnerColorRecyclerView.this.mIsUseNativeOverScroll) {
                            InnerColorRecyclerView.this.mSpringOverScroller.setCurrVelocityY(nearIOverScroller.getCurrVelocityY());
                            InnerColorRecyclerView.this.mSpringOverScroller.notifyVerticalEdgeReached(i6, 0, InnerColorRecyclerView.this.mOverflingDistance);
                        } else {
                            InnerColorRecyclerView.this.mOverScroller.notifyVerticalEdgeReached(i6, 0, InnerColorRecyclerView.this.mOverflingDistance);
                        }
                    }
                }
                if (i5 != 0) {
                    InnerColorRecyclerView innerColorRecyclerView9 = InnerColorRecyclerView.this;
                    if (innerColorRecyclerView9.mOverScrollEnable) {
                        innerColorRecyclerView9.mScrollType = 3;
                        InnerColorRecyclerView.this.performHapticFeedback(307);
                        InnerColorRecyclerView innerColorRecyclerView10 = InnerColorRecyclerView.this;
                        innerColorRecyclerView10.overScrollBy(i5, 0, innerColorRecyclerView10.getScrollX(), 0, 0, 0, InnerColorRecyclerView.this.mOverflingDistance, 0, false);
                        if (InnerColorRecyclerView.this.mIsUseNativeOverScroll) {
                            InnerColorRecyclerView.this.mSpringOverScroller.setCurrVelocityX(nearIOverScroller.getCurrVelocityX());
                            InnerColorRecyclerView.this.mSpringOverScroller.notifyHorizontalEdgeReached(i5, 0, InnerColorRecyclerView.this.mOverflingDistance);
                        } else {
                            InnerColorRecyclerView.this.mOverScroller.notifyHorizontalEdgeReached(i5, 0, InnerColorRecyclerView.this.mOverflingDistance);
                        }
                    }
                }
                if (!InnerColorRecyclerView.this.awakenScrollBars()) {
                    InnerColorRecyclerView.this.invalidate();
                }
                boolean z = nearIOverScroller.isNearFinished() || (((nearIOverScroller.getNearCurrX() == nearIOverScroller.getNearFinalX()) || i5 != 0) && ((nearIOverScroller.getNearCurrY() == nearIOverScroller.getNearFinalY()) || i6 != 0));
                RecyclerView.SmoothScroller smoothScroller2 = InnerColorRecyclerView.this.mLayout.mSmoothScroller;
                if ((smoothScroller2 != null && smoothScroller2.isPendingInitialRun()) || !z) {
                    postOnAnimation();
                    InnerColorRecyclerView innerColorRecyclerView11 = InnerColorRecyclerView.this;
                    GapWorker gapWorker = innerColorRecyclerView11.mGapWorker;
                    if (gapWorker != null) {
                        gapWorker.postFromTraversal(innerColorRecyclerView11, i2, i);
                    }
                } else if (RecyclerView.ALLOW_THREAD_GAP_WORK) {
                    InnerColorRecyclerView.this.mPrefetchRegistry.clearPrefetchPositions();
                }
            }
            RecyclerView.SmoothScroller smoothScroller3 = InnerColorRecyclerView.this.mLayout.mSmoothScroller;
            if (smoothScroller3 != null && smoothScroller3.isPendingInitialRun()) {
                smoothScroller3.onAnimation(0, 0);
            }
            this.mEatRunOnAnimationRequest = false;
            if (this.mReSchedulePostAnimationCallback) {
                internalPostOnAnimation();
            } else {
                if (InnerColorRecyclerView.this.mScrollType == 3 && InnerColorRecyclerView.this.mOverScrollEnable) {
                    return;
                }
                InnerColorRecyclerView.this.setScrollState(0);
                InnerColorRecyclerView.this.stopNestedScroll(1);
            }
        }

        public void smoothScrollBy(int i, int i2, int i3, @Nullable Interpolator interpolator) {
            if (i3 == Integer.MIN_VALUE) {
                i3 = computeScrollDuration(i, i2, 0, 0);
            }
            int i4 = i3;
            if (interpolator == null) {
                interpolator = RecyclerView.sQuinticInterpolator;
            }
            if (this.mInterpolator != interpolator) {
                this.mInterpolator = interpolator;
                InnerColorRecyclerView.this.mOverScroller.setInterpolator(interpolator);
            }
            this.mLastFlingY = 0;
            this.mLastFlingX = 0;
            InnerColorRecyclerView.this.setScrollState(2);
            InnerColorRecyclerView.this.mOverScroller.startScroll(0, 0, i, i2, i4);
            postOnAnimation();
        }

        public void stop() {
            InnerColorRecyclerView.this.removeCallbacks(this);
            InnerColorRecyclerView innerColorRecyclerView = InnerColorRecyclerView.this;
            innerColorRecyclerView.initOverScroller(innerColorRecyclerView.getContext());
            InnerColorRecyclerView.this.mOverScroller.abortAnimation();
            InnerColorRecyclerView.this.mSpringOverScroller.abortAnimation();
        }
    }

    public InnerColorRecyclerView(@NonNull Context context) {
        this(context, null);
    }

    private void cancelScroll() {
        resetScroll();
        setScrollState(0);
        l0l.b(this, 0);
        l0l.c(this, 0);
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

    private boolean dispatchToOnItemTouchListeners(MotionEvent motionEvent) {
        RecyclerView.OnItemTouchListener onItemTouchListener = this.mInterceptingOnItemTouchListener;
        if (onItemTouchListener == null) {
            if (motionEvent.getAction() == 0) {
                return false;
            }
            return findInterceptingOnItemTouchListener(motionEvent);
        }
        onItemTouchListener.onTouchEvent(this, motionEvent);
        int action = motionEvent.getAction();
        if (action == 3 || action == 1) {
            this.mInterceptingOnItemTouchListener = null;
        }
        return true;
    }

    private boolean findInterceptingOnItemTouchListener(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        int size = this.mOnItemTouchListeners.size();
        for (int i = 0; i < size; i++) {
            RecyclerView.OnItemTouchListener onItemTouchListener = this.mOnItemTouchListeners.get(i);
            if (onItemTouchListener.onInterceptTouchEvent(this, motionEvent) && action != 3) {
                this.mInterceptingOnItemTouchListener = onItemTouchListener;
                return true;
            }
        }
        return false;
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

    private String getFullClassName(Context context, String str) {
        if (str.charAt(0) == '.') {
            return context.getPackageName() + str;
        }
        if (str.contains(".")) {
            return str;
        }
        return NearRecyclerView.class.getPackage().getName() + '.' + str;
    }

    private void initOnItemTouchListeners() {
        if (this.mOnItemTouchListeners == null) {
            this.mOnItemTouchListeners = new ArrayList<>();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void initOverScroller(Context context) {
        if (this.mOverScroller == null) {
            this.mSpringOverScroller = new SpringOverScroller(context);
            this.mNearLocateOverScroller = new NearLocateOverScroller(context);
            setIsUseNativeOverScroll(false);
            setEnableFlingSpeedIncrease(this.mEnableFlingSpeedIncrease);
        }
    }

    private void initProperty(Context context) {
        int i = context.getResources().getDisplayMetrics().heightPixels;
        this.mOverscrollDistance = i;
        this.mOverflingDistance = i;
    }

    private void initViewFlinger() {
        if (this.mViewFlinger == null) {
            this.mViewFlinger = new ViewFlinger();
        }
    }

    private boolean isClickEvent(MotionEvent motionEvent) {
        int x = (int) (motionEvent.getX() - this.mInitialTouchX);
        int y = (int) (motionEvent.getY() - this.mInitialTouchY);
        return System.currentTimeMillis() - this.mTouchTime < 100 && ((int) Math.sqrt((double) ((x * x) + (y * y)))) < 10;
    }

    private boolean isOverScrolling() {
        return this.mOverScrollEnable && this.mScrollType == 2 && !(getScrollX() == 0 && getScrollY() == 0);
    }

    private boolean needLocate() {
        return getLayoutManager() != null && (getLayoutManager() instanceof LinearLayoutManager) && ((LinearLayoutManager) getLayoutManager()).getOrientation() == 0;
    }

    private void onPointerUp(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.mScrollPointerId) {
            int i = actionIndex == 0 ? 1 : 0;
            this.mScrollPointerId = motionEvent.getPointerId(i);
            int x = (int) (motionEvent.getX(i) + 0.5f);
            this.mLastTouchX = x;
            this.mInitialTouchX = x;
            int y = (int) (motionEvent.getY(i) + 0.5f);
            this.mLastTouchY = y;
            this.mInitialTouchY = y;
        }
    }

    private void resetScroll() {
        VelocityTracker velocityTracker = this.mVelocityTracker;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        stopNestedScroll(0);
    }

    private void stopScrollersInternal() {
        initViewFlinger();
        this.mViewFlinger.stop();
        RecyclerView.LayoutManager layoutManager = this.mLayout;
        if (layoutManager != null) {
            layoutManager.stopSmoothScroller();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void addOnItemTouchListener(@NonNull RecyclerView.OnItemTouchListener onItemTouchListener) {
        initOnItemTouchListeners();
        this.mOnItemTouchListeners.add(onItemTouchListener);
    }

    public void cancelHorizontalItemAlign() {
        this.mLocateHelper.cancelHorizontalItemAlign();
    }

    @Override // android.view.View
    public void computeScroll() {
        if (this.mIsOverScrollingFling) {
            int scrollX = getScrollX();
            int scrollY = getScrollY();
            if (scrollX == 0 || scrollY == 0) {
                overScrollBy(-scrollX, -scrollY, scrollX, scrollY, 0, 0, 0, 0, false);
                onScrollChanged(getScrollX(), getScrollY(), scrollX, scrollY);
                this.mIsOverScrollingFling = false;
                int currVelocityX = (int) this.mSpringOverScroller.getCurrVelocityX();
                int currVelocityY = (int) this.mSpringOverScroller.getCurrVelocityY();
                this.mSpringOverScroller.abortAnimation();
                setScrollState(0);
                fling(currVelocityX, currVelocityY);
                return;
            }
        }
        if (this.mOverScrollEnable) {
            int i = this.mScrollType;
            if (i == 2 || i == 3) {
                SpringOverScroller springOverScroller = this.mSpringOverScroller;
                if (springOverScroller.computeScrollOffset()) {
                    int scrollX2 = getScrollX();
                    int scrollY2 = getScrollY();
                    int nearCurrX = springOverScroller.getNearCurrX();
                    int nearCurrY = springOverScroller.getNearCurrY();
                    if (scrollX2 != nearCurrX || scrollY2 != nearCurrY) {
                        int i2 = this.mOverflingDistance;
                        overScrollBy(nearCurrX - scrollX2, nearCurrY - scrollY2, scrollX2, scrollY2, 0, 0, i2, i2, false);
                        onScrollChanged(getScrollX(), getScrollY(), scrollX2, scrollY2);
                    }
                    if (springOverScroller.isNearFinished()) {
                        setScrollState(0);
                    } else {
                        setScrollState(2);
                    }
                    if (awakenScrollBars()) {
                        return;
                    }
                    postInvalidateOnAnimation();
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() != 5 || this.mEnablePointerDown) {
            return super.dispatchTouchEvent(motionEvent);
        }
        getParent().requestDisallowInterceptTouchEvent(true);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5 */
    @Override // androidx.recyclerview.widget.RecyclerView
    public boolean fling(int i, int i2) {
        RecyclerView.LayoutManager layoutManager = this.mLayout;
        if (layoutManager == null) {
            Log.e(TAG, "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return false;
        }
        if (this.mLayoutSuppressed) {
            return false;
        }
        int iCanScrollHorizontally = layoutManager.canScrollHorizontally();
        boolean zCanScrollVertically = this.mLayout.canScrollVertically();
        if (iCanScrollHorizontally == 0 || Math.abs(i) < this.mMinFlingVelocity) {
            i = 0;
        }
        if (!zCanScrollVertically || Math.abs(i2) < this.mMinFlingVelocity) {
            i2 = 0;
        }
        if (i == 0 && i2 == 0) {
            return false;
        }
        float f = i;
        float f2 = i2;
        if (!dispatchNestedPreFling(f, f2)) {
            this.mScrollType = 1;
            boolean z = iCanScrollHorizontally != 0 || zCanScrollVertically;
            dispatchNestedFling(f, f2, z);
            RecyclerView.OnFlingListener onFlingListener = this.mOnFlingListener;
            if (onFlingListener != null && onFlingListener.onFling(i, i2)) {
                return true;
            }
            if (z) {
                if (zCanScrollVertically) {
                    iCanScrollHorizontally = (iCanScrollHorizontally == true ? 1 : 0) | 2;
                }
                startNestedScroll(iCanScrollHorizontally, 1);
                int i3 = this.mMaxFlingVelocity;
                int iMax = Math.max(-i3, Math.min(i, i3));
                int i4 = this.mMaxFlingVelocity;
                this.mViewFlinger.fling(iMax, Math.max(-i4, Math.min(i2, i4)));
                return true;
            }
        }
        return false;
    }

    public int getHorizontalItemAlign() {
        return this.mLocateHelper.getHorizontalItemAlign();
    }

    public boolean getIsUseNativeOverScroll() {
        return this.mIsUseNativeOverScroll;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public int getMaxFlingVelocity() {
        return this.mMaxFlingVelocity;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public int getMinFlingVelocity() {
        return this.mMinFlingVelocity;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    @Nullable
    public RecyclerView.OnFlingListener getOnFlingListener() {
        return this.mOnFlingListener;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public int getScrollState() {
        return this.mScrollState;
    }

    public int getScrollType() {
        return this.mScrollType;
    }

    public ViewFlinger getViewFlinger() {
        return this.mViewFlinger;
    }

    public void invalidateParentIfNeeded() {
        if (isHardwareAccelerated() && (getParent() instanceof View)) {
            ((View) getParent()).invalidate();
        }
    }

    public boolean isEnableFlingSpeedIncrease() {
        SpringOverScroller springOverScroller = this.mSpringOverScroller;
        if (springOverScroller != null) {
            return springOverScroller.isEnableFlingSpeedIncrease();
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        cancelScroll();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        if (this.mLayoutSuppressed) {
            return false;
        }
        this.mInterceptingOnItemTouchListener = null;
        if (findInterceptingOnItemTouchListener(motionEvent)) {
            cancelScroll();
            return true;
        }
        RecyclerView.LayoutManager layoutManager = this.mLayout;
        if (layoutManager == null) {
            return false;
        }
        boolean zCanScrollHorizontally = layoutManager.canScrollHorizontally();
        boolean zCanScrollVertically = this.mLayout.canScrollVertically();
        if (this.mVelocityTracker == null) {
            this.mVelocityTracker = VelocityTracker.obtain();
        }
        this.mVelocityTracker.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            if (this.mIgnoreMotionEventTillDown) {
                this.mIgnoreMotionEventTillDown = false;
            }
            NearIOverScroller nearIOverScroller = this.mOverScroller;
            float currVelocityX = nearIOverScroller != null ? nearIOverScroller.getCurrVelocityX() : 0.0f;
            NearIOverScroller nearIOverScroller2 = this.mOverScroller;
            float currVelocityY = nearIOverScroller2 != null ? nearIOverScroller2.getCurrVelocityY() : 0.0f;
            this.mIsTouchDownWhileSlowScrolling = (Math.abs(currVelocityX) > 0.0f && Math.abs(currVelocityX) < 250.0f && ((Math.abs(this.mFlingVelocityX) > 1500.0f ? 1 : (Math.abs(this.mFlingVelocityX) == 1500.0f ? 0 : -1)) > 0)) || (Math.abs(currVelocityY) > 0.0f && Math.abs(currVelocityY) < 250.0f && ((Math.abs(this.mFlingVelocityY) > 1500.0f ? 1 : (Math.abs(this.mFlingVelocityY) == 1500.0f ? 0 : -1)) > 0));
            this.mIsTouchDownWhileOverScrolling = isOverScrolling();
            this.mTouchTime = System.currentTimeMillis();
            this.mScrollPointerId = motionEvent.getPointerId(0);
            int x = (int) (motionEvent.getX() + 0.5f);
            this.mLastTouchX = x;
            this.mInitialTouchX = x;
            int y = (int) (motionEvent.getY() + 0.5f);
            this.mLastTouchY = y;
            this.mInitialTouchY = y;
            if (this.mScrollState == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                setScrollState(1);
                stopNestedScroll(1);
            }
            int[] iArr = this.mNestedOffsets;
            iArr[1] = 0;
            iArr[0] = 0;
            int i = zCanScrollHorizontally;
            if (zCanScrollVertically) {
                i = (zCanScrollHorizontally ? 1 : 0) | 2;
            }
            startNestedScroll(i, 0);
        } else if (actionMasked == 1) {
            this.mVelocityTracker.clear();
            stopNestedScroll(0);
        } else if (actionMasked == 2) {
            int iFindPointerIndex = motionEvent.findPointerIndex(this.mScrollPointerId);
            if (iFindPointerIndex < 0) {
                Log.e(TAG, "Error processing scroll; pointer index for id " + this.mScrollPointerId + " not found. Did any MotionEvents get skipped?");
                return false;
            }
            int x2 = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
            int y2 = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
            if (this.mScrollState != 1) {
                int i2 = x2 - this.mInitialTouchX;
                int i3 = y2 - this.mInitialTouchY;
                if (!zCanScrollHorizontally || Math.abs(i2) <= this.mTouchSlop) {
                    z = false;
                } else {
                    this.mLastTouchX = x2;
                    z = true;
                }
                if (zCanScrollVertically && Math.abs(i3) > this.mTouchSlop) {
                    this.mLastTouchY = y2;
                    z = true;
                }
                if (z) {
                    setScrollState(1);
                }
            }
        } else if (actionMasked == 3) {
            cancelScroll();
        } else if (actionMasked == 5) {
            this.mScrollPointerId = motionEvent.getPointerId(actionIndex);
            int x3 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.mLastTouchX = x3;
            this.mInitialTouchX = x3;
            int y3 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.mLastTouchY = y3;
            this.mInitialTouchY = y3;
            if (!this.mEnablePointerDown) {
                getParent().requestDisallowInterceptTouchEvent(true);
                return true;
            }
        } else if (actionMasked == 6) {
            onPointerUp(motionEvent);
        }
        return this.mScrollState == 1;
    }

    @Override // android.view.View
    public void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        if (getScrollY() == i2 && getScrollX() == i) {
            return;
        }
        if (this.mScrollType == 3) {
            i = pjc.a(0, i + 0, this.mScreenWidth);
            i2 = pjc.a(0, i2 + 0, this.mScreenHeight);
        }
        onScrollChanged(i, i2, getScrollX(), getScrollY());
        l0l.b(this, i);
        l0l.c(this, i2);
        invalidateParentIfNeeded();
        awakenScrollBars();
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
        this.mScreenWidth = displayMetrics.widthPixels;
        this.mScreenHeight = displayMetrics.heightPixels;
    }

    /* JADX WARN: Code duplicated, block: B:54:0x0119  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v26 */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r14v0, types: [android.view.View, androidx.recyclerview.widget.InnerColorRecyclerView, androidx.recyclerview.widget.RecyclerView] */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v19 */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r7v22 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v5 */
    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        ?? r7;
        boolean z2 = false;
        if (this.mLayoutSuppressed || this.mIgnoreMotionEventTillDown) {
            return false;
        }
        if (dispatchToOnItemTouchListeners(motionEvent)) {
            cancelScroll();
            return true;
        }
        RecyclerView.LayoutManager layoutManager = this.mLayout;
        if (layoutManager == null) {
            return false;
        }
        ?? CanScrollHorizontally = layoutManager.canScrollHorizontally();
        boolean zCanScrollVertically = this.mLayout.canScrollVertically();
        if (this.mVelocityTracker == null) {
            this.mVelocityTracker = VelocityTracker.obtain();
        }
        if (this.mOverScrollEnable) {
            this.mVelocityTracker.addMovement(motionEvent);
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            int[] iArr = this.mNestedOffsets;
            iArr[1] = 0;
            iArr[0] = 0;
        }
        int[] iArr2 = this.mNestedOffsets;
        motionEventObtain.offsetLocation(iArr2[0], iArr2[1]);
        if (actionMasked == 0) {
            this.mScrollPointerId = motionEvent.getPointerId(0);
            int x = (int) (motionEvent.getX() + 0.5f);
            this.mLastTouchX = x;
            this.mInitialTouchX = x;
            int y = (int) (motionEvent.getY() + 0.5f);
            this.mLastTouchY = y;
            this.mInitialTouchY = y;
            if ((!this.mOverScroller.isNearFinished() || !this.mSpringOverScroller.isNearFinished()) && this.mOverScrollEnable) {
                this.mOverScroller.abortAnimation();
                this.mSpringOverScroller.abortAnimation();
            }
            if (zCanScrollVertically) {
                CanScrollHorizontally = (CanScrollHorizontally == true ? 1 : 0) | 2;
            }
            startNestedScroll(CanScrollHorizontally, 0);
        } else if (actionMasked == 1) {
            if (this.mOverScrollEnable) {
                z = false;
            } else {
                this.mVelocityTracker.addMovement(motionEventObtain);
                z = true;
            }
            this.mVelocityTracker.computeCurrentVelocity(1000, this.mMaxFlingVelocity);
            float f = CanScrollHorizontally != 0 ? -this.mVelocityTracker.getXVelocity(this.mScrollPointerId) : 0.0f;
            float f2 = zCanScrollVertically ? -this.mVelocityTracker.getYVelocity(this.mScrollPointerId) : 0.0f;
            boolean zIsOverScrolling = isOverScrolling();
            ?? r8 = this.mItemClickableWhileSlowScrolling && this.mIsTouchDownWhileSlowScrolling;
            ?? r9 = this.mItemClickableWhileOverScrolling && this.mIsTouchDownWhileOverScrolling && zIsOverScrolling;
            if (r8 != false || r9 != false) {
                findViewToDispatchClickEvent(motionEvent);
            }
            if (zIsOverScrolling) {
                if (Math.abs(f2) > 1500.0f || Math.abs(f) > 1500.0f) {
                    this.mOverScroller.setCurrVelocityX(f);
                    this.mOverScroller.setCurrVelocityY(f2);
                    if (f2 * getScrollY() < 0.0f || f * getScrollX() < 0.0f) {
                        this.mIsOverScrollingFling = true;
                    }
                }
                if (this.mSpringOverScroller.springBack(getScrollX(), getScrollY(), 0, 0, 0, 0)) {
                    performHapticFeedback(307);
                    this.mSpringOverScroller.setRefreshRate(getDisplay().getRefreshRate());
                    postInvalidateOnAnimation();
                    if (this.mScrollState != 0) {
                        this.mScrollState = 0;
                        dispatchOnScrollStateChanged(0);
                    }
                }
            } else if ((f == 0.0f && f2 == 0.0f) || !fling((int) f, (int) f2)) {
                setScrollState(0);
            }
            resetScroll();
            z2 = z;
        } else if (actionMasked == 2) {
            int iFindPointerIndex = motionEvent.findPointerIndex(this.mScrollPointerId);
            if (iFindPointerIndex < 0) {
                Log.e(TAG, "Error processing scroll; pointer index for id " + this.mScrollPointerId + " not found. Did any MotionEvents get skipped?");
                motionEventObtain.recycle();
                return false;
            }
            int x2 = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
            int y2 = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
            int i = this.mLastTouchX - x2;
            int i2 = this.mLastTouchY - y2;
            int[] iArr3 = this.mReusableIntPair;
            iArr3[0] = 0;
            iArr3[1] = 0;
            if (dispatchNestedPreScroll(i, i2, iArr3, this.mScrollOffset, 0)) {
                int[] iArr4 = this.mReusableIntPair;
                i -= iArr4[0];
                i2 -= iArr4[1];
                int[] iArr5 = this.mScrollOffset;
                motionEventObtain.offsetLocation(iArr5[0], iArr5[1]);
                int[] iArr6 = this.mNestedOffsets;
                int i3 = iArr6[0];
                int[] iArr7 = this.mScrollOffset;
                iArr6[0] = i3 + iArr7[0];
                iArr6[1] = iArr6[1] + iArr7[1];
            }
            if (this.mScrollState != 1) {
                if (CanScrollHorizontally != 0) {
                    int iAbs = Math.abs(i);
                    int i4 = this.mTouchSlop;
                    if (iAbs > i4) {
                        i = i > 0 ? i - i4 : i + i4;
                        r7 = true;
                    } else {
                        r7 = false;
                    }
                } else {
                    r7 = false;
                }
                if (zCanScrollVertically) {
                    int iAbs2 = Math.abs(i2);
                    int i5 = this.mTouchSlop;
                    if (iAbs2 > i5) {
                        i2 = i2 > 0 ? i2 - i5 : i2 + i5;
                        r7 = true;
                    }
                }
                if (r7 != false) {
                    setScrollState(1);
                }
            }
            if (this.mScrollState == 1) {
                int[] iArr8 = this.mScrollOffset;
                this.mLastTouchX = x2 - iArr8[0];
                this.mLastTouchY = y2 - iArr8[1];
                if (this.mOverScrollEnable) {
                    this.mScrollType = 0;
                }
                if (scrollByInternal(CanScrollHorizontally != 0 ? i : 0, zCanScrollVertically ? i2 : 0, motionEventObtain)) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                }
                GapWorker gapWorker = this.mGapWorker;
                if (gapWorker != null && (i != 0 || i2 != 0)) {
                    gapWorker.postFromTraversal(this, i, i2);
                }
            }
        } else if (actionMasked == 3) {
            cancelScroll();
        } else if (actionMasked == 5) {
            this.mScrollPointerId = motionEvent.getPointerId(actionIndex);
            int x3 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.mLastTouchX = x3;
            this.mInitialTouchX = x3;
            int y3 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.mLastTouchY = y3;
            this.mInitialTouchY = y3;
        } else if (actionMasked == 6) {
            onPointerUp(motionEvent);
        }
        if (!z2 && !this.mOverScrollEnable) {
            this.mVelocityTracker.addMovement(motionEventObtain);
        }
        motionEventObtain.recycle();
        return true;
    }

    @Override // android.view.View
    public boolean overScrollBy(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z) {
        int i9 = i + i3;
        int i10 = i2 + i4;
        if ((i3 < 0 && i9 > 0) || (i3 > 0 && i9 < 0)) {
            i9 = 0;
        }
        if ((i4 < 0 && i10 > 0) || (i4 > 0 && i10 < 0)) {
            i10 = 0;
        }
        onOverScrolled(i9, i10, false, false);
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void removeOnItemTouchListener(@NonNull RecyclerView.OnItemTouchListener onItemTouchListener) {
        this.mOnItemTouchListeners.remove(onItemTouchListener);
        if (this.mInterceptingOnItemTouchListener == onItemTouchListener) {
            this.mInterceptingOnItemTouchListener = null;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        int size = this.mOnItemTouchListeners.size();
        for (int i = 0; i < size; i++) {
            this.mOnItemTouchListeners.get(i).onRequestDisallowInterceptTouchEvent(z);
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public void scrollBy(int i, int i2) {
        RecyclerView.LayoutManager layoutManager = this.mLayout;
        if (layoutManager == null) {
            Log.e(TAG, "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.mLayoutSuppressed) {
            return;
        }
        boolean zCanScrollHorizontally = layoutManager.canScrollHorizontally();
        boolean zCanScrollVertically = this.mLayout.canScrollVertically();
        if (zCanScrollHorizontally || zCanScrollVertically) {
            if (!zCanScrollHorizontally) {
                i = 0;
            }
            if (!zCanScrollVertically) {
                i2 = 0;
            }
            scrollByInternal(i, i2, null);
        }
    }

    public boolean scrollByInternal(int i, int i2, MotionEvent motionEvent) {
        int i3;
        int i4;
        int i5;
        int i6;
        consumePendingUpdateOperations();
        if (this.mAdapter == null || ((i == 0 && i2 == 0) || (this.mOverScrollEnable && ((getScrollY() < 0 && i2 > 0) || ((getScrollY() > 0 && i2 < 0) || ((getScrollX() < 0 && i > 0) || (getScrollX() > 0 && i < 0))))))) {
            i3 = 0;
            i4 = 0;
            i5 = 0;
            i6 = 0;
        } else {
            int[] iArr = this.mReusableIntPair;
            iArr[0] = 0;
            iArr[1] = 0;
            scrollStep(i, i2, iArr);
            int[] iArr2 = this.mReusableIntPair;
            int i7 = iArr2[0];
            int i8 = iArr2[1];
            i3 = i8;
            i4 = i7;
            i5 = i - i7;
            i6 = i2 - i8;
        }
        if (!this.mItemDecorations.isEmpty()) {
            invalidate();
        }
        int[] iArr3 = this.mReusableIntPair;
        iArr3[0] = 0;
        iArr3[1] = 0;
        dispatchNestedScroll(i4, i3, i5, i6, this.mScrollOffset, 0, iArr3);
        int[] iArr4 = this.mReusableIntPair;
        int i9 = i5 - iArr4[0];
        int i10 = i6 - iArr4[1];
        int i11 = this.mLastTouchX;
        int[] iArr5 = this.mScrollOffset;
        int i12 = iArr5[0];
        this.mLastTouchX = i11 - i12;
        int i13 = this.mLastTouchY;
        int i14 = iArr5[1];
        this.mLastTouchY = i13 - i14;
        if (motionEvent != null) {
            motionEvent.offsetLocation(i12, i14);
        }
        int[] iArr6 = this.mNestedOffsets;
        int i15 = iArr6[0];
        int[] iArr7 = this.mScrollOffset;
        iArr6[0] = i15 + iArr7[0];
        iArr6[1] = iArr6[1] + iArr7[1];
        if (getOverScrollMode() != 2 && motionEvent != null && this.mOverScrollEnable && MotionEventCompat.isFromSource(motionEvent, 4098)) {
            if (i10 != 0 || i9 != 0) {
                this.mScrollType = 2;
            }
            if (Math.abs(i10) == 0 && Math.abs(i3) < this.mTouchSlop && Math.abs(i2) < this.mTouchSlop && Math.abs(getScrollY()) > this.mTouchSlop) {
                this.mScrollType = 2;
            }
            if (i10 == 0 && i3 == 0 && Math.abs(i2) > this.mTouchSlop) {
                this.mScrollType = 2;
            }
            if (Math.abs(i9) == 0 && Math.abs(i4) < this.mTouchSlop && Math.abs(i) < this.mTouchSlop && Math.abs(getScrollX()) > this.mTouchSlop) {
                this.mScrollType = 2;
            }
            if (i9 == 0 && i4 == 0 && Math.abs(i) > this.mTouchSlop) {
                this.mScrollType = 2;
            }
            int scrollX = getScrollX();
            int scrollY = getScrollY();
            int iB = pjc.b(i10, scrollY, this.mOverscrollDistance);
            int iB2 = pjc.b(i9, scrollX, this.mOverscrollDistance);
            if ((scrollY < 0 && i2 > 0) || (scrollY > 0 && i2 < 0)) {
                iB = pjc.b(i2, scrollX, this.mOverscrollDistance);
            }
            int i16 = iB;
            if ((scrollX < 0 && i > 0) || (scrollX > 0 && i < 0)) {
                iB2 = pjc.b(i, scrollX, this.mOverscrollDistance);
            }
            if (i16 != 0 || iB2 != 0) {
                int i17 = this.mOverscrollDistance;
                overScrollBy(iB2, i16, scrollX, scrollY, 0, 0, i17, i17, true);
            }
        }
        if (i4 != 0 || i3 != 0) {
            dispatchOnScrolled(i4, i3);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        return (i4 == 0 && i3 == 0) ? false : true;
    }

    public void setEnableFlingSpeedIncrease(boolean z) {
        SpringOverScroller springOverScroller = this.mSpringOverScroller;
        if (springOverScroller != null) {
            springOverScroller.setEnableFlingSpeedIncrease(z);
        }
    }

    public void setEnablePointerDownAction(boolean z) {
        this.mEnablePointerDown = z;
    }

    public void setHorizontalFlingFriction(float f) {
        this.mNearLocateOverScroller.setFlingFriction(f);
    }

    public void setHorizontalItemAlign(int i) {
        if (needLocate()) {
            setIsUseNativeOverScroll(true);
            this.mLocateHelper.setHorizontalItemAlign(i);
        }
    }

    public void setIsUseNativeOverScroll(boolean z) {
        this.mIsUseNativeOverScroll = z;
        if (z) {
            this.mOverScroller = this.mNearLocateOverScroller;
        } else {
            this.mOverScroller = this.mSpringOverScroller;
        }
    }

    public void setItemClickableWhileOverScrolling(boolean z) {
        this.mItemClickableWhileOverScrolling = z;
    }

    public void setItemClickableWhileSlowScrolling(boolean z) {
        this.mItemClickableWhileSlowScrolling = z;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void setLayoutManager(@Nullable RecyclerView.LayoutManager layoutManager) {
        super.setLayoutManager(layoutManager);
        if (layoutManager != null) {
            if (layoutManager.canScrollHorizontally()) {
                this.mSpringOverScroller.setSpringBackTensionMultiple(HORIZONTAL_SPRING_BACK_TENSION_MULTIPLE);
            } else {
                this.mSpringOverScroller.setSpringBackTensionMultiple(VERTICAL_SPRING_BACK_TENSION_MULTIPLE);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void setOnFlingListener(@Nullable RecyclerView.OnFlingListener onFlingListener) {
        this.mOnFlingListener = onFlingListener;
    }

    public void setOverScrollEnable(boolean z) {
        this.mOverScrollEnable = z;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void setScrollState(int i) {
        if (i == this.mScrollState) {
            return;
        }
        this.mScrollState = i;
        if (i != 2) {
            stopScrollersInternal();
        }
        dispatchOnScrollStateChanged(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void setScrollingTouchSlop(int i) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i != 0) {
            if (i == 1) {
                this.mTouchSlop = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
            Log.w(TAG, "setScrollingTouchSlop(): bad argument constant " + i + "; using default value");
        }
        this.mTouchSlop = viewConfiguration.getScaledTouchSlop();
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void smoothScrollBy(@Px int i, @Px int i2) {
        smoothScrollBy(i, i2, null);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void stopScroll() {
        setScrollState(0);
        stopScrollersInternal();
    }

    public InnerColorRecyclerView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void smoothScrollBy(@Px int i, @Px int i2, @Nullable Interpolator interpolator) {
        RecyclerView.LayoutManager layoutManager = this.mLayout;
        if (layoutManager == null) {
            Log.e(TAG, "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.mLayoutSuppressed) {
            return;
        }
        if (!layoutManager.canScrollHorizontally()) {
            i = 0;
        }
        if (!this.mLayout.canScrollVertically()) {
            i2 = 0;
        }
        if (i == 0 && i2 == 0) {
            return;
        }
        this.mViewFlinger.smoothScrollBy(i, i2, Integer.MIN_VALUE, interpolator);
    }

    public InnerColorRecyclerView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mOverScrollEnable = true;
        this.mIsOverScrollingFling = false;
        this.mScreenHeight = 0;
        this.mScreenWidth = 0;
        this.mItemClickableWhileSlowScrolling = true;
        this.mItemClickableWhileOverScrolling = true;
        this.mDebugPaint = new Paint();
        this.mEnableFlingSpeedIncrease = true;
        this.mScrollState = 0;
        this.mScrollPointerId = -1;
        this.mScrollOffset = new int[2];
        this.mNestedOffsets = new int[2];
        this.mEnablePointerDown = true;
        initViewFlinger();
        initOnItemTouchListeners();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.mTouchSlop = viewConfiguration.getScaledTouchSlop();
        this.mMinFlingVelocity = viewConfiguration.getScaledMinimumFlingVelocity();
        this.mMaxFlingVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
        initProperty(context);
        initOverScroller(context);
        NearFlingLocateHelper nearFlingLocateHelper = new NearFlingLocateHelper();
        this.mLocateHelper = nearFlingLocateHelper;
        nearFlingLocateHelper.attachToRecyclerView(this);
        DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
        this.mScreenWidth = displayMetrics.widthPixels;
        this.mScreenHeight = displayMetrics.heightPixels;
    }
}
