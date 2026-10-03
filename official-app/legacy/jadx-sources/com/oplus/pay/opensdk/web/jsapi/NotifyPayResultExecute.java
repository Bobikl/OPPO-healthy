package com.oplus.pay.opensdk.web.jsapi;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.Window;
import androidx.annotation.Keep;
import androidx.fragment.app.FragmentActivity;
import com.oplus.aiunit.vision.dqg;
import com.oplus.aiunit.vision.eja;
import com.oplus.aiunit.vision.jnl;
import com.oplus.aiunit.vision.kja;
import com.oplus.aiunit.vision.lr9;
import com.oplus.aiunit.vision.or9;
import com.oplus.aiunit.vision.ro0;
import com.oplus.aiunit.vision.tfb;
import com.oplus.aiunit.vision.u62;
import com.oplus.aiunit.vision.y6m;
import com.oplus.aiunit.vision.zbe;
import com.oplus.pay.opensdk.web.jsapi.NotifyPayResultExecute;
import com.oplus.web.container.comunication.jsapi.BaseJsApiExecutor;
import com.oplus.web.container.safe.model.HostSecurityLevel;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p010kotlin.Metadata;
import p010kotlin.Result;
import p010kotlin.ResultKt;
import p010kotlin.Unit;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@eja(method = "NotifyPayResult", product = "pay")
@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0007\u0018\u0000 \u00142\u00020\u0001:\u0001\u0015B\u0007¢\u0006\u0004\b\u0012\u0010\u0013J&\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002J\u0018\u0010\r\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0002J \u0010\u000f\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0002J\u0010\u0010\u0010\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\nH\u0002J&\u0010\u0011\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¨\u0006\u0016"}, d2 = {"Lcom/oplus/pay/opensdk/web/jsapi/NotifyPayResultExecute;", "Lcom/oplus/web/container/comunication/jsapi/BaseJsApiExecutor;", "Lcom/oplus/aiunit/vision/kja;", "apiArguments", "Lcom/oplus/aiunit/vision/lr9;", "callback", "Lcom/oplus/aiunit/vision/or9;", "fragment", "", "sendPayResult", "", "msg", "traceID", "eventIdSendPayResultStart", "code", "eventIdSendPayResult", "eventIdNotSendPayResult", "handleJsApi", "<init>", "()V", "Companion", "a", "paysdk_web_release"}, k = 1, mv = {1, 8, 0})
@dqg(level = HostSecurityLevel.CRITICAL)
public final class NotifyPayResultExecute extends BaseJsApiExecutor {

    @NotNull
    private static final String CASHIER_TYPE = "CashierType";

    @NotNull
    private static final String DEEP_LINK = "deepLink";

    @NotNull
    private static final String ERR_CODE = "errCode";

    @NotNull
    private static final String MSG = "msg";

    @NotNull
    private static final String ORDER = "order";

    @NotNull
    private static final String PAY_CHANNEL = "payChannel";

    @NotNull
    private static final String PRE_PAY_TOKEN = "prePayToken";

    @NotNull
    private static final String RESPONSE = "response";

    @NotNull
    private static final String TRADE_TRACE_CONTEXT = "tradeTraceContext";
    private static final String ACTION_NOTIFY_PAY_RESULT = y6m.a("fmizem&xiq&zm{xgf{m", 8);

    private final void eventIdNotSendPayResult(String traceID) {
        ro0.INSTANCE.b(zbe.b(traceID));
    }

    private final void eventIdSendPayResult(String code, String msg, String traceID) {
        ro0.INSTANCE.b(zbe.d(code, msg, traceID));
    }

    private final void eventIdSendPayResultStart(String msg, String traceID) {
        ro0.INSTANCE.b(zbe.e(msg, traceID));
    }

    private final void sendPayResult(kja apiArguments, lr9 callback, final or9 fragment) throws JSONException {
        NotifyPayResultExecute notifyPayResultExecute;
        FragmentActivity activity;
        Context applicationContext;
        Window window;
        View decorView;
        JSONObject jSONObjectA = apiArguments != null ? apiArguments.a() : null;
        if (jSONObjectA == null) {
            if (callback != null) {
                callback.fail(-1, "payResultInfoJsonStr is null ");
            }
            jnl.b("payResultInfoJsonStr is null");
            return;
        }
        String errCode = jSONObjectA.optString(ERR_CODE, null);
        if (errCode == null || errCode.length() == 0) {
            if (callback != null) {
                callback.fail(-1, "errCode is null ");
            }
            jnl.b("errCode is null");
            return;
        }
        String strOptString = jSONObjectA.optString("order", "");
        String strOptString2 = jSONObjectA.optString("prePayToken", "");
        if (strOptString == null || strOptString.length() == 0) {
            if (strOptString2 == null || strOptString2.length() == 0) {
                if (callback != null) {
                    callback.fail(-1, "order and  prePayToken is null ");
                }
                jnl.b("order and  prePayToken is null");
                return;
            }
        }
        tfb tfbVar = tfb.INSTANCE;
        String strD = tfbVar.d(strOptString2);
        String strE = tfbVar.e(strOptString2);
        if (strD == null || strD.length() == 0) {
            if (callback != null) {
                callback.fail(-1, "appPackage is null ");
            }
            jnl.b("appPackage is null");
            return;
        }
        eventIdSendPayResultStart("success", strE == null ? "" : strE);
        String msg = jSONObjectA.optString("msg", "");
        String strOptString3 = jSONObjectA.optString(PAY_CHANNEL, "");
        String strOptString4 = jSONObjectA.optString("deepLink", "");
        String strOptString5 = jSONObjectA.optString("tradeTraceContext", "");
        Intent intent = new Intent(ACTION_NOTIFY_PAY_RESULT);
        intent.setPackage(strD);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(ERR_CODE, errCode);
        jSONObject.put("msg", msg);
        jSONObject.put("order", strOptString);
        jSONObject.put("prePayToken", strOptString2);
        jSONObject.put(PAY_CHANNEL, strOptString3);
        jSONObject.put("deepLink", strOptString4);
        jSONObject.put(CASHIER_TYPE, "H5_CASHIER");
        jSONObject.put("tradeTraceContext", strOptString5);
        intent.putExtra("response", jSONObject.toString());
        if (fragment == null || (activity = fragment.getActivity()) == null || (applicationContext = activity.getApplicationContext()) == null) {
            notifyPayResultExecute = this;
        } else {
            u62.a(applicationContext, intent);
            Intrinsics.checkNotNullExpressionValue(errCode, "errCode");
            Intrinsics.checkNotNullExpressionValue(msg, "msg");
            notifyPayResultExecute = this;
            notifyPayResultExecute.eventIdSendPayResult(errCode, msg, strE == null ? "" : strE);
            tfbVar.a(strOptString2);
            tfbVar.b(strOptString2);
            jnl.e("sendBroadcast done:" + errCode);
            FragmentActivity activity2 = fragment.getActivity();
            Boolean boolValueOf = (activity2 == null || (window = activity2.getWindow()) == null || (decorView = window.getDecorView()) == null) ? null : Boolean.valueOf(decorView.postDelayed(new Runnable() { // from class: com.oplus.aiunit.vision.uyc
                @Override // java.lang.Runnable
                public final void run() {
                    NotifyPayResultExecute.sendPayResult$lambda$6$lambda$4$lambda$3(fragment);
                }
            }, 100L));
            if (boolValueOf != null) {
                boolValueOf.booleanValue();
                if (callback != null) {
                    callback.success();
                    return;
                }
                return;
            }
        }
        if (callback != null) {
            callback.fail(-1, "sendBroadcast context is null ");
        }
        notifyPayResultExecute.eventIdNotSendPayResult(strE == null ? "" : strE);
        jnl.b("sendBroadcast context is null");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void sendPayResult$lambda$6$lambda$4$lambda$3(or9 or9Var) {
        FragmentActivity activity = or9Var.getActivity();
        if (activity == null || activity.isFinishing() || activity.isDestroyed()) {
            return;
        }
        jnl.e("activity finish");
        activity.finish();
    }

    @Override // com.oplus.web.container.comunication.jsapi.BaseJsApiExecutor
    public void handleJsApi(@Nullable or9 fragment, @Nullable kja apiArguments, @Nullable lr9 callback) {
        Object objM5287constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            sendPayResult(apiArguments, callback, fragment);
            objM5287constructorimpl = Result.m5287constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM5287constructorimpl = Result.m5287constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM5290exceptionOrNullimpl = Result.m5290exceptionOrNullimpl(objM5287constructorimpl);
        if (thM5290exceptionOrNullimpl != null) {
            jnl.b("sendPayResult error: " + thM5290exceptionOrNullimpl.getMessage());
            if (callback != null) {
                callback.fail(-1, "sendPayResult error: " + thM5290exceptionOrNullimpl.getMessage());
            }
        }
    }
}
