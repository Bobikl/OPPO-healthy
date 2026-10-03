package com.lifesense.plugin.ble.a;

import android.content.Context;
import android.content.Intent;

/* JADX INFO: loaded from: classes5.dex */
class i implements Runnable {
    final /* synthetic */ String a;
    final /* synthetic */ Context b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ Intent f8685c;
    final /* synthetic */ h d;

    public i(h hVar, String str, Context context, Intent intent) {
        this.d = hVar;
        this.a = str;
        this.b = context;
        this.f8685c = intent;
    }

    @Override // java.lang.Runnable
    public void run() {
        if ("android.intent.action.SCREEN_ON".equalsIgnoreCase(this.a) || "android.intent.action.SCREEN_OFF".equalsIgnoreCase(this.a)) {
            this.d.a(this.b, this.a);
        } else if ("android.bluetooth.adapter.action.STATE_CHANGED".equalsIgnoreCase(this.a)) {
            this.d.b(this.b, this.f8685c);
        } else {
            this.d.a(this.b, this.f8685c);
        }
    }
}
