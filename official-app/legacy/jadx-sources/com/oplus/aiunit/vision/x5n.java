package com.oplus.aiunit.vision;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.unionpay.UPPayWapActivity;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public final class x5n implements pdm {
    public final /* synthetic */ UPPayWapActivity a;

    public x5n(UPPayWapActivity uPPayWapActivity) {
        this.a = uPPayWapActivity;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:51:? A[RETURN, SYNTHETIC] */
    @Override // com.oplus.aiunit.vision.pdm
    public final void a(String str, rdm rdmVar) {
        try {
            this.a.p = rdmVar;
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString("packageName");
            String string2 = jSONObject.getString("type");
            String strOptString = jSONObject.optString("openParams");
            String strOptString2 = jSONObject.optString("tn");
            String strOptString3 = jSONObject.optString("extra");
            if ("0".equals(string2)) {
                if (TextUtils.isEmpty(string) || TextUtils.isEmpty(strOptString2)) {
                    if (rdmVar != null) {
                        rdmVar.a(UPPayWapActivity.j("1", "Parameter error", null));
                        return;
                    }
                    return;
                }
                Intent intent = new Intent();
                intent.setClassName(string, "com.unionpay.uppay.PayActivity");
                intent.putExtra("paydata", strOptString2);
                intent.putExtra(UPPayWapActivity.q, this.a.m);
                intent.putExtra("extra", strOptString3);
                try {
                    this.a.startActivityForResult(intent, 1);
                    return;
                } catch (Exception unused) {
                    if (rdmVar != null) {
                        rdmVar.a(UPPayWapActivity.j("2", "Call application error", null));
                        return;
                    }
                    return;
                }
            }
            if (!"2".equals(string2)) {
                if (rdmVar != null) {
                    rdmVar.a(UPPayWapActivity.j("1", "Parameter error", null));
                    return;
                }
                return;
            }
            if (TextUtils.isEmpty(strOptString)) {
                if (rdmVar != null) {
                    rdmVar.a(UPPayWapActivity.j("1", "Parameter error", null));
                    return;
                }
                return;
            }
            Intent intent2 = new Intent("android.intent.action.VIEW");
            intent2.setData(Uri.parse(strOptString));
            intent2.putExtra("extra", strOptString3);
            if (!TextUtils.isEmpty(string)) {
                intent2.setPackage(string);
            }
            try {
                this.a.startActivityForResult(intent2, 1);
                return;
            } catch (Exception unused2) {
                if (rdmVar != null) {
                    rdmVar.a(UPPayWapActivity.j("2", "Call application error", null));
                    return;
                }
                return;
            }
        } catch (Exception e2) {
            if (rdmVar != null) {
                rdmVar.a(UPPayWapActivity.j("1", e2.getMessage(), null));
            }
        }
        if (rdmVar != null) {
            rdmVar.a(UPPayWapActivity.j("1", e2.getMessage(), null));
        }
    }
}
