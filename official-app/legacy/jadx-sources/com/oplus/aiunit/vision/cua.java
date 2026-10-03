package com.oplus.aiunit.vision;

import androidx.annotation.NonNull;
import com.platform.sdk.center.webview.js.AcCommonApiMethod;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public abstract class cua extends p51 {
    public cua() {
        super("vip", AcCommonApiMethod.LAUNCH_ACTIVITY);
    }

    @Override // com.oplus.aiunit.vision.qr9
    public boolean a(@NonNull or9 or9Var, @NonNull kja kjaVar, @NonNull lr9 lr9Var) {
        try {
            Map<String, String> mapG = g(or9Var, kjaVar.a());
            if (mapG == null) {
                d(lr9Var, 5000, "map is null");
            } else {
                f(lr9Var, new JSONObject(mapG));
            }
            return true;
        } catch (Throwable th) {
            d(lr9Var, 5000, th.getMessage());
            return true;
        }
    }

    public abstract Map<String, String> g(or9 or9Var, JSONObject jSONObject);
}
