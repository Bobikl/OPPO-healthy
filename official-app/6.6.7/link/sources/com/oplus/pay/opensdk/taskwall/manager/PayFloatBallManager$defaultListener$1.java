package com.oplus.pay.opensdk.taskwall.manager;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.oplus.aiunit.vision.l2a;
import com.oplus.aiunit.vision.pce;
import com.oplus.aiunit.vision.us9;
import com.oplus.pay.opensdk.taskwall.floatwindow.IFloatBallStateListen;
import com.oplus.pay.opensdk.taskwall.manager.PayFloatBallManager$defaultListener$1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0007\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J&\u0010\b\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\t\u001a\u0004\u0018\u00010\u00052\b\u0010\n\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u000b"}, d2 = {"com/oplus/pay/opensdk/taskwall/manager/PayFloatBallManager$defaultListener$1", "Lcom/oplus/pay/opensdk/taskwall/floatwindow/IFloatBallStateListen$Stub;", "onCountDownFinish", "", "packageName", "", "onFloatBallHide", "onFloatBallShow", "onTaskFailed", "reason", "remainTime", "paysdk_taskwall_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class PayFloatBallManager$defaultListener$1 extends IFloatBallStateListen.Stub {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCountDownFinish$lambda$1(String str) throws JSONException {
        l2a webView;
        l2a webView2;
        View webView3;
        us9 us9Var = PayFloatBallManager.c;
        boolean z = false;
        if (us9Var != null && (webView2 = us9Var.getWebView()) != null && (webView3 = webView2.getWebView()) != null && webView3.isAttachedToWindow()) {
            z = true;
        }
        if (z) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("packageName", str);
            us9 us9Var2 = PayFloatBallManager.c;
            if (us9Var2 != null && (webView = us9Var2.getWebView()) != null) {
                webView.e("onFloatBallTimeFinish(" + jSONObject + ')', null);
            }
            pce.b("JSMethodConst,onFloatBallTimeFinish " + jSONObject);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onFloatBallHide$lambda$5(String str) throws JSONException {
        l2a webView;
        l2a webView2;
        View webView3;
        us9 us9Var = PayFloatBallManager.c;
        boolean z = false;
        if (us9Var != null && (webView2 = us9Var.getWebView()) != null && (webView3 = webView2.getWebView()) != null && webView3.isAttachedToWindow()) {
            z = true;
        }
        if (z) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("packageName", str);
            us9 us9Var2 = PayFloatBallManager.c;
            if (us9Var2 != null && (webView = us9Var2.getWebView()) != null) {
                webView.e("onFloatBallHide(" + jSONObject + ')', null);
            }
            pce.b("JSMethodConst, onFloatBallHide " + jSONObject);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onFloatBallShow$lambda$3(String str) throws JSONException {
        l2a webView;
        l2a webView2;
        View webView3;
        us9 us9Var = PayFloatBallManager.c;
        boolean z = false;
        if (us9Var != null && (webView2 = us9Var.getWebView()) != null && (webView3 = webView2.getWebView()) != null && webView3.isAttachedToWindow()) {
            z = true;
        }
        if (z) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("packageName", str);
            us9 us9Var2 = PayFloatBallManager.c;
            if (us9Var2 != null && (webView = us9Var2.getWebView()) != null) {
                webView.e("onFloatBallShow(" + jSONObject + ')', null);
            }
            pce.b("JSMethodConst, onFloatBallShow " + jSONObject);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onTaskFailed$lambda$7(JSONObject jSONObject, String str) {
        l2a webView;
        l2a webView2;
        View webView3;
        Intrinsics.checkNotNullParameter(jSONObject, "$result");
        us9 us9Var = PayFloatBallManager.c;
        boolean z = false;
        if (us9Var != null && (webView2 = us9Var.getWebView()) != null && (webView3 = webView2.getWebView()) != null && webView3.isAttachedToWindow()) {
            z = true;
        }
        if (z) {
            us9 us9Var2 = PayFloatBallManager.c;
            if (us9Var2 != null && (webView = us9Var2.getWebView()) != null) {
                webView.e("onTaskFailed(" + jSONObject + ')', null);
            }
            pce.b("JSMethodConst, onTaskFailed " + str);
        }
        PayFloatBallManager.INSTANCE.l();
    }

    @Override // com.oplus.pay.opensdk.taskwall.floatwindow.IFloatBallStateListen
    public void onCountDownFinish(@Nullable final String packageName) {
        pce.b("PayFloatBallManager onCountDownFinish " + packageName);
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.oplus.aiunit.vision.fce
            @Override // java.lang.Runnable
            public final void run() throws JSONException {
                PayFloatBallManager$defaultListener$1.onCountDownFinish$lambda$1(packageName);
            }
        });
    }

    @Override // com.oplus.pay.opensdk.taskwall.floatwindow.IFloatBallStateListen
    public void onFloatBallHide(@Nullable final String packageName) {
        pce.b("PayFloatBallManager,onFloatBallHide " + packageName);
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.oplus.aiunit.vision.ece
            @Override // java.lang.Runnable
            public final void run() throws JSONException {
                PayFloatBallManager$defaultListener$1.onFloatBallHide$lambda$5(packageName);
            }
        });
    }

    @Override // com.oplus.pay.opensdk.taskwall.floatwindow.IFloatBallStateListen
    public void onFloatBallShow(@Nullable final String packageName) {
        pce.b("PayFloatBallManager,onFloatBallShow " + packageName);
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.oplus.aiunit.vision.gce
            @Override // java.lang.Runnable
            public final void run() throws JSONException {
                PayFloatBallManager$defaultListener$1.onFloatBallShow$lambda$3(packageName);
            }
        });
    }

    @Override // com.oplus.pay.opensdk.taskwall.floatwindow.IFloatBallStateListen
    public void onTaskFailed(@Nullable final String packageName, @Nullable String reason, @Nullable String remainTime) throws JSONException {
        pce.b("PayFloatBallManager,onTaskFailed " + packageName + ' ' + reason + ' ' + remainTime);
        final JSONObject jSONObject = new JSONObject();
        jSONObject.put("packageName", packageName);
        jSONObject.put("failReason", reason);
        jSONObject.put("remainTime", remainTime);
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.oplus.aiunit.vision.hce
            @Override // java.lang.Runnable
            public final void run() {
                PayFloatBallManager$defaultListener$1.onTaskFailed$lambda$7(jSONObject, packageName);
            }
        });
    }
}
