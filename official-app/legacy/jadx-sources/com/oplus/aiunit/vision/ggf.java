package com.oplus.aiunit.vision;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.oplus.drs.core.db.service.ConfigRepository;
import com.oppo.obus.common.report.core.entity.v32.Head;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class ggf extends com.oplus.drs.core.upload.a {
    public ggf(ConfigRepository configRepository, Gson gson) {
        super(configRepository, gson);
    }

    @Override // com.oplus.aiunit.vision.skk
    public Head a(String str, List<co3> list, String str2, long j2) {
        String strN = this.a.n();
        if (strN == null) {
            z6b.o("DRS-Upload", "Failed to get latest header template for reconciliation appId: " + str);
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(strN);
            jSONObject.put("access", str2);
            jSONObject.put("post_time", j2);
            jSONObject.put("app_id", "149700");
            Head head = (Head) this.b.fromJson(mi8.a(jSONObject.toString()), Head.class);
            if (head == null) {
                z6b.o("DRS-Upload", "Failed to parse patched reconciliation common header for appId: " + str);
            }
            return head;
        } catch (JsonSyntaxException | JSONException e2) {
            z6b.p("DRS-Upload", "Failed to patch/parse reconciliation common header for appId: " + str, e2);
            return null;
        }
    }
}
