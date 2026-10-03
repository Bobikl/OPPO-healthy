package com.heytap.health.telecom;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.mqj;
import com.oplus.aiunit.vision.vda;

/* JADX INFO: loaded from: classes18.dex */
public class TelecomPairReceiver extends BroadcastReceiver {
    public static final String PERMISSION_GROUP_PHONE = "permission_group_phone";
    public static final String PUBLIC_WEARABLE_PERMISSION_RECEIVER = "com.op.smartwear.public.wearable.PERMISSION_RECEIVER";
    public static final String SERVER_ACTION_DETAIL = "server_action_detail";
    public static final int SUCCESSFUL_SYNC_START_ACTION = 23;
    public static final String WEARABLE_PERMISSION_GROUP = "wearable_permission_group";

    public static void a(Context context) {
        a7b.f("TelHealth.TelecomPairReceiver", "registerLocalReceiver() called");
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.op.smartwear.public.wearable.RECEIVER");
        intentFilter.addAction(PUBLIC_WEARABLE_PERMISSION_RECEIVER);
        LocalBroadcastManager.getInstance(context).registerReceiver(new TelecomPairReceiver(), intentFilter);
    }

    @Override // android.content.BroadcastReceiver
    @SuppressLint({"CheckResult"})
    public void onReceive(Context context, Intent intent) {
        if (intent != null) {
            String action = intent.getAction();
            a7b.f("TelHealth.TelecomPairReceiver", "onReceive() called with: action = [" + action + "]");
            if ("com.op.smartwear.public.wearable.RECEIVER".equals(action)) {
                if (intent.getIntExtra(SERVER_ACTION_DETAIL, 0) == 23) {
                    mqj.b();
                }
            } else if (PUBLIC_WEARABLE_PERMISSION_RECEIVER.equals(action) && PERMISSION_GROUP_PHONE.equals(vda.k(intent, WEARABLE_PERMISSION_GROUP))) {
                mqj.b();
            }
        }
    }
}
