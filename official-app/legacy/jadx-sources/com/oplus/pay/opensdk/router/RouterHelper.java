package com.oplus.pay.opensdk.router;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import com.client.platform.opensdk.pay.BuildConfig;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.oplus.aiunit.vision.b3h;
import com.oplus.aiunit.vision.cuf;
import com.oplus.aiunit.vision.ebe;
import com.oplus.aiunit.vision.efd;
import com.oplus.aiunit.vision.gpc;
import com.oplus.aiunit.vision.gqf;
import com.oplus.aiunit.vision.hk3;
import com.oplus.aiunit.vision.l28;
import com.oplus.aiunit.vision.npb;
import com.oplus.aiunit.vision.o55;
import com.oplus.aiunit.vision.pw9;
import com.oplus.aiunit.vision.qae;
import com.oplus.aiunit.vision.qmk;
import com.oplus.aiunit.vision.rw9;
import com.oplus.aiunit.vision.s0g;
import com.oplus.aiunit.vision.sh5;
import com.oplus.aiunit.vision.st3;
import com.oplus.aiunit.vision.tbe;
import com.oplus.aiunit.vision.wbe;
import com.oplus.aiunit.vision.wr2;
import com.oplus.aiunit.vision.ytf;
import com.oplus.aiunit.vision.zs2;
import com.oplus.pay.opensdk.model.ActionInfo;
import com.oplus.pay.opensdk.model.CashierHost;
import com.oplus.pay.opensdk.model.CashierType;
import com.oplus.pay.opensdk.model.PayParameters;
import com.oplus.pay.opensdk.model.PreOrderParameters;
import com.oplus.pay.opensdk.model.ResultType;
import com.oplus.pay.opensdk.model.TargetHostAppInfo;
import com.oplus.pay.opensdk.model.request.RouterConfigRequest;
import com.oplus.pay.opensdk.model.response.ResultCallback;
import com.oplus.pay.opensdk.model.response.RouterConfigResponse;
import com.oplus.pay.opensdk.model.response.SuccessResponse;
import com.oplus.pay.opensdk.router.RouterHelper;
import com.oplus.pay.opensdk.statistic.model.BizResult;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.Executor;
import okhttp3.MediaType;
import okhttp3.Request;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p010kotlin.Triple;

/* JADX INFO: loaded from: classes8.dex */
public final class RouterHelper {

    /* JADX INFO: renamed from: com.oplus.pay.opensdk.router.RouterHelper$2, reason: invalid class name */
    public class AnonymousClass2 implements zs2 {
        public final /* synthetic */ Context i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ ResultCallback f20071j;

        public AnonymousClass2(Context context, ResultCallback resultCallback) {
            this.i = context;
            this.f20071j = resultCallback;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public /* synthetic */ void d(ytf ytfVar, ResultCallback resultCallback) {
            try {
                cuf body = ytfVar.getBody();
                Objects.requireNonNull(body);
                String strS = body.s();
                qae.b("responseStr：" + strS);
                if (TextUtils.isEmpty(strS)) {
                    resultCallback.onFailed(new Exception("Response is empty"));
                } else {
                    SuccessResponse successResponse = (SuccessResponse) new Gson().fromJson(strS, new TypeToken<SuccessResponse<RouterConfigResponse>>() { // from class: com.oplus.pay.opensdk.router.RouterHelper.2.1
                    }.getType());
                    Boolean bool = successResponse.success;
                    if (bool == null || !bool.booleanValue()) {
                        resultCallback.onFailed(new Exception(""));
                    } else {
                        resultCallback.onSuccess((RouterConfigResponse) successResponse.data);
                    }
                }
            } catch (Exception e2) {
                resultCallback.onFailed(e2);
            }
        }

        @Override // com.oplus.aiunit.vision.zs2
        public void onFailure(@NonNull wr2 wr2Var, @NonNull final IOException iOException) {
            Executor mainExecutor = ContextCompat.getMainExecutor(this.i);
            final ResultCallback resultCallback = this.f20071j;
            mainExecutor.execute(new Runnable() { // from class: com.oplus.aiunit.vision.izf
                @Override // java.lang.Runnable
                public final void run() {
                    resultCallback.onFailed(iOException);
                }
            });
        }

        @Override // com.oplus.aiunit.vision.zs2
        public void onResponse(@NonNull wr2 wr2Var, @NonNull final ytf ytfVar) {
            Executor mainExecutor = ContextCompat.getMainExecutor(this.i);
            final ResultCallback resultCallback = this.f20071j;
            mainExecutor.execute(new Runnable() { // from class: com.oplus.aiunit.vision.hzf
                @Override // java.lang.Runnable
                public final void run() {
                    this.i.d(ytfVar, resultCallback);
                }
            });
        }
    }

    public class a implements ResultCallback<RouterConfigResponse> {
        public final /* synthetic */ Context a;
        public final /* synthetic */ PreOrderParameters b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ rw9 f20072c;

        public a(Context context, PreOrderParameters preOrderParameters, rw9 rw9Var) {
            this.a = context;
            this.b = preOrderParameters;
            this.f20072c = rw9Var;
        }

        @Override // com.oplus.pay.opensdk.model.response.ResultCallback
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(RouterConfigResponse routerConfigResponse) {
            if (routerConfigResponse != null) {
                RouterHelper.w(this.a, this.b, l28.a(routerConfigResponse.generalRules), l28.a(routerConfigResponse.merchantRules));
            } else {
                qae.i("response is null clear router info!");
                RouterHelper.w(this.a, this.b, null, null);
                tbe.j(BizResult.ERROR.getValue(), "checkLaunchModel RouterConfigResponse  is null");
            }
            rw9 rw9Var = this.f20072c;
            if (rw9Var != null) {
                rw9Var.a();
            }
        }

        @Override // com.oplus.pay.opensdk.model.response.ResultCallback
        public void onFailed(Exception exc) {
            tbe.k(BizResult.ERROR.getValue(), "checkLaunchModel reqRouterConfig error" + exc.getMessage());
            rw9 rw9Var = this.f20072c;
            if (rw9Var != null) {
                rw9Var.a();
            }
        }
    }

    public static Triple<String, String, String> c(Context context, String str, String str2, boolean z) {
        if (TextUtils.isEmpty(str2)) {
            str2 = wbe.e(context, str, "SENSOR_ACTION");
        }
        String str3 = str2 + ActionInfo.SINGLE_PAY_STARTUP_ACTION.getValue();
        String str4 = str2 + ActionInfo.PREORDER_PAY_STARTUP_ACTION.getValue();
        return new Triple<>(z ? str4 : str3, str3, str4);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0060  */
    /* JADX WARN: Code duplicated, block: B:17:0x0085 A[RETURN] */
    public static TargetHostAppInfo d(Context context, RouterConfigResponse.RouterRule routerRule, boolean z) {
        String sensorAction;
        String str;
        String strH;
        CashierHost cashierHost = CashierHost.MSP;
        if (!cashierHost.getHost().equalsIgnoreCase(routerRule.cashierHost)) {
            CashierHost cashierHost2 = CashierHost.SECURE_APP;
            if (cashierHost2.getHost().equalsIgnoreCase(routerRule.cashierHost)) {
                strH = h(context, routerRule.cashierHost);
                sensorAction = cashierHost2.getSensorAction();
                qae.b("buildTargetHostAppInfo#SECURE_APP");
            } else if (CashierHost.MERCHANT_APP.getHost().equalsIgnoreCase(routerRule.cashierHost)) {
                String strH2 = h(context, routerRule.cashierHost);
                qae.b("buildTargetHostAppInfo#MERCHANT_APP");
                str = strH2;
                sensorAction = null;
            } else {
                sensorAction = null;
                str = null;
            }
            if (!TextUtils.isEmpty(str)) {
                return null;
            }
            Triple<String, String, String> tripleC = c(context, str, sensorAction, z);
            return new TargetHostAppInfo(routerRule.cashierType, routerRule.cashierHost, str, tripleC.getFirst(), tripleC.getSecond(), tripleC.getThird(), null);
        }
        strH = cashierHost.getPkgName();
        sensorAction = cashierHost.getSensorAction();
        qae.b("buildTargetHostAppInfo#MSP");
        str = strH;
        if (!TextUtils.isEmpty(str)) {
            return null;
        }
        Triple<String, String, String> tripleC2 = c(context, str, sensorAction, z);
        return new TargetHostAppInfo(routerRule.cashierType, routerRule.cashierHost, str, tripleC2.getFirst(), tripleC2.getSecond(), tripleC2.getThird(), null);
    }

    public static RouterConfigResponse.RouterRule e(CashierType cashierType, CashierHost cashierHost, int i, int i2) {
        RouterConfigResponse.RouterRule routerRule = new RouterConfigResponse.RouterRule();
        routerRule.cashierType = cashierType.getValue();
        routerRule.cashierHost = cashierHost.getHost();
        routerRule.priority = i2;
        if (CashierType.APP.getValue().equalsIgnoreCase(cashierType.getValue())) {
            routerRule.kitMinVersion = i;
        } else {
            routerRule.cashierLinkUrl = "";
            routerRule.sdkMinVersion = BuildConfig.PAY_VERSION_CODE;
        }
        return routerRule;
    }

    public static Pair<TargetHostAppInfo, Boolean> f(Context context, boolean z) {
        CashierHost cashierHost = CashierHost.SECURE_APP;
        String strH = h(context, cashierHost.getHost());
        Triple<String, String, String> tripleC = c(context, strH, cashierHost.getSensorAction(), z);
        return Pair.create(new TargetHostAppInfo(CashierType.APP.getValue(), cashierHost.getHost(), strH, tripleC.getFirst(), tripleC.getSecond(), tripleC.getThird(), null), Boolean.valueOf(TextUtils.isEmpty(strH)));
    }

    public static String g(PreOrderParameters preOrderParameters) {
        return npb.b("$sp_sdk_router_data" + preOrderParameters.mCountryCode);
    }

    public static String h(Context context, String str) {
        CashierHost cashierHost = CashierHost.MSP;
        if (cashierHost.getHost().equalsIgnoreCase(str)) {
            return cashierHost.getPkgName();
        }
        if (CashierHost.SECURE_APP.getHost().equalsIgnoreCase(str)) {
            return wbe.f(context);
        }
        if (CashierHost.MERCHANT_APP.getHost().equalsIgnoreCase(str)) {
            return context.getPackageName();
        }
        return null;
    }

    public static int i(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                str = "0";
            }
            return Integer.parseInt(str);
        } catch (Throwable th) {
            qae.c("buildKitVersionInfo# error:" + th.getMessage());
            return 0;
        }
    }

    public static String j(PreOrderParameters preOrderParameters) {
        return npb.b("$sp_sdk_router_data" + preOrderParameters.mCountryCode + preOrderParameters.mPartnerId);
    }

    public static Pair<TargetHostAppInfo, String> k(Context context, RouterConfigResponse.RouterRule routerRule, boolean z) {
        String str;
        if (routerRule == null) {
            qae.i("routerInfo is null, buildTargetHostAppInfo failed!");
            return new Pair<>(null, "routerInfo is null, buildTargetHostAppInfo failed!");
        }
        if (CashierType.APP.getValue().equalsIgnoreCase(routerRule.cashierType)) {
            TargetHostAppInfo targetHostAppInfoD = d(context, routerRule, z);
            if (targetHostAppInfoD != null) {
                return new Pair<>(targetHostAppInfoD, null);
            }
            str = "Failed to build app info!";
        } else {
            str = "";
        }
        if (CashierType.H5.getValue().equalsIgnoreCase(routerRule.cashierType)) {
            if (!TextUtils.isEmpty(routerRule.cashierLinkUrl) && z) {
                qae.b("buildTargetHostAppInfo#H5");
                Triple<String, String, String> tripleC = c(context, context.getPackageName(), null, z);
                return new Pair<>(new TargetHostAppInfo(routerRule.cashierType, routerRule.cashierHost, context.getPackageName(), tripleC.getFirst(), tripleC.getSecond(), tripleC.getThird(), routerRule.cashierLinkUrl), null);
            }
            str = "Failed to build h5 info! pls check cashierLinkUrl or isPreOder!";
        }
        qae.i("buildTargetHostAppInfo failed!" + str);
        return new Pair<>(null, str);
    }

    public static Pair<RouterConfigResponse.RouterRule, String> l(Context context, RouterConfigResponse.RouterRule routerRule, String str, String str2) {
        String str3;
        boolean zR;
        if (routerRule == null) {
            qae.i("routerRule is null");
            return Pair.create(null, "routerRule is null");
        }
        if (CashierType.APP.getValue().equalsIgnoreCase(routerRule.cashierType)) {
            String strH = h(context, routerRule.cashierHost);
            boolean zK = wbe.k(context, strH);
            int i = i(n(wbe.e(context, strH, "PAY_VERSION_NAME")));
            if (zK) {
                boolean z = i >= routerRule.kitMinVersion;
                boolean z2 = hk3.a(routerRule.kitFilterVersion) || !routerRule.kitFilterVersion.contains(Integer.valueOf(i));
                if (ResultType.Y.getValue().equalsIgnoreCase(routerRule.isSupportGlobal)) {
                    String strO = o(context, strH);
                    zR = r(str, str2, strO);
                    qae.b("match global strategy result:" + zR + "\t merchantReg " + str + "\t userReg " + str2 + "\t cashierReg " + strO);
                } else {
                    zR = true;
                }
                if (z && z2 && zR) {
                    qae.b("hit App Cashier:" + routerRule.cashierHost + "\t" + routerRule.routeRuleType + "\t" + i);
                    return Pair.create(routerRule, null);
                }
                str3 = "host app version not support! SupportMinKitVersion:" + z + " supportFilterKitVersion:" + z2;
            } else {
                str3 = "host app not installed!";
            }
        } else {
            str3 = "";
        }
        if (CashierType.H5.getValue().equalsIgnoreCase(routerRule.cashierType)) {
            if (ResultType.Y.getValue().equalsIgnoreCase(routerRule.isSupportGlobal)) {
                String strO2 = o(context, wbe.f(context));
                boolean zQ = q(str, str2, strO2);
                qae.b("match global strategy result:" + zQ + "\t merchantReg " + str + "\t userReg " + str2 + "\t cashierReg " + strO2);
                if (!zQ) {
                    return Pair.create(null, str3);
                }
            }
            if (30301 < routerRule.sdkMinVersion) {
                str3 = "sdkMinVersion not support!";
            } else {
                if (hk3.a(routerRule.sdkFilterVersion) || !routerRule.sdkFilterVersion.contains(Integer.valueOf(BuildConfig.PAY_VERSION_CODE))) {
                    qae.b("hit H5 Cashier" + routerRule.cashierHost + "\t" + routerRule.routeRuleType);
                    return Pair.create(routerRule, null);
                }
                str3 = "sdkFilterVersion not support!";
            }
        }
        qae.i("hit Router failed!" + str3);
        return Pair.create(null, str3);
    }

    public static Pair<RouterConfigResponse.RouterRule, String> m(Context context, String str, String str2, String str3) {
        RouterConfigResponse routerConfigResponseFromJson;
        if (TextUtils.isEmpty(str)) {
            qae.i("buildDefaultRouter");
            str = o55.a(context);
        }
        try {
            routerConfigResponseFromJson = RouterConfigResponse.fromJson(str);
        } catch (Exception e2) {
            qae.i("Failed to parse router info JSON" + e2);
            routerConfigResponseFromJson = RouterConfigResponse.fromJson(o55.a(context));
        }
        if (routerConfigResponseFromJson == null) {
            qae.i("Response is null after parsing router info JSON buildDefaultRouter");
            routerConfigResponseFromJson = RouterConfigResponse.fromJson(o55.a(context));
        }
        ArrayList<RouterConfigResponse.RouterRule> arrayList = new ArrayList();
        if (!hk3.a(routerConfigResponseFromJson != null ? routerConfigResponseFromJson.merchantRules : null)) {
            arrayList.addAll(routerConfigResponseFromJson.merchantRules);
        }
        if (!hk3.a(routerConfigResponseFromJson != null ? routerConfigResponseFromJson.generalRules : null)) {
            arrayList.addAll(routerConfigResponseFromJson.generalRules);
        }
        for (RouterConfigResponse.RouterRule routerRule : arrayList) {
            Pair<RouterConfigResponse.RouterRule, String> pairL = l(context, routerRule, str2, str3);
            Object obj = pairL.first;
            if (obj != null) {
                return Pair.create((RouterConfigResponse.RouterRule) obj, null);
            }
            qae.i("Failed to find a suitable router rule!:" + ((String) pairL.second));
            tbe.k(BizResult.WARN.getValue(), routerRule.cashierHost + "\t" + routerRule.routeRuleType + "\t" + ((String) pairL.second));
        }
        return Pair.create(null, "Failed to find a suitable router rule!");
    }

    public static String n(String str) {
        return TextUtils.isEmpty(str) ? str : str.replace(".", "");
    }

    public static String o(Context context, String str) {
        return wbe.e(context, str, "FLAVOR_REGION");
    }

    public static void p(final Context context, final PreOrderParameters preOrderParameters, final pw9 pw9Var) {
        String strT = t(context, preOrderParameters);
        if (TextUtils.isEmpty(strT)) {
            u(context, preOrderParameters, new rw9() { // from class: com.oplus.aiunit.vision.gzf
                @Override // com.oplus.aiunit.vision.rw9
                public final void a() {
                    RouterHelper.s(context, preOrderParameters, pw9Var);
                }
            });
            return;
        }
        qae.f("readCacheRouterInfo from cache done and reqRemoterRouterConfig");
        pw9Var.a(strT);
        u(context, preOrderParameters, null);
    }

    public static boolean q(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str2)) {
            return false;
        }
        if (Objects.equals(st3.a(str), st3.a(str2))) {
            return "China".equalsIgnoreCase(str3) ? !"CN".equalsIgnoreCase(str) : "CN".equalsIgnoreCase(str);
        }
        return true;
    }

    public static boolean r(String str, String str2, String str3) {
        if (Objects.equals(str, str2)) {
            return "CN".equalsIgnoreCase(str) ? "China".equalsIgnoreCase(str3) : "Oversea".equalsIgnoreCase(str3);
        }
        return false;
    }

    public static /* synthetic */ void s(Context context, PreOrderParameters preOrderParameters, pw9 pw9Var) {
        qae.f("reqRemoterRouterConfig from net done and readCacheRouterInfo");
        pw9Var.a(t(context, preOrderParameters));
    }

    public static String t(Context context, PreOrderParameters preOrderParameters) {
        boolean z = false;
        SharedPreferences sharedPreferences = context.getSharedPreferences("$sp_pay_sdk_router_data_file", 0);
        String strG = g(preOrderParameters);
        if (TextUtils.isEmpty(preOrderParameters.mPartnerId)) {
            qae.i("mPartnerId is empty! only get generalRouter data!");
            try {
                String string = sharedPreferences.getString(strG, "");
                if (!TextUtils.isEmpty(string) && !"[]".equals(string)) {
                    return new JSONObject().put("generalRules", new JSONArray(string)).toString();
                }
                qae.b("generalRules is empty, return null");
                return null;
            } catch (JSONException e2) {
                qae.c("mPartnerId is null generalRules jsonException:" + e2.getMessage());
                return null;
            }
        }
        String strJ = j(preOrderParameters);
        JSONObject jSONObject = new JSONObject();
        boolean z2 = true;
        try {
            String string2 = sharedPreferences.getString(strJ, "");
            if (!TextUtils.isEmpty(string2) && !"[]".equals(string2)) {
                jSONObject.put("merchantRules", new JSONArray(string2));
                z = true;
            }
        } catch (JSONException e3) {
            qae.c("merchantRules jsonException:" + e3.getMessage());
        }
        try {
            String string3 = sharedPreferences.getString(strG, "");
            if (TextUtils.isEmpty(string3) || "[]".equals(string3)) {
                z2 = z;
            } else {
                jSONObject.put("generalRules", new JSONArray(string3));
            }
            z = z2;
        } catch (JSONException e4) {
            qae.c("generalRules jsonException:" + e4.getMessage());
        }
        if (z) {
            return jSONObject.toString();
        }
        qae.b("No valid router data found, return null");
        return null;
    }

    public static void u(Context context, PreOrderParameters preOrderParameters, rw9 rw9Var) {
        RouterConfigRequest routerConfigRequest = new RouterConfigRequest();
        routerConfigRequest.countryCode = preOrderParameters.mCountryCode;
        if (TextUtils.isEmpty(preOrderParameters.prePayToken)) {
            routerConfigRequest.merchantNo = ((PayParameters) preOrderParameters).mPartnerId;
            routerConfigRequest.prePayToken = "";
        } else {
            routerConfigRequest.merchantNo = "";
            routerConfigRequest.prePayToken = preOrderParameters.prePayToken;
        }
        routerConfigRequest.openid = sh5.e(context.getApplicationContext());
        routerConfigRequest.sign = b3h.f(routerConfigRequest);
        v(context, qmk.b(context, ebe.QUERY_ROUTER_CONF, preOrderParameters.mCountryCode, preOrderParameters.userRegisterCountry), new Gson().toJson(routerConfigRequest), new a(context, preOrderParameters, rw9Var));
    }

    public static void v(Context context, String str, String str2, ResultCallback<RouterConfigResponse> resultCallback) {
        efd efdVarC = new gpc().c(context, s0g.KEY_PAY, true);
        gqf gqfVarCreate = gqf.create(MediaType.parse("application/encrypted-json; charset=utf-8"), str2);
        qae.b("mRequestUrl：" + str);
        efdVarC.a(new Request.Builder().url(str).post(gqfVarCreate).build()).g(new AnonymousClass2(context, resultCallback));
    }

    public static void w(Context context, PreOrderParameters preOrderParameters, String str, String str2) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("$sp_pay_sdk_router_data_file", 0);
        String strG = g(preOrderParameters);
        if (!TextUtils.isEmpty(preOrderParameters.mPartnerId)) {
            sharedPreferences.edit().putString(j(preOrderParameters), str2).apply();
            sharedPreferences.edit().putString(strG, str).apply();
            return;
        }
        qae.i("mPartnerId is empty! not save merchantRouter info! only save generalRouter info!");
        tbe.k(BizResult.WARN.getValue(), "mPartnerId is empty，generalRules:" + str);
        sharedPreferences.edit().putString(strG, str).apply();
    }
}
