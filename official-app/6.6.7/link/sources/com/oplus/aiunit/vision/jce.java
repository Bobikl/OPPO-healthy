package com.oplus.aiunit.vision;

import com.oplus.pay.opensdk.msp.pay.PayConstant;
import com.oplus.pay.opensdk.taskwall.manager.PayZoomWindowManager;
import com.oplus.web.container.comunication.jsapi.BaseJsApiExecutor;
import com.oplus.zoomwindow.OplusZoomWindowInfo;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@mka(method = "getCurrentZoomWindowState", product = PayConstant.MethodName.PAY)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ&\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0014R\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/oplus/aiunit/vision/jce;", "Lcom/oplus/web/container/comunication/jsapi/BaseJsApiExecutor;", "Lcom/oplus/aiunit/vision/us9;", "fragment", "Lcom/oplus/aiunit/vision/ska;", "apiArguments", "Lcom/oplus/aiunit/vision/rs9;", "callback", "", "handleJsApi", "", "a", "Ljava/lang/String;", "TAG", "<init>", "()V", "paysdk_taskwall_release"}, k = 1, mv = {1, 8, 0})
public final class jce extends BaseJsApiExecutor {

    @NotNull
    public final String a = "PayGetZoomWindowStateExecute";

    @Override // com.oplus.web.container.comunication.jsapi.BaseJsApiExecutor
    public void handleJsApi(@Nullable us9 fragment, @Nullable ska apiArguments, @Nullable rs9 callback) {
        pce.b(this.a + " handleJsApi called");
        try {
            OplusZoomWindowInfo oplusZoomWindowInfoD = PayZoomWindowManager.d();
            String str = oplusZoomWindowInfoD != null ? oplusZoomWindowInfoD.zoomPkg : null;
            Boolean boolValueOf = oplusZoomWindowInfoD != null ? Boolean.valueOf(oplusZoomWindowInfoD.inputShow) : null;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("packageName", str);
            jSONObject.put("isShow", boolValueOf);
            pce.c(this.a + " success result " + jSONObject);
            if (callback != null) {
                callback.success(jSONObject);
            }
        } catch (Exception e) {
            if (callback != null) {
                callback.fail(-3, "Failed to open zoom window: " + e.getMessage());
            }
        }
    }
}
