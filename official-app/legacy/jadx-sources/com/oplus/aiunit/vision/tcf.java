package com.oplus.aiunit.vision;

import android.content.Context;
import android.content.Intent;
import androidx.exifinterface.media.ExifInterface;
import com.heytap.msp.bean.BizRequest;
import com.heytap.msp.bean.Request;
import com.heytap.msp.bean.Response;
import com.heytap.msp.sdk.base.BaseSdkAgent;
import com.oplus.pay.opensdk.msp.pay.PayConstant;
import com.oplus.pay.opensdk.msp.pay.PayPerResponse;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0013\u0010\u0014J \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J$\u0010\u000e\u001a\u00020\b\"\u0004\b\u0000\u0010\n2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b2\u0006\u0010\r\u001a\u00020\fH\u0002J\u001a\u0010\u000f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002R\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0011¨\u0006\u0015"}, d2 = {"Lcom/oplus/aiunit/vision/tcf;", "Lcom/oplus/aiunit/vision/cv9;", "Lcom/heytap/msp/bean/Request;", "request", "", "useMsp", "Lcom/oplus/aiunit/vision/z9e;", "callback", "", "a", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/heytap/msp/bean/BizRequest;", "Lcom/oplus/pay/opensdk/msp/pay/PayPerResponse;", "payPerResponse", "c", "b", "Landroid/content/Intent;", "Landroid/content/Intent;", "intent", "<init>", "(Landroid/content/Intent;)V", "paysdk_release"}, k = 1, mv = {1, 8, 0})
public final class tcf implements cv9 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public final Intent intent;

    public tcf(@Nullable Intent intent) {
        this.intent = intent;
    }

    @Override // com.oplus.aiunit.vision.cv9
    public void a(@NotNull Request request, boolean useMsp, @NotNull z9e callback) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(callback, "callback");
        PayPerResponse payPerResponse = new PayPerResponse();
        payPerResponse.setResult(true);
        Response responseCreate = Response.create(0, "success");
        Intrinsics.checkNotNullExpressionValue(responseCreate, "create(BaseErrorCode.ERR…S, BaseErrorInfo.SUCCESS)");
        payPerResponse.setResponse(responseCreate);
        Context topActivity = BaseSdkAgent.getInstance().getTopActivity();
        if (topActivity == null) {
            topActivity = BaseSdkAgent.getInstance().getContext();
        }
        if (topActivity == null) {
            qae.c("context is null");
            payPerResponse.setResult(false);
            payPerResponse.getResponse().setCode(30511);
            payPerResponse.getResponse().setMessage("unknown error");
            b(payPerResponse, callback);
            return;
        }
        Intent intent = this.intent;
        if (intent == null) {
            payPerResponse.setResult(false);
            payPerResponse.getResponse().setCode(30511);
            payPerResponse.getResponse().setMessage("unknown error");
            b(payPerResponse, callback);
            return;
        }
        intent.setPackage("com.heytap.htms");
        this.intent.removeFlags(268435456);
        String uri = this.intent.toUri(0);
        Intrinsics.checkNotNullExpressionValue(uri, "intent.toUri(0)");
        payPerResponse.setParams(uri);
        StringBuilder sb = new StringBuilder();
        sb.append("methodName:");
        BizRequest bizRequest = request.getBizRequest();
        sb.append(bizRequest != null ? bizRequest.getMethodName() : null);
        qae.b(sb.toString());
        BizRequest bizRequest2 = request.getBizRequest();
        String methodName = bizRequest2 != null ? bizRequest2.getMethodName() : null;
        if (Intrinsics.areEqual(methodName, PayConstant.MethodName.PAY_PRE_ORDER)) {
            BizRequest bizRequest3 = request.getBizRequest();
            Intrinsics.checkNotNull(bizRequest3, "null cannot be cast to non-null type com.heytap.msp.bean.BizRequest<com.oplus.pay.opensdk.model.PreOrderParameters?>");
            c(bizRequest3, payPerResponse);
        } else if (Intrinsics.areEqual(methodName, "pay")) {
            BizRequest bizRequest4 = request.getBizRequest();
            Intrinsics.checkNotNull(bizRequest4, "null cannot be cast to non-null type com.heytap.msp.bean.BizRequest<com.client.platform.opensdk.pay.PayRequest>");
            c(bizRequest4, payPerResponse);
        } else {
            payPerResponse.setResult(false);
            payPerResponse.getResponse().setCode(30506);
            payPerResponse.getResponse().setMessage("method not match");
        }
        b(payPerResponse, callback);
    }

    public final void b(PayPerResponse payPerResponse, z9e callback) {
        payPerResponse.getResponse().setData("");
        if (callback != null) {
            callback.a(payPerResponse);
        }
    }

    public final <T> void c(BizRequest<T> request, PayPerResponse payPerResponse) {
        if (payPerResponse.getResult()) {
            request.setMethodParams2(payPerResponse.getParams());
            request.setMethodParamsClass2(String.class.getName());
        }
    }
}
