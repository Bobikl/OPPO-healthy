package com.bumptech.glide;

import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.util.Log;
import android.view.View;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.bumptech.glide.load.engine.f;
import com.oplus.aiunit.vision.boj;
import com.oplus.aiunit.vision.ch0;
import com.oplus.aiunit.vision.cpe;
import com.oplus.aiunit.vision.gfb;
import com.oplus.aiunit.vision.h5a;
import com.oplus.aiunit.vision.hsb;
import com.oplus.aiunit.vision.kf1;
import com.oplus.aiunit.vision.qak;
import com.oplus.aiunit.vision.u68;
import com.oplus.aiunit.vision.uqf;
import com.oplus.aiunit.vision.uqk;
import com.oplus.aiunit.vision.va0;
import com.oplus.aiunit.vision.vqf;
import com.oplus.aiunit.vision.xz3;
import com.oplus.aiunit.vision.zqf;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes13.dex */
public class a implements ComponentCallbacks2 {

    @GuardedBy("Glide.class")
    public static volatile a s;
    public static volatile boolean t;
    public final f i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final kf1 f1346j;
    public final hsb k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final c f1347l;
    public final ch0 m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final com.bumptech.glide.manager.b f1348n;
    public final xz3 o;
    public final InterfaceC0172a q;

    @GuardedBy("managers")
    public final List<vqf> p = new ArrayList();
    public MemoryCategory r = MemoryCategory.NORMAL;

    /* JADX INFO: renamed from: com.bumptech.glide.a$a, reason: collision with other inner class name */
    public interface InterfaceC0172a {
        @NonNull
        zqf build();
    }

    public a(@NonNull Context context, @NonNull f fVar, @NonNull hsb hsbVar, @NonNull kf1 kf1Var, @NonNull ch0 ch0Var, @NonNull com.bumptech.glide.manager.b bVar, @NonNull xz3 xz3Var, int i, @NonNull InterfaceC0172a interfaceC0172a, @NonNull Map<Class<?>, qak<?, ?>> map, @NonNull List<uqf<Object>> list, @NonNull List<u68> list2, @Nullable va0 va0Var, @NonNull d dVar) {
        this.i = fVar;
        this.f1346j = kf1Var;
        this.m = ch0Var;
        this.k = hsbVar;
        this.f1348n = bVar;
        this.o = xz3Var;
        this.q = interfaceC0172a;
        this.f1347l = new c(context, ch0Var, e.d(this, list2, va0Var), new h5a(), interfaceC0172a, map, list, fVar, dVar, i);
    }

    @GuardedBy("Glide.class")
    @VisibleForTesting
    public static void a(@NonNull Context context, @Nullable GeneratedAppGlideModule generatedAppGlideModule) {
        if (t) {
            throw new IllegalStateException("Glide has been called recursively, this is probably an internal library error!");
        }
        t = true;
        try {
            n(context, generatedAppGlideModule);
        } finally {
            t = false;
        }
    }

    @NonNull
    public static a d(@NonNull Context context) {
        if (s == null) {
            GeneratedAppGlideModule generatedAppGlideModuleE = e(context.getApplicationContext());
            synchronized (a.class) {
                if (s == null) {
                    a(context, generatedAppGlideModuleE);
                }
            }
        }
        return s;
    }

    @Nullable
    public static GeneratedAppGlideModule e(Context context) {
        try {
            return (GeneratedAppGlideModule) Class.forName("com.bumptech.glide.GeneratedAppGlideModuleImpl").getDeclaredConstructor(Context.class).newInstance(context.getApplicationContext());
        } catch (ClassNotFoundException unused) {
            if (Log.isLoggable("Glide", 5)) {
                Log.w("Glide", "Failed to find GeneratedAppGlideModule. You should include an annotationProcessor compile dependency on com.github.bumptech.glide:compiler in your application and a @GlideModule annotated AppGlideModule implementation or LibraryGlideModules will be silently ignored");
            }
            return null;
        } catch (IllegalAccessException e2) {
            r(e2);
            return null;
        } catch (InstantiationException e3) {
            r(e3);
            return null;
        } catch (NoSuchMethodException e4) {
            r(e4);
            return null;
        } catch (InvocationTargetException e5) {
            r(e5);
            return null;
        }
    }

    @NonNull
    public static com.bumptech.glide.manager.b m(@Nullable Context context) {
        cpe.e(context, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        return d(context).l();
    }

    @GuardedBy("Glide.class")
    public static void n(@NonNull Context context, @Nullable GeneratedAppGlideModule generatedAppGlideModule) {
        o(context, new b(), generatedAppGlideModule);
    }

    @GuardedBy("Glide.class")
    public static void o(@NonNull Context context, @NonNull b bVar, @Nullable GeneratedAppGlideModule generatedAppGlideModule) {
        Context applicationContext = context.getApplicationContext();
        List<u68> listEmptyList = Collections.emptyList();
        if (generatedAppGlideModule == null || generatedAppGlideModule.c()) {
            listEmptyList = new gfb(applicationContext).b();
        }
        if (generatedAppGlideModule != null && !generatedAppGlideModule.d().isEmpty()) {
            Set<Class<?>> setD = generatedAppGlideModule.d();
            Iterator<u68> it = listEmptyList.iterator();
            while (it.hasNext()) {
                u68 next = it.next();
                if (setD.contains(next.getClass())) {
                    if (Log.isLoggable("Glide", 3)) {
                        Log.d("Glide", "AppGlideModule excludes manifest GlideModule: " + next);
                    }
                    it.remove();
                }
            }
        }
        if (Log.isLoggable("Glide", 3)) {
            Iterator<u68> it2 = listEmptyList.iterator();
            while (it2.hasNext()) {
                Log.d("Glide", "Discovered GlideModule from manifest: " + it2.next().getClass());
            }
        }
        bVar.b(generatedAppGlideModule != null ? generatedAppGlideModule.e() : null);
        Iterator<u68> it3 = listEmptyList.iterator();
        while (it3.hasNext()) {
            it3.next().a(applicationContext, bVar);
        }
        if (generatedAppGlideModule != null) {
            generatedAppGlideModule.a(applicationContext, bVar);
        }
        a aVarA = bVar.a(applicationContext, listEmptyList, generatedAppGlideModule);
        applicationContext.registerComponentCallbacks(aVarA);
        s = aVarA;
    }

    public static void r(Exception exc) {
        throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", exc);
    }

    @NonNull
    @Deprecated
    public static vqf u(@NonNull Activity activity) {
        return v(activity.getApplicationContext());
    }

    @NonNull
    public static vqf v(@NonNull Context context) {
        return m(context).f(context);
    }

    @NonNull
    public static vqf w(@NonNull View view) {
        return m(view.getContext()).g(view);
    }

    @NonNull
    public static vqf x(@NonNull Fragment fragment) {
        return m(fragment.getContext()).h(fragment);
    }

    @NonNull
    public static vqf y(@NonNull FragmentActivity fragmentActivity) {
        return m(fragmentActivity).i(fragmentActivity);
    }

    public void b() {
        uqk.a();
        this.i.e();
    }

    public void c() {
        uqk.b();
        this.k.clearMemory();
        this.f1346j.clearMemory();
        this.m.clearMemory();
    }

    @NonNull
    public ch0 f() {
        return this.m;
    }

    @NonNull
    public kf1 g() {
        return this.f1346j;
    }

    public xz3 h() {
        return this.o;
    }

    @NonNull
    public Context i() {
        return this.f1347l.getBaseContext();
    }

    @NonNull
    public c j() {
        return this.f1347l;
    }

    @NonNull
    public Registry k() {
        return this.f1347l.i();
    }

    @NonNull
    public com.bumptech.glide.manager.b l() {
        return this.f1348n;
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        c();
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i) {
        s(i);
    }

    public void p(vqf vqfVar) {
        synchronized (this.p) {
            if (this.p.contains(vqfVar)) {
                throw new IllegalStateException("Cannot register already registered manager");
            }
            this.p.add(vqfVar);
        }
    }

    public boolean q(@NonNull boj<?> bojVar) {
        synchronized (this.p) {
            Iterator<vqf> it = this.p.iterator();
            while (it.hasNext()) {
                if (it.next().y(bojVar)) {
                    return true;
                }
            }
            return false;
        }
    }

    public void s(int i) {
        uqk.b();
        synchronized (this.p) {
            Iterator<vqf> it = this.p.iterator();
            while (it.hasNext()) {
                it.next().onTrimMemory(i);
            }
        }
        this.k.a(i);
        this.f1346j.a(i);
        this.m.a(i);
    }

    public void t(vqf vqfVar) {
        synchronized (this.p) {
            if (!this.p.contains(vqfVar)) {
                throw new IllegalStateException("Cannot unregister not yet registered manager");
            }
            this.p.remove(vqfVar);
        }
    }
}
