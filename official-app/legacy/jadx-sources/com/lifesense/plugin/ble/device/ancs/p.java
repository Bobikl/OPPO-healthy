package com.lifesense.plugin.ble.device.ancs;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import com.sensorsdata.analytics.android.sdk.aop.push.PushAutoTrackHelper;

/* JADX INFO: loaded from: classes5.dex */
public class p extends BroadcastReceiver {
    private static l b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static Handler f8748c;
    private String d = "";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f8749e = "";
    private long f = 0;
    private static p a = new p();
    public static boolean isEnableSmsReceiver = false;

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        PushAutoTrackHelper.onBroadcastReceiver(this, context, intent);
        if (b != null && f8748c != null && context != null && intent != null) {
            a(context, intent);
            return;
        }
        com.lifesense.plugin.ble.b.d.a().a(null, com.lifesense.plugin.ble.b.a.a.Message_Remind, false, "no permission to handle sms message,listener = " + b + "; handler =" + f8748c + "; context =" + context + " ; intent=" + intent, null);
    }

    public static void a(Context context) {
        try {
            if (context == null) {
                com.lifesense.plugin.ble.b.d.a().a(null, com.lifesense.plugin.ble.b.a.a.Warning_Message, false, "failed to unregister sms broadcast receiver,is null...", null);
            } else {
                context.unregisterReceiver(a);
                f8748c = null;
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    private void a(Context context, Intent intent) {
        Handler handler = f8748c;
        if (handler == null) {
            return;
        }
        handler.post(new q(this, intent, context));
    }

    public static void a(Context context, Handler handler) {
        if (context == null) {
            com.lifesense.plugin.ble.b.d.a().a(null, com.lifesense.plugin.ble.b.a.a.Warning_Message, false, "failed to register sms broadcast receiver,is null...", null);
            return;
        }
        context.registerReceiver(a, new IntentFilter("android.provider.Telephony.SMS_RECEIVED"));
        f8748c = handler;
    }

    public static void a(l lVar) {
        b = lVar;
    }
}
