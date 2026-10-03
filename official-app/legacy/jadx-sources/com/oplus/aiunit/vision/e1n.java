package com.oplus.aiunit.vision;

import com.opos.process.bridge.base.BridgeConstant;
import com.unionpay.UPPayWapActivity;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public final class e1n implements pdm {
    public final /* synthetic */ UPPayWapActivity a;

    public e1n(UPPayWapActivity uPPayWapActivity) {
        this.a = uPPayWapActivity;
    }

    @Override // com.oplus.aiunit.vision.pdm
    public final void a(String str, rdm rdmVar) {
        String str2;
        String str3 = "";
        try {
            JSONObject jSONObject = new JSONObject(str);
            try {
                str2 = (String) jSONObject.get("resultCode");
                try {
                    str3 = (String) jSONObject.get(BridgeConstant.KEY_RESULT_DATA);
                } catch (Exception e2) {
                    e = e2;
                    if (rdmVar != null) {
                        rdmVar.a(UPPayWapActivity.j("1", e.getMessage(), null));
                    }
                }
            } catch (Exception e3) {
                e = e3;
                str2 = "";
            }
            this.a.h(str2, str3);
            if (rdmVar != null) {
                rdmVar.a(UPPayWapActivity.j("0", "success", null));
            }
        } catch (Exception e4) {
            if (rdmVar != null) {
                rdmVar.a(UPPayWapActivity.j("1", e4.getMessage(), null));
            }
        }
    }
}
