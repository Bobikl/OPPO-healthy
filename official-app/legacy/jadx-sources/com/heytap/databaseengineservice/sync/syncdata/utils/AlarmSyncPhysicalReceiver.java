package com.heytap.databaseengineservice.sync.syncdata.utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.heytap.databaseengineservice.sync.syncdata.utils.AlarmSyncPhysicalReceiver;
import com.oplus.aiunit.vision.at;
import com.oplus.aiunit.vision.cj4;
import com.oplus.aiunit.vision.hz;
import com.oplus.aiunit.vision.qa2;
import com.oplus.aiunit.vision.sn;
import com.oplus.aiunit.vision.t6f;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes15.dex */
public class AlarmSyncPhysicalReceiver extends BroadcastReceiver {
    public final ExecutorService a = qa2.common.c("AlarmSyncPhysicalReceiver");

    public static /* synthetic */ void b() {
        cj4.a("AlarmSyncPhysicalReceiver", "AlarmSyncPhysicalReceiver run enter");
        String strA = sn.INSTANCE.a();
        cj4.a("AlarmSyncPhysicalReceiver", "ssoid: " + strA);
        if (hz.a(strA)) {
            cj4.d("AlarmSyncPhysicalReceiver", "onReceive userId is null, action is weight!");
        } else {
            new t6f(true).o(strA);
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        cj4.a("AlarmSyncPhysicalReceiver", "onReceive enter!");
        if (intent != null && TextUtils.equals(intent.getAction(), at.INTENT_ACTION_WEIGHT)) {
            cj4.c("AlarmSyncPhysicalReceiver", "start weight body fat query!");
            this.a.execute(new Runnable() { // from class: com.oplus.aiunit.vision.zs
                @Override // java.lang.Runnable
                public final void run() {
                    AlarmSyncPhysicalReceiver.b();
                }
            });
        }
    }
}
