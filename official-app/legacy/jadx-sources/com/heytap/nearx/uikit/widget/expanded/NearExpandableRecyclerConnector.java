package com.heytap.nearx.uikit.widget.expanded;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.PathInterpolator;
import android.widget.AbsListView;
import androidx.recyclerview.widget.NearLinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.oplus.aiunit.vision.fjc;
import com.sensorsdata.analytics.android.autotrack.aop.SensorsDataAutoTrackHelper;
import com.sensorsdata.analytics.android.sdk.SensorsDataInstrumented;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public class NearExpandableRecyclerConnector extends RecyclerView.Adapter {
    private static final long ANIMATION_DURATION = 400;
    private static final int ANIMATION_TYPE = Integer.MIN_VALUE;
    private static final int EXPAND_THRESHOLD = 2;
    private static final int STATE_COLLAPSING = 2;
    private static final int STATE_EXPANDING = 1;
    private static final int STATE_IDLE = 0;
    private static final String TAG = "ExpandableConnector";
    private NearExpandableRecyclerView expandableRecyclerView;
    private NearExpandableRecyclerAdapter mExpandableListAdapter;
    private int mTotalExpChildrenCount;
    private SparseArray<GroupInfo> groupInfo = new SparseArray<>();
    private SparseArray<ExpandAnimator> animatorSparseArray = new SparseArray<>();
    private SparseArray<List<RecyclerView.ViewHolder>> cacheChildView = new SparseArray<>();
    private SparseArray<List<RecyclerView.ViewHolder>> showChildView = new SparseArray<>();
    private int mMaxExpGroupCount = Integer.MAX_VALUE;
    private final RecyclerView.AdapterDataObserver mDataSetObserver = new MyDataSetObserver();
    private SparseArray<Integer> typeMap = new SparseArray<>();
    private ArrayList<GroupMetadata> mExpGroupMetadataList = new ArrayList<>();

    public static class AnimationViewHolder extends RecyclerView.ViewHolder {
        public AnimationViewHolder(View view) {
            super(view);
            view.setLayoutParams(new AbsListView.LayoutParams(-1, 0));
        }
    }

    public static class DummyView extends View {
        private List<View> views;

        public DummyView(Context context) {
            super(context);
            this.views = new ArrayList();
        }

        public void addFakeView(View view) {
            this.views.add(view);
        }

        public void clearViews() {
            this.views.clear();
        }

        @Override // android.view.View
        public void dispatchDraw(Canvas canvas) {
            canvas.save();
            int size = this.views.size();
            int i = 0;
            for (int i2 = 0; i2 < size; i2++) {
                View view = this.views.get(i2);
                canvas.save();
                int measuredHeight = view.getMeasuredHeight();
                i += measuredHeight;
                canvas.clipRect(0, 0, getWidth(), measuredHeight);
                view.draw(canvas);
                canvas.restore();
                canvas.translate(0.0f, measuredHeight);
                if (i > canvas.getHeight()) {
                    break;
                }
            }
            canvas.restore();
        }

        @Override // android.view.View
        public void onLayout(boolean z, int i, int i2, int i3, int i4) {
            int i5 = i4 - i2;
            int size = this.views.size();
            int i6 = 0;
            for (int i7 = 0; i7 < size; i7++) {
                View view = this.views.get(i7);
                int measuredHeight = view.getMeasuredHeight();
                i6 += measuredHeight;
                view.layout(i, i2, view.getMeasuredWidth() + i, measuredHeight + i2);
                if (i6 > i5) {
                    return;
                }
            }
        }
    }

    public static abstract class EndAnimatorListener implements Animator.AnimatorListener {
        private EndAnimatorListener() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    public static class ExpandAnimator extends ValueAnimator {
        private boolean isFirst;
        private WeakReference<NearExpandableRecyclerView> reference;

        public ExpandAnimator(NearExpandableRecyclerView nearExpandableRecyclerView, long j2, TimeInterpolator timeInterpolator) {
            this.reference = new WeakReference<>(nearExpandableRecyclerView);
            setDuration(j2);
            setInterpolator(timeInterpolator);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void endAnimator() {
            removeAllUpdateListeners();
            end();
        }

        public void setParam(final boolean z, final boolean z2, final int i, final View view, final GroupInfo groupInfo, int i2, int i3) {
            fjc.a(NearExpandableRecyclerConnector.TAG, "setParam: " + z + ", isLastChild:" + z2 + " ,flatPos:" + i + " ,start:" + i2 + " ,end:" + i3);
            this.isFirst = true;
            setIntValues(i2, i3);
            removeAllUpdateListeners();
            addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.heytap.nearx.uikit.widget.expanded.NearExpandableRecyclerConnector.ExpandAnimator.1
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    int i4;
                    NearExpandableRecyclerView nearExpandableRecyclerView = (NearExpandableRecyclerView) ExpandAnimator.this.reference.get();
                    if (nearExpandableRecyclerView == null) {
                        ExpandAnimator.this.endAnimator();
                        return;
                    }
                    int iFindFirstVisibleItemPosition = ((NearLinearLayoutManager) nearExpandableRecyclerView.getLayoutManager()).findFirstVisibleItemPosition();
                    int iFindLastVisibleItemPosition = ((NearLinearLayoutManager) nearExpandableRecyclerView.getLayoutManager()).findLastVisibleItemPosition();
                    if (!ExpandAnimator.this.isFirst && !z2 && (iFindFirstVisibleItemPosition > (i4 = i) || iFindLastVisibleItemPosition < i4)) {
                        fjc.a(NearExpandableRecyclerConnector.TAG, "onAnimationUpdate1: " + iFindFirstVisibleItemPosition + "," + iFindLastVisibleItemPosition + "," + i);
                        ExpandAnimator.this.endAnimator();
                        return;
                    }
                    if (!ExpandAnimator.this.isFirst && !z2 && z && i == iFindLastVisibleItemPosition) {
                        fjc.a(NearExpandableRecyclerConnector.TAG, "onAnimationUpdate2: " + iFindLastVisibleItemPosition + "," + i);
                        ExpandAnimator.this.endAnimator();
                        return;
                    }
                    if (ExpandAnimator.this.isFirst || !z2 || !z || view.getBottom() <= nearExpandableRecyclerView.getBottom()) {
                        ExpandAnimator.this.isFirst = false;
                        int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                        groupInfo.dummyHeight = iIntValue;
                        View view2 = view;
                        if (view2 != null) {
                            view2.getLayoutParams().height = iIntValue;
                        }
                        nearExpandableRecyclerView.requestLayout();
                        return;
                    }
                    fjc.a(NearExpandableRecyclerConnector.TAG, "onAnimationUpdate3: " + view.getBottom() + "," + nearExpandableRecyclerView.getBottom());
                    ExpandAnimator.this.endAnimator();
                }
            });
        }
    }

    public static class GroupInfo {
        boolean animating;
        int dummyHeight;
        DummyView dummyView;
        boolean expanding;
        int totalHeight;

        private GroupInfo() {
            this.animating = false;
            this.expanding = false;
            this.totalHeight = -1;
            this.dummyHeight = -1;
        }
    }

    public static class GroupMetadata implements Parcelable, Comparable<GroupMetadata> {
        public static final Parcelable.Creator<GroupMetadata> CREATOR = new Parcelable.Creator<GroupMetadata>() { // from class: com.heytap.nearx.uikit.widget.expanded.NearExpandableRecyclerConnector.GroupMetadata.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public GroupMetadata createFromParcel(Parcel parcel) {
                return GroupMetadata.obtain(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readLong());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public GroupMetadata[] newArray(int i) {
                return new GroupMetadata[i];
            }
        };
        static final int REFRESH = -1;
        int flPos;
        long gId;
        int gPos;
        int lastChildFlPos;

        private GroupMetadata() {
        }

        public static GroupMetadata obtain(int i, int i2, int i3, long j2) {
            GroupMetadata groupMetadata = new GroupMetadata();
            groupMetadata.flPos = i;
            groupMetadata.lastChildFlPos = i2;
            groupMetadata.gPos = i3;
            groupMetadata.gId = j2;
            return groupMetadata;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.flPos);
            parcel.writeInt(this.lastChildFlPos);
            parcel.writeInt(this.gPos);
            parcel.writeLong(this.gId);
        }

        @Override // java.lang.Comparable
        public int compareTo(GroupMetadata groupMetadata) {
            if (groupMetadata != null) {
                return this.gPos - groupMetadata.gPos;
            }
            throw new IllegalArgumentException();
        }
    }

    public static class PositionMetadata {
        private static final int MAX_POOL_SIZE = 5;
        private static ArrayList<PositionMetadata> sPool = new ArrayList<>(5);
        public int groupInsertIndex;
        public GroupMetadata groupMetadata;
        public NearExpandableRecyclerPosition position;

        private PositionMetadata() {
        }

        private static PositionMetadata getRecycledOrCreate() {
            synchronized (sPool) {
                if (sPool.size() <= 0) {
                    return new PositionMetadata();
                }
                PositionMetadata positionMetadataRemove = sPool.remove(0);
                positionMetadataRemove.resetState();
                return positionMetadataRemove;
            }
        }

        public static PositionMetadata obtain(int i, int i2, int i3, int i4, GroupMetadata groupMetadata, int i5) {
            PositionMetadata recycledOrCreate = getRecycledOrCreate();
            recycledOrCreate.position = NearExpandableRecyclerPosition.obtain(i2, i3, i4, i);
            recycledOrCreate.groupMetadata = groupMetadata;
            recycledOrCreate.groupInsertIndex = i5;
            return recycledOrCreate;
        }

        private void resetState() {
            NearExpandableRecyclerPosition nearExpandableRecyclerPosition = this.position;
            if (nearExpandableRecyclerPosition != null) {
                nearExpandableRecyclerPosition.recycle();
                this.position = null;
            }
            this.groupMetadata = null;
            this.groupInsertIndex = 0;
        }

        public boolean isExpanded() {
            return this.groupMetadata != null;
        }

        public void recycle() {
            resetState();
            synchronized (sPool) {
                if (sPool.size() < 5) {
                    sPool.add(this);
                }
            }
        }
    }

    public NearExpandableRecyclerConnector(NearExpandableRecyclerAdapter nearExpandableRecyclerAdapter, NearExpandableRecyclerView nearExpandableRecyclerView) {
        this.expandableRecyclerView = nearExpandableRecyclerView;
        setExpandableListAdapter(nearExpandableRecyclerAdapter);
    }

    private void addCache(RecyclerView.ViewHolder viewHolder, int i, int i2) {
        int realChildType = getRealChildType(i, i2);
        List<RecyclerView.ViewHolder> arrayList = this.showChildView.get(realChildType);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
        }
        arrayList.add(viewHolder);
        this.showChildView.put(realChildType, arrayList);
    }

    private void collapseAnimationStart(final DummyView dummyView, int i, final int i2, int i3) {
        fjc.a(TAG, "collapseAnimationStart:" + i + " ,groupPos:" + i2 + " , height:" + i3);
        GroupInfo groupInfo = getGroupInfo(i2);
        ExpandAnimator expandAnimator = this.animatorSparseArray.get(i2);
        if (expandAnimator == null) {
            expandAnimator = new ExpandAnimator(this.expandableRecyclerView, 400L, new PathInterpolator(0.3f, 0.0f, 0.0f, 1.0f));
            this.animatorSparseArray.put(i2, expandAnimator);
        } else {
            expandAnimator.removeAllListeners();
            expandAnimator.cancel();
        }
        boolean z = i == getItemCount() - 1;
        int i4 = groupInfo.dummyHeight;
        expandAnimator.setParam(false, z, i, dummyView, groupInfo, i4 == -1 ? i3 : i4, 0);
        expandAnimator.addListener(new EndAnimatorListener() { // from class: com.heytap.nearx.uikit.widget.expanded.NearExpandableRecyclerConnector.4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                DummyView dummyView2 = dummyView;
                if (dummyView2 != null) {
                    dummyView2.clearViews();
                    NearExpandableRecyclerConnector.this.stopAnimation(i2);
                    NearExpandableRecyclerConnector.this.collapseGroup(i2);
                    dummyView.setTag(0);
                }
            }
        });
        expandAnimator.start();
        if (dummyView != null) {
            dummyView.setTag(2);
        }
    }

    private void expandAnimationStart(final DummyView dummyView, final int i, final int i2, int i3) {
        fjc.a(TAG, "expandAnimationStart:" + i + " ,groupPos:" + i2 + " , height:" + i3);
        GroupInfo groupInfo = getGroupInfo(i2);
        ExpandAnimator expandAnimator = this.animatorSparseArray.get(i2);
        if (expandAnimator == null) {
            expandAnimator = new ExpandAnimator(this.expandableRecyclerView, 400L, new PathInterpolator(0.3f, 0.0f, 0.0f, 1.0f));
            this.animatorSparseArray.put(i2, expandAnimator);
        } else {
            expandAnimator.removeAllListeners();
            expandAnimator.cancel();
        }
        boolean z = i == getItemCount() - 1;
        int i4 = groupInfo.dummyHeight;
        expandAnimator.setParam(true, z, i, dummyView, groupInfo, i4 == -1 ? 0 : i4, i3);
        expandAnimator.addListener(new EndAnimatorListener() { // from class: com.heytap.nearx.uikit.widget.expanded.NearExpandableRecyclerConnector.3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                DummyView dummyView2 = dummyView;
                if (dummyView2 != null) {
                    dummyView2.clearViews();
                    NearExpandableRecyclerConnector.this.stopAnimation(i2);
                    NearExpandableRecyclerConnector.this.refreshExpGroupMetadataList(true, true);
                    NearExpandableRecyclerConnector nearExpandableRecyclerConnector = NearExpandableRecyclerConnector.this;
                    nearExpandableRecyclerConnector.notifyItemRangeChanged(i - 1, (nearExpandableRecyclerConnector.getItemCount() - i) + 1);
                    dummyView.setTag(0);
                }
            }
        });
        expandAnimator.start();
        if (dummyView != null) {
            dummyView.setTag(1);
        }
    }

    private RecyclerView.ViewHolder getCacheViewHolder(int i, int i2) {
        List<RecyclerView.ViewHolder> list = this.cacheChildView.get(getRealChildType(i, i2));
        if (list == null || list.isEmpty()) {
            return null;
        }
        return list.remove(0);
    }

    private int getChildAllHeight(boolean z, int i, DummyView dummyView) {
        int childCount = this.expandableRecyclerView.getLayoutManager().getChildCount();
        int bottom = childCount > 0 ? this.expandableRecyclerView.getLayoutManager().getChildAt(childCount - 1).getBottom() : 0;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.expandableRecyclerView.getWidth(), 1073741824);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int bottom2 = (z && this.expandableRecyclerView.getLayoutParams().height == -2) ? this.expandableRecyclerView.getContext().getResources().getDisplayMetrics().heightPixels : this.expandableRecyclerView.getBottom();
        int childrenCount = this.mExpandableListAdapter.getChildrenCount(i);
        int measuredHeight = 0;
        for (int i2 = 0; i2 < childrenCount; i2++) {
            RecyclerView.ViewHolder cacheViewHolder = getCacheViewHolder(i, i2);
            if (cacheViewHolder == null) {
                cacheViewHolder = this.mExpandableListAdapter.onCreateChildView(this.expandableRecyclerView, getRealChildType(i, i2));
            }
            addCache(cacheViewHolder, i, i2);
            View view = cacheViewHolder.itemView;
            this.mExpandableListAdapter.onBindChildView(i, i2, false, cacheViewHolder);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i3 = layoutParams.height;
            int iMakeMeasureSpec3 = i3 > 0 ? View.MeasureSpec.makeMeasureSpec(i3, 1073741824) : iMakeMeasureSpec2;
            view.setLayoutDirection(this.expandableRecyclerView.getLayoutDirection());
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec3);
            measuredHeight += view.getMeasuredHeight();
            dummyView.addFakeView(view);
            if ((!z && measuredHeight + bottom > bottom2) || (z && measuredHeight > (bottom2 - bottom) * 2)) {
                break;
            }
        }
        return measuredHeight;
    }

    private GroupInfo getGroupInfo(int i) {
        GroupInfo groupInfo = this.groupInfo.get(i);
        if (groupInfo != null) {
            return groupInfo;
        }
        GroupInfo groupInfo2 = new GroupInfo();
        this.groupInfo.put(i, groupInfo2);
        return groupInfo2;
    }

    private int getRealChildType(int i, int i2) {
        return this.mExpandableListAdapter.getChildType(i, i2) + this.mExpandableListAdapter.getGroupTypeCount();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void refreshExpGroupMetadataList(boolean z, boolean z2) {
        ArrayList<GroupMetadata> arrayList = this.mExpGroupMetadataList;
        int size = arrayList.size();
        int i = 0;
        this.mTotalExpChildrenCount = 0;
        if (z2) {
            boolean z3 = false;
            for (int i2 = size - 1; i2 >= 0; i2--) {
                GroupMetadata groupMetadata = arrayList.get(i2);
                int iFindGroupPosition = findGroupPosition(groupMetadata.gId, groupMetadata.gPos);
                if (iFindGroupPosition != groupMetadata.gPos) {
                    if (iFindGroupPosition == -1) {
                        arrayList.remove(i2);
                        size--;
                    }
                    groupMetadata.gPos = iFindGroupPosition;
                    if (!z3) {
                        z3 = true;
                    }
                }
            }
            if (z3) {
                Collections.sort(arrayList);
            }
        }
        int i3 = 0;
        int i4 = 0;
        while (i < size) {
            GroupMetadata groupMetadata2 = arrayList.get(i);
            int i5 = groupMetadata2.lastChildFlPos;
            int childCount = (i5 == -1 || z) ? getChildCount(groupMetadata2.gPos) : i5 - groupMetadata2.flPos;
            this.mTotalExpChildrenCount += childCount;
            int i6 = groupMetadata2.gPos;
            int i7 = i3 + (i6 - i4);
            groupMetadata2.flPos = i7;
            i3 = i7 + childCount;
            groupMetadata2.lastChildFlPos = i3;
            i++;
            i4 = i6;
        }
    }

    private void resetCache() {
        for (int i = 0; i < this.showChildView.size(); i++) {
            List<RecyclerView.ViewHolder> listValueAt = this.showChildView.valueAt(i);
            int iKeyAt = this.showChildView.keyAt(i);
            List<RecyclerView.ViewHolder> arrayList = this.cacheChildView.get(iKeyAt);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                this.cacheChildView.put(iKeyAt, arrayList);
            }
            arrayList.addAll(listValueAt);
        }
        this.showChildView.clear();
    }

    private boolean startExpandAnimation(int i) {
        GroupInfo groupInfo = getGroupInfo(i);
        if (groupInfo.animating && groupInfo.expanding) {
            return false;
        }
        groupInfo.animating = true;
        groupInfo.expanding = true;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void stopAnimation(int i) {
        GroupInfo groupInfo = getGroupInfo(i);
        groupInfo.animating = false;
        groupInfo.dummyHeight = -1;
        resetCache();
    }

    public boolean collapseGroup(int i) {
        NearExpandableRecyclerPosition nearExpandableRecyclerPositionObtain = NearExpandableRecyclerPosition.obtain(2, i, -1, -1);
        PositionMetadata flattenedPos = getFlattenedPos(nearExpandableRecyclerPositionObtain);
        nearExpandableRecyclerPositionObtain.recycle();
        if (flattenedPos == null) {
            return false;
        }
        return collapseGroup(flattenedPos);
    }

    public void collapseGroupAnimator() {
        refreshExpGroupMetadataList(true, true);
        notifyItemRangeChanged(0, getItemCount());
    }

    public boolean expandGroup(int i) {
        NearExpandableRecyclerPosition nearExpandableRecyclerPositionObtain = NearExpandableRecyclerPosition.obtain(2, i, -1, -1);
        PositionMetadata flattenedPos = getFlattenedPos(nearExpandableRecyclerPositionObtain);
        nearExpandableRecyclerPositionObtain.recycle();
        if (flattenedPos == null) {
            return false;
        }
        return expandGroup(flattenedPos);
    }

    public int findGroupPosition(long j2, int i) {
        int groupCount = this.mExpandableListAdapter.getGroupCount();
        if (groupCount == 0 || j2 == Long.MIN_VALUE) {
            return -1;
        }
        int i2 = groupCount - 1;
        int iMin = Math.min(i2, Math.max(0, i));
        long jUptimeMillis = SystemClock.uptimeMillis() + 100;
        NearExpandableRecyclerAdapter nearExpandableRecyclerAdapter = this.mExpandableListAdapter;
        if (nearExpandableRecyclerAdapter == null) {
            return -1;
        }
        int i3 = iMin;
        int i4 = i3;
        boolean z = false;
        while (SystemClock.uptimeMillis() <= jUptimeMillis) {
            if (nearExpandableRecyclerAdapter.getGroupId(iMin) != j2) {
                boolean z2 = i3 == i2;
                boolean z3 = i4 == 0;
                if (z2 && z3) {
                    break;
                }
                if (z3 || (z && !z2)) {
                    i3++;
                    z = false;
                    iMin = i3;
                } else if (z2 || (!z && !z3)) {
                    i4--;
                    z = true;
                    iMin = i4;
                }
            } else {
                return iMin;
            }
        }
        return -1;
    }

    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new AbsListView.LayoutParams(-1, -2, 0);
    }

    public int getChildCount(int i) {
        if (getGroupInfo(i).animating) {
            return 1;
        }
        return this.mExpandableListAdapter.getChildrenCount(i);
    }

    public ArrayList<GroupMetadata> getExpandedGroupMetadataList() {
        return this.mExpGroupMetadataList;
    }

    public PositionMetadata getFlattenedPos(NearExpandableRecyclerPosition nearExpandableRecyclerPosition) {
        ArrayList<GroupMetadata> arrayList = this.mExpGroupMetadataList;
        int size = arrayList.size();
        int i = size - 1;
        if (size == 0) {
            int i2 = nearExpandableRecyclerPosition.groupPos;
            return PositionMetadata.obtain(i2, nearExpandableRecyclerPosition.type, i2, nearExpandableRecyclerPosition.childPos, null, 0);
        }
        int i3 = 0;
        int i4 = 0;
        while (i4 <= i) {
            int i5 = ((i - i4) / 2) + i4;
            GroupMetadata groupMetadata = arrayList.get(i5);
            int i6 = nearExpandableRecyclerPosition.groupPos;
            int i7 = groupMetadata.gPos;
            if (i6 > i7) {
                i4 = i5 + 1;
            } else if (i6 < i7) {
                i = i5 - 1;
            } else if (i6 == i7) {
                int i8 = nearExpandableRecyclerPosition.type;
                if (i8 == 2) {
                    return PositionMetadata.obtain(groupMetadata.flPos, i8, i6, nearExpandableRecyclerPosition.childPos, groupMetadata, i5);
                }
                if (i8 != 1) {
                    return null;
                }
                int i9 = groupMetadata.flPos;
                int i10 = nearExpandableRecyclerPosition.childPos;
                return PositionMetadata.obtain(i9 + i10 + 1, i8, i6, i10, groupMetadata, i5);
            }
            i3 = i5;
        }
        if (nearExpandableRecyclerPosition.type != 2) {
            return null;
        }
        if (i4 > i3) {
            GroupMetadata groupMetadata2 = arrayList.get(i4 - 1);
            int i11 = groupMetadata2.lastChildFlPos;
            int i12 = nearExpandableRecyclerPosition.groupPos;
            return PositionMetadata.obtain(i11 + (i12 - groupMetadata2.gPos), nearExpandableRecyclerPosition.type, i12, nearExpandableRecyclerPosition.childPos, null, i4);
        }
        if (i >= i3) {
            return null;
        }
        int i13 = i + 1;
        GroupMetadata groupMetadata3 = arrayList.get(i13);
        int i14 = groupMetadata3.flPos;
        int i15 = groupMetadata3.gPos;
        int i16 = nearExpandableRecyclerPosition.groupPos;
        return PositionMetadata.obtain(i14 - (i15 - i16), nearExpandableRecyclerPosition.type, i16, nearExpandableRecyclerPosition.childPos, null, i13);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.mExpandableListAdapter.getGroupCount() + this.mTotalExpChildrenCount;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i) {
        long combinedChildId;
        PositionMetadata unflattenedPos = getUnflattenedPos(i);
        long groupId = this.mExpandableListAdapter.getGroupId(unflattenedPos.position.groupPos);
        NearExpandableRecyclerPosition nearExpandableRecyclerPosition = unflattenedPos.position;
        int i2 = nearExpandableRecyclerPosition.type;
        if (i2 == 2) {
            combinedChildId = this.mExpandableListAdapter.getCombinedGroupId(groupId);
        } else {
            if (i2 != 1) {
                throw new RuntimeException("Flat list position is of unknown type");
            }
            combinedChildId = this.mExpandableListAdapter.getCombinedChildId(groupId, this.mExpandableListAdapter.getChildId(nearExpandableRecyclerPosition.groupPos, nearExpandableRecyclerPosition.childPos));
        }
        unflattenedPos.recycle();
        return combinedChildId;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        int realChildType;
        PositionMetadata unflattenedPos = getUnflattenedPos(i);
        NearExpandableRecyclerPosition nearExpandableRecyclerPosition = unflattenedPos.position;
        if (nearExpandableRecyclerPosition.type == 2) {
            realChildType = this.mExpandableListAdapter.getGroupType(nearExpandableRecyclerPosition.groupPos);
        } else {
            realChildType = getGroupInfo(nearExpandableRecyclerPosition.groupPos).animating ? Integer.MIN_VALUE : getRealChildType(nearExpandableRecyclerPosition.groupPos, nearExpandableRecyclerPosition.childPos);
        }
        this.typeMap.put(realChildType, Integer.valueOf(nearExpandableRecyclerPosition.type));
        unflattenedPos.recycle();
        return realChildType;
    }

    public PositionMetadata getUnflattenedPos(int i) {
        int i2;
        ArrayList<GroupMetadata> arrayList = this.mExpGroupMetadataList;
        int size = arrayList.size();
        int i3 = size - 1;
        if (size == 0) {
            return PositionMetadata.obtain(i, 2, i, -1, null, 0);
        }
        int i4 = 0;
        int i5 = i3;
        int i6 = 0;
        while (i4 <= i5) {
            int i7 = ((i5 - i4) / 2) + i4;
            GroupMetadata groupMetadata = arrayList.get(i7);
            int i8 = groupMetadata.lastChildFlPos;
            if (i > i8) {
                i4 = i7 + 1;
            } else {
                int i9 = groupMetadata.flPos;
                if (i < i9) {
                    i5 = i7 - 1;
                } else {
                    if (i == i9) {
                        return PositionMetadata.obtain(i, 2, groupMetadata.gPos, -1, groupMetadata, i7);
                    }
                    if (i <= i8) {
                        return PositionMetadata.obtain(i, 1, groupMetadata.gPos, i - (i9 + 1), groupMetadata, i7);
                    }
                }
            }
            i6 = i7;
        }
        if (i4 > i6) {
            GroupMetadata groupMetadata2 = arrayList.get(i4 - 1);
            i2 = (i - groupMetadata2.lastChildFlPos) + groupMetadata2.gPos;
        } else {
            if (i5 >= i6) {
                throw new RuntimeException("Unknown state");
            }
            i4 = i5 + 1;
            GroupMetadata groupMetadata3 = arrayList.get(i4);
            i2 = groupMetadata3.gPos - (groupMetadata3.flPos - i);
        }
        return PositionMetadata.obtain(i, 2, i2, -1, null, i4);
    }

    public boolean isAllAnimatorEnd() {
        int iFindLastVisibleItemPosition = ((NearLinearLayoutManager) this.expandableRecyclerView.getLayoutManager()).findLastVisibleItemPosition();
        for (int iFindFirstVisibleItemPosition = ((NearLinearLayoutManager) this.expandableRecyclerView.getLayoutManager()).findFirstVisibleItemPosition(); iFindFirstVisibleItemPosition <= iFindLastVisibleItemPosition; iFindFirstVisibleItemPosition++) {
            if (getGroupInfo(iFindFirstVisibleItemPosition).animating) {
                return false;
            }
        }
        return true;
    }

    public boolean isGroupExpanded(int i) {
        GroupInfo groupInfo = getGroupInfo(i);
        for (int size = this.mExpGroupMetadataList.size() - 1; size >= 0; size--) {
            if (this.mExpGroupMetadataList.get(size).gPos == i && (!groupInfo.animating || groupInfo.expanding)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, final int i) {
        PositionMetadata unflattenedPos = getUnflattenedPos(i);
        int i2 = unflattenedPos.position.groupPos;
        GroupInfo groupInfo = getGroupInfo(i2);
        viewHolder.itemView.setOnClickListener(null);
        NearExpandableRecyclerPosition nearExpandableRecyclerPosition = unflattenedPos.position;
        int i3 = nearExpandableRecyclerPosition.type;
        if (i3 == 2) {
            this.mExpandableListAdapter.onBindGroupView(i2, unflattenedPos.isExpanded(), viewHolder);
            viewHolder.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.heytap.nearx.uikit.widget.expanded.NearExpandableRecyclerConnector.1
                @Override // android.view.View.OnClickListener
                @SensorsDataInstrumented
                public void onClick(View view) {
                    NearExpandableRecyclerConnector.this.expandableRecyclerView.handleClick(view, i);
                    SensorsDataAutoTrackHelper.trackViewOnClick(view);
                }
            });
        } else {
            if (groupInfo.animating) {
                DummyView dummyView = (DummyView) viewHolder.itemView;
                dummyView.clearViews();
                int childAllHeight = getChildAllHeight(groupInfo.expanding, i2, dummyView);
                groupInfo.totalHeight = childAllHeight;
                groupInfo.dummyView = dummyView;
                Object tag = dummyView.getTag();
                int iIntValue = tag != null ? ((Integer) tag).intValue() : 0;
                boolean z = groupInfo.expanding;
                if (z && iIntValue != 1) {
                    expandAnimationStart(dummyView, i, i2, childAllHeight);
                } else if (z || iIntValue == 2) {
                    fjc.b(TAG, "onBindViewHolder: state is no match:" + iIntValue);
                } else {
                    collapseAnimationStart(dummyView, i, i2, childAllHeight);
                }
            } else {
                if (i3 != 1) {
                    throw new RuntimeException("Flat list position is of unknown type");
                }
                this.mExpandableListAdapter.onBindChildView(i2, nearExpandableRecyclerPosition.childPos, unflattenedPos.groupMetadata.lastChildFlPos == i, viewHolder);
                if (this.mExpandableListAdapter.isChildSelectable(i2, unflattenedPos.position.childPos)) {
                    viewHolder.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.heytap.nearx.uikit.widget.expanded.NearExpandableRecyclerConnector.2
                        @Override // android.view.View.OnClickListener
                        @SensorsDataInstrumented
                        public void onClick(View view) {
                            NearExpandableRecyclerConnector.this.expandableRecyclerView.handleClick(view, i);
                            SensorsDataAutoTrackHelper.trackViewOnClick(view);
                        }
                    });
                }
            }
        }
        unflattenedPos.recycle();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i == Integer.MIN_VALUE) {
            return new AnimationViewHolder(new DummyView(viewGroup.getContext()));
        }
        if (this.typeMap.get(i).intValue() == 2) {
            return this.mExpandableListAdapter.onCreateGroupView(viewGroup, i);
        }
        if (this.typeMap.get(i).intValue() == 1) {
            return this.mExpandableListAdapter.onCreateChildView(viewGroup, i);
        }
        throw new RuntimeException("Flat list position is of unknown type");
    }

    public void setExpandableListAdapter(NearExpandableRecyclerAdapter nearExpandableRecyclerAdapter) {
        NearExpandableRecyclerAdapter nearExpandableRecyclerAdapter2 = this.mExpandableListAdapter;
        if (nearExpandableRecyclerAdapter2 != null) {
            nearExpandableRecyclerAdapter2.unregisterAdapterDataObserver(this.mDataSetObserver);
        }
        this.mExpandableListAdapter = nearExpandableRecyclerAdapter;
        setHasStableIds(nearExpandableRecyclerAdapter.hasStableIds());
        nearExpandableRecyclerAdapter.registerAdapterDataObserver(this.mDataSetObserver);
    }

    public void setExpandedGroupMetadataList(ArrayList<GroupMetadata> arrayList) {
        NearExpandableRecyclerAdapter nearExpandableRecyclerAdapter;
        if (arrayList == null || (nearExpandableRecyclerAdapter = this.mExpandableListAdapter) == null) {
            return;
        }
        int groupCount = nearExpandableRecyclerAdapter.getGroupCount();
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size).gPos >= groupCount) {
                return;
            }
        }
        this.mExpGroupMetadataList = arrayList;
        refreshExpGroupMetadataList(true, false);
    }

    public void setMaxExpGroupCount(int i) {
        this.mMaxExpGroupCount = i;
    }

    public boolean startCollapseAnimation(int i) {
        NearExpandableRecyclerPosition nearExpandableRecyclerPositionObtain = NearExpandableRecyclerPosition.obtain(2, i, -1, -1);
        PositionMetadata flattenedPos = getFlattenedPos(nearExpandableRecyclerPositionObtain);
        nearExpandableRecyclerPositionObtain.recycle();
        View viewFindViewByPosition = ((NearLinearLayoutManager) this.expandableRecyclerView.getLayoutManager()).findViewByPosition(flattenedPos.position.flatListPos);
        if (viewFindViewByPosition != null && viewFindViewByPosition.getBottom() >= this.expandableRecyclerView.getHeight() - this.expandableRecyclerView.getPaddingBottom()) {
            GroupMetadata groupMetadata = flattenedPos.groupMetadata;
            int i2 = groupMetadata.flPos;
            this.mExpGroupMetadataList.remove(groupMetadata);
            refreshExpGroupMetadataList(false, false);
            notifyItemChanged(i2);
            this.mExpandableListAdapter.onGroupCollapsed(flattenedPos.groupMetadata.gPos);
            return false;
        }
        GroupInfo groupInfo = getGroupInfo(i);
        boolean z = groupInfo.animating;
        if (z && groupInfo.expanding) {
            groupInfo.expanding = false;
            collapseAnimationStart(groupInfo.dummyView, flattenedPos.groupMetadata.flPos, i, groupInfo.dummyHeight);
            return false;
        }
        if (!z || groupInfo.expanding) {
            groupInfo.animating = true;
            groupInfo.expanding = false;
            return true;
        }
        expandAnimationStart(groupInfo.dummyView, flattenedPos.groupMetadata.flPos, i, groupInfo.totalHeight);
        groupInfo.expanding = true;
        return false;
    }

    public class MyDataSetObserver extends RecyclerView.AdapterDataObserver {
        public MyDataSetObserver() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onChanged() {
            NearExpandableRecyclerConnector.this.refreshExpGroupMetadataList(true, true);
            NearExpandableRecyclerConnector.this.notifyDataSetChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeChanged(int i, int i2) {
            NearExpandableRecyclerConnector.this.refreshExpGroupMetadataList(true, true);
            NearExpandableRecyclerConnector.this.notifyItemRangeChanged(i, i2);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeInserted(int i, int i2) {
            NearExpandableRecyclerConnector.this.refreshExpGroupMetadataList(true, true);
            NearExpandableRecyclerConnector.this.notifyItemRangeInserted(i, i2);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeMoved(int i, int i2, int i3) {
            NearExpandableRecyclerConnector.this.refreshExpGroupMetadataList(true, true);
            NearExpandableRecyclerConnector.this.notifyItemMoved(i, i2);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeRemoved(int i, int i2) {
            NearExpandableRecyclerConnector.this.refreshExpGroupMetadataList(true, true);
            NearExpandableRecyclerConnector.this.notifyItemRangeRemoved(i, i2);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeChanged(int i, int i2, Object obj) {
            onItemRangeChanged(i, i2);
        }
    }

    public boolean collapseGroup(PositionMetadata positionMetadata) {
        GroupMetadata groupMetadata = positionMetadata.groupMetadata;
        if (groupMetadata == null) {
            return false;
        }
        this.mExpGroupMetadataList.remove(groupMetadata);
        refreshExpGroupMetadataList(false, false);
        notifyItemRangeChanged(0, getItemCount());
        this.mExpandableListAdapter.onGroupCollapsed(positionMetadata.groupMetadata.gPos);
        return true;
    }

    public boolean expandGroup(PositionMetadata positionMetadata) {
        if (positionMetadata.position.groupPos >= 0) {
            if (this.mMaxExpGroupCount == 0 || positionMetadata.groupMetadata != null) {
                return false;
            }
            if (this.mExpGroupMetadataList.size() >= this.mMaxExpGroupCount) {
                GroupMetadata groupMetadata = this.mExpGroupMetadataList.get(0);
                int iIndexOf = this.mExpGroupMetadataList.indexOf(groupMetadata);
                collapseGroup(groupMetadata.gPos);
                int i = positionMetadata.groupInsertIndex;
                if (i > iIndexOf) {
                    positionMetadata.groupInsertIndex = i - 1;
                }
            }
            int i2 = positionMetadata.position.groupPos;
            GroupMetadata groupMetadataObtain = GroupMetadata.obtain(-1, -1, i2, this.mExpandableListAdapter.getGroupId(i2));
            View viewFindViewByPosition = ((NearLinearLayoutManager) this.expandableRecyclerView.getLayoutManager()).findViewByPosition(positionMetadata.position.flatListPos);
            if (viewFindViewByPosition != null && viewFindViewByPosition.getBottom() >= this.expandableRecyclerView.getHeight() - this.expandableRecyclerView.getPaddingBottom()) {
                this.mExpGroupMetadataList.add(positionMetadata.groupInsertIndex, groupMetadataObtain);
                refreshExpGroupMetadataList(false, false);
                this.mExpandableListAdapter.onGroupExpanded(groupMetadataObtain.gPos);
                notifyItemChanged(groupMetadataObtain.flPos);
                return false;
            }
            if (!startExpandAnimation(groupMetadataObtain.gPos)) {
                return false;
            }
            this.mExpGroupMetadataList.add(positionMetadata.groupInsertIndex, groupMetadataObtain);
            refreshExpGroupMetadataList(false, false);
            notifyItemRangeChanged(0, getItemCount());
            this.mExpandableListAdapter.onGroupExpanded(groupMetadataObtain.gPos);
            return true;
        }
        throw new RuntimeException("Need group");
    }
}
