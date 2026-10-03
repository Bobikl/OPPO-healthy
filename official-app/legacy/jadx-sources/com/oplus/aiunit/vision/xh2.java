package com.oplus.aiunit.vision;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import androidx.annotation.UiThread;
import androidx.recyclerview.widget.RecyclerView;
import com.coui.appcompat.viewpager.COUIScrollEventAdapter;
import com.coui.appcompat.viewpager.COUIViewPager2;

/* JADX INFO: loaded from: classes13.dex */
public class xh2 {
    public final COUIViewPager2 a;
    public final COUIScrollEventAdapter b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final RecyclerView f18626c;
    public VelocityTracker d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f18627e;
    public float f;
    public int g;
    public long h;

    public xh2(COUIViewPager2 cOUIViewPager2, COUIScrollEventAdapter cOUIScrollEventAdapter, RecyclerView recyclerView) {
        this.a = cOUIViewPager2;
        this.b = cOUIScrollEventAdapter;
        this.f18626c = recyclerView;
    }

    public final void a(long j2, int i, float f, float f2) {
        MotionEvent motionEventObtain = MotionEvent.obtain(this.h, j2, i, f, f2, 0);
        this.d.addMovement(motionEventObtain);
        motionEventObtain.recycle();
    }

    @UiThread
    public boolean b() {
        if (this.b.isDragging()) {
            return false;
        }
        this.g = 0;
        this.f = 0;
        this.h = SystemClock.uptimeMillis();
        c();
        this.b.notifyBeginFakeDrag();
        if (!this.b.isIdle()) {
            this.f18626c.stopScroll();
        }
        a(this.h, 0, 0.0f, 0.0f);
        return true;
    }

    public final void c() {
        VelocityTracker velocityTracker = this.d;
        if (velocityTracker != null) {
            velocityTracker.clear();
        } else {
            this.d = VelocityTracker.obtain();
            this.f18627e = ViewConfiguration.get(this.a.getContext()).getScaledMaximumFlingVelocity();
        }
    }

    public boolean d() {
        return this.b.isFakeDragging();
    }
}
