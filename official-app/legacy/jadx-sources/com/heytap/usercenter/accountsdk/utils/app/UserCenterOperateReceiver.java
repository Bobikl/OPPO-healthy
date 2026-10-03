package com.heytap.usercenter.accountsdk.utils.app;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.accountbase.c;
import com.heytap.usercenter.accountsdk.AccountAgent;
import com.heytap.usercenter.accountsdk.helper.AccountPrefUtils;
import com.heytap.usercenter.accountsdk.helper.Base64Helper;
import com.heytap.usercenter.accountsdk.helper.Constants;
import com.heytap.usercenter.accountsdk.utils.UCAccountXor8Provider;
import com.nearme.aidl.UserEntity;
import com.platform.usercenter.basic.annotation.Keep;
import com.platform.usercenter.basic.provider.UCCommonXor8Provider;
import com.platform.usercenter.tools.algorithm.XORUtils;
import com.platform.usercenter.tools.log.UCLogUtil;
import com.sensorsdata.analytics.android.sdk.aop.push.PushAutoTrackHelper;

/* JADX INFO: loaded from: classes19.dex */
@Keep
public class UserCenterOperateReceiver extends BroadcastReceiver {
    private static final String TAG = "UserCenterOperateReceiver";

    private void changeUserInfo(Context context, Intent intent) {
        AccountPrefUtils.clearData(context);
    }

    private void login(Context context, Intent intent) {
        String str = TAG;
        UCLogUtil.i(str, "onReceive login start");
        if (intent == null) {
            UCLogUtil.e(str, "onReceive login intent is null.");
            return;
        }
        try {
            String stringExtra = intent.getStringExtra(Constants.EXTRA_NAME_BROADCAST_ACTION_USERENTITY);
            boolean booleanExtra = intent.getBooleanExtra(Constants.EXTRA_NAME_BROADCAST_ACTION_USERENTITY_NEEDCALLBACK, true);
            if (TextUtils.isEmpty(stringExtra)) {
                UCLogUtil.i(str, "onReceive login json is null, isNeed2Callback = " + booleanExtra);
                if (booleanExtra) {
                    AccountAgent.sendSingleReqMessage(new UserEntity(30001004, "Already canceled!", "", ""));
                    return;
                }
                return;
            }
            UserEntity userEntityFromGson = UserEntity.fromGson(Base64Helper.base64Decode(stringExtra));
            if (userEntityFromGson == null || userEntityFromGson.getResult() != 30001001) {
                UCLogUtil.i(str, "onReceive login failure");
                AccountPrefUtils.clearData(context);
            } else {
                UCLogUtil.i(str, "onReceive login success, ResultCode = " + userEntityFromGson.getResult() + ", ResultMsg = " + userEntityFromGson.getResultMsg() + ", isNeed2Callback = " + booleanExtra);
                if (!AccountAgent.isVersionUpV320(context)) {
                    AccountPrefUtils.saveUserEntity(context, userEntityFromGson);
                }
                c.a().clearCache();
            }
            if (booleanExtra) {
                UCLogUtil.i(str, "onReceive login sendSingleReqMessage");
                AccountAgent.sendSingleReqMessage(userEntityFromGson);
            }
        } catch (Exception unused) {
        }
    }

    private void logout(Context context, Intent intent) {
        String str = TAG;
        UCLogUtil.i(str, "onReceive logout  start");
        if (intent == null) {
            return;
        }
        try {
            String strBase64Decode = Base64Helper.base64Decode(intent.getStringExtra(UCAccountXor8Provider.getExtraBroadcastUsercenterAescoderName()));
            if (Constants.PACKAGE_NAME_NEW_ACCOUNT.equals(strBase64Decode) || UCCommonXor8Provider.getUCPackageName().equals(strBase64Decode) || Constants.PACKAGE_NAME_NEW_USERCENTER.equals(strBase64Decode) || UCCommonXor8Provider.getPkgnameUcHtXor8().equals(strBase64Decode) || Constants.PACKAGE_NAME_OPUSERCENTER.equals(strBase64Decode) || Constants.PACKAGE_NAME_OPS_ACCOUNT.equals(strBase64Decode)) {
                UCLogUtil.i(str, "receive logout and verify clear data");
                AccountPrefUtils.clearData(context);
            }
        } catch (Exception unused) {
        }
    }

    private void modifyUserName(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        try {
            String stringExtra = intent.getStringExtra("OldUserName");
            String stringExtra2 = intent.getStringExtra("UserName");
            String strBase64Decode = Base64Helper.base64Decode(stringExtra);
            if (TextUtils.isEmpty(strBase64Decode) || !strBase64Decode.equals(AccountPrefUtils.getNameByProvider(context))) {
                return;
            }
            String strBase64Decode2 = Base64Helper.base64Decode(stringExtra2);
            if (TextUtils.isEmpty(strBase64Decode2)) {
                return;
            }
            UCLogUtil.i("modifyUserName is true");
            AccountPrefUtils.setName(context, strBase64Decode2);
        } catch (Exception unused) {
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        PushAutoTrackHelper.onBroadcastReceiver(this, context, intent);
        String action = intent.getAction();
        UCLogUtil.i(TAG, "onReceive action = " + XORUtils.encrypt(action, 8) + ",RECEIVER PKG = " + context.getPackageName());
        if (TextUtils.isEmpty(action)) {
            return;
        }
        if (UCAccountXor8Provider.getProviderUsercenterAccountLogoutXor8().equals(action) || UCAccountXor8Provider.ACTION_USERCENTER_ACCOUNT_LOGOUT.equals(action)) {
            logout(context, intent);
            return;
        }
        if (UCAccountXor8Provider.getProviderUsercenterAccountModifyNameXor8().equals(action)) {
            modifyUserName(context, intent);
            return;
        }
        if (UCAccountXor8Provider.getProviderUsercenterAccountLoginXor8().equals(action) || UCAccountXor8Provider.ACTION_USERCENTER_ACCOUNT_LOGIN.equals(action)) {
            login(context, intent);
        } else if ("com.usercenter.action.broadcast.USERINFO_CHANGED".equals(action)) {
            changeUserInfo(context, intent);
        }
    }
}
