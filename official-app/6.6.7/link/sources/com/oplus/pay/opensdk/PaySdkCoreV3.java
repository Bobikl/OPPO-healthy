package com.oplus.pay.opensdk;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.client.platform.opensdk.pay.PayRequest;
import com.client.platform.opensdk.pay.PayXorUtils;
import com.google.gson.Gson;
import com.heytap.msp.bean.BizResponse;
import com.oplus.aiunit.vision.dde;
import com.oplus.aiunit.vision.esl;
import com.oplus.aiunit.vision.gsl;
import com.oplus.aiunit.vision.hvj;
import com.oplus.aiunit.vision.n8c;
import com.oplus.aiunit.vision.nce;
import com.oplus.aiunit.vision.nde;
import com.oplus.aiunit.vision.pce;
import com.oplus.aiunit.vision.rde;
import com.oplus.aiunit.vision.sde;
import com.oplus.aiunit.vision.ua4;
import com.oplus.aiunit.vision.vde;
import com.oplus.aiunit.vision.vfg;
import com.oplus.aiunit.vision.wce;
import com.oplus.aiunit.vision.ws9;
import com.oplus.aiunit.vision.xa0;
import com.oplus.pantanal.seedling.constants.TraceConstants;
import com.oplus.pay.opensdk.PaySdkCoreV3;
import com.oplus.pay.opensdk.chain.CheckPreOrder;
import com.oplus.pay.opensdk.chain.b;
import com.oplus.pay.opensdk.chain.c;
import com.oplus.pay.opensdk.chain.d;
import com.oplus.pay.opensdk.chain.e;
import com.oplus.pay.opensdk.chain.f;
import com.oplus.pay.opensdk.chain.g;
import com.oplus.pay.opensdk.eum.PaySdkEnum;
import com.oplus.pay.opensdk.model.ActionInfo;
import com.oplus.pay.opensdk.model.CashierHost;
import com.oplus.pay.opensdk.model.CashierType;
import com.oplus.pay.opensdk.model.PayParameters;
import com.oplus.pay.opensdk.model.PreOrderParameters;
import com.oplus.pay.opensdk.statistic.helper.BrandHelper;
import com.oplus.pay.opensdk.statistic.model.BizNode;
import com.oplus.pay.opensdk.statistic.model.BizResult;
import com.oplus.pay.opensdk.statistic.model.TransactionProcessStatusCodes;
import com.oplus.pay.opensdk.utils.Resource;
import java.io.UnsupportedEncodingException;
import java.lang.ref.SoftReference;
import java.net.URLEncoder;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b+\u0010,J \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007J\u001e\u0010\f\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006JH\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0011H\u0002JH\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0011H\u0002J2\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002J.\u0010\u001c\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0019\u001a\u0004\u0018\u00010\u00162\b\u0010\u001a\u001a\u0004\u0018\u00010\r2\b\u0010\u001b\u001a\u0004\u0018\u00010\rH\u0002J.\u0010\u001e\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0019\u001a\u0004\u0018\u00010\u00162\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0004H\u0002J\u0014\u0010 \u001a\u0004\u0018\u00010\r2\b\u0010\u001f\u001a\u0004\u0018\u00010\rH\u0002JB\u0010!\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u001a\u001a\u0004\u0018\u00010\r2\b\u0010\u0019\u001a\u0004\u0018\u00010\u00162\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\u001b\u001a\u0004\u0018\u00010\r2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0004H\u0002J.\u0010#\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0019\u001a\u0004\u0018\u00010\u00162\b\u0010\u001b\u001a\u0004\u0018\u00010\r2\b\u0010\"\u001a\u0004\u0018\u00010\rH\u0002R\"\u0010*\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)¨\u0006-"}, d2 = {"Lcom/oplus/pay/opensdk/PaySdkCoreV3;", "", "Landroid/content/Context;", "context", "Lcom/client/platform/opensdk/pay/PayRequest;", "mPayRequest", "", dde.IS_EU, "", "m", "Lcom/oplus/pay/opensdk/model/PreOrderParameters;", "preOrderParameters", "o", "", "mspPackageName", "mspAction", "preOrderMspAction", "Lcom/oplus/pay/opensdk/chain/g$a;", "callback", "j", "k", "Lcom/oplus/pay/opensdk/utils/Resource;", "Landroid/content/Intent;", "result", "e", TraceConstants.KEY_ACTION, "launchModel", dde.INPUT_PARAMETERS, "r", "payRequest", "h", "expandInfo", "g", "l", "errorMsg", "f", "a", "Ljava/lang/String;", "getMPayId", "()Ljava/lang/String;", "q", "(Ljava/lang/String;)V", "mPayId", "<init>", "()V", "paysdk_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nPaySdkCoreV3.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaySdkCoreV3.kt\ncom/oplus/pay/opensdk/PaySdkCoreV3\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,550:1\n1#2:551\n*E\n"})
public final class PaySdkCoreV3 {

    @NotNull
    public static final PaySdkCoreV3 INSTANCE = new PaySdkCoreV3();

    @NotNull
    public static String a = "";

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0014¨\u0006\t"}, d2 = {"com/oplus/pay/opensdk/PaySdkCoreV3$a", "Lcom/oplus/aiunit/vision/vfg;", "Landroid/content/Context;", "context", "Lcom/heytap/msp/bean/BizResponse;", "", "response", "", "a", "paysdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class a extends vfg {
        public final /* synthetic */ String b;
        public final /* synthetic */ boolean c;
        public final /* synthetic */ PreOrderParameters d;
        public final /* synthetic */ PayRequest e;
        public final /* synthetic */ Intent f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, String str, boolean z, PreOrderParameters preOrderParameters, PayRequest payRequest, Intent intent) {
            super(context);
            this.b = str;
            this.c = z;
            this.d = preOrderParameters;
            this.e = payRequest;
            this.f = intent;
        }

        @Override // com.oplus.aiunit.vision.vfg
        public void a(@NotNull Context context, @NotNull BizResponse<String> response) throws JSONException {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(response, "response");
            pce.b("callback#mspPayV2:" + response);
            if (response.getCode() != 0) {
                String message = response.getMessage() != null ? response.getMessage() : "unKnow";
                String str = this.b;
                if (str == null) {
                    str = "";
                }
                String value = BizNode.START_PAY.getValue();
                TransactionProcessStatusCodes transactionProcessStatusCodes = TransactionProcessStatusCodes.CODE_00_000_0033;
                sde.c(str, value, transactionProcessStatusCodes.getStatusCode(), BizResult.WARN.getValue(), transactionProcessStatusCodes.getDesc() + message + '(' + response.getCode() + ')', message, "SDK", CashierHost.SECURE_APP.getHost());
                if (response.getCode() != 20002) {
                    PaySdkCoreV3.INSTANCE.f(context, this.f, this.b, message + '(' + response.getCode() + ')');
                    return;
                }
                if (this.c) {
                    int code = PaySdkEnum.CODE_PERMISSION_DENIED.getCode();
                    PreOrderParameters preOrderParameters = this.d;
                    vde.l(context, code, "", preOrderParameters != null ? preOrderParameters.prePayToken : null, preOrderParameters != null ? preOrderParameters.expandInfo : null, message + '(' + response.getCode() + ')');
                    return;
                }
                int code2 = PaySdkEnum.CODE_PERMISSION_DENIED.getCode();
                PayRequest payRequest = this.e;
                vde.l(context, code2, payRequest != null ? payRequest.mPartnerOrder : null, "", payRequest != null ? payRequest.extraInfo : null, message + '(' + response.getCode() + ')');
            }
        }
    }

    public static final void i(String str, String str2, final Context context, final PreOrderParameters preOrderParameters, PayRequest payRequest, String str3, String str4, String str5, final String str6) {
        Intrinsics.checkNotNullParameter(context, "$context");
        Intrinsics.checkNotNullParameter(str4, "$realUrl");
        pce.b("H5 CashierType startOpenWebContainer");
        gsl gslVar = gsl.INSTANCE;
        String strG = INSTANCE.g(str);
        String strM = vde.m(str2, dde.KEY_PACKAGE_NAME);
        if (strM == null) {
            strM = "";
        }
        String str7 = strM;
        esl eslVar = new esl(new SoftReference(context));
        String str8 = preOrderParameters.expandInfo;
        if (str8 == null) {
            str8 = payRequest != null ? payRequest.expandInfo : null;
        }
        String strA = wce.a(str8);
        Intrinsics.checkNotNullExpressionValue(str3, rde.KEY_COUNTRY_CODE);
        gslVar.a(context, str3, str4, strG, eslVar, str5, str7, Boolean.TRUE, (768 & 256) != 0 ? null : new Function2<String, String, Unit>() { // from class: com.oplus.pay.opensdk.PaySdkCoreV3$launchPay$2$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((String) obj, (String) obj2);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull String str9, @NotNull String str10) {
                Intrinsics.checkNotNullParameter(str9, "tipMsg");
                Intrinsics.checkNotNullParameter(str10, "realMsg");
                String str11 = str6;
                if (str11 == null) {
                    str11 = "";
                }
                String str12 = str11;
                String value = BizNode.START_PAY.getValue();
                TransactionProcessStatusCodes transactionProcessStatusCodes = TransactionProcessStatusCodes.CODE_00_000_0036;
                String statusCode = transactionProcessStatusCodes.getStatusCode();
                String value2 = BizResult.ERROR.getValue();
                String str13 = transactionProcessStatusCodes.getDesc() + "--" + str10;
                PaySdkEnum paySdkEnum = PaySdkEnum.CheckMBA;
                sde.d(str12, value, statusCode, value2, str13, paySdkEnum.getMsg(), "SDK", (128 & 128) != 0 ? "" : null);
                Context context2 = context;
                int code = paySdkEnum.getCode();
                PreOrderParameters preOrderParameters2 = preOrderParameters;
                vde.l(context2, code, "", preOrderParameters2.prePayToken, preOrderParameters2.expandInfo, str9);
            }
        }, (768 & 512) != 0 ? null : strA, (768 & 1024) != 0 ? null : null, (768 & 2048) != 0 ? null : null, new ws9[0]);
    }

    public static final void n(Context context, PayRequest payRequest, Resource resource) throws JSONException, UnsupportedEncodingException {
        Intrinsics.checkNotNullParameter(context, "$context");
        Intrinsics.checkNotNullParameter(payRequest, "$mPayRequest");
        pce.b("pay end : " + resource.getCode());
        PaySdkCoreV3 paySdkCoreV3 = INSTANCE;
        Intrinsics.checkNotNullExpressionValue(resource, "it");
        paySdkCoreV3.e(context, resource, payRequest, null);
    }

    public static final void p(Context context, PreOrderParameters preOrderParameters, Resource resource) throws JSONException, UnsupportedEncodingException {
        Intrinsics.checkNotNullParameter(context, "$context");
        Intrinsics.checkNotNullParameter(preOrderParameters, "$preOrderParameters");
        pce.b("pay pre-order end : " + resource.getCode());
        PaySdkCoreV3 paySdkCoreV3 = INSTANCE;
        Intrinsics.checkNotNullExpressionValue(resource, "it");
        paySdkCoreV3.e(context, resource, null, preOrderParameters);
    }

    public final void e(Context context, Resource<Intent> result, PayRequest mPayRequest, PreOrderParameters preOrderParameters) throws JSONException, UnsupportedEncodingException {
        int code = result.getCode();
        if (code == PaySdkEnum.CheckSuccess.getCode()) {
            h(context, result.getData(), preOrderParameters, mPayRequest);
            return;
        }
        if (code == PaySdkEnum.CheckInstall.getCode()) {
            nde ndeVar = nde.INSTANCE;
            Intrinsics.checkNotNull(context, "null cannot be cast to non-null type android.app.Activity");
            ndeVar.c((Activity) context, "", "", "", preOrderParameters);
        } else {
            vde.l(context, result.getCode(), mPayRequest != null ? mPayRequest.mPartnerOrder : null, preOrderParameters != null ? preOrderParameters.prePayToken : null, preOrderParameters != null ? preOrderParameters.expandInfo : null, result.getMsg());
        }
    }

    public final void f(Context context, Intent intent, String inputParameters, String errorMsg) throws JSONException {
        boolean zAreEqual;
        Bundle extras;
        sde.l(BizResult.SUCCESS.getValue(), "router failed! defaultStrategy:" + errorMsg);
        String action = intent != null ? intent.getAction() : null;
        Gson gson = new Gson();
        String string = (intent == null || (extras = intent.getExtras()) == null) ? null : extras.getString(dde.PAY_INPUT_PARAMETERS);
        String value = ActionInfo.PREORDER_PAY_STARTUP_ACTION.getValue();
        if (value != null) {
            zAreEqual = Intrinsics.areEqual(action != null ? Boolean.valueOf(StringsKt.endsWith$default(action, value, false, 2, (Object) null)) : null, Boolean.TRUE);
        } else {
            zAreEqual = false;
        }
        if (zAreEqual) {
            PreOrderParameters preOrderParameters = (PreOrderParameters) gson.fromJson(string, PreOrderParameters.class);
            preOrderParameters.defaultStrategy = CashierHost.SECURE_APP.getHost();
            if (BrandHelper.f(context)) {
                Intrinsics.checkNotNullExpressionValue(preOrderParameters, "preOrderParameters");
                o(context, preOrderParameters, false);
                return;
            }
            String str = inputParameters == null ? "" : inputParameters;
            String value2 = BizNode.START_PAY.getValue();
            String statusCode = TransactionProcessStatusCodes.CODE_00_000_00010.getStatusCode();
            String value3 = BizResult.ERROR.getValue();
            StringBuilder sb = new StringBuilder();
            PaySdkEnum paySdkEnum = PaySdkEnum.CheckOutBrand;
            sb.append(paySdkEnum.getCode());
            sb.append("--");
            sb.append(paySdkEnum.getMsg());
            sde.d(str, value2, statusCode, value3, sb.toString(), paySdkEnum.getMsg(), "SDK", (128 & 128) != 0 ? "" : null);
            vde.l(context, paySdkEnum.getCode(), "", preOrderParameters.prePayToken, preOrderParameters.expandInfo, errorMsg != null ? errorMsg : "");
            return;
        }
        PayRequest payRequest = (PayRequest) gson.fromJson(string, PayRequest.class);
        payRequest.mTagKey = string != null ? new JSONObject(string).getString(PayXorUtils.payEncrypt("eIxxCmq", 8)) : null;
        payRequest.defaultStrategy = CashierHost.SECURE_APP.getHost();
        if (BrandHelper.f(context)) {
            Intrinsics.checkNotNullExpressionValue(payRequest, "payRequest");
            m(context, payRequest, false);
            return;
        }
        String str2 = inputParameters == null ? "" : inputParameters;
        String value4 = BizNode.START_PAY.getValue();
        String statusCode2 = TransactionProcessStatusCodes.CODE_00_000_00010.getStatusCode();
        String value5 = BizResult.ERROR.getValue();
        StringBuilder sb2 = new StringBuilder();
        PaySdkEnum paySdkEnum2 = PaySdkEnum.CheckOutBrand;
        sb2.append(paySdkEnum2.getCode());
        sb2.append("--");
        sb2.append(paySdkEnum2.getMsg());
        sde.d(str2, value4, statusCode2, value5, sb2.toString(), paySdkEnum2.getMsg(), "SDK", (128 & 128) != 0 ? "" : null);
        vde.l(context, paySdkEnum2.getCode(), payRequest.mPartnerOrder, "", payRequest.extraInfo, errorMsg != null ? errorMsg : "");
    }

    public final String g(String expandInfo) {
        JSONObject jSONObject;
        if (expandInfo != null) {
            try {
                jSONObject = new JSONObject(expandInfo);
            } catch (Throwable th) {
                pce.c("getUserInfo() fail" + th.getMessage());
                return null;
            }
        } else {
            jSONObject = null;
        }
        if (jSONObject != null) {
            return jSONObject.optString(dde.KEY_USER_INFO);
        }
        return null;
    }

    public final void h(final Context context, Intent intent, final PreOrderParameters preOrderParameters, final PayRequest payRequest) throws JSONException, UnsupportedEncodingException {
        final String str = null;
        String stringExtra = intent != null ? intent.getStringExtra("launchModel") : null;
        String stringExtra2 = intent != null ? intent.getStringExtra(dde.PAY_INPUT_PARAMETERS) : null;
        final String strM = vde.m(stringExtra2, dde.INPUT_PARAMETERS);
        if (payRequest != null) {
            String str2 = payRequest.mPackageName;
            if (str2 == null || str2.length() == 0) {
                payRequest.mPackageName = vde.m(stringExtra2, dde.KEY_PACKAGE_NAME);
            }
        }
        final String strM2 = vde.m(stringExtra2, dde.COUNTRY_CODE);
        if (!StringsKt.equals(CashierType.H5.getValue(), vde.m(strM, dde.TARGET_CASHIER_TYPE), true)) {
            pce.b("launchModel:" + stringExtra);
            if (StringsKt.equals(CashierHost.MSP.getHost(), stringExtra, true)) {
                l(context, stringExtra, intent, preOrderParameters, strM, payRequest);
                return;
            } else {
                r(context, intent, stringExtra, strM);
                return;
            }
        }
        String str3 = preOrderParameters != null ? preOrderParameters.prePayToken : null;
        if (str3 == null || str3.length() == 0) {
            pce.i("H5 CashierType preToken is null defaultStrategy");
            f(context, intent, strM, "");
            return;
        }
        String strM3 = vde.m(strM, dde.TARGET_CASHIER_LINK_URL);
        String str4 = preOrderParameters.expandInfo;
        if (str4 != null) {
            str = str4;
        } else if (payRequest != null) {
            str = payRequest.expandInfo;
        }
        final String str5 = strM3 + "?prePayToken=" + URLEncoder.encode(str3, "UTF-8") + "&countryCode=" + strM2 + "&userRegisterCountry=" + preOrderParameters.userRegisterCountry;
        pce.b("realUrl:" + str5);
        final String str6 = stringExtra2;
        final String str7 = str3;
        new xa0.b().execute(new Runnable() { // from class: com.oplus.aiunit.vision.hde
            @Override // java.lang.Runnable
            public final void run() {
                PaySdkCoreV3.i(str, str6, context, preOrderParameters, payRequest, strM2, str5, str7, strM);
            }
        });
    }

    public final void j(Context context, PayRequest mPayRequest, String mspPackageName, String mspAction, String preOrderMspAction, boolean isEU, g.a callback) throws JSONException {
        pce.b("pay check start");
        PayParameters payParametersA = ua4.a(mPayRequest);
        Intrinsics.checkNotNullExpressionValue(payParametersA, "parameters");
        k(context, payParametersA, mspPackageName, mspAction, preOrderMspAction, isEU, callback);
    }

    public final void k(Context context, PreOrderParameters mPayRequest, String mspPackageName, String mspAction, String preOrderMspAction, boolean isEU, g.a callback) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(dde.IS_EU, isEU);
        jSONObject.put(dde.NON_PRE_ORDER_ACTION, mspAction);
        jSONObject.put(dde.PRE_ORDER_ACTION, preOrderMspAction);
        jSONObject.put(dde.TARGET_PACKAGE_NAME, mspPackageName);
        if (!TextUtils.isEmpty(mPayRequest.prePayToken)) {
            mspAction = preOrderMspAction;
        }
        jSONObject.put(dde.TARGET_ACTION, mspAction);
        mPayRequest.inputParameters = jSONObject.toString();
        Resource<Intent> resource = new Resource<>();
        resource.updateStatus(PaySdkEnum.CheckSuccess);
        com.oplus.pay.opensdk.chain.a aVar = new com.oplus.pay.opensdk.chain.a();
        aVar.b(new f());
        aVar.b(new d());
        aVar.b(new CheckPreOrder());
        aVar.b(new e());
        aVar.b(new c());
        aVar.b(new b());
        aVar.a(context, mPayRequest, resource, aVar, callback);
    }

    public final void l(Context context, String launchModel, Intent intent, PreOrderParameters preOrderParameters, String inputParameters, PayRequest payRequest) {
        try {
            nce.INSTANCE.b(context, intent);
            sde.d(inputParameters == null ? "" : inputParameters, BizNode.START_PAY.getValue(), TransactionProcessStatusCodes.CODE_00_000_0000.getStatusCode(), BizResult.SUCCESS.getValue(), "", "success", "SDK", CashierHost.MSP.getHost());
        } catch (Throwable th) {
            String str = inputParameters == null ? "" : inputParameters;
            String value = BizNode.START_PAY.getValue();
            TransactionProcessStatusCodes transactionProcessStatusCodes = TransactionProcessStatusCodes.CODE_00_000_0013;
            sde.c(str, value, transactionProcessStatusCodes.getStatusCode(), BizResult.WARN.getValue(), transactionProcessStatusCodes.getDesc() + th.getMessage(), "msp v2 app launch fail", "SDK", CashierHost.MSP.getHost());
            String strM = vde.m(inputParameters, dde.TARGET_ACTION);
            String value2 = ActionInfo.PREORDER_PAY_STARTUP_ACTION.getValue();
            boolean zAreEqual = false;
            if (value2 != null) {
                zAreEqual = Intrinsics.areEqual(strM != null ? Boolean.valueOf(StringsKt.endsWith$default(strM, value2, false, 2, (Object) null)) : null, Boolean.TRUE);
            }
            n8c.INSTANCE.d(context, zAreEqual, payRequest, preOrderParameters, intent, new a(context, inputParameters, zAreEqual, preOrderParameters, payRequest, intent));
        }
    }

    @Deprecated(message = "")
    public final void m(@NotNull final Context context, @NotNull final PayRequest mPayRequest, boolean isEU) throws JSONException {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(mPayRequest, "mPayRequest");
        pce.b("pay start");
        j(context, mPayRequest, null, dde.SINGLE_PAY_STARTUP_ACTION, null, isEU, new g.a() { // from class: com.oplus.aiunit.vision.fde
            @Override // com.oplus.pay.opensdk.chain.g.a
            public final void a(Resource resource) throws JSONException, UnsupportedEncodingException {
                PaySdkCoreV3.n(context, mPayRequest, resource);
            }
        });
    }

    public final void o(@NotNull final Context context, @NotNull final PreOrderParameters preOrderParameters, boolean isEU) throws JSONException {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(preOrderParameters, "preOrderParameters");
        pce.b("pay pre-order start");
        k(context, preOrderParameters, null, dde.SINGLE_PAY_STARTUP_ACTION, dde.SINGLE_PAY_STARTUP_PREORDER_ACTION, isEU, new g.a() { // from class: com.oplus.aiunit.vision.gde
            @Override // com.oplus.pay.opensdk.chain.g.a
            public final void a(Resource resource) throws JSONException, UnsupportedEncodingException {
                PaySdkCoreV3.p(context, preOrderParameters, resource);
            }
        });
    }

    public final void q(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        a = str;
    }

    public final void r(Context context, Intent intent, String launchModel, String inputParameters) throws JSONException {
        try {
            hvj hvjVar = hvj.INSTANCE;
            Intrinsics.checkNotNull(intent);
            hvjVar.a(context, intent);
            context.startActivity(intent);
            sde.d(inputParameters == null ? "" : inputParameters, BizNode.START_PAY.getValue(), TransactionProcessStatusCodes.CODE_00_000_0000.getStatusCode(), BizResult.SUCCESS.getValue(), "startActivity for pay", "success", "SDK", launchModel);
        } catch (Exception e) {
            sde.d(inputParameters == null ? "" : inputParameters, BizNode.START_PAY.getValue(), TransactionProcessStatusCodes.CODE_00_000_0008.getStatusCode(), BizResult.ERROR.getValue(), String.valueOf(e.getMessage()), "startActivity failed", "SDK", (128 & 128) != 0 ? "" : null);
            if (StringsKt.equals(CashierHost.MERCHANT_APP.getHost(), launchModel, true)) {
                f(context, intent, inputParameters, "");
            }
        }
    }
}
