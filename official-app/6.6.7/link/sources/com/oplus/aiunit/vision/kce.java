package com.oplus.aiunit.vision;

import android.content.Context;
import android.content.Intent;
import androidx.fragment.app.FragmentActivity;
import com.oplus.pay.opensdk.msp.pay.PayConstant;
import com.oplus.pay.opensdk.taskwall.manager.PayZoomWindowManager;
import com.oplus.web.container.comunication.jsapi.BaseJsApiExecutor;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@mka(method = "hideZoomWindow", product = PayConstant.MethodName.PAY)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ&\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0014R\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/oplus/aiunit/vision/kce;", "Lcom/oplus/web/container/comunication/jsapi/BaseJsApiExecutor;", "Lcom/oplus/aiunit/vision/us9;", "fragment", "Lcom/oplus/aiunit/vision/ska;", "apiArguments", "Lcom/oplus/aiunit/vision/rs9;", "callback", "", "handleJsApi", "", "a", "Ljava/lang/String;", "TAG", "<init>", "()V", "paysdk_taskwall_release"}, k = 1, mv = {1, 8, 0})
public final class kce extends BaseJsApiExecutor {

    @NotNull
    public final String a = "PayHideZoomWindowExecute";

    @Override // com.oplus.web.container.comunication.jsapi.BaseJsApiExecutor
    public void handleJsApi(@Nullable us9 fragment, @Nullable ska apiArguments, @Nullable rs9 callback) {
        FragmentActivity activity;
        pce.b(this.a + " handleJsApi called");
        Context applicationContext = (fragment == null || (activity = fragment.getActivity()) == null) ? null : activity.getApplicationContext();
        String strC = apiArguments != null ? apiArguments.c("packageName") : null;
        Boolean boolValueOf = apiArguments != null ? Boolean.valueOf(apiArguments.b("isFull", false)) : null;
        if (applicationContext == null) {
            if (callback != null) {
                callback.fail(-1, "context is null");
                return;
            }
            return;
        }
        if (strC == null) {
            if (callback != null) {
                callback.fail(-2, "packageName is null");
                return;
            }
            return;
        }
        try {
            PayZoomWindowManager.e();
            if (Intrinsics.areEqual(boolValueOf, Boolean.TRUE)) {
                Intent launchIntentForPackage = applicationContext.getPackageManager().getLaunchIntentForPackage(strC);
                if (launchIntentForPackage == null) {
                    if (callback != null) {
                        callback.fail(-4, "No launch intent found for package: " + strC);
                        return;
                    }
                    return;
                }
                applicationContext.startActivity(launchIntentForPackage);
            }
            if (callback != null) {
                callback.success();
            }
        } catch (Exception e) {
            if (callback != null) {
                callback.fail(-3, "Failed to hide zoom window: " + e.getMessage());
            }
        }
    }
}
