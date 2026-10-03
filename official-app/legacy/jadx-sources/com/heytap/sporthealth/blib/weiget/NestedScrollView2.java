package com.heytap.sporthealth.blib.weiget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.widget.NestedScrollView;
import com.heytap.health.ui.R$id;
import com.oplus.aiunit.vision.yha;
import fitness.support.v7.widget.JToolbar;

/* JADX INFO: loaded from: classes2.dex */
public class NestedScrollView2 extends NestedScrollView {
    public boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public JToolbar.a f7752j;

    public NestedScrollView2(Context context) {
        super(context);
        this.i = true;
    }

    public final void a(int i, int i2) {
        JToolbar.a aVar = this.f7752j;
        if (aVar != null) {
            aVar.b(Math.abs(getScrollY()));
        }
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.i) {
            View viewFindViewById = getRootView().findViewById(R$id.fit_toolbar);
            if (viewFindViewById instanceof JToolbar) {
                JToolbar.a jDividerHelper = ((JToolbar) viewFindViewById).getJDividerHelper();
                this.f7752j = jDividerHelper;
                jDividerHelper.b(0);
                yha.b("onAttachedToWindow：", Integer.valueOf(getScrollY()));
            }
        }
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.View
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        a(i2, 0);
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z && isShown() && this.f7752j != null) {
            yha.b("onWindowFocusChanged：", Integer.valueOf(getScrollY()));
            this.f7752j.b(getScrollY());
        }
    }

    public NestedScrollView2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.i = true;
    }

    public NestedScrollView2(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.i = true;
    }
}
