package com.oplus.aiunit.vision;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;

/* JADX INFO: loaded from: classes2.dex */
public class jr3 implements uof {
    public final uof a = ep6.DEFAULT_CONTROLLER;
    public final le1 b = le1.c();

    public jr3(Context context) {
        if (gvk.a()) {
            return;
        }
        fp6.i(context);
    }

    @Override // com.oplus.aiunit.vision.uof
    public IBinder a(String str) {
        if (gvk.a()) {
            return this.a.a(str);
        }
        IBinder iBinderB = this.b.b(str);
        if (iBinderB == null) {
            Bundle bundleA = x2f.a(fp6.f(), str);
            if (bundleA != null) {
                iBinderB = bundleA.getBinder("com.heytap.epona.Dispatcher.TRANSFER_VALUE");
            }
            if (iBinderB != null) {
                this.b.e(str, iBinderB);
            } else {
                l7b.d("Epona->CompatRegister", "Get remote binder null. ComponentName : %s", str);
            }
        }
        return iBinderB;
    }
}
