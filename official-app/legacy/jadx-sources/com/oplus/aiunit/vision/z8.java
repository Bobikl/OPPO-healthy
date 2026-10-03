package com.oplus.aiunit.vision;

import android.content.Context;
import com.oplus.accountsdk.service.account.BuildConfig;
import com.platform.usercenter.account.ams.ipc.AcBasicInfoBean;
import com.platform.usercenter.account.ams.ipc.IpcRequest;
import com.platform.usercenter.account.ams.ipc.RequestConstant;
import com.platform.usercenter.account.ams.ipc.support.AcIpcRequestHelper;
import com.platform.usercenter.account.ams.ipc.support.AcIpcResponse;
import com.platform.usercenter.account.ams.ipc.support.IAcIpcRequestCallback;
import com.platform.usercenter.account.ams.ipc.support.IAcIpcUriProvider;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes19.dex */
public class z8 {
    public final IAcIpcUriProvider a;

    public z8(IAcIpcUriProvider iAcIpcUriProvider) {
        this.a = iAcIpcUriProvider;
    }

    public void a(Context context, String str, IAcIpcRequestCallback<AcIpcResponse> iAcIpcRequestCallback) {
        IpcRequest ipcRequest = new IpcRequest();
        ipcRequest.setRequestType(RequestConstant.TYPE_GET_SSOID);
        AcBasicInfoBean acBasicInfoBean = new AcBasicInfoBean(o8.d(context), o8.e(context), o8.f(context), BuildConfig.VERSION_NAME);
        ipcRequest.setTraceId(str);
        ipcRequest.setBasicInfo(xa.d(acBasicInfoBean));
        AcIpcRequestHelper.requestIpc(false, context, new WeakReference(context), ipcRequest, str, iAcIpcRequestCallback, this.a);
    }
}
