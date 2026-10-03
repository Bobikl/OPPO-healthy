package com.oplus.aiunit.vision;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* JADX INFO: loaded from: classes13.dex */
public class ltf {
    public boolean a;
    public final Handler b = new Handler(Looper.getMainLooper(), new a());

    public static final class a implements Handler.Callback {
        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != 1) {
                return false;
            }
            ((usf) message.obj).recycle();
            return true;
        }
    }

    public synchronized void a(usf<?> usfVar, boolean z) {
        if (this.a || z) {
            this.b.obtainMessage(1, usfVar).sendToTarget();
        } else {
            this.a = true;
            usfVar.recycle();
            this.a = false;
        }
    }
}
