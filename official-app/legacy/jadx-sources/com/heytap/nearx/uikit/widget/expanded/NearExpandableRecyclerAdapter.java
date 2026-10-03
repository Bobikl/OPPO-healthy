package com.heytap.nearx.uikit.widget.expanded;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes18.dex */
public interface NearExpandableRecyclerAdapter {
    boolean areAllItemsEnabled();

    Object getChild(int i, int i2);

    long getChildId(int i, int i2);

    int getChildType(int i, int i2);

    int getChildrenCount(int i);

    long getCombinedChildId(long j2, long j3);

    long getCombinedGroupId(long j2);

    Object getGroup(int i);

    int getGroupCount();

    long getGroupId(int i);

    int getGroupType(int i);

    int getGroupTypeCount();

    boolean hasStableIds();

    boolean isChildSelectable(int i, int i2);

    boolean isEmpty();

    void onBindChildView(int i, int i2, boolean z, RecyclerView.ViewHolder viewHolder);

    void onBindGroupView(int i, boolean z, RecyclerView.ViewHolder viewHolder);

    RecyclerView.ViewHolder onCreateChildView(ViewGroup viewGroup, int i);

    RecyclerView.ViewHolder onCreateGroupView(ViewGroup viewGroup, int i);

    void onGroupCollapsed(int i);

    void onGroupExpanded(int i);

    void registerAdapterDataObserver(RecyclerView.AdapterDataObserver adapterDataObserver);

    void setHasStableIds(boolean z);

    void unregisterAdapterDataObserver(RecyclerView.AdapterDataObserver adapterDataObserver);
}
