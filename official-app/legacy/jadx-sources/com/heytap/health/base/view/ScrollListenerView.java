package com.heytap.health.base.view;

import android.content.Context;
import android.util.AttributeSet;
import androidx.core.view.ViewCompat;

/* JADX INFO: loaded from: classes15.dex */
public class ScrollListenerView extends BounceScrollView {
    public a D;

    public interface a {
        void a(int i, int i2, int i3, int i4);
    }

    public ScrollListenerView(Context context) {
        this(context, null);
    }

    @Override // com.heytap.health.base.view.BounceScrollView, android.view.View
    public boolean canScrollVertically(int i) {
        int iComputeVerticalScrollOffset = computeVerticalScrollOffset();
        int iComputeVerticalScrollRange = computeVerticalScrollRange() - computeVerticalScrollExtent();
        if (iComputeVerticalScrollRange == 0) {
            iComputeVerticalScrollRange += 2;
        }
        if (i < 0) {
            return iComputeVerticalScrollOffset > 0;
        }
        return iComputeVerticalScrollOffset < iComputeVerticalScrollRange - 1;
    }

    @Override // android.view.View
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        a aVar = this.D;
        if (aVar != null) {
            aVar.a(i, i2, i3, i4);
        }
    }

    public void setOnScrollListener(a aVar) {
        this.D = aVar;
    }

    public ScrollListenerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ScrollListenerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ViewCompat.setNestedScrollingEnabled(this, true);
    }
}
