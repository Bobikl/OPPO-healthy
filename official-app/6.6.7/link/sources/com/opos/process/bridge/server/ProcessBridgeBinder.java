package com.opos.process.bridge.server;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.RemoteException;
import com.opos.process.bridge.IBridgeInterface;
import com.opos.process.bridge.annotation.IBridgeTargetIdentify;
import com.opos.process.bridge.base.BridgeConstant;
import com.opos.process.bridge.base.BridgeResultCode;
import com.opos.process.bridge.dispatch.Dispatcher;
import com.opos.process.bridge.interceptor.InterceptResult;
import com.opos.process.bridge.interceptor.MethodInterceptorContext;
import com.opos.process.bridge.interceptor.ServerInterceptor;
import com.opos.process.bridge.interceptor.ServerInterceptorContext;
import com.opos.process.bridge.interceptor.ServerMethodInterceptor;
import com.opos.process.bridge.provider.BundleUtil;
import com.opos.process.bridge.provider.ProcessBridgeLog;
import com.opos.process.bridge.provider.ThreadLocalUtil;
import java.util.Map;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class ProcessBridgeBinder extends IBridgeInterface.Stub {
    private static final String TAG = "ProcessBridgeBinder";
    private final Context mContext;
    private Map<String, Object> mData;

    public ProcessBridgeBinder(Context context, Map<String, Object> map) {
        this.mContext = context;
        this.mData = map;
    }

    @Override // com.opos.process.bridge.IBridgeInterface
    public Bundle executeSync(Bundle bundle) throws RemoteException {
        String str;
        String[] packagesForUid = this.mContext.getPackageManager().getPackagesForUid(Binder.getCallingUid());
        if (packagesForUid == null || packagesForUid.length != 1) {
            ProcessBridgeLog.e(TAG, "could not find correct package name");
            str = "";
        } else {
            str = packagesForUid[0];
            ProcessBridgeLog.d(TAG, "callingPackage:" + str);
        }
        bundle.setClassLoader(ProcessBridgeProvider.class.getClassLoader());
        Bundle bundle2 = bundle.getBundle(BridgeConstant.KEY_EXTRAS);
        String strDecodeParamsGetTargetClass = BundleUtil.decodeParamsGetTargetClass(bundle);
        ServerInterceptorContext serverInterceptorContextBuild = new ServerInterceptorContext.Builder().context(this.mContext).callingPackage(str).targetClassName(strDecodeParamsGetTargetClass).inBundle(bundle2).outData(this.mData).build();
        for (ServerInterceptor serverInterceptor : ProcessBridgeServer.getInstance().getServerInterceptors()) {
            InterceptResult interceptResultIntercept = serverInterceptor.intercept(serverInterceptorContextBuild);
            ProcessBridgeLog.d(TAG, "ServerInterceptor: " + serverInterceptor.getClass().getName() + ", result:" + interceptResultIntercept);
            if (interceptResultIntercept.isIntercepted()) {
                ProcessBridgeServer.getInstance().handleInterceptorResult(str, interceptResultIntercept);
                return BundleUtil.makeInterceptorResultBundle(interceptResultIntercept.getCode(), interceptResultIntercept.getMessage());
            }
        }
        IBridgeTargetIdentify iBridgeTargetIdentifyDecodeParamsGetIdentify = BundleUtil.decodeParamsGetIdentify(bundle);
        int iDecodeParamsGetMethodId = BundleUtil.decodeParamsGetMethodId(bundle);
        MethodInterceptorContext methodInterceptorContextBuild = new MethodInterceptorContext.Builder().context(this.mContext).callingPackage(str).inBundle(bundle2).targetClassName(strDecodeParamsGetTargetClass).targetIdentify(iBridgeTargetIdentifyDecodeParamsGetIdentify).methodId(iDecodeParamsGetMethodId).build();
        for (ServerMethodInterceptor serverMethodInterceptor : ProcessBridgeServer.getInstance().getServerMethodInterceptors()) {
            InterceptResult interceptResultIntercept2 = serverMethodInterceptor.intercept(methodInterceptorContextBuild);
            ProcessBridgeLog.d(TAG, "ServerMethodInterceptor: " + serverMethodInterceptor.getClass().getName() + ", result:" + interceptResultIntercept2);
            if (interceptResultIntercept2.isIntercepted()) {
                ProcessBridgeServer.getInstance().handleInterceptorResult(str, interceptResultIntercept2);
                return BundleUtil.makeInterceptorResultBundle(interceptResultIntercept2.getCode(), interceptResultIntercept2.getMessage());
            }
        }
        try {
            Object[] objArrDecodeParamsGetArgs = BundleUtil.decodeParamsGetArgs(bundle);
            ThreadLocalUtil.put(this.mData);
            Bundle bundleDispatch = Dispatcher.getInstance().dispatch(this.mContext, str, strDecodeParamsGetTargetClass, iBridgeTargetIdentifyDecodeParamsGetIdentify, iDecodeParamsGetMethodId, objArrDecodeParamsGetArgs);
            ThreadLocalUtil.remove(this.mData.keySet());
            return bundleDispatch;
        } catch (Exception e) {
            ProcessBridgeServer.getInstance().handleException(strDecodeParamsGetTargetClass, str, BridgeResultCode.CODE_REMOTE_EXECUTE_ERROR, e.getMessage());
            return BundleUtil.makeExceptionBundle(e);
        }
    }
}
