package com.oplus.aiunit.vision;

import com.heytap.log.formatter.LogFieldKey;
import com.oplus.instant.router.Instant;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes16.dex */
public class llm extends Instant.FromBuilder {
    public Map<String, String> a = new HashMap();

    @Override // com.oplus.instant.router.Instant.FromBuilder
    public String build() {
        JSONObject jSONObject = new JSONObject();
        try {
            for (String str : this.a.keySet()) {
                jSONObject.put(str, this.a.get(str));
            }
        } catch (JSONException e2) {
            epm.d("FromBuilderImpl", e2);
        }
        return jSONObject.toString();
    }

    @Override // com.oplus.instant.router.Instant.FromBuilder
    public Instant.FromBuilder set(String str, String str2) {
        this.a.put(str, str2);
        return this;
    }

    @Override // com.oplus.instant.router.Instant.FromBuilder
    public Instant.FromBuilder setScene(String str) {
        this.a.put(LogFieldKey.MESSAGE_KEY, str);
        return this;
    }

    @Override // com.oplus.instant.router.Instant.FromBuilder
    public Instant.FromBuilder setTraceId(String str) {
        this.a.put("t", str);
        return this;
    }
}
