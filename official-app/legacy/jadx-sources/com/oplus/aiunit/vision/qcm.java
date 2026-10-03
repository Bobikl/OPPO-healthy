package com.oplus.aiunit.vision;

import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.Base64;
import com.heytap.databaseengineservice.db.table.healtharchives.DBIndicatorStat;
import com.unionpay.utils.UPUtils;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public final class qcm implements Handler.Callback {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i;
        String str = "0";
        switch (message.what) {
            case 1001:
                kfk.z();
                kfk.i(kfk.G(), kfk.U, kfk.M);
                return true;
            case 1002:
                try {
                    if (message.obj != null) {
                        JSONObject jSONObject = new JSONObject((String) message.obj);
                        String strB = ozm.b(jSONObject, "sign");
                        try {
                            i = Integer.parseInt(kfk.L);
                        } catch (Exception unused) {
                            i = 0;
                        }
                        String str2 = new String(Base64.decode(jSONObject.getString("configs"), 2));
                        String str3 = "";
                        String str4 = jSONObject.has("sePayConf") ? new String(Base64.decode(jSONObject.getString("sePayConf"), 2)) : "";
                        if (!TextUtils.isEmpty(str4)) {
                            str3 = str4;
                        }
                        String strI = com.unionpay.utils.a.i(UPUtils.d(str2 + str3 + kfk.I));
                        String strB2 = UPUtils.b(i, strB);
                        if (!TextUtils.isEmpty(strB2) && strB2.equals(strI)) {
                            UPUtils.g(kfk.G(), (String) message.obj, "configs" + kfk.D);
                            UPUtils.g(kfk.G(), kfk.L, "mode" + kfk.D);
                            UPUtils.g(kfk.G(), kfk.I, "or" + kfk.D);
                            if (!TextUtils.isEmpty(kfk.B)) {
                                UPUtils.g(kfk.G(), str3, "se_configs" + kfk.B);
                            }
                            if (!kfk.N) {
                                JSONArray unused2 = kfk.U = kfk.o(new JSONArray(str2), DBIndicatorStat.SORT);
                                kfk.t(str3);
                            }
                        }
                    }
                    break;
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
                if (!kfk.N) {
                    kfk.i(kfk.G(), kfk.U, kfk.M);
                }
                return true;
            case 1003:
                kfk.Q.removeMessages(1004);
                try {
                    Object obj = message.obj;
                    if ((obj instanceof Integer) && ((Integer) obj).intValue() == 1) {
                        str = "1";
                    }
                } catch (Exception unused3) {
                }
                if (!kfk.O) {
                    kfk.r(str);
                }
                return true;
            case 1004:
                f1n.d("uppay", "QUERY_CAPACITY_TIME_OUT");
                kfk.C();
                kfk.r(str);
                return true;
            default:
                return true;
        }
    }
}
