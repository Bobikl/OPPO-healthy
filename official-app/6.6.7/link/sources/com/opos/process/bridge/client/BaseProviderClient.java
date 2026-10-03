package com.opos.process.bridge.client;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
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

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class BaseProviderClient extends BaseClient {
    private static final String TAG = "BaseProviderClient";
    protected String[] defaultAuthorities;
    private final List<String> mAuthorities;
    private String mAuthority;
    private final AtomicInteger mMultiProcess;
    private String mPackage;

    public BaseProviderClient(Context context, IBridgeTargetIdentify iBridgeTargetIdentify) {
        this(context, iBridgeTargetIdentify, null);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x009d  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6, types: [android.content.ContentProviderClient] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r5v0, types: [com.opos.process.bridge.client.BaseClient, com.opos.process.bridge.client.BaseProviderClient] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4, types: [android.content.ContentProviderClient] */
    /* JADX WARN: Type inference failed for: r5v6, types: [android.content.ContentProviderClient] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    private Bundle callFromRemote(MethodInterceptorContext methodInterceptorContext, Object[] objArr) throws Throwable {
        ?? r5;
        ProcessBridgeLog.d(TAG, "multi process --- call remote");
        Bundle bundleEncodeParams = BundleUtil.encodeParams(methodInterceptorContext.getTargetClassName(), methodInterceptorContext.getTargetIdentify(), methodInterceptorContext.getMethodId(), objArr);
        Bundle bundle = this.mData;
        if (bundle != null) {
            bundleEncodeParams.putBundle(BridgeConstant.KEY_EXTRAS, bundle);
        }
        Uri uri = Uri.parse("content://" + this.mAuthority);
        ProcessBridgeLog.d(TAG, "uri:" + uri.toString() + ",bundle:" + bundleEncodeParams);
        ?? r2 = 0;
        bundleMakeBundle = null;
        Bundle bundleMakeBundle = null;
        try {
            try {
                this = methodInterceptorContext.getContext().getContentResolver().acquireUnstableContentProviderClient(this.mAuthority);
                try {
                    bundleMakeBundle = this == 0 ? BundleUtil.makeBundle(BridgeResultCode.CODE_PROVIDER_CLIENT_ERROR, "acquireUnstableContentProviderClient error") : methodInterceptorContext.getContext().getContentResolver().call(uri, BridgeConstant.PROVIDER_DISPATCH_METHOD, "", bundleEncodeParams);
                    r5 = this;
                    if (this != 0) {
                        r5.release();
                    }
                } catch (Exception e) {
                    e = e;
                    ProcessBridgeLog.e(TAG, "resolve error", e);
                    r5 = this;
                    if (this != 0) {
                    }
                    return bundleMakeBundle;
                }
            } catch (Throwable th) {
                th = th;
                r2 = this;
                if (r2 != 0) {
                    r2.release();
                }
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            this = 0;
        } catch (Throwable th2) {
            th = th2;
            if (r2 != 0) {
                r2.release();
            }
            throw th;
        }
        return bundleMakeBundle;
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

    private void getPackageAndAuthority(Context context) throws BridgeExecuteException {
        if (this.mAuthority == null || this.mPackage == null) {
            PackageManager packageManager = this.mContext.getPackageManager();
            this.mAuthorities.clear();
            this.mTargets.clear();
            String[] strArr = this.defaultAuthorities;
            if (strArr != null) {
                this.mAuthorities.addAll(Arrays.asList(strArr));
            }
            ProcessBridgeLog.v(TAG, "query Authorities:" + StringUtil.listToString(this.mAuthorities));
            for (String strReplace : this.mAuthorities) {
                if (!TextUtils.isEmpty(strReplace)) {
                    if (strReplace.contains(BridgeConstant.APPLICATION_ID)) {
                        strReplace = strReplace.replace(BridgeConstant.APPLICATION_ID, context.getPackageName());
                    }
                    ProviderInfo providerInfoResolveContentProvider = packageManager.resolveContentProvider(strReplace, 128);
                    if (providerInfoResolveContentProvider != null && !TextUtils.isEmpty(providerInfoResolveContentProvider.packageName) && (TextUtils.isEmpty(getTargetClass()) || providerInfoResolveContentProvider.name.equals(getTargetClass()))) {
                        this.mTargets.add(TargetInfo.targetInfoAuthorities(providerInfoResolveContentProvider.packageName, strReplace, providerInfoResolveContentProvider.name));
                    }
                }
            }
            ProcessBridgeLog.v(TAG, "get targets:" + StringUtil.listToString(this.mTargets));
            if (this.mTargets.size() < 1) {
                ProcessBridgeLog.e(TAG, "No target found for all authorities");
                throw new BridgeExecuteException("No target found for all authorities", BridgeResultCode.CODE_NO_VALID_TARGET);
            }
            if (this.serverFilter != null) {
                ProcessBridgeLog.v(TAG, "serverFilter:" + this.serverFilter.getClass().getName());
                TargetInfo targetInfoFilter = this.serverFilter.filter(context, getTargetsClone());
                if (targetInfoFilter == null || !this.mTargets.contains(targetInfoFilter)) {
                    throw new BridgeExecuteException("serverFilter block all app package", BridgeResultCode.CODE_SERVER_FILTER);
                }
                this.mPackage = targetInfoFilter.packageName;
                this.mAuthority = targetInfoFilter.authorities;
                ProcessBridgeLog.v(TAG, "filter package:" + this.mPackage + ", authority:" + this.mAuthority);
                if (TextUtils.isEmpty(this.mAuthority)) {
                    throw new BridgeExecuteException("serverFilter return unknown package", BridgeResultCode.CODE_SERVER_FILTER);
                }
            } else {
                this.mPackage = this.mTargets.get(0).packageName;
                this.mAuthority = this.mTargets.get(0).authorities;
                ProcessBridgeLog.v(TAG, "select first package:" + this.mPackage + ", authority:" + this.mAuthority);
            }
        }
        ProcessBridgeLog.d(TAG, "use package:" + this.mPackage + ", authority:" + this.mAuthority);
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
    public Bundle callRemote(Context context, String str, IBridgeTargetIdentify iBridgeTargetIdentify, int i, Object... objArr) throws BridgeExecuteException {
        ProcessBridgeLog.d(TAG, "callRemote");
        if (!BundleUtil.checkParams(objArr)) {
            return BundleUtil.makeBundle(BridgeResultCode.CODE_INVALID_PARAMS, "Invalid params");
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
        if (this.mAuthority == null || this.mPackage == null) {
            try {
                if (this.lock.tryLock() || this.lock.tryLock((long) this.defaultTimeOut, TimeUnit.MILLISECONDS)) {
                    if (this.mMultiProcess.get() < 0) {
                        getPackageAndAuthority(context);
                    }
                    this.lock.unlock();
                } else {
                    ProcessBridgeLog.d(TAG, "lock fail");
                }
            } catch (InterruptedException e) {
                ProcessBridgeLog.e(TAG, "lock", e);
                try {
                    this.lock.unlock();
                } catch (Exception e2) {
                    ProcessBridgeLog.e(TAG, "unlock", e2);
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("content://");
        sb.append(this.mAuthority);
        return checkMultiProcess(context, Uri.parse(sb.toString())) ? callFromRemote(methodInterceptorContextBuild, objArr) : callInSameProcess(methodInterceptorContextBuild, objArr);
    }

    @Override // com.opos.process.bridge.client.BaseClient
    public void checkMainThread() throws BridgeExecuteException {
        ProcessBridgeLog.d(TAG, "ProviderClient checkMainThread");
    }

    public boolean checkMultiProcess(Context context, Uri uri) {
        ProcessBridgeLog.d(TAG, "checkMultiProcess");
        int i = this.mMultiProcess.get();
        if (i >= 0) {
            return i == 1;
        }
        try {
            String myProcessName = ProcessUtil.getMyProcessName(context.getApplicationContext());
            ProviderInfo providerInfoResolveContentProvider = context.getApplicationContext().getPackageManager().resolveContentProvider(uri.getAuthority(), 128);
            if (providerInfoResolveContentProvider != null && !TextUtils.isEmpty(providerInfoResolveContentProvider.processName) && providerInfoResolveContentProvider.processName.equals(myProcessName)) {
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

    public String getAuthority() throws BridgeExecuteException {
        if (TextUtils.isEmpty(this.mAuthority)) {
            getPackageAndAuthority(this.mContext);
        }
        return this.mAuthority;
    }

    @Override // com.opos.process.bridge.client.BaseClient
    public /* bridge */ /* synthetic */ Bundle getData() {
        return super.getData();
    }

    public String getTargetClass() {
        return null;
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

    public BaseProviderClient(Context context, IBridgeTargetIdentify iBridgeTargetIdentify, Bundle bundle) {
        this.mPackage = null;
        this.mAuthority = null;
        this.mAuthorities = new ArrayList();
        this.defaultAuthorities = null;
        this.mMultiProcess = new AtomicInteger(-1);
        this.mContext = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.mTargetIdentify = iBridgeTargetIdentify;
        this.mData = bundle;
    }
}
