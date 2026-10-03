package com.oplus.aiunit.vision;

import android.os.Build;
import com.heytap.webview.extension.protocol.Const;
import com.oplus.web.container.safe.model.HostSecurityLevel;
import java.util.Locale;
import java.util.TimeZone;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
@eja(method = "device_info")
@dqg(level = HostSecurityLevel.CRITICAL)
public class cn3 implements mr9 {
    @Override // com.oplus.aiunit.vision.mr9
    public void execute(or9 or9Var, kja kjaVar, lr9 lr9Var) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("language", Locale.getDefault().getLanguage());
            jSONObject.put(Const.Callback.DeviceInfo.TZ, TimeZone.getDefault().getDisplayName(false, 0));
            jSONObject.put("country", Locale.getDefault().getCountry());
            jSONObject.put(Const.Callback.DeviceInfo.SYSTEM_VERSION, Build.VERSION.RELEASE);
            jSONObject.put("brand", Build.BRAND);
            jSONObject.put("model", Build.MODEL);
        } catch (Exception e2) {
            m7b.g("DEVICE_INFO:" + e2.getMessage(), new Throwable[0]);
        }
        lr9Var.success(jSONObject);
    }
}
