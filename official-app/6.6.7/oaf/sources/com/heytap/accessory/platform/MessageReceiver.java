package com.heytap.accessory.platform;

import android.annotation.TargetApi;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.heytap.accessory.BaseJobAgent;
import com.heytap.accessory.BaseJobService;
import com.heytap.accessory.BaseMessage;
import com.heytap.accessory.bean.GeneralException;
import com.heytap.accessory.bean.PeerAgent;
import com.heytap.accessory.bean.ServiceProfile;
import com.heytap.accessory.logging.SdkLog;
import com.heytap.accessory.utils.ClassUtils;
import com.heytap.accessory.utils.ConfigUtil;
import com.heytap.accessory.utils.SdkConfig;
import com.sensorsdata.analytics.android.sdk.aop.push.PushAutoTrackHelper;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
@TargetApi(26)
public final class MessageReceiver extends BroadcastReceiver {
    private static String TAG = "MessageReceiver";

    private synchronized boolean isValidImplClass(Context context, String str) {
        boolean z;
        ConfigUtil defaultInstance = ConfigUtil.getDefaultInstance(context);
        z = false;
        if (defaultInstance != null) {
            ServiceProfile serviceProfileFetchServicesDescription = defaultInstance.fetchServicesDescription(str);
            if (serviceProfileFetchServicesDescription == null) {
                SdkLog.e(TAG, "fetch service profile description failed !!");
            } else if (str.equalsIgnoreCase(serviceProfileFetchServicesDescription.getServiceImpl())) {
                z = true;
            }
        } else {
            SdkLog.e(TAG, "config  util default instance  creation failed !!");
        }
        return z;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        PushAutoTrackHelper.onBroadcastReceiver(this, context, intent);
        if (intent == null || intent.getAction() == null) {
            SdkLog.d(TAG, "received null intent!");
            return;
        }
        if (BaseMessage.ACTION_ACCESSORY_MESSAGE_RECEIVED.equalsIgnoreCase(intent.getAction())) {
            SdkLog.d(TAG, "Incoming Data Received!!!");
            try {
                new SdkConfig(context);
                try {
                    String stringExtra = intent.getStringExtra("agentImplclass");
                    if (stringExtra == null) {
                        SdkLog.e(TAG, "Impl class not available in intent. ignoring message received");
                        return;
                    }
                    Class<?> cls = Class.forName(stringExtra);
                    if (!isValidImplClass(context, cls.getName())) {
                        SdkLog.w(TAG, "invalid impl class: " + cls.getName());
                        return;
                    }
                    boolean z = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).applicationInfo.targetSdkVersion >= 26;
                    intent.setClassName(context, stringExtra);
                    if (ClassUtils.isChildClass(BaseJobAgent.class, cls) && z) {
                        BaseJobService.scheduleSCJob(context.getApplicationContext(), stringExtra, intent.getLongExtra("transactionId", 0L), intent.getStringExtra("agentId"), (PeerAgent) intent.getParcelableExtra("peerAgent"));
                        return;
                    }
                    if ((z ? context.startForegroundService(intent) : context.startService(intent)) == null) {
                        SdkLog.e(TAG, "Agent " + stringExtra + " not found. Check Accessory Service XML for serviceImpl attribute");
                    }
                } catch (ClassNotFoundException e) {
                    SdkLog.e(TAG, "Agent Impl class not found!" + e);
                } catch (Exception e2) {
                    SdkLog.e(TAG, "", e2);
                }
            } catch (GeneralException e3) {
                SdkLog.e(TAG, "SDK config initialization failed." + e3);
            }
        }
    }
}
