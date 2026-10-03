package com.platform.usercenter.oauth.agents;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import com.platform.usercenter.account.ams.api.AcOauthCallback;
import com.platform.usercenter.account.ams.api.IAcOAuthAgent;
import com.platform.usercenter.account.ams.bean.AcOauthApiResponse;
import com.platform.usercenter.account.ams.bean.AcOauthMaskInfoRequest;
import com.platform.usercenter.account.ams.bean.AcOauthRequest;
import com.platform.usercenter.account.ams.bean.AcOauthResult;
import com.platform.usercenter.account.ams.ipc.ResponseEnum;
import com.platform.usercenter.oauth.util.AcOauthAppUtil;
import com.platform.usercenter.oauth.util.AcOauthConstants;
import com.platform.usercenter.oauth.util.AcOauthLogUtil;
import com.platform.usercenter.oauth.util.AcOauthRefInvokeUtil;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
@Keep
public final class AcOAuthSdkManager {
    private static final String META_VERSION = "oauth_version";
    private static final String TAG = "AcOAuthManager";
    private static final String VERSION = "1.0.0";
    private volatile IAcOAuthAgent mAcOAuthAppImpl;
    private volatile IAcOAuthAgent mAcOAuthOpenImpl;
    private volatile IAcOAuthAgent mAcOAuthWebImpl;

    public static class AcOAuthSdkManagerHolder {
        private static final AcOAuthSdkManager sINSTANCE = new AcOAuthSdkManager();

        private AcOAuthSdkManagerHolder() {
        }
    }

    public static AcOAuthSdkManager getInstance() {
        return AcOAuthSdkManagerHolder.sINSTANCE;
    }

    private synchronized IAcOAuthAgent getOAuthManager(Context context, boolean z) {
        AcOauthLogUtil.e(TAG, "getOAuthAgent isOpen " + z);
        if (z) {
            return this.mAcOAuthOpenImpl;
        }
        Bundle metaInfo = AcOauthAppUtil.getMetaInfo(context, AcOauthAppUtil.getAccountPkgName(context));
        if (metaInfo == null || !"1.0.0".equals(metaInfo.getString(META_VERSION))) {
            return this.mAcOAuthWebImpl;
        }
        return this.mAcOAuthAppImpl;
    }

    private boolean isSupportGetMaskPhone(Context context) {
        int accountPkgVersion = AcOauthAppUtil.getAccountPkgVersion(context);
        if (accountPkgVersion >= 918000) {
            return true;
        }
        AcOauthLogUtil.i(TAG, "isSupportGetMaskPhone " + accountPkgVersion);
        return false;
    }

    public void auth(Context context, AcOauthRequest acOauthRequest, AcOauthCallback<AcOauthApiResponse<AcOauthResult>> acOauthCallback) {
        auth(context, acOauthRequest, acOauthCallback, false);
    }

    public void getMaskInfo(Context context, AcOauthMaskInfoRequest acOauthMaskInfoRequest, AcOauthCallback<AcOauthApiResponse<Map<String, String>>> acOauthCallback) {
        if (isSupportGetMaskPhone(context)) {
            getOAuthManager(context, false).getMaskInfo(context, acOauthMaskInfoRequest, acOauthCallback);
            return;
        }
        AcOauthLogUtil.e(TAG, "getMaskInfo failed: account version is lower than required version 918000");
        ResponseEnum responseEnum = ResponseEnum.AUTH_ACCOUNT_VERSION_NOT_SUPPORT;
        acOauthCallback.call(new AcOauthApiResponse<>(responseEnum.getCode(), responseEnum.getRemark(), null));
    }

    private AcOAuthSdkManager() {
        this.mAcOAuthAppImpl = new OAuthAppAgent();
        this.mAcOAuthWebImpl = (IAcOAuthAgent) AcOauthRefInvokeUtil.createObject(AcOauthConstants.H5_OAUTH_MANAGER_CLASS_NAME, IAcOAuthAgent.class);
        this.mAcOAuthOpenImpl = (IAcOAuthAgent) AcOauthRefInvokeUtil.createObject(AcOauthConstants.OPEN_SDK_OAUTH_MANAGER_CLASS_NAME, IAcOAuthAgent.class);
    }

    public void auth(Context context, AcOauthRequest acOauthRequest, AcOauthCallback<AcOauthApiResponse<AcOauthResult>> acOauthCallback, boolean z) {
        IAcOAuthAgent oAuthManager = getOAuthManager(context, z);
        if (oAuthManager != null) {
            oAuthManager.auth(context, acOauthRequest, acOauthCallback);
            return;
        }
        AcOauthLogUtil.e(TAG, "version not support!");
        ResponseEnum responseEnum = ResponseEnum.ERROR_NOT_OAUTH_MANAGER;
        acOauthCallback.call(new AcOauthApiResponse<>(responseEnum.getCode(), responseEnum.getRemark(), null));
    }
}
