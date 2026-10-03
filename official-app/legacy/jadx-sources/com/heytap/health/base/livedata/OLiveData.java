package com.heytap.health.base.livedata;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.kwa;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes15.dex */
public class OLiveData<T> extends LiveData<T> {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Object f3168j = new Object();
    public final Object a = new Object();
    public volatile Object b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Map<Observer<? super T>, OLiveData<T>.c> f3169c;
    public volatile Object d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f3170e;
    public boolean f;
    public boolean g;
    public final Runnable h;
    public Handler i;

    public class LifecycleBoundObserver extends OLiveData<T>.c implements LifecycleEventObserver {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        @NonNull
        public final LifecycleOwner f3171n;

        public LifecycleBoundObserver(LifecycleOwner lifecycleOwner, Observer<? super T> observer, boolean z) {
            super(observer, z);
            this.f3171n = lifecycleOwner;
        }

        @Override // com.heytap.health.base.livedata.OLiveData.c
        public void b() {
            this.f3171n.getLifecycle().removeObserver(this);
        }

        @Override // com.heytap.health.base.livedata.OLiveData.c
        public boolean c(LifecycleOwner lifecycleOwner) {
            return this.f3171n == lifecycleOwner;
        }

        @Override // com.heytap.health.base.livedata.OLiveData.c
        public boolean d() {
            return this.f3171n.getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.STARTED);
        }

        @Override // androidx.lifecycle.LifecycleEventObserver
        public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
            if (this.f3171n.getLifecycle().getCurrentState() == Lifecycle.State.DESTROYED) {
                OLiveData.this.removeObserver(this.i);
            } else {
                a(d());
            }
        }
    }

    public class a implements Runnable {
        public a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            Object obj;
            synchronized (OLiveData.this.a) {
                obj = OLiveData.this.b;
                OLiveData.this.b = OLiveData.f3168j;
            }
            OLiveData.this.setValue(obj);
        }
    }

    public class b extends OLiveData<T>.c {
        public b(Observer<? super T> observer, boolean z) {
            super(observer, z);
        }

        @Override // com.heytap.health.base.livedata.OLiveData.c
        public boolean d() {
            return true;
        }
    }

    public abstract class c {
        public final Observer<? super T> i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public boolean f3173j;
        public int k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public boolean f3174l;

        public c(Observer<? super T> observer, boolean z) {
            this.i = observer;
            this.f3174l = z;
            this.k = z ? -1 : OLiveData.this.f3170e;
        }

        public void a(boolean z) {
            if (z == this.f3173j) {
                return;
            }
            this.f3173j = z;
            if (z) {
                OLiveData.this.e(this);
            }
        }

        void b() {
        }

        boolean c(LifecycleOwner lifecycleOwner) {
            return false;
        }

        abstract boolean d();
    }

    public OLiveData(T t) {
        Object obj = f3168j;
        this.b = obj;
        this.f3169c = new ConcurrentHashMap();
        this.d = obj;
        this.f3170e = -1;
        this.h = new a();
        this.i = new Handler(Looper.getMainLooper());
        this.d = t;
        this.f3170e = 0;
    }

    public static void assertMainThread(String str) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return;
        }
        throw new IllegalStateException("Cannot invoke " + str + " on a background thread");
    }

    public final void d(OLiveData<T>.c cVar) {
        if (cVar.f3173j) {
            if (!cVar.d()) {
                cVar.a(false);
                return;
            }
            int i = cVar.k;
            int i2 = this.f3170e;
            if (i < i2) {
                cVar.k = i2;
                cVar.i.onChanged((Object) this.d);
                return;
            }
            a7b.b("OLiveData", "considerNotify--> lastV: " + cVar.k + " version: " + this.f3170e);
        }
    }

    public final void e(@Nullable OLiveData<T>.c cVar) {
        if (this.f) {
            this.g = true;
            return;
        }
        this.f = true;
        do {
            this.g = false;
            if (cVar != null) {
                d(cVar);
                cVar = null;
            } else {
                Iterator<Map.Entry<Observer<? super T>, OLiveData<T>.c>> it = this.f3169c.entrySet().iterator();
                while (it.hasNext()) {
                    d(it.next().getValue());
                    if (this.g) {
                        break;
                    }
                }
            }
        } while (this.g);
        this.f = false;
    }

    @MainThread
    public void f(@NonNull LifecycleOwner lifecycleOwner, @NonNull Observer<? super T> observer, boolean z) {
        if (lifecycleOwner.getLifecycle().getCurrentState() == Lifecycle.State.DESTROYED) {
            return;
        }
        LifecycleBoundObserver lifecycleBoundObserver = new LifecycleBoundObserver(lifecycleOwner, observer, z);
        OLiveData<T>.c cVarPut = this.f3169c.get(observer);
        if (cVarPut == null) {
            cVarPut = this.f3169c.put(observer, lifecycleBoundObserver);
        }
        if (cVarPut != null && !cVarPut.c(lifecycleOwner)) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (cVarPut != null) {
            return;
        }
        kwa.c(lifecycleOwner.getLifecycle(), lifecycleBoundObserver);
    }

    @MainThread
    public void g(@NonNull Observer<? super T> observer, boolean z) {
        b bVar = new b(observer, z);
        OLiveData<T>.c cVarPut = this.f3169c.get(observer);
        if (cVarPut == null) {
            cVarPut = this.f3169c.put(observer, bVar);
        }
        if (cVarPut != null && (cVarPut instanceof LifecycleBoundObserver)) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (cVarPut != null) {
            return;
        }
        bVar.a(true);
    }

    @Override // androidx.lifecycle.LiveData
    @Nullable
    public T getValue() {
        T t = (T) this.d;
        if (t != f3168j) {
            return t;
        }
        return null;
    }

    public void h() {
        this.f3169c.clear();
    }

    @Override // androidx.lifecycle.LiveData
    public void observe(@NonNull LifecycleOwner lifecycleOwner, @NonNull Observer<? super T> observer) {
        f(lifecycleOwner, observer, false);
    }

    @Override // androidx.lifecycle.LiveData
    public void observeForever(@NonNull Observer<? super T> observer) {
        g(observer, false);
    }

    @Override // androidx.lifecycle.LiveData
    public void postValue(T t) {
        boolean z;
        synchronized (this.a) {
            z = this.b == f3168j;
            this.b = t;
        }
        if (z) {
            this.i.post(this.h);
        }
    }

    @Override // androidx.lifecycle.LiveData
    public void removeObserver(@NonNull Observer<? super T> observer) {
        assertMainThread("removeObserver");
        OLiveData<T>.c cVarRemove = this.f3169c.remove(observer);
        if (cVarRemove == null) {
            return;
        }
        cVarRemove.b();
        cVarRemove.a(false);
    }

    @Override // androidx.lifecycle.LiveData
    @MainThread
    public void removeObservers(@NonNull LifecycleOwner lifecycleOwner) {
        assertMainThread("removeObservers");
        Iterator<Map.Entry<Observer<? super T>, OLiveData<T>.c>> it = this.f3169c.entrySet().iterator();
        if (it.hasNext() && it.next().getValue().c(lifecycleOwner)) {
            it.remove();
        }
    }

    @Override // androidx.lifecycle.LiveData
    @MainThread
    public void setValue(T t) {
        assertMainThread("setValue");
        this.f3170e++;
        this.d = t;
        e(null);
    }

    public OLiveData() {
        Object obj = f3168j;
        this.b = obj;
        this.f3169c = new ConcurrentHashMap();
        this.d = obj;
        this.f3170e = -1;
        this.h = new a();
        this.i = new Handler(Looper.getMainLooper());
    }
}
