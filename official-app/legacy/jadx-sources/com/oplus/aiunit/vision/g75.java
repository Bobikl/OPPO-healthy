package com.oplus.aiunit.vision;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;

/* JADX INFO: loaded from: classes2.dex */
public class g75 implements uof {
    public final le1 a = le1.c();

    @Override // com.oplus.aiunit.vision.uof
    public IBinder a(String str) {
        IBinder iBinderB = this.a.b(str);
        if (iBinderB == null) {
            Context contextG = ep6.g();
            if (q04.APP_PLATFORM_PACKAGE_NAME.equals(contextG.getPackageName())) {
                iBinderB = nu5.d().c(str);
            } else {
                Bundle bundleA = w2f.a(contextG, str);
                if (bundleA != null) {
                    iBinderB = bundleA.getBinder("com.oplus.epona.Dispatcher.TRANSFER_VALUE");
                }
            }
            if (iBinderB != null) {
                this.a.e(str, iBinderB);
            } else {
                l7b.d("Epona->DefaultTransferController", "Get remote binder null. ComponentName : %s", str);
            }
        }
        return iBinderB;
    }
}
