package com.oplus.aiunit.vision;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.heytap.mcssdk.PushService;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes19.dex */
public class lhm extends hlm {
    @Override // com.oplus.aiunit.vision.bpm
    public com.heytap.msp.push.mode.a a(Context context, int i, Intent intent) {
        if (4103 != i && 4098 != i && 4108 != i) {
            return null;
        }
        com.heytap.msp.push.mode.a aVarC = c(intent, i);
        ebm.a(context, "push_transmit", (com.heytap.msp.push.mode.b) aVarC);
        return aVarC;
    }

    public com.heytap.msp.push.mode.a c(Intent intent, int i) {
        try {
            com.heytap.msp.push.mode.b bVar = new com.heytap.msp.push.mode.b();
            bVar.x(mhm.f(intent.getStringExtra("messageID")));
            bVar.F(mhm.f(intent.getStringExtra("taskID")));
            bVar.w(mhm.f(intent.getStringExtra("globalID")));
            bVar.n(mhm.f(intent.getStringExtra("appPackage")));
            bVar.H(mhm.f(intent.getStringExtra("title")));
            bVar.p(mhm.f(intent.getStringExtra("content")));
            bVar.r(mhm.f(intent.getStringExtra(iim.a.f)));
            String strF = mhm.f(intent.getStringExtra("notifyID"));
            int i2 = 0;
            bVar.B(TextUtils.isEmpty(strF) ? 0 : Integer.parseInt(strF));
            bVar.z(mhm.f(intent.getStringExtra(PushService.MINI_PROGRAM_PKG)));
            bVar.y(i);
            bVar.u(mhm.f(intent.getStringExtra("eventId")));
            bVar.E(mhm.f(intent.getStringExtra("statistics_extra")));
            String strF2 = mhm.f(intent.getStringExtra("data_extra"));
            bVar.q(strF2);
            String strD = d(strF2);
            if (!TextUtils.isEmpty(strD)) {
                i2 = Integer.parseInt(strD);
            }
            bVar.A(i2);
            bVar.o(mhm.f(intent.getStringExtra("balanceTime")));
            bVar.D(mhm.f(intent.getStringExtra(f04.JSON_KEY_DIGITAL_KEY_START_TIME)));
            bVar.t(mhm.f(intent.getStringExtra("endDate")));
            bVar.G(mhm.f(intent.getStringExtra("timeRanges")));
            bVar.C(mhm.f(intent.getStringExtra("rule")));
            bVar.v(mhm.f(intent.getStringExtra("forcedDelivery")));
            bVar.s(mhm.f(intent.getStringExtra("distinctBycontent")));
            bVar.m(mhm.f(intent.getStringExtra("appID")));
            return bVar;
        } catch (Exception e2) {
            cpm.a("OnHandleIntent--" + e2.getMessage());
            return null;
        }
    }

    public String d(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            return new JSONObject(str).optString("msg_command");
        } catch (JSONException e2) {
            cpm.a(e2.getMessage());
            return "";
        }
    }
}
