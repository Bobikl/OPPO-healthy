package com.heytap.health.settings.me.thirdpartbinding.wechat;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import com.heytap.health.settings.me.thirdpartbinding.wechat.WXSportReceiver;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.b78;
import com.oplus.aiunit.vision.rdf;
import com.oplus.aiunit.vision.ycb;
import com.tencent.mm.opensdk.constants.ConstantsAPI;

/* JADX INFO: loaded from: classes17.dex */
public class WXSportReceiver extends BroadcastReceiver {
    public static WXSportReceiver b;
    public Handler a = new Handler(Looper.getMainLooper());

    public static /* synthetic */ void b() {
        ycb.i().I(true);
    }

    public static synchronized void c() {
        if (b != null) {
            return;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(ConstantsAPI.ACTION_REFRESH_WXAPP);
        b = new WXSportReceiver();
        rdf.a(b78.a(), b, intentFilter, 2);
    }

    public static synchronized void d() {
        if (b != null) {
            b78.a().unregisterReceiver(b);
            b = null;
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        a7b.f("MMStepSyncManager", "On Receive Wechat launch event, sync step after 10 seconds");
        this.a.removeCallbacksAndMessages(null);
        this.a.postDelayed(new Runnable() { // from class: com.oplus.aiunit.vision.r5l
            @Override // java.lang.Runnable
            public final void run() {
                WXSportReceiver.b();
            }
        }, 10000L);
    }
}
