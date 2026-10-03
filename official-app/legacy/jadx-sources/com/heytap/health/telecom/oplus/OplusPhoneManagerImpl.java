package com.heytap.health.telecom.oplus;

import android.content.Context;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.heytap.health.interconnection.oplus.IOplusPhoneManager;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.apd;

/* JADX INFO: loaded from: classes18.dex */
@Route(path = "/telecom/OplusPhoneManagerImpl")
public class OplusPhoneManagerImpl implements IOplusPhoneManager {
    public static final String TAG = "TelHealth.OplusPhoneManagerImpl";

    @Override // com.alibaba.android.arouter.facade.template.IProvider
    public void init(Context context) {
    }

    @Override // com.heytap.health.interconnection.oplus.IOplusPhoneManager
    public boolean p6(String str) {
        boolean zA;
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("hasOPlusSystemFeature: name:");
            sb.append(str);
            zA = apd.a(str);
        } catch (Throwable th) {
            a7b.b(TAG, "hasOPlusSystemFeature: " + th.getMessage());
            zA = false;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("hasOPlusSystemFeature, name=");
        sb2.append(str);
        sb2.append(" ");
        sb2.append(zA);
        return zA;
    }
}
