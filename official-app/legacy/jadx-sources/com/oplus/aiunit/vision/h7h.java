package com.oplus.aiunit.vision;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.util.Log;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes13.dex */
public final class h7h {
    public static volatile h7h d;
    public final c a;

    @GuardedBy("this")
    public final Set<wz3.a> b = new HashSet();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @GuardedBy("this")
    public boolean f12032c;

    public class a implements w68.b<ConnectivityManager> {
        public final /* synthetic */ Context a;

        public a(Context context) {
            this.a = context;
        }

        @Override // com.oplus.aiunit.vision.w68.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ConnectivityManager get() {
            return (ConnectivityManager) this.a.getSystemService("connectivity");
        }
    }

    public class b implements wz3.a {
        public b() {
        }

        @Override // com.oplus.aiunit.vision.wz3.a
        public void a(boolean z) {
            ArrayList arrayList;
            uqk.b();
            synchronized (h7h.this) {
                arrayList = new ArrayList(h7h.this.b);
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((wz3.a) it.next()).a(z);
            }
        }
    }

    public interface c {
        boolean a();

        void unregister();
    }

    @RequiresApi(24)
    public static final class d implements c {
        public boolean a;
        public final wz3.a b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final w68.b<ConnectivityManager> f12033c;
        public final ConnectivityManager.NetworkCallback d = new a();

        public class a extends ConnectivityManager.NetworkCallback {

            /* JADX INFO: renamed from: com.oplus.aiunit.vision.h7h$d$a$a, reason: collision with other inner class name */
            public class RunnableC0883a implements Runnable {
                public final /* synthetic */ boolean i;

                public RunnableC0883a(boolean z) {
                    this.i = z;
                }

                @Override // java.lang.Runnable
                public void run() {
                    a.this.a(this.i);
                }
            }

            public a() {
            }

            public void a(boolean z) {
                uqk.b();
                d dVar = d.this;
                boolean z2 = dVar.a;
                dVar.a = z;
                if (z2 != z) {
                    dVar.b.a(z);
                }
            }

            public final void b(boolean z) {
                uqk.w(new RunnableC0883a(z));
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onAvailable(@NonNull Network network) {
                b(true);
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onLost(@NonNull Network network) {
                b(false);
            }
        }

        public d(w68.b<ConnectivityManager> bVar, wz3.a aVar) {
            this.f12033c = bVar;
            this.b = aVar;
        }

        @Override // com.oplus.aiunit.vision.h7h.c
        @SuppressLint({"MissingPermission"})
        public boolean a() {
            this.a = this.f12033c.get().getActiveNetwork() != null;
            try {
                this.f12033c.get().registerDefaultNetworkCallback(this.d);
                return true;
            } catch (RuntimeException e2) {
                if (Log.isLoggable("ConnectivityMonitor", 5)) {
                    Log.w("ConnectivityMonitor", "Failed to register callback", e2);
                }
                return false;
            }
        }

        @Override // com.oplus.aiunit.vision.h7h.c
        public void unregister() {
            this.f12033c.get().unregisterNetworkCallback(this.d);
        }
    }

    public h7h(@NonNull Context context) {
        this.a = new d(w68.a(new a(context)), new b());
    }

    public static h7h a(@NonNull Context context) {
        if (d == null) {
            synchronized (h7h.class) {
                if (d == null) {
                    d = new h7h(context.getApplicationContext());
                }
            }
        }
        return d;
    }

    @GuardedBy("this")
    public final void b() {
        if (this.f12032c || this.b.isEmpty()) {
            return;
        }
        this.f12032c = this.a.a();
    }

    @GuardedBy("this")
    public final void c() {
        if (this.f12032c && this.b.isEmpty()) {
            this.a.unregister();
            this.f12032c = false;
        }
    }

    public synchronized void d(wz3.a aVar) {
        this.b.add(aVar);
        b();
    }

    public synchronized void e(wz3.a aVar) {
        this.b.remove(aVar);
        c();
    }
}
