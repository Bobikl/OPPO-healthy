package com.lifesense.plugin.ble.device.a.a.a;

/* JADX INFO: loaded from: classes5.dex */
class i implements Runnable {
    final /* synthetic */ e a;

    public i(e eVar) {
        this.a = eVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.a.b == null || this.a.b.isEmpty() || this.a.f8709c == null) {
            return;
        }
        String str = "setting cmd timeout >> " + this.a.f8709c.toString();
        e eVar = this.a;
        eVar.printLogMessage(eVar.getGeneralLogInfo(eVar.a, str, com.lifesense.plugin.ble.b.a.a.Warning_Message, null, true));
        e eVar2 = this.a;
        eVar2.b(eVar2.f8709c);
        this.a.b();
    }
}
