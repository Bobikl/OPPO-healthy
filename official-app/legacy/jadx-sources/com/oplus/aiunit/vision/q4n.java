package com.oplus.aiunit.vision;

import com.unionpay.UPPayWapActivity;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public final class q4n implements pdm {
    public final /* synthetic */ UPPayWapActivity a;

    public q4n(UPPayWapActivity uPPayWapActivity) {
        this.a = uPPayWapActivity;
    }

    @Override // com.oplus.aiunit.vision.pdm
    public final void a(String str, rdm rdmVar) {
        try {
            JSONArray jSONArray = new JSONArray(str);
            if (jSONArray.length() <= 0) {
                if (rdmVar != null) {
                    rdmVar.a(UPPayWapActivity.j("1", "Parameter error", null));
                    return;
                }
                return;
            }
            JSONObject jSONObject = new JSONObject();
            int i = 0;
            while (true) {
                String str2 = "0";
                if (i >= jSONArray.length()) {
                    break;
                }
                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                String string = jSONObject2.getString("packageName");
                if (com.unionpay.utils.a.g(this.a, string, jSONObject2.getString("packageSign"), jSONObject2.getString("supportVersion"))) {
                    str2 = "1";
                }
                jSONObject.put(string, str2);
                i++;
            }
            if (rdmVar != null) {
                rdmVar.a(UPPayWapActivity.k("0", "success", jSONObject));
            }
        } catch (Exception e2) {
            if (rdmVar != null) {
                rdmVar.a(UPPayWapActivity.j("1", e2.getMessage(), null));
            }
        }
    }
}
