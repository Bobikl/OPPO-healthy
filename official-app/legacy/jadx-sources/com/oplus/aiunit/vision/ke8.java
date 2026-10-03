package com.oplus.aiunit.vision;

import android.os.IBinder;
import com.heytap.health.location.ILocationAidl;
import com.oplus.health.apiprovider.ClientManager;

/* JADX INFO: loaded from: classes16.dex */
public final /* synthetic */ class ke8 implements ClientManager.a {
    @Override // com.oplus.health.apiprovider.ClientManager.a
    public final Object a(IBinder iBinder) {
        return ILocationAidl.Stub.asInterface(iBinder);
    }
}
