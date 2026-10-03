package com.oplus.aiunit.vision;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.unionpay.UPPayWapActivity;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public final class w6n implements pdm {
    public final /* synthetic */ UPPayWapActivity a;

    public w6n(UPPayWapActivity uPPayWapActivity) {
        this.a = uPPayWapActivity;
    }

    @Override // com.oplus.aiunit.vision.pdm
    public final void a(String str, rdm rdmVar) {
        try {
            this.a.p = rdmVar;
            String strOptString = new JSONObject(str).optString("scheme");
            if (TextUtils.isEmpty(strOptString)) {
                if (rdmVar != null) {
                    rdmVar.a(UPPayWapActivity.j("1", "Parameter error", null));
                    return;
                }
                return;
            }
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse(strOptString));
            try {
                this.a.startActivity(intent);
            } catch (Exception unused) {
                if (rdmVar != null) {
                    rdmVar.a(UPPayWapActivity.j("2", "Call application error", null));
                }
            }
        } catch (Exception e2) {
            if (rdmVar != null) {
                rdmVar.a(UPPayWapActivity.j("1", e2.getMessage(), null));
            }
        }
    }
}
