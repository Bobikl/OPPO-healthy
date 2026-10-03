package com.oplus.aiunit.vision;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.View;
import androidx.annotation.CheckResult;
import androidx.annotation.DrawableRes;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RawRes;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.resource.gif.GifDrawable;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes13.dex */
public class vqf implements ComponentCallbacks2, bwa {
    public static final zqf u = zqf.F0(Bitmap.class).Z();
    public static final zqf v = zqf.F0(GifDrawable.class).Z();
    public static final zqf w = zqf.G0(ut5.DATA).j0(Priority.LOW).s0(true);
    public final com.bumptech.glide.a i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Context f17955j;
    public final zva k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @GuardedBy("this")
    public final crf f17956l;

    @GuardedBy("this")
    public final wqf m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @GuardedBy("this")
    public final joj f17957n;
    public final Runnable o;
    public final wz3 p;
    public final CopyOnWriteArrayList<uqf<Object>> q;

    @GuardedBy("this")
    public zqf r;
    public boolean s;
    public boolean t;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            vqf vqfVar = vqf.this;
            vqfVar.k.a(vqfVar);
        }
    }

    public static class b extends kg4<View, Object> {
        public b(@NonNull View view) {
            super(view);
        }

        @Override // com.oplus.aiunit.vision.kg4
        public void d(@Nullable Drawable drawable) {
        }

        @Override // com.oplus.aiunit.vision.boj
        public void onLoadFailed(@Nullable Drawable drawable) {
        }

        @Override // com.oplus.aiunit.vision.boj
        public void onResourceReady(@NonNull Object obj, @Nullable oak<? super Object> oakVar) {
        }
    }

    public class c implements wz3.a {

        @GuardedBy("RequestManager.this")
        public final crf a;

        public c(crf crfVar) {
            this.a = crfVar;
        }

        @Override // com.oplus.aiunit.vision.wz3.a
        public void a(boolean z) {
            if (z) {
                synchronized (vqf.this) {
                    this.a.e();
                }
            }
        }
    }

    public vqf(@NonNull com.bumptech.glide.a aVar, @NonNull zva zvaVar, @NonNull wqf wqfVar, @NonNull Context context) {
        this(aVar, zvaVar, wqfVar, new crf(), aVar.h(), context);
    }

    @NonNull
    @CheckResult
    public <ResourceType> hqf<ResourceType> a(@NonNull Class<ResourceType> cls) {
        return new hqf<>(this.i, this, cls, this.f17955j);
    }

    @NonNull
    @CheckResult
    public hqf<Bitmap> b() {
        return a(Bitmap.class).a(u);
    }

    @NonNull
    @CheckResult
    public hqf<Drawable> c() {
        return a(Drawable.class);
    }

    @NonNull
    @CheckResult
    public hqf<GifDrawable> d() {
        return a(GifDrawable.class).a(v);
    }

    public void e(@NonNull View view) {
        f(new b(view));
    }

    public void f(@Nullable boj<?> bojVar) {
        if (bojVar == null) {
            return;
        }
        z(bojVar);
    }

    public final synchronized void g() {
        Iterator<boj<?>> it = this.f17957n.b().iterator();
        while (it.hasNext()) {
            f(it.next());
        }
        this.f17957n.a();
    }

    @NonNull
    @CheckResult
    public hqf<File> h() {
        return a(File.class).a(w);
    }

    public List<uqf<Object>> i() {
        return this.q;
    }

    public synchronized zqf j() {
        return this.r;
    }

    @NonNull
    public <T> qak<?, T> k(Class<T> cls) {
        return this.i.j().e(cls);
    }

    @NonNull
    @CheckResult
    public hqf<Drawable> l(@Nullable Drawable drawable) {
        return c().T0(drawable);
    }

    @NonNull
    @CheckResult
    public hqf<Drawable> m(@Nullable Uri uri) {
        return c().U0(uri);
    }

    @NonNull
    @CheckResult
    public hqf<Drawable> n(@Nullable File file) {
        return c().V0(file);
    }

    @NonNull
    @CheckResult
    public hqf<Drawable> o(@Nullable @DrawableRes @RawRes Integer num) {
        return c().W0(num);
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
    }

    @Override // com.oplus.aiunit.vision.bwa
    public synchronized void onDestroy() {
        this.f17957n.onDestroy();
        g();
        this.f17956l.b();
        this.k.b(this);
        this.k.b(this.p);
        uqk.x(this.o);
        this.i.t(this);
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
    }

    @Override // com.oplus.aiunit.vision.bwa
    public synchronized void onStart() {
        u();
        this.f17957n.onStart();
    }

    @Override // com.oplus.aiunit.vision.bwa
    public synchronized void onStop() {
        this.f17957n.onStop();
        if (this.t) {
            g();
        } else {
            t();
        }
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i) {
        if (i == 60 && this.s) {
            s();
        }
    }

    @NonNull
    @CheckResult
    public hqf<Drawable> p(@Nullable Object obj) {
        return c().X0(obj);
    }

    @NonNull
    @CheckResult
    public hqf<Drawable> q(@Nullable String str) {
        return c().Y0(str);
    }

    public synchronized void r() {
        this.f17956l.c();
    }

    public synchronized void s() {
        r();
        Iterator<vqf> it = this.m.a().iterator();
        while (it.hasNext()) {
            it.next().r();
        }
    }

    public synchronized void t() {
        this.f17956l.d();
    }

    public synchronized String toString() {
        return super.toString() + "{tracker=" + this.f17956l + ", treeNode=" + this.m + "}";
    }

    public synchronized void u() {
        this.f17956l.f();
    }

    @NonNull
    public synchronized vqf v(@NonNull zqf zqfVar) {
        w(zqfVar);
        return this;
    }

    public synchronized void w(@NonNull zqf zqfVar) {
        this.r = zqfVar.clone().b();
    }

    public synchronized void x(@NonNull boj<?> bojVar, @NonNull dqf dqfVar) {
        this.f17957n.c(bojVar);
        this.f17956l.g(dqfVar);
    }

    public synchronized boolean y(@NonNull boj<?> bojVar) {
        dqf request = bojVar.getRequest();
        if (request == null) {
            return true;
        }
        if (!this.f17956l.a(request)) {
            return false;
        }
        this.f17957n.d(bojVar);
        bojVar.setRequest(null);
        return true;
    }

    public final void z(@NonNull boj<?> bojVar) {
        boolean zY = y(bojVar);
        dqf request = bojVar.getRequest();
        if (zY || this.i.q(bojVar) || request == null) {
            return;
        }
        bojVar.setRequest(null);
        request.clear();
    }

    public vqf(com.bumptech.glide.a aVar, zva zvaVar, wqf wqfVar, crf crfVar, xz3 xz3Var, Context context) {
        this.f17957n = new joj();
        a aVar2 = new a();
        this.o = aVar2;
        this.i = aVar;
        this.k = zvaVar;
        this.m = wqfVar;
        this.f17956l = crfVar;
        this.f17955j = context;
        wz3 wz3VarA = xz3Var.a(context.getApplicationContext(), new c(crfVar));
        this.p = wz3VarA;
        aVar.p(this);
        if (uqk.s()) {
            uqk.w(aVar2);
        } else {
            zvaVar.a(this);
        }
        zvaVar.a(wz3VarA);
        this.q = new CopyOnWriteArrayList<>(aVar.j().c());
        w(aVar.j().d());
    }
}
