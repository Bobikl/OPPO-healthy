package com.platform.account.oauth.web.agents;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.Keep;
import com.oplus.aiunit.vision.f1a;
import com.platform.account.oauth.web.bean.AcOauthOperate;
import com.platform.account.oauth.web.bean.AcOauthOperateResult;
import com.platform.account.oauth.web.bean.AcOauthWebData;
import com.platform.account.oauth.web.bean.AcOauthWebResult;
import com.platform.account.oauth.web.web.AuthWebViewManager;
import com.platform.usercenter.ac.env.AccountUrlManager;
import com.platform.usercenter.account.ams.api.AcOauthCallback;
import com.platform.usercenter.account.ams.api.IAcOAuthAgent;
import com.platform.usercenter.account.ams.bean.AcOauthApiResponse;
import com.platform.usercenter.account.ams.bean.AcOauthMaskInfoRequest;
import com.platform.usercenter.account.ams.bean.AcOauthRequest;
import com.platform.usercenter.account.ams.bean.AcOauthResult;
import com.platform.usercenter.account.ams.ipc.ResponseEnum;
import com.platform.usercenter.oauth.util.AcOauthJsonUtils;
import com.platform.usercenter.oauth.util.AcOauthLogUtil;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
@Keep
public class OAuthAgentWeb implements IAcOAuthAgent {
    private static final String AUTH_HTML = "account-auth-web-sdk/index.html?&scope=";
    private static final String BIZ_KEY_PARAM = "&bizKey=";
    private static final String PKG_NAME = "&pkgName=";
    private static final String STATE = "&state=";
    private static final String TAG = "OAuthAgentWeb";

    public class a implements f1a {
        public final /* synthetic */ AcOauthCallback a;
        public final /* synthetic */ String b;

        public a(AcOauthCallback acOauthCallback, String str) {
            this.a = acOauthCallback;
            this.b = str;
        }

        @Override // com.oplus.aiunit.vision.f1a
        public void onError(int i, String str) {
            AcOauthLogUtil.i(OAuthAgentWeb.TAG, "WebViewResultReceiver onError errorCode = " + i + " message = " + str);
            this.a.call(new AcOauthApiResponse(i, str, null));
        }

        @Override // com.oplus.aiunit.vision.f1a
        public void onSuccess(String str) {
            AcOauthWebData acOauthWebData;
            AcOauthOperate acOauthOperate;
            AcOauthLogUtil.i(OAuthAgentWeb.TAG, "WebViewResultReceiver onSuccess. data = " + str);
            AcOauthWebResult acOauthWebResult = (AcOauthWebResult) AcOauthJsonUtils.stringToClass(str, AcOauthWebResult.class);
            if (acOauthWebResult == null || (acOauthWebData = acOauthWebResult.data) == null || (acOauthOperate = acOauthWebData.operate) == null) {
                AcOauthLogUtil.e(OAuthAgentWeb.TAG, "openUrl but data = " + str);
                AcOauthCallback acOauthCallback = this.a;
                ResponseEnum responseEnum = ResponseEnum.AUTH_H5_RESULT_NULL;
                acOauthCallback.call(new AcOauthApiResponse(responseEnum.getCode(), responseEnum.getRemark(), null));
                return;
            }
            if (!acOauthOperate.operateSuccess) {
                AcOauthLogUtil.e(OAuthAgentWeb.TAG, "oauth fail msg = " + acOauthWebResult.msg);
                this.a.call(new AcOauthApiResponse(ResponseEnum.OAUTH_H5_OPERATE_FAILED.getCode(), acOauthWebResult.msg, null));
                return;
            }
            AcOauthOperateResult acOauthOperateResult = (AcOauthOperateResult) AcOauthJsonUtils.stringToClass(acOauthOperate.operateResult.replace("\\\"", "\""), AcOauthOperateResult.class);
            if (acOauthOperateResult == null || TextUtils.isEmpty(acOauthOperateResult.code)) {
                AcOauthLogUtil.e(OAuthAgentWeb.TAG, "oauth fail , h5 data error.");
                AcOauthCallback acOauthCallback2 = this.a;
                ResponseEnum responseEnum2 = ResponseEnum.OAUTH_H5_DATA_ERROR;
                acOauthCallback2.call(new AcOauthApiResponse(responseEnum2.getCode(), responseEnum2.getRemark(), null));
                return;
            }
            if (acOauthOperateResult.state.equals(this.b)) {
                AcOauthLogUtil.e(OAuthAgentWeb.TAG, "oauth success!");
                AcOauthCallback acOauthCallback3 = this.a;
                ResponseEnum responseEnum3 = ResponseEnum.SUCCESS;
                acOauthCallback3.call(new AcOauthApiResponse(responseEnum3.getCode(), responseEnum3.getRemark(), new AcOauthResult(acOauthOperateResult.code)));
                return;
            }
            AcOauthLogUtil.e(OAuthAgentWeb.TAG, "oauth state not match, client state: " + this.b + " server state: " + acOauthOperateResult.state);
            AcOauthCallback acOauthCallback4 = this.a;
            ResponseEnum responseEnum4 = ResponseEnum.OAUTH_STATE_CHANGE_ERROR;
            acOauthCallback4.call(new AcOauthApiResponse(responseEnum4.getCode(), responseEnum4.getRemark(), null));
        }
    }

    private void openUrl(Context context, String str, String str2, AcOauthCallback<AcOauthApiResponse<AcOauthResult>> acOauthCallback) {
        AuthWebViewManager.getInstance().openWebView(context, str, new a(acOauthCallback, str2));
    }

    @Override // com.platform.usercenter.account.ams.api.IAcOAuthAgent
    public void auth(Context context, AcOauthRequest acOauthRequest, AcOauthCallback<AcOauthApiResponse<AcOauthResult>> acOauthCallback) {
        openUrl(context, AccountUrlManager.getWebLoginUrl() + AUTH_HTML + acOauthRequest.getScope() + BIZ_KEY_PARAM + acOauthRequest.getAppKey() + PKG_NAME + context.getPackageName() + STATE + acOauthRequest.getState(), acOauthRequest.getState(), acOauthCallback);
    }

    @Override // com.platform.usercenter.account.ams.api.IAcOAuthAgent
    public void getMaskInfo(Context context, AcOauthMaskInfoRequest acOauthMaskInfoRequest, AcOauthCallback<AcOauthApiResponse<Map<String, String>>> acOauthCallback) {
    }
}
