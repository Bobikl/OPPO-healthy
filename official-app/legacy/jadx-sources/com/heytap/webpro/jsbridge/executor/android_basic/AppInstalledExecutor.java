package com.heytap.webpro.jsbridge.executor.android_basic;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import androidx.annotation.Keep;
import com.heytap.webpro.jsapi.BaseJsApiExecutor;
import com.oplus.aiunit.vision.b80;
import com.oplus.aiunit.vision.cqg;
import com.oplus.aiunit.vision.cvk;
import com.oplus.aiunit.vision.d94;
import com.oplus.aiunit.vision.dja;
import com.oplus.aiunit.vision.jja;
import com.oplus.aiunit.vision.kr9;
import com.oplus.aiunit.vision.lwj;
import com.oplus.aiunit.vision.pr9;
import com.oplus.aiunit.vision.q7b;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
@cqg(score = 60)
@Keep
@dja(method = "isPackageInstalled", product = "vip")
public class AppInstalledExecutor extends BaseJsApiExecutor {
    private static final String TAG = "AppInstalledExecutor";

    private static boolean isPkgEnabled(Context context, String str) {
        if (!cvk.d()) {
            return true;
        }
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(str, 128);
            if (applicationInfo != null) {
                return applicationInfo.enabled;
            }
            return false;
        } catch (PackageManager.NameNotFoundException e2) {
            q7b.e(TAG, "isPkgEnabled error! %s", e2.getMessage());
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$handleJsApi$0(jja jjaVar, kr9 kr9Var) {
        invokeSuccess(kr9Var, getAppInstallInfo(d94.b(), jjaVar.e("packageName", "")));
    }

    public JSONObject getAppInstallInfo(Context context, String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("versionCode", b80.b(context, str));
            jSONObject.put("packageName", str);
            jSONObject.put("enable", isPkgEnabled(context, str));
        } catch (Throwable th) {
            q7b.f(TAG, "getAppInstallInfo error! ", th);
        }
        return jSONObject;
    }

    @Override // com.heytap.webpro.jsapi.BaseJsApiExecutor
    public void handleJsApi(pr9 pr9Var, final jja jjaVar, final kr9 kr9Var) throws Throwable {
        lwj.k(new Runnable() { // from class: com.oplus.aiunit.vision.ob0
            @Override // java.lang.Runnable
            public final void run() {
                this.i.lambda$handleJsApi$0(jjaVar, kr9Var);
            }
        });
    }
}
