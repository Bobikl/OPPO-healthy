package com.sensorsdata.analytics.android.sdk.advert.utils;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.sensorsdata.analytics.android.sdk.SAAdvertisingConfig;
import com.sensorsdata.analytics.android.sdk.SALog;
import com.sensorsdata.analytics.android.sdk.advert.SAAdvertConstants;
import com.sensorsdata.analytics.android.sdk.advert.deeplink.DeepLinkManager;
import com.sensorsdata.analytics.android.sdk.advert.oaid.SAOaidHelper;
import com.sensorsdata.analytics.android.sdk.core.SACoreHelper;
import com.sensorsdata.analytics.android.sdk.core.event.InputData;
import com.sensorsdata.analytics.android.sdk.data.persistent.PersistentDailyDate;
import com.sensorsdata.analytics.android.sdk.data.persistent.PersistentLoader;
import com.sensorsdata.analytics.android.sdk.internal.beans.EventType;
import com.sensorsdata.analytics.android.sdk.util.SensorsDataUtils;
import com.sensorsdata.analytics.android.sdk.util.TimeUtils;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class SAAdvertMarketHelper {
    public static void handleAdMarket(final Activity activity, final SAAdvertisingConfig sAAdvertisingConfig) {
        if (sAAdvertisingConfig != null) {
            try {
                if (sAAdvertisingConfig.isEnableRemarketing() && isDailyFirst()) {
                    SACoreHelper.getInstance().trackQueueEvent(new Runnable() { // from class: com.sensorsdata.analytics.android.sdk.advert.utils.SAAdvertMarketHelper.1
                        @Override // java.lang.Runnable
                        public void run() {
                            try {
                                boolean z = true;
                                Intent uri = !TextUtils.isEmpty(sAAdvertisingConfig.getWakeupUrl()) ? Intent.parseUri(sAAdvertisingConfig.getWakeupUrl(), 1) : null;
                                Context applicationContext = activity.getApplicationContext();
                                JSONObject jSONObject = new JSONObject();
                                jSONObject.put("$ios_install_source", ChannelUtils.getDeviceInfo(applicationContext, SensorsDataUtils.getIdentifier(applicationContext), SAOaidHelper.getOpenAdIdentifier(applicationContext), SAOaidHelper.getOpenAdIdentifierByReflection(applicationContext)));
                                if (!DeepLinkManager.isDeepLink(activity.getIntent()) && !DeepLinkManager.isDeepLink(uri)) {
                                    z = false;
                                }
                                jSONObject.put("$sat_awake_from_deeplink", z);
                                jSONObject.put("$sat_has_installed_app", SAAdvertUtils.isInstallationTracked());
                                SACoreHelper.getInstance().trackEvent(new InputData().setEventType(EventType.TRACK).setEventName(SAAdvertConstants.EventName.APP_INTERACT).setProperties(jSONObject));
                            } catch (Exception e2) {
                                SALog.printStackTrace(e2);
                            }
                        }
                    });
                }
            } catch (Exception e2) {
                SALog.printStackTrace(e2);
            }
        }
    }

    public static boolean isDailyFirst() {
        PersistentDailyDate dayDatePst = PersistentLoader.getInstance().getDayDatePst();
        String time = TimeUtils.formatTime(System.currentTimeMillis(), "yyyy-MM-dd");
        if (time.equals(dayDatePst.get())) {
            return false;
        }
        dayDatePst.commit(time);
        return true;
    }
}
