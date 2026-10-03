package com.heytap.usercenter.accountsdk.helper;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Messenger;
import com.accountbase.b;
import com.heytap.usercenter.accountsdk.AppInfo;
import com.heytap.usercenter.accountsdk.model.AccountEntity;
import com.heytap.usercenter.accountsdk.tools.UCStatisticsHelper;
import com.heytap.usercenter.accountsdk.utils.UCAccountXor8Provider;
import com.platform.usercenter.basic.annotation.Keep;
import com.platform.usercenter.basic.provider.UCCommonXor8Provider;
import com.platform.usercenter.tools.ApkInfoHelper;
import com.platform.usercenter.tools.json.JsonUtil;
import com.platform.usercenter.tools.log.UCLogUtil;

/* JADX INFO: loaded from: classes19.dex */
@Keep
public final class AccountHelper {
    public static final String OP_ACCOUNT_PACKAGE_NAME_XOR8 = "kge&gfmxd}{&ikkg}f|";
    private static final String TAG = "AccountHelper";

    private AccountHelper() {
    }

    public static AccountEntity getAccountEntity(Context context) {
        return b.a(context);
    }

    public static AppInfo getAppInfo(Context context, String str) {
        AppInfo appInfo = new AppInfo();
        appInfo.packageName = context.getPackageName();
        appInfo.appVersion = ApkInfoHelper.getVersionCode(context, context.getPackageName());
        appInfo.bizTraceId = str;
        return appInfo;
    }

    public static int getUCServiceVersionCode(Context context) {
        return ApkInfoHelper.getVersionCode(context, UCCommonXor8Provider.getUCServicePackageName());
    }

    public static Intent getUserCenterIntent(Context context) {
        Intent intent = new Intent(UCAccountXor8Provider.getProviderUsercenterFirstinXor8());
        intent.putExtra(Constants.EXTRA_NAME_ACTION_APPINFO, JsonUtil.toJson(getAppInfo(context.getApplicationContext(), "")));
        intent.setFlags(536870912);
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        return intent;
    }

    public static String getUserCenterPackage(Context context) {
        String str = Constants.PACKAGE_NAME_NEW_ACCOUNT;
        if (ApkInfoHelper.hasAPK(context, str)) {
            return str;
        }
        if (ApkInfoHelper.hasAPK(context, UCCommonXor8Provider.getPkgnameUcHtXor8())) {
            return UCCommonXor8Provider.getPkgnameUcHtXor8();
        }
        String str2 = Constants.PACKAGE_NAME_OPUSERCENTER;
        if (ApkInfoHelper.hasAPK(context, str2)) {
            return str2;
        }
        if (ApkInfoHelper.hasAPK(context, UCCommonXor8Provider.getNormalStrByDecryptXOR8(OP_ACCOUNT_PACKAGE_NAME_XOR8))) {
            return UCCommonXor8Provider.getNormalStrByDecryptXOR8(OP_ACCOUNT_PACKAGE_NAME_XOR8);
        }
        String str3 = Constants.PACKAGE_NAME_NEW_USERCENTER;
        if (ApkInfoHelper.hasAPK(context, str3)) {
            return str3;
        }
        String str4 = Constants.PACKAGE_NAME_OPS_ACCOUNT;
        return ApkInfoHelper.hasAPK(context, str4) ? str4 : UCCommonXor8Provider.getUCPackageName();
    }

    public static int getUserCenterVersionCode(Context context) {
        int versionCode = ApkInfoHelper.getVersionCode(context, Constants.PACKAGE_NAME_NEW_ACCOUNT);
        if (versionCode > 0) {
            return versionCode;
        }
        int versionCode2 = ApkInfoHelper.getVersionCode(context, UCCommonXor8Provider.getPkgnameUcHtXor8());
        if (versionCode2 > 0) {
            return versionCode2;
        }
        int versionCode3 = ApkInfoHelper.getVersionCode(context, Constants.PACKAGE_NAME_OPUSERCENTER);
        if (versionCode3 > 0) {
            return versionCode3;
        }
        int versionCode4 = ApkInfoHelper.getVersionCode(context, Constants.PACKAGE_NAME_NEW_USERCENTER);
        if (versionCode4 > 0) {
            return versionCode4;
        }
        int versionCode5 = ApkInfoHelper.getVersionCode(context, Constants.PACKAGE_NAME_OPS_ACCOUNT);
        return versionCode5 > 0 ? versionCode5 : ApkInfoHelper.getVersionCode(context, UCCommonXor8Provider.getUCPackageName());
    }

    public static boolean isNewAccountPackage(Context context) {
        return ApkInfoHelper.hasAPK(context, Constants.PACKAGE_NAME_NEW_ACCOUNT);
    }

    public static boolean isOPSAccountPackage(Context context) {
        return ApkInfoHelper.hasAPK(context, Constants.PACKAGE_NAME_OPS_ACCOUNT);
    }

    public static void setPackage(Context context, Intent intent) {
        String str = Constants.PACKAGE_NAME_NEW_ACCOUNT;
        if (ApkInfoHelper.hasAPK(context, str)) {
            intent.setPackage(str);
            return;
        }
        if (ApkInfoHelper.hasAPK(context, UCCommonXor8Provider.getPkgnameUcHtXor8())) {
            intent.setPackage(UCCommonXor8Provider.getPkgnameUcHtXor8());
            return;
        }
        String str2 = Constants.PACKAGE_NAME_OPUSERCENTER;
        if (ApkInfoHelper.hasAPK(context, str2)) {
            intent.setPackage(str2);
            return;
        }
        if (ApkInfoHelper.hasAPK(context, UCCommonXor8Provider.getNormalStrByDecryptXOR8(OP_ACCOUNT_PACKAGE_NAME_XOR8))) {
            intent.setPackage(UCCommonXor8Provider.getNormalStrByDecryptXOR8(OP_ACCOUNT_PACKAGE_NAME_XOR8));
            return;
        }
        String str3 = Constants.PACKAGE_NAME_NEW_USERCENTER;
        if (ApkInfoHelper.hasAPK(context, str3)) {
            intent.setPackage(str3);
            return;
        }
        String str4 = Constants.PACKAGE_NAME_OPS_ACCOUNT;
        if (ApkInfoHelper.hasAPK(context, str4)) {
            intent.setPackage(str4);
        } else {
            intent.setPackage(UCCommonXor8Provider.getUCPackageName());
        }
    }

    public static void startBindInfoPage(Context context, Handler handler, String str) {
        Intent intent = new Intent(UCAccountXor8Provider.getProviderUsercenterBindPageXor8());
        intent.putExtra(UCAccountXor8Provider.getExtraRequestBindMessengerName(), new Messenger(handler));
        intent.putExtra(Constants.EXTRA_NAME_ACTION_APPINFO, JsonUtil.toJson(getAppInfo(context, str)));
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        setPackage(context, intent);
        if (context.getPackageManager().resolveActivity(intent, 65536) != null) {
            context.startActivity(intent);
        }
    }

    public static boolean startModifyAccountNameActivity(Activity activity, String str) {
        Intent intent = new Intent(UCAccountXor8Provider.getProviderUsercenterModifyAccountnameXor8());
        AppInfo appInfo = getAppInfo(activity, str);
        setPackage(activity, intent);
        intent.putExtra(Constants.EXTRA_NAME_ACTION_APPINFO, JsonUtil.toJson(appInfo));
        try {
            activity.startActivityForResult(intent, Constants.REQUEST_CODE_MODIFY_ACCOUNTNAME);
            return true;
        } catch (Exception e2) {
            UCLogUtil.e(TAG, e2.toString());
            return false;
        }
    }

    @Deprecated
    public static void startReqAutoLoginService(Context context, String str) {
        Intent intent = new Intent(UCAccountXor8Provider.getProviderUsercenterAutologinServiceXor8());
        intent.putExtra(Constants.EXTRA_NAME_ACTION_APPINFO, JsonUtil.toJson(getAppInfo(context, str)));
        setPackage(context, intent);
        if (context.getPackageManager().resolveService(intent, 65536) != null) {
            context.startService(intent);
        }
    }

    public static void startReqSignInActivity(Context context, String str, boolean z) {
        Intent intent = new Intent(UCAccountXor8Provider.getProviderIntfUsercenterOpenContainerActivityXor8());
        intent.putExtra(Constants.EXTRA_NAME_ACTION_APPINFO, JsonUtil.toJson(getAppInfo(context, str)));
        intent.putExtra(Constants.EXTRA_NAME_REQUEST_TYPE, 48059);
        intent.putExtra("is_show_login_page", z);
        intent.setFlags(536870912);
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        setPackage(context, intent);
        if (context.getPackageManager().resolveActivity(intent, 65536) != null) {
            context.startActivity(intent);
        }
    }

    public static void startReqSwitchAccountActivity(Context context, String str) {
        Intent intent = new Intent(UCAccountXor8Provider.getProviderIntfUsercenterOpenContainerActivityXor8());
        intent.putExtra(Constants.EXTRA_NAME_ACTION_APPINFO, JsonUtil.toJson(getAppInfo(context, str)));
        intent.putExtra(Constants.EXTRA_NAME_REQUEST_TYPE, Constants.REQUSET_TYPE_REQSWITCH_ACCOUNT);
        intent.setFlags(536870912);
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        setPackage(context, intent);
        if (context.getPackageManager().resolveActivity(intent, 65536) != null) {
            context.startActivity(intent);
        }
    }

    public static void startReqTokenActivity(Context context, String str, boolean z, boolean z2) {
        Intent intent = new Intent(UCAccountXor8Provider.getProviderIntfUsercenterOpenContainerActivityXor8());
        intent.putExtra(Constants.EXTRA_NAME_ACTION_APPINFO, JsonUtil.toJson(getAppInfo(context, str)));
        intent.putExtra(Constants.EXTRA_NAME_REQUEST_TYPE, Constants.REQUSET_TYPE_REQTOKEN);
        intent.putExtra(Constants.EXTRA_NAME_ACTION_AUTO_LOGIN, z);
        intent.putExtra("is_show_login_page", z2);
        intent.putExtra(Constants.EXTRA_NAME_USERCENTER_PLUGIN_NAME, 1002);
        intent.setFlags(536870912);
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        setPackage(context, intent);
        if (context.getPackageManager().resolveActivity(intent, 65536) != null) {
            context.startActivity(intent);
        }
        new UCStatisticsHelper.StatBuilder().logTag("login_half").eventId("different_points_click").putInfo("type", "click").statistics();
    }
}
