package com.accountcenter;

import com.oplus.aiunit.vision.at2;
import com.oplus.aiunit.vision.xr2;
import com.oplus.aiunit.vision.ztf;
import com.platform.sdk.center.sdk.mvvm.model.data.AcCardOperationResult;
import com.platform.sdk.center.sdk.mvvm.model.net.callback.AcAccountResultCallback;
import com.platform.usercenter.basic.core.mvvm.CoreResponse;

/* JADX INFO: loaded from: classes12.dex */
public final class g implements at2<CoreResponse<AcCardOperationResult.OperationInfo>> {
    public final /* synthetic */ AcAccountResultCallback a;

    public g(AcAccountResultCallback acAccountResultCallback) {
        this.a = acAccountResultCallback;
    }

    @Override // com.oplus.aiunit.vision.at2
    public final void onFailure(xr2<CoreResponse<AcCardOperationResult.OperationInfo>> xr2Var, Throwable th) {
        AcAccountResultCallback acAccountResultCallback = this.a;
        if (acAccountResultCallback != null) {
            acAccountResultCallback.onError(xr2Var, th, th.getMessage());
        }
    }

    @Override // com.oplus.aiunit.vision.at2
    public final void onResponse(xr2<CoreResponse<AcCardOperationResult.OperationInfo>> xr2Var, ztf<CoreResponse<AcCardOperationResult.OperationInfo>> ztfVar) {
        AcCardOperationResult acCardOperationResult = new AcCardOperationResult();
        if (!ztfVar.g() || ztfVar.a() == null || ztfVar.a().data == null) {
            acCardOperationResult.isSuccess = false;
            acCardOperationResult.info = null;
        } else {
            acCardOperationResult.isSuccess = true;
            acCardOperationResult.info = ztfVar.a().data;
        }
        AcAccountResultCallback acAccountResultCallback = this.a;
        if (acAccountResultCallback != null) {
            acAccountResultCallback.onOperationResult(acCardOperationResult);
        }
    }
}
