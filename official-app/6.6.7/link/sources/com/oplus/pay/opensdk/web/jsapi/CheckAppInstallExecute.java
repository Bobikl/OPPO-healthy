package com.oplus.pay.opensdk.web.jsapi;

import android.content.Context;
import androidx.annotation.Keep;
import androidx.fragment.app.FragmentActivity;
import com.oplus.aiunit.vision.frl;
import com.oplus.aiunit.vision.hrl;
import com.oplus.aiunit.vision.mka;
import com.oplus.aiunit.vision.rs9;
import com.oplus.aiunit.vision.ska;
import com.oplus.aiunit.vision.ttg;
import com.oplus.aiunit.vision.us9;
import com.oplus.pantanal.seedling.constants.TraceConstants;
import com.oplus.pay.opensdk.msp.pay.PayConstant;
import com.oplus.utrace.lib.NodeIDKt;
import com.oplus.web.container.comunication.jsapi.BaseJsApiExecutor;
import com.oplus.web.container.safe.model.HostSecurityLevel;
import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Keep
@mka(method = "CheckAppInstall", product = PayConstant.MethodName.PAY)
@ttg(level = HostSecurityLevel.HIGH)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0014¨\u0006\f"}, d2 = {"Lcom/oplus/pay/opensdk/web/jsapi/CheckAppInstallExecute;", "Lcom/oplus/web/container/comunication/jsapi/BaseJsApiExecutor;", "Lcom/oplus/aiunit/vision/us9;", "fragment", "Lcom/oplus/aiunit/vision/ska;", "apiArguments", "Lcom/oplus/aiunit/vision/rs9;", "callback", "", "handleJsApi", "<init>", "()V", "paysdk_web_release"}, k = 1, mv = {1, 8, 0})
public final class CheckAppInstallExecute extends BaseJsApiExecutor {
    @Override // com.oplus.web.container.comunication.jsapi.BaseJsApiExecutor
    public void handleJsApi(@Nullable us9 fragment, @Nullable ska apiArguments, @Nullable rs9 callback) throws JSONException {
        FragmentActivity activity;
        Context applicationContext;
        String strC = apiArguments != null ? apiArguments.c(TraceConstants.KEY_PKG_NAME) : null;
        if (strC == null || strC.length() == 0) {
            if (callback != null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(TraceConstants.KEY_PKG_NAME, "pkgName null");
                jSONObject.put("installed", false);
                Unit unit = Unit.INSTANCE;
                callback.a(-1, "pkgName is null", jSONObject);
            }
            hrl.h("isAppInstalled pkgName is null");
            return;
        }
        if (fragment == null || (activity = fragment.getActivity()) == null || (applicationContext = activity.getApplicationContext()) == null) {
            if (callback != null) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put(TraceConstants.KEY_PKG_NAME, strC);
                jSONObject2.put("installed", false);
                Unit unit2 = Unit.INSTANCE;
                callback.a(-1, "isAppInstalled context is null", jSONObject2);
            }
            hrl.h("isAppInstalled context is null");
            return;
        }
        if (frl.INSTANCE.a(applicationContext, strC)) {
            hrl.a("isAppInstalled success");
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put(TraceConstants.KEY_PKG_NAME, strC);
            jSONObject3.put("installed", true);
            if (callback != null) {
                callback.success(jSONObject3);
                return;
            }
            return;
        }
        if (callback != null) {
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put(TraceConstants.KEY_PKG_NAME, strC);
            jSONObject4.put("installed", false);
            Unit unit3 = Unit.INSTANCE;
            callback.a(NodeIDKt.DEFAULT_SPAN_NAME, strC + " not installed", jSONObject4);
        }
    }
}
