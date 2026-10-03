package com.heytap.store.base.core.util;

import android.content.Context;
import androidx.core.app.NotificationManagerCompat;
import com.heytap.store.platform.tools.ContextGetterUtils;
import com.oplus.aiunit.vision.bed;
import com.oplus.aiunit.vision.cdd;
import com.oplus.aiunit.vision.cv5;
import com.oplus.aiunit.vision.dcd;
import com.oplus.aiunit.vision.e30;
import com.oplus.aiunit.vision.ifg;
import com.oplus.aiunit.vision.kbd;

/* JADX INFO: loaded from: classes3.dex */
public class FirstInNotifyUtil {
    public static String APP_SHOW_NOTIFY = "app_show_notify";
    public static String APP_SHOW_NOTIFY_LOGIN = "app_show_notify_login";
    public static String APP_VERSION_CODE = "app_version_code";

    public static void goToSettings(Context context) {
        GotoSettingsUtil.goToSettings(context);
    }

    public static void isNeedShowNotify(final bed<Boolean> bedVar) {
        kbd.c(new cdd<Boolean>() { // from class: com.heytap.store.base.core.util.FirstInNotifyUtil.3
            @Override // com.oplus.aiunit.vision.cdd
            public void subscribe(dcd<Boolean> dcdVar) throws Exception {
                ContextGetterUtils contextGetterUtils = ContextGetterUtils.INSTANCE;
                if (!(DeviceInfoUtil.getVersionCode(contextGetterUtils.getApp()) > SpUtil.getInt(FirstInNotifyUtil.APP_VERSION_CODE, 0)) || SpUtil.getBoolean(FirstInNotifyUtil.APP_SHOW_NOTIFY, false) || FirstInNotifyUtil.isNotificationEnabled(contextGetterUtils.getApp())) {
                    return;
                }
                dcdVar.onNext(Boolean.TRUE);
            }
        }).B(ifg.b()).r(e30.a()).subscribe(new bed<Boolean>() { // from class: com.heytap.store.base.core.util.FirstInNotifyUtil.2
            @Override // com.oplus.aiunit.vision.bed
            public void onComplete() {
            }

            @Override // com.oplus.aiunit.vision.bed
            public void onError(Throwable th) {
            }

            @Override // com.oplus.aiunit.vision.bed
            public void onSubscribe(cv5 cv5Var) {
            }

            @Override // com.oplus.aiunit.vision.bed
            public void onNext(Boolean bool) {
                FirstInNotifyUtil.saveShowNotifyStatus(true);
                FirstInNotifyUtil.saveVersion(ContextGetterUtils.INSTANCE.getApp());
                bedVar.onNext(bool);
            }
        });
    }

    public static boolean isNotificationEnabled(Context context) {
        return NotificationManagerCompat.from(context).areNotificationsEnabled();
    }

    public static void saveShowNotifyStatuLogin(boolean z) {
        SpUtil.putBooleanOnBackground(APP_SHOW_NOTIFY_LOGIN, z);
    }

    public static void saveShowNotifyStatus(boolean z) {
        SpUtil.putBooleanOnBackground(APP_SHOW_NOTIFY, z);
    }

    public static void saveVersion(Context context) {
        final int versionCode = DeviceInfoUtil.getVersionCode(context);
        SpUtil.getIntAsync(APP_VERSION_CODE, 0, new SpUtil.SpResultSubscriber<Integer>() { // from class: com.heytap.store.base.core.util.FirstInNotifyUtil.1
            @Override // com.heytap.store.base.core.util.SpUtil.SpResultSubscriber
            public void onSuccess(Integer num) {
                if (versionCode != num.intValue()) {
                    SpUtil.pubIntegerOnBackground(FirstInNotifyUtil.APP_VERSION_CODE, versionCode);
                }
            }
        });
    }
}
