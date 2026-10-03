package com.oplus.aiunit.vision;

import android.os.IBinder;
import com.heytap.health.devicemanager.manager.IDMMainProcessManager;
import com.oplus.health.apiprovider.ClientManager;

/* JADX INFO: loaded from: classes16.dex */
public final /* synthetic */ class jc1 implements ClientManager.a {
    @Override // com.oplus.health.apiprovider.ClientManager.a
    public final Object a(IBinder iBinder) {
        return IDMMainProcessManager.Stub.asInterface(iBinder);
    }
}
