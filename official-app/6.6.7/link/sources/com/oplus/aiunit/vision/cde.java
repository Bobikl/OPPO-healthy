package com.oplus.aiunit.vision;

import android.content.Context;
import com.alibaba.fastjson.JSONObject;
import com.heytap.msp.bean.BizRequest;
import com.heytap.msp.bean.BizResponse;
import com.heytap.msp.bean.Request;
import com.heytap.msp.bean.Response;
import com.heytap.msp.sdk.base.AbstractSdkAgent;
import com.heytap.msp.sdk.base.BaseSdkAgent;
import com.heytap.msp.sdk.base.common.util.DeviceUtils;
import com.heytap.msp.sdk.base.common.util.JsonUtil;
import com.oplus.pay.opensdk.msp.pay.PayConstant;
import com.oplus.pay.opensdk.msp.pay.PayPerResponse;
import com.oplus.smartenginehelper.ParserTag;
import com.oplus.utrace.utils.DcsCommon;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010%\u001a\u0004\u0018\u00010#¢\u0006\u0004\b&\u0010'J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\n\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\b\u001a\u00020\u0005H\u0016J\n\u0010\t\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\n\u001a\u00020\u0005H\u0014J\b\u0010\u000b\u001a\u00020\u0002H\u0016J-\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f\"\u0004\b\u0000\u0010\f2\u0006\u0010\r\u001a\u00028\u00002\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002H\u0014¢\u0006\u0004\b\u0010\u0010\u0011J2\u0010\u0019\u001a\u00020\u0018\"\n\b\u0000\u0010\u0013*\u0004\u0018\u00010\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000e\u001a\u00020\u00022\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016H\u0014J\b\u0010\u001b\u001a\u00020\u001aH\u0016J,\u0010\u001c\u001a\u00020\u0018\"\n\b\u0000\u0010\u0013*\u0004\u0018\u00010\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0016H\u0014J*\u0010\u001d\u001a\u00020\u0018\"\n\b\u0000\u0010\u0013*\u0004\u0018\u00010\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0016J;\u0010!\u001a\u0004\u0018\u00018\u0001\"\n\b\u0000\u0010\u0013*\u0004\u0018\u00010\u0012\"\u0004\b\u0001\u0010\u001e2\u0006\u0010\u001f\u001a\u00028\u00002\u000e\u0010 \u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0016H\u0014¢\u0006\u0004\b!\u0010\"R\u0016\u0010%\u001a\u0004\u0018\u00010#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010$¨\u0006("}, d2 = {"Lcom/oplus/aiunit/vision/cde;", "Lcom/heytap/msp/sdk/base/AbstractSdkAgent;", "", "getBizNo", "getSdkVersion", "", "getAppMinCode", "getAppMinVersion", "getModuleMinCode", "getModuleMinVersion", "getSdkVersionCode", "getOriginAppPackage", "R", "originalRequest", ParserTag.TAG_METHOD, "Lcom/heytap/msp/bean/BizRequest;", "getRemoteBizRequest", "(Ljava/lang/Object;Ljava/lang/String;)Lcom/heytap/msp/bean/BizRequest;", "Lcom/heytap/msp/bean/Response;", "T", "Lcom/heytap/msp/bean/Request;", "request", "Ljava/lang/Class;", "tClass", "", "executeLocal", "", "shouldUseApp", "executeRemote", "a", "U", "response", "sClass", "parseResponse", "(Lcom/heytap/msp/bean/Response;Ljava/lang/Class;)Ljava/lang/Object;", "Lcom/oplus/aiunit/vision/jw9;", "Lcom/oplus/aiunit/vision/jw9;", "payHandler", "<init>", "(Lcom/oplus/aiunit/vision/jw9;)V", "paysdk_msp_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nPaySdkAgent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaySdkAgent.kt\ncom/oplus/pay/opensdk/msp/agent/PaySdkAgent\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,173:1\n1#2:174\n*E\n"})
public final class cde extends AbstractSdkAgent {

    @Nullable
    public final jw9 a;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"com/oplus/aiunit/vision/cde$a", "Lcom/oplus/aiunit/vision/ybe;", "Lcom/oplus/pay/opensdk/msp/pay/PayPerResponse;", "response", "", "a", "paysdk_msp_release"}, k = 1, mv = {1, 8, 0})
    public static final class a implements ybe {
        public final /* synthetic */ Request a;

        public a(Request request) {
            this.a = request;
        }

        @Override // com.oplus.aiunit.vision.ybe
        public void a(@NotNull PayPerResponse response) {
            Intrinsics.checkNotNullParameter(response, "response");
            pce.b("executeLocal#response:" + response);
            BaseSdkAgent.getInstance().notifyInnerCallback(this.a, response.getResponse());
            if (response.getResult()) {
                return;
            }
            BizResponse bizResponse = new BizResponse();
            bizResponse.setCode(response.getResponse().getCode());
            bizResponse.setMessage("executeLocal failed!");
            BaseSdkAgent.getInstance().notifyBizCallback(this.a, bizResponse);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"com/oplus/aiunit/vision/cde$b", "Lcom/oplus/aiunit/vision/ybe;", "Lcom/oplus/pay/opensdk/msp/pay/PayPerResponse;", "payPerResponse", "", "a", "paysdk_msp_release"}, k = 1, mv = {1, 8, 0})
    public static final class b implements ybe {
        public final /* synthetic */ Request a;
        public final /* synthetic */ cde b;
        public final /* synthetic */ Class<T> c;

        public b(Request request, cde cdeVar, Class<T> cls) {
            this.a = request;
            this.b = cdeVar;
            this.c = cls;
        }

        @Override // com.oplus.aiunit.vision.ybe
        public void a(@NotNull PayPerResponse payPerResponse) {
            Intrinsics.checkNotNullParameter(payPerResponse, "payPerResponse");
            pce.b("executeRemote#payPerResponse:" + payPerResponse.getResponse() + " result:" + payPerResponse.getResult());
            if (payPerResponse.getResult()) {
                this.b.a(this.a, this.c);
                return;
            }
            BaseSdkAgent.getInstance().notifyInnerCallback(this.a, payPerResponse.getResponse());
            BizResponse bizResponse = new BizResponse();
            bizResponse.setCode(payPerResponse.getResponse().getCode());
            bizResponse.setMessage("executeRemote failed!");
            BaseSdkAgent.getInstance().notifyBizCallback(this.a, bizResponse);
        }
    }

    public cde(@Nullable jw9 jw9Var) {
        this.a = jw9Var;
    }

    public final <T extends Response> void a(@NotNull Request request, @Nullable Class<T> tClass) {
        Intrinsics.checkNotNullParameter(request, "request");
        super.executeRemote(request, tClass);
    }

    public <T extends Response> void executeLocal(@NotNull Request request, @NotNull String method, @NotNull Class<T> tClass) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(method, ParserTag.TAG_METHOD);
        Intrinsics.checkNotNullParameter(tClass, "tClass");
        jw9 jw9Var = this.a;
        if (jw9Var != null) {
            jw9Var.a(request, true, new a(request));
        }
    }

    public <T extends Response> void executeRemote(@NotNull Request request, @Nullable Class<T> tClass) {
        Intrinsics.checkNotNullParameter(request, "request");
        if (BaseSdkAgent.getInstance().isInstallAppCustom(BaseSdkAgent.getInstance().getContext())) {
            jw9 jw9Var = this.a;
            if (jw9Var != null) {
                jw9Var.a(request, true, new b(request, this, tClass));
                return;
            }
            return;
        }
        BizResponse bizResponse = new BizResponse();
        bizResponse.setCode(20511);
        bizResponse.setMessage("未安装移动服务");
        BaseSdkAgent.getInstance().notifyBizCallback(request, bizResponse);
    }

    public int getAppMinCode() {
        return PayConstant.ModuleInfo.APP_MIN_CODE;
    }

    @Nullable
    public String getAppMinVersion() {
        return PayConstant.ModuleInfo.APP_MIN_VERSION;
    }

    @NotNull
    public String getBizNo() {
        return PayConstant.ModuleInfo.BIZ_NO;
    }

    public int getModuleMinCode() {
        return 1;
    }

    @Nullable
    public String getModuleMinVersion() {
        return PayConstant.ModuleInfo.MODULE_MIN_VERSION;
    }

    @NotNull
    public String getOriginAppPackage() {
        Context context = BaseSdkAgent.getInstance().getContext();
        String str = ((AbstractSdkAgent) this).originAppPackageName;
        Intrinsics.checkNotNullExpressionValue(str, "originAppPackageName");
        if (str.length() == 0) {
            String str2 = PayConstant.ModuleInfo.N_PAY_PKG_NAME;
            if (!DeviceUtils.isSupport(context, str2)) {
                str2 = PayConstant.ModuleInfo.F_PAY_PKG_NAME;
                if (!DeviceUtils.isSupport(context, str2)) {
                    str2 = PayConstant.ModuleInfo.O_PAY_PKG_NAME;
                    if (!DeviceUtils.isSupport(context, str2)) {
                        str2 = "";
                    }
                }
            }
            ((AbstractSdkAgent) this).originAppPackageName = str2;
        }
        pce.b("origin app package:" + ((AbstractSdkAgent) this).originAppPackageName);
        String str3 = ((AbstractSdkAgent) this).originAppPackageName;
        Intrinsics.checkNotNullExpressionValue(str3, "originAppPackageName");
        return str3;
    }

    @NotNull
    public <R> BizRequest<R> getRemoteBizRequest(R originalRequest, @Nullable String method) {
        BizRequest<R> remoteBizRequest = super.getRemoteBizRequest(originalRequest, method);
        try {
            JSONObject jSONObjectJsonToJsonObject = JsonUtil.jsonToJsonObject(remoteBizRequest.getMethodParams());
            if (jSONObjectJsonToJsonObject != null) {
                jSONObjectJsonToJsonObject.put("mAppKey", jSONObjectJsonToJsonObject.getString("mTagKey"));
                remoteBizRequest.setMethodParams(jSONObjectJsonToJsonObject.toString());
            }
        } catch (Exception e) {
            pce.c("getRemoteBizRequest" + e.getMessage());
        }
        Intrinsics.checkNotNullExpressionValue(remoteBizRequest, "bizRequest");
        return remoteBizRequest;
    }

    @NotNull
    public String getSdkVersion() {
        return "3.3.1";
    }

    public int getSdkVersionCode() {
        return 30301;
    }

    @Nullable
    public <T extends Response, U> U parseResponse(T response, @Nullable Class<U> sClass) {
        boolean zAreEqual;
        Intrinsics.checkNotNull(response);
        if (!JsonUtil.jsonIsValidObject(response.getData())) {
            return (U) super.parseResponse(response, sClass);
        }
        try {
            JSONObject jSONObjectJsonToJsonObject = JsonUtil.jsonToJsonObject(response.getData());
            zAreEqual = (jSONObjectJsonToJsonObject == null || !jSONObjectJsonToJsonObject.containsKey("errCode")) ? false : Intrinsics.areEqual(DcsCommon.EVENT_ID_HLOG_REPORTER, jSONObjectJsonToJsonObject.getString("errCode"));
        } catch (Exception unused) {
            pce.b("parse payResult failed");
        }
        return (U) Boolean.valueOf(zAreEqual);
    }

    public boolean shouldUseApp() {
        return true;
    }
}
