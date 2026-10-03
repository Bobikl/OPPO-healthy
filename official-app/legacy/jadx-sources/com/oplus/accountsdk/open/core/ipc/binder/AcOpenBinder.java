package com.oplus.accountsdk.open.core.ipc.binder;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.util.Consumer;
import com.oplus.accountsdk.base.common.util.AcLogUtil;
import com.oplus.aiunit.vision.bn;
import com.oplus.aiunit.vision.ll9;
import com.oplus.aiunit.vision.na;
import com.oplus.aiunit.vision.rc;
import com.oplus.aiunit.vision.xa;
import com.platform.usercenter.account.ams.ipc.AcBasicInfoBean;
import com.platform.usercenter.account.ams.ipc.AcResultHelper;
import com.platform.usercenter.account.ams.ipc.IAmsBinder;
import com.platform.usercenter.account.ams.ipc.IpcRequest;
import com.platform.usercenter.account.ams.ipc.ResponseEnum;

/* JADX INFO: loaded from: classes6.dex */
public class AcOpenBinder extends IAmsBinder.Stub {
    private static final String TAG = "AcOpenBinder";
    private final Context context;

    public AcOpenBinder(Context context) {
        this.context = context;
    }

    private void checkRequestValid(IpcRequest ipcRequest, ResultReceiver resultReceiver, Consumer<AcBasicInfoBean> consumer) {
        AcBasicInfoBean acBasicInfoBean = (AcBasicInfoBean) xa.c(ipcRequest.getBasicInfo(), AcBasicInfoBean.class);
        if (acBasicInfoBean == null) {
            bn.c(TAG, "execute request " + ipcRequest.getRequestType() + " error: get request basicInfo failed, basicInfo: " + ipcRequest.getBasicInfo());
            ResponseEnum responseEnum = ResponseEnum.REMOTE_CALLED_INFO_NONE;
            sendFailResultWithConfig(resultReceiver, responseEnum.getCode(), responseEnum.getRemark());
            return;
        }
        if (TextUtils.isEmpty(acBasicInfoBean.getPkgName()) || TextUtils.isEmpty(acBasicInfoBean.getPkgVersion()) || TextUtils.isEmpty(acBasicInfoBean.getSdkVersion())) {
            ResponseEnum responseEnum2 = ResponseEnum.REMOTE_CALLED_INFO_NONE;
            sendFailResultWithConfig(resultReceiver, responseEnum2.getCode(), responseEnum2.getRemark());
            return;
        }
        String[] packagesForUid = this.context.getPackageManager().getPackagesForUid(Binder.getCallingUid());
        boolean z = false;
        if (packagesForUid != null) {
            for (String str : packagesForUid) {
                if (str.equals(acBasicInfoBean.getPkgName())) {
                    z = true;
                    break;
                }
            }
        }
        if (z) {
            bn.f(TAG, "execute request " + ipcRequest.getRequestType() + " on " + Thread.currentThread().getId() + " , basicInfo: " + acBasicInfoBean);
            consumer.accept(acBasicInfoBean);
            return;
        }
        bn.c(TAG, "execute request " + ipcRequest.getRequestType() + " error: package " + acBasicInfoBean.getPkgName() + " not valid!");
        ResponseEnum responseEnum3 = ResponseEnum.REMOTE_CALLED_APP_ILLEGAL;
        sendFailResultWithConfig(resultReceiver, responseEnum3.getCode(), responseEnum3.getRemark());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$execute$0(IpcRequest ipcRequest, ResultReceiver resultReceiver, AcBasicInfoBean acBasicInfoBean) {
        ll9 ll9VarA = na.b().a(ipcRequest.getRequestType());
        if (ll9VarA == null) {
            bn.c(TAG, "execute request error");
            ResponseEnum responseEnum = ResponseEnum.REMOTE_REQ_TYPE_ILLEGAL;
            sendFailResultWithConfig(resultReceiver, responseEnum.code, responseEnum.remark);
        } else {
            if ((ll9VarA instanceof rc) && ((rc) ll9VarA).f()) {
                rc.d(this.context);
            }
            ll9VarA.a(this.context, acBasicInfoBean, ipcRequest.getTraceId(), ipcRequest.getParamsJson(), resultReceiver);
        }
    }

    private void sendFailResultWithConfig(ResultReceiver resultReceiver, int i, String str) {
        Bundle failResult = AcResultHelper.getFailResult(str);
        rc.e(failResult);
        AcResultHelper.sendResult(resultReceiver, i, failResult);
    }

    @Override // com.platform.usercenter.account.ams.ipc.IAmsBinder
    public void execute(final IpcRequest ipcRequest, final ResultReceiver resultReceiver) {
        try {
            checkRequestValid(ipcRequest, resultReceiver, new Consumer() { // from class: com.oplus.aiunit.vision.sc
                @Override // androidx.core.util.Consumer
                public final void accept(Object obj) {
                    this.i.lambda$execute$0(ipcRequest, resultReceiver, (AcBasicInfoBean) obj);
                }
            });
        } catch (Exception e2) {
            AcLogUtil.e(TAG, "execute request " + ipcRequest.getRequestType() + " error: " + Log.getStackTraceString(e2));
        }
    }
}
