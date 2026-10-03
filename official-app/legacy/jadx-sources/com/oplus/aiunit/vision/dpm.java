package com.oplus.aiunit.vision;

import android.content.Context;
import android.text.TextUtils;
import com.oplus.instant.router.Instant;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes16.dex */
public class dpm extends ibm {
    public dpm(nhm nhmVar) {
        super(nhmVar);
    }

    public final Map<String, Object> a() {
        HashMap map = new HashMap();
        if (!TextUtils.isEmpty(this.f)) {
            map.putAll(gbm.c(this.f));
        }
        Map<String, String> map2 = this.f12469c;
        if (map2 != null && map2.size() > 0 && this.a.containsKey("f")) {
            try {
                JSONObject jSONObject = new JSONObject(this.a.get("f"));
                for (String str : this.f12469c.keySet()) {
                    jSONObject.put(str, this.f12469c.get(str));
                }
                this.a.put("f", jSONObject.toString());
            } catch (Exception unused) {
            }
        }
        map.putAll(this.a);
        if (!map.containsKey("scheme")) {
            map.put("scheme", Instant.SCHEME_OAPS);
        }
        if (!map.containsKey("host")) {
            map.put("host", Instant.HOST_INSTANT);
        }
        return map;
    }

    @Override // com.oplus.instant.router.Instant.Req
    public void preload(Context context) {
        mrm.i(context.getApplicationContext(), gbm.b(a()), this.a, this.b, this.f12469c, this.d, this.f12470e);
    }

    @Override // com.oplus.instant.router.Instant.Req
    public void request(Context context) {
        mrm.s(context, gbm.b(a()), this.a, this.b, this.f12469c, this.d, this.f12470e);
    }
}
