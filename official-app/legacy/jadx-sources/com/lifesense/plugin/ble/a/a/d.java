package com.lifesense.plugin.ble.a.a;

/* JADX INFO: loaded from: classes5.dex */
class d implements Runnable {
    final /* synthetic */ c a;

    public d(c cVar) {
        this.a = cVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.a.f8667e == null) {
            return;
        }
        String str = "try to connect next device=" + this.a.f8667e.d();
        c cVar = this.a;
        cVar.printLogMessage(cVar.getSupperLogInfo(cVar.f8667e.d(), str, com.lifesense.plugin.ble.b.a.a.Operating_Msg, null, true));
        c cVar2 = this.a;
        cVar2.a(cVar2.f8667e);
    }
}
