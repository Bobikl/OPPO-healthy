package com.coui.appcompat.touchhelper;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.customview.widget.ExploreByTouchHelper;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class COUIViewExplorerByTouchHelper extends ExploreByTouchHelper {
    public final Rect i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public View f2142j;
    public a k;

    public interface a {
        CharSequence getClassName();

        int getCurrentPosition();

        int getDisablePosition();

        void getItemBounds(int i, Rect rect);

        int getItemCounts();

        CharSequence getItemDescription(int i);

        int getVirtualViewAt(float f, float f2);

        void performAction(int i, int i2, boolean z);
    }

    public COUIViewExplorerByTouchHelper(View view) {
        super(view);
        this.i = new Rect();
        this.k = null;
        this.f2142j = view;
    }

    public final void a(int i, Rect rect) {
        if (i < 0 || i >= this.k.getItemCounts()) {
            return;
        }
        this.k.getItemBounds(i, rect);
    }

    public void b(a aVar) {
        this.k = aVar;
    }

    @Override // androidx.customview.widget.ExploreByTouchHelper
    public int getVirtualViewAt(float f, float f2) {
        int virtualViewAt = this.k.getVirtualViewAt(f, f2);
        if (virtualViewAt >= 0) {
            return virtualViewAt;
        }
        return Integer.MIN_VALUE;
    }

    @Override // androidx.customview.widget.ExploreByTouchHelper
    public void getVisibleVirtualViews(List<Integer> list) {
        for (int i = 0; i < this.k.getItemCounts(); i++) {
            list.add(Integer.valueOf(i));
        }
    }

    @Override // androidx.customview.widget.ExploreByTouchHelper
    public boolean onPerformActionForVirtualView(int i, int i2, Bundle bundle) {
        if (i2 != 16) {
            return false;
        }
        this.k.performAction(i, 16, false);
        return true;
    }

    @Override // androidx.customview.widget.ExploreByTouchHelper
    public void onPopulateEventForVirtualView(int i, AccessibilityEvent accessibilityEvent) {
        accessibilityEvent.setContentDescription(this.k.getItemDescription(i));
    }

    @Override // androidx.customview.widget.ExploreByTouchHelper
    public void onPopulateNodeForVirtualView(int i, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        a(i, this.i);
        accessibilityNodeInfoCompat.setContentDescription(this.k.getItemDescription(i));
        accessibilityNodeInfoCompat.setBoundsInParent(this.i);
        if (this.k.getClassName() != null) {
            accessibilityNodeInfoCompat.setClassName(this.k.getClassName());
        }
        accessibilityNodeInfoCompat.addAction(16);
        if (i == this.k.getCurrentPosition()) {
            accessibilityNodeInfoCompat.setSelected(true);
        }
        if (i == this.k.getDisablePosition()) {
            accessibilityNodeInfoCompat.setEnabled(false);
        }
    }
}
