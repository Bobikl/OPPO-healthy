package com.oplus.pay.opensdk.taskwall.manager;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.heytap.speech.engine.constant.EngineConstant;
import com.oplus.aiunit.vision.e1a;
import com.oplus.aiunit.vision.or9;
import com.oplus.aiunit.vision.qae;
import com.oplus.pay.opensdk.taskwall.floatwindow.IFloatBallStateListen;
import com.oplus.pay.opensdk.taskwall.manager.PayFloatBallManager$defaultListener$1;
import io.netty.util.internal.StringUtil;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0007\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J&\u0010\b\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\t\u001a\u0004\u0018\u00010\u00052\b\u0010\n\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u000b"}, d2 = {"com/oplus/pay/opensdk/taskwall/manager/PayFloatBallManager$defaultListener$1", "Lcom/oplus/pay/opensdk/taskwall/floatwindow/IFloatBallStateListen$Stub;", "onCountDownFinish", "", "packageName", "", "onFloatBallHide", "onFloatBallShow", "onTaskFailed", EngineConstant.REASON, "remainTime", "paysdk_taskwall_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class PayFloatBallManager$defaultListener$1 extends IFloatBallStateListen.Stub {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCountDownFinish$lambda$1(String str) throws JSONException {
        e1a webView;
        e1a webView2;
        View webView3;
        or9 or9Var = PayFloatBallManager.mFragment;
        boolean z = false;
        if (or9Var != null && (webView2 = or9Var.getWebView()) != null && (webView3 = webView2.getWebView()) != null && webView3.isAttachedToWindow()) {
            z = true;
        }
        if (z) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("packageName", str);
            or9 or9Var2 = PayFloatBallManager.mFragment;
            if (or9Var2 != null && (webView = or9Var2.getWebView()) != null) {
                webView.e("onFloatBallTimeFinish(" + jSONObject + ')', null);
            }
            qae.b("JSMethodConst,onFloatBallTimeFinish " + jSONObject);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onFloatBallHide$lambda$5(String str) throws JSONException {
        e1a webView;
        e1a webView2;
        View webView3;
        or9 or9Var = PayFloatBallManager.mFragment;
        boolean z = false;
        if (or9Var != null && (webView2 = or9Var.getWebView()) != null && (webView3 = webView2.getWebView()) != null && webView3.isAttachedToWindow()) {
            z = true;
        }
        if (z) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("packageName", str);
            or9 or9Var2 = PayFloatBallManager.mFragment;
            if (or9Var2 != null && (webView = or9Var2.getWebView()) != null) {
                webView.e("onFloatBallHide(" + jSONObject + ')', null);
            }
            qae.b("JSMethodConst, onFloatBallHide " + jSONObject);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onFloatBallShow$lambda$3(String str) throws JSONException {
        e1a webView;
        e1a webView2;
        View webView3;
        or9 or9Var = PayFloatBallManager.mFragment;
        boolean z = false;
        if (or9Var != null && (webView2 = or9Var.getWebView()) != null && (webView3 = webView2.getWebView()) != null && webView3.isAttachedToWindow()) {
            z = true;
        }
        if (z) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("packageName", str);
            or9 or9Var2 = PayFloatBallManager.mFragment;
            if (or9Var2 != null && (webView = or9Var2.getWebView()) != null) {
                webView.e("onFloatBallShow(" + jSONObject + ')', null);
            }
            qae.b("JSMethodConst, onFloatBallShow " + jSONObject);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onTaskFailed$lambda$7(JSONObject result, String str) {
        e1a webView;
        e1a webView2;
        View webView3;
        Intrinsics.checkNotNullParameter(result, "$result");
        or9 or9Var = PayFloatBallManager.mFragment;
        boolean z = false;
        if (or9Var != null && (webView2 = or9Var.getWebView()) != null && (webView3 = webView2.getWebView()) != null && webView3.isAttachedToWindow()) {
            z = true;
        }
        if (z) {
            or9 or9Var2 = PayFloatBallManager.mFragment;
            if (or9Var2 != null && (webView = or9Var2.getWebView()) != null) {
                webView.e("onTaskFailed(" + result + ')', null);
            }
            qae.b("JSMethodConst, onTaskFailed " + str);
        }
        PayFloatBallManager.INSTANCE.l();
    }

    @Override // com.oplus.pay.opensdk.taskwall.floatwindow.IFloatBallStateListen
    public void onCountDownFinish(@Nullable final String packageName) {
        qae.b("PayFloatBallManager onCountDownFinish " + packageName);
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.oplus.aiunit.vision.gae
            @Override // java.lang.Runnable
            public final void run() throws JSONException {
                PayFloatBallManager$defaultListener$1.onCountDownFinish$lambda$1(packageName);
            }
        });
    }

    @Override // com.oplus.pay.opensdk.taskwall.floatwindow.IFloatBallStateListen
    public void onFloatBallHide(@Nullable final String packageName) {
        qae.b("PayFloatBallManager,onFloatBallHide " + packageName);
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.oplus.aiunit.vision.fae
            @Override // java.lang.Runnable
            public final void run() throws JSONException {
                PayFloatBallManager$defaultListener$1.onFloatBallHide$lambda$5(packageName);
            }
        });
    }

    @Override // com.oplus.pay.opensdk.taskwall.floatwindow.IFloatBallStateListen
    public void onFloatBallShow(@Nullable final String packageName) {
        qae.b("PayFloatBallManager,onFloatBallShow " + packageName);
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.oplus.aiunit.vision.hae
            @Override // java.lang.Runnable
            public final void run() throws JSONException {
                PayFloatBallManager$defaultListener$1.onFloatBallShow$lambda$3(packageName);
            }
        });
    }

    @Override // com.oplus.pay.opensdk.taskwall.floatwindow.IFloatBallStateListen
    public void onTaskFailed(@Nullable final String packageName, @Nullable String reason, @Nullable String remainTime) throws JSONException {
        qae.b("PayFloatBallManager,onTaskFailed " + packageName + StringUtil.SPACE + reason + StringUtil.SPACE + remainTime);
        final JSONObject jSONObject = new JSONObject();
        jSONObject.put("packageName", packageName);
        jSONObject.put("failReason", reason);
        jSONObject.put("remainTime", remainTime);
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.oplus.aiunit.vision.iae
            @Override // java.lang.Runnable
            public final void run() {
                PayFloatBallManager$defaultListener$1.onTaskFailed$lambda$7(jSONObject, packageName);
            }
        });
    }
}
