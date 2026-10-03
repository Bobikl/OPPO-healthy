package com.oppo.ovoicemanager.api;

import android.os.RemoteException;
import android.util.Log;
import com.oplus.aiunit.vision.z8d;
import com.oppo.ovoicemanager.service.IOVoiceManagerCallback;

/* JADX INFO: loaded from: classes9.dex */
class OVoiceManagerSDK$2 extends IOVoiceManagerCallback.Stub {
    final /* synthetic */ z8d this$0;

    public OVoiceManagerSDK$2(z8d z8dVar) {
    }

    @Override // com.oppo.ovoicemanager.service.IOVoiceManagerCallback
    public int notify(int i) throws RemoteException {
        StringBuilder sb = new StringBuilder();
        sb.append("mICallback = ");
        sb.append(z8d.a);
        sb.append("mCallbak = ");
        z8d.a(null);
        sb.append((Object) null);
        Log.d("OVMA-OVoiceManagerSDK", sb.toString());
        z8d.a(null);
        return -1;
    }
}
