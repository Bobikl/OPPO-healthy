package com.heytap.nearx.uikit.widget.seekbar.icon;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.customview.widget.ExploreByTouchHelper;
import java.lang.ref.WeakReference;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public class PatternExploreByTouchHelper extends ExploreByTouchHelper {
    private WeakReference<NearIconSeekBar> mBarWeakReference;

    public PatternExploreByTouchHelper(NearIconSeekBar nearIconSeekBar) {
        super(nearIconSeekBar);
        this.mBarWeakReference = new WeakReference<>(nearIconSeekBar);
    }

    private NearIconSeekBar getBar() {
        return this.mBarWeakReference.get();
    }

    private Rect getBoundsForVirtualView(int i) {
        Rect rect = new Rect();
        rect.left = 0;
        rect.top = 0;
        rect.right = getBar().getWidth();
        rect.bottom = getBar().getHeight();
        return rect;
    }

    @Override // androidx.customview.widget.ExploreByTouchHelper
    public int getVirtualViewAt(float f, float f2) {
        return (f < 0.0f || f > ((float) getBar().getWidth()) || f2 < 0.0f || f2 > ((float) getBar().getHeight())) ? -1 : 0;
    }

    @Override // androidx.customview.widget.ExploreByTouchHelper
    public void getVisibleVirtualViews(List<Integer> list) {
        list.add(0);
    }

    @Override // androidx.customview.widget.ExploreByTouchHelper, androidx.core.view.AccessibilityDelegateCompat
    public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
        accessibilityNodeInfoCompat.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SET_PROGRESS);
        accessibilityNodeInfoCompat.setRangeInfo(AccessibilityNodeInfoCompat.RangeInfoCompat.obtain(1, 0.0f, getBar().getMax(), getBar().getProgress()));
        if (this.mBarWeakReference.get().isEnabled()) {
            int progress = getBar().getProgress();
            if (progress > 0) {
                accessibilityNodeInfoCompat.addAction(8192);
            }
            if (progress < getBar().getMax()) {
                accessibilityNodeInfoCompat.addAction(4096);
            }
        }
    }

    @Override // androidx.customview.widget.ExploreByTouchHelper
    public boolean onPerformActionForVirtualView(int i, int i2, Bundle bundle) {
        sendEventForVirtualView(i, 4);
        return false;
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // androidx.customview.widget.ExploreByTouchHelper
    public void onPopulateEventForVirtualView(int i, AccessibilityEvent accessibilityEvent) {
        accessibilityEvent.getText().add(getClass().getSimpleName());
        accessibilityEvent.setItemCount(getBar().getMax());
        accessibilityEvent.setCurrentItemIndex(getBar().getProgress());
    }

    @Override // androidx.customview.widget.ExploreByTouchHelper
    public void onPopulateNodeForVirtualView(int i, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        accessibilityNodeInfoCompat.setContentDescription("");
        accessibilityNodeInfoCompat.setClassName(NearIconSeekBar.class.getName());
        accessibilityNodeInfoCompat.setBoundsInParent(getBoundsForVirtualView(i));
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        if (super.performAccessibilityAction(view, i, bundle)) {
            return true;
        }
        if (!getBar().isEnabled()) {
            return false;
        }
        if (i == 4096) {
            getBar().setProgress(getBar().getProgress() + getBar().getIncrement(), false, true);
            getBar().announceForAccessibility(getBar().getProgressContentDescription());
            return true;
        }
        if (i != 8192) {
            return false;
        }
        getBar().setProgress(getBar().getProgress() - getBar().getIncrement(), false, true);
        getBar().announceForAccessibility(getBar().getProgressContentDescription());
        return true;
    }

    public void release() {
        this.mBarWeakReference = null;
    }
}
