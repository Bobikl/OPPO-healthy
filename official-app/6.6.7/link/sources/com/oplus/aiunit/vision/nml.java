package com.oplus.aiunit.vision;

import android.os.RemoteException;
import com.oplus.wearable.linkservice.sdk.IWearableCallback;
import com.oplus.wearable.linkservice.sdk.common.Status;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class nml implements lt2<Void> {
    public IWearableCallback a;

    public nml(IWearableCallback iWearableCallback) {
        this.a = iWearableCallback;
    }

    @Override // com.oplus.aiunit.vision.lt2
    public void a(Throwable th, int i) {
        String localizedMessage;
        if (this.a != null) {
            if (th == null) {
                localizedMessage = "null";
            } else {
                try {
                    localizedMessage = th.getLocalizedMessage();
                } catch (RemoteException e) {
                    uml.b("WearableCallback", "onError: " + e.getMessage());
                }
            }
            this.a.onResult(new Status(i, localizedMessage));
            uml.k("WearableCallback", "onError dispatch code=" + i + " " + localizedMessage);
        }
        this.a = null;
    }

    @Override // com.oplus.aiunit.vision.lt2
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void onSuccess(Void r4) {
        IWearableCallback iWearableCallback = this.a;
        if (iWearableCallback != null) {
            try {
                iWearableCallback.onResult(Status.SUCCESS);
                uml.a("WearableCallback", "onSuccess dispatch");
            } catch (RemoteException e) {
                uml.b("WearableCallback", "onSuccess: " + e.getMessage());
            }
        }
        this.a = null;
    }
}
