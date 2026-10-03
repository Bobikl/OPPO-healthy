package com.heytap.store.base.widget.recyclerview;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\b\u001a\u00020\u0007J\u0012\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/heytap/store/base/widget/recyclerview/AccuracyOffsetYLinearLayoutManager;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "itemsHeight", "Landroid/util/SparseArray;", "", "getMoreAccuracyScrollYOffset", "onLayoutCompleted", "", "state", "Landroidx/recyclerview/widget/RecyclerView$State;", "Widget_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public class AccuracyOffsetYLinearLayoutManager extends LinearLayoutManager {

    @NotNull
    private final SparseArray<Integer> itemsHeight;

    public AccuracyOffsetYLinearLayoutManager(@Nullable Context context) {
        super(context);
        this.itemsHeight = new SparseArray<>();
    }

    public final int getMoreAccuracyScrollYOffset() {
        int iFindFirstVisibleItemPosition;
        View viewFindViewByPosition;
        if (getChildCount() == 0 || (viewFindViewByPosition = findViewByPosition((iFindFirstVisibleItemPosition = findFirstVisibleItemPosition()))) == null) {
            return 0;
        }
        ViewGroup.LayoutParams layoutParams = viewFindViewByPosition.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        int i = marginLayoutParams == null ? 0 : marginLayoutParams.topMargin;
        float fFloatValue = -viewFindViewByPosition.getY();
        int i2 = 0;
        while (i2 < iFindFirstVisibleItemPosition) {
            int i3 = i2 + 1;
            Integer num = this.itemsHeight.get(i2, 0);
            Intrinsics.checkNotNullExpressionValue(num, "itemsHeight.get(i, 0)");
            fFloatValue += num.floatValue();
            i2 = i3;
        }
        return ((int) fFloatValue) + getPaddingTop() + i;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutCompleted(@Nullable RecyclerView.State state) {
        super.onLayoutCompleted(state);
        int childCount = getChildCount();
        int i = 0;
        while (i < childCount) {
            int i2 = i + 1;
            View childAt = getChildAt(i);
            if (childAt != null) {
                this.itemsHeight.put(getPosition(childAt), Integer.valueOf(childAt.getHeight()));
            }
            i = i2;
        }
    }
}
