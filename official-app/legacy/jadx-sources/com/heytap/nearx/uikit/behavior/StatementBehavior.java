package com.heytap.nearx.uikit.behavior;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.heytap.nearx.uikit.R$dimen;
import com.heytap.nearx.uikit.R$id;

/* JADX INFO: loaded from: classes18.dex */
public class StatementBehavior extends CoordinatorLayout.Behavior {
    public Resources A;
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public View f7445j;
    public View k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public View f7446l;
    public int m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f7447n;
    public int o;
    public int[] p;
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
            StatementBehavior.this.onScroll();
        }
    }

    public StatementBehavior() {
        this.p = new int[2];
    }

    public final void init(Context context) {
        Resources resources = context.getResources();
        this.A = resources;
        this.r = resources.getDimensionPixelOffset(R$dimen.nx_preference_divider_margin_horizontal) * 2;
        this.u = this.A.getDimensionPixelOffset(R$dimen.nx_preference_line_alpha_range_change_offset);
        this.x = this.A.getDimensionPixelOffset(R$dimen.nx_preference_divider_width_change_offset);
    }

    public final void onScroll() {
        this.f7446l = null;
        View view = this.k;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (viewGroup.getChildCount() > 0) {
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    if (viewGroup.getChildAt(i).getVisibility() == 0) {
                        this.f7446l = viewGroup.getChildAt(i);
                        break;
                    }
                }
            }
        }
        if (this.f7446l == null) {
            this.f7446l = this.k;
        }
        this.f7446l.getLocationOnScreen(this.p);
        int i2 = this.p[1];
        this.m = i2;
        this.f7447n = 0;
        if (i2 < this.t) {
            this.f7447n = this.u;
        } else {
            int i3 = this.s;
            if (i2 > i3) {
                this.f7447n = 0;
            } else {
                this.f7447n = i3 - i2;
            }
        }
        int i4 = this.f7447n;
        this.o = i4;
        if (this.y <= 1.0f) {
            float fAbs = Math.abs(i4) / this.u;
            this.y = fAbs;
            this.f7445j.setAlpha(fAbs);
        }
        int i5 = this.m;
        if (i5 < this.v) {
            this.f7447n = this.x;
        } else {
            int i6 = this.w;
            if (i5 > i6) {
                this.f7447n = 0;
            } else {
                this.f7447n = i6 - i5;
            }
        }
        int i7 = this.f7447n;
        this.o = i7;
        float fAbs2 = Math.abs(i7) / this.x;
        this.z = fAbs2;
        ViewGroup.LayoutParams layoutParams = this.q;
        layoutParams.width = (int) (this.i - (this.r * (1.0f - fAbs2)));
        this.f7445j.setLayoutParams(layoutParams);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onStartNestedScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull View view2, @NonNull View view3, int i, int i2) {
        if (this.s <= 0) {
            view.getLocationOnScreen(this.p);
            this.s = this.p[1];
            this.k = view3;
            View viewFindViewById = view.findViewById(R$id.divider_line);
            this.f7445j = viewFindViewById;
            this.i = viewFindViewById.getWidth();
            this.q = this.f7445j.getLayoutParams();
            int i3 = this.s;
            this.t = i3 - this.u;
            int dimensionPixelOffset = i3 - this.A.getDimensionPixelOffset(R$dimen.nx_preference_divider_width_start_count_offset);
            this.w = dimensionPixelOffset;
            this.v = dimensionPixelOffset - this.x;
        }
        view3.setOnScrollChangeListener(new a());
        return false;
    }

    public StatementBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.p = new int[2];
        init(context);
    }
}
