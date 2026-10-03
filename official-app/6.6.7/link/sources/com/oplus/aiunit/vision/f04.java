package com.oplus.aiunit.vision;

import android.os.RemoteException;
import com.oplus.wearable.linkservice.common.parcel.DeviceInfo;
import com.oplus.wearable.linkservice.sdk.IWearableListener;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class f04 implements lw9<IWearableListener> {
    public DeviceInfo a;
    public int b;

    public f04(DeviceInfo deviceInfo, int i) {
        this.a = deviceInfo;
        this.b = i;
    }

    public static f04 a(DeviceInfo deviceInfo, int i) {
        return new f04(deviceInfo, i);
    }

    @Override // com.oplus.aiunit.vision.lw9
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
            } catch (RemoteException e) {
                uml.b("ConnectionTask", "onPeerConnected Exception: " + e.getMessage());
                return;
            }
        }
        if (i != 3) {
            return;
        }
        try {
            iWearableListener.onPeerDisconnected(this.a.toNode());
        } catch (RemoteException e2) {
            uml.b("ConnectionTask", "onPeerDisconnected Exception: " + e2.getMessage());
        }
    }

    public String toString() {
        return "ConnectionTask{mModuleInfo=" + this.a + ", mState=" + this.b + '}';
    }
}
