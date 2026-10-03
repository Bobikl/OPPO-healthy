package com.oplus.accountsdk.open.apis;

import com.google.gson.reflect.TypeToken;
import com.oplus.accountsdk.base.account.beans.AcAccountToken;
import com.oplus.accountsdk.base.account.beans.AcApiResponse;
import com.oplus.accountsdk.base.common.util.AcLogUtil;
import com.oplus.accountsdk.open.apis.AcOpenGetV1TokenApi;
import com.oplus.aiunit.vision.c8;
import com.oplus.aiunit.vision.pa;
import com.oplus.aiunit.vision.sa;
import com.oplus.aiunit.vision.wa;
import com.oplus.aiunit.vision.xa;
import com.oplus.aiunit.vision.zj;
import com.platform.usercenter.account.ams.ipc.AcAccountInfo;
import com.platform.usercenter.account.ams.ipc.AcBasicInfoBean;
import com.platform.usercenter.account.ams.ipc.IpcRequest;
import com.platform.usercenter.account.ams.ipc.ResponseEnum;
import com.platform.usercenter.account.ams.ipc.support.AcIpcResponse;
import com.platform.usercenter.account.ams.ipc.support.IAcIpcRequestCallback;
import com.platform.usercenter.account.ams.ipc.support.IAcIpcUriProvider;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class AcOpenGetV1TokenApi {
    public volatile wa<AcAccountInfo> a;
    public IAcIpcUriProvider b;

    public AcOpenGetV1TokenApi(IAcIpcUriProvider iAcIpcUriProvider) {
        this.b = iAcIpcUriProvider;
    }

    public static /* synthetic */ void e(pa paVar, zj.d dVar, AcIpcResponse acIpcResponse) {
        AcLogUtil.i("AcOpenGetV1TokenApi", "requestBasicInfo response code: " + acIpcResponse.getCode(), paVar.l());
        dVar.a(acIpcResponse);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f(final pa paVar, IpcRequest ipcRequest, final zj.d dVar) {
        d(paVar.e()).g(false, paVar.g(), ipcRequest, paVar.l(), new IAcIpcRequestCallback() { // from class: com.oplus.aiunit.vision.le
            @Override // com.platform.usercenter.account.ams.ipc.support.IAcIpcRequestCallback
            public final void call(Object obj) {
                AcOpenGetV1TokenApi.e(paVar, dVar, (AcIpcResponse) obj);
            }
        }, this.b);
    }

    public static /* synthetic */ void g(String str) {
    }

    public final wa<AcAccountInfo> d(String str) {
        if (this.a == null) {
            synchronized (this) {
                if (this.a == null) {
                    this.a = new wa<>(str);
                }
            }
        }
        return this.a;
    }

    public AcApiResponse<AcAccountToken> h(final pa paVar) {
        AcBasicInfoBean acBasicInfoBean = new AcBasicInfoBean(paVar.h(), paVar.i(), paVar.j(), paVar.k());
        acBasicInfoBean.setBizAppI(paVar.e());
        acBasicInfoBean.setBizAppK(paVar.f());
        final IpcRequest ipcRequest = new IpcRequest();
        ipcRequest.setRequestType(-1011);
        ipcRequest.setBasicInfo(xa.d(acBasicInfoBean));
        ipcRequest.setTraceId(paVar.l());
        AcIpcResponse acIpcResponse = (AcIpcResponse) zj.a().e(10000L, new c8() { // from class: com.oplus.aiunit.vision.je
            @Override // com.oplus.aiunit.vision.c8
            public final void call(Object obj) {
                this.a.f(paVar, ipcRequest, (zj.d) obj);
            }
        });
        if (acIpcResponse == null) {
            ResponseEnum responseEnum = ResponseEnum.ERROR_REQUEST_TIMEOUT;
            acIpcResponse = new AcIpcResponse(responseEnum.code, responseEnum.remark, null);
        }
        AcApiResponse acApiResponseC = sa.c(new TypeToken<Map<String, String>>() { // from class: com.oplus.accountsdk.open.apis.AcOpenGetV1TokenApi.1
        }, acIpcResponse, new sa.a() { // from class: com.oplus.aiunit.vision.ke
            @Override // com.oplus.aiunit.vision.sa.a
            public final void a(String str) {
                AcOpenGetV1TokenApi.g(str);
            }
        });
        String strH = paVar.h();
        Map map = (Map) acApiResponseC.getData();
        return (map == null || map.isEmpty() || !map.containsKey(strH)) ? new AcApiResponse<>(acIpcResponse.getCode(), acIpcResponse.getMsg(), new AcAccountToken("", "", "")) : new AcApiResponse<>(acIpcResponse.getCode(), acIpcResponse.getMsg(), new AcAccountToken((String) map.get(strH), "", ""));
    }
}
