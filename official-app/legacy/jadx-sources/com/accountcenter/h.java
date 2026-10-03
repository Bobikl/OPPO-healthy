package com.accountcenter;

import android.content.Context;
import android.text.TextUtils;
import com.heytap.usercenter.accountsdk.AccountResult;
import com.heytap.usercenter.accountsdk.model.AccountEntity;
import com.platform.sdk.center.cons.AcConstants;
import com.platform.sdk.center.sdk.mvvm.model.data.AcAccount;
import com.platform.sdk.center.sdk.mvvm.model.data.AcInfo;
import com.platform.sdk.center.sdk.mvvm.model.net.api.AcApiService;
import com.platform.sdk.center.sdk.mvvm.model.net.callback.AcAccountResultCallback;
import com.platform.sdk.center.sdk.mvvm.model.net.callback.IBaseResultCallBack;
import com.platform.sdk.center.sdk.mvvm.model.repository.AcNetManager;
import com.platform.sdk.center.utils.AcGsonUtils;
import com.platform.sdk.center.utils.AcPreferencesUtils;
import com.platform.usercenter.basic.core.mvvm.CoreResponse;
import com.platform.usercenter.tools.log.UCLogUtil;

/* JADX INFO: loaded from: classes12.dex */
public final class h {
    public static final AcApiService a = (AcApiService) AcNetManager.getInstance().getNetworkModule().provideNormalRetrofit().b(AcApiService.class);

    public static String a(String str) {
        if ("1003".equals(str)) {
            return "操作失败";
        }
        if ("1001".equals(str)) {
            return "账号未登录";
        }
        if ("2000".equals(str)) {
            return "获取缓存数据成功";
        }
        if ("2001".equals(str)) {
            return "网络异常";
        }
        return "1000".equals(str) ? "获取网络数据成功" : "操作失败";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void a(Context context, AccountEntity accountEntity, CoreResponse coreResponse, AcAccountResultCallback acAccountResultCallback) {
        T t;
        UCLogUtil.i("postReqAcInfoV2Result isV2 = false");
        AcAccount acAccount = new AcAccount();
        String str = "";
        if (coreResponse != null && coreResponse.isSuccess() && (t = coreResponse.data) != 0) {
            AcInfo acInfo = (AcInfo) t;
            acAccount.vipInfo = acInfo;
            AcConstants.a.a = acInfo.portalUrl;
            AcConstants.a.b = acInfo.payUrl;
            if (accountEntity != null && !TextUtils.isEmpty(accountEntity.authToken)) {
                if (!TextUtils.isEmpty(((AcInfo) coreResponse.data).userName)) {
                    acAccount.isLogin = true;
                    acAccount.token = accountEntity.authToken;
                    acAccount.deviceId = accountEntity.deviceId;
                    if (TextUtils.isEmpty(acAccount.vipInfo.ssoid)) {
                        acAccount.vipInfo.ssoid = accountEntity.ssoid;
                    }
                    acAccount.resultCode = "1000";
                    acAccount.resultMsg = a("1000");
                    String json = AcGsonUtils.toJson(acAccount.vipInfo);
                    StringBuilder sb = new StringBuilder(AcConstants.K_SP_VIP_ACCOUNT_INFO);
                    sb.append(TextUtils.isEmpty(acAccount.vipInfo.ssoid) ? accountEntity.accountName : acAccount.vipInfo.ssoid);
                    String string = sb.toString();
                    if (!TextUtils.isEmpty(json)) {
                        char[] charArray = json.toCharArray();
                        for (int i = 0; i < charArray.length; i++) {
                            charArray[i] = (char) (charArray[i] + '\b');
                        }
                        str = new String(charArray);
                    }
                    AcPreferencesUtils.setString(context, string, str);
                } else {
                    acAccount.isLogin = false;
                    acAccount.resultCode = "1002";
                    acAccount.resultMsg = a("1002");
                }
            } else {
                acAccount.isLogin = false;
                acAccount.resultCode = "1001";
                acAccount.resultMsg = a("1001");
            }
            if (acAccountResultCallback != null) {
                acAccountResultCallback.onAccountResult(acAccount);
                return;
            }
            return;
        }
        acAccount.isLogin = false;
        if (coreResponse != null && coreResponse.error != null) {
            acAccount.resultCode = String.valueOf(coreResponse.code);
            acAccount.resultMsg = coreResponse.error.message;
        } else {
            acAccount.resultCode = "1003";
            acAccount.resultMsg = a("1003");
        }
        if (acAccountResultCallback != null) {
            acAccountResultCallback.onAccountResult(acAccount);
        }
        if (accountEntity != null) {
            StringBuilder sb2 = new StringBuilder(AcConstants.K_SP_VIP_ACCOUNT_INFO);
            sb2.append(TextUtils.isEmpty(accountEntity.ssoid) ? accountEntity.accountName : accountEntity.ssoid);
            AcPreferencesUtils.setString(context, sb2.toString(), "");
        }
    }

    public static AcInfo a(Context context, AccountEntity accountEntity, boolean z) {
        String str;
        String str2 = z ? AcConstants.K_SP_VIP_ACCOUNT_INFO_V2 : AcConstants.K_SP_VIP_ACCOUNT_INFO;
        if (accountEntity == null) {
            return null;
        }
        if (TextUtils.isEmpty(accountEntity.accountName) && TextUtils.isEmpty(accountEntity.ssoid)) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str2);
        if (TextUtils.isEmpty(accountEntity.ssoid)) {
            str = accountEntity.accountName;
        } else {
            str = accountEntity.ssoid;
        }
        sb.append(str);
        String string = AcPreferencesUtils.getString(context, sb.toString());
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        char[] charArray = string.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            charArray[i] = (char) (charArray[i] - '\b');
        }
        return (AcInfo) AcGsonUtils.fromJson(new String(charArray), AcInfo.class);
    }

    public static void a(AccountEntity accountEntity, AccountResult accountResult, IBaseResultCallBack iBaseResultCallBack, boolean z, AcInfo acInfo) {
        UCLogUtil.i("postVipAccountInfoCacheV2");
        if (iBaseResultCallBack == null) {
            return;
        }
        AcAccount acAccount = new AcAccount();
        acAccount.isLogin = false;
        if (accountEntity != null) {
            if (TextUtils.isEmpty(accountEntity.accountName) && TextUtils.isEmpty(accountEntity.ssoid)) {
                return;
            }
            if (acInfo != null) {
                acAccount.isLogin = true;
                acAccount.resultCode = "2000";
                acAccount.resultMsg = a("2000");
                acAccount.vipInfo = acInfo;
                acAccount.token = accountEntity.authToken;
                acAccount.deviceId = accountEntity.deviceId;
                AcConstants.a.a = acInfo.portalUrl;
                AcConstants.a.b = acInfo.payUrl;
                iBaseResultCallBack.onAccountResult(acAccount);
                return;
            }
            if (z) {
                return;
            }
            if (accountResult != null && !TextUtils.isEmpty(accountEntity.accountName)) {
                acAccount.isLogin = true;
                AcInfo acInfo2 = new AcInfo();
                acAccount.vipInfo = acInfo2;
                acInfo2.userName = accountResult.getOldUserName();
                acAccount.vipInfo.avatar = accountResult.getAvatar();
                acAccount.token = accountEntity.authToken;
                acAccount.deviceId = accountEntity.deviceId;
            }
            acAccount.resultCode = "2001";
            acAccount.resultMsg = a("2001");
            iBaseResultCallBack.onAccountResult(acAccount);
        }
    }
}
