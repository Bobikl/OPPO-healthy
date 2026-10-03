package com.oplus.aiunit.vision;

import android.os.RemoteException;
import com.oplus.wearable.linkservice.sdk.IWearableCallback;
import com.oplus.wearable.linkservice.sdk.common.Status;

/* JADX INFO: loaded from: classes5.dex */
public class pil implements xs2<Void> {
    public IWearableCallback a;

    public pil(IWearableCallback iWearableCallback) {
        this.a = iWearableCallback;
    }

    @Override // com.oplus.aiunit.vision.xs2
    public void a(Throwable th, int i) {
        String localizedMessage;
        if (this.a != null) {
            if (th == null) {
                localizedMessage = "null";
            } else {
                try {
                    localizedMessage = th.getLocalizedMessage();
                } catch (RemoteException e2) {
                    wil.b("WearableCallback", "onError: " + e2.getMessage());
                }
            }
            this.a.onResult(new Status(i, localizedMessage));
            wil.k("WearableCallback", "onError dispatch code=" + i + " " + localizedMessage);
        }
        this.a = null;
    }

    @Override // com.oplus.aiunit.vision.xs2
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void onSuccess(Void r4) {
        IWearableCallback iWearableCallback = this.a;
        if (iWearableCallback != null) {
            try {
                iWearableCallback.onResult(Status.SUCCESS);
                wil.a("WearableCallback", "onSuccess dispatch");
            } catch (RemoteException e2) {
                wil.b("WearableCallback", "onSuccess: " + e2.getMessage());
            }
        }
        this.a = null;
    }
}
