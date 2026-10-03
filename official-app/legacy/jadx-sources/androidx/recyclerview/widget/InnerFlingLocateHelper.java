package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.view.View;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes12.dex */
public class InnerFlingLocateHelper {
    private static final int CENTER_ALIGN = 2;
    private static final int INVALID_ALIGN = 0;
    private static final int INVALID_POSITION = -1;
    private static final int START_ALIGN = 1;
    private static final String TAG = "ColorFlingLocateHelper";
    private Context mContext;
    private OrientationHelper mHorizontalHelper;
    private RecyclerView.LayoutManager mLayoutManager;
    private InnerColorRecyclerView mRecyclerView;
    private int mHorizontalItemAlign = 0;
    private RecyclerView.OnScrollListener mAlignScrollListener = new RecyclerView.OnScrollListener() { // from class: androidx.recyclerview.widget.InnerFlingLocateHelper.1
        boolean mScrolled = false;

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            super.onScrollStateChanged(recyclerView, i);
            if (i == 0 && this.mScrolled) {
                this.mScrolled = false;
                InnerFlingLocateHelper.this.snapToTargetExistingView();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            if (i == 0 && i2 == 0) {
                return;
            }
            this.mScrolled = true;
        }
    };

    private float computeDistancePerChild(RecyclerView.LayoutManager layoutManager, OrientationHelper orientationHelper) {
        int childCount = layoutManager.getChildCount();
        if (childCount == 0) {
            return 1.0f;
        }
        View view = null;
        int i = Integer.MIN_VALUE;
        int i2 = Integer.MAX_VALUE;
        View view2 = null;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = layoutManager.getChildAt(i3);
            int position = layoutManager.getPosition(childAt);
            if (position != -1 && position != layoutManager.getItemCount() - 1 && position != 0) {
                if (position < i2) {
                    view = childAt;
                    i2 = position;
                }
                if (position > i) {
                    view2 = childAt;
                    i = position;
                }
            }
        }
        if (view == null || view2 == null) {
            return 1.0f;
        }
        int iMax = Math.max(orientationHelper.getDecoratedEnd(view), orientationHelper.getDecoratedEnd(view2)) - Math.min(orientationHelper.getDecoratedStart(view), orientationHelper.getDecoratedStart(view2));
        if (iMax == 0) {
            return 1.0f;
        }
        return (iMax * 1.0f) / ((i - i2) + 1);
    }

    private View findCenterView(RecyclerView.LayoutManager layoutManager, OrientationHelper orientationHelper) {
        int childCount = layoutManager.getChildCount();
        View view = null;
        if (childCount == 0) {
            return null;
        }
        int startAfterPadding = orientationHelper.getStartAfterPadding() + (orientationHelper.getTotalSpace() / 2);
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = layoutManager.getChildAt(i2);
            int iAbs = Math.abs((orientationHelper.getDecoratedStart(childAt) + (orientationHelper.getDecoratedMeasurement(childAt) / 2)) - startAfterPadding);
            if (iAbs < i) {
                view = childAt;
                i = iAbs;
            }
        }
        return view;
    }

    private View findStartView(RecyclerView.LayoutManager layoutManager, OrientationHelper orientationHelper) {
        int childCount = layoutManager.getChildCount();
        View view = null;
        if (childCount == 0) {
            return null;
        }
        if (layoutManager instanceof LinearLayoutManager) {
            if (((LinearLayoutManager) layoutManager).findFirstCompletelyVisibleItemPosition() == layoutManager.getItemCount() - 1) {
                return null;
            }
        }
        int endAfterPadding = isRtlMode(this.mContext) ? orientationHelper.getEndAfterPadding() : orientationHelper.getStartAfterPadding();
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = layoutManager.getChildAt(i2);
            int iAbs = Math.abs((isRtlMode(this.mContext) ? orientationHelper.getDecoratedEnd(childAt) : orientationHelper.getDecoratedStart(childAt)) - endAfterPadding);
            if (iAbs < i) {
                view = childAt;
                i = iAbs;
            }
        }
        return view;
    }

    private OrientationHelper getHorizontalHelper(@NonNull RecyclerView.LayoutManager layoutManager) {
        OrientationHelper orientationHelper = this.mHorizontalHelper;
        if (orientationHelper == null || orientationHelper.getLayoutManager() != layoutManager) {
            this.mHorizontalHelper = OrientationHelper.createHorizontalHelper(layoutManager);
        }
        return this.mHorizontalHelper;
    }

    private RecyclerView.LayoutManager getLayoutManager() {
        RecyclerView.LayoutManager layoutManager = this.mLayoutManager;
        if (layoutManager == null || layoutManager != this.mRecyclerView.getLayoutManager()) {
            this.mLayoutManager = this.mRecyclerView.getLayoutManager();
        }
        return this.mLayoutManager;
    }

    private boolean isRtlMode(Context context) {
        return context != null && context.getResources().getConfiguration().getLayoutDirection() == 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void snapToTargetExistingView() {
        View viewFindSnapView;
        int decoratedStart;
        int startAfterPadding;
        RecyclerView.LayoutManager layoutManager = getLayoutManager();
        if (layoutManager == null || (viewFindSnapView = findSnapView(layoutManager)) == null) {
            return;
        }
        int i = this.mHorizontalItemAlign;
        if (i == 2) {
            int startAfterPadding2 = getHorizontalHelper(layoutManager).getStartAfterPadding() + (getHorizontalHelper(layoutManager).getTotalSpace() / 2);
            int itemCount = layoutManager.getItemCount() - 1;
            if (layoutManager.getPosition(viewFindSnapView) == 0) {
                startAfterPadding2 = isRtlMode(this.mContext) ? getHorizontalHelper(layoutManager).getEndAfterPadding() - (getHorizontalHelper(layoutManager).getDecoratedMeasurement(viewFindSnapView) / 2) : getHorizontalHelper(layoutManager).getStartAfterPadding() + (getHorizontalHelper(layoutManager).getDecoratedMeasurement(viewFindSnapView) / 2);
            }
            if (layoutManager.getPosition(viewFindSnapView) == itemCount) {
                startAfterPadding2 = isRtlMode(this.mContext) ? getHorizontalHelper(layoutManager).getStartAfterPadding() + (getHorizontalHelper(layoutManager).getDecoratedMeasurement(viewFindSnapView) / 2) : getHorizontalHelper(layoutManager).getEndAfterPadding() - (getHorizontalHelper(layoutManager).getDecoratedMeasurement(viewFindSnapView) / 2);
            }
            int decoratedStart2 = (getHorizontalHelper(layoutManager).getDecoratedStart(viewFindSnapView) + (getHorizontalHelper(layoutManager).getDecoratedMeasurement(viewFindSnapView) / 2)) - startAfterPadding2;
            if (Math.abs(decoratedStart2) > 1.0f) {
                this.mRecyclerView.smoothScrollBy(decoratedStart2, 0);
                return;
            }
            return;
        }
        if (i == 1) {
            if (isRtlMode(this.mContext)) {
                decoratedStart = getHorizontalHelper(layoutManager).getDecoratedEnd(viewFindSnapView);
                startAfterPadding = getHorizontalHelper(layoutManager).getEndAfterPadding();
            } else {
                decoratedStart = getHorizontalHelper(layoutManager).getDecoratedStart(viewFindSnapView);
                startAfterPadding = getHorizontalHelper(layoutManager).getStartAfterPadding();
            }
            int i2 = decoratedStart - startAfterPadding;
            if (Math.abs(i2) > 1.0f) {
                this.mRecyclerView.smoothScrollBy(i2, 0);
            }
        }
    }

    public void attachToRecyclerView(InnerColorRecyclerView innerColorRecyclerView) {
        this.mRecyclerView = innerColorRecyclerView;
        this.mContext = innerColorRecyclerView.getContext();
    }

    public void cancelHorizontalItemAlign() {
        this.mHorizontalItemAlign = 0;
        this.mRecyclerView.removeOnScrollListener(this.mAlignScrollListener);
    }

    public View findSnapView(RecyclerView.LayoutManager layoutManager) {
        if (layoutManager.canScrollHorizontally()) {
            int i = this.mHorizontalItemAlign;
            if (i == 2) {
                return findCenterView(layoutManager, getHorizontalHelper(layoutManager));
            }
            if (i == 1) {
                return findStartView(layoutManager, getHorizontalHelper(layoutManager));
            }
        }
        return null;
    }

    public int getHorizontalItemAlign() {
        return this.mHorizontalItemAlign;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int getTargetViewDistance(int i) {
        View viewFindSnapView;
        float fComputeDistancePerChild;
        int iRound;
        int decoratedStart;
        RecyclerView.LayoutManager layoutManager = getLayoutManager();
        int itemCount = layoutManager.getItemCount();
        if (itemCount == 0 || (viewFindSnapView = findSnapView(layoutManager)) == null) {
            return -1;
        }
        int position = layoutManager.getPosition(viewFindSnapView);
        int i2 = itemCount - 1;
        PointF pointFComputeScrollVectorForPosition = ((RecyclerView.SmoothScroller.ScrollVectorProvider) layoutManager).computeScrollVectorForPosition(i2);
        if (pointFComputeScrollVectorForPosition == null) {
            return -1;
        }
        if (layoutManager.canScrollHorizontally()) {
            fComputeDistancePerChild = computeDistancePerChild(layoutManager, getHorizontalHelper(layoutManager));
            iRound = Math.round(i / fComputeDistancePerChild);
            if (pointFComputeScrollVectorForPosition.x < 0.0f) {
                iRound = -iRound;
            }
        } else {
            fComputeDistancePerChild = 1.0f;
            iRound = 0;
        }
        int i3 = iRound + position;
        if (i3 != position && i3 >= 0 && i3 < itemCount) {
            int i4 = this.mHorizontalItemAlign;
            if (i4 == 2) {
                View childAt = (layoutManager.getPosition(viewFindSnapView) != 0 || layoutManager.getChildCount() == 0) ? null : layoutManager.getChildAt(layoutManager.getChildCount() - 1);
                if (layoutManager.getPosition(viewFindSnapView) == i2 && layoutManager.getChildCount() != 0) {
                    childAt = layoutManager.getChildAt(0);
                }
                int startAfterPadding = getHorizontalHelper(layoutManager).getStartAfterPadding() + (getHorizontalHelper(layoutManager).getTotalSpace() / 2);
                if (childAt != null) {
                    decoratedStart = getHorizontalHelper(layoutManager).getDecoratedStart(childAt) + (getHorizontalHelper(layoutManager).getDecoratedMeasurement(childAt) / 2) + (isRtlMode(this.mContext) ? -((int) ((i3 - layoutManager.getPosition(childAt)) * fComputeDistancePerChild)) : (int) ((i3 - layoutManager.getPosition(childAt)) * fComputeDistancePerChild));
                } else {
                    decoratedStart = getHorizontalHelper(layoutManager).getDecoratedStart(viewFindSnapView) + (getHorizontalHelper(layoutManager).getDecoratedMeasurement(viewFindSnapView) / 2) + (isRtlMode(this.mContext) ? -((int) ((i3 - layoutManager.getPosition(viewFindSnapView)) * fComputeDistancePerChild)) : (int) ((i3 - layoutManager.getPosition(viewFindSnapView)) * fComputeDistancePerChild));
                }
                return decoratedStart - startAfterPadding;
            }
            if (i4 == 1) {
                int i5 = i3 - position;
                return ((isRtlMode(this.mContext) ? getHorizontalHelper(layoutManager).getDecoratedEnd(viewFindSnapView) : getHorizontalHelper(layoutManager).getDecoratedStart(viewFindSnapView)) + (isRtlMode(this.mContext) ? -((int) (i5 * fComputeDistancePerChild)) : (int) (i5 * fComputeDistancePerChild))) - (isRtlMode(this.mContext) ? getHorizontalHelper(layoutManager).getEndAfterPadding() : getHorizontalHelper(layoutManager).getStartAfterPadding());
            }
        }
        return -1;
    }

    public void setHorizontalItemAlign(int i) {
        this.mHorizontalItemAlign = i;
        this.mRecyclerView.addOnScrollListener(this.mAlignScrollListener);
    }
}
