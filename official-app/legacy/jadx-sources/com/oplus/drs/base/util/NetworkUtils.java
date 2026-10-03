package com.oplus.drs.base.util;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.SystemClock;
import androidx.annotation.RequiresApi;
import com.heytap.webview.extension.protocol.Const;
import com.oplus.aiunit.vision.fue;
import com.oplus.aiunit.vision.w56;
import com.oplus.aiunit.vision.z6b;
import com.oplus.nearx.track.internal.remoteconfig.cloudconfig.entity.EventRuleEntity;
import com.oplus.pantaconnect.sdk.connectionservice.lan.LanConstants;
import com.sensorsdata.analytics.android.sdk.aop.push.PushAutoTrackHelper;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes6.dex */
public class NetworkUtils {
    public static b a = null;
    public static NetworkStateReceiver b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile boolean f19699c = false;
    public static final CopyOnWriteArrayList<WeakReference<e>> d = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final AtomicReference<a> f19700e = new AtomicReference<>(a.b(0));
    public static final AtomicReference<d> f = new AtomicReference<>(new d(0, 0));

    public static class NetworkStateReceiver extends BroadcastReceiver {
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            PushAutoTrackHelper.onBroadcastReceiver(this, context, intent);
            if (context == null) {
                return;
            }
            if ("android.net.conn.CONNECTIVITY_CHANGE".equals(intent != null ? intent.getAction() : null)) {
                NetworkUtils.u(context, null);
                if (((a) NetworkUtils.f19700e.get()).a) {
                    NetworkUtils.q();
                }
            }
        }
    }

    public static final class a {
        public final boolean a;
        public final boolean b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f19701c;
        public final String d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final long f19702e;

        public a(boolean z, boolean z2, boolean z3, String str, long j2) {
            this.a = z;
            this.b = z2;
            this.f19701c = z3;
            this.d = str;
            this.f19702e = j2;
        }

        public static a a(boolean z, boolean z2, String str, long j2) {
            return new a(true, z, z2, str, j2);
        }

        public static a b(long j2) {
            return new a(false, false, false, LanConstants.OPERATOR_UNKNOWN, j2);
        }
    }

    @RequiresApi(21)
    public static class b extends ConnectivityManager.NetworkCallback {
        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(Network network) {
            super.onAvailable(network);
            NetworkUtils.u(w56.b(), network);
            a aVar = (a) NetworkUtils.f19700e.get();
            if (aVar.a) {
                z6b.k("NetworkUtils", "onAvailable: connected (validated=" + aVar.b + "). Notify to trigger check.");
                NetworkUtils.q();
            }
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            super.onCapabilitiesChanged(network, networkCapabilities);
            if (networkCapabilities == null) {
                return;
            }
            boolean z = ((a) NetworkUtils.f19700e.get()).b;
            boolean z2 = networkCapabilities.hasCapability(12) && networkCapabilities.hasCapability(16);
            NetworkUtils.z(networkCapabilities);
            if (!z2 || z) {
                return;
            }
            NetworkUtils.r();
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
            super.onLost(network);
            NetworkUtils.p();
            NetworkUtils.t();
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onUnavailable() {
            super.onUnavailable();
            NetworkUtils.p();
            NetworkUtils.t();
        }
    }

    public static class c {
        public static String a(NetworkInfo networkInfo) {
            if (networkInfo == null) {
                return LanConstants.OPERATOR_UNKNOWN;
            }
            int type = networkInfo.getType();
            if (type == 1) {
                return "WIFI";
            }
            if (type != 0) {
                return LanConstants.OPERATOR_UNKNOWN;
            }
            int subtype = networkInfo.getSubtype();
            if (subtype == 20) {
                return EventRuleEntity.ACCEPT_NET_5G;
            }
            switch (subtype) {
                case 1:
                case 2:
                case 4:
                case 7:
                case 11:
                    return "2G";
                case 3:
                case 5:
                case 6:
                case 8:
                case 9:
                case 10:
                case 12:
                case 14:
                case 15:
                    return "3G";
                case 13:
                    return EventRuleEntity.ACCEPT_NET_4G;
                default:
                    return LanConstants.OPERATOR_UNKNOWN;
            }
        }
    }

    public static final class d {
        public final int a;
        public final long b;

        public d(int i, long j2) {
            this.a = i;
            this.b = j2;
        }
    }

    public interface e {
        void a();

        default void onNetDisconnected() {
        }
    }

    public static void h() {
        CopyOnWriteArrayList<WeakReference<e>> copyOnWriteArrayList = d;
        if (copyOnWriteArrayList.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (WeakReference<e> weakReference : copyOnWriteArrayList) {
            if (weakReference.get() == null) {
                arrayList.add(weakReference);
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        d.removeAll(arrayList);
    }

    public static void i() {
        if (f19699c) {
            return;
        }
        synchronized (NetworkUtils.class) {
            if (f19699c) {
                return;
            }
            try {
                Context contextB = w56.b();
                if (contextB == null) {
                    return;
                }
                try {
                    w(contextB, null);
                    u(contextB, null);
                    f19699c = true;
                } catch (Throwable th) {
                    z6b.o("NetworkUtils", "ensureSelfListenerRegistered exception: " + th);
                }
            } catch (Throwable unused) {
            }
        }
    }

    public static String j() {
        i();
        a aVar = f19700e.get();
        return (aVar.f19702e <= 0 || !aVar.a) ? y(null) : aVar.d;
    }

    @SuppressLint({"MissingPermission"})
    public static boolean k() {
        i();
        a aVar = f19700e.get();
        return aVar.f19702e > 0 ? aVar.a : l();
    }

    @SuppressLint({"MissingPermission"})
    public static boolean l() {
        NetworkInfo activeNetworkInfo;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) w56.b().getSystemService("connectivity");
            return (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null || !activeNetworkInfo.isConnected()) ? false : true;
        } catch (Throwable th) {
            z6b.o("NetworkUtils", "isNetworkConnectedStrictInternal error: " + th);
        }
        return false;
    }

    public static boolean m() {
        i();
        a aVar = f19700e.get();
        return aVar.f19702e > 0 ? aVar.f19701c : n();
    }

    public static boolean n() {
        NetworkInfo activeNetworkInfo;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) w56.b().getSystemService("connectivity");
            return (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null || activeNetworkInfo.getType() != 1) ? false : true;
        } catch (Throwable th) {
            z6b.o("NetworkUtils", "isWifiNetworkInternal error: " + th);
        }
        return false;
    }

    public static void o(boolean z, boolean z2, String str) {
        f19700e.set(a.a(z, z2, str, SystemClock.elapsedRealtime()));
    }

    public static void p() {
        f19700e.set(a.b(SystemClock.elapsedRealtime()));
    }

    public static void q() {
        s(false);
    }

    public static void r() {
        s(true);
    }

    public static void s(boolean z) {
        AtomicReference<d> atomicReference;
        d dVar;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        do {
            atomicReference = f;
            dVar = atomicReference.get();
            boolean z2 = dVar.a != 1;
            if (!z && !z2 && jElapsedRealtime - dVar.b < 300) {
                return;
            }
        } while (!fue.a(atomicReference, dVar, new d(1, jElapsedRealtime)));
        Iterator<WeakReference<e>> it = d.iterator();
        while (it.hasNext()) {
            e eVar = it.next().get();
            if (eVar != null) {
                try {
                    eVar.a();
                } catch (Throwable th) {
                    z6b.o("NetworkUtils", "notifyNetConnectSuccess listener error: " + th);
                }
            }
        }
        h();
    }

    public static void t() {
        AtomicReference<d> atomicReference;
        d dVar;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        do {
            atomicReference = f;
            dVar = atomicReference.get();
            if (!(dVar.a != 2) && jElapsedRealtime - dVar.b < 300) {
                return;
            }
        } while (!fue.a(atomicReference, dVar, new d(2, jElapsedRealtime)));
        Iterator<WeakReference<e>> it = d.iterator();
        while (it.hasNext()) {
            e eVar = it.next().get();
            if (eVar != null) {
                try {
                    eVar.onNetDisconnected();
                } catch (Throwable th) {
                    z6b.o("NetworkUtils", "notifyNetDisconnected listener error: " + th);
                }
            }
        }
        h();
    }

    @SuppressLint({"MissingPermission"})
    public static void u(Context context, Network network) {
        if (context == null) {
            return;
        }
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager == null) {
                return;
            }
            if (network == null) {
                network = connectivityManager.getActiveNetwork();
            }
            if (network == null) {
                p();
                return;
            }
            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(network);
            if (networkCapabilities == null) {
                return;
            }
            z(networkCapabilities);
        } catch (Throwable unused) {
        }
    }

    public static void v(Context context) {
        if (b == null) {
            b = new NetworkStateReceiver();
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            context.registerReceiver(b, intentFilter);
        }
    }

    public static void w(Context context, e eVar) {
        if (eVar != null) {
            Iterator<WeakReference<e>> it = d.iterator();
            while (it.hasNext()) {
                if (it.next().get() == eVar) {
                    return;
                }
            }
            d.add(new WeakReference<>(eVar));
        }
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (a != null || connectivityManager == null) {
                return;
            }
            b bVar = new b();
            a = bVar;
            connectivityManager.registerDefaultNetworkCallback(bVar);
        } catch (Exception e2) {
            z6b.o("NetworkUtils", "registerNetworkListener exception: " + e2.getMessage() + ", fallback to receiver.");
            v(context);
        }
    }

    public static String x() {
        NetworkInfo activeNetworkInfo;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) w56.b().getSystemService("connectivity");
            return (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null) ? Const.Callback.NetworkState.NetworkType.NETWORK_MOBILE : c.a(activeNetworkInfo);
        } catch (Throwable unused) {
            return Const.Callback.NetworkState.NetworkType.NETWORK_MOBILE;
        }
    }

    public static String y(NetworkCapabilities networkCapabilities) {
        if (networkCapabilities != null) {
            if (networkCapabilities.hasTransport(1)) {
                return "WIFI";
            }
            if (networkCapabilities.hasTransport(0)) {
                return x();
            }
        }
        return x();
    }

    public static void z(NetworkCapabilities networkCapabilities) {
        String strX;
        if (networkCapabilities == null) {
            return;
        }
        boolean z = networkCapabilities.hasCapability(12) && networkCapabilities.hasCapability(16);
        boolean zHasTransport = networkCapabilities.hasTransport(1);
        if (zHasTransport) {
            strX = "WIFI";
        } else {
            strX = networkCapabilities.hasTransport(0) ? x() : LanConstants.OPERATOR_UNKNOWN;
        }
        o(z, zHasTransport, strX);
    }
}
