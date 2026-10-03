package com.oplus.aiunit.vision;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.heytap.health.wallet.bean.Content;
import com.heytap.health.wallet.bean.TaskResult;

/* JADX INFO: loaded from: classes18.dex */
public class tpc {
    public static tpc b;
    public a a;

    public class a extends Handler {
        public x60 a;

        public a(Looper looper) {
            super(looper);
            this.a = new x60(this);
            a(1);
            this.a.start();
        }

        public final void a(int i) {
            x60.a aVar = new x60.a(null);
            aVar.c(i);
            this.a.a(aVar);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i = message.what;
            if (i == 0) {
                x60.a aVar = new x60.a((mz0) message.obj);
                aVar.c(0);
                this.a.a(aVar);
                tpc.this.a.removeMessages(1);
                tpc.this.a.obtainMessage(1, message.arg1, message.arg2, null).sendToTarget();
                return;
            }
            if (i != 1) {
                if (i != 2) {
                    return;
                }
                t6b.b("NewApduManager", "apdu handleMessage: clean");
                a(2);
                return;
            }
            if (this.a.b() == 0) {
                t6b.b("NewApduManager", "apdu handleMessage: alive time ticked, all works in the queue have done, release session and channel ");
                tpc.this.a.sendEmptyMessage(2);
            } else {
                t6b.b("NewApduManager", "apdu handleMessage: alive time ticked, continue handle work in the queue");
                a aVar2 = tpc.this.a;
                int i2 = message.arg1;
                aVar2.sendEmptyMessageDelayed(1, i2 != 0 ? i2 : 15000L);
            }
        }
    }

    public tpc() {
        HandlerThread handlerThread = new HandlerThread("status");
        handlerThread.start();
        this.a = new a(handlerThread.getLooper());
    }

    public static synchronized tpc b() {
        if (b == null) {
            synchronized (tpc.class) {
                b = new tpc();
            }
        }
        return b;
    }

    public void c(Content content, v60<TaskResult> v60Var) {
        e(content, v60Var, false);
    }

    public void d(Content content, v60<TaskResult> v60Var, int i, String str) {
        h(new e70(content, v60Var, false, i, str));
    }

    public void e(Content content, v60<TaskResult> v60Var, boolean z) {
        h(new e70(content, v60Var, z));
    }

    public <E extends mz0> void f(E e2) {
        h(e2);
    }

    public <E extends mz0<T>, T> void g(E e2, v60<T> v60Var) {
        e2.setCallback(v60Var);
        f(e2);
    }

    public final void h(mz0 mz0Var) {
        i(mz0Var, 15000);
    }

    public final void i(mz0 mz0Var, int i) {
        t6b.f("NewApduManager", "ApduCommandEngine postJob = " + mz0Var);
        Message messageObtainMessage = this.a.obtainMessage(0);
        messageObtainMessage.what = 0;
        messageObtainMessage.arg1 = i;
        messageObtainMessage.obj = mz0Var;
        messageObtainMessage.sendToTarget();
    }
}
