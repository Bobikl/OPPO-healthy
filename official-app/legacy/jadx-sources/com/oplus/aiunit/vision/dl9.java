package com.oplus.aiunit.vision;

import android.os.Bundle;

/* JADX INFO: loaded from: classes4.dex */
public class dl9 implements Runnable {
    public final /* synthetic */ fl9 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ String f10613j;
    public final /* synthetic */ com.huawei.nfc.sdk.service.b k;

    public dl9(com.huawei.nfc.sdk.service.b bVar, fl9 fl9Var, String str) {
        this.k = bVar;
        this.i = fl9Var;
        this.f10613j = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.huawei.nfc.sdk.service.b bVar;
        synchronized (this.k.a) {
            this.k.d = this.i;
            this.k.k();
            if (this.k.f8568c != null) {
                try {
                    try {
                        f1n.c("HwOpenPayTask", "supportCapacity capacity is " + this.f10613j);
                        boolean zSupportCapacity = this.k.f8568c.supportCapacity(this.f10613j);
                        f1n.c("HwOpenPayTask", "supportCapacity result is " + zSupportCapacity);
                        fl9 fl9Var = this.i;
                        if (fl9Var != null) {
                            fl9Var.a(zSupportCapacity ? 1 : 0, new Bundle());
                        }
                        bVar = this.k;
                    } catch (Exception unused) {
                        f1n.d("HwOpenPayTask", "supportCapacity---RemoteException--");
                        this.i.a(0, new Bundle());
                        bVar = this.k;
                    }
                    bVar.i();
                } catch (Throwable th) {
                    this.k.i();
                    throw th;
                }
            } else {
                f1n.c("HwOpenPayTask", "mOpenService is null");
            }
        }
    }
}
