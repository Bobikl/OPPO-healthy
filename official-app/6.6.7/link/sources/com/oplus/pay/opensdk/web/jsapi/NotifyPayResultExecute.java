package com.oplus.pay.opensdk.web.jsapi;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.Window;
import androidx.annotation.Keep;
import androidx.fragment.app.FragmentActivity;
import com.oplus.aiunit.vision.hrl;
import com.oplus.aiunit.vision.i72;
import com.oplus.aiunit.vision.ihb;
import com.oplus.aiunit.vision.ip0;
import com.oplus.aiunit.vision.mka;
import com.oplus.aiunit.vision.rs9;
import com.oplus.aiunit.vision.ska;
import com.oplus.aiunit.vision.ttg;
import com.oplus.aiunit.vision.us9;
import com.oplus.aiunit.vision.wam;
import com.oplus.aiunit.vision.yde;
import com.oplus.pay.opensdk.msp.pay.PayConstant;
import com.oplus.pay.opensdk.web.jsapi.NotifyPayResultExecute;
import com.oplus.web.container.comunication.jsapi.BaseJsApiExecutor;
import com.oplus.web.container.safe.model.HostSecurityLevel;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Keep
@mka(method = "NotifyPayResult", product = PayConstant.MethodName.PAY)
@ttg(level = HostSecurityLevel.CRITICAL)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0007\u0018\u0000 \u00142\u00020\u0001:\u0001\u0015B\u0007¢\u0006\u0004\b\u0012\u0010\u0013J&\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002J\u0018\u0010\r\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0002J \u0010\u000f\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0002J\u0010\u0010\u0010\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\nH\u0002J&\u0010\u0011\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¨\u0006\u0016"}, d2 = {"Lcom/oplus/pay/opensdk/web/jsapi/NotifyPayResultExecute;", "Lcom/oplus/web/container/comunication/jsapi/BaseJsApiExecutor;", "Lcom/oplus/aiunit/vision/ska;", "apiArguments", "Lcom/oplus/aiunit/vision/rs9;", "callback", "Lcom/oplus/aiunit/vision/us9;", "fragment", "", "sendPayResult", "", "msg", "traceID", "eventIdSendPayResultStart", "code", "eventIdSendPayResult", "eventIdNotSendPayResult", "handleJsApi", "<init>", "()V", "Companion", "a", "paysdk_web_release"}, k = 1, mv = {1, 8, 0})
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
    private static final String ACTION_NOTIFY_PAY_RESULT = wam.a("fmizem&xiq&zm{xgf{m", 8);

    private final void eventIdNotSendPayResult(String traceID) {
        ip0.INSTANCE.b(yde.b(traceID));
    }

    private final void eventIdSendPayResult(String code, String msg, String traceID) {
        ip0.INSTANCE.b(yde.d(code, msg, traceID));
    }

    private final void eventIdSendPayResultStart(String msg, String traceID) {
        ip0.INSTANCE.b(yde.e(msg, traceID));
    }

    private final void sendPayResult(ska apiArguments, rs9 callback, final us9 fragment) throws JSONException {
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
            hrl.b("payResultInfoJsonStr is null");
            return;
        }
        String strOptString = jSONObjectA.optString(ERR_CODE, null);
        if (strOptString == null || strOptString.length() == 0) {
            if (callback != null) {
                callback.fail(-1, "errCode is null ");
            }
            hrl.b("errCode is null");
            return;
        }
        String strOptString2 = jSONObjectA.optString("order", "");
        String strOptString3 = jSONObjectA.optString("prePayToken", "");
        if (strOptString2 == null || strOptString2.length() == 0) {
            if (strOptString3 == null || strOptString3.length() == 0) {
                if (callback != null) {
                    callback.fail(-1, "order and  prePayToken is null ");
                }
                hrl.b("order and  prePayToken is null");
                return;
            }
        }
        ihb ihbVar = ihb.INSTANCE;
        String strD = ihbVar.d(strOptString3);
        String strE = ihbVar.e(strOptString3);
        if (strD == null || strD.length() == 0) {
            if (callback != null) {
                callback.fail(-1, "appPackage is null ");
            }
            hrl.b("appPackage is null");
            return;
        }
        eventIdSendPayResultStart("success", strE == null ? "" : strE);
        String strOptString4 = jSONObjectA.optString("msg", "");
        String strOptString5 = jSONObjectA.optString(PAY_CHANNEL, "");
        String strOptString6 = jSONObjectA.optString(DEEP_LINK, "");
        String strOptString7 = jSONObjectA.optString("tradeTraceContext", "");
        Intent intent = new Intent(ACTION_NOTIFY_PAY_RESULT);
        intent.setPackage(strD);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(ERR_CODE, strOptString);
        jSONObject.put("msg", strOptString4);
        jSONObject.put("order", strOptString2);
        jSONObject.put("prePayToken", strOptString3);
        jSONObject.put(PAY_CHANNEL, strOptString5);
        jSONObject.put(DEEP_LINK, strOptString6);
        jSONObject.put(CASHIER_TYPE, "H5_CASHIER");
        jSONObject.put("tradeTraceContext", strOptString7);
        intent.putExtra(RESPONSE, jSONObject.toString());
        if (fragment == null || (activity = fragment.getActivity()) == null || (applicationContext = activity.getApplicationContext()) == null) {
            notifyPayResultExecute = this;
        } else {
            i72.a(applicationContext, intent);
            Intrinsics.checkNotNullExpressionValue(strOptString, ERR_CODE);
            Intrinsics.checkNotNullExpressionValue(strOptString4, "msg");
            notifyPayResultExecute = this;
            notifyPayResultExecute.eventIdSendPayResult(strOptString, strOptString4, strE == null ? "" : strE);
            ihbVar.a(strOptString3);
            ihbVar.b(strOptString3);
            hrl.e("sendBroadcast done:" + strOptString);
            FragmentActivity activity2 = fragment.getActivity();
            Boolean boolValueOf = (activity2 == null || (window = activity2.getWindow()) == null || (decorView = window.getDecorView()) == null) ? null : Boolean.valueOf(decorView.postDelayed(new Runnable() { // from class: com.oplus.aiunit.vision.m0d
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
        hrl.b("sendBroadcast context is null");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void sendPayResult$lambda$6$lambda$4$lambda$3(us9 us9Var) {
        FragmentActivity activity = us9Var.getActivity();
        if (activity == null || activity.isFinishing() || activity.isDestroyed()) {
            return;
        }
        hrl.e("activity finish");
        activity.finish();
    }

    @Override // com.oplus.web.container.comunication.jsapi.BaseJsApiExecutor
    public void handleJsApi(@Nullable us9 fragment, @Nullable ska apiArguments, @Nullable rs9 callback) {
        Object obj;
        try {
            Result.Companion companion = Result.Companion;
            sendPayResult(apiArguments, callback, fragment);
            obj = Result.constructor-impl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        Throwable th2 = Result.exceptionOrNull-impl(obj);
        if (th2 != null) {
            hrl.b("sendPayResult error: " + th2.getMessage());
            if (callback != null) {
                callback.fail(-1, "sendPayResult error: " + th2.getMessage());
            }
        }
    }
}
