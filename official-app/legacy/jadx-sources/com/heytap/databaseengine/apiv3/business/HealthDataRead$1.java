package com.heytap.databaseengine.apiv3.business;

import com.heytap.databaseengine.callback.IDataReadResultListener;
import com.oplus.aiunit.vision.jq8;
import com.oplus.aiunit.vision.me8;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
class HealthDataRead$1 extends IDataReadResultListener.Stub {
    final /* synthetic */ jq8 this$0;
    final /* synthetic */ List val$dataSets;

    public HealthDataRead$1(jq8 jq8Var, List list) {
        this.val$dataSets = list;
    }

    @Override // com.heytap.databaseengine.callback.IDataReadResultListener
    public void onResult(List list, int i, int i2) {
        if (jq8.d(null, list, i2, this.val$dataSets)) {
            if (i == 0) {
                jq8.c(null);
                throw null;
            }
            me8.e("HealthDataRead", "get data failed, errorCode: " + i);
            jq8.c(null);
            throw null;
        }
    }
}
