package com.heytap.msp.sdk.base;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.heytap.msp.bean.BaseRequest;
import com.heytap.msp.bean.BizRequest;
import com.heytap.msp.bean.BizResponse;
import com.heytap.msp.bean.Request;
import com.heytap.msp.bean.Response;
import com.heytap.msp.sdk.base.callback.Callback;
import com.heytap.msp.sdk.base.callback.InternalCallback;
import com.heytap.msp.sdk.base.common.log.MspLog;
import com.heytap.msp.sdk.base.common.util.AppUtils;
import com.heytap.msp.sdk.base.common.util.JsonUtil;
import com.heytap.msp.sdk.base.interfaces.IServerMsgHandler;

/* JADX INFO: loaded from: classes19.dex */
public abstract class AbstractSdkAgent implements IServerMsgHandler {
    private static final String TAG = "AbsSdkAgent";
    protected String originAppPackageName = "";

    public class MyInternalCallback<T extends Response, U> implements InternalCallback<T> {
        private Request request;
        private Class<U> sClass;
        public Class<T> tClass;

        public MyInternalCallback(Request request, Class<U> cls, Class<T> cls2) {
            this.request = request;
            this.sClass = cls;
            this.tClass = cls2;
        }

        @Override // com.heytap.msp.sdk.base.callback.InternalCallback
        public void callback(T t) {
            if (this.request == null || t == null) {
                return;
            }
            BizResponse bizResponse = new BizResponse();
            bizResponse.setCode(t.getCode());
            bizResponse.setMessage(t.getMessage());
            bizResponse.setTraceId(this.request.getBaseRequest().getTraceId());
            Class<U> cls = this.sClass;
            if (cls != null) {
                bizResponse.setResponse(AbstractSdkAgent.this.parseResponse(t, cls));
            }
            BaseSdkAgent.getInstance().notifyBizCallback(this.request, bizResponse);
            BaseSdkAgent.getInstance().notifyHookCallback(this.request, bizResponse);
            BaseSdkAgent.getInstance().onKeyPath(3, this.request, bizResponse);
        }
    }

    public AbstractSdkAgent() {
        BaseSdkAgent.getInstance().registerServerMsgHandler(getBizNo(), this);
    }

    private <R> BizRequest<R> getBizRequest(boolean z, R r, String str) {
        return z ? getRemoteBizRequest(r, str) : getLocalBizRequest(r, str);
    }

    @Override // com.heytap.msp.sdk.base.interfaces.IServerMsgHandler
    public <T extends Response> void dispatchRequest(Request request, InternalCallback<T> internalCallback) {
        MspLog.d(TAG, "AbstractSdkAgent dispatchMsg() " + request.toString());
        if (internalCallback != null) {
            internalCallback.callback(processRequest(request));
        }
    }

    public <T extends Response, R> void execute(String str, Class<T> cls, Callback<BizResponse<R>> callback, @Nullable Class<R> cls2) {
        execute(null, str, cls, callback, cls2);
    }

    public abstract <T extends Response> void executeLocal(Request request, String str, Class<T> cls);

    public <T extends Response> void executeRemote(Request request, Class<T> cls) {
        BaseSdkAgent.getInstance().execute(request, cls);
    }

    public abstract int getAppMinCode();

    public abstract String getAppMinVersion();

    public BaseRequest getBaseRequest() {
        return getBaseRequest("");
    }

    public abstract String getBizNo();

    public <R> BizRequest<R> getLocalBizRequest(R r, String str) {
        BizRequest<R> bizRequest = new BizRequest<>();
        bizRequest.setAppMinCode(getAppMinCode());
        bizRequest.setAppMinVersion(getAppMinVersion());
        bizRequest.setModuleMinCode(getModuleMinCode());
        bizRequest.setModuleMinVersion(getModuleMinVersion());
        bizRequest.setOriginalRequest(r);
        bizRequest.setMethodName(str);
        return bizRequest;
    }

    public abstract int getModuleMinCode();

    public abstract String getModuleMinVersion();

    public abstract String getOriginAppPackage();

    public <R> BizRequest<R> getRemoteBizRequest(R r, String str) {
        BizRequest<R> bizRequest = new BizRequest<>();
        bizRequest.setAppMinCode(getAppMinCode());
        bizRequest.setAppMinVersion(getAppMinVersion());
        bizRequest.setModuleMinCode(getModuleMinCode());
        bizRequest.setModuleMinVersion(getModuleMinVersion());
        bizRequest.setMethodName(str);
        bizRequest.setSilentMode(false);
        if (r != null) {
            bizRequest.setMethodParamsClass(r.getClass().getName());
            bizRequest.setMethodParams(JsonUtil.beanToJson(r));
        }
        bizRequest.setOriginalRequest(r);
        return bizRequest;
    }

    public abstract String getSdkVersion();

    public abstract int getSdkVersionCode();

    public boolean handleAppEnableCompatible(Request request, boolean z) {
        String originAppPackage = z ? "com.heytap.htms" : getOriginAppPackage();
        boolean zHasComponentEnabled = true;
        if (!TextUtils.isEmpty(originAppPackage)) {
            try {
                zHasComponentEnabled = AppUtils.hasComponentEnabled(BaseSdkAgent.getInstance().getContext(), originAppPackage);
                if (!zHasComponentEnabled) {
                    Response response = new Response();
                    response.setCode(20510);
                    response.setMessage("application disabled " + originAppPackage);
                    BaseSdkAgent.getInstance().notifyInnerCallback(request, response);
                    MspLog.e(TAG, "AbsSdkAgent execute() app disabled, packageName is " + originAppPackage);
                }
            } catch (Exception unused) {
                MspLog.e(TAG, "AbsSdkAgent execute() get application enabled failed");
            }
        }
        return zHasComponentEnabled;
    }

    public <R> void interceptorRequest(R r, boolean z) {
    }

    public <T extends Response, U> U parseResponse(T t, Class<U> cls) {
        return (U) JsonUtil.jsonToBean(t.getData(), cls);
    }

    @Override // com.heytap.msp.sdk.base.interfaces.IServerMsgHandler
    @Nullable
    public <T extends Response> T processRequest(Request request) {
        return (T) Response.create(0, "msg from bizClient");
    }

    public boolean shouldUseApp() {
        return BaseSdkAgent.getInstance().shouldUseApp(getBaseRequest());
    }

    public <T extends Response, R> void execute(String str, Callback<BizResponse<R>> callback, @Nullable Class<R> cls) {
        execute(null, str, Response.class, callback, cls);
    }

    public BaseRequest getBaseRequest(String str) {
        BaseRequest baseRequest = new BaseRequest();
        baseRequest.setTraceId(str);
        baseRequest.setBizNo(getBizNo());
        baseRequest.setSdkVersion(getSdkVersion());
        baseRequest.setBaseSdkVersion(BuildConfig.VERSION_NAME);
        baseRequest.setAppPackageName(AppUtils.getPackageName());
        baseRequest.setOriginAppPackageName(getOriginAppPackage());
        return baseRequest;
    }

    @Override // com.heytap.msp.sdk.base.interfaces.IServerMsgHandler
    public <T extends Response> T dispatchRequest(Request request) {
        return (T) processRequest(request);
    }

    public <T extends Response, R, U> void execute(R r, String str, Class<T> cls, Callback<BizResponse<U>> callback, @Nullable Class<U> cls2) {
        execute(r, str, "", cls, callback, cls2);
    }

    public <T extends Response, R, U> void execute(R r, String str, Callback<BizResponse<U>> callback, @Nullable Class<U> cls) {
        execute(r, str, "", Response.class, callback, cls);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T extends Response, R, U> void execute(R r, String str, String str2, Class<T> cls, Callback<BizResponse<U>> callback, @Nullable Class<U> cls2) {
        Request request = new Request();
        request.setBaseRequest(getBaseRequest(str2));
        MyInternalCallback myInternalCallback = new MyInternalCallback(request, cls2, cls);
        BaseSdkAgent.getInstance().putBizCallbackCache(request, callback);
        BaseSdkAgent.getInstance().putInterCallbackCache(request, myInternalCallback);
        BaseSdkAgent.getInstance().onKeyPath(1, request, str);
        if (BaseSdkAgent.getIntercept().get() && !BaseSdkAgent.getNotInterceptList().contains(str)) {
            Response response = new Response();
            response.setCode(20508);
            response.setMessage("SdkAgent has intercept");
            BaseSdkAgent.getInstance().notifyInnerCallback(request, response);
            MspLog.e(TAG, "AbsSdkAgent execute()  SdkAgent has intercept");
            return;
        }
        if (!BaseSdkAgent.initialized().get()) {
            Response response2 = new Response();
            response2.setCode(20506);
            response2.setMessage("SdkAgent not initialized");
            BaseSdkAgent.getInstance().notifyInnerCallback(request, response2);
            MspLog.e(TAG, "AbsSdkAgent execute()  SdkAgent not initialized");
            return;
        }
        MspLog.d(TAG, "biz method:" + str);
        boolean zShouldUseApp = shouldUseApp();
        if (handleAppEnableCompatible(request, zShouldUseApp)) {
            interceptorRequest(r, zShouldUseApp);
            request.setBizRequest(getBizRequest(zShouldUseApp, r, str));
            if (zShouldUseApp) {
                MspLog.d(TAG, "executeRemote()");
                executeRemote(request, cls);
            } else {
                try {
                    MspLog.d(TAG, "executeLocal()");
                    executeLocal(request, str, cls);
                } catch (Exception e2) {
                    MspLog.e(TAG, "execute: " + e2.getMessage());
                    Response response3 = new Response();
                    response3.setCode(30507);
                    response3.setMessage("unknown error");
                    BaseSdkAgent.getInstance().notifyInnerCallback(request, response3);
                }
            }
            BaseSdkAgent.getInstance().tryToReqGlobalConfig();
            BaseSdkAgent.getInstance().onKeyPath(2, request, Boolean.valueOf(zShouldUseApp));
        }
    }
}
