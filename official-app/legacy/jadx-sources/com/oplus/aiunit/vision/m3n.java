package com.oplus.aiunit.vision;

import android.content.Intent;
import android.os.Bundle;
import com.unionpay.UPPayWapActivity;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public final class m3n implements pdm {
    public final /* synthetic */ UPPayWapActivity a;

    public m3n(UPPayWapActivity uPPayWapActivity) {
        this.a = uPPayWapActivity;
    }

    @Override // com.oplus.aiunit.vision.pdm
    public final void a(String str, rdm rdmVar) {
        String str2;
        String str3 = "";
        try {
            JSONObject jSONObject = new JSONObject(str);
            try {
                str2 = (String) jSONObject.get("url");
                try {
                    str3 = (String) jSONObject.get("title");
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
            Bundle bundle = new Bundle();
            bundle.putString("waptype", "new_page");
            bundle.putString("magic_data", "949A1CC");
            bundle.putString("wapurl", str2);
            bundle.putString("waptitle", str3);
            bundle.putString(f04.JSON_KEY_RKE_ACTION_TYPE, this.a.f20348n);
            Intent intent = new Intent();
            intent.putExtras(bundle);
            intent.setClass(this.a, UPPayWapActivity.class);
            this.a.startActivity(intent);
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
