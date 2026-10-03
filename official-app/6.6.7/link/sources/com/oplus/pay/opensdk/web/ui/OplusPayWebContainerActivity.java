package com.oplus.pay.opensdk.web.ui;

import android.R;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Window;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import com.oplus.aiunit.vision.frl;
import com.oplus.aiunit.vision.hrl;
import com.oplus.aiunit.vision.ihb;
import com.oplus.aiunit.vision.n2a;
import com.oplus.aiunit.vision.ws9;
import com.oplus.pantanal.seedling.constants.TraceConstants;
import com.oplus.pay.opensdk.web.R$color;
import com.oplus.wearable.linkservice.sdk.Node;
import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\b\u0010\u0006\u001a\u00020\u0004H\u0002J\b\u0010\u0007\u001a\u00020\u0004H\u0002J\u001e\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¨\u0006\u000f"}, d2 = {"Lcom/oplus/pay/opensdk/web/ui/OplusPayWebContainerActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "h7", "f7", "Landroid/content/Intent;", TraceConstants.KEY_ACTION, "", "", "g7", "<init>", "()V", "paysdk_web_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nOplusPayWebContainerActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OplusPayWebContainerActivity.kt\ncom/oplus/pay/opensdk/web/ui/OplusPayWebContainerActivity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 4 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,130:1\n1#2:131\n37#3,2:132\n26#4:134\n1855#5,2:135\n*S KotlinDebug\n*F\n+ 1 OplusPayWebContainerActivity.kt\ncom/oplus/pay/opensdk/web/ui/OplusPayWebContainerActivity\n*L\n109#1:132,2\n109#1:134\n120#1:135,2\n*E\n"})
public final class OplusPayWebContainerActivity extends AppCompatActivity {
    /* JADX WARN: Multi-variable type inference failed */
    public final void f7() throws JSONException {
        ws9[] ws9VarArr;
        Map<String, String> mapG7 = g7(getIntent());
        String str = mapG7.get("country");
        String str2 = mapG7.get("token");
        String str3 = mapG7.get("webUrl");
        boolean z = true;
        if (str == null || str.length() == 0) {
            hrl.h("countryCode isNullOrEmpty ");
            finish();
            return;
        }
        if (str3 != null && str3.length() != 0) {
            z = false;
        }
        if (z) {
            hrl.h("webUrl isNullOrEmpty ");
            finish();
            return;
        }
        int intExtra = getIntent().getIntExtra(ihb.EXTRA_INTERCEPTOR_CODE, -1);
        ihb ihbVar = ihb.INSTANCE;
        List<ws9> listC = ihbVar.c(intExtra);
        n2a n2aVarF = ihbVar.f(getIntent().getIntExtra(ihb.EXTRA_CALL_BACK_CODE, -1));
        boolean booleanExtra = getIntent().getBooleanExtra(ihb.EXTRA_IGNORE_CHECK_HOST, false);
        Serializable serializableExtra = getIntent().getSerializableExtra(ihb.EXTRA_OFFLINE_EXT_PARAM);
        HashMap<String, String> map = serializableExtra instanceof HashMap ? (HashMap) serializableExtra : null;
        Serializable serializableExtra2 = getIntent().getSerializableExtra(ihb.EXTRA_GENERAL_EXT_PARAM);
        HashMap<String, String> map2 = serializableExtra2 instanceof HashMap ? (HashMap) serializableExtra2 : null;
        frl frlVar = frl.INSTANCE;
        JSONObject jSONObject = new JSONObject();
        if (str2 == null) {
            str2 = "";
        }
        jSONObject.put("secondaryToken", str2);
        String string = jSONObject.toString();
        if (listC == null || (ws9VarArr = (ws9[]) listC.toArray(new ws9[0])) == null) {
            ws9VarArr = new ws9[0];
        }
        frlVar.c(this, str, str3, string, n2aVarF, null, null, null, Boolean.valueOf(booleanExtra), map2, map, (ws9[]) Arrays.copyOf(ws9VarArr, ws9VarArr.length));
    }

    public final Map<String, String> g7(Intent intent) {
        Uri data;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (intent != null && (data = intent.getData()) != null) {
            Uri uri = Uri.parse(data.toString());
            Set<String> queryParameterNames = uri.getQueryParameterNames();
            Intrinsics.checkNotNullExpressionValue(queryParameterNames, "queryParameterNames");
            for (String str : queryParameterNames) {
                String queryParameter = uri.getQueryParameter(str);
                if (queryParameter != null) {
                    Intrinsics.checkNotNullExpressionValue(str, Node.I_KEY);
                    linkedHashMap.put(str, queryParameter);
                }
            }
        }
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void h7() {
        Window window = getWindow();
        if (window != null) {
            window.setStatusBarColor(0);
            window.setNavigationBarColor(0);
            window.getDecorView().setSystemUiVisibility(window.getDecorView().getSystemUiVisibility());
        }
        getWindow().setBackgroundDrawableResource(R.color.transparent);
        Window window2 = getWindow();
        if (window2 != null) {
            window2.setNavigationBarColor(ContextCompat.getColor(this, R$color.opay_pay_sdk_web_color_transparent_background_light));
        }
        Window window3 = getWindow();
        if (window3 != null) {
            window3.setStatusBarColor(ContextCompat.getColor(this, R$color.opay_pay_sdk_web_color_transparent_background_light));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onCreate(@Nullable Bundle savedInstanceState) {
        Object obj;
        super/*androidx.fragment.app.FragmentActivity*/.onCreate(savedInstanceState);
        h7();
        if (savedInstanceState != null) {
            finish();
            return;
        }
        String packageName = getPackageName();
        Uri data = getIntent().getData();
        if (!StringsKt.equals(packageName, data != null ? data.getHost() : null, true)) {
            finish();
            return;
        }
        try {
            Result.Companion companion = Result.Companion;
            f7();
            finish();
            obj = Result.constructor-impl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        Throwable th2 = Result.exceptionOrNull-impl(obj);
        if (th2 != null) {
            hrl.h("handleDeeplink ex:" + th2 + ' ');
            finish();
        }
    }
}
