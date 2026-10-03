package com.oplus.aiunit.vision;

import android.content.Intent;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;

/* JADX INFO: loaded from: classes15.dex */
public class k2 {
    public static void a(int i) {
        Intent intent = new Intent("FAMILY_HEALTH_ABNORMAL");
        intent.putExtra("FAMILY_HEALTH_ABNORMAL", i);
        LocalBroadcastManager.getInstance(b78.a()).sendBroadcast(intent);
    }
}
