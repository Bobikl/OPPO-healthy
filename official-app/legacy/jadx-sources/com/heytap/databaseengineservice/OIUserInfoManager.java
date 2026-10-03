package com.heytap.databaseengineservice;

import android.os.Binder;
import com.heytap.databaseengine.apiv2.IUserInfoManager;
import com.heytap.databaseengine.apiv3.data.DataSet;
import com.heytap.databaseengine.callback.ICommonListener;
import com.oplus.aiunit.vision.cj4;
import com.oplus.aiunit.vision.g0b;
import com.oplus.aiunit.vision.jp6;
import com.oplus.aiunit.vision.qa2;
import com.oplus.aiunit.vision.ts8;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes15.dex */
public class OIUserInfoManager extends IUserInfoManager.Stub {
    private static final String TAG = "OIUserInfoManager";

    @Override // com.heytap.databaseengine.apiv2.IUserInfoManager
    public void readUserInfo(ICommonListener iCommonListener) {
        g0b.a(iCommonListener, jp6.ERR_DATA_TYPE_IS_NOT_SUPPORT, null);
    }

    @Override // com.heytap.databaseengine.apiv2.IUserInfoManager
    public void readV2(ICommonListener iCommonListener) {
        if (new ts8(iCommonListener).b(qa2.operationAuth.j())) {
            g0b.a(iCommonListener, jp6.ERR_PERMISSION_DENY, null);
            qa2.trackReport.q("UserInfo_readV2", Binder.getCallingUid(), String.valueOf(jp6.ERR_PERMISSION_DENY), "");
            return;
        }
        String[] packagesForUid = qa2.common.b().getPackageManager().getPackagesForUid(Binder.getCallingUid());
        ArrayList arrayList = new ArrayList();
        DataSet.b bVarI = qa2.operationAuth.i(packagesForUid);
        try {
            if (bVarI.c().getDataPoints().isEmpty()) {
                iCommonListener.onFailure(jp6.ERR_PERMISSION_DENY, new ArrayList());
                qa2.trackReport.q("UserInfo_readV2", Binder.getCallingUid(), String.valueOf(jp6.ERR_PERMISSION_DENY), "");
                return;
            }
            arrayList.add(bVarI.c());
            try {
                iCommonListener.onSuccess(0, arrayList);
                qa2.trackReport.q("UserInfo_readV2", Binder.getCallingUid(), String.valueOf(0), "");
            } catch (Exception e2) {
                cj4.b(TAG, e2.toString());
            }
        } catch (Exception e3) {
            cj4.b(TAG, e3.toString());
        }
    }
}
