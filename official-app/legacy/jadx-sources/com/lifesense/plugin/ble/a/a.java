package com.lifesense.plugin.ble.a;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.sensorsdata.analytics.android.sdk.aop.push.PushAutoTrackHelper;
import java.util.Date;

/* JADX INFO: loaded from: classes5.dex */
public class a extends BroadcastReceiver {
    private static PhoneStateListener b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static PhoneStateListener f8662c;
    private static String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static String f8663e;
    private static long f;
    private static a a = new a();
    private static Runnable g = new c();

    private synchronized String d() {
        return d;
    }

    private synchronized String e() {
        return f8663e;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        PushAutoTrackHelper.onBroadcastReceiver(this, context, intent);
        if (intent == null || b == null) {
            return;
        }
        try {
            String stringExtra = intent.getStringExtra("state");
            String stringExtra2 = intent.getStringExtra("incoming_number");
            a(stringExtra, stringExtra2);
            if (!TelephonyManager.EXTRA_STATE_RINGING.equals(stringExtra)) {
                if (com.lifesense.plugin.ble.device.ancs.e.a().c() != null) {
                    com.lifesense.plugin.ble.device.ancs.e.a().c().removeCallbacks(g);
                }
                f = 0L;
                TelephonyManager.EXTRA_STATE_OFFHOOK.equals(stringExtra);
                b(context);
                return;
            }
            String str = "phoneState=1(" + stringExtra + "),incomingNumber=" + stringExtra2 + " >>time=" + com.lifesense.plugin.ble.c.d.defaultDateFormat.format(new Date(System.currentTimeMillis()));
            com.lifesense.plugin.ble.b.d dVarA = com.lifesense.plugin.ble.b.d.a();
            com.lifesense.plugin.ble.b.a.a aVar = com.lifesense.plugin.ble.b.a.a.Broadcast_Message;
            dVarA.a(null, aVar, true, str, null);
            if (!TextUtils.isEmpty(stringExtra2)) {
                if (com.lifesense.plugin.ble.device.ancs.e.a().c() != null) {
                    com.lifesense.plugin.ble.device.ancs.e.a().c().removeCallbacks(g);
                }
                f = 0L;
                b.onCallStateChanged(1, stringExtra2);
                return;
            }
            if (com.lifesense.plugin.ble.device.ancs.e.a().c() == null) {
                com.lifesense.plugin.ble.b.d.a().a(null, aVar, true, "failed to handle broadcast event,is null.", null);
                return;
            }
            com.lifesense.plugin.ble.device.ancs.e.a().c().removeCallbacks(g);
            f = System.currentTimeMillis() / 1000;
            com.lifesense.plugin.ble.device.ancs.e.a().c().postDelayed(g, 3000L);
        } catch (Exception e2) {
            e2.printStackTrace();
            com.lifesense.plugin.ble.b.d.a().a(null, com.lifesense.plugin.ble.b.a.a.Broadcast_Message, true, "failed to handle phone state broadcast.exception >>" + e2.toString(), null);
        }
    }

    private void b(Context context) {
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            if (f8662c == null && telephonyManager != null) {
                b bVar = new b(this, telephonyManager);
                f8662c = bVar;
                telephonyManager.listen(bVar, 32);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
            com.lifesense.plugin.ble.b.d.a().a(null, com.lifesense.plugin.ble.b.a.a.Broadcast_Message, true, "failed to parse phone state broadcast,has exception...", null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String a(int i, int i2, String str) {
        StringBuffer stringBuffer = new StringBuffer();
        try {
            String str2 = com.lifesense.plugin.ble.c.d.defaultDateFormat.format(new Date(System.currentTimeMillis()));
            stringBuffer.append("phoneState=" + i);
            stringBuffer.append("(" + d() + "," + i2 + ")");
            StringBuilder sb = new StringBuilder();
            sb.append("number=");
            sb.append(str);
            stringBuffer.append(sb.toString());
            stringBuffer.append("(" + e() + ")");
            StringBuilder sb2 = new StringBuilder();
            sb2.append(" >> time=");
            sb2.append(str2);
            stringBuffer.append(sb2.toString());
            return stringBuffer.toString();
        } catch (Exception e2) {
            e2.printStackTrace();
            return "phone state message exception...";
        }
    }

    public static void a(Context context) {
        if (context != null) {
            try {
                context.unregisterReceiver(a);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    public static void a(Context context, PhoneStateListener phoneStateListener) {
        b = phoneStateListener;
        context.registerReceiver(a, new IntentFilter("android.intent.action.PHONE_STATE"));
    }

    private synchronized void a(String str, String str2) {
        d = str;
        f8663e = str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(int i) {
        return (1 == i || 1 == com.lifesense.plugin.ble.device.a.a.g.a().e()) ? false : true;
    }
}
