package com.lifesense.plugin.ble.device.a.a;

import android.os.Message;
import android.telephony.PhoneStateListener;

/* JADX INFO: loaded from: classes5.dex */
class h extends PhoneStateListener {
    final /* synthetic */ g a;

    public h(g gVar) {
        this.a = gVar;
    }

    @Override // android.telephony.PhoneStateListener
    public void onCallStateChanged(int i, String str) {
        this.a.y.removeCallbacks(this.a.Q);
        if (i == 1) {
            this.a.y.postDelayed(this.a.Q, 60000L);
        }
        Message messageObtainMessage = this.a.y.obtainMessage();
        messageObtainMessage.obj = str;
        messageObtainMessage.arg2 = i;
        messageObtainMessage.arg1 = 6;
        this.a.y.sendMessage(messageObtainMessage);
    }
}
