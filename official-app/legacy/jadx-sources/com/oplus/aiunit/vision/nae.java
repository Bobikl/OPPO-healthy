package com.oplus.aiunit.vision;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import androidx.fragment.app.FragmentActivity;
import com.oplus.web.container.comunication.jsapi.BaseJsApiExecutor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@eja(method = "isPackageInstalled", product = "pay")
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J&\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0014J$\u0010\f\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002R\u0014\u0010\u000e\u001a\u00020\n8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"Lcom/oplus/aiunit/vision/nae;", "Lcom/oplus/web/container/comunication/jsapi/BaseJsApiExecutor;", "Lcom/oplus/aiunit/vision/or9;", "fragment", "Lcom/oplus/aiunit/vision/kja;", "apiArguments", "Lcom/oplus/aiunit/vision/lr9;", "callback", "", "handleJsApi", "", "packageName", "a", "Ljava/lang/String;", "TAG", "<init>", "()V", "paysdk_taskwall_release"}, k = 1, mv = {1, 8, 0})
public final class nae extends BaseJsApiExecutor {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final String TAG = "IsPackageInstalledExecute";

    public final void a(or9 fragment, String packageName, lr9 callback) throws JSONException {
        FragmentActivity activity;
        Context applicationContext;
        qae.b(this.TAG + " isPackageInstalled called with packageName: " + packageName);
        PackageManager packageManager = (fragment == null || (activity = fragment.getActivity()) == null || (applicationContext = activity.getApplicationContext()) == null) ? null : applicationContext.getPackageManager();
        if (packageManager == null) {
            qae.b(this.TAG + " PackageManager is null");
            if (callback != null) {
                callback.fail(-1, "PackageManager is null");
                return;
            }
            return;
        }
        try {
            PackageInfo packageInfo = packageManager.getPackageInfo(packageName, 0);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("enable", true);
            jSONObject.put("packageName", packageName);
            jSONObject.put("versionCode", packageInfo.versionCode);
            qae.b(this.TAG + " Package " + packageName + " is installed");
            if (callback != null) {
                callback.success(jSONObject);
            }
        } catch (PackageManager.NameNotFoundException unused) {
            qae.b(this.TAG + " package is not installed");
            if (callback != null) {
                callback.fail(-1, "package is not installed");
            }
        }
    }

    @Override // com.oplus.web.container.comunication.jsapi.BaseJsApiExecutor
    public void handleJsApi(@Nullable or9 fragment, @Nullable kja apiArguments, @Nullable lr9 callback) throws JSONException {
        qae.b(this.TAG + " handleJsApi called");
        String strC = apiArguments != null ? apiArguments.c("packageName") : null;
        qae.b(this.TAG + " packageName: " + strC);
        if (strC != null) {
            a(fragment, strC, callback);
            return;
        }
        qae.c(this.TAG + " Package name is missing");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("data", new JSONObject());
        jSONObject.put("message", "Package name is missing");
        jSONObject.put("success", false);
        if (callback != null) {
            callback.fail(-1, jSONObject.toString());
        }
    }
}
