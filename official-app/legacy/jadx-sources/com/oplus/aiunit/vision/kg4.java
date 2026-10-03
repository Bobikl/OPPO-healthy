package com.oplus.aiunit.vision;

import android.content.Context;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.bumptech.glide.R$id;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public abstract class kg4<T extends View, Z> implements boj<Z> {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @IdRes
    public static final int f13268n = R$id.glide_custom_view_target_tag;
    public final a i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final T f13269j;

    @Nullable
    public View.OnAttachStateChangeListener k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f13270l;
    public boolean m;

    @VisibleForTesting
    public static final class a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @Nullable
        @VisibleForTesting
        public static Integer f13271e;
        public final View a;
        public final List<l7h> b = new ArrayList();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f13272c;

        @Nullable
        public ViewTreeObserverOnPreDrawListenerC0892a d;

        /* JADX INFO: renamed from: com.oplus.aiunit.vision.kg4$a$a, reason: collision with other inner class name */
        public static final class ViewTreeObserverOnPreDrawListenerC0892a implements ViewTreeObserver.OnPreDrawListener {
            public final WeakReference<a> i;

            public ViewTreeObserverOnPreDrawListenerC0892a(@NonNull a aVar) {
                this.i = new WeakReference<>(aVar);
            }

            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                if (Log.isLoggable("CustomViewTarget", 2)) {
                    Log.v("CustomViewTarget", "OnGlobalLayoutListener called attachStateListener=" + this);
                }
                a aVar = this.i.get();
                if (aVar == null) {
                    return true;
                }
                aVar.a();
                return true;
            }
        }

        public a(@NonNull View view) {
            this.a = view;
        }

        public static int c(@NonNull Context context) {
            if (f13271e == null) {
                Display defaultDisplay = ((WindowManager) cpe.d((WindowManager) context.getSystemService("window"))).getDefaultDisplay();
                Point point = new Point();
                defaultDisplay.getSize(point);
                f13271e = Integer.valueOf(Math.max(point.x, point.y));
            }
            return f13271e.intValue();
        }

        public void a() {
            if (this.b.isEmpty()) {
                return;
            }
            int iG = g();
            int iF = f();
            if (i(iG, iF)) {
                j(iG, iF);
                b();
            }
        }

        public void b() {
            ViewTreeObserver viewTreeObserver = this.a.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(this.d);
            }
            this.d = null;
            this.b.clear();
        }

        public void d(@NonNull l7h l7hVar) {
            int iG = g();
            int iF = f();
            if (i(iG, iF)) {
                l7hVar.d(iG, iF);
                return;
            }
            if (!this.b.contains(l7hVar)) {
                this.b.add(l7hVar);
            }
            if (this.d == null) {
                ViewTreeObserver viewTreeObserver = this.a.getViewTreeObserver();
                ViewTreeObserverOnPreDrawListenerC0892a viewTreeObserverOnPreDrawListenerC0892a = new ViewTreeObserverOnPreDrawListenerC0892a(this);
                this.d = viewTreeObserverOnPreDrawListenerC0892a;
                viewTreeObserver.addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC0892a);
            }
        }

        public final int e(int i, int i2, int i3) {
            int i4 = i2 - i3;
            if (i4 > 0) {
                return i4;
            }
            if (this.f13272c && this.a.isLayoutRequested()) {
                return 0;
            }
            int i5 = i - i3;
            if (i5 > 0) {
                return i5;
            }
            if (this.a.isLayoutRequested() || i2 != -2) {
                return 0;
            }
            if (Log.isLoggable("CustomViewTarget", 4)) {
                Log.i("CustomViewTarget", "Glide treats LayoutParams.WRAP_CONTENT as a request for an image the size of this device's screen dimensions. If you want to load the original image and are ok with the corresponding memory cost and OOMs (depending on the input size), use .override(Target.SIZE_ORIGINAL). Otherwise, use LayoutParams.MATCH_PARENT, set layout_width and layout_height to fixed dimension, or use .override() with fixed dimensions.");
            }
            return c(this.a.getContext());
        }

        public final int f() {
            int paddingTop = this.a.getPaddingTop() + this.a.getPaddingBottom();
            ViewGroup.LayoutParams layoutParams = this.a.getLayoutParams();
            return e(this.a.getHeight(), layoutParams != null ? layoutParams.height : 0, paddingTop);
        }

        public final int g() {
            int paddingLeft = this.a.getPaddingLeft() + this.a.getPaddingRight();
            ViewGroup.LayoutParams layoutParams = this.a.getLayoutParams();
            return e(this.a.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingLeft);
        }

        public final boolean h(int i) {
            return i > 0 || i == Integer.MIN_VALUE;
        }

        public final boolean i(int i, int i2) {
            return h(i) && h(i2);
        }

        public final void j(int i, int i2) {
            Iterator it = new ArrayList(this.b).iterator();
            while (it.hasNext()) {
                ((l7h) it.next()).d(i, i2);
            }
        }

        public void k(@NonNull l7h l7hVar) {
            this.b.remove(l7hVar);
        }
    }

    public kg4(@NonNull T t) {
        this.f13269j = (T) cpe.d(t);
        this.i = new a(t);
    }

    @Nullable
    public final Object a() {
        return this.f13269j.getTag(f13268n);
    }

    public final void b() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.k;
        if (onAttachStateChangeListener == null || this.m) {
            return;
        }
        this.f13269j.addOnAttachStateChangeListener(onAttachStateChangeListener);
        this.m = true;
    }

    public final void c() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.k;
        if (onAttachStateChangeListener == null || !this.m) {
            return;
        }
        this.f13269j.removeOnAttachStateChangeListener(onAttachStateChangeListener);
        this.m = false;
    }

    public abstract void d(@Nullable Drawable drawable);

    public void e(@Nullable Drawable drawable) {
    }

    public final void f(@Nullable Object obj) {
        this.f13269j.setTag(f13268n, obj);
    }

    @Override // com.oplus.aiunit.vision.boj
    @Nullable
    public final dqf getRequest() {
        Object objA = a();
        if (objA == null) {
            return null;
        }
        if (objA instanceof dqf) {
            return (dqf) objA;
        }
        throw new IllegalArgumentException("You must not pass non-R.id ids to setTag(id)");
    }

    @Override // com.oplus.aiunit.vision.boj
    public final void getSize(@NonNull l7h l7hVar) {
        this.i.d(l7hVar);
    }

    @Override // com.oplus.aiunit.vision.bwa
    public void onDestroy() {
    }

    @Override // com.oplus.aiunit.vision.boj
    public final void onLoadCleared(@Nullable Drawable drawable) {
        this.i.b();
        d(drawable);
        if (this.f13270l) {
            return;
        }
        c();
    }

    @Override // com.oplus.aiunit.vision.boj
    public final void onLoadStarted(@Nullable Drawable drawable) {
        b();
        e(drawable);
    }

    @Override // com.oplus.aiunit.vision.bwa
    public void onStart() {
    }

    @Override // com.oplus.aiunit.vision.bwa
    public void onStop() {
    }

    @Override // com.oplus.aiunit.vision.boj
    public final void removeCallback(@NonNull l7h l7hVar) {
        this.i.k(l7hVar);
    }

    @Override // com.oplus.aiunit.vision.boj
    public final void setRequest(@Nullable dqf dqfVar) {
        f(dqfVar);
    }

    public String toString() {
        return "Target for: " + this.f13269j;
    }
}
