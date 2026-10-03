package com.heytap.health.wallet.widget.behavior;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.oppo.lib.common.R$dimen;
import com.oppo.lib.common.R$id;

/* JADX INFO: loaded from: classes18.dex */
public class SecondToolbarBehavior extends CoordinatorLayout.Behavior<AppBarLayout> implements AbsListView.OnScrollListener {
    public View i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f6428j;
    public int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f6429l;
    public Context m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public View f6430n;
    public View o;
    public int p;
    public int q;
    public int r;
    public int[] s;
    public int t;
    public int u;
    public ViewGroup.LayoutParams v;
    public int w;
    public AppBarLayout x;

    public class a implements View.OnScrollChangeListener {
        public a() {
        }

        @Override // android.view.View.OnScrollChangeListener
        public void onScrollChange(View view, int i, int i2, int i3, int i4) {
            SecondToolbarBehavior.this.b();
        }
    }

    public SecondToolbarBehavior() {
        this.s = new int[2];
    }

    public final void b() {
        this.o = null;
        View view = this.f6430n;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (viewGroup.getChildCount() > 0) {
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    if (viewGroup.getChildAt(i).getVisibility() == 0) {
                        this.o = viewGroup.getChildAt(i);
                        break;
                    }
                }
            }
        }
        if (this.o == null) {
            this.o = this.f6430n;
        }
        this.o.getLocationOnScreen(this.s);
        int i2 = this.s[1];
        this.p = i2;
        this.q = 0;
        if (this.i != null) {
            if (i2 < this.u) {
                this.q = this.f6429l / 2;
            } else {
                int i3 = this.f6428j;
                if (i2 > i3) {
                    this.q = 0;
                } else {
                    this.q = i3 - i2;
                }
            }
            int i4 = this.q;
            this.r = i4;
            this.i.setAlpha(Math.abs(i4) / (this.f6429l / 2));
        }
        if (this.i != null) {
            int i5 = this.p;
            if (i5 < this.k) {
                int i6 = this.f6429l;
                this.q = i6 - (i6 / 2);
            } else {
                int i7 = this.f6428j;
                int i8 = this.f6429l;
                if (i5 > i7 - (i8 / 2)) {
                    this.q = 0;
                } else {
                    this.q = (i7 - (i8 / 2)) - i5;
                }
            }
            int i9 = this.q;
            this.r = i9;
            float fAbs = Math.abs(i9);
            int i10 = this.f6429l;
            float f = fAbs / (i10 - (i10 / 2));
            ViewGroup.LayoutParams layoutParams = this.v;
            layoutParams.width = (int) (this.t - ((this.w * 2) * (1.0f - f)));
            this.i.setLayoutParams(layoutParams);
        }
    }

    public final void init(Context context) {
        this.w = context.getResources().getDimensionPixelOffset(R$dimen.NXcommon_margin);
        this.f6429l = context.getResources().getDimensionPixelOffset(R$dimen.NXstandard_scroll_height);
        this.k = 0;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        b();
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(AbsListView absListView, int i) {
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onStartNestedScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull AppBarLayout appBarLayout, @NonNull View view, @NonNull View view2, int i, int i2) {
        if ((i & 2) != 0 && coordinatorLayout.getHeight() - view.getHeight() <= appBarLayout.getHeight()) {
            if (this.f6428j <= 0) {
                this.m = coordinatorLayout.getContext();
                int measuredHeight = appBarLayout.getMeasuredHeight();
                this.f6428j = measuredHeight;
                this.u = measuredHeight - (this.f6429l / 2);
                this.f6430n = view2;
                View viewFindViewById = appBarLayout.findViewById(R$id.divider_line);
                this.i = viewFindViewById;
                if (viewFindViewById != null) {
                    this.v = viewFindViewById.getLayoutParams();
                }
                this.t = appBarLayout.getMeasuredWidth();
                this.x = appBarLayout;
            }
            view2.setOnScrollChangeListener(new a());
        }
        return false;
    }

    public SecondToolbarBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.s = new int[2];
        init(context);
    }
}
