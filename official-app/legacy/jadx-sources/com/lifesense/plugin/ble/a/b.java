package com.lifesense.plugin.ble.a;

import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;

/* JADX INFO: loaded from: classes5.dex */
class b extends PhoneStateListener {
    final /* synthetic */ TelephonyManager a;
    final /* synthetic */ a b;

    public b(a aVar, TelephonyManager telephonyManager) {
        this.b = aVar;
        this.a = telephonyManager;
    }

    @Override // android.telephony.PhoneStateListener
    public void onCallStateChanged(int i, String str) {
        if (a.b == null) {
            return;
        }
        if (!this.b.a(i)) {
            TelephonyManager telephonyManager = this.a;
            com.lifesense.plugin.ble.b.d.a().a(null, com.lifesense.plugin.ble.b.a.a.Broadcast_Message, true, this.b.a(i, telephonyManager != null ? telephonyManager.getCallState() : 100, str), null);
        }
        if (1 == i) {
            a.b.onCallStateChanged(1, str);
        } else {
            a.b.onCallStateChanged(i, str);
        }
    }
}
