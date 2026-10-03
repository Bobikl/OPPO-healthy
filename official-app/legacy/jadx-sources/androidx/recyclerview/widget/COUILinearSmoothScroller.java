package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes12.dex */
public class COUILinearSmoothScroller extends RecyclerView.SmoothScroller {
    private static final int CONSECUTIVE_UPDATES_MIN = 10;
    private static final boolean DEBUG = false;
    private static final float MILLISECONDS_PER_INCH = 25.0f;
    private static final float SCROLLING_TIME_DIVIDER = 0.3356f;
    public static final int SNAP_TO_ANY = 0;
    public static final int SNAP_TO_END = 1;
    public static final int SNAP_TO_START = -1;
    private static final String TAG = "LinearSmoothScroller";
    private static final float TARGET_SEEK_EXTRA_SCROLL_RATIO = 1.2f;
    private static final int TARGET_SEEK_SCROLL_DISTANCE_PX = 10000;
    private final DisplayMetrics mDisplayMetrics;
    private RecyclerView.LayoutManager mLayoutManager;
    private float mMillisPerPixel;
    private boolean mPendingInitialRun;
    private COUIRecyclerView mRecyclerView;
    private boolean mRunning;
    private boolean mStarted;
    protected PointF mTargetVector;
    private View mTargetView;
    protected final LinearInterpolator mLinearInterpolator = new LinearInterpolator();
    protected final DecelerateInterpolator mDecelerateInterpolator = new DecelerateInterpolator();
    protected int mInterimTargetDx = 0;
    protected int mInterimTargetDy = 0;
    private boolean mHasCalculatedMillisPerPixel = false;
    private int mTargetPosition = -1;
    private final COUIAction mRecyclingAction = new COUIAction(0, 0);

    public COUILinearSmoothScroller(Context context) {
        this.mDisplayMetrics = context.getResources().getDisplayMetrics();
    }

    private int clampApplyScroll(int i, int i2) {
        int i3 = i - i2;
        if (i * i3 <= 0) {
            return 0;
        }
        return i3;
    }

    private float getSpeedPerPixel() {
        if (!this.mHasCalculatedMillisPerPixel) {
            this.mMillisPerPixel = calculateSpeedPerPixel(this.mDisplayMetrics);
            this.mHasCalculatedMillisPerPixel = true;
        }
        return this.mMillisPerPixel;
    }

    public int calculateDtToFit(int i, int i2, int i3, int i4, int i5) {
        if (i5 == -1) {
            return i3 - i;
        }
        if (i5 != 0) {
            if (i5 == 1) {
                return i4 - i2;
            }
            throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
        }
        int i6 = i3 - i;
        if (i6 > 0) {
            return i6;
        }
        int i7 = i4 - i2;
        if (i7 < 0) {
            return i7;
        }
        return 0;
    }

    public int calculateDxToMakeVisible(View view, int i) {
        RecyclerView.LayoutManager layoutManager = getLayoutManager();
        if (layoutManager == null || !layoutManager.canScrollHorizontally()) {
            return 0;
        }
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        return calculateDtToFit(layoutManager.getDecoratedLeft(view) - ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin, layoutManager.getDecoratedRight(view) + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, layoutManager.getPaddingLeft(), layoutManager.getWidth() - layoutManager.getPaddingRight(), i);
    }

    public int calculateDyToMakeVisible(View view, int i) {
        RecyclerView.LayoutManager layoutManager = getLayoutManager();
        if (layoutManager == null || !layoutManager.canScrollVertically()) {
            return 0;
        }
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        return calculateDtToFit(layoutManager.getDecoratedTop(view) - ((ViewGroup.MarginLayoutParams) layoutParams).topMargin, layoutManager.getDecoratedBottom(view) + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin, layoutManager.getPaddingTop(), layoutManager.getHeight() - layoutManager.getPaddingBottom(), i);
    }

    public float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
        return MILLISECONDS_PER_INCH / displayMetrics.densityDpi;
    }

    public int calculateTimeForDeceleration(int i) {
        return (int) Math.ceil(calculateTimeForScrolling(i) / SCROLLING_TIME_DIVIDER);
    }

    public int calculateTimeForScrolling(int i) {
        return (int) Math.ceil(Math.abs(i) * getSpeedPerPixel());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.SmoothScroller
    public View findViewByPosition(int i) {
        return this.mRecyclerView.mLayout.findViewByPosition(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.SmoothScroller
    public int getChildCount() {
        return this.mRecyclerView.mLayout.getChildCount();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.SmoothScroller
    public int getChildPosition(View view) {
        return this.mRecyclerView.getChildLayoutPosition(view);
    }

    public int getHorizontalSnapPreference() {
        PointF pointF = this.mTargetVector;
        if (pointF != null) {
            float f = pointF.x;
            if (f != 0.0f) {
                return f > 0.0f ? 1 : -1;
            }
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.SmoothScroller
    @Nullable
    public RecyclerView.LayoutManager getLayoutManager() {
        return this.mLayoutManager;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.SmoothScroller
    public int getTargetPosition() {
        return this.mTargetPosition;
    }

    public int getVerticalSnapPreference() {
        PointF pointF = this.mTargetVector;
        if (pointF != null) {
            float f = pointF.y;
            if (f != 0.0f) {
                return f > 0.0f ? 1 : -1;
            }
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.SmoothScroller
    public boolean isPendingInitialRun() {
        return this.mPendingInitialRun;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.SmoothScroller
    public boolean isRunning() {
        return this.mRunning;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.SmoothScroller
    public void onAnimation(int i, int i2) {
        PointF pointFComputeScrollVectorForPosition;
        COUIRecyclerView cOUIRecyclerView = this.mRecyclerView;
        int i3 = this.mTargetPosition;
        if (i3 == -1 || cOUIRecyclerView == null) {
            stopLinearScroller();
            return;
        }
        if (this.mPendingInitialRun && this.mTargetView == null && this.mLayoutManager != null && (pointFComputeScrollVectorForPosition = computeScrollVectorForPosition(i3)) != null) {
            float f = pointFComputeScrollVectorForPosition.x;
            if (f != 0.0f || pointFComputeScrollVectorForPosition.y != 0.0f) {
                cOUIRecyclerView.scrollStep((int) Math.signum(f), (int) Math.signum(pointFComputeScrollVectorForPosition.y), null);
            }
        }
        this.mPendingInitialRun = false;
        View view = this.mTargetView;
        if (view != null) {
            if (getChildPosition(view) == this.mTargetPosition) {
                onTargetFound(this.mTargetView, cOUIRecyclerView.mState, this.mRecyclingAction);
                this.mRecyclingAction.runIfNecessary(cOUIRecyclerView);
                stopLinearScroller();
            } else {
                Log.e(TAG, "Passed over target position while smooth scrolling.");
                this.mTargetView = null;
            }
        }
        if (this.mRunning) {
            onSeekTargetStep(i, i2, cOUIRecyclerView.mState, this.mRecyclingAction);
            boolean zHasJumpTarget = this.mRecyclingAction.hasJumpTarget();
            this.mRecyclingAction.runIfNecessary(cOUIRecyclerView);
            if (zHasJumpTarget && this.mRunning) {
                this.mPendingInitialRun = true;
                cOUIRecyclerView.getViewFlinger().postOnAnimation();
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.SmoothScroller
    public void onChildAttachedToWindow(View view) {
        if (getChildPosition(view) == getTargetPosition()) {
            this.mTargetView = view;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.SmoothScroller
    public void onSeekTargetStep(int i, int i2, RecyclerView.State state, RecyclerView.SmoothScroller.Action action) {
        if (getChildCount() == 0) {
            stop();
            return;
        }
        this.mInterimTargetDx = clampApplyScroll(this.mInterimTargetDx, i);
        int iClampApplyScroll = clampApplyScroll(this.mInterimTargetDy, i2);
        this.mInterimTargetDy = iClampApplyScroll;
        if (this.mInterimTargetDx == 0 && iClampApplyScroll == 0) {
            updateActionForInterimTarget(action);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.SmoothScroller
    public void onStart() {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.SmoothScroller
    public void onStop() {
        if (this.mRunning) {
            this.mInterimTargetDx = 0;
            this.mInterimTargetDy = 0;
            this.mTargetVector = null;
            this.mRunning = false;
            this.mRecyclerView.mState.mTargetPosition = -1;
            this.mTargetView = null;
            this.mTargetPosition = -1;
            this.mPendingInitialRun = false;
            this.mLayoutManager.onSmoothScrollerStopped(this);
            this.mLayoutManager = null;
            this.mRecyclerView = null;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.SmoothScroller
    public void onTargetFound(View view, RecyclerView.State state, RecyclerView.SmoothScroller.Action action) {
        int iCalculateDxToMakeVisible = calculateDxToMakeVisible(view, getHorizontalSnapPreference());
        int iCalculateDyToMakeVisible = calculateDyToMakeVisible(view, getVerticalSnapPreference());
        int iCalculateTimeForDeceleration = calculateTimeForDeceleration((int) Math.sqrt((iCalculateDxToMakeVisible * iCalculateDxToMakeVisible) + (iCalculateDyToMakeVisible * iCalculateDyToMakeVisible)));
        if (iCalculateTimeForDeceleration > 0) {
            action.update(-iCalculateDxToMakeVisible, -iCalculateDyToMakeVisible, iCalculateTimeForDeceleration, this.mDecelerateInterpolator);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.SmoothScroller
    public void setTargetPosition(int i) {
        this.mTargetPosition = i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.SmoothScroller
    public void start(RecyclerView recyclerView, RecyclerView.LayoutManager layoutManager) {
        if (!(recyclerView instanceof COUIRecyclerView)) {
            super.start(recyclerView, layoutManager);
            return;
        }
        COUIRecyclerView cOUIRecyclerView = (COUIRecyclerView) recyclerView;
        cOUIRecyclerView.getViewFlinger().stop();
        if (this.mStarted) {
            Log.w(TAG, "An instance of " + getClass().getSimpleName() + " was started more than once. Each instance of" + getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
        }
        this.mRecyclerView = cOUIRecyclerView;
        this.mLayoutManager = layoutManager;
        int i = this.mTargetPosition;
        if (i == -1) {
            throw new IllegalArgumentException("Invalid target position");
        }
        cOUIRecyclerView.mState.mTargetPosition = i;
        this.mRunning = true;
        this.mPendingInitialRun = true;
        this.mTargetView = findViewByPosition(getTargetPosition());
        onStart();
        this.mRecyclerView.getViewFlinger().postOnAnimation();
        this.mStarted = true;
    }

    public final void stopLinearScroller() {
        if (this.mRunning) {
            this.mRunning = false;
            onStop();
            this.mRecyclerView.mState.mTargetPosition = -1;
            this.mTargetView = null;
            this.mTargetPosition = -1;
            this.mPendingInitialRun = false;
            this.mLayoutManager.onSmoothScrollerStopped(this);
            this.mLayoutManager = null;
            this.mRecyclerView = null;
        }
    }

    public void updateActionForInterimTarget(RecyclerView.SmoothScroller.Action action) {
        PointF pointFComputeScrollVectorForPosition = computeScrollVectorForPosition(getTargetPosition());
        if (pointFComputeScrollVectorForPosition == null || (pointFComputeScrollVectorForPosition.x == 0.0f && pointFComputeScrollVectorForPosition.y == 0.0f)) {
            action.jumpTo(getTargetPosition());
            stop();
            return;
        }
        normalize(pointFComputeScrollVectorForPosition);
        this.mTargetVector = pointFComputeScrollVectorForPosition;
        this.mInterimTargetDx = (int) (pointFComputeScrollVectorForPosition.x * 10000.0f);
        this.mInterimTargetDy = (int) (pointFComputeScrollVectorForPosition.y * 10000.0f);
        action.update((int) (this.mInterimTargetDx * 1.2f), (int) (this.mInterimTargetDy * 1.2f), (int) (calculateTimeForScrolling(10000) * 1.2f), this.mLinearInterpolator);
    }

    public static class COUIAction extends RecyclerView.SmoothScroller.Action {
        public static final int UNDEFINED_DURATION = Integer.MIN_VALUE;
        private boolean mChanged;
        private int mConsecutiveUpdates;
        private int mDuration;
        private int mDx;
        private int mDy;
        private Interpolator mInterpolator;
        private int mJumpToPosition;

        public COUIAction(int i, int i2) {
            super(i, i2);
            this.mJumpToPosition = -1;
            this.mChanged = false;
            this.mConsecutiveUpdates = 0;
        }

        private void validate() {
            if (this.mInterpolator != null && this.mDuration < 1) {
                throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
            }
            if (this.mDuration < 1) {
                throw new IllegalStateException("Scroll duration must be a positive number");
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.SmoothScroller.Action
        public boolean hasJumpTarget() {
            return this.mJumpToPosition >= 0;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.SmoothScroller.Action
        public void jumpTo(int i) {
            super.jumpTo(i);
            this.mJumpToPosition = i;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.SmoothScroller.Action
        public void runIfNecessary(RecyclerView recyclerView) {
            if (!(recyclerView instanceof COUIRecyclerView)) {
                super.runIfNecessary(recyclerView);
                return;
            }
            int i = this.mJumpToPosition;
            if (i >= 0) {
                this.mJumpToPosition = -1;
                recyclerView.jumpToPositionForSmoothScroller(i);
                this.mChanged = false;
            } else {
                if (!this.mChanged) {
                    this.mConsecutiveUpdates = 0;
                    return;
                }
                validate();
                ((COUIRecyclerView) recyclerView).getViewFlinger().smoothScrollBy(this.mDx, this.mDy, this.mDuration, this.mInterpolator);
                int i2 = this.mConsecutiveUpdates + 1;
                this.mConsecutiveUpdates = i2;
                if (i2 > 10) {
                    Log.e(COUILinearSmoothScroller.TAG, "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                }
                this.mChanged = false;
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.SmoothScroller.Action
        public void setDuration(int i) {
            super.setDuration(i);
            this.mDuration = i;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.SmoothScroller.Action
        public void setDx(int i) {
            super.setDx(i);
            this.mDx = i;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.SmoothScroller.Action
        public void setDy(int i) {
            super.setDy(i);
            this.mDy = i;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.SmoothScroller.Action
        public void setInterpolator(@Nullable Interpolator interpolator) {
            super.setInterpolator(interpolator);
            this.mInterpolator = interpolator;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.SmoothScroller.Action
        public void update(int i, int i2, int i3, @Nullable Interpolator interpolator) {
            super.update(i, i2, i3, interpolator);
            this.mDx = i;
            this.mDy = i2;
            this.mDuration = i3;
            this.mInterpolator = interpolator;
            this.mChanged = true;
        }

        public COUIAction(int i, int i2, int i3) {
            super(i, i2, i3);
            this.mJumpToPosition = -1;
            this.mChanged = false;
            this.mConsecutiveUpdates = 0;
        }

        public COUIAction(int i, int i2, int i3, @Nullable Interpolator interpolator) {
            super(i, i2, i3, interpolator);
            this.mJumpToPosition = -1;
            this.mChanged = false;
            this.mConsecutiveUpdates = 0;
            this.mDx = i;
            this.mDy = i2;
            this.mDuration = i3;
            this.mInterpolator = interpolator;
        }
    }
}
