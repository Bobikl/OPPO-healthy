package com.heytap.databaseengine.apiv3.business;

import com.heytap.databaseengine.callback.IDataOperateListener;
import com.oplus.aiunit.vision.iq8;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
class HealthDataInsert$1 extends IDataOperateListener.Stub {
    final /* synthetic */ iq8 this$0;
    final /* synthetic */ int val$index;
    final /* synthetic */ int[] val$resultCode;
    final /* synthetic */ int val$size;

    public HealthDataInsert$1(iq8 iq8Var, int[] iArr, int i, int i2) {
        this.val$resultCode = iArr;
        this.val$index = i;
        this.val$size = i2;
    }

    @Override // com.heytap.databaseengine.callback.IDataOperateListener
    public void onResult(int i, List list) {
        if (i != 0) {
            this.val$resultCode[0] = i;
        }
        if (this.val$index == this.val$size - 1) {
            if (this.val$resultCode[0] != 0) {
                iq8.c(null);
                throw null;
            }
            iq8.c(null);
            throw null;
        }
    }
}
