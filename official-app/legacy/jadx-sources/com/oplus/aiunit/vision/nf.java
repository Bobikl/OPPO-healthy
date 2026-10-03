package com.oplus.aiunit.vision;

import com.oplus.accountsdk.base.common.util.AcLogUtil;
import com.platform.usercenter.account.ams.bean.AcOauthRequest;
import com.platform.usercenter.account.ams.ipc.AcAuthRequestBean;
import com.platform.usercenter.account.ams.ipc.AcBasicInfoBean;
import com.platform.usercenter.account.ams.ipc.IpcRequest;
import com.platform.usercenter.account.ams.ipc.support.AcIpcRequestHelper;
import com.platform.usercenter.account.ams.ipc.support.AcIpcResponse;
import com.platform.usercenter.account.ams.ipc.support.IAcIpcRequestCallback;
import com.platform.usercenter.account.ams.ipc.support.IAcIpcUriProvider;

/* JADX INFO: loaded from: classes6.dex */
public class nf {
    public IAcIpcUriProvider a;

    public nf(IAcIpcUriProvider iAcIpcUriProvider) {
        this.a = iAcIpcUriProvider;
    }

    public static /* synthetic */ void b(pa paVar, c8 c8Var, AcIpcResponse acIpcResponse) {
        AcLogUtil.i("AcOpenOAuthApi", "OAuthApi response code: " + acIpcResponse.getCode(), paVar.l());
        c8Var.call(acIpcResponse);
    }

    public void c(final pa paVar, AcOauthRequest acOauthRequest, final c8<AcIpcResponse> c8Var) {
        AcBasicInfoBean acBasicInfoBean = new AcBasicInfoBean(paVar.h(), paVar.i(), paVar.j(), paVar.k());
        acBasicInfoBean.setBizAppI(paVar.e());
        acBasicInfoBean.setBizAppK(paVar.f());
        IpcRequest ipcRequest = new IpcRequest();
        ipcRequest.setRequestType(-1003);
        ipcRequest.setBasicInfo(xa.d(acBasicInfoBean));
        ipcRequest.setParamsJson(xa.d(new AcAuthRequestBean(acOauthRequest.getAppId(), acOauthRequest.getAppKey(), true, true, acOauthRequest.getState(), acOauthRequest.getScope())));
        ipcRequest.setTraceId(paVar.l());
        AcIpcRequestHelper.requestIpc(true, paVar.g(), paVar.m(), ipcRequest, paVar.l(), new IAcIpcRequestCallback() { // from class: com.oplus.aiunit.vision.mf
            @Override // com.platform.usercenter.account.ams.ipc.support.IAcIpcRequestCallback
            public final void call(Object obj) {
                nf.b(paVar, c8Var, (AcIpcResponse) obj);
            }
        }, this.a);
    }
}
