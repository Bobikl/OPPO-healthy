package com.lifesense.plugin.ble.a.a;

import java.util.UUID;

/* JADX INFO: loaded from: classes5.dex */
class i implements n {
    final /* synthetic */ h a;

    public i(h hVar) {
        this.a = hVar;
    }

    @Override // com.lifesense.plugin.ble.a.a.n
    public void a(m mVar) {
        if (mVar == null) {
            return;
        }
        this.a.a.b(mVar);
        if (o.ReadCharacteristic == mVar.c()) {
            this.a.a(mVar);
            return;
        }
        if (o.WriteCharacteristic == mVar.c()) {
            this.a.d(mVar);
            return;
        }
        if (o.EnableCharacteristic == mVar.c()) {
            this.a.b(mVar);
        } else if (o.DisableCharacteristic == mVar.c()) {
            this.a.c(mVar);
        } else if (o.RequestMtu == mVar.c()) {
            this.a.e(mVar);
        }
    }

    @Override // com.lifesense.plugin.ble.a.a.n
    public void a(m mVar, boolean z) {
        if (!z) {
            this.a.a.b(mVar);
            this.a.H();
            return;
        }
        if (mVar != null) {
            UUID uuidH = mVar.h();
            UUID uuidI = mVar.i();
            o oVar = o.DisableDone;
            if (oVar == mVar.c() || (oVar = o.EnableDone) == mVar.c() || (oVar = o.ReadDone) == mVar.c()) {
                this.a.a.b(mVar);
                this.a.b(oVar, uuidI, uuidH);
            }
        }
    }
}
