package com.lifesense.plugin.ble.b;

/* JADX INFO: loaded from: classes5.dex */
class e implements Runnable {
    final /* synthetic */ com.lifesense.plugin.ble.b.a.a a;
    final /* synthetic */ String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ com.lifesense.plugin.ble.b.a.b f8702c;
    final /* synthetic */ d d;

    public e(d dVar, com.lifesense.plugin.ble.b.a.a aVar, String str, com.lifesense.plugin.ble.b.a.b bVar) {
        this.d = dVar;
        this.a = aVar;
        this.b = str;
        this.f8702c = bVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.d.a(this.a)) {
            this.d.b(this.b, this.f8702c);
        } else {
            this.d.a(this.b, this.f8702c);
        }
    }
}
