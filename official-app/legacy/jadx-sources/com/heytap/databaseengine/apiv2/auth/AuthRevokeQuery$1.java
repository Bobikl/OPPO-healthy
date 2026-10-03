package com.heytap.databaseengine.apiv2.auth;

import com.heytap.databaseengine.callback.ICommonListener;
import com.oplus.aiunit.vision.me8;
import com.oplus.aiunit.vision.qm0;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
class AuthRevokeQuery$1 extends ICommonListener.Stub {
    final /* synthetic */ qm0 this$0;

    public AuthRevokeQuery$1(qm0 qm0Var) {
    }

    @Override // com.heytap.databaseengine.callback.ICommonListener
    public void onFailure(int i, List list) {
        me8.e("AuthRevokeQuery", "revoke failed.");
        qm0.c(null);
        throw null;
    }

    @Override // com.heytap.databaseengine.callback.ICommonListener
    public void onSuccess(int i, List list) {
        me8.e("AuthRevokeQuery", "revoke succeed.");
        qm0.c(null);
        throw null;
    }
}
