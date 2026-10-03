package com.oplus.aiunit.vision;

import android.os.Build;
import com.oplus.web.container.safe.model.HostSecurityLevel;
import java.util.Locale;
import java.util.TimeZone;
import org.json.JSONObject;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@mka(method = fi5.TABLE_DEVICE_INFO)
@ttg(level = HostSecurityLevel.CRITICAL)
public class qn3 implements ss9 {
    @Override // com.oplus.aiunit.vision.ss9
    public void execute(us9 us9Var, ska skaVar, rs9 rs9Var) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("language", Locale.getDefault().getLanguage());
            jSONObject.put("time_zone", TimeZone.getDefault().getDisplayName(false, 0));
            jSONObject.put("country", Locale.getDefault().getCountry());
            jSONObject.put("system_version", Build.VERSION.RELEASE);
            jSONObject.put("brand", Build.BRAND);
            jSONObject.put("model", Build.MODEL);
        } catch (Exception e) {
            y8b.g("DEVICE_INFO:" + e.getMessage(), new Throwable[0]);
        }
        rs9Var.success(jSONObject);
    }
}
