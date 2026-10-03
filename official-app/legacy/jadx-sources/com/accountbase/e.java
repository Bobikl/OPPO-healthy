package com.accountbase;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import com.heytap.usercenter.accountsdk.AccountAgentWrapper;
import com.heytap.usercenter.accountsdk.AccountResult;
import com.heytap.usercenter.accountsdk.helper.Constants;
import com.heytap.usercenter.accountsdk.http.AccountNameTask;
import com.heytap.usercenter.accountsdk.model.AccountEntity;
import com.heytap.usercenter.accountsdk.model.SignInAccount;
import com.nearme.aidl.UserEntity;
import com.platform.usercenter.tools.log.UCLogUtil;

/* JADX INFO: loaded from: classes12.dex */
public class e extends AccountAgentWrapper {
    @Override // com.heytap.usercenter.accountsdk.AccountAgentWrapper, com.heytap.usercenter.accountsdk.AccountAgentInterface
    public AccountEntity getAccountEntity(Context context, String str) {
        UCLogUtil.d("GuestAgentWrapper", "current account mode:guest");
        return null;
    }

    @Override // com.heytap.usercenter.accountsdk.AccountAgentWrapper, com.heytap.usercenter.accountsdk.AccountAgentInterface
    public String getAccountName(Context context, String str) {
        return null;
    }

    @Override // com.heytap.usercenter.accountsdk.AccountAgentWrapper, com.heytap.usercenter.accountsdk.AccountAgentInterface
    public AccountResult getAccountResult(Context context, String str) {
        AccountResult accountResult = new AccountResult();
        accountResult.setCanJump2Bind(false);
        accountResult.setOldUserName(null);
        accountResult.setResultCode(Constants.REQ_GUEST_MODE_CODE);
        accountResult.setResultMsg("current account mode:guest");
        return accountResult;
    }

    @Override // com.heytap.usercenter.accountsdk.AccountAgentWrapper, com.heytap.usercenter.accountsdk.AccountAgentInterface
    public void getSignInAccount(Context context, String str, AccountNameTask.onReqAccountCallback<SignInAccount> onreqaccountcallback) {
        SignInAccount signInAccount = new SignInAccount();
        signInAccount.isLogin = false;
        signInAccount.resultCode = "30004046";
        signInAccount.resultMsg = "current account mode:guest";
        onreqaccountcallback.onReqFinish(signInAccount);
    }

    @Override // com.heytap.usercenter.accountsdk.AccountAgentWrapper, com.heytap.usercenter.accountsdk.AccountAgentInterface
    public String getToken(Context context, String str) {
        UCLogUtil.d("GuestAgentWrapper", "current account mode:guest");
        return null;
    }

    @Override // com.heytap.usercenter.accountsdk.AccountAgentWrapper, com.heytap.usercenter.accountsdk.AccountAgentInterface
    public String getUserName(Context context, String str) {
        return null;
    }

    @Override // com.heytap.usercenter.accountsdk.AccountAgentWrapper, com.heytap.usercenter.accountsdk.AccountAgentInterface
    public boolean isLogin(Context context, String str) {
        return false;
    }

    @Override // com.heytap.usercenter.accountsdk.AccountAgentWrapper, com.heytap.usercenter.accountsdk.AccountAgentInterface
    public boolean isSupportAccountCountry(Context context) {
        return false;
    }

    @Override // com.heytap.usercenter.accountsdk.AccountAgentWrapper, com.heytap.usercenter.accountsdk.AccountAgentInterface
    public String reqAccountCountry(Context context) {
        return null;
    }

    @Override // com.heytap.usercenter.accountsdk.AccountAgentWrapper, com.heytap.usercenter.accountsdk.AccountAgentInterface
    public void reqLogout(Context context, String str) {
        UCLogUtil.d("GuestAgentWrapper", "current account mode:guest");
    }

    @Override // com.heytap.usercenter.accountsdk.AccountAgentWrapper, com.heytap.usercenter.accountsdk.AccountAgentInterface
    public void reqReSignin(Context context, Handler handler, String str) {
        Message messageObtain = Message.obtain((Handler) null, Constants.MSG_WHAT_UC_OPERATE_REFRESH);
        messageObtain.obj = new UserEntity(Constants.REQ_GUEST_MODE_CODE, "current account mode:guest", "", "");
        handler.sendMessage(messageObtain);
    }

    @Override // com.heytap.usercenter.accountsdk.AccountAgentWrapper, com.heytap.usercenter.accountsdk.AccountAgentInterface
    public void reqSignInAccount(Context context, String str, AccountNameTask.onReqAccountCallback<SignInAccount> onreqaccountcallback) {
        if (onreqaccountcallback == null) {
            throw new RuntimeException("please reqSignInAccount set callback");
        }
        UCLogUtil.i("GuestAgentWrapper", "reqSignInAccount start pkgName = " + context.getPackageName());
        onreqaccountcallback.onReqStart();
        onreqaccountcallback.onReqLoading();
        SignInAccount signInAccount = new SignInAccount();
        signInAccount.isLogin = false;
        signInAccount.resultCode = "30004046";
        signInAccount.resultMsg = "current account mode:guest";
        onreqaccountcallback.onReqFinish(signInAccount);
    }

    @Override // com.heytap.usercenter.accountsdk.AccountAgentWrapper, com.heytap.usercenter.accountsdk.AccountAgentInterface
    public void reqToken(Context context, Handler handler, String str) {
        Message messageObtain = Message.obtain((Handler) null, 40001000);
        messageObtain.obj = new UserEntity(Constants.REQ_GUEST_MODE_CODE, "current account mode:guest", "", "");
        handler.sendMessage(messageObtain);
    }

    @Override // com.heytap.usercenter.accountsdk.AccountAgentWrapper, com.heytap.usercenter.accountsdk.AccountAgentInterface
    public void startAccountSettingActivity(Context context, String str) {
        UCLogUtil.d("GuestAgentWrapper", "current account mode:guest");
    }
}
