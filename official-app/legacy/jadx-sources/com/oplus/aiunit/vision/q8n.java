package com.oplus.aiunit.vision;

import com.unionpay.UPPayWapActivity;
import com.unionpay.utils.UPUtils;
import java.util.Iterator;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public final class q8n implements pdm {
    public final /* synthetic */ UPPayWapActivity a;

    public q8n(UPPayWapActivity uPPayWapActivity) {
        this.a = uPPayWapActivity;
    }

    @Override // com.oplus.aiunit.vision.pdm
    public final void a(String str, rdm rdmVar) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                UPUtils.g(this.a, jSONObject.getString(next), next);
            }
            if (rdmVar != null) {
                rdmVar.a(UPPayWapActivity.j("0", "success", null));
            }
        } catch (Exception e2) {
            if (rdmVar != null) {
                rdmVar.a(UPPayWapActivity.j("1", e2.getMessage(), null));
            }
        }
    }
}
