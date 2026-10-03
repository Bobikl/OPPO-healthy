package com.opos.process.bridge.client;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import com.opos.process.bridge.IBridgeInterface;
import com.opos.process.bridge.annotation.IBridgeTargetIdentify;
import com.opos.process.bridge.base.BridgeConstant;
import com.opos.process.bridge.base.BridgeResultCode;
import com.opos.process.bridge.dispatch.Dispatcher;
import com.opos.process.bridge.interceptor.ClientMethodInterceptor;
import com.opos.process.bridge.interceptor.InterceptResult;
import com.opos.process.bridge.interceptor.MethodInterceptorContext;
import com.opos.process.bridge.interceptor.ServerFilter;
import com.opos.process.bridge.interceptor.ServerInterceptor;
import com.opos.process.bridge.interceptor.ServerInterceptorContext;
import com.opos.process.bridge.interceptor.ServerMethodInterceptor;
import com.opos.process.bridge.provider.BridgeDispatchException;
import com.opos.process.bridge.provider.BridgeExecuteException;
import com.opos.process.bridge.provider.BundleUtil;
import com.opos.process.bridge.provider.ProcessBridgeLog;
import com.opos.process.bridge.provider.StringUtil;
import com.opos.process.bridge.provider.ThreadLocalUtil;
import com.opos.process.bridge.server.ProcessBridgeServer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes9.dex */
public class BaseServiceClient extends BaseClient {
    private static final String TAG = "BaseServiceClient";
    protected IBinder baseBinder;
    private ServiceListener binderListener;
    protected String[] defaultActions;
    protected String mAction;
    protected List<String> mActions;
    protected AtomicInteger mMultiProcess;
    protected String mPackage;
    private ServiceListener serviceListener;

    public interface ServiceListener {
        void onServiceConnected(ComponentName componentName);

        void onServiceDisconnected(ComponentName componentName);
    }

    public BaseServiceClient(Context context, IBridgeTargetIdentify iBridgeTargetIdentify) {
        this(context, iBridgeTargetIdentify, null);
    }

    private Bundle callFromRemote(MethodInterceptorContext methodInterceptorContext, Object[] objArr) throws BridgeExecuteException {
        IBinder iBinder = this.baseBinder;
        if (iBinder == null) {
            ProcessBridgeLog.e(TAG, "baseBinder is NULL");
            return BundleUtil.makeBundle(101005, "connect error");
        }
        IBridgeInterface iBridgeInterfaceAsInterface = IBridgeInterface.Stub.asInterface(iBinder);
        Bundle bundleEncodeParams = BundleUtil.encodeParams(methodInterceptorContext.getTargetClassName(), methodInterceptorContext.getTargetIdentify(), methodInterceptorContext.getMethodId(), objArr);
        Bundle bundle = this.mData;
        if (bundle != null) {
            bundleEncodeParams.putBundle(BridgeConstant.KEY_EXTRAS, bundle);
        }
        try {
            ProcessBridgeLog.v(TAG, "bundle:" + bundleEncodeParams);
            return iBridgeInterfaceAsInterface.executeSync(bundleEncodeParams);
        } catch (RemoteException e2) {
            ProcessBridgeLog.e(TAG, "executeSync", e2);
            throw new BridgeExecuteException(e2, 101007);
        }
    }

    private Bundle callInSameProcess(MethodInterceptorContext methodInterceptorContext, Object[] objArr) {
        ProcessBridgeLog.d(TAG, "same process --- call direct dispatch");
        HashMap map = new HashMap();
        ServerInterceptorContext serverInterceptorContextBuild = new ServerInterceptorContext.Builder().context(methodInterceptorContext.getContext()).callingPackage(methodInterceptorContext.getCallingPackage()).targetClassName(methodInterceptorContext.getTargetClassName()).inBundle(this.mData).outData(map).build();
        ProcessBridgeLog.v(TAG, "call serverInterceptors");
        for (ServerInterceptor serverInterceptor : ProcessBridgeServer.getInstance().getServerInterceptors()) {
            InterceptResult interceptResultIntercept = serverInterceptor.intercept(serverInterceptorContextBuild);
            ProcessBridgeLog.v(TAG, "serverInterceptor --- interceptor:" + serverInterceptor.getClass().getName() + ", result:" + interceptResultIntercept.toString());
            if (interceptResultIntercept.isIntercepted()) {
                return BundleUtil.makeBundle(interceptResultIntercept.getCode(), interceptResultIntercept.getMessage());
            }
        }
        ProcessBridgeLog.v(TAG, "ServerInterceptor savedMap:" + map);
        ProcessBridgeLog.v(TAG, "call serverMethodInterceptors");
        for (ServerMethodInterceptor serverMethodInterceptor : ProcessBridgeServer.getInstance().getServerMethodInterceptors()) {
            InterceptResult interceptResultIntercept2 = serverMethodInterceptor.intercept(methodInterceptorContext);
            ProcessBridgeLog.v(TAG, "serverMethodInterceptor --- interceptor:" + serverMethodInterceptor.getClass().getName() + ", result:" + interceptResultIntercept2.toString());
            if (interceptResultIntercept2.isIntercepted()) {
                return BundleUtil.makeBundle(interceptResultIntercept2.getCode(), interceptResultIntercept2.getMessage());
            }
        }
        ProcessBridgeLog.d(TAG, "save map and call Dispatch");
        ThreadLocalUtil.put(map);
        Bundle bundleDispatch = Dispatcher.getInstance().dispatch(methodInterceptorContext.getContext(), methodInterceptorContext.getCallingPackage(), methodInterceptorContext.getTargetClassName(), methodInterceptorContext.getTargetIdentify(), methodInterceptorContext.getMethodId(), objArr);
        ThreadLocalUtil.remove((Set<String>) map.keySet());
        return bundleDispatch;
    }

    private void getBinder(Context context) throws BridgeExecuteException {
        if (this.baseBinder != null) {
            ProcessBridgeLog.d(TAG, "get Binder");
            return;
        }
        ProcessBridgeLog.d(TAG, "use package:" + this.mPackage + ", action:" + this.mAction);
        this.baseBinder = BinderManager.getInstance().getBinderSync(context, getServiceIntent(this.mPackage, getTargetClass(), this.mAction, this.mData), this.defaultTimeOut, this.binderListener);
    }

    private void getPackageAndAction(Context context) throws BridgeExecuteException {
        if (this.mAction == null || this.mPackage == null) {
            PackageManager packageManager = this.mContext.getPackageManager();
            this.mActions.clear();
            this.mTargets.clear();
            String[] strArr = this.defaultActions;
            if (strArr != null) {
                this.mActions.addAll(Arrays.asList(strArr));
            }
            ProcessBridgeLog.v(TAG, "query actions:" + StringUtil.listToString(this.mActions));
            for (String strReplace : this.mActions) {
                if (!TextUtils.isEmpty(strReplace)) {
                    if (strReplace.contains("${applicationId}")) {
                        strReplace = strReplace.replace("${applicationId}", context.getPackageName());
                    }
                    for (ResolveInfo resolveInfo : packageManager.queryIntentServices(getServiceIntent(this.mPackage, getTargetClass(), strReplace, null), 128)) {
                        ServiceInfo serviceInfo = resolveInfo.serviceInfo;
                        if (serviceInfo != null && !TextUtils.isEmpty(serviceInfo.packageName)) {
                            List<TargetInfo> list = this.mTargets;
                            ServiceInfo serviceInfo2 = resolveInfo.serviceInfo;
                            list.add(TargetInfo.targetInfoAction(serviceInfo2.packageName, strReplace, serviceInfo2.name));
                        }
                    }
                }
            }
            ProcessBridgeLog.v(TAG, "get targets:" + StringUtil.listToString(this.mTargets));
            if (this.mTargets.size() < 1) {
                ProcessBridgeLog.e(TAG, "No target found for all actions");
                throw new BridgeExecuteException("No target found for all actions", 101001);
            }
            if (this.serverFilter == null) {
                this.mPackage = this.mTargets.get(0).packageName;
                this.mAction = this.mTargets.get(0).action;
                ProcessBridgeLog.v(TAG, "select first package:" + this.mPackage + ", action:" + this.mAction);
                return;
            }
            ProcessBridgeLog.v(TAG, "serverFilter:" + this.serverFilter.getClass().getName());
            TargetInfo targetInfoFilter = this.serverFilter.filter(context, getTargetsClone());
            if (targetInfoFilter == null || !this.mTargets.contains(targetInfoFilter)) {
                throw new BridgeExecuteException("serverFilter block all app package", 101003);
            }
            this.mPackage = targetInfoFilter.packageName;
            this.mAction = targetInfoFilter.action;
            ProcessBridgeLog.v(TAG, "filter package:" + this.mPackage + ", action:" + this.mAction);
            if (TextUtils.isEmpty(this.mAction)) {
                throw new BridgeExecuteException("serverFilter return unknown package", 101003);
            }
        }
    }

    @Override // com.opos.process.bridge.client.BaseClient
    public /* bridge */ /* synthetic */ void addClientMethodInterceptor(ClientMethodInterceptor clientMethodInterceptor) {
        super.addClientMethodInterceptor(clientMethodInterceptor);
    }

    @Override // com.opos.process.bridge.client.BaseClient
    public void call(Context context, String str, IBridgeTargetIdentify iBridgeTargetIdentify, int i, Object... objArr) throws BridgeExecuteException, BridgeDispatchException {
        ProcessBridgeLog.d(TAG, "call method call");
        super.call(context, str, iBridgeTargetIdentify, i, objArr);
    }

    @Override // com.opos.process.bridge.client.BaseClient
    public Object callForResult(Context context, String str, IBridgeTargetIdentify iBridgeTargetIdentify, int i, Object... objArr) throws BridgeExecuteException, BridgeDispatchException {
        ProcessBridgeLog.d(TAG, "callForResult method call");
        return super.callForResult(context, str, iBridgeTargetIdentify, i, objArr);
    }

    @Override // com.opos.process.bridge.client.BaseClient
    public Bundle callRemote(Context context, String str, IBridgeTargetIdentify iBridgeTargetIdentify, int i, Object... objArr) throws BridgeExecuteException, BridgeDispatchException {
        ProcessBridgeLog.d(TAG, "callRemote");
        if (!BundleUtil.checkParams(objArr)) {
            return BundleUtil.makeBundle(101006, "Invalid params");
        }
        MethodInterceptorContext methodInterceptorContextBuild = new MethodInterceptorContext.Builder().context(context).callingPackage(context.getPackageName()).inBundle(this.mData).targetClassName(str).targetIdentify(iBridgeTargetIdentify).methodId(i).build();
        ProcessBridgeLog.v(TAG, "call clientMethodInterceptors");
        for (ClientMethodInterceptor clientMethodInterceptor : this.clientMethodInterceptors) {
            InterceptResult interceptResultIntercept = clientMethodInterceptor.intercept(methodInterceptorContextBuild);
            ProcessBridgeLog.v(TAG, "clientMethodInterceptor --- interceptor:" + clientMethodInterceptor.getClass().getName() + ", result:" + interceptResultIntercept.toString());
            if (interceptResultIntercept.isIntercepted()) {
                throw new BridgeExecuteException(interceptResultIntercept.getMessage(), interceptResultIntercept.getCode());
            }
        }
        if (this.baseBinder == null) {
            if (this.mAction == null || this.mPackage == null) {
                try {
                    ProcessBridgeLog.d(TAG, "try to lock");
                    if (this.lock.tryLock() || this.lock.tryLock((long) this.defaultTimeOut, TimeUnit.MILLISECONDS)) {
                        getPackageAndAction(context);
                        this.lock.unlock();
                    } else {
                        ProcessBridgeLog.d(TAG, "lock fail");
                    }
                } catch (InterruptedException e2) {
                    ProcessBridgeLog.e(TAG, "lock", e2);
                    try {
                        this.lock.unlock();
                    } catch (Exception e3) {
                        ProcessBridgeLog.e(TAG, "unlock", e3);
                    }
                }
                if (checkMultiProcess(context)) {
                    ProcessBridgeLog.d(TAG, "getBinder");
                    getBinder(context);
                }
            } else if (checkMultiProcess(context)) {
                ProcessBridgeLog.d(TAG, "getBinder use exist package & action");
                getBinder(context);
            }
        }
        int i2 = this.mMultiProcess.get();
        if (i2 > 0) {
            return callFromRemote(methodInterceptorContextBuild, objArr);
        }
        if (i2 == 0) {
            return callInSameProcess(methodInterceptorContextBuild, objArr);
        }
        throw new BridgeExecuteException("not init", -1);
    }

    @Override // com.opos.process.bridge.client.BaseClient
    public void checkMainThread() throws BridgeExecuteException {
        ProcessBridgeLog.d(TAG, "ServiceClient checkMainThread");
        if (Looper.myLooper() == Looper.getMainLooper()) {
            throw new BridgeExecuteException("MainThread call not allowed", BridgeResultCode.CODE_MAIN_THREAD_CALL);
        }
    }

    public boolean checkMultiProcess(Context context) {
        ProcessBridgeLog.d(TAG, "checkMultiProcess");
        int i = this.mMultiProcess.get();
        if (i >= 0) {
            return i == 1;
        }
        try {
            String myProcessName = ProcessUtil.getMyProcessName(context.getApplicationContext());
            ResolveInfo resolveInfoResolveService = context.getApplicationContext().getPackageManager().resolveService(getServiceIntent(this.mPackage, getTargetClass(), this.mAction, null), 128);
            if (resolveInfoResolveService != null && !TextUtils.isEmpty(resolveInfoResolveService.serviceInfo.processName) && resolveInfoResolveService.serviceInfo.processName.equals(myProcessName)) {
                this.mMultiProcess.compareAndSet(-1, 0);
                return false;
            }
        } catch (Exception unused) {
        }
        this.mMultiProcess.compareAndSet(-1, 1);
        return true;
    }

    @Override // com.opos.process.bridge.client.BaseClient
    public /* bridge */ /* synthetic */ void checkNullResultType(Object obj, Class cls) throws BridgeExecuteException {
        super.checkNullResultType(obj, cls);
    }

    @Override // com.opos.process.bridge.client.BaseClient
    public /* bridge */ /* synthetic */ void clearClientMethodInterceptor() {
        super.clearClientMethodInterceptor();
    }

    public final void destroyClient() {
        this.serviceListener = null;
        this.baseBinder = null;
        BinderManager.getInstance().freeBinder(this.mContext, getServiceIntent(this.mPackage, getTargetClass(), this.mAction, this.mData), this.binderListener);
        this.mTargets.clear();
        this.mPackage = "";
        this.mAction = "";
    }

    @Override // com.opos.process.bridge.client.BaseClient
    public /* bridge */ /* synthetic */ Bundle getData() {
        return super.getData();
    }

    public Intent getServiceIntent(String str, String str2, String str3, Bundle bundle) {
        ProcessBridgeLog.d(TAG, "getServiceIntent --- packageName:" + str + ", targetClass:" + str2 + ", action" + str3 + ", bundle:" + bundle);
        Intent intent = new Intent();
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            intent.setComponent(new ComponentName(str, str2));
        }
        intent.setPackage(str);
        intent.setAction(str3);
        intent.putExtra(BridgeConstant.KEY_CALLING_PACKAGE, this.mContext.getPackageName());
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        return intent;
    }

    public String getTargetClass() {
        return null;
    }

    public void preLink() throws BridgeExecuteException {
        if (this.mAction == null || this.mPackage == null) {
            getPackageAndAction(this.mContext);
        }
        ProcessBridgeLog.d(TAG, "preLink package:" + this.mPackage + ", action:" + this.mAction);
        if (this.baseBinder == null) {
            BinderManager.getInstance().getBinderAsync(this.mContext, getServiceIntent(this.mPackage, getTargetClass(), this.mAction, this.mData), this.serviceListener);
        }
    }

    @Override // com.opos.process.bridge.client.BaseClient
    public /* bridge */ /* synthetic */ boolean removeClientMethodInterceptor(ClientMethodInterceptor clientMethodInterceptor) {
        return super.removeClientMethodInterceptor(clientMethodInterceptor);
    }

    @Override // com.opos.process.bridge.client.BaseClient
    public /* bridge */ /* synthetic */ void setDefaultTimeOut(int i) {
        super.setDefaultTimeOut(i);
    }

    @Override // com.opos.process.bridge.client.BaseClient
    public /* bridge */ /* synthetic */ void setServerFilter(ServerFilter serverFilter) {
        super.setServerFilter(serverFilter);
    }

    public void setServiceListener(ServiceListener serviceListener) {
        this.serviceListener = serviceListener;
    }

    public BaseServiceClient(Context context, IBridgeTargetIdentify iBridgeTargetIdentify, Bundle bundle) {
        this.defaultActions = null;
        this.mMultiProcess = new AtomicInteger(-1);
        this.mPackage = null;
        this.mAction = null;
        this.mActions = new ArrayList();
        this.serviceListener = null;
        this.binderListener = new ServiceListener() { // from class: com.opos.process.bridge.client.BaseServiceClient.1
            @Override // com.opos.process.bridge.client.BaseServiceClient.ServiceListener
            public void onServiceConnected(ComponentName componentName) {
                ProcessBridgeLog.d(BaseServiceClient.TAG, "onServiceConnected:" + componentName);
                if (BaseServiceClient.this.serviceListener != null) {
                    BaseServiceClient.this.serviceListener.onServiceConnected(componentName);
                }
            }

            @Override // com.opos.process.bridge.client.BaseServiceClient.ServiceListener
            public void onServiceDisconnected(ComponentName componentName) {
                ProcessBridgeLog.d(BaseServiceClient.TAG, "onServiceDisconnected:" + componentName);
                ProcessBridgeLog.d(BaseServiceClient.TAG, "mPackage:" + BaseServiceClient.this.mPackage + ", targetClass:" + BaseServiceClient.this.getTargetClass());
                ProcessBridgeLog.d(BaseServiceClient.TAG, "reset baseBinder to null");
                BaseServiceClient baseServiceClient = BaseServiceClient.this;
                baseServiceClient.baseBinder = null;
                if (baseServiceClient.serviceListener != null) {
                    BaseServiceClient.this.serviceListener.onServiceDisconnected(componentName);
                }
            }
        };
        this.mContext = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.mTargetIdentify = iBridgeTargetIdentify;
        this.mData = bundle;
    }

    public Intent getServiceIntent() throws BridgeExecuteException {
        if (TextUtils.isEmpty(this.mPackage) || TextUtils.isEmpty(this.mAction)) {
            getPackageAndAction(this.mContext);
        }
        return getServiceIntent(this.mPackage, getTargetClass(), this.mAction, this.mData);
    }
}
