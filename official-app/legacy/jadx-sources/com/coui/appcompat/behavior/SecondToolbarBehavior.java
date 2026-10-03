package com.coui.appcompat.behavior;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.support.preference.R$bool;
import com.support.preference.R$dimen;
import com.support.preference.R$id;

/* JADX INFO: loaded from: classes13.dex */
public class SecondToolbarBehavior extends CoordinatorLayout.Behavior<AppBarLayout> implements AbsListView.OnScrollListener {
    public Resources A;
    public int B;
    public boolean C;
    public View i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public View f1546j;
    public View k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f1547l;
    public int m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int[] f1548n;
    public int o;
    public ViewGroup.LayoutParams p;
    public int q;
    public int r;
    public int s;
    public int t;
    public int u;
    public int v;
    public int w;
    public int x;
    public float y;
    public float z;

    public class a implements View.OnScrollChangeListener {
        public a() {
        }

        @Override // android.view.View.OnScrollChangeListener
        public void onScrollChange(View view, int i, int i2, int i3, int i4) {
            SecondToolbarBehavior.this.b();
        }
    }

    public SecondToolbarBehavior() {
        this.f1548n = new int[2];
    }

    public final void b() {
        this.k = null;
        View view = this.f1546j;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (viewGroup.getChildCount() > 0) {
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    if (viewGroup.getChildAt(i).getVisibility() == 0) {
                        this.k = viewGroup.getChildAt(i);
                        break;
                    }
                }
            }
        }
        if (this.k == null) {
            this.k = this.f1546j;
        }
        this.k.getLocationOnScreen(this.f1548n);
        int i2 = this.f1548n[1];
        int[] iArr = new int[2];
        this.f1546j.getRootView().getLocationOnScreen(iArr);
        int i3 = iArr[1];
        if (i3 != 0) {
            i2 -= i3;
        }
        this.f1547l = 0;
        if (i2 < this.s) {
            this.f1547l = this.t;
        } else {
            int i4 = this.r;
            if (i2 > i4) {
                this.f1547l = 0;
            } else {
                this.f1547l = i4 - i2;
            }
        }
        int i5 = this.f1547l;
        this.m = i5;
        if (this.y <= 1.0f) {
            float fAbs = Math.abs(i5) / this.t;
            this.y = fAbs;
            this.i.setAlpha(fAbs);
        }
        if (i2 < this.u) {
            this.f1547l = this.w;
        } else {
            int i6 = this.v;
            if (i2 > i6) {
                this.f1547l = 0;
            } else {
                this.f1547l = i6 - i2;
            }
        }
        int i7 = this.f1547l;
        this.m = i7;
        float fAbs2 = Math.abs(i7) / this.w;
        this.z = fAbs2;
        ViewGroup.LayoutParams layoutParams = this.p;
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            int i8 = (int) (this.q * (1.0f - fAbs2));
            ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = i8;
            ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = i8;
        }
        this.i.setLayoutParams(layoutParams);
    }

    public final void init(Context context) {
        Resources resources = context.getResources();
        this.A = resources;
        this.q = resources.getDimensionPixelOffset(R$dimen.preference_divider_margin_horizontal);
        this.t = this.A.getDimensionPixelOffset(R$dimen.preference_line_alpha_range_change_offset);
        this.w = this.A.getDimensionPixelOffset(R$dimen.preference_divider_width_change_offset);
        this.x = this.A.getDimensionPixelOffset(R$dimen.preference_divider_width_start_count_offset);
        this.C = this.A.getBoolean(R$bool.is_dialog_preference_immersive);
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
        boolean z = (i & 2) != 0 && coordinatorLayout.getHeight() - view.getHeight() <= appBarLayout.getHeight();
        if (!this.C && z) {
            if (this.r <= 0) {
                this.f1546j = view2;
                this.i = appBarLayout.findViewById(R$id.divider_line);
            }
            int measuredHeight = appBarLayout.getMeasuredHeight();
            this.r = measuredHeight;
            this.s = measuredHeight - this.t;
            int i3 = measuredHeight - this.x;
            this.v = i3;
            this.u = i3 - this.w;
            this.B = this.i.getWidth();
            this.p = this.i.getLayoutParams();
            this.o = appBarLayout.getMeasuredWidth();
            view2.setOnScrollChangeListener(new a());
        }
        return false;
    }

    public SecondToolbarBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1548n = new int[2];
        init(context);
    }
}
