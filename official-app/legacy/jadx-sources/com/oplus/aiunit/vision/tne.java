package com.oplus.aiunit.vision;

import android.graphics.Rect;
import android.util.Log;

/* JADX INFO: loaded from: classes13.dex */
public class tne extends fz5 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final boolean f17070n;
    public Rect a = new Rect();
    public Rect b = new Rect();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Rect f17071c = new Rect();
    public Rect d = new Rect();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Rect f17072e = new Rect();
    public Rect f = new Rect();
    public Rect g = new Rect();
    public Rect h = new Rect();
    public Rect i = new Rect();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f17073j = 0;
    public int k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f17074l = false;
    public boolean m = false;

    static {
        f17070n = bj2.LOG_DEBUG || bj2.e("PopupMenuDomain", 3);
    }

    public void a() {
        Log.d("PopupMenuDomain", "mWindow = " + this.a + " mAnchor = " + this.b + " mAnchorOutsets = " + this.h + " mWindowBarriers = " + this.i + " mMainMenu = " + this.f17071c + " mMainMenuRelocated = " + this.d + " mSubMenu = " + this.f17072e + " mSubMenuAnchor = " + this.g + " mGlobalOffsetX = " + this.f17073j + " mGlobalOffsetY = " + this.k);
    }

    public void b(Rect rect) {
        Rect rect2 = this.b;
        int i = rect2.left;
        Rect rect3 = this.h;
        rect.set(i - rect3.left, rect2.top - rect3.top, rect2.right + rect3.right, rect2.bottom + rect3.bottom);
    }

    public void c(Rect rect) {
        Rect rect2 = this.a;
        int i = rect2.left;
        Rect rect3 = this.i;
        rect.set(i + rect3.left, rect2.top + rect3.top, rect2.right - rect3.right, rect2.bottom - rect3.bottom);
        if (f17070n) {
            Log.d("PopupMenuDomain", "PopupMenuDomain getAvailableRect mWindow.left " + this.a.left + " mWindowBarriers.left " + this.i.left + " mWindow.top " + this.a.top + " mWindowBarriers.top " + this.i.top + " mWindow.right " + this.a.right + " mWindowBarriers.right " + this.i.right + " mWindow.bottom " + this.a.bottom + " mWindowBarriers.bottom " + this.i.bottom);
        }
    }

    public int d() {
        Rect rect = this.a;
        int i = rect.bottom;
        Rect rect2 = this.i;
        return (i - rect2.bottom) - (rect.top + rect2.top);
    }

    public int e() {
        return this.m ? this.f17071c.centerX() : Math.min(Math.max(this.b.centerX(), this.f17071c.left), this.f17071c.right);
    }

    public int f() {
        if (this.m) {
            return this.f17071c.centerY();
        }
        return this.f17071c.centerY() > this.b.centerY() ? this.f17071c.top : this.f17071c.bottom;
    }

    public int g() {
        Rect rect = this.f17072e;
        if (rect.left > this.f17071c.left) {
            return 0;
        }
        return rect.width();
    }

    public int h() {
        return this.g.centerY() - this.f17072e.top;
    }

    public void i() {
        this.a.setEmpty();
        this.b.setEmpty();
        this.f17071c.setEmpty();
        this.f17072e.setEmpty();
        this.f.setEmpty();
        this.h.setEmpty();
        this.i.setEmpty();
        this.d.setEmpty();
        this.g.setEmpty();
    }
}
