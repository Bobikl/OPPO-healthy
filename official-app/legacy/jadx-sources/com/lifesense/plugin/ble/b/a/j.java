package com.lifesense.plugin.ble.b.a;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* JADX INFO: loaded from: classes5.dex */
class j extends Handler {
    final /* synthetic */ i a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(i iVar, Looper looper) {
        super(looper);
        this.a = iVar;
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        Object obj;
        i iVar;
        if (message == null) {
            return;
        }
        int i = message.arg1;
        boolean z = true;
        if (i == 1) {
            i iVar2 = this.a;
            iVar2.a(iVar2.o);
            return;
        }
        if (i == 8 && (obj = message.obj) != null && (obj instanceof b)) {
            b bVar = (b) obj;
            if (a.Start_SDK == bVar.a()) {
                this.a.b(bVar);
                return;
            }
            if (a.Start_Service != bVar.a()) {
                if (a.Stop_Service == bVar.a()) {
                    iVar = this.a;
                }
                i iVar3 = this.a;
                iVar3.a(iVar3.k, bVar.a(this.a.f8695n));
                if (a.Close_Gatt == bVar.a() || !this.a.f8695n) {
                }
                i iVar4 = this.a;
                iVar4.a(iVar4.k, bVar.a(this.a.f8695n));
                return;
            }
            i.b(this.a);
            bVar.a(this.a.p);
            iVar = this.a;
            z = false;
            iVar.f8695n = z;
            i iVar5 = this.a;
            iVar5.a(iVar5.k, bVar.a(this.a.f8695n));
            if (a.Close_Gatt == bVar.a()) {
            }
        }
    }
}
