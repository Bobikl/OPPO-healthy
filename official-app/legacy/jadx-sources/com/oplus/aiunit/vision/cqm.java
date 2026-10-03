package com.oplus.aiunit.vision;

import android.text.TextUtils;
import com.xingin.xhssharesdk.XhsShareConstants$XhsShareNoteErrorCode;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public final class cqm implements xim.a {
    public final /* synthetic */ sim a;

    public cqm(tim timVar) {
        this.a = timVar;
    }

    @Override // com.oplus.aiunit.vision.xim.a
    public final void a(Exception exc) {
        tim timVar = (tim) this.a;
        qmm qmmVar = timVar.b;
        edm edmVar = timVar.a;
        qmmVar.d = new edm(edmVar.a, edmVar.b, edmVar.f10894c, edmVar.d, false, XhsShareConstants$XhsShareNoteErrorCode.UNKNOWN, exc.getMessage());
        qmm.d(timVar.b);
    }

    @Override // com.oplus.aiunit.vision.xim.a
    public final void onSuccess(String str) {
        fdm fdmVar;
        tim timVar = (tim) this.a;
        timVar.getClass();
        try {
            fdmVar = new fdm();
            if (!TextUtils.isEmpty(str)) {
                JSONObject jSONObject = new JSONObject(str);
                fdmVar.a = jSONObject.getInt("code");
                fdmVar.b = jSONObject.getBoolean("success");
                fdmVar.f11307c = jSONObject.optString("msg");
            }
        } catch (JSONException e2) {
            timVar.b.f15857n.w("XhsShare_Sdk", "CheckTokenResponse convert from json Error!", e2);
            fdmVar = new fdm();
        }
        if (fdmVar.b) {
            tim timVar2 = (tim) this.a;
            timVar2.getClass();
            qmm qmmVar = timVar2.b;
            qmmVar.d = timVar2.a;
            qmm.d(qmmVar);
            return;
        }
        sim simVar = this.a;
        int i = fdmVar.a;
        Exception exc = new Exception(fdmVar.f11307c);
        tim timVar3 = (tim) simVar;
        qmm qmmVar2 = timVar3.b;
        edm edmVar = timVar3.a;
        qmmVar2.d = new edm(edmVar.a, edmVar.b, edmVar.f10894c, edmVar.d, false, i, exc.getMessage());
        qmm.d(timVar3.b);
    }
}
