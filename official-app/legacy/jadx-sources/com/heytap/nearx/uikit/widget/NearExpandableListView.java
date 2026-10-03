package com.heytap.nearx.uikit.widget;

import android.R;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;
import com.heytap.nearx.uikit.internal.widget.a;
import com.oplus.aiunit.vision.i85;
import com.sensorsdata.analytics.android.autotrack.aop.SensorsDataAutoTrackHelper;
import com.sensorsdata.analytics.android.sdk.SensorsDataInstrumented;

/* JADX INFO: loaded from: classes18.dex */
public class NearExpandableListView extends ExpandableListView {
    private a.AbstractC0726a adapter;
    private a mDelegate;
    private ExpandableListView.OnGroupClickListener mGroupClickListener;

    public NearExpandableListView(Context context) {
        this(context, null);
    }

    private void init() {
        setDivider(null);
        setChildDivider(null);
        setGroupIndicator(null);
        super.setOnGroupClickListener(new ExpandableListView.OnGroupClickListener() { // from class: com.heytap.nearx.uikit.widget.NearExpandableListView.1
            @Override // android.widget.ExpandableListView.OnGroupClickListener
            @SensorsDataInstrumented
            public boolean onGroupClick(ExpandableListView expandableListView, View view, int i, long j2) {
                if (NearExpandableListView.this.mGroupClickListener == null || !NearExpandableListView.this.mGroupClickListener.onGroupClick(expandableListView, view, i, j2)) {
                    NearExpandableListView nearExpandableListView = NearExpandableListView.this;
                    if (ExpandableListView.getPackedPositionGroup(nearExpandableListView.getExpandableListPosition(nearExpandableListView.getLastVisiblePosition())) == i && NearExpandableListView.this.canScrollList(-1)) {
                        SensorsDataAutoTrackHelper.trackExpandableListViewOnGroupClick(expandableListView, view, i);
                        return false;
                    }
                    NearExpandableListView.this.playSoundEffect(0);
                    if (expandableListView.isGroupExpanded(i)) {
                        NearExpandableListView.this.collapseGroup(i);
                    } else {
                        NearExpandableListView.this.expandGroup(i);
                    }
                }
                SensorsDataAutoTrackHelper.trackExpandableListViewOnGroupClick(expandableListView, view, i);
                return true;
            }
        });
    }

    @Override // android.widget.ExpandableListView
    public boolean collapseGroup(int i) {
        boolean zA = this.adapter.a(i);
        if (zA) {
            this.adapter.notifyDataSetChanged();
        }
        return zA;
    }

    @Override // android.widget.ExpandableListView
    public boolean expandGroup(int i) {
        if (!this.adapter.b(i)) {
            return false;
        }
        boolean zExpandGroup = super.expandGroup(i);
        if (zExpandGroup) {
            return zExpandGroup;
        }
        this.adapter.c(i);
        return zExpandGroup;
    }

    public void originCollapseGroup(int i) {
        super.collapseGroup(i);
    }

    @Override // android.widget.ExpandableListView
    public void setAdapter(ExpandableListAdapter expandableListAdapter) {
        a.AbstractC0726a abstractC0726aA = this.mDelegate.a(expandableListAdapter, this);
        this.adapter = abstractC0726aA;
        super.setAdapter(abstractC0726aA);
    }

    @Override // android.widget.ExpandableListView
    public void setChildDivider(Drawable drawable) {
        if (drawable != null) {
            throw new RuntimeException("cannot set childDivider.");
        }
        super.setChildDivider(null);
    }

    @Override // android.widget.ListView
    public void setDivider(Drawable drawable) {
        super.setDivider(null);
    }

    @Override // android.widget.ExpandableListView
    public void setGroupIndicator(Drawable drawable) {
        if (drawable != null) {
            throw new RuntimeException("cannot set groupIndicator.");
        }
        super.setGroupIndicator(null);
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams.height == -2) {
            throw new RuntimeException("cannot set wrap_content");
        }
        super.setLayoutParams(layoutParams);
    }

    @Override // android.widget.ExpandableListView
    public void setOnGroupClickListener(ExpandableListView.OnGroupClickListener onGroupClickListener) {
        this.mGroupClickListener = onGroupClickListener;
    }

    public NearExpandableListView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.listViewStyle);
    }

    public NearExpandableListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mDelegate = (a) i85.e();
        init();
    }
}
