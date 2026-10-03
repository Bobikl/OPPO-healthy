package com.heytap.wearable.watch.clock;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.oplus.aiunit.vision.i37;
import com.oplus.aiunit.vision.ilj;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public class ClockOobeReceiver extends BroadcastReceiver {
    public static void a(Context context) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.op.smartwear.native.world.time.RECEIVER");
        LocalBroadcastManager.getInstance(context).registerReceiver(new ClockOobeReceiver(), intentFilter);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent != null) {
            String action = intent.getAction();
            StringBuilder sb = new StringBuilder();
            sb.append("onReceive() called with: action = [");
            sb.append(action);
            sb.append("]");
            if (!"com.op.smartwear.native.world.time.RECEIVER".equals(action) || i37.b()) {
                return;
            }
            if (ilj.x()) {
                ClockMessageManager.e().m(1, Locale.getDefault().toLanguageTag());
            } else {
                ClockMessageManager.e().h(false);
            }
        }
    }
}
