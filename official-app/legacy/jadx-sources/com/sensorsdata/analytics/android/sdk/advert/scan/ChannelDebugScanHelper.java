package com.sensorsdata.analytics.android.sdk.advert.scan;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import android.text.TextUtils;
import com.heytap.voiceassistant.sdk.tts.constant.SpeechConstant;
import com.sensorsdata.analytics.advert.R$string;
import com.sensorsdata.analytics.android.sdk.SALog;
import com.sensorsdata.analytics.android.sdk.SensorsDataAPI;
import com.sensorsdata.analytics.android.sdk.advert.SAAdvertConstants;
import com.sensorsdata.analytics.android.sdk.advert.oaid.SAOaidHelper;
import com.sensorsdata.analytics.android.sdk.advert.utils.ChannelUtils;
import com.sensorsdata.analytics.android.sdk.advert.utils.SAAdvertUtils;
import com.sensorsdata.analytics.android.sdk.core.SACoreHelper;
import com.sensorsdata.analytics.android.sdk.core.event.InputData;
import com.sensorsdata.analytics.android.sdk.dialog.SensorsDataDialogUtils;
import com.sensorsdata.analytics.android.sdk.dialog.SensorsDataLoadingDialog;
import com.sensorsdata.analytics.android.sdk.internal.beans.EventType;
import com.sensorsdata.analytics.android.sdk.internal.beans.ServerUrl;
import com.sensorsdata.analytics.android.sdk.network.HttpCallback;
import com.sensorsdata.analytics.android.sdk.network.HttpMethod;
import com.sensorsdata.analytics.android.sdk.network.RequestHelper;
import com.sensorsdata.analytics.android.sdk.util.JSONUtils;
import com.sensorsdata.analytics.android.sdk.util.NetworkUtils;
import com.sensorsdata.analytics.android.sdk.util.SADisplayUtil;
import com.sensorsdata.analytics.android.sdk.util.SensorsDataUtils;
import java.util.Date;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class ChannelDebugScanHelper implements IAdvertScanListener {
    /* JADX INFO: Access modifiers changed from: private */
    public static void requestActiveChannel(String str, String str2, String str3, String str4, String str5, boolean z, HttpCallback httpCallback) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("monitor_id", str2);
            jSONObject.put("distinct_id", SensorsDataAPI.sharedInstance().getDistinctId());
            jSONObject.put("project_id", str3);
            jSONObject.put("account_id", str4);
            jSONObject.put("has_active", z ? SpeechConstant.TRUE_STR : SpeechConstant.FALSE_STR);
            jSONObject.put("device_code", str5);
            new RequestHelper.Builder(HttpMethod.POST, str + "/api/sdk/channel_tool/url").jsonData(jSONObject.toString()).callback(httpCallback).execute();
        } catch (Exception e2) {
            SALog.printStackTrace(e2);
        }
    }

    public static void showChannelDebugActiveDialog(final Activity activity) {
        SensorsDataDialogUtils.showDialog(activity, SADisplayUtil.getStringResource(activity, R$string.sensors_analytics_ad_dialog_title), SADisplayUtil.getStringResource(activity, R$string.sensors_analytics_ad_dialog_content), SADisplayUtil.getStringResource(activity, R$string.sensors_analytics_ad_dialog_activate), new DialogInterface.OnClickListener() { // from class: com.sensorsdata.analytics.android.sdk.advert.scan.ChannelDebugScanHelper.1
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                ChannelDebugScanHelper.trackChannelDebugInstallation(activity);
                ChannelDebugScanHelper.showChannelDebugActiveDialog(activity);
            }
        }, SADisplayUtil.getStringResource(activity, R$string.sensors_analytics_ad_dialog_cancel), new DialogInterface.OnClickListener() { // from class: com.sensorsdata.analytics.android.sdk.advert.scan.ChannelDebugScanHelper.2
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                SensorsDataDialogUtils.startLaunchActivity(activity);
            }
        });
    }

    public static void showChannelDebugDialog(final Activity activity, final String str, final String str2, final String str3, final String str4) {
        SensorsDataDialogUtils.showDialog(activity, SADisplayUtil.getStringResource(activity, R$string.sensors_analytics_ad_dialog_starting), "", SADisplayUtil.getStringResource(activity, R$string.sensors_analytics_ad_dialog_ok), new DialogInterface.OnClickListener() { // from class: com.sensorsdata.analytics.android.sdk.advert.scan.ChannelDebugScanHelper.4
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                if (dialogInterface != null) {
                    dialogInterface.dismiss();
                }
                Context applicationContext = activity.getApplicationContext();
                boolean zIsTrackInstallation = ChannelUtils.isTrackInstallation();
                if (zIsTrackInstallation && !ChannelUtils.isCorrectTrackInstallation()) {
                    ChannelDebugScanHelper.showChannelDebugErrorDialog(activity);
                    return;
                }
                String identifier = SensorsDataUtils.getIdentifier(applicationContext);
                String openAdIdentifier = SAOaidHelper.getOpenAdIdentifier(applicationContext);
                if (zIsTrackInstallation && !ChannelUtils.isGetDeviceInfo(identifier, openAdIdentifier)) {
                    ChannelDebugScanHelper.showChannelDebugErrorDialog(activity);
                    return;
                }
                if (!NetworkUtils.isNetworkAvailable(applicationContext)) {
                    Activity activity2 = activity;
                    SensorsDataDialogUtils.showDialog(activity2, SADisplayUtil.getStringResource(activity2, R$string.sensors_analytics_ad_error_network));
                    return;
                }
                Activity activity3 = activity;
                String deviceInfo = ChannelUtils.getDeviceInfo(activity3, identifier, openAdIdentifier, SAOaidHelper.getOpenAdIdentifierByReflection(activity3));
                final SensorsDataLoadingDialog sensorsDataLoadingDialog = new SensorsDataLoadingDialog(activity);
                SensorsDataDialogUtils.dialogShowDismissOld(sensorsDataLoadingDialog);
                ChannelDebugScanHelper.requestActiveChannel(str, str2, str3, str4, deviceInfo, zIsTrackInstallation, new HttpCallback.JsonCallback() { // from class: com.sensorsdata.analytics.android.sdk.advert.scan.ChannelDebugScanHelper.4.1
                    @Override // com.sensorsdata.analytics.android.sdk.network.HttpCallback
                    public void onFailure(int i2, String str5) {
                        sensorsDataLoadingDialog.dismiss();
                        SALog.i(SAAdvertConstants.TAG, "ChannelDebug request error:" + str5);
                        Activity activity4 = activity;
                        SensorsDataDialogUtils.showDialog(activity4, SADisplayUtil.getStringResource(activity4, R$string.sensors_analytics_ad_error_request));
                    }

                    @Override // com.sensorsdata.analytics.android.sdk.network.HttpCallback
                    public void onResponse(JSONObject jSONObject) {
                        sensorsDataLoadingDialog.dismiss();
                        if (jSONObject == null) {
                            SALog.i(SAAdvertConstants.TAG, "ChannelDebug response error msg: response is null");
                            Activity activity4 = activity;
                            SensorsDataDialogUtils.showDialog(activity4, SADisplayUtil.getStringResource(activity4, R$string.sensors_analytics_ad_error_whitelist));
                        } else {
                            if (jSONObject.optInt("code", 0) == 1) {
                                ChannelDebugScanHelper.showChannelDebugActiveDialog(activity);
                                return;
                            }
                            SALog.i(SAAdvertConstants.TAG, "ChannelDebug response error msg:" + jSONObject.optString("message"));
                            Activity activity5 = activity;
                            SensorsDataDialogUtils.showDialog(activity5, SADisplayUtil.getStringResource(activity5, R$string.sensors_analytics_ad_error_whitelist));
                        }
                    }
                });
            }
        }, SADisplayUtil.getStringResource(activity, R$string.sensors_analytics_ad_dialog_cancel), new DialogInterface.OnClickListener() { // from class: com.sensorsdata.analytics.android.sdk.advert.scan.ChannelDebugScanHelper.5
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                SensorsDataDialogUtils.startLaunchActivity(activity);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void showChannelDebugErrorDialog(final Activity activity) {
        SensorsDataDialogUtils.showDialog(activity, SADisplayUtil.getStringResource(activity, R$string.sensors_analytics_ad_error_debug_fail_title), SADisplayUtil.getStringResource(activity, R$string.sensors_analytics_ad_error_debug_fail_content), SADisplayUtil.getStringResource(activity, R$string.sensors_analytics_ad_dialog_ok), new DialogInterface.OnClickListener() { // from class: com.sensorsdata.analytics.android.sdk.advert.scan.ChannelDebugScanHelper.6
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                SensorsDataDialogUtils.startLaunchActivity(activity);
            }
        }, null, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void trackChannelDebugInstallation(final Activity activity) {
        new Thread(new Runnable() { // from class: com.sensorsdata.analytics.android.sdk.advert.scan.ChannelDebugScanHelper.3
            @Override // java.lang.Runnable
            public void run() {
                try {
                    JSONObject jSONObject = new JSONObject();
                    Activity activity2 = activity;
                    jSONObject.put("$ios_install_source", ChannelUtils.getDeviceInfo(activity2, SAAdvertUtils.getIdentifier(activity2), SAOaidHelper.getOpenAdIdentifier(activity), SAOaidHelper.getOpenAdIdentifierByReflection(activity)));
                    SACoreHelper.getInstance().trackEvent(new InputData().setEventType(EventType.TRACK).setEventName("$ChannelDebugInstall").setProperties(jSONObject));
                    JSONObject jSONObject2 = new JSONObject();
                    JSONUtils.mergeJSONObject(jSONObject, jSONObject2);
                    jSONObject2.put("$first_visit_time", new Date());
                    SACoreHelper.getInstance().trackEvent(new InputData().setEventType(EventType.PROFILE_SET_ONCE).setProperties(jSONObject2));
                    SensorsDataAPI.sharedInstance().flush();
                } catch (Exception e2) {
                    SALog.printStackTrace(e2);
                }
            }
        }).start();
    }

    @Override // com.sensorsdata.analytics.android.sdk.advert.scan.IAdvertScanListener
    public void handlerScanUri(Activity activity, Uri uri) {
        if (ChannelUtils.hasUtmByMetaData(activity)) {
            SensorsDataDialogUtils.showDialog(activity, SADisplayUtil.getStringResource(activity, R$string.sensors_analytics_ad_listener));
            return;
        }
        String queryParameter = uri.getQueryParameter("monitor_id");
        if (TextUtils.isEmpty(queryParameter)) {
            SensorsDataDialogUtils.startLaunchActivity(activity);
            return;
        }
        String serverUrl = SensorsDataAPI.sharedInstance().getServerUrl();
        if (TextUtils.isEmpty(serverUrl)) {
            SensorsDataDialogUtils.showDialog(activity, SADisplayUtil.getStringResource(activity, R$string.sensors_analytics_ad_error_url));
            return;
        }
        ServerUrl serverUrl2 = new ServerUrl(serverUrl);
        if (!serverUrl2.getProject().equals(uri.getQueryParameter("project_name"))) {
            SensorsDataDialogUtils.showDialog(activity, SADisplayUtil.getStringResource(activity, R$string.sensors_analytics_ad_error_project));
            return;
        }
        String queryParameter2 = uri.getQueryParameter("project_id");
        String queryParameter3 = uri.getQueryParameter("account_id");
        if (!"1".equals(uri.getQueryParameter("is_relink"))) {
            showChannelDebugDialog(activity, serverUrl2.getBaseUrl(), queryParameter, queryParameter2, queryParameter3);
        } else if (ChannelUtils.checkDeviceInfo(activity, uri.getQueryParameter("device_code"))) {
            showChannelDebugActiveDialog(activity);
        } else {
            SensorsDataDialogUtils.showDialog(activity, SADisplayUtil.getStringResource(activity, R$string.sensors_analytics_ad_error_retry));
        }
    }
}
