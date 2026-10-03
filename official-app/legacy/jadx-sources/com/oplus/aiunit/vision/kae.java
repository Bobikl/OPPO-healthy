package com.oplus.aiunit.vision;

import com.oplus.pay.opensdk.taskwall.manager.PayZoomWindowManager;
import com.oplus.web.container.comunication.jsapi.BaseJsApiExecutor;
import com.oplus.zoomwindow.OplusZoomWindowInfo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@eja(method = "getCurrentZoomWindowState", product = "pay")
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ&\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0014R\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/oplus/aiunit/vision/kae;", "Lcom/oplus/web/container/comunication/jsapi/BaseJsApiExecutor;", "Lcom/oplus/aiunit/vision/or9;", "fragment", "Lcom/oplus/aiunit/vision/kja;", "apiArguments", "Lcom/oplus/aiunit/vision/lr9;", "callback", "", "handleJsApi", "", "a", "Ljava/lang/String;", "TAG", "<init>", "()V", "paysdk_taskwall_release"}, k = 1, mv = {1, 8, 0})
public final class kae extends BaseJsApiExecutor {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final String TAG = "PayGetZoomWindowStateExecute";

    @Override // com.oplus.web.container.comunication.jsapi.BaseJsApiExecutor
    public void handleJsApi(@Nullable or9 fragment, @Nullable kja apiArguments, @Nullable lr9 callback) {
        qae.b(this.TAG + " handleJsApi called");
        try {
            OplusZoomWindowInfo oplusZoomWindowInfoD = PayZoomWindowManager.d();
            String str = oplusZoomWindowInfoD != null ? oplusZoomWindowInfoD.zoomPkg : null;
            Boolean boolValueOf = oplusZoomWindowInfoD != null ? Boolean.valueOf(oplusZoomWindowInfoD.inputShow) : null;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("packageName", str);
            jSONObject.put("isShow", boolValueOf);
            qae.c(this.TAG + " success result " + jSONObject);
            if (callback != null) {
                callback.success(jSONObject);
            }
        } catch (Exception e2) {
            if (callback != null) {
                callback.fail(-3, "Failed to open zoom window: " + e2.getMessage());
            }
        }
    }
}
