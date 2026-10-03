package com.oplus.aiunit.vision;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* JADX INFO: loaded from: classes2.dex */
public class m25 {
    public BroadcastReceiver a;

    public class a extends BroadcastReceiver {
        public a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (i25.ACTION_LOG_STATUS.equals(intent.getAction())) {
                i25.e(intent.getIntExtra(i25.PARAM_LOG_STATUS, 0) != 0);
            }
        }
    }

    public static class b {
        public static final m25 a = new m25(null);
    }

    public /* synthetic */ m25(a aVar) {
        this();
    }

    public static m25 a() {
        return b.a;
    }

    public void b(Context context) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(i25.ACTION_LOG_STATUS);
        context.registerReceiver(this.a, intentFilter);
    }

    public m25() {
        this.a = new a();
    }
}
