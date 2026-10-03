package com.oplus.aiunit.vision;

import android.content.Context;
import com.oplus.accountsdk.base.account.beans.AcApiResponse;
import com.oplus.accountsdk.base.account.config.AcOpenAccountConfig;
import com.oplus.accountsdk.base.common.util.AcLogUtil;
import com.platform.usercenter.account.ams.ipc.AcBasicInfoBean;
import com.platform.usercenter.account.ams.ipc.IpcRequest;
import com.platform.usercenter.account.ams.ipc.support.AcIpcRequestHelper;
import com.platform.usercenter.account.ams.ipc.support.AcIpcResponse;
import com.platform.usercenter.account.ams.ipc.support.IAcIpcRequestCallback;
import com.platform.usercenter.account.ams.ipc.support.IAcIpcUriProvider;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes6.dex */
public class gf {
    public final IAcIpcUriProvider a;

    public gf(IAcIpcUriProvider iAcIpcUriProvider) {
        this.a = iAcIpcUriProvider;
    }

    public static /* synthetic */ void b(c8 c8Var, AcIpcResponse acIpcResponse) {
        AcLogUtil.i("AcInitApi", "requestIpc callback =" + acIpcResponse.getCode());
        c8Var.call(new AcApiResponse(acIpcResponse.getCode(), acIpcResponse.getMsg(), null));
    }

    public void c(Context context, String str, AcOpenAccountConfig acOpenAccountConfig, final c8<AcApiResponse<Boolean>> c8Var) {
        AcBasicInfoBean acBasicInfoBean = new AcBasicInfoBean(o8.d(context), o8.e(context), o8.f(context), "3.0.6");
        acBasicInfoBean.setBizAppI(acOpenAccountConfig.getAppI());
        acBasicInfoBean.setBizAppK(acOpenAccountConfig.getAppK());
        IpcRequest ipcRequest = new IpcRequest();
        ipcRequest.setRequestType(-1010);
        ipcRequest.setParamsJson(xa.d(acOpenAccountConfig));
        ipcRequest.setBasicInfo(xa.d(acBasicInfoBean));
        ipcRequest.setTraceId(str);
        AcIpcRequestHelper.requestIpc(true, context, new WeakReference(context), ipcRequest, str, new IAcIpcRequestCallback() { // from class: com.oplus.aiunit.vision.ff
            @Override // com.platform.usercenter.account.ams.ipc.support.IAcIpcRequestCallback
            public final void call(Object obj) {
                gf.b(c8Var, (AcIpcResponse) obj);
            }
        }, this.a);
    }
}
