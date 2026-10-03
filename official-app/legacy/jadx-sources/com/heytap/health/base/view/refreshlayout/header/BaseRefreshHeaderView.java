package com.heytap.health.base.view.refreshlayout.header;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes15.dex */
public abstract class BaseRefreshHeaderView extends FrameLayout {
    public static final int HEADER_COMPLETED = 4;
    public static final int HEADER_DRAG = 1;
    public static final int HEADER_REFRESHING = 3;
    public static final int HEADER_RELEASE = 2;
    public boolean i;

    public BaseRefreshHeaderView(Context context) {
        this(context, null);
    }

    public abstract void a();

    public abstract boolean b();

    public abstract boolean c();

    public abstract void d(float f);

    public abstract void e();

    public abstract void f();

    public abstract void g();

    public abstract int getHeaderHeight();

    public void setCanTranslation(boolean z) {
        this.i = z;
    }

    public abstract void setParent(ViewGroup viewGroup);

    public BaseRefreshHeaderView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public BaseRefreshHeaderView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.i = true;
    }
}
