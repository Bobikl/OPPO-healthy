package com.heytap.nearx.uikit.behavior;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.heytap.nearx.uikit.R$bool;
import com.heytap.nearx.uikit.R$dimen;
import com.heytap.nearx.uikit.R$id;

/* JADX INFO: loaded from: classes18.dex */
public class SecondToolbarBehavior extends CoordinatorLayout.Behavior<AppBarLayout> implements AbsListView.OnScrollListener {
    public Resources A;
    public int B;
    public boolean C;
    public View i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public View f7442j;
    public View k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f7443l;
    public int m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f7444n;
    public int[] o;
    public int p;
    public ViewGroup.LayoutParams q;
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
        this.o = new int[2];
    }

    public final void b() {
        this.k = null;
        View view = this.f7442j;
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
            this.k = this.f7442j;
        }
        this.k.getLocationOnScreen(this.o);
        int i2 = this.o[1];
        this.f7443l = i2;
        this.m = 0;
        if (i2 < this.t) {
            this.m = this.u;
        } else {
            int i3 = this.s;
            if (i2 > i3) {
                this.m = 0;
            } else {
                this.m = i3 - i2;
            }
        }
        int i4 = this.m;
        this.f7444n = i4;
        if (this.y <= 1.0f) {
            float fAbs = Math.abs(i4) / this.u;
            this.y = fAbs;
            this.i.setAlpha(fAbs);
        }
        int i5 = this.f7443l;
        if (i5 < this.v) {
            this.m = this.x;
        } else {
            int i6 = this.w;
            if (i5 > i6) {
                this.m = 0;
            } else {
                this.m = i6 - i5;
            }
        }
        int i7 = this.m;
        this.f7444n = i7;
        float fAbs2 = Math.abs(i7) / this.x;
        this.z = fAbs2;
        ViewGroup.LayoutParams layoutParams = this.q;
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            int i8 = (int) (this.r * (1.0f - fAbs2));
            ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = i8;
            ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = i8;
        }
        this.i.setLayoutParams(layoutParams);
    }

    public final void init(Context context) {
        Resources resources = context.getResources();
        this.A = resources;
        this.r = resources.getDimensionPixelOffset(R$dimen.nx_preference_divider_margin_horizontal);
        this.u = this.A.getDimensionPixelOffset(R$dimen.nx_preference_line_alpha_range_change_offset);
        this.x = this.A.getDimensionPixelOffset(R$dimen.nx_preference_divider_width_change_offset);
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
            if (this.s <= 0) {
                this.s = appBarLayout.getMeasuredHeight();
                this.f7442j = view2;
                View viewFindViewById = appBarLayout.findViewById(R$id.divider_line);
                this.i = viewFindViewById;
                this.B = viewFindViewById.getWidth();
                this.q = this.i.getLayoutParams();
                this.p = appBarLayout.getMeasuredWidth();
                int i3 = this.s;
                this.t = i3 - this.u;
                int dimensionPixelOffset = i3 - this.A.getDimensionPixelOffset(R$dimen.nx_preference_divider_width_start_count_offset);
                this.w = dimensionPixelOffset;
                this.v = dimensionPixelOffset - this.x;
            }
            view2.setOnScrollChangeListener(new a());
        }
        return false;
    }

    public SecondToolbarBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.o = new int[2];
        init(context);
    }
}
