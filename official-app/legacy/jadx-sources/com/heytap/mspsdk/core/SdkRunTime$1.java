package com.heytap.mspsdk.core;

import android.os.RemoteException;
import com.heytap.msp.IMspCallback;
import com.heytap.msp.MspResponse;
import java.util.HashMap;

/* JADX INFO: loaded from: classes19.dex */
class SdkRunTime$1 extends IMspCallback.Stub {
    final /* synthetic */ f this$0;
    final /* synthetic */ com.heytap.mspsdk.listener.a val$listener;

    public SdkRunTime$1(f fVar, com.heytap.mspsdk.listener.a aVar) {
        this.this$0 = fVar;
    }

    @Override // com.heytap.msp.IMspCallback
    public void callback(MspResponse mspResponse) throws RemoteException {
        com.heytap.mspsdk.listener.b bVar = new com.heytap.mspsdk.listener.b();
        bVar.a(mspResponse.getCode());
        bVar.c(mspResponse.getMessage());
        if (mspResponse.getData() != null) {
            bVar.b((HashMap) mspResponse.getData().getSerializable("result_map"));
        }
    }
}
