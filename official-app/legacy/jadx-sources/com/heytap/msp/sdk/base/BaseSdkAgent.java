package com.heytap.msp.sdk.base;

import android.app.Activity;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.os.Handler;
import android.os.IInterface;
import android.os.Looper;
import android.text.TextUtils;
import com.heytap.msp.bean.BaseRequest;
import com.heytap.msp.bean.BizResponse;
import com.heytap.msp.bean.GlobalConfig;
import com.heytap.msp.bean.Request;
import com.heytap.msp.bean.Response;
import com.heytap.msp.sdk.base.callback.AppDownloadDialogDismissCallback;
import com.heytap.msp.sdk.base.callback.Callback;
import com.heytap.msp.sdk.base.callback.HookCallback;
import com.heytap.msp.sdk.base.callback.InternalCallback;
import com.heytap.msp.sdk.base.callback.MSPServerDiedListener;
import com.heytap.msp.sdk.base.callback.NoMainThreadCallback;
import com.heytap.msp.sdk.base.callback.UpgradeCallback;
import com.heytap.msp.sdk.base.common.DialogResourceConfig;
import com.heytap.msp.sdk.base.common.log.MspLog;
import com.heytap.msp.sdk.base.interfaces.IBizAgent;
import com.heytap.msp.sdk.base.interfaces.ISdkConfig;
import com.heytap.msp.sdk.base.interfaces.IServerMsgHandler;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes19.dex */
public class BaseSdkAgent {
    private static final String TAG = "BaseSdkAgent";
    private AppDownloadDialogDismissCallback appDownloadDialogDismissCallback;
    private Map<String, BizCallBackInfo> bizCallbackCache;
    private Map<String, SoftReference<Callback>> bizCallbackSoftCache;
    private Map<String, DialogResourceConfig> dialogResourceConfigs;
    private List<HookCallback> hookCallbackCache;
    private IBizAgent iBiz;
    private ISdkConfig iSdkConfig;
    private Map<String, InternalCallback> innerCallbackCache;
    private Context mContext;
    private List<MSPServerDiedListener> mMspServerStateListeners;
    private Map<String, IServerMsgHandler> mServerMsgHandlers;
    private String ssoId;
    private UpgradeCallback upgradeCallback;
    private static AtomicBoolean initialized = new AtomicBoolean(false);
    private static AtomicBoolean initializing = new AtomicBoolean(false);
    private static AtomicBoolean intercept = new AtomicBoolean(false);
    private static volatile List<String> notInterceptList = new ArrayList();
    private static volatile int sProviderType = -1;
    public static volatile byte sAppDownGuideStatus = -1;

    public static class BaseSdkAgentHolder {
        private static final BaseSdkAgent INSTANCE = new BaseSdkAgent();

        private BaseSdkAgentHolder() {
        }
    }

    public static class BizCallBackInfo {
        public Callback callback;
        public Request request;
    }

    public static BaseSdkAgent getInstance() {
        return BaseSdkAgentHolder.INSTANCE;
    }

    public static AtomicBoolean getIntercept() {
        return intercept;
    }

    public static List<String> getNotInterceptList() {
        return notInterceptList;
    }

    public static AtomicBoolean initialized() {
        return initialized;
    }

    public static AtomicBoolean initializing() {
        return initializing;
    }

    public static void setAppDownGuideStatus(byte b) {
        MspLog.d(TAG, "setAppDownGuideStatus: " + ((int) b));
        sAppDownGuideStatus = b;
    }

    public static void setIntercept(boolean z) {
        intercept.set(z);
    }

    public static void setNotInterceptList(List<String> list) {
        notInterceptList.clear();
        notInterceptList.addAll(list);
    }

    public void addMSPServerDiedListener(MSPServerDiedListener mSPServerDiedListener) {
        this.mMspServerStateListeners.add(mSPServerDiedListener);
    }

    public <U extends IInterface, T extends Response> void connectAppUseAidl(Request request, Class<T> cls) {
        this.iBiz.connectAppUseAidl(request, cls);
    }

    public void destroy() {
        initialized.set(false);
        this.iBiz.destroy();
        this.bizCallbackCache.clear();
        this.bizCallbackSoftCache.clear();
        this.innerCallbackCache.clear();
    }

    public <T extends Response> void dispatchMsg(Request request, InternalCallback<T> internalCallback) {
        String bizNo = request.getBaseRequest().getBizNo();
        if (!TextUtils.isEmpty(bizNo) && this.mServerMsgHandlers.containsKey(bizNo)) {
            this.mServerMsgHandlers.get(bizNo).dispatchRequest(request, internalCallback);
        } else {
            MspLog.e(TAG, "the request bizNo is invalid");
            internalCallback.callback(Response.create(30506, "the request bizNo is invalid"));
        }
    }

    public <T extends Response> void execute(Request request, Class<T> cls) {
        this.iBiz.execute(request, cls);
    }

    public synchronized int findProvider() {
        try {
            ProviderInfo providerInfoResolveContentProvider = this.mContext.getPackageManager().resolveContentProvider(this.mContext.getPackageName() + ".MspFileProvider", 128);
            StringBuilder sb = new StringBuilder();
            sb.append("BaseSdkAgent findProvider MspFileProvider : ");
            sb.append(providerInfoResolveContentProvider == null ? "null" : providerInfoResolveContentProvider.authority);
            MspLog.d(TAG, sb.toString());
            sProviderType = 2;
            if (providerInfoResolveContentProvider == null) {
                ProviderInfo providerInfoResolveContentProvider2 = this.mContext.getPackageManager().resolveContentProvider(this.mContext.getPackageName() + ".fileProvider", 128);
                StringBuilder sb2 = new StringBuilder();
                sb2.append("BaseSdkAgent findProvider pay fileProvider : ");
                sb2.append(providerInfoResolveContentProvider2 == null ? "null" : providerInfoResolveContentProvider2.authority);
                MspLog.d(TAG, sb2.toString());
                sProviderType = 3;
                if (providerInfoResolveContentProvider2 == null) {
                    sProviderType = -1;
                }
            }
        } catch (Exception e2) {
            MspLog.e(TAG, "findProvider: " + e2.getMessage());
        }
        return sProviderType;
    }

    public Context getContext() {
        return this.mContext;
    }

    public DialogResourceConfig getDialogConfig(String str) {
        if (TextUtils.isEmpty(str) || !this.dialogResourceConfigs.containsKey(str)) {
            return null;
        }
        return this.dialogResourceConfigs.get(str);
    }

    public GlobalConfig getGlobalConfig() {
        return this.iSdkConfig.getGlobalConfig();
    }

    public String getMspVersionInfo() {
        return this.iBiz.getMspVersionInfo();
    }

    public int getProviderType() {
        if (sProviderType == -1) {
            MspLog.d(TAG, "BaseSdkAgent getProviderType triggers to findProvider");
            findProvider();
        }
        MspLog.iIgnore(TAG, "ProviderType is " + sProviderType);
        return sProviderType;
    }

    public String getSsoId() {
        return this.ssoId;
    }

    public Activity getTopActivity() {
        return this.iBiz.getTopActivity();
    }

    public UpgradeCallback getUpgradeCallback() {
        return this.upgradeCallback;
    }

    public boolean hasBinder() {
        return this.iBiz.hasBinder();
    }

    public boolean hasUseAppBiz() {
        return this.iSdkConfig.hasUseAppBiz();
    }

    public void init(Context context, IBizAgent iBizAgent, ISdkConfig iSdkConfig, UpgradeCallback upgradeCallback) {
        this.mContext = context.getApplicationContext();
        this.upgradeCallback = upgradeCallback;
        this.iBiz = iBizAgent;
        this.iSdkConfig = iSdkConfig;
    }

    public void initOnSubThread() {
        MspLog.d(TAG, "initOnSubThread");
        this.iBiz.initOnSubThread();
        this.iSdkConfig.initOnSubThread();
    }

    public boolean isInstallAppCustom(Context context) {
        return this.iBiz.isInstallAppCustom(context);
    }

    public boolean isNeedPrestartAppBySdkMeta() {
        return this.iSdkConfig.isNeedPrestartAppBySdkMeta();
    }

    public void moveToBizSoftCache(Request request) {
        Request request2;
        if (request == null || request.getBizRequest() == null || request.getBaseRequest() == null) {
            return;
        }
        String bizNo = request.getBaseRequest().getBizNo();
        String methodName = request.getBizRequest().getMethodName();
        if (TextUtils.isEmpty(methodName) || TextUtils.isEmpty(bizNo)) {
            return;
        }
        Iterator<BizCallBackInfo> it = this.bizCallbackCache.values().iterator();
        while (it.hasNext()) {
            BizCallBackInfo next = it.next();
            if (next != null && (request2 = next.request) != null && request2.getBaseRequest() != null && next.request.getBizRequest() != null && next.callback != null) {
                String bizNo2 = next.request.getBaseRequest().getBizNo();
                String methodName2 = next.request.getBizRequest().getMethodName();
                if (bizNo.equals(bizNo2) && methodName.equals(methodName2)) {
                    this.bizCallbackSoftCache.put(next.request.getRequestId(), new SoftReference<>(next.callback));
                    it.remove();
                }
            }
        }
    }

    public void notifyAllCallback() {
        for (Map.Entry<String, InternalCallback> entry : this.innerCallbackCache.entrySet()) {
            AbstractSdkAgent.MyInternalCallback myInternalCallback = (AbstractSdkAgent.MyInternalCallback) entry.getValue();
            if (myInternalCallback != null) {
                getInstance().notifyInnerCallback(entry.getKey(), Response.create(10502, "Remote exception because of binder's death", myInternalCallback.tClass));
            }
        }
    }

    public <T extends BizResponse> void notifyBizCallback(Request request, final T t) {
        if (request == null) {
            return;
        }
        BizCallBackInfo bizCallBackInfoRemove = this.bizCallbackCache.remove(request.getRequestId());
        final Callback callback = bizCallBackInfoRemove != null ? bizCallBackInfoRemove.callback : null;
        if (callback == null) {
            MspLog.d(TAG, "tempCallback is NULL,requestId:" + request.getRequestId());
            SoftReference<Callback> softReferenceRemove = this.bizCallbackSoftCache.remove(request.getRequestId());
            if (softReferenceRemove != null) {
                callback = softReferenceRemove.get();
            } else {
                MspLog.d(TAG, "softCallback is NULL,requestId:" + request.getRequestId());
            }
            if (callback == null) {
                MspLog.d(TAG, "tempCallback is NULL,interrupt execute,requestId:" + request.getRequestId());
                return;
            }
        }
        if (callback instanceof NoMainThreadCallback) {
            MspLog.d(TAG, "NoMainThreadCallback");
            callback.callback(t);
        } else if (Looper.myLooper() == Looper.getMainLooper()) {
            MspLog.d(TAG, "execute() main Thread,requestId:" + request.getRequestId());
            callback.callback(t);
        } else {
            MspLog.d(TAG, "execute() work Thread,requestId" + request.getRequestId());
            Handler handler = new Handler(Looper.getMainLooper());
            MspLog.d(TAG, "execute() handler create");
            handler.post(new Runnable() { // from class: com.heytap.msp.sdk.base.BaseSdkAgent.1
                @Override // java.lang.Runnable
                public void run() {
                    MspLog.d(BaseSdkAgent.TAG, "execute() callback");
                    callback.callback(t);
                }
            });
        }
        moveToBizSoftCache(request);
    }

    public void notifyDownloadDialogDismiss(int i) {
        AppDownloadDialogDismissCallback appDownloadDialogDismissCallback = this.appDownloadDialogDismissCallback;
        if (appDownloadDialogDismissCallback != null) {
            appDownloadDialogDismissCallback.onDismiss(i);
        }
    }

    public void notifyHookCallback(Request request, BizResponse bizResponse) {
        if (request == null || bizResponse == null) {
            return;
        }
        for (HookCallback hookCallback : this.hookCallbackCache) {
            if (hookCallback != null) {
                hookCallback.callback(request, bizResponse);
            }
        }
    }

    public <T extends Response> void notifyInnerCallback(Request request, T t) {
        InternalCallback internalCallbackRemove;
        if (request == null || (internalCallbackRemove = this.innerCallbackCache.remove(request.getRequestId())) == null) {
            return;
        }
        internalCallbackRemove.callback(t);
    }

    public void notifyServerDiedListener() {
        Iterator<MSPServerDiedListener> it = this.mMspServerStateListeners.iterator();
        while (it.hasNext()) {
            it.next().onServerDied();
        }
    }

    public void onKeyPath(int i, Request request, Object... objArr) {
        IBizAgent iBizAgent = this.iBiz;
        if (iBizAgent != null) {
            iBizAgent.onKeyPath(i, request, objArr);
        }
    }

    public void putBizCallbackCache(Request request, Callback callback) {
        if (request == null || callback == null) {
            return;
        }
        BizCallBackInfo bizCallBackInfo = new BizCallBackInfo();
        bizCallBackInfo.request = request;
        bizCallBackInfo.callback = callback;
        this.bizCallbackCache.put(request.getRequestId(), bizCallBackInfo);
    }

    public void putHookCallbackCache(HookCallback hookCallback) {
        if (hookCallback == null || this.hookCallbackCache.contains(hookCallback)) {
            return;
        }
        this.hookCallbackCache.add(hookCallback);
    }

    public void putInterCallbackCache(Request request, InternalCallback internalCallback) {
        if (request == null || internalCallback == null) {
            return;
        }
        this.innerCallbackCache.put(request.getRequestId(), internalCallback);
    }

    public void reInitCompatibleInfo() {
        this.iSdkConfig.initCompatibleInfo();
    }

    public void registerAppDownloadDialogDismissCallback(AppDownloadDialogDismissCallback appDownloadDialogDismissCallback) {
        this.appDownloadDialogDismissCallback = appDownloadDialogDismissCallback;
    }

    public void registerServerMsgHandler(String str, IServerMsgHandler iServerMsgHandler) {
        this.mServerMsgHandlers.put(str, iServerMsgHandler);
    }

    public void removeAllBizCallbacks() {
        this.bizCallbackCache.clear();
        this.bizCallbackSoftCache.clear();
    }

    public void removeBizCallback(Callback callback) {
        if (callback != null) {
            Iterator<BizCallBackInfo> it = this.bizCallbackCache.values().iterator();
            while (it.hasNext()) {
                if (Objects.equals(it.next().callback, callback)) {
                    it.remove();
                }
            }
        }
    }

    public void removeInterCallback(InternalCallback internalCallback) {
        if (internalCallback != null) {
            Iterator<InternalCallback> it = this.innerCallbackCache.values().iterator();
            while (it.hasNext()) {
                if (Objects.equals(it.next(), internalCallback)) {
                    it.remove();
                }
            }
        }
    }

    public void setDialogResourceConfig(String str, DialogResourceConfig dialogResourceConfig) {
        if (TextUtils.isEmpty(str) || dialogResourceConfig == null) {
            return;
        }
        this.dialogResourceConfigs.put(str, dialogResourceConfig);
    }

    public void setSsoId(String str) {
        this.ssoId = str;
    }

    public boolean shouldUseApp(BaseRequest baseRequest) {
        return this.iSdkConfig.shouldUseApp(baseRequest);
    }

    public void syncMspVersionInfo() {
        this.iBiz.syncMspVersionInfo();
    }

    public void tryToReqGlobalConfig() {
        this.iSdkConfig.tryToReqGlobalConfig();
    }

    private BaseSdkAgent() {
        this.ssoId = "";
        this.dialogResourceConfigs = new HashMap();
        this.mServerMsgHandlers = new HashMap();
        this.bizCallbackCache = new ConcurrentHashMap(5);
        this.bizCallbackSoftCache = new ConcurrentHashMap(5);
        this.innerCallbackCache = new ConcurrentHashMap(5);
        this.mMspServerStateListeners = new CopyOnWriteArrayList();
        this.hookCallbackCache = new CopyOnWriteArrayList();
    }

    public <T extends Response> void notifyInnerCallback(String str, T t) {
        InternalCallback internalCallbackRemove;
        if (TextUtils.isEmpty(str) || (internalCallbackRemove = this.innerCallbackCache.remove(str)) == null) {
            return;
        }
        internalCallbackRemove.callback(t);
    }

    public <T extends Response> T dispatchMsg(Request request) {
        String bizNo = request.getBaseRequest().getBizNo();
        if (!TextUtils.isEmpty(bizNo) && this.mServerMsgHandlers.containsKey(bizNo)) {
            return (T) this.mServerMsgHandlers.get(bizNo).dispatchRequest(request);
        }
        MspLog.e(TAG, "the request bizNo is invalid");
        return (T) Response.create(30506, "the request bizNo is invalid");
    }
}
