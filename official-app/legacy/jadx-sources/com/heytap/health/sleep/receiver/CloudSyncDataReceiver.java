package com.heytap.health.sleep.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.health.sleep.algorithm.SleepStatProcess;
import com.oplus.aiunit.vision.a7b;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes18.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \n2\u00020\u0001:\u0001\u000bB\u0007¢\u0006\u0004\b\b\u0010\tJ\u001c\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¨\u0006\f"}, d2 = {"Lcom/heytap/health/sleep/receiver/CloudSyncDataReceiver;", "Landroid/content/BroadcastReceiver;", "Landroid/content/Context;", "context", "Landroid/content/Intent;", "intent", "", "onReceive", "<init>", "()V", "Companion", "a", "sleep_release"}, k = 1, mv = {1, 8, 0})
public final class CloudSyncDataReceiver extends BroadcastReceiver {
    public static final int $stable = 0;

    @Override // android.content.BroadcastReceiver
    public void onReceive(@Nullable Context context, @Nullable Intent intent) {
        String action = intent != null ? intent.getAction() : null;
        boolean z = false;
        if (action != null && action.equals("com.heytap.health.action_sync_calculate")) {
            z = true;
        }
        if (z) {
            a7b.f("CloudSyncDataReceiver", "Need to recalculate sleepDayStat");
            long jCurrentTimeMillis = System.currentTimeMillis();
            SleepStatProcess.INSTANCE.a().l(jCurrentTimeMillis - ((long) 60000), jCurrentTimeMillis);
        }
    }
}
