package com.platform.usercenter.oauth.agents;

import android.content.Context;
import androidx.annotation.Keep;
import com.platform.usercenter.account.ams.api.AcOauthCallback;
import com.platform.usercenter.account.ams.api.IAcOAuthAgent;
import com.platform.usercenter.account.ams.bean.AcOauthApiResponse;
import com.platform.usercenter.account.ams.bean.AcOauthMaskInfoRequest;
import com.platform.usercenter.account.ams.bean.AcOauthRequest;
import com.platform.usercenter.account.ams.bean.AcOauthResult;
import com.platform.usercenter.account.ams.ipc.AcAuthRequestBean;
import com.platform.usercenter.account.ams.ipc.AcBasicInfoBean;
import com.platform.usercenter.account.ams.ipc.IpcRequest;
import com.platform.usercenter.account.ams.ipc.OAuthResponse;
import com.platform.usercenter.account.ams.ipc.ResponseEnum;
import com.platform.usercenter.oauth.agents.OAuthAppAgent;
import com.platform.usercenter.oauth.util.AcOauthAppUtil;
import com.platform.usercenter.oauth.util.AcOauthCacheUtil;
import com.platform.usercenter.oauth.util.AcOauthJsonUtils;
import com.platform.usercenter.oauth.util.AcOauthLogUtil;
import com.platform.usercenter.oauth.util.AcOauthRequestHelper;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
@Keep
public class OAuthAppAgent implements IAcOAuthAgent {
    private static final String TAG = "OAuthAgentV100";

    private IpcRequest createAuthIpcRequest(AcOauthRequest acOauthRequest, String str) {
        IpcRequest ipcRequest = new IpcRequest();
        AcAuthRequestBean acAuthRequestBean = new AcAuthRequestBean(acOauthRequest.getAppId(), acOauthRequest.getAppKey(), true, true, acOauthRequest.getState(), acOauthRequest.getScope());
        ipcRequest.setRequestType(-1003);
        ipcRequest.setParamsJson(AcOauthJsonUtils.toJson(acAuthRequestBean));
        ipcRequest.setTraceId(str);
        return ipcRequest;
    }

    private IpcRequest createMaskInfoIpcRequest(AcOauthMaskInfoRequest acOauthMaskInfoRequest, String str) {
        IpcRequest ipcRequest = new IpcRequest();
        ipcRequest.setRequestType(-1010);
        ipcRequest.setParamsJson(AcOauthJsonUtils.toJson(acOauthMaskInfoRequest));
        ipcRequest.setTraceId(str);
        return ipcRequest;
    }

    private AcBasicInfoBean getBasicInfo(Context context) {
        return new AcBasicInfoBean(context.getPackageName(), AcOauthAppUtil.getVersionName(context, context.getPackageName()), AcOauthAppUtil.getPkgVersionCode(context), "2.0.0");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$auth$0(AcOauthCallback acOauthCallback, AcOauthRequest acOauthRequest, AcOauthApiResponse acOauthApiResponse) {
        if (!acOauthApiResponse.isSuccess() || acOauthApiResponse.getData() == null) {
            AcOauthLogUtil.e(TAG, "oauth fail code: " + acOauthApiResponse.getCode() + " msg: " + acOauthApiResponse.getMsg());
            acOauthCallback.call(new AcOauthApiResponse(acOauthApiResponse.getCode(), acOauthApiResponse.getMsg(), null));
            return;
        }
        if (((OAuthResponse) acOauthApiResponse.getData()).getState().equals(acOauthRequest.getState())) {
            AcOauthLogUtil.i(TAG, "oauth success!");
            acOauthCallback.call(new AcOauthApiResponse(ResponseEnum.SUCCESS.getCode(), null, new AcOauthResult(((OAuthResponse) acOauthApiResponse.getData()).getAuthCode())));
            return;
        }
        AcOauthLogUtil.e(TAG, "oauth state not match, client state: " + acOauthRequest.getState() + " server state: " + ((OAuthResponse) acOauthApiResponse.getData()).getState());
        ResponseEnum responseEnum = ResponseEnum.OAUTH_STATE_CHANGE_ERROR;
        acOauthCallback.call(new AcOauthApiResponse(responseEnum.getCode(), responseEnum.getRemark(), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$getMaskInfo$1(AcOauthCallback acOauthCallback, AcOauthMaskInfoRequest acOauthMaskInfoRequest, AcOauthApiResponse acOauthApiResponse) {
        if (acOauthApiResponse.isSuccess() && acOauthApiResponse.getData() != null) {
            Map map = (Map) acOauthApiResponse.getData();
            if (map.isEmpty()) {
                acOauthCallback.call(new AcOauthApiResponse(acOauthApiResponse.getCode(), acOauthApiResponse.getMsg(), null));
                return;
            } else {
                AcOauthCacheUtil.putMaskInfoToCache(acOauthMaskInfoRequest, map);
                acOauthCallback.call(new AcOauthApiResponse(ResponseEnum.SUCCESS.getCode(), null, map));
                return;
            }
        }
        AcOauthLogUtil.e(TAG, "oauth fail code: " + acOauthApiResponse.getCode() + " msg: " + acOauthApiResponse.getMsg());
        acOauthCallback.call(new AcOauthApiResponse(acOauthApiResponse.getCode(), acOauthApiResponse.getMsg(), null));
    }

    @Override // com.platform.usercenter.account.ams.api.IAcOAuthAgent
    public void auth(Context context, final AcOauthRequest acOauthRequest, final AcOauthCallback<AcOauthApiResponse<AcOauthResult>> acOauthCallback) {
        AcBasicInfoBean basicInfo = getBasicInfo(context.getApplicationContext());
        basicInfo.setBizAppI(acOauthRequest.getAppId());
        basicInfo.setBizAppK(acOauthRequest.getAppKey());
        AcOauthLogUtil.i(TAG, "request by basicInfo: " + AcOauthJsonUtils.toJson(basicInfo));
        AcOauthLogUtil.s(TAG, "params: " + acOauthRequest);
        AcOauthRequestHelper.getInstance().requestIpc(true, context, createAuthIpcRequest(acOauthRequest, ""), basicInfo, OAuthResponse.class, "", new AcOauthCallback() { // from class: com.oplus.aiunit.vision.j1d
            @Override // com.platform.usercenter.account.ams.api.AcOauthCallback
            public final void call(Object obj) {
                OAuthAppAgent.lambda$auth$0(acOauthCallback, acOauthRequest, (AcOauthApiResponse) obj);
            }
        });
    }

    @Override // com.platform.usercenter.account.ams.api.IAcOAuthAgent
    public void getMaskInfo(Context context, final AcOauthMaskInfoRequest acOauthMaskInfoRequest, final AcOauthCallback<AcOauthApiResponse<Map<String, String>>> acOauthCallback) {
        Map<String, String> maskInfoFromCache = AcOauthCacheUtil.getMaskInfoFromCache(acOauthMaskInfoRequest);
        if (maskInfoFromCache != null) {
            AcOauthLogUtil.i(TAG, "return cached mask info");
            acOauthCallback.call(new AcOauthApiResponse<>(ResponseEnum.SUCCESS.getCode(), null, maskInfoFromCache));
            return;
        }
        AcBasicInfoBean basicInfo = getBasicInfo(context.getApplicationContext());
        basicInfo.setBizAppI(acOauthMaskInfoRequest.getAppId());
        basicInfo.setBizAppK(acOauthMaskInfoRequest.getAppKey());
        AcOauthLogUtil.i(TAG, "request by basicInfo: " + AcOauthJsonUtils.toJson(basicInfo));
        AcOauthLogUtil.s(TAG, "params: " + acOauthMaskInfoRequest);
        AcOauthRequestHelper.getInstance().requestIpcComplexParsing(true, context, createMaskInfoIpcRequest(acOauthMaskInfoRequest, ""), basicInfo, "", new AcOauthCallback() { // from class: com.oplus.aiunit.vision.i1d
            @Override // com.platform.usercenter.account.ams.api.AcOauthCallback
            public final void call(Object obj) {
                OAuthAppAgent.lambda$getMaskInfo$1(acOauthCallback, acOauthMaskInfoRequest, (AcOauthApiResponse) obj);
            }
        });
    }
}
