package com.oplus.aiunit.vision;

import android.app.Activity;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import com.google.gson.Gson;
import com.oplus.pay.opensdk.download.PaySdkDownloadManager;
import com.oplus.pay.opensdk.model.PayParameters;
import com.oplus.pay.opensdk.model.PreOrderParameters;
import com.oplus.pay.opensdk.model.request.DownLoadRequest;
import com.oplus.pay.opensdk.receiver.PaySdkReceiver;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0015\u0010\u0016J8\u0010\u000b\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\u0010\t\u001a\u0004\u0018\u00010\bJ\u0018\u0010\u0010\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000f\u001a\u00020\u000eJ\u001a\u0010\u0011\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\t\u001a\u00020\bH\u0002R\u001c\u0010\u0014\u001a\n \u0012*\u0004\u0018\u00010\u00040\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0013¨\u0006\u0017"}, d2 = {"Lcom/oplus/aiunit/vision/nde;", "", "Landroid/app/Activity;", "mActivity", "", "title", "leftBtn", "rightBtn", "Lcom/oplus/pay/opensdk/model/PreOrderParameters;", "preOrderParameters", "", "c", "Landroid/content/Context;", "context", "Lcom/oplus/pay/opensdk/model/PayParameters;", "payParameters", "b", "a", "kotlin.jvm.PlatformType", "Ljava/lang/String;", "ACTION_QRCODE", "<init>", "()V", "paysdk_release"}, k = 1, mv = {1, 8, 0})
public final class nde {

    @NotNull
    public static final nde INSTANCE = new nde();
    public static final String a = xam.b("kge&fmizem&xiq&yzkglm", 8);

    public final String a(Activity mActivity, PreOrderParameters preOrderParameters) throws JSONException {
        String string;
        String str = preOrderParameters.mPackageName;
        if (str == null || str.length() == 0) {
            string = mActivity != null ? mActivity.getPackageName() : null;
            Intrinsics.checkNotNull(string);
        } else {
            string = preOrderParameters.mPackageName;
        }
        String str2 = preOrderParameters.expandInfo;
        if (!(str2 == null || str2.length() == 0)) {
            JSONObject jSONObject = new JSONObject(str2);
            if (jSONObject.has("downloadPackageNameFromSDK")) {
                string = jSONObject.getString("downloadPackageNameFromSDK");
            }
        }
        Intrinsics.checkNotNullExpressionValue(string, "appPackage");
        String str3 = Build.BRAND;
        Intrinsics.checkNotNullExpressionValue(str3, "BRAND");
        String strI = nke.i();
        Intrinsics.checkNotNullExpressionValue(strI, "getOsVersionSDK()");
        DownLoadRequest downLoadRequest = new DownLoadRequest(string, str3, strI, nke.g() == 0 ? "" : String.valueOf(nke.g()));
        downLoadRequest.sign = t6h.f(downLoadRequest);
        String json = new Gson().toJson(downLoadRequest);
        Intrinsics.checkNotNullExpressionValue(json, "Gson().toJson(downloadRequest)");
        return json;
    }

    public final void b(@Nullable Context context, @NotNull PayParameters payParameters) {
        Context applicationContext;
        Context applicationContext2;
        Intrinsics.checkNotNullParameter(payParameters, "payParameters");
        IntentFilter intentFilter = new IntentFilter();
        xda.a(intentFilter, dde.ACTION_NOTIFY_PAY_RESULT);
        xda.a(intentFilter, "android.intent.action.CLOSE_SYSTEM_DIALOGS");
        if (Build.VERSION.SDK_INT >= 33) {
            if (context == null || (applicationContext2 = context.getApplicationContext()) == null) {
                return;
            }
            applicationContext2.registerReceiver(new PaySdkReceiver(payParameters), intentFilter, 2);
            return;
        }
        if (context == null || (applicationContext = context.getApplicationContext()) == null) {
            return;
        }
        applicationContext.registerReceiver(new PaySdkReceiver(payParameters), intentFilter);
    }

    public final void c(@Nullable Activity mActivity, @Nullable String title, @Nullable String leftBtn, @Nullable String rightBtn, @Nullable PreOrderParameters preOrderParameters) {
        if (preOrderParameters != null) {
            nde ndeVar = INSTANCE;
            PayParameters payParametersC = preOrderParameters instanceof PayParameters ? (PayParameters) preOrderParameters : ua4.c(preOrderParameters);
            Intrinsics.checkNotNullExpressionValue(payParametersC, "if(it is PayParameters) ….convertPayParameters(it)");
            ndeVar.b(mActivity, payParametersC);
            PayParameters payParametersC2 = ua4.c(preOrderParameters);
            rde.c(mActivity, payParametersC2);
            s36 s36Var = new s36();
            s36Var.a = vqk.b(mActivity, dde.GET_URL_OVERSEAS_PATH, preOrderParameters.mCountryCode, preOrderParameters.userRegisterCountry);
            s36Var.b = ndeVar.a(mActivity, preOrderParameters);
            s36Var.c = payParametersC2.prePayToken;
            s36Var.d = payParametersC2.mPartnerOrder;
            s36Var.e = payParametersC2.mCountryCode;
            s36Var.f = 1;
            PaySdkDownloadManager.showOptionalUpdateDialog(mActivity, s36Var, title, leftBtn, rightBtn);
        }
    }
}
