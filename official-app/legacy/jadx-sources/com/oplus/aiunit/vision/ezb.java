package com.oplus.aiunit.vision;

import android.os.RemoteException;
import com.oplus.wearable.linkservice.sdk.IWearableListener;
import com.oplus.wearable.linkservice.sdk.common.MessageEvent;

/* JADX INFO: loaded from: classes5.dex */
public class ezb implements ev9<IWearableListener> {
    public String a;
    public MessageEvent b;

    public ezb(String str, MessageEvent messageEvent) {
        this.a = str;
        this.b = messageEvent;
    }

    public static ezb a(String str, MessageEvent messageEvent) {
        return new ezb(str, messageEvent);
    }

    @Override // com.oplus.aiunit.vision.ev9
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void execute(IWearableListener iWearableListener) {
        if (iWearableListener == null) {
            return;
        }
        try {
            iWearableListener.onMessageReceived(this.a, this.b);
        } catch (RemoteException e2) {
            wil.b("MessageTask", "onMessageReceived RemoteException : " + e2.getMessage());
        }
    }

    public String toString() {
        return "MessageTask{mNodeId='" + this.a + "', mMessageEvent=" + this.b + '}';
    }
}
