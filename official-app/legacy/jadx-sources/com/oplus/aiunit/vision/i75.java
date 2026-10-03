package com.oplus.aiunit.vision;

import android.content.Context;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.oplus.drs.core.db.service.ConfigRepository;
import com.oppo.obus.common.report.core.entity.v32.Head;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class i75 extends com.oplus.drs.core.upload.a {
    public i75(ConfigRepository configRepository, Gson gson) {
        super(configRepository, gson);
    }

    @Override // com.oplus.aiunit.vision.skk
    public Head a(String str, List<co3> list, String str2, long j2) {
        String strK = k(str, list);
        if (strK == null) {
            z6b.o("DRS-Upload", "Failed to reconstruct header for appId: " + str);
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(strK);
            jSONObject.put("access", str2);
            jSONObject.put("post_time", j2);
            i(jSONObject);
            Head head = (Head) this.b.fromJson(mi8.a(jSONObject.toString()), Head.class);
            if (head == null) {
                z6b.o("DRS-Upload", "Failed to parse patched common header for appId: " + str);
            }
            return head;
        } catch (JsonSyntaxException | JSONException e2) {
            z6b.p("DRS-Upload", "Failed to patch/parse common header for appId: " + str, e2);
            return null;
        }
    }

    public final void i(JSONObject jSONObject) {
        Context contextH;
        String strF;
        String strJ;
        try {
            String strOptString = jSONObject.optString("duid", "");
            String strOptString2 = jSONObject.optString("ouid", "");
            boolean z = TextUtils.isEmpty(strOptString) || strOptString.length() < 10;
            boolean z2 = TextUtils.isEmpty(strOptString2) || strOptString2.length() < 10;
            if ((z || z2) && (contextH = w56.h()) != null) {
                if (z && (strJ = j(contextH)) != null && strJ.length() >= 10) {
                    jSONObject.put("duid", strJ);
                    z6b.q("DRS-Upload", "backfillDeviceIds: duid filled from cache");
                }
                if (z2 && (strF = tpe.f(contextH)) != null && strF.length() >= 10) {
                    jSONObject.put("ouid", strF);
                    z6b.q("DRS-Upload", "backfillDeviceIds: ouid filled from cache");
                }
                z6b.r("DRS-Upload", "backfillDeviceIds: appId=" + jSONObject.optString("app_id", "") + ", duid=" + jSONObject.optString("duid", "") + ", ouid=" + jSONObject.optString("ouid", "") + ", duidFilled=" + z + ", ouidFilled=" + z2);
            }
        } catch (Throwable th) {
            z6b.p("DRS-Upload", "backfillDeviceIds error", th);
        }
    }

    public final String j(Context context) {
        String strD = q7a.d();
        return (strD == null || strD.length() < 10) ? tpe.e(context) : strD;
    }

    public final String k(String str, List<co3> list) {
        if (list != null && !list.isEmpty()) {
            for (co3 co3Var : list) {
                if (co3Var != null) {
                    long j2 = co3Var.f10169c;
                    if (j2 <= 0) {
                        continue;
                    } else {
                        String strL = this.a.l(j2);
                        if (TextUtils.isEmpty(strL)) {
                            continue;
                        } else {
                            if (TextUtils.isEmpty(co3Var.f10170e)) {
                                return strL;
                            }
                            try {
                                JSONObject jSONObject = new JSONObject(strL);
                                JSONObject jSONObject2 = new JSONObject(co3Var.f10170e);
                                Iterator<String> itKeys = jSONObject2.keys();
                                while (itKeys.hasNext()) {
                                    String next = itKeys.next();
                                    jSONObject.put(next, jSONObject2.get(next));
                                }
                                return jSONObject.toString();
                            } catch (JSONException e2) {
                                z6b.p("DRS-Upload", "Failed to merge header template and little header for appId: " + str + ", headerIndex=" + co3Var.f10169c, e2);
                            }
                        }
                    }
                }
            }
            for (co3 co3Var2 : list) {
                if (co3Var2 != null && !TextUtils.isEmpty(co3Var2.f10170e)) {
                    return co3Var2.f10170e;
                }
            }
        }
        return null;
    }
}
