package com.opos.process.bridge.dispatch;

import android.app.Activity;
import android.os.Bundle;
import com.opos.process.bridge.base.BridgeConstant;
import com.opos.process.bridge.base.BridgeResultCode;
import com.opos.process.bridge.interceptor.InterceptResult;
import com.opos.process.bridge.interceptor.MethodInterceptorContext;
import com.opos.process.bridge.interceptor.ServerInterceptor;
import com.opos.process.bridge.interceptor.ServerInterceptorContext;
import com.opos.process.bridge.interceptor.ServerMethodInterceptor;
import com.opos.process.bridge.provider.BundleUtil;
import com.opos.process.bridge.provider.ProcessBridgeLog;
import com.opos.process.bridge.provider.ThreadLocalUtil;
import com.opos.process.bridge.server.ProcessBridgeServer;
import java.util.HashMap;
import java.util.Set;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public abstract class BaseActivityDispatcher implements IActivityDispatcher {
    private static final String TAG = "BaseActivityDispatcher";

    @Override // com.opos.process.bridge.dispatch.IActivityDispatcher
    public void dispatch(Activity activity) {
        ProcessBridgeLog.d(TAG, "dispatch this");
        if (activity.getIntent() == null || activity.getIntent().getExtras() == null) {
            activity.finish();
            return;
        }
        Bundle bundle = activity.getIntent().getExtras().getBundle(BridgeConstant.KEY_EXTRAS);
        HashMap map = new HashMap();
        String strDecodeParamsGetTargetClass = BundleUtil.decodeParamsGetTargetClass(activity.getIntent().getExtras());
        ServerInterceptorContext serverInterceptorContextBuild = new ServerInterceptorContext.Builder().context(activity).callingPackage(activity.getCallingPackage()).targetClassName(strDecodeParamsGetTargetClass).inBundle(bundle).outData(map).build();
        for (ServerInterceptor serverInterceptor : ProcessBridgeServer.getInstance().getServerInterceptors()) {
            InterceptResult interceptResultIntercept = serverInterceptor.intercept(serverInterceptorContextBuild);
            ProcessBridgeLog.d(TAG, "ServerInterceptor: " + serverInterceptor.getClass().getName() + ", result:" + interceptResultIntercept);
            if (interceptResultIntercept.isIntercepted()) {
                ProcessBridgeServer.getInstance().handleInterceptorResult(activity.getCallingPackage(), interceptResultIntercept);
                activity.finish();
                return;
            }
        }
        int iDecodeParamsGetMethodId = BundleUtil.decodeParamsGetMethodId(activity.getIntent().getExtras());
        ProcessBridgeLog.d(TAG, "targetClass:" + strDecodeParamsGetTargetClass + ", methodId:" + iDecodeParamsGetMethodId);
        MethodInterceptorContext methodInterceptorContextBuild = new MethodInterceptorContext.Builder().context(activity).callingPackage(activity.getCallingPackage()).inBundle(bundle).targetClassName(strDecodeParamsGetTargetClass).methodId(iDecodeParamsGetMethodId).build();
        for (ServerMethodInterceptor serverMethodInterceptor : ProcessBridgeServer.getInstance().getServerMethodInterceptors()) {
            InterceptResult interceptResultIntercept2 = serverMethodInterceptor.intercept(methodInterceptorContextBuild);
            ProcessBridgeLog.d(TAG, "ServerMethodInterceptor: " + serverMethodInterceptor.getClass().getName() + ", result:" + interceptResultIntercept2);
            if (interceptResultIntercept2.isIntercepted()) {
                ProcessBridgeServer.getInstance().handleInterceptorResult(activity.getCallingPackage(), interceptResultIntercept2);
                activity.finish();
                return;
            }
        }
        try {
            Object[] objArrDecodeParamsGetArgs = BundleUtil.decodeParamsGetArgs(activity.getIntent().getExtras());
            ThreadLocalUtil.put(map);
            ProcessBridgeLog.d(TAG, "dispatch ");
            dispatch(activity, strDecodeParamsGetTargetClass, iDecodeParamsGetMethodId, objArrDecodeParamsGetArgs);
            ThreadLocalUtil.remove((Set<String>) map.keySet());
        } catch (Exception e) {
            ProcessBridgeServer.getInstance().handleException(activity.getClass().getName(), activity.getCallingPackage(), BridgeResultCode.CODE_REMOTE_EXECUTE_ERROR, e.getMessage());
        }
    }

    public abstract void dispatch(Activity activity, String str, int i, Object[] objArr);
}
