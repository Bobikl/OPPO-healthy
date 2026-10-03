package com.oplus.aiunit.vision;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.viewpager.widget.ViewPager;

/* JADX INFO: loaded from: classes19.dex */
public class xx0 implements Handler.Callback {
    public static final int MSG_SCROLL = 1;
    public static final long SCROLL_DELAYED = 4000;
    public static final String TAG = "BannerRotateHelper";
    public ViewPager i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Handler f18785j = new Handler(Looper.getMainLooper(), this);
    public int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f18786l;

    public class a implements View.OnAttachStateChangeListener {
        public a() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            xx0.this.f18786l = true;
            xx0.this.d();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            xx0.this.f18786l = false;
            xx0.this.c();
        }
    }

    public final void b() {
        this.i.addOnAttachStateChangeListener(new a());
    }

    public void c() {
        this.f18785j.removeMessages(1);
    }

    public void d() {
        if (this.f18786l) {
            f();
        }
    }

    public void e(ViewPager viewPager, int i) {
        this.k = i;
        if (this.i == viewPager) {
            return;
        }
        this.i = viewPager;
        b();
    }

    public void f() {
        if (this.k > 1) {
            g(SCROLL_DELAYED);
        } else {
            ltl.a(TAG, "[startRotate] mBannerCount <= 1 and not rotate.");
        }
    }

    public final void g(long j2) {
        this.f18785j.removeMessages(1);
        this.f18785j.sendEmptyMessageDelayed(1, j2);
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(@NonNull Message message) {
        ViewPager viewPager = this.i;
        if (viewPager != null) {
            this.i.setCurrentItem(viewPager.getCurrentItem() + 1);
            g(SCROLL_DELAYED);
        }
        return true;
    }
}
