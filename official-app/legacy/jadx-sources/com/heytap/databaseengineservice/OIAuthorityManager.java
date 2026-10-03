package com.heytap.databaseengineservice;

import android.os.Binder;
import com.heytap.databaseengine.apiv2.IAuthorityManager;
import com.heytap.databaseengine.callback.ICommonListener;
import com.oplus.aiunit.vision.cj4;
import com.oplus.aiunit.vision.g0b;
import com.oplus.aiunit.vision.jp6;
import com.oplus.aiunit.vision.qa2;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
public class OIAuthorityManager extends IAuthorityManager.Stub {
    private static final String TAG = "OIAuthorityManager";
    private final List<Object> blanketDataReturn = new ArrayList();

    @Override // com.heytap.databaseengine.apiv2.IAuthorityManager
    public void revoke(ICommonListener iCommonListener) {
        if (qa2.account.b()) {
            cj4.d(TAG, "ssoid is null!");
            g0b.a(iCommonListener, jp6.ERR_LOGIN_STATUS, this.blanketDataReturn);
            qa2.trackReport.q("revoke", Binder.getCallingUid(), String.valueOf(jp6.ERR_LOGIN_STATUS), "");
            return;
        }
        String[] packagesForUid = qa2.common.b().getPackageManager().getPackagesForUid(Binder.getCallingUid());
        if (packagesForUid == null) {
            qa2.trackReport.q("revoke", Binder.getCallingUid(), String.valueOf(jp6.ERR_PERMISSION_DENY), "");
            g0b.a(iCommonListener, jp6.ERR_PERMISSION_DENY, this.blanketDataReturn);
            return;
        }
        for (String str : packagesForUid) {
            ArrayList arrayList = new ArrayList();
            qa2 qa2Var = qa2.INSTANCE;
            if (qa2Var.h().f(str, arrayList)) {
                qa2Var.h().e(str, iCommonListener);
                qa2.trackReport.q("revoke", Binder.getCallingUid(), String.valueOf(0), "");
                return;
            }
        }
        g0b.a(iCommonListener, jp6.ERR_PERMISSION_DENY, this.blanketDataReturn);
        qa2.trackReport.q("revoke", Binder.getCallingUid(), String.valueOf(jp6.ERR_PERMISSION_DENY), "");
    }

    @Override // com.heytap.databaseengine.apiv2.IAuthorityManager
    public void valid(ICommonListener iCommonListener) {
        try {
            if (qa2.account.b()) {
                cj4.d(TAG, "ssoid is null!");
                g0b.a(iCommonListener, jp6.ERR_LOGIN_STATUS, this.blanketDataReturn);
                qa2.trackReport.q("valid", Binder.getCallingUid(), String.valueOf(jp6.ERR_LOGIN_STATUS), "");
                return;
            }
            String[] packagesForUid = qa2.common.b().getPackageManager().getPackagesForUid(Binder.getCallingUid());
            if (packagesForUid == null) {
                g0b.a(iCommonListener, jp6.ERR_PERMISSION_DENY, this.blanketDataReturn);
                qa2.trackReport.q("valid", Binder.getCallingUid(), String.valueOf(jp6.ERR_PERMISSION_DENY), "");
                return;
            }
            for (String str : packagesForUid) {
                ArrayList arrayList = new ArrayList();
                if (qa2.INSTANCE.h().f(str, arrayList)) {
                    g0b.d(iCommonListener, 0, arrayList);
                    qa2.trackReport.q("valid", Binder.getCallingUid(), String.valueOf(0), "");
                    return;
                }
            }
            g0b.a(iCommonListener, jp6.ERR_PERMISSION_DENY, this.blanketDataReturn);
            qa2.trackReport.q("valid", Binder.getCallingUid(), String.valueOf(jp6.ERR_PERMISSION_DENY), "");
        } catch (Exception e2) {
            cj4.b(TAG, "read data e = " + e2.getMessage());
            g0b.a(iCommonListener, 101002, this.blanketDataReturn);
            qa2.trackReport.q("valid", Binder.getCallingUid(), String.valueOf(101002), "");
        }
    }
}
