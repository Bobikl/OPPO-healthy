package com.heytap.nearx.uikit.widget.expanded;

import android.widget.ExpandableListView;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes18.dex */
class NearExpandableRecyclerPosition {
    public static final int CHILD = 1;
    public static final int GROUP = 2;
    private static final int MAX_POOL_SIZE = 5;
    private static ArrayList<NearExpandableRecyclerPosition> sPool = new ArrayList<>(5);
    public int childPos;
    int flatListPos;
    public int groupPos;
    public int type;

    private NearExpandableRecyclerPosition() {
    }

    private static NearExpandableRecyclerPosition getRecycledOrCreate() {
        synchronized (sPool) {
            if (sPool.size() <= 0) {
                return new NearExpandableRecyclerPosition();
            }
            NearExpandableRecyclerPosition nearExpandableRecyclerPositionRemove = sPool.remove(0);
            nearExpandableRecyclerPositionRemove.resetState();
            return nearExpandableRecyclerPositionRemove;
        }
    }

    public static NearExpandableRecyclerPosition obtain(int i, int i2, int i3, int i4) {
        NearExpandableRecyclerPosition recycledOrCreate = getRecycledOrCreate();
        recycledOrCreate.type = i;
        recycledOrCreate.groupPos = i2;
        recycledOrCreate.childPos = i3;
        recycledOrCreate.flatListPos = i4;
        return recycledOrCreate;
    }

    public static NearExpandableRecyclerPosition obtainChildPosition(int i, int i2) {
        return obtain(1, i, i2, 0);
    }

    public static NearExpandableRecyclerPosition obtainGroupPosition(int i) {
        return obtain(2, i, 0, 0);
    }

    public static NearExpandableRecyclerPosition obtainPosition(long j2) {
        if (j2 == 4294967295L) {
            return null;
        }
        NearExpandableRecyclerPosition recycledOrCreate = getRecycledOrCreate();
        recycledOrCreate.groupPos = ExpandableListView.getPackedPositionGroup(j2);
        if (ExpandableListView.getPackedPositionType(j2) == 1) {
            recycledOrCreate.type = 1;
            recycledOrCreate.childPos = ExpandableListView.getPackedPositionChild(j2);
        } else {
            recycledOrCreate.type = 2;
        }
        return recycledOrCreate;
    }

    private void resetState() {
        this.groupPos = 0;
        this.childPos = 0;
        this.flatListPos = 0;
        this.type = 0;
    }

    public long getPackedPosition() {
        return this.type == 1 ? ExpandableListView.getPackedPositionForChild(this.groupPos, this.childPos) : ExpandableListView.getPackedPositionForGroup(this.groupPos);
    }

    public void recycle() {
        synchronized (sPool) {
            if (sPool.size() < 5) {
                sPool.add(this);
            }
        }
    }
}
