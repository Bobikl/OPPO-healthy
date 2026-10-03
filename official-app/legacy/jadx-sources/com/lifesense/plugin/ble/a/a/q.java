package com.lifesense.plugin.ble.a.a;

/* JADX INFO: loaded from: classes5.dex */
class q implements Runnable {
    final /* synthetic */ p a;

    public q(p pVar) {
        this.a = pVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.a.a == null || this.a.a.size() == 0 || this.a.f == null || this.a.b == null) {
            return;
        }
        String str = "this event timeout >> " + this.a.b.toString();
        p pVar = this.a;
        pVar.printLogMessage(pVar.getGeneralLogInfo(pVar.f8673c, str, com.lifesense.plugin.ble.b.a.a.Warning_Message, null, true));
        this.a.f.a(this.a.b);
    }
}
