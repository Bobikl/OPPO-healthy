package com.heytap.accessory.platform;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.heytap.accessory.RegistrationTask;
import com.heytap.accessory.logging.SdkLog;
import com.sensorsdata.analytics.android.sdk.aop.push.PushAutoTrackHelper;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public final class RegisterUponInstallReceiver extends BroadcastReceiver {
    private static String TAG = "RegisterUponInstallReceiver";

    @Override // android.content.BroadcastReceiver
    public void onReceive(final Context context, final Intent intent) {
        PushAutoTrackHelper.onBroadcastReceiver(this, context, intent);
        try {
            Executors.newSingleThreadExecutor().execute(new Runnable() { // from class: com.heytap.accessory.platform.RegisterUponInstallReceiver.1
                @Override // java.lang.Runnable
                public void run() {
                    SdkLog.d(RegisterUponInstallReceiver.TAG, "Received register intent:" + context.getPackageName());
                    Intent intent2 = intent;
                    if (intent2 == null || intent2.getAction() == null || !"com.heytap.accessory.action.REGISTER_AGENT".equals(intent.getAction())) {
                        return;
                    }
                    RegistrationTask registrationTask = new RegistrationTask(context.getApplicationContext());
                    Future<Void> futurePrepare = registrationTask.prepare();
                    registrationTask.start();
                    try {
                        futurePrepare.get();
                    } catch (InterruptedException | ExecutionException unused) {
                        SdkLog.w(RegisterUponInstallReceiver.TAG, "RegisterUponInstallReceiver Exception");
                    }
                    SdkLog.d(RegisterUponInstallReceiver.TAG, "RegisterUponInstallReceiver handle complete,return...");
                }
            });
        } catch (Exception unused) {
            SdkLog.e(TAG, "RegisterUponInstallReceiver receive exception");
        }
    }
}
