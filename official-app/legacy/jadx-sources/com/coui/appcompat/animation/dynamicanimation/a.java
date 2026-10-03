package com.coui.appcompat.animation.dynamicanimation;

import android.os.SystemClock;
import android.view.Choreographer;
import androidx.annotation.RequiresApi;
import androidx.collection.SimpleArrayMap;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes13.dex */
public class a {
    public static final ThreadLocal<a> sAnimatorHandler = new ThreadLocal<>();
    public c d;
    public final SimpleArrayMap<b, Long> a = new SimpleArrayMap<>();
    public final ArrayList<b> b = new ArrayList<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0191a f1530c = new C0191a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f1531e = 0;
    public boolean f = false;

    /* JADX INFO: renamed from: com.coui.appcompat.animation.dynamicanimation.a$a, reason: collision with other inner class name */
    public class C0191a {
        public C0191a() {
        }

        public void a() {
            a.this.f1531e = SystemClock.uptimeMillis();
            a aVar = a.this;
            aVar.c(aVar.f1531e);
            if (a.this.b.size() > 0) {
                a.this.e().a();
            }
        }
    }

    public interface b {
        boolean doAnimationFrame(long j2);
    }

    public static abstract class c {
        public final C0191a a;

        public c(C0191a c0191a) {
            this.a = c0191a;
        }

        public abstract void a();
    }

    @RequiresApi(16)
    public static class d extends c {
        public final Choreographer b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Choreographer.FrameCallback f1532c;

        /* JADX INFO: renamed from: com.coui.appcompat.animation.dynamicanimation.a$d$a, reason: collision with other inner class name */
        public class ChoreographerFrameCallbackC0192a implements Choreographer.FrameCallback {
            public ChoreographerFrameCallbackC0192a() {
            }

            @Override // android.view.Choreographer.FrameCallback
            public void doFrame(long j2) {
                d.this.a.a();
            }
        }

        public d(C0191a c0191a) {
            super(c0191a);
            this.b = Choreographer.getInstance();
            this.f1532c = new ChoreographerFrameCallbackC0192a();
        }

        @Override // com.coui.appcompat.animation.dynamicanimation.a.c
        public void a() {
            this.b.postFrameCallback(this.f1532c);
        }
    }

    public static a d() {
        ThreadLocal<a> threadLocal = sAnimatorHandler;
        if (threadLocal.get() == null) {
            threadLocal.set(new a());
        }
        return threadLocal.get();
    }

    public void a(b bVar, long j2) {
        if (this.b.size() == 0) {
            e().a();
        }
        if (!this.b.contains(bVar)) {
            this.b.add(bVar);
        }
        if (j2 > 0) {
            this.a.put(bVar, Long.valueOf(SystemClock.uptimeMillis() + j2));
        }
    }

    public final void b() {
        if (this.f) {
            for (int size = this.b.size() - 1; size >= 0; size--) {
                if (this.b.get(size) == null) {
                    this.b.remove(size);
                }
            }
            this.f = false;
        }
    }

    public void c(long j2) {
        long jUptimeMillis = SystemClock.uptimeMillis();
        for (int i = 0; i < this.b.size(); i++) {
            b bVar = this.b.get(i);
            if (bVar != null && f(bVar, jUptimeMillis)) {
                bVar.doAnimationFrame(j2);
            }
        }
        b();
    }

    public c e() {
        if (this.d == null) {
            this.d = new d(this.f1530c);
        }
        return this.d;
    }

    public final boolean f(b bVar, long j2) {
        Long l2 = this.a.get(bVar);
        if (l2 == null) {
            return true;
        }
        if (l2.longValue() >= j2) {
            return false;
        }
        this.a.remove(bVar);
        return true;
    }

    public void g(b bVar) {
        this.a.remove(bVar);
        int iIndexOf = this.b.indexOf(bVar);
        if (iIndexOf >= 0) {
            this.b.set(iIndexOf, null);
            this.f = true;
        }
    }
}
