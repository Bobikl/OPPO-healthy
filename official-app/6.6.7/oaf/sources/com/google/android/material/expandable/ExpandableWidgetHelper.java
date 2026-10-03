package com.google.android.material.expandable;

import android.os.Bundle;
import android.view.View;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public final class ExpandableWidgetHelper {
    private boolean expanded = false;

    @IdRes
    private int expandedComponentIdHint = 0;

    @NonNull
    private final View widget;

    /* JADX WARN: Multi-variable type inference failed */
    public ExpandableWidgetHelper(ExpandableWidget expandableWidget) {
        this.widget = (View) expandableWidget;
    }

    private void dispatchExpandedStateChanged() {
        CoordinatorLayout parent = this.widget.getParent();
        if (parent instanceof CoordinatorLayout) {
            parent.dispatchDependentViewsChanged(this.widget);
        }
    }

    @IdRes
    public int getExpandedComponentIdHint() {
        return this.expandedComponentIdHint;
    }

    public boolean isExpanded() {
        return this.expanded;
    }

    public void onRestoreInstanceState(@NonNull Bundle bundle) {
        this.expanded = bundle.getBoolean("expanded", false);
        this.expandedComponentIdHint = bundle.getInt("expandedComponentIdHint", 0);
        if (this.expanded) {
            dispatchExpandedStateChanged();
        }
    }

    @NonNull
    public Bundle onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("expanded", this.expanded);
        bundle.putInt("expandedComponentIdHint", this.expandedComponentIdHint);
        return bundle;
    }

    public boolean setExpanded(boolean z) {
        if (this.expanded == z) {
            return false;
        }
        this.expanded = z;
        dispatchExpandedStateChanged();
        return true;
    }

    public void setExpandedComponentIdHint(@IdRes int i) {
        this.expandedComponentIdHint = i;
    }
}
