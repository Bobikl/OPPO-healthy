package com.heytap.health;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.Keep;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.ul9;
import com.oplus.aiunit.vision.w1h;

/* JADX INFO: loaded from: classes15.dex */
@Keep
public class LocaleChangeReceiver extends BroadcastReceiver {
    public static void resetShortcuts(Context context) {
        w1h.g(context);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent.getAction().equals(ul9.BROADCAST_LOGOUT_AFTER)) {
            a7b.f("LocaleChangeReceiver", "receive broadcast,need reset shortcut");
            resetShortcuts(context.getApplicationContext());
        }
    }
}
