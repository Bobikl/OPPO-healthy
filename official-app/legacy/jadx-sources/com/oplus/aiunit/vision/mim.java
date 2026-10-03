package com.oplus.aiunit.vision;

import android.os.Message;

/* JADX INFO: loaded from: classes10.dex */
public final class mim implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        try {
            kfk.Q.sendEmptyMessageDelayed(1001, 800L);
            imm immVar = new imm(kfk.P, com.unionpay.utils.a.b(kfk.G()));
            immVar.a();
            String strB = immVar.b();
            if (kfk.Q != null) {
                Message messageObtainMessage = kfk.Q.obtainMessage();
                messageObtainMessage.what = 1002;
                messageObtainMessage.obj = strB;
                kfk.Q.removeMessages(1001);
                kfk.Q.sendMessage(messageObtainMessage);
            }
        } catch (Exception unused) {
        }
    }
}
