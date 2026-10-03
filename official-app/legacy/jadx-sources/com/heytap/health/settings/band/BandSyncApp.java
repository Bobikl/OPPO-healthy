package com.heytap.health.settings.band;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.heytap.health.device_settings.setting.IDeviceSettingService;
import com.heytap.health.settings.band.utils.Bandsp;
import com.oplus.aiunit.vision.cr0;
import com.oplus.aiunit.vision.fr0;
import com.oplus.aiunit.vision.g6d;
import com.oplus.aiunit.vision.gdb;
import com.oplus.aiunit.vision.jt0;
import com.oplus.aiunit.vision.jw0;
import com.oplus.aiunit.vision.lc5;
import com.oplus.aiunit.vision.qi5;
import com.oplus.aiunit.vision.uv0;
import com.oplus.aiunit.vision.va5;
import com.oplus.aiunit.vision.x0;

/* JADX INFO: loaded from: classes17.dex */
public class BandSyncApp {
    public static final String TAG = "BandSyncApp";

    public static class OOBEReceiver extends BroadcastReceiver {
        public static void a(Context context) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("pair_success_action");
            LocalBroadcastManager.getInstance(context).registerReceiver(new OOBEReceiver(), intentFilter);
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null || !"pair_success_action".equals(intent.getAction())) {
                return;
            }
            String stringExtra = intent.getStringExtra(va5.TAG_DEVICE_MODEL);
            String stringExtra2 = intent.getStringExtra("device_address");
            jw0.d("OOBEReceiver", "[onReceive] --> PAIR_SUCCESS_ACTION, model = " + stringExtra + ", mac:" + gdb.a(stringExtra2));
            if (((Boolean) lc5.d(stringExtra).a(new g6d())).booleanValue()) {
                ((IDeviceSettingService) x0.d().h(IDeviceSettingService.class)).e2();
            }
            Bandsp.a(stringExtra2);
        }
    }

    public class a implements cr0 {
        @Override // com.oplus.aiunit.vision.cr0
        public void a(fr0 fr0Var) {
            jw0.d(BandSyncApp.TAG, "[onDisConnected] --> ");
        }

        @Override // com.oplus.aiunit.vision.cr0
        public void b(fr0 fr0Var) {
            if (((Boolean) lc5.c(fr0Var.a()).a(new uv0())).booleanValue()) {
                qi5.A(fr0Var.a()).w();
            }
        }
    }

    public static void a(Context context) {
        jw0.d(TAG, "[init] --> ");
        OOBEReceiver.a(context);
        jt0.a().c(new a());
    }
}
