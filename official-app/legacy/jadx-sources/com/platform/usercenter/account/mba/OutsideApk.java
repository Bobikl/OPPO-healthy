package com.platform.usercenter.account.mba;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.coui.appcompat.dialog.COUIAlertDialogBuilder;
import com.heytap.sports.service.BgConnect;
import com.platform.usercenter.basic.provider.UCCommonXor8Provider;
import com.platform.usercenter.bizuws.R;
import com.platform.usercenter.tools.ApkInfoHelper;
import com.platform.usercenter.tools.datastructure.StringUtil;
import com.platform.usercenter.tools.log.UCLogUtil;
import com.platform.usercenter.tools.os.Version;
import com.sensorsdata.analytics.android.autotrack.aop.SensorsDataAutoTrackHelper;
import com.sensorsdata.analytics.android.sdk.SensorsDataInstrumented;
import com.sensorsdata.analytics.android.sdk.aop.push.PushAutoTrackHelper;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class OutsideApk {
    public static final int ERR_CODE_CUSTOM_DIALOG = -4;
    public static final int ERR_CODE_DIALOG_CANCEL = -3;
    public static final int ERR_CODE_DIALOG_CONFIRM = -5;
    public static final int ERR_CODE_NOTIFY_SERVICE = -6;
    public static final int ERR_CODE_PACKAGE_NOT_EXIST = -2;
    private boolean isNotification;
    private Context mContext;
    private IDialogCallback mIDialogCallback;
    private IResultCallback mIResultCallback;
    private Icon mIcon;
    private String message;
    private String targetPackageName;
    private String title;
    private static final String[] PRE_APK_PAY_PKG_ARR = {UCCommonXor8Provider.getNormalStrByDecryptXOR8("kge&fmizem&i|di{"), UCCommonXor8Provider.getNormalStrByDecryptXOR8("kge&naf{`mdd&i|di{"), UCCommonXor8Provider.getNormalStrByDecryptXOR8("kge&gxd}{&xiq")};
    public static final Boolean B_NULL = null;

    @RequiresApi(api = 26)
    private void enableRelateApp() {
        Resources resources = this.mContext.getResources();
        String string = resources.getString(R.string.keyboard_position_disable_hint_setting);
        String string2 = resources.getString(android.R.string.cancel);
        IDialogCallback iDialogCallback = this.mIDialogCallback;
        if (iDialogCallback != null) {
            iDialogCallback.onDialog(this.title, this.message);
            this.mIResultCallback.onFail(-4, "");
            return;
        }
        if (!this.isNotification) {
            COUIAlertDialogBuilder cOUIAlertDialogBuilder = new COUIAlertDialogBuilder(this.mContext);
            cOUIAlertDialogBuilder.setCancelable(false);
            cOUIAlertDialogBuilder.setTitle(this.title);
            cOUIAlertDialogBuilder.setMessage(this.message);
            DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: com.platform.usercenter.account.mba.OutsideApk.1
                @Override // android.content.DialogInterface.OnClickListener
                @SensorsDataInstrumented
                public void onClick(DialogInterface dialogInterface, int i) {
                    OutsideApk.jumpApplicationDetailsSettings(OutsideApk.this.mContext, OutsideApk.this.targetPackageName);
                    OutsideApk.this.mIResultCallback.onFail(-5, "");
                    dialogInterface.dismiss();
                    SensorsDataAutoTrackHelper.trackDialog(dialogInterface, i);
                }
            };
            DialogInterface.OnClickListener onClickListener2 = new DialogInterface.OnClickListener() { // from class: com.platform.usercenter.account.mba.OutsideApk.2
                @Override // android.content.DialogInterface.OnClickListener
                @SensorsDataInstrumented
                public void onClick(DialogInterface dialogInterface, int i) {
                    dialogInterface.dismiss();
                    OutsideApk.this.mIResultCallback.onFail(-3, "");
                    SensorsDataAutoTrackHelper.trackDialog(dialogInterface, i);
                }
            };
            cOUIAlertDialogBuilder.setPositiveButton(string, onClickListener);
            cOUIAlertDialogBuilder.setNegativeButton(string2, onClickListener2);
            cOUIAlertDialogBuilder.create().show();
            return;
        }
        String str = this.title;
        NotificationManager notificationManager = (NotificationManager) this.mContext.getSystemService(BgConnect.KEY_NOTIFICATION);
        notificationManager.createNotificationChannel(new NotificationChannel("mba_force_enable_suggest_channel", str, 4));
        Intent intent = new Intent();
        intent.setClassName("com.android.settings", "com.android.settings.applications.InstalledAppDetailsTop");
        intent.addFlags(268435456);
        intent.setData(Uri.fromParts("package", this.targetPackageName, null));
        Context context = this.mContext;
        PushAutoTrackHelper.hookIntentGetActivity(context, 1, intent, 201326592);
        PendingIntent activity = PendingIntent.getActivity(context, 1, intent, 201326592);
        PushAutoTrackHelper.hookPendingIntentGetActivity(activity, context, 1, intent, 201326592);
        Notification notificationBuild = new Notification.Builder(this.mContext, "mba_force_enable_suggest_channel").setSmallIcon(this.mIcon).setContentTitle(this.title).setContentText(this.message).setWhen(System.currentTimeMillis()).setAutoCancel(true).setContentIntent(activity).build();
        notificationManager.notify(3001, notificationBuild);
        PushAutoTrackHelper.onNotify(notificationManager, 3001, notificationBuild);
        this.mIResultCallback.onFail(-6, "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean hasPackageName(Context context, String str) {
        try {
            context.getPackageManager().getPackageInfo(str, 0);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean isEnabled(Context context, String str) {
        Boolean boolIsPkgEnabled = isPkgEnabled(context, str);
        if (boolIsPkgEnabled != null) {
            return boolIsPkgEnabled.booleanValue();
        }
        return false;
    }

    public static boolean isPayPkgEnabled(Context context) {
        for (String str : PRE_APK_PAY_PKG_ARR) {
            if (hasPackageName(context, str)) {
                return isEnabled(context, str);
            }
        }
        return false;
    }

    @Nullable
    public static Boolean isPkgEnabled(Context context, String str) {
        if (!Version.hasR()) {
            return Boolean.TRUE;
        }
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(str, 512);
            if (applicationInfo != null) {
                return Boolean.valueOf(applicationInfo.enabled);
            }
        } catch (PackageManager.NameNotFoundException e2) {
            UCLogUtil.e(e2);
        }
        return B_NULL;
    }

    public static boolean isUserCenterPkgEnabled(Context context) {
        String ucPackage = ApkInfoHelper.getUcPackage(context);
        if (StringUtil.isEmpty(ucPackage)) {
            return false;
        }
        return isEnabled(context, ucPackage);
    }

    public static void jumpApplicationDetailsSettings(Context context, String str) {
        Intent intent = new Intent();
        intent.addFlags(268435456);
        intent.setClassName("com.android.settings", "com.android.settings.applications.InstalledAppDetails");
        intent.setData(Uri.fromParts("package", str, null));
        context.startActivity(intent);
    }

    public static String payPackageName(Context context) {
        for (String str : PRE_APK_PAY_PKG_ARR) {
            if (hasPackageName(context, str)) {
                return str;
            }
        }
        return null;
    }

    public static String userAcPackageName(Context context) {
        return ApkInfoHelper.getUcAcPackage(context);
    }

    public static String userCenterPackageName(Context context) {
        return ApkInfoHelper.getUcPackage(context);
    }

    public void launch() {
        if (!Version.hasR()) {
            this.mIResultCallback.onSuccess();
            return;
        }
        try {
            ApplicationInfo applicationInfo = this.mContext.getPackageManager().getApplicationInfo(this.targetPackageName, 512);
            if (applicationInfo != null) {
                if (applicationInfo.enabled) {
                    this.mIResultCallback.onSuccess();
                } else {
                    enableRelateApp();
                }
            }
        } catch (PackageManager.NameNotFoundException e2) {
            UCLogUtil.e(e2);
            this.mIResultCallback.onFail(-2, "");
        }
    }

    private OutsideApk() {
    }

    public static class Builder {
        private String appName;
        private String funcName;
        private boolean isNotification;
        private Context mContext;
        private IDialogCallback mIDialogCallback;
        private IResultCallback mIResultCallback;
        private Icon mIcon;
        private String message;
        private String targetPackageName;
        private String title;
        private List<String> whiteListPkg = new ArrayList();

        public Builder(Context context) {
            this.mContext = context;
        }

        private void buildExt() {
            Resources resources = this.mContext.getResources();
            if (TextUtils.isEmpty(this.title)) {
                if (TextUtils.isEmpty(this.appName)) {
                    PackageManager packageManager = this.mContext.getPackageManager();
                    try {
                        this.appName = ((Object) packageManager.getApplicationLabel(packageManager.getApplicationInfo(this.targetPackageName, 512))) + "";
                    } catch (PackageManager.NameNotFoundException e2) {
                        throw new IllegalArgumentException(e2);
                    }
                }
                if (!TextUtils.isEmpty(this.appName)) {
                    this.title = resources.getString(this.isNotification ? R.string.mba_force_enable_notification_suggest_open_title : R.string.dialog_app_forbidden_title, this.appName);
                }
            }
            if (!TextUtils.isEmpty(this.message) || TextUtils.isEmpty(this.funcName) || TextUtils.isEmpty(this.appName)) {
                return;
            }
            this.message = resources.getString(R.string.dialog_app_forbidden_detail, this.appName, this.funcName);
        }

        public OutsideApk build() {
            if (this.mIResultCallback == null) {
                throw new IllegalArgumentException("IResultCallback is null");
            }
            if (TextUtils.isEmpty(this.targetPackageName)) {
                throw new IllegalArgumentException("err,packageName = null");
            }
            buildExt();
            if (this.mIDialogCallback == null && (TextUtils.isEmpty(this.title) || TextUtils.isEmpty(this.message))) {
                throw new IllegalArgumentException("err,title = null or message = null");
            }
            OutsideApk outsideApk = new OutsideApk();
            outsideApk.mContext = this.mContext;
            outsideApk.mIResultCallback = this.mIResultCallback;
            outsideApk.mIDialogCallback = this.mIDialogCallback;
            outsideApk.targetPackageName = this.targetPackageName;
            outsideApk.title = this.title;
            outsideApk.message = this.message;
            outsideApk.mIcon = this.mIcon;
            outsideApk.isNotification = this.isNotification;
            return outsideApk;
        }

        public Builder dialogCallback(IDialogCallback iDialogCallback) {
            this.mIDialogCallback = iDialogCallback;
            return this;
        }

        public Builder forceEnabled(String[] strArr) {
            if (strArr != null) {
                if (strArr.length > 1) {
                    for (String str : strArr) {
                        if (OutsideApk.hasPackageName(this.mContext, str)) {
                            this.targetPackageName = str;
                            return this;
                        }
                    }
                } else {
                    this.targetPackageName = strArr[0];
                }
            }
            return this;
        }

        public Builder forcePayEnabled() {
            String strPayPackageName = OutsideApk.payPackageName(this.mContext);
            if (!TextUtils.isEmpty(strPayPackageName)) {
                this.targetPackageName = strPayPackageName;
            }
            return this;
        }

        public Builder forceUserCenterEnabled() {
            String strUserCenterPackageName = OutsideApk.userCenterPackageName(this.mContext);
            if (!TextUtils.isEmpty(strUserCenterPackageName)) {
                this.targetPackageName = strUserCenterPackageName;
            }
            return this;
        }

        public Builder resultCallback(IResultCallback iResultCallback) {
            this.mIResultCallback = iResultCallback;
            return this;
        }

        public Builder setAppName(String str) {
            this.appName = str;
            return this;
        }

        public Builder setFuncName(String str) {
            this.funcName = str;
            return this;
        }

        public Builder setIcon(Icon icon) {
            this.mIcon = icon;
            return this;
        }

        public Builder setMessage(String str) {
            this.message = str;
            return this;
        }

        @Deprecated
        public Builder setNotification(boolean z) {
            this.isNotification = z;
            return this;
        }

        public Builder setTitle(String str) {
            this.title = str;
            return this;
        }

        public Builder whitePackageName(String... strArr) {
            this.whiteListPkg.addAll(Arrays.asList(strArr));
            return this;
        }

        public Builder forceEnabled(String str) {
            this.targetPackageName = str;
            return this;
        }
    }
}
