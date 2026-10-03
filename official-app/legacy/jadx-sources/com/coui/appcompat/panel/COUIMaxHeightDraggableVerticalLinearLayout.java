package com.coui.appcompat.panel;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public class COUIMaxHeightDraggableVerticalLinearLayout extends COUIDraggableVerticalLinearLayout {
    private int mLayoutWindowVisibility;

    public COUIMaxHeightDraggableVerticalLinearLayout(@NonNull Context context) {
        super(context);
    }

    public int getMaxHeight() {
        return COUIPanelMultiWindowUtils.getPanelMaxHeight(getContext(), null);
    }

    public void layoutAtMaxHeight() {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.height = getMaxHeight();
        setLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i) {
        if (this.mLayoutWindowVisibility == 8 && i == 0) {
            measure(View.MeasureSpec.makeMeasureSpec(getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getHeight(), 1073741824));
        }
        this.mLayoutWindowVisibility = i;
        super.onWindowVisibilityChanged(i);
    }

    public COUIMaxHeightDraggableVerticalLinearLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public COUIMaxHeightDraggableVerticalLinearLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
