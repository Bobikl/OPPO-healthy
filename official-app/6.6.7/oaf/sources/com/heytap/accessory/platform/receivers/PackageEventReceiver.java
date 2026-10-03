package com.heytap.accessory.platform.receivers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import com.heytap.accessory.base.AccessoryManager;
import com.heytap.accessory.base.logging.a;
import com.heytap.accessory.misc.utils.PlatformPermissionUtils;
import com.heytap.accessory.misc.utils.PlatformUtils;
import com.heytap.accessory.platform.services.FrameworkService;
import com.heytap.accessory.sdp.service.b;
import com.heytap.accessory.utils.ServiceXmlReader;
import com.sensorsdata.analytics.android.sdk.aop.push.PushAutoTrackHelper;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public class PackageEventReceiver extends BroadcastReceiver {
    private static final int MAX_RETRY_COUNT = 1;
    private static final String TAG = "PackageEventReceiver";

    public static class PackageEventTask extends Thread {
        private Context mContext;
        private Intent mIntent;

        public PackageEventTask(Context context, Intent intent) {
            this.mContext = context;
            this.mIntent = intent;
        }

        private boolean isPackageInstalled(Context context, String str) {
            try {
                context.getPackageManager().getApplicationEnabledSetting(str);
                return true;
            } catch (IllegalArgumentException unused) {
                return false;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$run$0(List list) {
            ServiceXmlReader serviceXmlReader = ServiceXmlReader.getInstance(this.mContext);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                FrameworkService.registerService(this.mContext, ((ResolveInfo) it.next()).activityInfo.applicationInfo.packageName, serviceXmlReader);
            }
        }

        private void registerService(Context context, String str) {
            FrameworkService.registerService(context, str, ServiceXmlReader.getInstance(context));
        }

        private void unregisterService(String str) {
            a.a(PackageEventReceiver.TAG, "unregisterService : " + str);
            AccessoryManager.h().c(str);
            FrameworkService.removePackageInfo(str);
            b.g().d(str);
            PlatformPermissionUtils.a(str);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            Intent intent;
            String action;
            if (this.mContext == null || (intent = this.mIntent) == null || (action = intent.getAction()) == null) {
                return;
            }
            try {
                if ("android.intent.action.PACKAGE_ADDED".equals(action)) {
                    String dataString = this.mIntent.getDataString();
                    if (dataString == null) {
                        a.e(PackageEventReceiver.TAG, "Invalid PACKAGE_ADDED event. Ignoring ...");
                        return;
                    }
                    String str = dataString.split(":")[1];
                    a.c(PackageEventReceiver.TAG, "App installed: " + str);
                    registerService(this.mContext, str);
                    try {
                        Thread.sleep(((long) 1) * 5000);
                    } catch (InterruptedException e) {
                        a.b(PackageEventReceiver.TAG, "sleep error," + e);
                    }
                    if (!AccessoryManager.h().b(str)) {
                        a.e(PackageEventReceiver.TAG, "[" + str + "] removed. Stop sending intent");
                        return;
                    }
                    if (!b.g().a(str).isEmpty()) {
                        a.d(PackageEventReceiver.TAG, "[" + str + "] registered. Stop sending intent");
                        return;
                    }
                    a.c(PackageEventReceiver.TAG, "[" + str + "] not registered yet");
                    a.e(PackageEventReceiver.TAG, "Give up registration:" + str);
                    return;
                }
                if ("android.intent.action.PACKAGE_REMOVED".equals(action)) {
                    String dataString2 = this.mIntent.getDataString();
                    if (dataString2 == null) {
                        a.e(PackageEventReceiver.TAG, "Invalid PACKAGE_REMOVED event. Ignoring ...");
                        return;
                    }
                    String str2 = dataString2.split(":")[1];
                    if (isPackageInstalled(this.mContext, str2)) {
                        a.e(PackageEventReceiver.TAG, "PACKAGE_REMOVED intent came late : " + str2);
                        return;
                    }
                    com.heytap.accessory.sdk.accessorymanager.a.a(str2, this.mContext);
                    a.c(PackageEventReceiver.TAG, "App " + str2 + " was removed.");
                    unregisterService(str2);
                    return;
                }
                if (!"android.intent.action.PACKAGE_CHANGED".equals(action)) {
                    if ("android.intent.action.BOOT_COMPLETED".equals(action)) {
                        a.a(PackageEventReceiver.TAG, "startRegisterApps when BOOT_COMPLETED");
                        final List<ResolveInfo> listQueryBroadcastReceivers = this.mContext.getPackageManager().queryBroadcastReceivers(new Intent("com.heytap.accessory.action.REGISTER_AGENT"), 64);
                        com.heytap.accessory.base.thread.a.b().a("daemon").post(new Runnable() { // from class: com.oplus.aiunit.vision.h4e
                            @Override // java.lang.Runnable
                            public final void run() {
                                this.i.lambda$run$0(listQueryBroadcastReceivers);
                            }
                        });
                        return;
                    }
                    return;
                }
                String dataString3 = this.mIntent.getDataString();
                if (dataString3 == null) {
                    return;
                }
                String str3 = dataString3.split(":")[1];
                try {
                    int applicationEnabledSetting = this.mContext.getPackageManager().getApplicationEnabledSetting(str3);
                    a.c(PackageEventReceiver.TAG, "The current enabled state for " + str3 + " : " + applicationEnabledSetting);
                    if (applicationEnabledSetting == 1) {
                        if (AccessoryManager.h().b(str3)) {
                            a.c(PackageEventReceiver.TAG, "current package has registered before,ignore");
                            return;
                        } else {
                            registerService(this.mContext, str3);
                            return;
                        }
                    }
                    if (applicationEnabledSetting == 2 || applicationEnabledSetting == 3 || applicationEnabledSetting == 4) {
                        unregisterService(str3);
                        return;
                    } else {
                        a.e(PackageEventReceiver.TAG, "Invalid PACKAGE_CHANGED event. Ignoring ...");
                        return;
                    }
                } catch (IllegalArgumentException unused) {
                    a.e(PackageEventReceiver.TAG, str3 + " does not exist.");
                    return;
                }
            } catch (Exception e2) {
                a.b(PackageEventReceiver.TAG, "PackageEventTask error," + e2);
            }
            a.b(PackageEventReceiver.TAG, "PackageEventTask error," + e2);
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        PushAutoTrackHelper.onBroadcastReceiver(this, context, intent);
        if (PlatformUtils.getContext() == null) {
            PlatformUtils.setContext(context.getApplicationContext());
        }
        new PackageEventTask(context, intent).start();
    }
}
