package com.lifesense.plugin.ble.device.a.a;

import android.os.Message;

/* JADX INFO: loaded from: classes5.dex */
class q implements Runnable {
    final /* synthetic */ o a;

    public q(o oVar) {
        this.a = oVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.a.v == null || !com.lifesense.plugin.ble.a.e.a().c()) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("restart scan,pauses time:");
        sb.append(this.a.o() / 1000);
        sb.append(" s");
        Message messageObtainMessage = this.a.v.obtainMessage();
        messageObtainMessage.arg1 = 1;
        this.a.v.sendMessage(messageObtainMessage);
    }
}
