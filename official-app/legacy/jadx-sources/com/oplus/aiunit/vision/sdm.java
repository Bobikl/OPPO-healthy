package com.oplus.aiunit.vision;

import android.graphics.Rect;
import android.view.View;
import com.amap.api.maps.model.BaseOverlay;
import com.amap.api.maps.model.Marker;
import com.amap.api.maps.model.MarkerOptions;
import com.autonavi.amap.mapcore.DPoint;

/* JADX INFO: loaded from: classes12.dex */
public final class sdm {
    public Marker a;
    public volatile int b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile int f16557c = 0;
    public volatile int d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile int f16558e = 0;
    public boolean f = false;
    public boolean g = false;
    public boolean h = false;
    public int i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f16559j = 0;

    public sdm(Marker marker) {
        this.a = marker;
    }

    public final synchronized void a(int i, int i2) {
        int iK;
        int iQ;
        int i3;
        MarkerOptions options = this.a.getOptions();
        if (options == null) {
            return;
        }
        float anchorU = options.getAnchorU();
        float anchorV = options.getAnchorV();
        View iconView = options.getIconView();
        int i4 = 0;
        if (iconView != null) {
            iK = k();
            iQ = q();
        } else {
            iK = 0;
            iQ = 0;
        }
        if (iconView != null) {
            i4 = (int) (iK * anchorU);
            i3 = (int) (iQ * anchorV);
        } else {
            i3 = 0;
        }
        if (i4 != 0 && i3 != 0) {
            if (Math.abs(this.b - i) > 2) {
                this.d = i - i4;
                this.f = true;
            }
            if (Math.abs(this.f16557c - i2) > 2) {
                this.f16558e = i2 - i3;
                this.f = true;
            }
        }
    }

    public final void b(View view) {
        if (this.i == 0 && this.f16559j == 0) {
            view.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
            this.i = view.getMeasuredWidth();
            this.f16559j = view.getMeasuredHeight();
        }
    }

    public final void c(boolean z) {
        this.g = z;
    }

    public final boolean d() {
        return this.h;
    }

    public final boolean e(DPoint dPoint) {
        View iconView = this.a.getOptions().getIconView();
        Rect rect = new Rect();
        if (iconView != null) {
            iconView.getHitRect(rect);
        }
        return rect.contains((int) dPoint.x, (int) dPoint.y);
    }

    public final void f() {
        this.h = true;
    }

    public final synchronized void g(int i, int i2) {
        if (this.f) {
            MarkerOptions options = this.a.getOptions();
            if (options == null) {
                return;
            }
            View iconView = options.getIconView();
            if (iconView == null) {
                return;
            }
            iconView.setX(this.d);
            iconView.setY(this.f16558e);
            iconView.setZ(options.getZIndex());
            if (i != -1) {
                this.b = i;
            }
            if (i2 != -1) {
                this.f16557c = i2;
            }
            this.f = false;
        }
    }

    public final BaseOverlay h() {
        return this.a;
    }

    public final void i(int i, int i2) {
        this.f = false;
        this.b = i;
        this.f16557c = i2;
    }

    public final View j() {
        MarkerOptions options = this.a.getOptions();
        if (options == null) {
            return null;
        }
        return options.getIconView();
    }

    public final int k() {
        MarkerOptions options = this.a.getOptions();
        if (options == null) {
            return 0;
        }
        View iconView = options.getIconView();
        int width = iconView.getWidth();
        if (width != 0) {
            return width;
        }
        b(iconView);
        return this.i;
    }

    public final synchronized int l() {
        return this.d;
    }

    public final synchronized int m() {
        return this.f16558e;
    }

    public final boolean n() {
        return this.f;
    }

    public final void o() {
        View iconView;
        MarkerOptions options = this.a.getOptions();
        if (options == null || (iconView = options.getIconView()) == null) {
            return;
        }
        if (options.isVisible() == (iconView.getVisibility() == 0)) {
            return;
        }
        iconView.setVisibility(options.isVisible() ? 0 : 8);
    }

    public final boolean p() {
        return this.g;
    }

    public final int q() {
        MarkerOptions options = this.a.getOptions();
        if (options == null) {
            return 0;
        }
        View iconView = options.getIconView();
        int height = iconView.getHeight();
        if (height != 0) {
            return height;
        }
        b(iconView);
        return this.f16559j;
    }
}
