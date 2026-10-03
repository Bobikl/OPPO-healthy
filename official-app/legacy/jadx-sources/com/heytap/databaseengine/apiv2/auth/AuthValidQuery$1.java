package com.heytap.databaseengine.apiv2.auth;

import com.heytap.databaseengine.callback.ICommonListener;
import com.oplus.aiunit.vision.me8;
import com.oplus.aiunit.vision.tm0;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
class AuthValidQuery$1 extends ICommonListener.Stub {
    final /* synthetic */ tm0 this$0;

    public AuthValidQuery$1(tm0 tm0Var) {
    }

    @Override // com.heytap.databaseengine.callback.ICommonListener
    public void onFailure(int i, List list) {
        me8.e("AuthValidQuery", "app has something wrong.");
        tm0.c(null);
        throw null;
    }

    @Override // com.heytap.databaseengine.callback.ICommonListener
    public void onSuccess(int i, List list) {
        me8.e("AuthValidQuery", "app status is ok.");
        tm0.c(null);
        throw null;
    }
}
