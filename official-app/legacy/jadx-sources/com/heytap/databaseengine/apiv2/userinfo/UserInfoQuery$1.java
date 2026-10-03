package com.heytap.databaseengine.apiv2.userinfo;

import com.heytap.databaseengine.callback.ICommonListener;
import com.oplus.aiunit.vision.me8;
import com.oplus.aiunit.vision.tok;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
class UserInfoQuery$1 extends ICommonListener.Stub {
    final /* synthetic */ tok this$0;

    public UserInfoQuery$1(tok tokVar) {
    }

    @Override // com.heytap.databaseengine.callback.ICommonListener
    public void onFailure(int i, List list) {
        me8.e("UserInfoQuery", "readUserInfo onFailure: endTime = " + System.currentTimeMillis());
        tok.c(null);
        throw null;
    }

    @Override // com.heytap.databaseengine.callback.ICommonListener
    public void onSuccess(int i, List list) {
        me8.e("UserInfoQuery", "readUserInfo onSuccess: endTime = " + System.currentTimeMillis());
        tok.c(null);
        throw null;
    }
}
