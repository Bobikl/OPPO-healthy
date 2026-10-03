package com.sensorsdata.analytics.android.sdk.core.business.visual;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.sensorsdata.analytics.android.sdk.R;
import com.sensorsdata.analytics.android.sdk.SensorsDataAPI;
import com.sensorsdata.analytics.android.sdk.core.mediator.Modules;
import com.sensorsdata.analytics.android.sdk.core.mediator.SAModuleManager;
import com.sensorsdata.analytics.android.sdk.dialog.SensorsDataDialogUtils;
import com.sensorsdata.analytics.android.sdk.util.SADisplayUtil;

/* JADX INFO: loaded from: classes10.dex */
public class SAVisualTools {
    private static boolean checkProjectIsValid(String str) {
        Uri uri;
        Uri uri2;
        String serverUrl = SensorsDataAPI.sharedInstance().getServerUrl();
        String queryParameter = null;
        String queryParameter2 = (TextUtils.isEmpty(str) || (uri2 = Uri.parse(str)) == null) ? null : uri2.getQueryParameter("project");
        if (!TextUtils.isEmpty(serverUrl) && (uri = Uri.parse(serverUrl)) != null) {
            queryParameter = uri.getQueryParameter("project");
        }
        return (TextUtils.isEmpty(queryParameter2) || TextUtils.isEmpty(queryParameter) || !TextUtils.equals(queryParameter2, queryParameter)) ? false : true;
    }

    public static void showOpenHeatMapDialog(Activity activity, String str, String str2) {
        if (!checkProjectIsValid(str2)) {
            SensorsDataDialogUtils.showDialog(activity, SADisplayUtil.getStringResource(activity, R.string.sensors_analytics_visual_dialog_error));
            return;
        }
        if (!SAModuleManager.getInstance().hasModuleByName(Modules.Visual.MODULE_NAME)) {
            SensorsDataDialogUtils.showDialog(activity, SADisplayUtil.getStringResource(activity, R.string.sensors_analytics_heatmap_sdk_fail));
            return;
        }
        if (!SensorsDataAPI.sharedInstance().isNetworkRequestEnable()) {
            SensorsDataDialogUtils.showDialog(activity, SADisplayUtil.getStringResource(activity, R.string.sensors_analytics_heatmap_network_fail));
        } else if (SensorsDataAPI.sharedInstance().isHeatMapEnabled()) {
            SAModuleManager.getInstance().invokeModuleFunction(Modules.Visual.MODULE_NAME, Modules.Visual.METHOD_SHOW_OPEN_HEATMAP_DIALOG, activity, str, str2);
        } else {
            SensorsDataDialogUtils.showDialog(activity, SADisplayUtil.getStringResource(activity, R.string.sensors_analytics_heatmap_sdk_fail));
        }
    }

    public static void showOpenVisualizedAutoTrackDialog(Activity activity, String str, String str2) {
        if (!checkProjectIsValid(str2)) {
            SensorsDataDialogUtils.showDialog(activity, SADisplayUtil.getStringResource(activity, R.string.sensors_analytics_visual_dialog_error));
            return;
        }
        if (!SAModuleManager.getInstance().hasModuleByName(Modules.Visual.MODULE_NAME)) {
            SensorsDataDialogUtils.showDialog(activity, SADisplayUtil.getStringResource(activity, R.string.sensors_analytics_visual_sdk_fail));
            return;
        }
        if (!SensorsDataAPI.sharedInstance().isNetworkRequestEnable()) {
            SensorsDataDialogUtils.showDialog(activity, SADisplayUtil.getStringResource(activity, R.string.sensors_analytics_visual_network_fail));
        } else if (SensorsDataAPI.sharedInstance().isVisualizedAutoTrackEnabled()) {
            SAModuleManager.getInstance().invokeModuleFunction(Modules.Visual.MODULE_NAME, Modules.Visual.METHOD_SHOW_OPEN_VISUALIZED_AUTOTRACK_DIALOG, activity, str, str2);
        } else {
            SensorsDataDialogUtils.showDialog(activity, SADisplayUtil.getStringResource(activity, R.string.sensors_analytics_visual_sdk_fail));
        }
    }

    public static void showPairingCodeInputDialog(Context context) {
        if (SAModuleManager.getInstance().hasModuleByName(Modules.Visual.MODULE_NAME)) {
            SAModuleManager.getInstance().invokeModuleFunction(Modules.Visual.MODULE_NAME, Modules.Visual.METHOD_SHOW_PAIRING_CODE_INPUTDIALOG, context);
        } else {
            SensorsDataDialogUtils.showDialog(context, SADisplayUtil.getStringResource(context, R.string.sensors_analytics_visual_heatmap_sdk_fail));
        }
    }
}
