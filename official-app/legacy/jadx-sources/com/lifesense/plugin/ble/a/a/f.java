package com.lifesense.plugin.ble.a.a;

/* JADX INFO: loaded from: classes5.dex */
class f implements Runnable {
    final /* synthetic */ b a;
    final /* synthetic */ String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ c f8668c;

    public f(c cVar, b bVar, String str) {
        this.f8668c = cVar;
        this.a = bVar;
        this.b = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.a.c() != null && (this.a.c() instanceof a)) {
            String str = "notify reconnect from gatt client,device=" + this.b;
            c cVar = this.f8668c;
            cVar.printLogMessage(cVar.getGeneralLogInfo(this.b, str, com.lifesense.plugin.ble.b.a.a.Operating_Msg, null, true));
            ((a) this.a.c()).b(this.b);
        }
    }
}
