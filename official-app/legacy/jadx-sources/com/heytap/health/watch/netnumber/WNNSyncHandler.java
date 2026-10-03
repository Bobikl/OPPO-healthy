package com.heytap.health.watch.netnumber;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.heytap.health.devicemanager.client.impl.arouter.DMIMessageHandler;
import com.heytap.health.watch.netnumber.IWnnAidl;
import com.oplus.aiunit.vision.a5l;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.ra5;
import com.oplus.health.apiprovider.ClientManager;
import com.oplus.wearable.linkservice.sdk.common.MessageEvent;

/* JADX INFO: loaded from: classes19.dex */
@Route(path = a5l.PATH)
public class WNNSyncHandler extends DMIMessageHandler {
    @Override // com.heytap.health.devicemanager.client.impl.arouter.DMIMessageHandler
    public void onCreate(Context context) {
        a7b.f(a5l.TAG, "[onCreate] --> WNNSyncHandler");
    }

    @Override // com.heytap.health.devicemanager.client.impl.arouter.DMIMessageHandler
    public void onMessageReceived(ra5 ra5Var, String str, MessageEvent messageEvent) {
        IWnnAidl iWnnAidl = (IWnnAidl) ClientManager.getInstance().getBuildService(a5l.TAG, new ClientManager.a() { // from class: com.oplus.aiunit.vision.b5l
            @Override // com.oplus.health.apiprovider.ClientManager.a
            public final Object a(IBinder iBinder) {
                return IWnnAidl.Stub.asInterface(iBinder);
            }
        });
        if (iWnnAidl == null) {
            a7b.b(a5l.TAG, "[onMessageReceived] --> not found WNNSyncHandler aidl");
            return;
        }
        try {
            iWnnAidl.onMessageReceived(messageEvent);
        } catch (RemoteException e2) {
            a7b.b(a5l.TAG, "[onMessageReceived] --> " + e2.getMessage());
        }
    }
}
