package com.lifesense.plugin.ble.device.ancs;

import android.net.Uri;

/* JADX INFO: loaded from: classes5.dex */
class o implements Runnable {
    final /* synthetic */ Uri a;
    final /* synthetic */ n b;

    public o(n nVar, Uri uri) {
        this.b = nVar;
        this.a = uri;
    }

    @Override // java.lang.Runnable
    public void run() {
        n nVar = this.b;
        nVar.a(nVar.a, this.a);
    }
}
