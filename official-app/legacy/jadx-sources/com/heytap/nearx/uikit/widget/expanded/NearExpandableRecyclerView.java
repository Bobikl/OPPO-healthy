package com.heytap.nearx.uikit.widget.expanded;

import android.content.Context;
import android.database.Observable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.NearLinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.heytap.nearx.uikit.widget.NearRecyclerView;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes18.dex */
public class NearExpandableRecyclerView extends NearRecyclerView {
    private NearExpandableRecyclerAdapter mAdapter;
    private NearExpandableRecyclerConnector mConnector;
    private OnChildClickListener mOnChildClickListener;
    private OnGroupClickListener mOnGroupClickListener;
    private OnGroupCollapseListener mOnGroupCollapseListener;
    private OnGroupExpandListener mOnGroupExpandListener;

    public static abstract class Adapter implements NearExpandableRecyclerAdapter {
        private ColorRecyclerViewDataObserver mObservable = new ColorRecyclerViewDataObserver();
        private boolean mHasStableIds = false;

        @Override // com.heytap.nearx.uikit.widget.expanded.NearExpandableRecyclerAdapter
        public boolean areAllItemsEnabled() {
            return true;
        }

        @Override // com.heytap.nearx.uikit.widget.expanded.NearExpandableRecyclerAdapter
        public long getChildId(int i, int i2) {
            return i2;
        }

        @Override // com.heytap.nearx.uikit.widget.expanded.NearExpandableRecyclerAdapter
        public int getChildType(int i, int i2) {
            return 0;
        }

        @Override // com.heytap.nearx.uikit.widget.expanded.NearExpandableRecyclerAdapter
        public long getCombinedChildId(long j2, long j3) {
            return ((j2 & 2147483647L) << 32) | Long.MIN_VALUE | (j3 & (-1));
        }

        @Override // com.heytap.nearx.uikit.widget.expanded.NearExpandableRecyclerAdapter
        public long getCombinedGroupId(long j2) {
            return (j2 & 2147483647L) << 32;
        }

        @Override // com.heytap.nearx.uikit.widget.expanded.NearExpandableRecyclerAdapter
        public long getGroupId(int i) {
            return i;
        }

        @Override // com.heytap.nearx.uikit.widget.expanded.NearExpandableRecyclerAdapter
        public int getGroupType(int i) {
            return 0;
        }

        @Override // com.heytap.nearx.uikit.widget.expanded.NearExpandableRecyclerAdapter
        public int getGroupTypeCount() {
            return 1;
        }

        @Override // com.heytap.nearx.uikit.widget.expanded.NearExpandableRecyclerAdapter
        public boolean hasStableIds() {
            return this.mHasStableIds;
        }

        @Override // com.heytap.nearx.uikit.widget.expanded.NearExpandableRecyclerAdapter
        public boolean isChildSelectable(int i, int i2) {
            return true;
        }

        @Override // com.heytap.nearx.uikit.widget.expanded.NearExpandableRecyclerAdapter
        public boolean isEmpty() {
            return getGroupCount() == 0;
        }

        public final void notifyDataSetChanged() {
            this.mObservable.notifyChanged();
        }

        public final void notifyItemChanged(int i) {
            this.mObservable.notifyItemRangeChanged(i, 1);
        }

        public final void notifyItemInserted(int i) {
            this.mObservable.notifyItemRangeInserted(i, 1);
        }

        public final void notifyItemMoved(int i, int i2) {
            this.mObservable.notifyItemMoved(i, i2);
        }

        public final void notifyItemRangeChanged(int i, int i2) {
            this.mObservable.notifyItemRangeChanged(i, i2);
        }

        public final void notifyItemRangeInserted(int i, int i2) {
            this.mObservable.notifyItemRangeInserted(i, i2);
        }

        public final void notifyItemRangeRemoved(int i, int i2) {
            this.mObservable.notifyItemRangeRemoved(i, i2);
        }

        public final void notifyItemRemoved(int i) {
            this.mObservable.notifyItemRangeRemoved(i, 1);
        }

        @Override // com.heytap.nearx.uikit.widget.expanded.NearExpandableRecyclerAdapter
        public void onGroupCollapsed(int i) {
        }

        @Override // com.heytap.nearx.uikit.widget.expanded.NearExpandableRecyclerAdapter
        public void onGroupExpanded(int i) {
        }

        @Override // com.heytap.nearx.uikit.widget.expanded.NearExpandableRecyclerAdapter
        public void registerAdapterDataObserver(RecyclerView.AdapterDataObserver adapterDataObserver) {
            this.mObservable.registerObserver(adapterDataObserver);
        }

        @Override // com.heytap.nearx.uikit.widget.expanded.NearExpandableRecyclerAdapter
        public void setHasStableIds(boolean z) {
            this.mHasStableIds = z;
        }

        @Override // com.heytap.nearx.uikit.widget.expanded.NearExpandableRecyclerAdapter
        public void unregisterAdapterDataObserver(RecyclerView.AdapterDataObserver adapterDataObserver) {
            this.mObservable.unregisterObserver(adapterDataObserver);
        }

        public final void notifyItemChanged(int i, Object obj) {
            this.mObservable.notifyItemRangeChanged(i, 1, obj);
        }

        public final void notifyItemRangeChanged(int i, int i2, Object obj) {
            this.mObservable.notifyItemRangeChanged(i, i2, obj);
        }
    }

    public static class ColorRecyclerViewDataObserver extends Observable<RecyclerView.AdapterDataObserver> {
        public boolean hasObservers() {
            return !((Observable) this).mObservers.isEmpty();
        }

        public void notifyChanged() {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((RecyclerView.AdapterDataObserver) ((Observable) this).mObservers.get(size)).onChanged();
            }
        }

        public void notifyItemMoved(int i, int i2) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((RecyclerView.AdapterDataObserver) ((Observable) this).mObservers.get(size)).onItemRangeMoved(i, i2, 1);
            }
        }

        public void notifyItemRangeChanged(int i, int i2) {
            notifyItemRangeChanged(i, i2, null);
        }

        public void notifyItemRangeInserted(int i, int i2) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((RecyclerView.AdapterDataObserver) ((Observable) this).mObservers.get(size)).onItemRangeInserted(i, i2);
            }
        }

        public void notifyItemRangeRemoved(int i, int i2) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((RecyclerView.AdapterDataObserver) ((Observable) this).mObservers.get(size)).onItemRangeRemoved(i, i2);
            }
        }

        public void notifyItemRangeChanged(int i, int i2, Object obj) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((RecyclerView.AdapterDataObserver) ((Observable) this).mObservers.get(size)).onItemRangeChanged(i, i2, obj);
            }
        }
    }

    public interface OnChildClickListener {
        boolean onChildClick(NearRecyclerView nearRecyclerView, View view, int i, int i2, long j2);
    }

    public interface OnGroupClickListener {
        boolean onGroupClick(NearExpandableRecyclerView nearExpandableRecyclerView, View view, int i, long j2);
    }

    public interface OnGroupCollapseListener {
        void onGroupCollapse(int i);
    }

    public interface OnGroupExpandListener {
        void onGroupExpand(int i);
    }

    public NearExpandableRecyclerView(Context context) {
        super(context);
        setItemAnimator(null);
    }

    private long getChildOrGroupId(NearExpandableRecyclerPosition nearExpandableRecyclerPosition) {
        return nearExpandableRecyclerPosition.type == 1 ? this.mAdapter.getChildId(nearExpandableRecyclerPosition.groupPos, nearExpandableRecyclerPosition.childPos) : this.mAdapter.getGroupId(nearExpandableRecyclerPosition.groupPos);
    }

    public boolean collapseGroup(int i) {
        if (!this.mConnector.isGroupExpanded(i) || !this.mConnector.startCollapseAnimation(i)) {
            return false;
        }
        this.mConnector.collapseGroupAnimator();
        OnGroupCollapseListener onGroupCollapseListener = this.mOnGroupCollapseListener;
        if (onGroupCollapseListener == null) {
            return true;
        }
        onGroupCollapseListener.onGroupCollapse(i);
        return true;
    }

    public boolean expandGroup(int i) {
        OnGroupExpandListener onGroupExpandListener;
        boolean zExpandGroup = this.mConnector.expandGroup(i);
        if (zExpandGroup && (onGroupExpandListener = this.mOnGroupExpandListener) != null) {
            onGroupExpandListener.onGroupExpand(i);
        }
        return zExpandGroup;
    }

    public void expandGroupAll() {
        int groupCount = this.mAdapter.getGroupCount();
        for (int i = 0; i < groupCount; i++) {
            expandGroup(i);
        }
    }

    public boolean handleClick(View view, int i) {
        boolean z;
        NearExpandableRecyclerConnector.PositionMetadata unflattenedPos = this.mConnector.getUnflattenedPos(i);
        long childOrGroupId = getChildOrGroupId(unflattenedPos.position);
        NearExpandableRecyclerPosition nearExpandableRecyclerPosition = unflattenedPos.position;
        if (nearExpandableRecyclerPosition.type == 2) {
            OnGroupClickListener onGroupClickListener = this.mOnGroupClickListener;
            z = true;
            if (onGroupClickListener != null && onGroupClickListener.onGroupClick(this, view, nearExpandableRecyclerPosition.groupPos, childOrGroupId)) {
                unflattenedPos.recycle();
                return true;
            }
            if (unflattenedPos.isExpanded()) {
                collapseGroup(unflattenedPos.position.groupPos);
            } else {
                expandGroup(unflattenedPos.position.groupPos);
            }
        } else {
            OnChildClickListener onChildClickListener = this.mOnChildClickListener;
            if (onChildClickListener != null) {
                return onChildClickListener.onChildClick(this, view, nearExpandableRecyclerPosition.groupPos, nearExpandableRecyclerPosition.childPos, childOrGroupId);
            }
            z = false;
        }
        unflattenedPos.recycle();
        return z;
    }

    public boolean isGroupExpanded(int i) {
        return this.mConnector.isGroupExpanded(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        ArrayList<NearExpandableRecyclerConnector.GroupMetadata> arrayList;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        NearExpandableRecyclerConnector nearExpandableRecyclerConnector = this.mConnector;
        if (nearExpandableRecyclerConnector == null || (arrayList = savedState.expandedGroupMetadataList) == null) {
            return;
        }
        nearExpandableRecyclerConnector.setExpandedGroupMetadataList(arrayList);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public Parcelable onSaveInstanceState() {
        Parcelable parcelableOnSaveInstanceState = super.onSaveInstanceState();
        NearExpandableRecyclerConnector nearExpandableRecyclerConnector = this.mConnector;
        return new SavedState(parcelableOnSaveInstanceState, nearExpandableRecyclerConnector != null ? nearExpandableRecyclerConnector.getExpandedGroupMetadataList() : null);
    }

    public void setAdapter(NearExpandableRecyclerAdapter nearExpandableRecyclerAdapter) {
        this.mAdapter = nearExpandableRecyclerAdapter;
        NearExpandableRecyclerConnector nearExpandableRecyclerConnector = new NearExpandableRecyclerConnector(nearExpandableRecyclerAdapter, this);
        this.mConnector = nearExpandableRecyclerConnector;
        super.setAdapter(nearExpandableRecyclerConnector);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void setItemAnimator(RecyclerView.ItemAnimator itemAnimator) {
        if (itemAnimator != null) {
            throw new RuntimeException("not set ItemAnimator");
        }
        super.setItemAnimator(null);
    }

    @Override // androidx.recyclerview.widget.InnerColorRecyclerView, androidx.recyclerview.widget.RecyclerView
    public void setLayoutManager(RecyclerView.LayoutManager layoutManager) {
        if (!(layoutManager instanceof NearLinearLayoutManager)) {
            throw new RuntimeException("only ColorLinearLayoutManager");
        }
        if (((NearLinearLayoutManager) layoutManager).getOrientation() != 1) {
            throw new RuntimeException("only vertical orientation");
        }
        super.setLayoutManager(layoutManager);
    }

    public void setOnChildClickListener(OnChildClickListener onChildClickListener) {
        this.mOnChildClickListener = onChildClickListener;
    }

    public void setOnGroupClickListener(OnGroupClickListener onGroupClickListener) {
        this.mOnGroupClickListener = onGroupClickListener;
    }

    public void setOnGroupCollapseListener(OnGroupCollapseListener onGroupCollapseListener) {
        this.mOnGroupCollapseListener = onGroupCollapseListener;
    }

    public void setOnGroupExpandListener(OnGroupExpandListener onGroupExpandListener) {
        this.mOnGroupExpandListener = onGroupExpandListener;
    }

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() { // from class: com.heytap.nearx.uikit.widget.expanded.NearExpandableRecyclerView.SavedState.1
            @Override // android.os.Parcelable.Creator
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }

            @Override // android.os.Parcelable.Creator
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.ClassLoaderCreator
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }
        };
        ArrayList<NearExpandableRecyclerConnector.GroupMetadata> expandedGroupMetadataList;

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeList(this.expandedGroupMetadataList);
        }

        public SavedState(Parcelable parcelable, ArrayList<NearExpandableRecyclerConnector.GroupMetadata> arrayList) {
            super(parcelable);
            this.expandedGroupMetadataList = arrayList;
        }

        private SavedState(Parcel parcel) {
            super(parcel);
            ArrayList<NearExpandableRecyclerConnector.GroupMetadata> arrayList = new ArrayList<>();
            this.expandedGroupMetadataList = arrayList;
            parcel.readList(arrayList, NearExpandableRecyclerConnector.GroupMetadata.class.getClassLoader());
        }

        private SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            ArrayList<NearExpandableRecyclerConnector.GroupMetadata> arrayList = new ArrayList<>();
            this.expandedGroupMetadataList = arrayList;
            parcel.readList(arrayList, NearExpandableRecyclerConnector.GroupMetadata.class.getClassLoader());
        }
    }

    public NearExpandableRecyclerView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        setItemAnimator(null);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void setAdapter(RecyclerView.Adapter adapter) {
        throw new RuntimeException("adapter instansof NearExpandableRecyclerAdapter");
    }

    public NearExpandableRecyclerView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setItemAnimator(null);
    }
}
