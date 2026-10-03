package com.heytap.health.account.impl.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.ilj;
import com.oplus.aiunit.vision.msg;
import com.oplus.aiunit.vision.ul9;
import com.oplus.aiunit.vision.um;

/* JADX INFO: loaded from: classes15.dex */
public class SafeAccountLogoutReceiver extends BroadcastReceiver {
    public static long a;

    public static void a(Context context, Intent intent) {
        if (msg.a().c()) {
            a7b.f("SafeAccountLogoutReceiver", "isSellMode, filter account logout broadcast.");
            return;
        }
        if (System.currentTimeMillis() - a < 10) {
            return;
        }
        a = System.currentTimeMillis();
        if (ilj.B()) {
            if (intent == null) {
                a7b.f("SafeAccountLogoutReceiver", "onReceive, intent is null");
                return;
            }
            String action = intent.getAction();
            a7b.f("SafeAccountLogoutReceiver", "LoginStateReceiver---onReceive---action: " + action);
            if (TextUtils.equals(action, ul9.BROADCAST_LOGOUT_SAFE)) {
                a7b.f("SafeAccountLogoutReceiver", "mLoginStateReceiver---logout state: " + action);
                um.c().g();
            }
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        a(context, intent);
    }
}
