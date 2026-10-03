package com.heytap.usercenter.accountsdk;

import android.content.Context;
import android.os.Handler;
import com.heytap.service.accountsdk.IStatistics;
import com.heytap.usercenter.accountsdk.http.AccountNameTask;
import com.heytap.usercenter.accountsdk.model.AccountEntity;
import com.heytap.usercenter.accountsdk.model.SignInAccount;
import com.nearme.aidl.UserEntity;
import com.platform.usercenter.basic.annotation.Keep;
import com.platform.usercenter.tools.env.IEnvConstant;

/* JADX INFO: loaded from: classes19.dex */
@Keep
public interface AccountAgentInterface {
    AccountEntity getAccountEntity(Context context, String str);

    @Deprecated
    String getAccountName(Context context, String str);

    AccountResult getAccountResult(Context context, String str);

    void getSignInAccount(Context context, String str, AccountNameTask.onReqAccountCallback<SignInAccount> onreqaccountcallback);

    @Deprecated
    String getToken(Context context, String str);

    @Deprecated
    String getUserName(Context context, String str);

    boolean hasUserCenterApp(Context context);

    void init(Context context, IStatistics iStatistics, IEnvConstant iEnvConstant);

    @Deprecated
    boolean isLogin(Context context, String str);

    boolean isSupportAccountCountry(Context context);

    boolean isVersionUpV320(Context context);

    String reqAccountCountry(Context context);

    void reqLogout(Context context, String str);

    @Deprecated
    void reqReSignin(Context context, Handler handler, String str);

    void reqSignInAccount(Context context, String str, AccountNameTask.onReqAccountCallback<SignInAccount> onreqaccountcallback);

    @Deprecated
    void reqToken(Context context, Handler handler, String str);

    void sendSingleReqMessage(UserEntity userEntity);

    void startAccountSettingActivity(Context context, String str);
}
