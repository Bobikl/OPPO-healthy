package com.heytap.health.settings.me.privacycenter;

import android.content.Context;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.heytap.health.base.privacy.IPrivacyService;
import com.oplus.aiunit.vision.oa2;
import com.oplus.aiunit.vision.um;
import com.oplus.aiunit.vision.vbb;

/* JADX INFO: loaded from: classes17.dex */
@Route(path = "/service/privacy")
public class PrivacyServiceImpl implements IPrivacyService {
    @Override // com.heytap.health.base.privacy.IPrivacyService
    public boolean J0() {
        return !c();
    }

    public final boolean c() {
        String strD = oa2.d("user_ssoid").D("user_ssoid");
        if (strD.isEmpty()) {
            return false;
        }
        String strB = vbb.b(um.c().getSsoid());
        if (strB.isEmpty()) {
            return false;
        }
        return strB.equalsIgnoreCase(strD);
    }

    @Override // com.alibaba.android.arouter.facade.template.IProvider
    public void init(Context context) {
    }

    @Override // com.heytap.health.base.privacy.IPrivacyService
    public void r5() {
        a.g();
    }

    @Override // com.heytap.health.base.privacy.IPrivacyService
    public void y5() {
        oa2.d("user_ssoid").U("user_ssoid", vbb.b(um.c().getSsoid()));
    }
}
