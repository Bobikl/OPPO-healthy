package com.oplus.drs.rom.sdk.comm.util;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import androidx.annotation.RequiresApi;
import com.oplus.aiunit.vision.c90;
import com.oplus.nearx.track.internal.remoteconfig.cloudconfig.entity.EventRuleEntity;
import com.oplus.pantaconnect.sdk.connectionservice.lan.LanConstants;
import com.sensorsdata.analytics.android.sdk.aop.push.PushAutoTrackHelper;

/* JADX INFO: loaded from: classes19.dex */
public final class NetworkUtil {
    public static a a;
    public static NetworkStateReceiver b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static NetworkInfo f19848c;

    public static class NetworkStateReceiver extends BroadcastReceiver {
        public final b a;

        public NetworkStateReceiver(b bVar) {
            this.a = bVar;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            PushAutoTrackHelper.onBroadcastReceiver(this, context, intent);
            if (context == null || intent == null || !"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
                return;
            }
            NetworkUtil.h(context);
            b bVar = this.a;
            if (bVar != null) {
                bVar.a();
            }
        }
    }

    @RequiresApi(21)
    public static class a extends ConnectivityManager.NetworkCallback {
        public final b a;

        public a(b bVar) {
            this.a = bVar;
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(Network network) {
            super.onAvailable(network);
            Context contextB = c90.b();
            if (contextB != null) {
                NetworkUtil.h(contextB);
            }
            b bVar = this.a;
            if (bVar != null) {
                bVar.a();
            }
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            super.onCapabilitiesChanged(network, networkCapabilities);
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
            super.onLost(network);
        }
    }

    public interface b {
        void a();
    }

    public static NetworkInfo b(Context context) {
        if (f19848c == null) {
            h(context);
        }
        return f19848c;
    }

    public static int c(int i) {
        if (i == -101) {
            return -101;
        }
        if (i == 20) {
            return 4;
        }
        switch (i) {
            case 1:
            case 2:
            case 4:
            case 7:
            case 11:
                return 1;
            case 3:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
            case 12:
            case 14:
            case 15:
                return 2;
            case 13:
                return 3;
            default:
                return 0;
        }
    }

    public static String d(Context context) {
        int subtype;
        NetworkInfo networkInfoB = b(context);
        if (networkInfoB == null) {
            return LanConstants.OPERATOR_UNKNOWN;
        }
        if (!networkInfoB.isAvailable() && !networkInfoB.isConnected()) {
            return LanConstants.OPERATOR_UNKNOWN;
        }
        int type = networkInfoB.getType();
        if (type == 1) {
            subtype = -101;
        } else {
            subtype = type == 0 ? networkInfoB.getSubtype() : 0;
        }
        int iC = c(subtype);
        if (iC == -101) {
            return "WIFI";
        }
        if (iC == 1) {
            return "2G";
        }
        if (iC == 2) {
            return "3G";
        }
        if (iC != 3) {
            return iC != 4 ? LanConstants.OPERATOR_UNKNOWN : EventRuleEntity.ACCEPT_NET_5G;
        }
        return EventRuleEntity.ACCEPT_NET_4G;
    }

    public static void e(Context context, b bVar) {
        if (context == null || bVar == null || b != null) {
            return;
        }
        b = new NetworkStateReceiver(bVar);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        context.registerReceiver(b, intentFilter);
    }

    public static void f(Context context, b bVar) {
        if (context == null || bVar == null) {
            return;
        }
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (a == null) {
                a aVar = new a(bVar);
                a = aVar;
                if (connectivityManager != null) {
                    connectivityManager.registerDefaultNetworkCallback(aVar);
                }
            }
        } catch (Exception unused) {
            e(context, bVar);
        }
    }

    public static void g(Context context) {
        if (context == null) {
            return;
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        a aVar = a;
        if (aVar != null) {
            if (connectivityManager != null) {
                connectivityManager.unregisterNetworkCallback(aVar);
            }
            a = null;
        }
    }

    public static void h(Context context) {
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager != null) {
                f19848c = connectivityManager.getActiveNetworkInfo();
            }
        } catch (Exception unused) {
        }
    }
}
