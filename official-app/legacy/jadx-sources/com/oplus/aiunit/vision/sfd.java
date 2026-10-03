package com.oplus.aiunit.vision;

import android.annotation.SuppressLint;
import android.util.SparseArray;
import com.oplus.wearable.linkservice.sdk.common.MessageEvent;

/* JADX INFO: loaded from: classes4.dex */
public class sfd {
    public final SparseArray<r3> a;

    public static class a {
        public static sfd a = new sfd();
    }

    public static sfd b() {
        return a.a;
    }

    public static void c() {
        zlj.a("init OlinkStableCourierManager ------->>>>> ");
        new pa8();
    }

    @SuppressLint({"DefaultLocale"})
    public synchronized void a(MessageEvent messageEvent) {
        int serviceId;
        r3 r3Var;
        synchronized (this.a) {
            serviceId = (messageEvent.getServiceId() << 8) | messageEvent.getCommandId();
            r3Var = this.a.get(serviceId);
        }
        if (r3Var != null) {
            zlj.a(String.format("DMMessageApi.MessageListener ===Olink Stable===onMessageReceived===>type: %d ==>SID: %d ==>CID: %s ==>thread:%s", Integer.valueOf(serviceId), Integer.valueOf(messageEvent.getServiceId()), Integer.valueOf(messageEvent.getCommandId()), Thread.currentThread().getName()));
            r3Var.r(messageEvent);
        }
    }

    public void d(r3 r3Var) {
        synchronized (this.a) {
            zlj.a("mStableCouriers " + r3Var);
            int[] iArrI = r3Var.i();
            int length = iArrI.length;
            for (int i = 0; i < length; i++) {
                int i2 = iArrI[i];
                zlj.a(i2 + " --> mStableCouriers " + r3Var);
                this.a.put(i2, r3Var);
            }
        }
    }

    public sfd() {
        this.a = new SparseArray<>();
    }
}
