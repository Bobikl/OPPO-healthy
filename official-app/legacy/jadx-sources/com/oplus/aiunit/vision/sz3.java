package com.oplus.aiunit.vision;

import android.os.RemoteException;
import com.oplus.wearable.linkservice.common.parcel.DeviceInfo;
import com.oplus.wearable.linkservice.sdk.IWearableListener;

/* JADX INFO: loaded from: classes5.dex */
public class sz3 implements ev9<IWearableListener> {
    public DeviceInfo a;
    public int b;

    public sz3(DeviceInfo deviceInfo, int i) {
        this.a = deviceInfo;
        this.b = i;
    }

    public static sz3 a(DeviceInfo deviceInfo, int i) {
        return new sz3(deviceInfo, i);
    }

    @Override // com.oplus.aiunit.vision.ev9
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void execute(IWearableListener iWearableListener) {
        if (iWearableListener == null) {
            return;
        }
        int i = this.b;
        if (i == 2) {
            try {
                iWearableListener.onPeerConnected(this.a.toNode());
                return;
            } catch (RemoteException e2) {
                wil.b("ConnectionTask", "onPeerConnected Exception: " + e2.getMessage());
                return;
            }
        }
        if (i != 3) {
            return;
        }
        try {
            iWearableListener.onPeerDisconnected(this.a.toNode());
        } catch (RemoteException e3) {
            wil.b("ConnectionTask", "onPeerDisconnected Exception: " + e3.getMessage());
        }
    }

    public String toString() {
        return "ConnectionTask{mModuleInfo=" + this.a + ", mState=" + this.b + '}';
    }
}
