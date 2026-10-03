package com.glyphix.mas.common;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class c {
    private static String g = "NetConnectManager";
    public static c h;
    private ConnectivityManager a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f2316c;
    private b b = new b(100);
    private List<d> d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f2317e = false;
    private C0219c f = new C0219c();

    public class b {
        private Handler a = new Handler(Looper.getMainLooper());
        private Runnable b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f2318c;

        public class a implements Runnable {
            final /* synthetic */ Runnable a;

            public a(Runnable runnable) {
                this.a = runnable;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.a.run();
            }
        }

        public b(long j2) {
            this.f2318c = j2;
        }

        public void a() {
            Runnable runnable = this.b;
            if (runnable != null) {
                this.a.removeCallbacks(runnable);
            }
        }

        public void a(Runnable runnable) {
            Runnable runnable2 = this.b;
            if (runnable2 != null) {
                this.a.removeCallbacks(runnable2);
            }
            a aVar = new a(runnable);
            this.b = aVar;
            this.a.postDelayed(aVar, this.f2318c);
        }
    }

    /* JADX INFO: renamed from: com.glyphix.mas.common.c$c, reason: collision with other inner class name */
    public class C0219c extends ConnectivityManager.NetworkCallback {
        private C0219c() {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            super.onCapabilitiesChanged(network, networkCapabilities);
            final boolean zHasCapability = networkCapabilities.hasCapability(16);
            c.this.b.a(new Runnable() { // from class: com.glyphix.mas.common.e
                @Override // java.lang.Runnable
                public final void run() {
                    this.i.a(zHasCapability);
                }
            });
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
            super.onLost(network);
            c.this.b.a(new Runnable() { // from class: com.glyphix.mas.common.f
                @Override // java.lang.Runnable
                public final void run() {
                    this.i.a();
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(boolean z) {
            if (c.this.f2317e != z) {
                c.this.f2317e = z;
                Iterator it = c.this.d.iterator();
                while (it.hasNext()) {
                    ((d) it.next()).a(z);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a() {
            a(false);
        }
    }

    public interface d {
        void a(boolean z);
    }

    public c(Context context) {
        this.f2316c = context;
        h = this;
        c();
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        this.a = connectivityManager;
        connectivityManager.registerDefaultNetworkCallback(this.f);
    }

    public boolean b() {
        com.glyphix.mas.utils.b.c().c("query network status ", this.f2317e + "");
        return this.f2317e;
    }

    public void c() {
        ConnectivityManager connectivityManager = (ConnectivityManager) this.f2316c.getSystemService("connectivity");
        Network activeNetwork = connectivityManager.getActiveNetwork();
        boolean z = false;
        if (activeNetwork == null) {
            this.f2317e = false;
        }
        NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork);
        if (networkCapabilities != null && networkCapabilities.hasCapability(12) && networkCapabilities.hasCapability(16)) {
            z = true;
        }
        this.f2317e = z;
    }

    public void a(d dVar) {
        this.d.add(dVar);
    }

    public void a() {
        this.a.unregisterNetworkCallback(this.f);
        this.d.clear();
    }
}
