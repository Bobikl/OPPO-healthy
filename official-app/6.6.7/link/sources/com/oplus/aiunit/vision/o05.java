package com.oplus.aiunit.vision;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class o05 {
    public final int d;
    public bfk e;
    public HandlerThread f;
    public HandlerThread g;
    public c h;
    public c i;
    public dq9 j;
    public xp9 k;
    public volatile boolean n;
    public volatile long o;
    public qdk q;
    public final Object a = new Object();
    public final Object b = new Object();
    public final Object c = new Object();
    public zwe l = new zwe();
    public List<byte[]> m = new ArrayList();
    public bfk.b p = new a();
    public lt2<Void> r = new b();

    public class a implements bfk.b {
        public a() {
        }

        @Override // com.oplus.aiunit.vision.bfk.b
        public void a(sr0 sr0Var) {
            if (o05.this.k != null) {
                o05.this.k.a(o05.this.d, sr0Var);
            }
        }
    }

    public class b implements lt2<Void> {
        public b() {
        }

        @Override // com.oplus.aiunit.vision.lt2
        public void a(Throwable th, int i) {
            o05.this.u(false);
            o05.this.m();
        }

        @Override // com.oplus.aiunit.vision.lt2
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void r2) {
            o05.this.u(false);
            o05.this.m();
        }
    }

    public class c extends Handler {
        public c(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i = message.what;
            if (i == 1) {
                o05.this.j();
            } else {
                if (i != 2) {
                    return;
                }
                o05.this.i();
            }
        }
    }

    public o05(int i) {
        this.d = i;
        l();
        k();
    }

    public final String g() {
        int i = this.d;
        if (i == 1) {
            return "FILE";
        }
        return i == 2 ? "MESSAGE" : "UNKNOWN";
    }

    public final void h(byte[] bArr) {
        this.e.A(bArr);
    }

    public final void i() {
        synchronized (this.b) {
            if (this.m.isEmpty()) {
                uml.k("DataWrapperImpl", "handleMessage, mMTUReceiveList.isEmpty()");
            } else {
                h(this.m.remove(0));
            }
        }
    }

    public final void j() {
        synchronized (this.c) {
            if (this.l.e()) {
                uml.d("DataWrapperImpl", "handleMessage, mBTCommandQueue.isEmpty()");
                return;
            }
            sr0 sr0VarD = this.l.d();
            if (sr0VarD == null) {
                uml.b("DataWrapperImpl", "handleSendCommand: btCommand is null");
                return;
            }
            r(sr0VarD);
            if (sr0VarD.e()) {
                return;
            }
            synchronized (this.c) {
                this.l.f(sr0VarD);
            }
            n(sr0VarD);
        }
    }

    public final void k() {
        uml.a("DataWrapperImpl", "initCommandThread: " + this);
        String strG = g();
        HandlerThread handlerThread = new HandlerThread("DataWrapperImpl_write_" + strG);
        this.f = handlerThread;
        handlerThread.start();
        this.h = new c(this.f.getLooper());
        HandlerThread handlerThread2 = new HandlerThread("DataWrapperImpl_read_" + strG);
        this.g = handlerThread2;
        handlerThread2.start();
        this.i = new c(this.g.getLooper());
    }

    public final void l() {
        bfk bfkVar = new bfk();
        this.e = bfkVar;
        bfkVar.setOnPackedListener(this.p);
    }

    public final void m() {
        synchronized (this.a) {
            try {
                this.a.notifyAll();
            } catch (Exception e) {
                uml.b("DataWrapperImpl", "mtuWriteNotify: " + e.getMessage());
            }
        }
    }

    public final void n(sr0 sr0Var) {
        lt2<Void> lt2VarB = sr0Var.b();
        if (lt2VarB != null) {
            lt2VarB.onSuccess(null);
        }
    }

    public void o(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            uml.b("DataWrapperImpl", "packing: data is null");
            return;
        }
        synchronized (this.b) {
            this.m.add(bArr);
            Message messageObtain = Message.obtain();
            messageObtain.what = 2;
            this.i.sendMessage(messageObtain);
        }
    }

    public void p() {
        uml.a("DataWrapperImpl", "release: " + this);
        c cVar = this.i;
        if (cVar != null) {
            cVar.removeCallbacksAndMessages(null);
        }
        HandlerThread handlerThread = this.g;
        if (handlerThread != null) {
            handlerThread.quitSafely();
            this.g = null;
        }
        c cVar2 = this.h;
        if (cVar2 != null) {
            cVar2.removeCallbacksAndMessages(null);
        }
        HandlerThread handlerThread2 = this.f;
        if (handlerThread2 != null) {
            handlerThread2.quitSafely();
            this.f = null;
        }
        synchronized (this.b) {
            this.m.clear();
        }
        synchronized (this.c) {
            Iterator<sr0> it = this.l.c().iterator();
            while (it.hasNext()) {
                it.next().a(new Throwable("release"), -1, "DataWrapperImpl release");
            }
            this.l.b();
        }
        this.e.i();
    }

    public final void q(byte[] bArr) {
        List<byte[]> listC = this.e.C(bArr);
        long j = this.o;
        for (byte[] bArr2 : listC) {
            u(true);
            this.j.a(this.d, bArr2, this.r);
            try {
                synchronized (this.a) {
                    try {
                        if (this.n) {
                            this.a.wait(10000L);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (InterruptedException e) {
                uml.b("DataWrapperImpl", "sendLinkPackageCommand: " + e.getMessage());
            }
        }
        if (j > 0) {
            try {
                uml.a("DataWrapperImpl", "sendLinkPackageCommand: mInterval:" + j);
                Thread.sleep(j);
            } catch (InterruptedException e2) {
                uml.b("DataWrapperImpl", "sendLinkPackageCommand InterruptedException = " + e2.getMessage());
            }
        }
    }

    public final synchronized void r(sr0 sr0Var) {
        int iG;
        synchronized (this.c) {
            iG = this.l.g();
        }
        if (iG == 0) {
            uml.d("DataWrapperImpl", "sendWrapData: mBTCommandQueue is empty");
            return;
        }
        if (sr0Var == null) {
            uml.d("DataWrapperImpl", "sendWrapData: btCommand == null");
            return;
        }
        List<byte[]> listB = this.e.B(sr0Var);
        if (listB != null && listB.size() != 0) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            uml.a("DataWrapperImpl", "sendWrapData: start send ");
            for (int i = 0; i < listB.size(); i++) {
                q(listB.get(i));
            }
            long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
            StringBuilder sb = new StringBuilder();
            sb.append("sendWrapData: send success ");
            sb.append(sr0Var.c() == null ? "null" : Integer.valueOf(sr0Var.c().length));
            sb.append(" delay=");
            sb.append(jCurrentTimeMillis2);
            uml.d("DataWrapperImpl", sb.toString());
            return;
        }
        uml.b("DataWrapperImpl", "sendWrapData: packetList is null");
        sr0Var.a(new Throwable("packetList is null"), -1, "packetList is null");
    }

    public void s(@NonNull xp9 xp9Var) {
        this.k = xp9Var;
    }

    public void t(@NonNull dq9 dq9Var) {
        this.j = dq9Var;
    }

    public final void u(boolean z) {
        synchronized (this.a) {
            this.n = z;
        }
    }

    public void v(sr0 sr0Var) {
        synchronized (this.c) {
            this.l.a(sr0Var);
        }
        Message messageObtain = Message.obtain();
        messageObtain.what = 1;
        this.h.sendMessage(messageObtain);
    }

    public void w(qdk qdkVar) {
        this.q = qdkVar;
        this.e.w(qdkVar.a());
        this.e.v(this.q.c());
        this.e.x(this.q.d());
        this.e.y(this.q.b());
        this.o = this.q.b();
    }
}
