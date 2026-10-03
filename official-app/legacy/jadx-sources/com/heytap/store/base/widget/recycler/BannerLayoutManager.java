package com.heytap.store.base.widget.recycler;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;
import androidx.recyclerview.widget.LinearSmoothScroller;
import androidx.recyclerview.widget.PagerSnapHelper;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SnapHelper;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes3.dex */
public class BannerLayoutManager extends CrashCatchLinearLayoutManager implements LifecycleObserver {
    private static final String TAG = "BannerLayoutManager";
    private boolean isPause;
    private int mCurrentPosition;
    private int mFirstPosition;
    private final PagerSnapHelper mLinearSnapHelper;
    private OnScrollStartListener mOnScrollStartListener;
    private OnSelectedViewListener mOnSelectedViewListener;
    private final int mOrientation;
    private int mRealCount;
    private final RecyclerView mRecyclerView;
    private TaskRunnable mTaskRunnable;
    private long mTimeDelayed;
    private float mTimeSmooth;

    public interface OnScrollStartListener {
        void onScrollStart(View view, int i);
    }

    public interface OnSelectedViewListener {
        void onSelectedView(View view, int i);
    }

    public static class TaskRunnable implements Runnable {
        WeakReference<BannerLayoutManager> mReference;

        public TaskRunnable(BannerLayoutManager bannerLayoutManager) {
            this.mReference = new WeakReference<>(bannerLayoutManager);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean isViewExposed(View view) {
            if (view == null || view.getWidth() == 0 || view.getHeight() == 0 || !view.isShown()) {
                return false;
            }
            Rect rect = new Rect();
            return view.getGlobalVisibleRect(rect) && rect.intersect(0, 0, view.getResources().getDisplayMetrics().widthPixels, view.getResources().getDisplayMetrics().heightPixels) && rect.width() * rect.height() >= view.getWidth() * view.getHeight();
        }

        @Override // java.lang.Runnable
        public void run() {
            final BannerLayoutManager bannerLayoutManager = this.mReference.get();
            if (bannerLayoutManager == null || bannerLayoutManager.getItemCount() <= 1) {
                return;
            }
            bannerLayoutManager.getRecyclerView().postOnAnimation(new Runnable() { // from class: com.heytap.store.base.widget.recycler.BannerLayoutManager.TaskRunnable.1
                @Override // java.lang.Runnable
                public void run() {
                    if (!TaskRunnable.this.isViewExposed(bannerLayoutManager.getRecyclerView())) {
                        bannerLayoutManager.resetDelay();
                    } else {
                        bannerLayoutManager.getRecyclerView().smoothScrollToPosition(bannerLayoutManager.getCurrentPosition() + 1);
                    }
                }
            });
        }
    }

    public BannerLayoutManager(Context context, RecyclerView recyclerView) {
        super(context);
        this.mRealCount = 0;
        this.mCurrentPosition = 0;
        this.mTimeDelayed = 2800L;
        this.mTimeSmooth = 2000.0f;
        this.isPause = false;
        this.mFirstPosition = 0;
        this.mLinearSnapHelper = new PagerSnapHelper();
        this.mRealCount = 0;
        this.mTaskRunnable = new TaskRunnable(this);
        this.mRecyclerView = recyclerView;
        setOrientation(0);
        this.mOrientation = 0;
    }

    private int getCurrentViewEdgeOffset() {
        View viewFindSnapView;
        if (this.mLinearSnapHelper == null || this.mRecyclerView.getLayoutManager() == null || (viewFindSnapView = this.mLinearSnapHelper.findSnapView(this.mRecyclerView.getLayoutManager())) == null) {
            return 0;
        }
        int i = this.mOrientation;
        if (i == 0) {
            return Math.abs(viewFindSnapView.getLeft());
        }
        if (i == 1) {
            return Math.abs(viewFindSnapView.getTop());
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public RecyclerView.LayoutParams generateDefaultLayoutParams() {
        return new RecyclerView.LayoutParams(-2, -2);
    }

    public int getCurrentPosition() {
        View viewFindSnapView;
        if (this.mLinearSnapHelper == null || this.mRecyclerView.getLayoutManager() == null || (viewFindSnapView = this.mLinearSnapHelper.findSnapView(this.mRecyclerView.getLayoutManager())) == null) {
            return 0;
        }
        return getPosition(viewFindSnapView);
    }

    public int getFirstPosition() {
        return this.mFirstPosition;
    }

    public int getRealCount() {
        return this.mRealCount;
    }

    public RecyclerView getRecyclerView() {
        return this.mRecyclerView;
    }

    public SnapHelper getSnapHelper() {
        return this.mLinearSnapHelper;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onAttachedToWindow(RecyclerView recyclerView) {
        super.onAttachedToWindow(recyclerView);
        this.mLinearSnapHelper.attachToRecyclerView(recyclerView);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void onDestroy() {
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView != null) {
            recyclerView.removeCallbacks(this.mTaskRunnable);
        }
        if (this.mTaskRunnable != null) {
            this.mTaskRunnable = null;
        }
    }

    @Override // com.heytap.store.base.widget.recycler.CrashCatchLinearLayoutManager, androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutChildren(RecyclerView.Recycler recycler, RecyclerView.State state) {
        super.onLayoutChildren(recycler, state);
        int i = this.mRealCount;
        boolean z = true;
        if (i != 0 && i != 1) {
            z = false;
        }
        if (z || this.isPause) {
            return;
        }
        this.mRecyclerView.postDelayed(this.mTaskRunnable, this.mTimeDelayed);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public void onPause() {
        TaskRunnable taskRunnable;
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView == null || (taskRunnable = this.mTaskRunnable) == null) {
            return;
        }
        recyclerView.removeCallbacks(taskRunnable);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public void onResume() {
        if (this.mRecyclerView == null) {
            return;
        }
        if (this.mTaskRunnable == null) {
            this.mTaskRunnable = new TaskRunnable(this);
        }
        int i = this.mRealCount;
        boolean z = true;
        if (i != 0 && i != 1) {
            z = false;
        }
        if (z || this.isPause) {
            return;
        }
        this.mRecyclerView.postDelayed(this.mTaskRunnable, this.mTimeDelayed);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onScrollStateChanged(int i) {
        super.onScrollStateChanged(i);
        if (i != 0) {
            this.mRecyclerView.removeCallbacks(this.mTaskRunnable);
            if (i != 2 || this.mOnScrollStartListener == null) {
                return;
            }
            View viewFindSnapView = this.mLinearSnapHelper.findSnapView(this);
            if ((viewFindSnapView.getContext() instanceof Activity) && (((Activity) viewFindSnapView.getContext()).isDestroyed() || ((Activity) viewFindSnapView.getContext()).isFinishing())) {
                return;
            }
            this.mOnScrollStartListener.onScrollStart(viewFindSnapView, getCurrentPosition());
            return;
        }
        PagerSnapHelper pagerSnapHelper = this.mLinearSnapHelper;
        if (pagerSnapHelper != null) {
            View viewFindSnapView2 = pagerSnapHelper.findSnapView(this);
            this.mCurrentPosition = getCurrentPosition();
            if (getCurrentViewEdgeOffset() > 0) {
                this.mRecyclerView.postDelayed(new Runnable() { // from class: com.heytap.store.base.widget.recycler.BannerLayoutManager.3
                    @Override // java.lang.Runnable
                    public void run() {
                        BannerLayoutManager.this.mRecyclerView.scrollToPosition(BannerLayoutManager.this.mCurrentPosition);
                    }
                }, 100L);
            }
            OnSelectedViewListener onSelectedViewListener = this.mOnSelectedViewListener;
            if (onSelectedViewListener != null) {
                onSelectedViewListener.onSelectedView(viewFindSnapView2, this.mCurrentPosition % this.mRealCount);
            }
            int i2 = this.mRealCount;
            if (i2 == 0 || i2 == 1 || this.isPause) {
                this.mRecyclerView.removeCallbacks(this.mTaskRunnable);
            } else {
                this.mRecyclerView.postDelayed(this.mTaskRunnable, this.mTimeDelayed);
            }
        }
    }

    public void pause() {
        TaskRunnable taskRunnable;
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView == null || (taskRunnable = this.mTaskRunnable) == null) {
            return;
        }
        this.isPause = true;
        recyclerView.removeCallbacks(taskRunnable);
    }

    public void resetDelay() {
        this.mRecyclerView.postDelayed(this.mTaskRunnable, this.mTimeDelayed + 1000);
    }

    public void resume() {
        TaskRunnable taskRunnable;
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView == null || (taskRunnable = this.mTaskRunnable) == null) {
            return;
        }
        this.isPause = false;
        recyclerView.postDelayed(taskRunnable, this.mTimeDelayed);
    }

    public void setFirstPosition(int i) {
        this.mFirstPosition = i;
    }

    public void setOnScrollStartListener(OnScrollStartListener onScrollStartListener) {
        this.mOnScrollStartListener = onScrollStartListener;
    }

    public void setRealCount(int i) {
        this.mRealCount = i;
    }

    public void setTimeDelayed(long j2) {
        this.mTimeDelayed = j2;
    }

    public void setTimeSmooth(float f) {
        this.mTimeSmooth = f;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.State state, int i) {
        LinearSmoothScroller linearSmoothScroller = new LinearSmoothScroller(recyclerView.getContext()) { // from class: com.heytap.store.base.widget.recycler.BannerLayoutManager.2
            @Override // androidx.recyclerview.widget.LinearSmoothScroller
            public float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
                return BannerLayoutManager.this.mTimeSmooth / displayMetrics.densityDpi;
            }
        };
        linearSmoothScroller.setTargetPosition(i);
        startSmoothScroll(linearSmoothScroller);
    }

    public BannerLayoutManager(Context context, RecyclerView recyclerView, int i) {
        super(context);
        this.mRealCount = 0;
        this.mCurrentPosition = 0;
        this.mTimeDelayed = 2800L;
        this.mTimeSmooth = 2000.0f;
        this.isPause = false;
        this.mFirstPosition = 0;
        this.mLinearSnapHelper = new PagerSnapHelper();
        this.mRealCount = i;
        this.mTaskRunnable = new TaskRunnable(this);
        this.mRecyclerView = recyclerView;
        setOrientation(0);
        this.mOrientation = 0;
    }

    public BannerLayoutManager(Context context, RecyclerView recyclerView, int i, int i2) {
        super(context);
        this.mRealCount = 0;
        this.mCurrentPosition = 0;
        this.mTimeDelayed = 2800L;
        this.mTimeSmooth = 2000.0f;
        this.isPause = false;
        this.mFirstPosition = 0;
        this.mLinearSnapHelper = new PagerSnapHelper();
        this.mRealCount = i;
        this.mTaskRunnable = new TaskRunnable(this);
        this.mRecyclerView = recyclerView;
        setOrientation(i2);
        this.mOrientation = i2;
    }

    public BannerLayoutManager(Context context, RecyclerView recyclerView, int i, int i2, final int i3) {
        super(context);
        this.mRealCount = 0;
        this.mCurrentPosition = 0;
        this.mTimeDelayed = 2800L;
        this.mTimeSmooth = 2000.0f;
        this.isPause = false;
        this.mFirstPosition = 0;
        this.mLinearSnapHelper = new PagerSnapHelper();
        this.mRealCount = i;
        this.mTaskRunnable = new TaskRunnable(this);
        this.mRecyclerView = recyclerView;
        setOrientation(i2);
        this.mOrientation = i2;
        this.mFirstPosition = i3;
        recyclerView.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.heytap.store.base.widget.recycler.BannerLayoutManager.1
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                BannerLayoutManager.this.mRecyclerView.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                BannerLayoutManager.this.scrollToPosition(i3);
            }
        });
    }
}
