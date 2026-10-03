package com.heytap.health.bandface.watchface.worldclock.cities.behavior;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.heytap.health.bandface.R$dimen;
import com.heytap.health.bandface.R$id;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes15.dex */
public class HeaderFloatBehavior extends CoordinatorLayout.Behavior<View> {
    public float i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f3148j;
    public float k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f3149l;
    public TextView m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public WeakReference<View> f3150n;
    public float o;

    public HeaderFloatBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context);
    }

    public final void a(Context context) {
        Resources resources = context.getResources();
        float dimension = resources.getDimension(R$dimen.band_search_hear_h);
        this.k = resources.getDimension(R$dimen.band_tv_14sp);
        this.f3148j = resources.getDimension(R$dimen.band_dimen_24);
        this.i = resources.getDimension(R$dimen.band_dp10);
        this.o = resources.getDimension(R$dimen.band_dp1);
        float f = this.k;
        if (dimension != f) {
            this.f3149l = 1.0f / (dimension - f);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean layoutDependsOn(CoordinatorLayout coordinatorLayout, View view, View view2) {
        if (view2 == null || view2.getId() != R$id.img_searchBg) {
            return false;
        }
        this.f3150n = new WeakReference<>(view2);
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, View view, View view2) {
        float fAbs = this.f3148j;
        float f = this.i;
        float f2 = this.o;
        float height = (view2.getHeight() + view2.getTranslationY()) - f;
        if (height <= f2) {
            fAbs *= 1.0f - Math.abs(view2.getTranslationY() / view2.getHeight());
        } else {
            f2 = height;
        }
        if (this.m == null) {
            this.m = (TextView) view.findViewById(R$id.tv_search);
        }
        float f3 = this.k;
        if (f2 > f3) {
            this.m.setAlpha((f2 - f3) * this.f3149l);
        } else {
            this.m.setAlpha(0.0f);
        }
        CoordinatorLayout.LayoutParams layoutParams = (CoordinatorLayout.LayoutParams) view.getLayoutParams();
        int i = (int) fAbs;
        layoutParams.setMargins(i, 0, i, (int) (f * 2.0f));
        ((ViewGroup.MarginLayoutParams) layoutParams).height = (int) f2;
        view.setLayoutParams(layoutParams);
        return true;
    }
}
