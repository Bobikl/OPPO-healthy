package com.oplus.aiunit.vision;

import android.content.Context;
import android.content.Intent;
import com.heytap.databaseengine.model.ECGRecord;

/* JADX INFO: loaded from: classes15.dex */
public class w62 {
    public static void a(Context context, Intent intent) {
        v62.b(context, intent);
    }

    public static void b(Context context, int i, int i2) {
        if (i == 0) {
            m(context, i2);
        }
    }

    public static void c(Context context, int i, int i2) {
        if (i == 0) {
            n(context, i2);
        }
    }

    public static void d(Context context) {
        cj4.c("BroadcastUtil", "sendCalculateBroadcast");
        Intent intent = new Intent("com.heytap.health.action_sync_calculate");
        intent.setPackage(context.getPackageName());
        a(context, intent);
    }

    public static void e(Context context, int i) {
        f(context, i, null);
    }

    public static void f(Context context, int i, String str) {
        cj4.c("BroadcastUtil", "sendDataRefreshBroadcast refreshType = " + i + ", ssoid = " + str);
        Intent intent = new Intent("com.heytap.health.action_data_refresh");
        intent.setPackage(context.getPackageName());
        intent.putExtra("refresh_type", i);
        if (str != null) {
            intent.putExtra("extra_ssoid", str);
        }
        a(context, intent);
    }

    public static void g(Context context) {
        cj4.c("BroadcastUtil", "sendHealthArchiveRecordDataBroadcast have  data change");
        String packageName = context.getPackageName();
        Intent intent = new Intent("com.heytap.health.action_health_archive_data_change");
        intent.setPackage(packageName);
        a(context, intent);
    }

    public static void h(Context context) {
        cj4.c("BroadcastUtil", "sendHealthDiseaseRiskBroadcast have  data change");
        String packageName = context.getPackageName();
        Intent intent = new Intent("com.heytap.health.action_health_disease_risk_change");
        intent.setPackage(packageName);
        a(context, intent);
    }

    public static void i(Context context) {
        cj4.c("BroadcastUtil", "sendHealthIndicatorDataBroadcast have  data change");
        String packageName = context.getPackageName();
        Intent intent = new Intent("com.heytap.health.action_health_indicator_data_change");
        intent.setPackage(packageName);
        a(context, intent);
    }

    public static void j(Context context) {
        cj4.c("BroadcastUtil", "sendHealthIndicatorFocusBroadcast have  data change");
        String packageName = context.getPackageName();
        Intent intent = new Intent("com.heytap.health.action_health_indicator_focus_change");
        intent.setPackage(packageName);
        a(context, intent);
    }

    public static void k(Context context) {
        cj4.c("BroadcastUtil", "sendHealthIndicatorStatBroadcast have  data change");
        String packageName = context.getPackageName();
        Intent intent = new Intent("com.heytap.health.action_health_indicator_stat_change");
        intent.setPackage(packageName);
        a(context, intent);
    }

    public static void l(Context context) {
        cj4.c("BroadcastUtil", "sendHealthReviewPlanBroadcast have  data change");
        String packageName = context.getPackageName();
        Intent intent = new Intent("com.heytap.health.action_health_review_plan_change");
        intent.setPackage(packageName);
        a(context, intent);
    }

    public static void m(Context context, int i) {
        cj4.c("BroadcastUtil", "sendManualSyncFailBroadcast syncType = " + i);
        String packageName = context.getPackageName();
        Intent intent = new Intent("com.heytap.health.action_sync_manual_sync_data_fail");
        intent.putExtra(rjj.SYNC_TYPE, i);
        intent.setPackage(packageName);
        a(context, intent);
    }

    public static void n(Context context, int i) {
        cj4.c("BroadcastUtil", "sendManualSyncDataSuccessBroadcast syncType = " + i);
        String packageName = context.getPackageName();
        Intent intent = new Intent("com.heytap.health.action_sync_manual_sync_data_success");
        intent.putExtra(rjj.SYNC_TYPE, i);
        intent.setPackage(packageName);
        a(context, intent);
    }

    public static void o(Context context, String str, String str2) {
        cj4.c("BroadcastUtil", "sendStaminaPara2DeviceBroadcast");
        String packageName = context.getPackageName();
        Intent intent = new Intent("com.heytap.health.action_send_stamina_para_2_device");
        intent.putExtra("USER_STAMINA_PARA_EXTRA", str);
        intent.putExtra("USER_STAMINA_PARA_COURIER", str2);
        intent.setPackage(packageName);
        a(context, intent);
    }

    public static void p(Context context, int i, ECGRecord eCGRecord, String str) {
        cj4.c("BroadcastUtil", "sendSyncEcgRecordDataBroadcast ecg data change > " + i + ", ssoId = " + str);
        String packageName = context.getPackageName();
        Intent intent = new Intent("com.heytap.health.action_sync_ecg_record_data");
        intent.putExtra("DATA_CHANGE_ACTION", i);
        intent.putExtra("DATA_CHANGE_DATA", eCGRecord);
        if (str != null) {
            intent.putExtra("extra_ssoid", str);
        }
        intent.setPackage(packageName);
        a(context, intent);
    }

    public static void q(Context context, String str) {
        cj4.c("BroadcastUtil", "sendSyncEcgRecordDataBroadcast have cload data update, ssoId = " + str);
        String packageName = context.getPackageName();
        Intent intent = new Intent("com.heytap.health.action_sync_ecg_record_data");
        if (str != null) {
            intent.putExtra("extra_ssoid", str);
        }
        intent.setPackage(packageName);
        a(context, intent);
    }

    public static void r(Context context) {
        cj4.c("BroadcastUtil", "sendSyncFailedBroadcast");
        Intent intent = new Intent("com.heytap.health.action_sync");
        intent.setPackage(context.getPackageName());
        intent.putExtra("com.heytap.health.action_sync_status", 3);
        a(context, intent);
    }

    public static void s(Context context) {
        cj4.c("BroadcastUtil", "sendSyncOneTimeSportDataBroadcast");
        String packageName = context.getPackageName();
        Intent intent = new Intent("com.heytap.health.action_sync_fit_record_data");
        intent.setPackage(packageName);
        a(context, intent);
    }

    public static void t(Context context, double d) {
        cj4.c("BroadcastUtil", "sendSyncProcessBroadcast process is " + d);
        Intent intent = new Intent("com.heytap.health.action_sync");
        intent.setPackage(context.getPackageName());
        intent.putExtra("com.heytap.health.action_sync_status", 1);
        intent.putExtra("com.heytap.health.action_sync_process", d);
        a(context, intent);
    }

    public static void u(Context context) {
        cj4.c("BroadcastUtil", "sendSyncTotalSportDataBroadcast");
        String packageName = context.getPackageName();
        Intent intent = new Intent("com.heytap.health.action_sync_total_sport_data");
        intent.setPackage(packageName);
        a(context, intent);
    }

    public static void v(Context context, int i, String str) {
        cj4.c("BroadcastUtil", "sendUserGoalInfo2DeviceBroadcast goal type > " + i);
        String packageName = context.getPackageName();
        Intent intent = new Intent("com.heytap.health.action_send_user_goal_info_2_device");
        intent.putExtra("USER_GOAL_INFO_TYPE", i);
        intent.putExtra("USER_GOAL_INFO_VALUE", str);
        intent.setPackage(packageName);
        a(context, intent);
    }

    public static void w(Context context, String str) {
        cj4.c("BroadcastUtil", "sendUserInfo2DeviceBroadcast");
        String packageName = context.getPackageName();
        Intent intent = new Intent("com.heytap.health.action_send_user_info_2_device");
        intent.putExtra("USER_INFO_VALUE", str);
        intent.setPackage(packageName);
        a(context, intent);
    }

    public static void x(Context context) {
        cj4.c("BroadcastUtil", "sendUserInfoUpdateBroadcast");
        String packageName = context.getPackageName();
        Intent intent = new Intent("com.heytap.health.action_send_user_info_update");
        intent.setPackage(packageName);
        a(context, intent);
    }

    public static void y(Context context, String str) {
        cj4.c("BroadcastUtil", "sendUserPreferenceBroadcast key = " + str);
        Intent intent = new Intent("com.heytap.health.user_preference");
        intent.setPackage(context.getPackageName());
        intent.putExtra("user_preference_key", str);
        a(context, intent);
    }
}
