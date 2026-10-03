package com.oplus.pay.opensdk.router;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.oplus.aiunit.vision.axf;
import com.oplus.aiunit.vision.crb;
import com.oplus.aiunit.vision.d14;
import com.oplus.aiunit.vision.dde;
import com.oplus.aiunit.vision.exf;
import com.oplus.aiunit.vision.gqe;
import com.oplus.aiunit.vision.gu3;
import com.oplus.aiunit.vision.i65;
import com.oplus.aiunit.vision.itf;
import com.oplus.aiunit.vision.ks2;
import com.oplus.aiunit.vision.nt2;
import com.oplus.aiunit.vision.o38;
import com.oplus.aiunit.vision.oi5;
import com.oplus.aiunit.vision.pce;
import com.oplus.aiunit.vision.sde;
import com.oplus.aiunit.vision.t6h;
import com.oplus.aiunit.vision.v3g;
import com.oplus.aiunit.vision.vde;
import com.oplus.aiunit.vision.vgd;
import com.oplus.aiunit.vision.vk3;
import com.oplus.aiunit.vision.vqk;
import com.oplus.aiunit.vision.wx9;
import com.oplus.aiunit.vision.yqc;
import com.oplus.aiunit.vision.yx9;
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
import com.oplus.utrace.lib.SdkConfigConst;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.Executor;
import kotlin.Triple;
import okhttp3.MediaType;
import okhttp3.Request;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public final class RouterHelper {

    public class 2 implements nt2 {
        public final /* synthetic */ Context i;
        public final /* synthetic */ ResultCallback j;

        public 2(Context context, ResultCallback resultCallback) {
            this.i = context;
            this.j = resultCallback;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public /* synthetic */ void d(axf axfVar, ResultCallback resultCallback) {
            try {
                exf exfVarG = axfVar.g();
                Objects.requireNonNull(exfVarG);
                String strS = exfVarG.s();
                pce.b("responseStr：" + strS);
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
            } catch (Exception e) {
                resultCallback.onFailed(e);
            }
        }

        public void onFailure(@NonNull ks2 ks2Var, @NonNull final IOException iOException) {
            Executor mainExecutor = ContextCompat.getMainExecutor(this.i);
            final ResultCallback resultCallback = this.j;
            mainExecutor.execute(new Runnable() { // from class: com.oplus.aiunit.vision.l2g
                @Override // java.lang.Runnable
                public final void run() {
                    resultCallback.onFailed(iOException);
                }
            });
        }

        public void onResponse(@NonNull ks2 ks2Var, @NonNull final axf axfVar) {
            Executor mainExecutor = ContextCompat.getMainExecutor(this.i);
            final ResultCallback resultCallback = this.j;
            mainExecutor.execute(new Runnable() { // from class: com.oplus.aiunit.vision.k2g
                @Override // java.lang.Runnable
                public final void run() {
                    this.i.d(axfVar, resultCallback);
                }
            });
        }
    }

    public class a implements ResultCallback<RouterConfigResponse> {
        public final /* synthetic */ Context a;
        public final /* synthetic */ PreOrderParameters b;
        public final /* synthetic */ yx9 c;

        public a(Context context, PreOrderParameters preOrderParameters, yx9 yx9Var) {
            this.a = context;
            this.b = preOrderParameters;
            this.c = yx9Var;
        }

        @Override // com.oplus.pay.opensdk.model.response.ResultCallback
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(RouterConfigResponse routerConfigResponse) {
            if (routerConfigResponse != null) {
                RouterHelper.w(this.a, this.b, o38.a(routerConfigResponse.generalRules), o38.a(routerConfigResponse.merchantRules));
            } else {
                pce.i("response is null clear router info!");
                RouterHelper.w(this.a, this.b, null, null);
                sde.j(BizResult.ERROR.getValue(), "checkLaunchModel RouterConfigResponse  is null");
            }
            yx9 yx9Var = this.c;
            if (yx9Var != null) {
                yx9Var.a();
            }
        }

        @Override // com.oplus.pay.opensdk.model.response.ResultCallback
        public void onFailed(Exception exc) {
            sde.k(BizResult.ERROR.getValue(), "checkLaunchModel reqRouterConfig error" + exc.getMessage());
            yx9 yx9Var = this.c;
            if (yx9Var != null) {
                yx9Var.a();
            }
        }
    }

    public static Triple<String, String, String> c(Context context, String str, String str2, boolean z) {
        if (TextUtils.isEmpty(str2)) {
            str2 = vde.e(context, str, "SENSOR_ACTION");
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
                pce.b("buildTargetHostAppInfo#SECURE_APP");
            } else if (CashierHost.MERCHANT_APP.getHost().equalsIgnoreCase(routerRule.cashierHost)) {
                String strH2 = h(context, routerRule.cashierHost);
                pce.b("buildTargetHostAppInfo#MERCHANT_APP");
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
            return new TargetHostAppInfo(routerRule.cashierType, routerRule.cashierHost, str, (String) tripleC.getFirst(), (String) tripleC.getSecond(), (String) tripleC.getThird(), null);
        }
        strH = cashierHost.getPkgName();
        sensorAction = cashierHost.getSensorAction();
        pce.b("buildTargetHostAppInfo#MSP");
        str = strH;
        if (!TextUtils.isEmpty(str)) {
            return null;
        }
        Triple<String, String, String> tripleC2 = c(context, str, sensorAction, z);
        return new TargetHostAppInfo(routerRule.cashierType, routerRule.cashierHost, str, (String) tripleC2.getFirst(), (String) tripleC2.getSecond(), (String) tripleC2.getThird(), null);
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
            routerRule.sdkMinVersion = 30301;
        }
        return routerRule;
    }

    public static Pair<TargetHostAppInfo, Boolean> f(Context context, boolean z) {
        CashierHost cashierHost = CashierHost.SECURE_APP;
        String strH = h(context, cashierHost.getHost());
        Triple<String, String, String> tripleC = c(context, strH, cashierHost.getSensorAction(), z);
        return Pair.create(new TargetHostAppInfo(CashierType.APP.getValue(), cashierHost.getHost(), strH, (String) tripleC.getFirst(), (String) tripleC.getSecond(), (String) tripleC.getThird(), null), Boolean.valueOf(TextUtils.isEmpty(strH)));
    }

    public static String g(PreOrderParameters preOrderParameters) {
        return crb.b("$sp_sdk_router_data" + preOrderParameters.mCountryCode);
    }

    public static String h(Context context, String str) {
        CashierHost cashierHost = CashierHost.MSP;
        if (cashierHost.getHost().equalsIgnoreCase(str)) {
            return cashierHost.getPkgName();
        }
        if (CashierHost.SECURE_APP.getHost().equalsIgnoreCase(str)) {
            return vde.f(context);
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
            pce.c("buildKitVersionInfo# error:" + th.getMessage());
            return 0;
        }
    }

    public static String j(PreOrderParameters preOrderParameters) {
        return crb.b("$sp_sdk_router_data" + preOrderParameters.mCountryCode + preOrderParameters.mPartnerId);
    }

    public static Pair<TargetHostAppInfo, String> k(Context context, RouterConfigResponse.RouterRule routerRule, boolean z) {
        String str;
        if (routerRule == null) {
            pce.i("routerInfo is null, buildTargetHostAppInfo failed!");
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
                pce.b("buildTargetHostAppInfo#H5");
                Triple<String, String, String> tripleC = c(context, context.getPackageName(), null, z);
                return new Pair<>(new TargetHostAppInfo(routerRule.cashierType, routerRule.cashierHost, context.getPackageName(), (String) tripleC.getFirst(), (String) tripleC.getSecond(), (String) tripleC.getThird(), routerRule.cashierLinkUrl), null);
            }
            str = "Failed to build h5 info! pls check cashierLinkUrl or isPreOder!";
        }
        pce.i("buildTargetHostAppInfo failed!" + str);
        return new Pair<>(null, str);
    }

    public static Pair<RouterConfigResponse.RouterRule, String> l(Context context, RouterConfigResponse.RouterRule routerRule, String str, String str2) {
        String str3;
        boolean zR;
        if (routerRule == null) {
            pce.i("routerRule is null");
            return Pair.create(null, "routerRule is null");
        }
        if (CashierType.APP.getValue().equalsIgnoreCase(routerRule.cashierType)) {
            String strH = h(context, routerRule.cashierHost);
            boolean zK = vde.k(context, strH);
            int i = i(n(vde.e(context, strH, "PAY_VERSION_NAME")));
            if (zK) {
                boolean z = i >= routerRule.kitMinVersion;
                boolean z2 = vk3.a(routerRule.kitFilterVersion) || !routerRule.kitFilterVersion.contains(Integer.valueOf(i));
                if (ResultType.Y.getValue().equalsIgnoreCase(routerRule.isSupportGlobal)) {
                    String strO = o(context, strH);
                    zR = r(str, str2, strO);
                    pce.b("match global strategy result:" + zR + "\t merchantReg " + str + "\t userReg " + str2 + "\t cashierReg " + strO);
                } else {
                    zR = true;
                }
                if (z && z2 && zR) {
                    pce.b("hit App Cashier:" + routerRule.cashierHost + "\t" + routerRule.routeRuleType + "\t" + i);
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
                String strO2 = o(context, vde.f(context));
                boolean zQ = q(str, str2, strO2);
                pce.b("match global strategy result:" + zQ + "\t merchantReg " + str + "\t userReg " + str2 + "\t cashierReg " + strO2);
                if (!zQ) {
                    return Pair.create(null, str3);
                }
            }
            if (30301 < routerRule.sdkMinVersion) {
                str3 = "sdkMinVersion not support!";
            } else {
                if (vk3.a(routerRule.sdkFilterVersion) || !routerRule.sdkFilterVersion.contains(30301)) {
                    pce.b("hit H5 Cashier" + routerRule.cashierHost + "\t" + routerRule.routeRuleType);
                    return Pair.create(routerRule, null);
                }
                str3 = "sdkFilterVersion not support!";
            }
        }
        pce.i("hit Router failed!" + str3);
        return Pair.create(null, str3);
    }

    public static Pair<RouterConfigResponse.RouterRule, String> m(Context context, String str, String str2, String str3) {
        RouterConfigResponse routerConfigResponseFromJson;
        if (TextUtils.isEmpty(str)) {
            pce.i("buildDefaultRouter");
            str = i65.a(context);
        }
        try {
            routerConfigResponseFromJson = RouterConfigResponse.fromJson(str);
        } catch (Exception e) {
            pce.i("Failed to parse router info JSON" + e);
            routerConfigResponseFromJson = RouterConfigResponse.fromJson(i65.a(context));
        }
        if (routerConfigResponseFromJson == null) {
            pce.i("Response is null after parsing router info JSON buildDefaultRouter");
            routerConfigResponseFromJson = RouterConfigResponse.fromJson(i65.a(context));
        }
        ArrayList<RouterConfigResponse.RouterRule> arrayList = new ArrayList();
        if (!vk3.a(routerConfigResponseFromJson != null ? routerConfigResponseFromJson.merchantRules : null)) {
            arrayList.addAll(routerConfigResponseFromJson.merchantRules);
        }
        if (!vk3.a(routerConfigResponseFromJson != null ? routerConfigResponseFromJson.generalRules : null)) {
            arrayList.addAll(routerConfigResponseFromJson.generalRules);
        }
        for (RouterConfigResponse.RouterRule routerRule : arrayList) {
            Pair<RouterConfigResponse.RouterRule, String> pairL = l(context, routerRule, str2, str3);
            Object obj = pairL.first;
            if (obj != null) {
                return Pair.create((RouterConfigResponse.RouterRule) obj, null);
            }
            pce.i("Failed to find a suitable router rule!:" + ((String) pairL.second));
            sde.k(BizResult.WARN.getValue(), routerRule.cashierHost + "\t" + routerRule.routeRuleType + "\t" + ((String) pairL.second));
        }
        return Pair.create(null, "Failed to find a suitable router rule!");
    }

    public static String n(String str) {
        return TextUtils.isEmpty(str) ? str : str.replace(d14.POINT_REGEX, "");
    }

    public static String o(Context context, String str) {
        return vde.e(context, str, "FLAVOR_REGION");
    }

    public static void p(final Context context, final PreOrderParameters preOrderParameters, final wx9 wx9Var) {
        String strT = t(context, preOrderParameters);
        if (TextUtils.isEmpty(strT)) {
            u(context, preOrderParameters, new yx9() { // from class: com.oplus.aiunit.vision.j2g
                @Override // com.oplus.aiunit.vision.yx9
                public final void a() {
                    RouterHelper.s(context, preOrderParameters, wx9Var);
                }
            });
            return;
        }
        pce.f("readCacheRouterInfo from cache done and reqRemoterRouterConfig");
        wx9Var.a(strT);
        u(context, preOrderParameters, null);
    }

    public static boolean q(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str2)) {
            return false;
        }
        if (Objects.equals(gu3.a(str), gu3.a(str2))) {
            return "China".equalsIgnoreCase(str3) ? !gqe.DEFAULT_LANGUAGE.equalsIgnoreCase(str) : gqe.DEFAULT_LANGUAGE.equalsIgnoreCase(str);
        }
        return true;
    }

    public static boolean r(String str, String str2, String str3) {
        if (Objects.equals(str, str2)) {
            return gqe.DEFAULT_LANGUAGE.equalsIgnoreCase(str) ? "China".equalsIgnoreCase(str3) : "Oversea".equalsIgnoreCase(str3);
        }
        return false;
    }

    public static /* synthetic */ void s(Context context, PreOrderParameters preOrderParameters, wx9 wx9Var) {
        pce.f("reqRemoterRouterConfig from net done and readCacheRouterInfo");
        wx9Var.a(t(context, preOrderParameters));
    }

    public static String t(Context context, PreOrderParameters preOrderParameters) {
        boolean z = false;
        SharedPreferences sharedPreferences = context.getSharedPreferences("$sp_pay_sdk_router_data_file", 0);
        String strG = g(preOrderParameters);
        if (TextUtils.isEmpty(preOrderParameters.mPartnerId)) {
            pce.i("mPartnerId is empty! only get generalRouter data!");
            try {
                String string = sharedPreferences.getString(strG, "");
                if (!TextUtils.isEmpty(string) && !SdkConfigConst.EMPTY_JSON_ARRAY.equals(string)) {
                    return new JSONObject().put("generalRules", new JSONArray(string)).toString();
                }
                pce.b("generalRules is empty, return null");
                return null;
            } catch (JSONException e) {
                pce.c("mPartnerId is null generalRules jsonException:" + e.getMessage());
                return null;
            }
        }
        String strJ = j(preOrderParameters);
        JSONObject jSONObject = new JSONObject();
        boolean z2 = true;
        try {
            String string2 = sharedPreferences.getString(strJ, "");
            if (!TextUtils.isEmpty(string2) && !SdkConfigConst.EMPTY_JSON_ARRAY.equals(string2)) {
                jSONObject.put("merchantRules", new JSONArray(string2));
                z = true;
            }
        } catch (JSONException e2) {
            pce.c("merchantRules jsonException:" + e2.getMessage());
        }
        try {
            String string3 = sharedPreferences.getString(strG, "");
            if (TextUtils.isEmpty(string3) || SdkConfigConst.EMPTY_JSON_ARRAY.equals(string3)) {
                z2 = z;
            } else {
                jSONObject.put("generalRules", new JSONArray(string3));
            }
            z = z2;
        } catch (JSONException e3) {
            pce.c("generalRules jsonException:" + e3.getMessage());
        }
        if (z) {
            return jSONObject.toString();
        }
        pce.b("No valid router data found, return null");
        return null;
    }

    public static void u(Context context, PreOrderParameters preOrderParameters, yx9 yx9Var) {
        RouterConfigRequest routerConfigRequest = new RouterConfigRequest();
        routerConfigRequest.countryCode = preOrderParameters.mCountryCode;
        if (TextUtils.isEmpty(preOrderParameters.prePayToken)) {
            routerConfigRequest.merchantNo = ((PayParameters) preOrderParameters).mPartnerId;
            routerConfigRequest.prePayToken = "";
        } else {
            routerConfigRequest.merchantNo = "";
            routerConfigRequest.prePayToken = preOrderParameters.prePayToken;
        }
        routerConfigRequest.openid = oi5.e(context.getApplicationContext());
        routerConfigRequest.sign = t6h.f(routerConfigRequest);
        v(context, vqk.b(context, dde.QUERY_ROUTER_CONF, preOrderParameters.mCountryCode, preOrderParameters.userRegisterCountry), new Gson().toJson(routerConfigRequest), new a(context, preOrderParameters, yx9Var));
    }

    public static void v(Context context, String str, String str2, ResultCallback<RouterConfigResponse> resultCallback) {
        vgd vgdVarC = new yqc().c(context, v3g.KEY_PAY, true);
        itf itfVarCreate = itf.create(MediaType.parse("application/encrypted-json; charset=utf-8"), str2);
        pce.b("mRequestUrl：" + str);
        vgdVarC.a(new Request.Builder().url(str).post(itfVarCreate).build()).g(new 2(context, resultCallback));
    }

    public static void w(Context context, PreOrderParameters preOrderParameters, String str, String str2) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("$sp_pay_sdk_router_data_file", 0);
        String strG = g(preOrderParameters);
        if (!TextUtils.isEmpty(preOrderParameters.mPartnerId)) {
            sharedPreferences.edit().putString(j(preOrderParameters), str2).apply();
            sharedPreferences.edit().putString(strG, str).apply();
            return;
        }
        pce.i("mPartnerId is empty! not save merchantRouter info! only save generalRouter info!");
        sde.k(BizResult.WARN.getValue(), "mPartnerId is empty，generalRules:" + str);
        sharedPreferences.edit().putString(strG, str).apply();
    }
}
