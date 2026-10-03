package com.oplus.aiunit.vision;

import android.os.RemoteException;
import com.oplus.wearable.linkservice.sdk.IWearableListener;
import com.oplus.wearable.linkservice.sdk.common.MessageEvent;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class t0c implements lw9<IWearableListener> {
    public String a;
    public MessageEvent b;

    public t0c(String str, MessageEvent messageEvent) {
        this.a = str;
        this.b = messageEvent;
    }

    public static t0c a(String str, MessageEvent messageEvent) {
        return new t0c(str, messageEvent);
    }

    @Override // com.oplus.aiunit.vision.lw9
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void execute(IWearableListener iWearableListener) {
        if (iWearableListener == null) {
            return;
        }
        try {
            iWearableListener.onMessageReceived(this.a, this.b);
        } catch (RemoteException e) {
            uml.b("MessageTask", "onMessageReceived RemoteException : " + e.getMessage());
        }
    }

    public String toString() {
        return "MessageTask{mNodeId='" + this.a + "', mMessageEvent=" + this.b + '}';
    }
}
