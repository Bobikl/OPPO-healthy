package com.heytap.usercenter.accountsdk;

import android.content.Context;
import android.os.Handler;
import com.accountbase.e;
import com.heytap.service.accountsdk.IStatistics;
import com.heytap.usercenter.accountsdk.http.AccountNameTask;
import com.heytap.usercenter.accountsdk.model.AccountEntity;
import com.heytap.usercenter.accountsdk.model.SignInAccount;
import com.nearme.aidl.UserEntity;
import com.platform.usercenter.BaseApp;
import com.platform.usercenter.basic.annotation.Keep;
import com.platform.usercenter.tools.env.IEnvConstant;

/* JADX INFO: loaded from: classes19.dex */
@Keep
public class AccountAgent {
    private static AccountAgentInterface mAgentDelegate = new AccountAgentWrapper();
    private static AccountAgentInterface mGuestDelegate = new e();

    @Deprecated
    public static void config(AccountSDKConfig.Builder builder) {
        AccountSDKConfig.sEnv = builder.env;
        AccountSDKConfig.ENV env = AccountSDKConfig.ENV.ENV_RELEASE;
    }

    public static AccountEntity getAccountEntity(Context context, String str) {
        initContextIfNeeded(context);
        return isGuest(context) ? mGuestDelegate.getAccountEntity(context, str) : mAgentDelegate.getAccountEntity(context, str);
    }

    @Deprecated
    public static String getAccountName(Context context, String str) {
        initContextIfNeeded(context);
        return isGuest(context) ? mGuestDelegate.getAccountName(context, str) : mAgentDelegate.getAccountName(context, str);
    }

    public static AccountResult getAccountResult(Context context, String str) {
        initContextIfNeeded(context);
        return isGuest(context) ? mGuestDelegate.getAccountResult(context, str) : mAgentDelegate.getAccountResult(context, str);
    }

    public static void getSignInAccount(Context context, String str, AccountNameTask.onReqAccountCallback<SignInAccount> onreqaccountcallback) {
        initContextIfNeeded(context);
        if (isGuest(context)) {
            mGuestDelegate.getSignInAccount(context, str, onreqaccountcallback);
        } else {
            mAgentDelegate.getSignInAccount(context, str, onreqaccountcallback);
        }
    }

    public static String getToken(Context context, String str) {
        initContextIfNeeded(context);
        return isGuest(context) ? mGuestDelegate.getToken(context, str) : mAgentDelegate.getToken(context, str);
    }

    @Deprecated
    public static String getUserName(Context context, String str) {
        initContextIfNeeded(context);
        return isGuest(context) ? mGuestDelegate.getUserName(context, str) : mAgentDelegate.getUserName(context, str);
    }

    private static void initAccountAgent(AccountAgentInterface accountAgentInterface) {
        mAgentDelegate = accountAgentInterface;
    }

    private static void initContextIfNeeded(Context context) {
        if (BaseApp.mContext == null) {
            BaseApp.init(context);
        }
    }

    public static boolean isGuest(Context context) {
        AccountSDKConfig config = AccountAgentClient.get().getConfig();
        return config != null && config.isShowGuest;
    }

    public static boolean isLogin(Context context, String str) {
        initContextIfNeeded(context);
        if (isGuest(context)) {
            return false;
        }
        return mAgentDelegate.isLogin(context, str);
    }

    public static boolean isSupportAccountCountry(Context context) {
        initContextIfNeeded(context);
        return isGuest(context) ? mGuestDelegate.isSupportAccountCountry(context) : mAgentDelegate.isSupportAccountCountry(context);
    }

    public static boolean isVersionUpV320(Context context) {
        initContextIfNeeded(context);
        return mAgentDelegate.isVersionUpV320(context);
    }

    public static void register(Context context, AccountAgentInterface accountAgentInterface) {
        register(context, accountAgentInterface, null);
    }

    public static String reqAccountCountry(Context context) {
        initContextIfNeeded(context);
        return isGuest(context) ? mGuestDelegate.reqAccountCountry(context) : mAgentDelegate.reqAccountCountry(context);
    }

    public static void reqLogout(Context context, String str) {
        initContextIfNeeded(context);
        if (isGuest(context)) {
            mGuestDelegate.reqLogout(context, str);
        } else {
            mAgentDelegate.reqLogout(context, str);
        }
    }

    public static void reqReSignin(Context context, Handler handler, String str) {
        initContextIfNeeded(context);
        if (isGuest(context)) {
            mGuestDelegate.reqReSignin(context, handler, str);
        } else {
            mAgentDelegate.reqReSignin(context, handler, str);
        }
    }

    public static void reqSignInAccount(Context context, String str, AccountNameTask.onReqAccountCallback<SignInAccount> onreqaccountcallback) {
        initContextIfNeeded(context);
        if (isGuest(context)) {
            mGuestDelegate.reqSignInAccount(context, str, onreqaccountcallback);
        } else {
            mAgentDelegate.reqSignInAccount(context, str, onreqaccountcallback);
        }
    }

    public static void reqToken(Context context, Handler handler, String str) {
        initContextIfNeeded(context);
        if (isGuest(context)) {
            mGuestDelegate.reqToken(context, handler, str);
        } else {
            mAgentDelegate.reqToken(context, handler, str);
        }
    }

    @Deprecated
    public static void sendSingleReqMessage(UserEntity userEntity) {
        mAgentDelegate.sendSingleReqMessage(userEntity);
    }

    public static boolean setGuest(boolean z) {
        if (AccountAgentClient.get().getConfig() == null) {
            return false;
        }
        AccountAgentClient.get().init(AccountAgentClient.get().getConfig().newBuilder().setShowGuest(z).create());
        return true;
    }

    public static void startAccountSettingActivity(Context context, String str) {
        initContextIfNeeded(context);
        if (isGuest(context)) {
            mGuestDelegate.startAccountSettingActivity(context, str);
        } else {
            mAgentDelegate.startAccountSettingActivity(context, str);
        }
    }

    public static void register(Context context, AccountAgentInterface accountAgentInterface, IStatistics iStatistics) {
        register(context, accountAgentInterface, iStatistics, null);
    }

    public static void register(Context context, AccountAgentInterface accountAgentInterface, IStatistics iStatistics, IEnvConstant iEnvConstant) {
        initAccountAgent(accountAgentInterface);
        mAgentDelegate.init(context, iStatistics, iEnvConstant);
    }
}
