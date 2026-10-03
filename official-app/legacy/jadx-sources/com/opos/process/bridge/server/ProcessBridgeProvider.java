package com.opos.process.bridge.server;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
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
import java.util.HashMap;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
public class ProcessBridgeProvider extends ContentProvider {
    private static final String TAG = "ProcessBridgeProvider";

    @Override // android.content.ContentProvider
    public Bundle call(String str, String str2, Bundle bundle) {
        bundle.setClassLoader(ProcessBridgeProvider.class.getClassLoader());
        String strDecodeParamsGetTargetClass = BundleUtil.decodeParamsGetTargetClass(bundle);
        Bundle bundle2 = bundle.getBundle(BridgeConstant.KEY_EXTRAS);
        HashMap map = new HashMap();
        if (!BridgeConstant.PROVIDER_DISPATCH_METHOD.equals(str)) {
            ProcessBridgeServer.getInstance().handleException(strDecodeParamsGetTargetClass, getCallingPackage(), BridgeResultCode.CODE_PROVIDER_METHOD_NOT_SUPPORT, "only support method [dispatch]");
            return BundleUtil.makeBundle(BridgeResultCode.CODE_PROVIDER_METHOD_NOT_SUPPORT, "only support method [dispatch]");
        }
        ServerInterceptorContext serverInterceptorContextBuild = new ServerInterceptorContext.Builder().context(getContext()).callingPackage(getCallingPackage()).targetClassName(strDecodeParamsGetTargetClass).inBundle(bundle2).outData(map).build();
        for (ServerInterceptor serverInterceptor : ProcessBridgeServer.getInstance().getServerInterceptors()) {
            InterceptResult interceptResultIntercept = serverInterceptor.intercept(serverInterceptorContextBuild);
            ProcessBridgeLog.d("ProcessBridgeProvider", "ServerInterceptor: " + serverInterceptor.getClass().getName() + ", result:" + interceptResultIntercept);
            if (interceptResultIntercept.isIntercepted()) {
                ProcessBridgeServer.getInstance().handleInterceptorResult(getCallingPackage(), interceptResultIntercept);
                return BundleUtil.makeInterceptorResultBundle(interceptResultIntercept.getCode(), interceptResultIntercept.getMessage());
            }
        }
        IBridgeTargetIdentify iBridgeTargetIdentifyDecodeParamsGetIdentify = BundleUtil.decodeParamsGetIdentify(bundle);
        int iDecodeParamsGetMethodId = BundleUtil.decodeParamsGetMethodId(bundle);
        MethodInterceptorContext methodInterceptorContextBuild = new MethodInterceptorContext.Builder().context(getContext()).callingPackage(getCallingPackage()).inBundle(bundle2).targetClassName(strDecodeParamsGetTargetClass).targetIdentify(iBridgeTargetIdentifyDecodeParamsGetIdentify).methodId(iDecodeParamsGetMethodId).build();
        for (ServerMethodInterceptor serverMethodInterceptor : ProcessBridgeServer.getInstance().getServerMethodInterceptors()) {
            InterceptResult interceptResultIntercept2 = serverMethodInterceptor.intercept(methodInterceptorContextBuild);
            ProcessBridgeLog.d("ProcessBridgeProvider", "ServerMethodInterceptor: " + serverMethodInterceptor.getClass().getName() + ", result:" + interceptResultIntercept2);
            if (interceptResultIntercept2.isIntercepted()) {
                ProcessBridgeServer.getInstance().handleInterceptorResult(getCallingPackage(), interceptResultIntercept2);
                return BundleUtil.makeInterceptorResultBundle(interceptResultIntercept2.getCode(), interceptResultIntercept2.getMessage());
            }
        }
        try {
            Object[] objArrDecodeParamsGetArgs = BundleUtil.decodeParamsGetArgs(bundle);
            ThreadLocalUtil.put(map);
            Bundle bundleDispatch = Dispatcher.getInstance().dispatch(getContext(), getCallingPackage(), strDecodeParamsGetTargetClass, iBridgeTargetIdentifyDecodeParamsGetIdentify, iDecodeParamsGetMethodId, objArrDecodeParamsGetArgs);
            ThreadLocalUtil.remove((Set<String>) map.keySet());
            return bundleDispatch;
        } catch (Exception e2) {
            ProcessBridgeServer.getInstance().handleException(strDecodeParamsGetTargetClass, getCallingPackage(), BridgeResultCode.CODE_REMOTE_EXECUTE_ERROR, e2.getMessage());
            return BundleUtil.makeExceptionBundle(e2);
        }
    }

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        return false;
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }
}
