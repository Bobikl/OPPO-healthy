package com.opos.process.bridge.dispatch;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import com.heytap.log.kit.server.HLogSdkServiceModule;
import com.heytap.msp.hlog.kit.ICallback;
import com.opos.process.bridge.annotation.IBridgeTargetIdentify;
import com.opos.process.bridge.base.BridgeResultCode;
import com.opos.process.bridge.provider.BundleUtil;
import com.opos.process.bridge.server.ProcessBridgeServer;

/* JADX INFO: loaded from: classes9.dex */
public final class HLogSdkServiceModule$Dispatcher implements IDispatcher {
    public static final String TARGET_CLASS = "com.heytap.log.kit.server.HLogSdkServiceModule";

    public static void init() {
        Dispatcher.getInstance().register("com.heytap.log.kit.server.HLogSdkServiceModule", new HLogSdkServiceModule$Dispatcher());
    }

    @Override // com.opos.process.bridge.dispatch.IDispatcher
    public Bundle dispatch(Context context, String str, IBridgeTargetIdentify iBridgeTargetIdentify, int i, Object[] objArr) {
        Object obj;
        Object obj2;
        Object obj3;
        if (i == 1) {
            if (2 == objArr.length && (((obj = objArr[0]) == null || (obj instanceof Bundle)) && ((obj2 = objArr[1]) == null || (obj2 instanceof IBinder)))) {
                ((HLogSdkServiceModule) HLogSdkServiceModule.FACTORY.getInstance(context, iBridgeTargetIdentify)).requestLogFile((Bundle) objArr[0], ICallback.Stub.asInterface((IBinder) objArr[1]));
                return BundleUtil.makeBundle(0, "");
            }
            ProcessBridgeServer.getInstance().handleException("com.heytap.log.kit.server.HLogSdkServiceModule", str, BridgeResultCode.CODE_REMOTE_PARAMS_NOT_MATCH, "received params not match");
            return BundleUtil.makeBundle(BridgeResultCode.CODE_REMOTE_PARAMS_NOT_MATCH, "received params not match");
        }
        if (i != 2) {
            return BundleUtil.makeBundle(BridgeResultCode.CODE_METHOD_NOT_FOUND, "methodId:" + i);
        }
        if (1 == objArr.length && ((obj3 = objArr[0]) == null || (obj3 instanceof Bundle))) {
            return BundleUtil.packageBundle(Boolean.valueOf(((HLogSdkServiceModule) HLogSdkServiceModule.FACTORY.getInstance(context, iBridgeTargetIdentify)).startSalvageLog((Bundle) objArr[0])), Boolean.TYPE);
        }
        ProcessBridgeServer.getInstance().handleException("com.heytap.log.kit.server.HLogSdkServiceModule", str, BridgeResultCode.CODE_REMOTE_PARAMS_NOT_MATCH, "received params not match");
        return BundleUtil.makeBundle(BridgeResultCode.CODE_REMOTE_PARAMS_NOT_MATCH, "received params not match");
    }
}
