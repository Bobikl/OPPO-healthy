package com.coui.appcompat.lifecycle;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.MarginLayoutParamsCompat;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;
import com.coui.appcompat.sidepane.COUISidePaneLayout;
import com.oplus.aiunit.vision.zl2;

/* JADX INFO: loaded from: classes13.dex */
public class COUISidePaneLifeCycleObserver implements LifecycleObserver {
    public boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public COUISidePaneLayout f1818j;
    public View k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public View f1819l;
    public View m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Activity f1820n;
    public int o;
    public final View.OnLayoutChangeListener p;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (COUISidePaneLifeCycleObserver.this.f1818j.q()) {
                return;
            }
            zl2.d(COUISidePaneLifeCycleObserver.this.f1819l, COUISidePaneLifeCycleObserver.this.f1820n);
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    private void componentCreate() {
        d(true);
        this.f1818j.addOnLayoutChangeListener(this.p);
        this.f1818j.setLifeCycleObserverListener(null);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    private void componentDestroy() {
        this.f1818j.removeOnLayoutChangeListener(this.p);
        this.f1818j.setPanelSlideListener(null);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    private void componentRestore() {
        c();
    }

    public final void c() {
        if (zl2.b(this.f1820n) || zl2.c(this.f1820n)) {
            View view = this.m;
            if (view != null) {
                view.setVisibility(this.f1818j.q() ? 0 : 8);
            }
            if (this.f1819l == null || this.f1818j.q()) {
                return;
            }
            zl2.d(this.f1819l, this.f1820n);
            return;
        }
        View view2 = this.m;
        if (view2 != null) {
            view2.setVisibility(8);
        }
        View view3 = this.f1819l;
        if (view3 == null || !(view3.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            return;
        }
        MarginLayoutParamsCompat.setMarginStart((ViewGroup.MarginLayoutParams) this.f1819l.getLayoutParams(), 0);
    }

    public void d(boolean z) {
        if (zl2.b(this.f1820n) || zl2.c(this.f1820n)) {
            View view = this.k;
            if (view != null) {
                view.setVisibility(8);
            }
            if (this.i) {
                this.f1818j.setFirstViewWidth(this.o);
                this.f1818j.getChildAt(0).getLayoutParams().width = this.o;
            }
            this.f1818j.setCoverStyle(false);
            this.f1818j.setDefaultShowPane(Boolean.TRUE);
            View view2 = this.m;
            if (view2 != null) {
                view2.setVisibility(this.f1818j.q() ? 0 : 8);
            }
            if (this.f1819l != null) {
                if (!this.f1818j.q()) {
                    zl2.d(this.f1819l, this.f1820n);
                }
                if (z) {
                    return;
                }
                this.f1818j.post(new a());
                return;
            }
            return;
        }
        View view3 = this.m;
        if (view3 != null) {
            view3.setVisibility(8);
        }
        View view4 = this.k;
        if (view4 != null) {
            view4.setVisibility(0);
        }
        if (z) {
            this.f1818j.setCreateIcon(false);
            this.f1818j.g();
            this.f1818j.getChildAt(0).setVisibility(8);
            this.f1818j.setIconViewVisible(8);
        } else {
            this.f1818j.setDefaultShowPane(Boolean.FALSE);
        }
        View view5 = this.f1819l;
        if (view5 == null || !(view5.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) || z) {
            return;
        }
        MarginLayoutParamsCompat.setMarginStart((ViewGroup.MarginLayoutParams) this.f1819l.getLayoutParams(), 0);
    }
}
