package androidx.recyclerview.widget;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import androidx.core.view.MotionEventCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.animation.PathInterpolatorCompat;
import androidx.core.widget.ScrollerCompat;

/* JADX INFO: loaded from: classes12.dex */
public class MultipleChoiceDragSelectTouchListener implements RecyclerView.OnItemTouchListener {
    private static final String TAG = "MultipleChoiceDragSelectTouchListener";
    private boolean inBottomSpot;
    private boolean inTopSpot;
    private boolean isActive;
    private int lastEnd;
    private int lastStart;
    private float lastX;
    private float lastY;
    private int mBottomBoundFrom;
    private int mBottomBoundTo;
    private int mEnd;
    private float mScrollSpeedFactor;
    private int mStart;
    private long mTimeInAutoArea;
    private int mTopBoundFrom;
    private int mTopBoundTo;
    private RecyclerView recyclerView;
    private ScrollerCompat scroller;
    private OnDragSelectListener selectListener;
    private ValueAnimator speedAnimation;
    private int maxSpeed = 35;
    private int initSpeed = 5;
    private int increaseDistancePerSecond = 5;
    private int mScrollDistance = 5;
    protected Interpolator speedAnimateInterpolator = PathInterpolatorCompat.create(0.42f, 0.0f, 1.0f, 1.0f);
    private Runnable scrollRunnable = new Runnable() { // from class: androidx.recyclerview.widget.MultipleChoiceDragSelectTouchListener.1
        @Override // java.lang.Runnable
        public void run() {
            if (MultipleChoiceDragSelectTouchListener.this.scroller == null || !MultipleChoiceDragSelectTouchListener.this.scroller.computeScrollOffset()) {
                return;
            }
            MultipleChoiceDragSelectTouchListener multipleChoiceDragSelectTouchListener = MultipleChoiceDragSelectTouchListener.this;
            multipleChoiceDragSelectTouchListener.scrollBy(multipleChoiceDragSelectTouchListener.mScrollDistance);
            ViewCompat.postOnAnimation(MultipleChoiceDragSelectTouchListener.this.recyclerView, MultipleChoiceDragSelectTouchListener.this.scrollRunnable);
        }
    };
    private int mAutoScrollDistance = (int) (Resources.getSystem().getDisplayMetrics().density * 56.0f);
    private int mTouchRegionTopOffset = 0;
    private int mTouchRegionBottomOffset = 0;
    private boolean mScrollAboveTopRegion = true;
    private boolean mScrollBelowTopRegion = true;
    private boolean mDebug = true;

    public interface OnAdvancedDragSelectListener extends OnDragSelectListener {
        void onSelectionFinished(int i);

        void onSelectionStarted(int i);
    }

    public interface OnDragSelectListener {
        void onSelectChange(int i, int i2, boolean z);
    }

    public MultipleChoiceDragSelectTouchListener() {
        reset();
    }

    private void cancelAnimation() {
        ValueAnimator valueAnimator = this.speedAnimation;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    private void initScroller(Context context) {
        if (this.scroller == null) {
            this.scroller = ScrollerCompat.create(context, new LinearInterpolator());
        }
    }

    private void notifySelectRangeChange() {
        int i;
        int i2;
        if (this.selectListener == null || (i = this.mStart) == -1 || (i2 = this.mEnd) == -1) {
            return;
        }
        int iMin = Math.min(i, i2);
        int iMax = Math.max(this.mStart, this.mEnd);
        int i3 = this.lastStart;
        if (i3 != -1 && this.lastEnd != -1) {
            if (iMin > i3) {
                this.selectListener.onSelectChange(i3, iMin - 1, false);
            } else if (iMin < i3) {
                this.selectListener.onSelectChange(iMin, i3 - 1, true);
            }
            int i4 = this.lastEnd;
            if (iMax > i4) {
                this.selectListener.onSelectChange(i4 + 1, iMax, true);
            } else if (iMax < i4) {
                this.selectListener.onSelectChange(iMax + 1, i4, false);
            }
        } else if (iMax - iMin == 1) {
            this.selectListener.onSelectChange(iMin, iMin, true);
        } else {
            this.selectListener.onSelectChange(iMin, iMax, true);
        }
        this.lastStart = iMin;
        this.lastEnd = iMax;
    }

    private void processAutoScroll(MotionEvent motionEvent) {
        int y = (int) motionEvent.getY();
        if (this.mDebug) {
            Log.d(TAG, "y = " + y + " | rv.height = " + this.recyclerView.getHeight() + " | mTopBoundFrom => mTopBoundTo = " + this.mTopBoundFrom + " => " + this.mTopBoundTo + " | mBottomBoundFrom => mBottomBoundTo = " + this.mBottomBoundFrom + " => " + this.mBottomBoundTo + " | mTouchRegionTopOffset = " + this.mTouchRegionTopOffset + " | mTouchRegionBottomOffset = " + this.mTouchRegionBottomOffset);
        }
        if (y >= this.mTopBoundFrom && y <= this.mTopBoundTo) {
            this.lastX = motionEvent.getX();
            this.lastY = motionEvent.getY();
            if (this.mDebug) {
                Log.d(TAG, "SCROLL - 在自动滑动区域：");
            }
            if (this.inTopSpot) {
                return;
            }
            this.inTopSpot = true;
            this.mTimeInAutoArea = System.currentTimeMillis();
            this.mScrollDistance = this.initSpeed * (-1);
            startAutoScroll();
            startSpeedAnimation(true);
            return;
        }
        if (y < this.mBottomBoundFrom || y > this.mBottomBoundTo) {
            this.mTimeInAutoArea = 0L;
            this.inBottomSpot = false;
            this.inTopSpot = false;
            this.lastX = Float.MIN_VALUE;
            this.lastY = Float.MIN_VALUE;
            stopAutoScroll();
            return;
        }
        this.lastX = motionEvent.getX();
        this.lastY = motionEvent.getY();
        if (this.mDebug) {
            Log.d(TAG, "SCROLL - mScrollSpeedFactor=" + this.mScrollSpeedFactor + " | mScrollDistance=" + this.mScrollDistance);
        }
        if (this.inBottomSpot) {
            return;
        }
        this.mTimeInAutoArea = System.currentTimeMillis();
        this.inBottomSpot = true;
        this.mScrollDistance = this.initSpeed * 1;
        startAutoScroll();
        startSpeedAnimation(false);
    }

    private void reset() {
        setIsActive(false);
        OnDragSelectListener onDragSelectListener = this.selectListener;
        if (onDragSelectListener != null && (onDragSelectListener instanceof OnAdvancedDragSelectListener)) {
            ((OnAdvancedDragSelectListener) onDragSelectListener).onSelectionFinished(this.mEnd);
        }
        this.mStart = -1;
        this.mEnd = -1;
        this.lastStart = -1;
        this.lastEnd = -1;
        this.inTopSpot = false;
        this.inBottomSpot = false;
        this.lastX = Float.MIN_VALUE;
        this.lastY = Float.MIN_VALUE;
        stopAutoScroll();
        this.mScrollDistance = this.initSpeed;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void scrollBy(int i) {
        this.recyclerView.scrollBy(0, i > 0 ? Math.min(i, this.maxSpeed) : Math.max(i, -this.maxSpeed));
        float f = this.lastX;
        if (f != Float.MIN_VALUE) {
            float f2 = this.lastY;
            if (f2 != Float.MIN_VALUE) {
                updateSelectedRange(this.recyclerView, f, f2);
            }
        }
    }

    private void startSpeedAnimation(boolean z) {
        final int i = this.maxSpeed;
        final int i2 = this.initSpeed;
        int i3 = ((i - i2) / this.increaseDistancePerSecond) * 1000;
        if (z) {
            i2 = -i2;
        }
        if (z) {
            i = -i;
        }
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(i2, i);
        this.speedAnimation = valueAnimatorOfInt;
        valueAnimatorOfInt.setDuration(i3);
        this.speedAnimation.setInterpolator(this.speedAnimateInterpolator);
        Log.d(TAG, "start mScrollDistance:" + i2 + ",duration:" + i3);
        this.speedAnimation.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: androidx.recyclerview.widget.MultipleChoiceDragSelectTouchListener.2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i4 = Integer.parseInt(valueAnimator.getAnimatedValue().toString());
                if (i4 != MultipleChoiceDragSelectTouchListener.this.mScrollDistance) {
                    MultipleChoiceDragSelectTouchListener.this.mScrollDistance = i4;
                    Log.d(MultipleChoiceDragSelectTouchListener.TAG, "mScrollDistance:" + MultipleChoiceDragSelectTouchListener.this.mScrollDistance + ",startValue:" + i2 + ",endValue:" + i);
                }
            }
        });
        this.speedAnimation.start();
    }

    private void updateSelectedRange(RecyclerView recyclerView, MotionEvent motionEvent) {
        updateSelectedRange(recyclerView, motionEvent.getX(), motionEvent.getY());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
    public boolean onInterceptTouchEvent(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (!this.isActive || recyclerView.getAdapter().getItemCount() == 0) {
            return false;
        }
        int actionMasked = MotionEventCompat.getActionMasked(motionEvent);
        if (actionMasked == 0 || actionMasked == 5) {
            reset();
        }
        this.recyclerView = recyclerView;
        int height = recyclerView.getHeight();
        int i = this.mTouchRegionTopOffset;
        this.mTopBoundFrom = i + 0;
        int i2 = this.mAutoScrollDistance;
        this.mTopBoundTo = i + 0 + i2;
        int i3 = this.mTouchRegionBottomOffset;
        this.mBottomBoundFrom = (height + i3) - i2;
        this.mBottomBoundTo = height + i3;
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
    public void onRequestDisallowInterceptTouchEvent(boolean z) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
    public void onTouchEvent(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (this.isActive) {
            int actionMasked = MotionEventCompat.getActionMasked(motionEvent);
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    if (!this.inTopSpot && !this.inBottomSpot) {
                        updateSelectedRange(recyclerView, motionEvent);
                    }
                    processAutoScroll(motionEvent);
                    return;
                }
                if (actionMasked != 3 && actionMasked != 6) {
                    return;
                }
            }
            reset();
        }
    }

    public MultipleChoiceDragSelectTouchListener setBottomOffset(int i) {
        this.mTouchRegionBottomOffset = i;
        return this;
    }

    public MultipleChoiceDragSelectTouchListener setDebugState(boolean z) {
        this.mDebug = z;
        return this;
    }

    public void setIncreaseDistance(int i) {
        this.increaseDistancePerSecond = i;
    }

    public void setInitScrollDistance(int i) {
        this.initSpeed = i;
    }

    public void setIsActive(boolean z) {
        this.isActive = z;
    }

    public void setMaxScrollDistance(int i) {
        this.maxSpeed = i;
    }

    public MultipleChoiceDragSelectTouchListener setScrollAboveTopRegion(boolean z) {
        this.mScrollAboveTopRegion = z;
        return this;
    }

    public MultipleChoiceDragSelectTouchListener setScrollBelowTopRegion(boolean z) {
        this.mScrollBelowTopRegion = z;
        return this;
    }

    public MultipleChoiceDragSelectTouchListener setSelectListener(OnDragSelectListener onDragSelectListener) {
        this.selectListener = onDragSelectListener;
        return this;
    }

    public MultipleChoiceDragSelectTouchListener setTopOffset(int i) {
        this.mTouchRegionTopOffset = i;
        return this;
    }

    public MultipleChoiceDragSelectTouchListener setTouchRegion(int i) {
        this.mAutoScrollDistance = i;
        return this;
    }

    public void startAutoScroll() {
        RecyclerView recyclerView = this.recyclerView;
        if (recyclerView == null) {
            return;
        }
        initScroller(recyclerView.getContext());
        if (this.scroller.isFinished()) {
            this.recyclerView.removeCallbacks(this.scrollRunnable);
            ScrollerCompat scrollerCompat = this.scroller;
            scrollerCompat.startScroll(0, scrollerCompat.getCurrY(), 0, 5000, 100000);
            ViewCompat.postOnAnimation(this.recyclerView, this.scrollRunnable);
        }
    }

    public void startDragSelection(int i) {
        setIsActive(true);
        this.mStart = i;
        this.mEnd = i;
        this.lastStart = i;
        this.lastEnd = i;
        OnDragSelectListener onDragSelectListener = this.selectListener;
        if (onDragSelectListener == null || !(onDragSelectListener instanceof OnAdvancedDragSelectListener)) {
            return;
        }
        ((OnAdvancedDragSelectListener) onDragSelectListener).onSelectionStarted(i);
    }

    public void stopAutoScroll() {
        ScrollerCompat scrollerCompat = this.scroller;
        if (scrollerCompat != null && !scrollerCompat.isFinished()) {
            this.recyclerView.removeCallbacks(this.scrollRunnable);
            this.scroller.abortAnimation();
        }
        cancelAnimation();
    }

    private void updateSelectedRange(RecyclerView recyclerView, float f, float f2) {
        int childAdapterPosition;
        View viewFindChildViewUnder = recyclerView.findChildViewUnder(f, f2);
        if (viewFindChildViewUnder == null || (childAdapterPosition = recyclerView.getChildAdapterPosition(viewFindChildViewUnder)) == -1 || this.mEnd == childAdapterPosition) {
            return;
        }
        this.mEnd = childAdapterPosition;
        notifySelectRangeChange();
    }
}
