package com.heytap.nearx.uikit.widget.viewPager;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import androidx.annotation.UiThread;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes18.dex */
@Deprecated
public class NearFakeDrag {
    private int mActualDraggedDistance;
    private long mFakeDragBeginTime;
    private int mMaximumVelocity;
    private final NearScrollEventAdapter mNearScrollEventAdapter;
    private final RecyclerView mRecyclerView;
    private float mRequestedDragDistance;
    private VelocityTracker mVelocityTracker;
    private final NearViewPager mViewPager;

    public NearFakeDrag(NearViewPager nearViewPager, NearScrollEventAdapter nearScrollEventAdapter, RecyclerView recyclerView) {
        this.mViewPager = nearViewPager;
        this.mNearScrollEventAdapter = nearScrollEventAdapter;
        this.mRecyclerView = recyclerView;
    }

    private void addFakeMotionEvent(long j2, int i, float f, float f2) {
        MotionEvent motionEventObtain = MotionEvent.obtain(this.mFakeDragBeginTime, j2, i, f, f2, 0);
        this.mVelocityTracker.addMovement(motionEventObtain);
        motionEventObtain.recycle();
    }

    private void beginFakeVelocityTracker() {
        VelocityTracker velocityTracker = this.mVelocityTracker;
        if (velocityTracker != null) {
            velocityTracker.clear();
        } else {
            this.mVelocityTracker = VelocityTracker.obtain();
            this.mMaximumVelocity = ViewConfiguration.get(this.mViewPager.getContext()).getScaledMaximumFlingVelocity();
        }
    }

    @UiThread
    public boolean beginFakeDrag() {
        if (this.mNearScrollEventAdapter.isDragging()) {
            return false;
        }
        this.mActualDraggedDistance = 0;
        this.mRequestedDragDistance = 0;
        this.mFakeDragBeginTime = SystemClock.uptimeMillis();
        beginFakeVelocityTracker();
        this.mNearScrollEventAdapter.notifyBeginFakeDrag();
        if (!this.mNearScrollEventAdapter.isIdle()) {
            this.mRecyclerView.stopScroll();
        }
        addFakeMotionEvent(this.mFakeDragBeginTime, 0, 0.0f, 0.0f);
        return true;
    }

    @UiThread
    public boolean endFakeDrag() {
        if (!this.mNearScrollEventAdapter.isFakeDragging()) {
            return false;
        }
        this.mNearScrollEventAdapter.notifyEndFakeDrag();
        VelocityTracker velocityTracker = this.mVelocityTracker;
        velocityTracker.computeCurrentVelocity(1000, this.mMaximumVelocity);
        if (this.mRecyclerView.fling((int) velocityTracker.getXVelocity(), (int) velocityTracker.getYVelocity())) {
            return true;
        }
        this.mViewPager.snapToPage();
        return true;
    }

    @UiThread
    public boolean fakeDragBy(float f) {
        if (!this.mNearScrollEventAdapter.isFakeDragging()) {
            return false;
        }
        float f2 = this.mRequestedDragDistance - f;
        this.mRequestedDragDistance = f2;
        int iRound = Math.round(f2 - this.mActualDraggedDistance);
        this.mActualDraggedDistance += iRound;
        long jUptimeMillis = SystemClock.uptimeMillis();
        boolean z = this.mViewPager.getOrientation() == 0;
        int i = z ? iRound : 0;
        int i2 = z ? 0 : iRound;
        float f3 = z ? this.mRequestedDragDistance : 0.0f;
        float f4 = z ? 0.0f : this.mRequestedDragDistance;
        this.mRecyclerView.scrollBy(i, i2);
        addFakeMotionEvent(jUptimeMillis, 2, f3, f4);
        return true;
    }

    public boolean isFakeDragging() {
        return this.mNearScrollEventAdapter.isFakeDragging();
    }
}
