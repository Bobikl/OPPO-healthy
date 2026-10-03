package com.coui.appcompat.seekbar;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.customview.widget.ExploreByTouchHelper;
import java.lang.ref.WeakReference;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class PatternExploreByTouchHelper extends ExploreByTouchHelper {
    public WeakReference<COUIIconSeekBar> i;

    public PatternExploreByTouchHelper(COUIIconSeekBar cOUIIconSeekBar) {
        super(cOUIIconSeekBar);
        this.i = new WeakReference<>(cOUIIconSeekBar);
    }

    public final COUIIconSeekBar a() {
        return this.i.get();
    }

    public final Rect getBoundsForVirtualView(int i) {
        Rect rect = new Rect();
        rect.left = 0;
        rect.top = 0;
        rect.right = a().getWidth();
        rect.bottom = a().getHeight();
        return rect;
    }

    @Override // androidx.customview.widget.ExploreByTouchHelper
    public int getVirtualViewAt(float f, float f2) {
        return (f < 0.0f || f > ((float) a().getWidth()) || f2 < 0.0f || f2 > ((float) a().getHeight())) ? -1 : 0;
    }

    @Override // androidx.customview.widget.ExploreByTouchHelper
    public void getVisibleVirtualViews(List<Integer> list) {
        list.add(0);
    }

    @Override // androidx.customview.widget.ExploreByTouchHelper, androidx.core.view.AccessibilityDelegateCompat
    public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
        accessibilityNodeInfoCompat.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SET_PROGRESS);
        accessibilityNodeInfoCompat.setRangeInfo(AccessibilityNodeInfoCompat.RangeInfoCompat.obtain(1, 0.0f, a().getMax(), a().getProgress()));
        if (this.i.get().isEnabled()) {
            int progress = a().getProgress();
            if (progress > 0) {
                accessibilityNodeInfoCompat.addAction(8192);
            }
            if (progress < a().getMax()) {
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
        accessibilityEvent.setItemCount(a().getMax());
        accessibilityEvent.setCurrentItemIndex(a().getProgress());
    }

    @Override // androidx.customview.widget.ExploreByTouchHelper
    public void onPopulateNodeForVirtualView(int i, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        accessibilityNodeInfoCompat.setContentDescription("");
        accessibilityNodeInfoCompat.setClassName(COUIIconSeekBar.class.getName());
        accessibilityNodeInfoCompat.setBoundsInParent(getBoundsForVirtualView(i));
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        if (super.performAccessibilityAction(view, i, bundle)) {
            return true;
        }
        if (!a().isEnabled()) {
            return false;
        }
        if (i == 4096) {
            a().y(a().getProgress() + a().getIncrement(), false, true);
            a().announceForAccessibility(a().getProgressContentDescription());
            return true;
        }
        if (i != 8192) {
            return false;
        }
        a().y(a().getProgress() - a().getIncrement(), false, true);
        a().announceForAccessibility(a().getProgressContentDescription());
        return true;
    }
}
