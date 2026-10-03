package com.sensorsdata.analytics.android.sdk.visual.view;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import androidx.core.internal.view.SupportMenu;
import com.sensorsdata.analytics.android.sdk.R;
import com.sensorsdata.analytics.android.sdk.SALog;
import com.sensorsdata.analytics.android.sdk.dialog.SensorsDataDialogUtils;
import com.sensorsdata.analytics.android.sdk.util.NetworkUtils;
import com.sensorsdata.analytics.android.sdk.util.SADisplayUtil;
import com.sensorsdata.analytics.android.sdk.visual.HeatMapService;
import com.sensorsdata.analytics.android.sdk.visual.VisualizedAutoTrackService;

/* JADX INFO: loaded from: classes10.dex */
public class VisualDialog {
    public static void showOpenHeatMapDialog(final Activity activity, final String str, final String str2) {
        boolean zEquals;
        try {
            zEquals = "WIFI".equals(NetworkUtils.networkType(activity));
        } catch (Exception e2) {
            SALog.printStackTrace(e2);
            zEquals = false;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        builder.setTitle(SADisplayUtil.getStringResource(activity, R.string.sensors_analytics_common_title));
        if (zEquals) {
            builder.setMessage(SADisplayUtil.getStringResource(activity, com.sensorsdata.analytics.android.sdk.visual.R.string.sensors_analytics_heatmap_wifi_name));
        } else {
            builder.setMessage(SADisplayUtil.getStringResource(activity, com.sensorsdata.analytics.android.sdk.visual.R.string.sensors_analytics_heatmap_mobile_name));
        }
        builder.setCancelable(false);
        builder.setNegativeButton(SADisplayUtil.getStringResource(activity, R.string.sensors_analytics_common_cancel), new DialogInterface.OnClickListener() { // from class: com.sensorsdata.analytics.android.sdk.visual.view.VisualDialog.1
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                SensorsDataDialogUtils.startLaunchActivity(activity);
            }
        });
        builder.setPositiveButton(SADisplayUtil.getStringResource(activity, R.string.sensors_analytics_common_continue), new DialogInterface.OnClickListener() { // from class: com.sensorsdata.analytics.android.sdk.visual.view.VisualDialog.2
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                HeatMapService.getInstance().start(activity, str, str2);
                SensorsDataDialogUtils.startLaunchActivity(activity);
            }
        });
        AlertDialog alertDialogCreate = builder.create();
        SensorsDataDialogUtils.dialogShowDismissOld(alertDialogCreate);
        try {
            alertDialogCreate.getButton(-2).setTextColor(-16777216);
            alertDialogCreate.getButton(-2).setBackgroundColor(-1);
            alertDialogCreate.getButton(-1).setTextColor(SupportMenu.CATEGORY_MASK);
            alertDialogCreate.getButton(-1).setBackgroundColor(-1);
            alertDialogCreate.getButton(-2).setBackground(SensorsDataDialogUtils.getDrawable());
            alertDialogCreate.getButton(-1).setBackground(SensorsDataDialogUtils.getDrawable());
        } catch (Exception e3) {
            SALog.printStackTrace(e3);
        }
    }

    public static void showOpenVisualizedAutoTrackDialog(final Activity activity, final String str, final String str2) {
        boolean zEquals;
        try {
            zEquals = "WIFI".equals(NetworkUtils.networkType(activity));
        } catch (Exception unused) {
            zEquals = false;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        builder.setTitle(SADisplayUtil.getStringResource(activity, R.string.sensors_analytics_common_title));
        if (zEquals) {
            builder.setMessage(SADisplayUtil.getStringResource(activity, com.sensorsdata.analytics.android.sdk.visual.R.string.sensors_analytics_visual_wifi_name));
        } else {
            builder.setMessage(SADisplayUtil.getStringResource(activity, com.sensorsdata.analytics.android.sdk.visual.R.string.sensors_analytics_visual_mobile_name));
        }
        builder.setCancelable(false);
        builder.setNegativeButton(SADisplayUtil.getStringResource(activity, R.string.sensors_analytics_common_cancel), new DialogInterface.OnClickListener() { // from class: com.sensorsdata.analytics.android.sdk.visual.view.VisualDialog.3
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                SensorsDataDialogUtils.startLaunchActivity(activity);
            }
        });
        builder.setPositiveButton(SADisplayUtil.getStringResource(activity, R.string.sensors_analytics_common_continue), new DialogInterface.OnClickListener() { // from class: com.sensorsdata.analytics.android.sdk.visual.view.VisualDialog.4
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                VisualizedAutoTrackService.getInstance().start(activity, str, str2);
                SensorsDataDialogUtils.startLaunchActivity(activity);
            }
        });
        AlertDialog alertDialogCreate = builder.create();
        SensorsDataDialogUtils.dialogShowDismissOld(alertDialogCreate);
        try {
            alertDialogCreate.getButton(-2).setTextColor(-16777216);
            alertDialogCreate.getButton(-2).setBackgroundColor(-1);
            alertDialogCreate.getButton(-1).setTextColor(SupportMenu.CATEGORY_MASK);
            alertDialogCreate.getButton(-1).setBackgroundColor(-1);
            alertDialogCreate.getButton(-2).setBackground(SensorsDataDialogUtils.getDrawable());
            alertDialogCreate.getButton(-1).setBackground(SensorsDataDialogUtils.getDrawable());
        } catch (Exception e2) {
            SALog.printStackTrace(e2);
        }
    }
}
