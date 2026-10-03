package com.heytap.accessory.platform;

import android.annotation.TargetApi;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import com.heytap.accessory.AgentCallbackImpl;
import com.heytap.accessory.BaseJobAgent;
import com.heytap.accessory.bean.GeneralException;
import com.heytap.accessory.bean.ServiceProfile;
import com.heytap.accessory.logging.SdkLog;
import com.heytap.accessory.utils.ClassUtils;
import com.heytap.accessory.utils.ConfigUtil;
import com.heytap.accessory.utils.PackageUtils;
import com.heytap.accessory.utils.SdkConfig;
import com.sensorsdata.analytics.android.sdk.aop.push.PushAutoTrackHelper;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
@TargetApi(26)
public final class ServiceConnectionIndicationReceiver extends BroadcastReceiver {
    private final String TAG = ServiceConnectionIndicationReceiver.class.getSimpleName();

    private void handleConnectionRequest(Context context, Intent intent, String str) {
        SdkLog.d(this.TAG, "handleConnectionRequest ");
        BaseJobAgent.requestAgent(context, str, new AgentCallbackImpl(1, intent));
    }

    private synchronized boolean isValidImplClass(Context context, String str) {
        boolean z;
        ConfigUtil defaultInstance = ConfigUtil.getDefaultInstance(context);
        z = false;
        if (defaultInstance != null) {
            ServiceProfile serviceProfileFetchServicesDescription = defaultInstance.fetchServicesDescription(str);
            if (serviceProfileFetchServicesDescription == null) {
                SdkLog.e(this.TAG, "fetch service profile description failed !!");
            } else if (str.equalsIgnoreCase(serviceProfileFetchServicesDescription.getServiceImpl())) {
                z = true;
            }
        } else {
            SdkLog.e(this.TAG, "config  util default instance  creation failed !!");
        }
        return z;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        PushAutoTrackHelper.onBroadcastReceiver(this, context, intent);
        SdkLog.d(this.TAG, "onReceive");
        if (intent == null || intent.getAction() == null || !"com.heytap.accessory.action.SERVICE_CONNECTION_REQUESTED".equalsIgnoreCase(intent.getAction())) {
            return;
        }
        SdkLog.i(this.TAG, "Incoming service connection request received.");
        try {
            new SdkConfig(context);
            try {
                String stringExtra = intent.getStringExtra("agentImplclass");
                if (stringExtra == null) {
                    SdkLog.e(this.TAG, "Impl class not available in intent. Ignoring request");
                    return;
                }
                SdkLog.v(this.TAG, "Connection request will be handled by :" + stringExtra);
                Class<?> cls = Class.forName(stringExtra);
                if (isValidImplClass(context, cls.getName())) {
                    boolean zIsChildClass = ClassUtils.isChildClass(BaseJobAgent.class, cls);
                    PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
                    int i = packageInfo.applicationInfo.targetSdkVersion;
                    boolean z = i >= 21;
                    boolean z2 = i >= 26;
                    intent.setClassName(context, stringExtra);
                    if (zIsChildClass && z) {
                        handleConnectionRequest(context.getApplicationContext(), intent, stringExtra);
                        SdkLog.i(this.TAG, "ServiceConnectionIndicationReceiver handle complete");
                        return;
                    }
                    if (!z2) {
                        SdkLog.d(this.TAG, "startService");
                        context.startService(intent);
                        return;
                    }
                    int uid = PackageUtils.getUid(context);
                    if (!"com.heytap.accessory".equals(packageInfo.packageName) && uid != 1000) {
                        SdkLog.d(this.TAG, "startForegroundService");
                        context.startForegroundService(intent);
                        return;
                    }
                    SdkLog.d(this.TAG, "startService directly in OAF APP or system app");
                    context.startService(intent);
                }
            } catch (ClassNotFoundException e) {
                SdkLog.e(this.TAG, "Agent Impl class not found!" + e);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        } catch (GeneralException e3) {
            SdkLog.e(this.TAG, "SDK config init failed." + e3);
        }
    }
}
