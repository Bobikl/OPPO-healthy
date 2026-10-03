package com.oplus.aiunit.vision;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.NonNull;
import com.oplus.pantaconnect.sdk.connectionservice.lan.LanConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class vz4 {
    public final int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public zak f18052e;
    public HandlerThread f;
    public HandlerThread g;
    public c h;
    public c i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public xo9 f18053j;
    public ro9 k;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public volatile boolean f18055n;
    public volatile long o;
    public o9k q;
    public final Object a = new Object();
    public final Object b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f18051c = new Object();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public pue f18054l = new pue();
    public List<byte[]> m = new ArrayList();
    public zak.b p = new a();
    public xs2<Void> r = new b();

    public class a implements zak.b {
        public a() {
        }

        @Override // com.oplus.aiunit.vision.zak.b
        public void a(br0 br0Var) {
            if (vz4.this.k != null) {
                vz4.this.k.a(vz4.this.d, br0Var);
            }
        }
    }

    public class b implements xs2<Void> {
        public b() {
        }

        @Override // com.oplus.aiunit.vision.xs2
        public void a(Throwable th, int i) {
            vz4.this.u(false);
            vz4.this.m();
        }

        @Override // com.oplus.aiunit.vision.xs2
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void r2) {
            vz4.this.u(false);
            vz4.this.m();
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
                vz4.this.j();
            } else {
                if (i != 2) {
                    return;
                }
                vz4.this.i();
            }
        }
    }

    public vz4(int i) {
        this.d = i;
        l();
        k();
    }

    public final String g() {
        int i = this.d;
        if (i == 1) {
            return "FILE";
        }
        return i == 2 ? "MESSAGE" : LanConstants.OPERATOR_UNKNOWN;
    }

    public final void h(byte[] bArr) {
        this.f18052e.A(bArr);
    }

    public final void i() {
        synchronized (this.b) {
            if (this.m.isEmpty()) {
                wil.k("DataWrapperImpl", "handleMessage, mMTUReceiveList.isEmpty()");
            } else {
                h(this.m.remove(0));
            }
        }
    }

    public final void j() {
        synchronized (this.f18051c) {
            if (this.f18054l.e()) {
                wil.d("DataWrapperImpl", "handleMessage, mBTCommandQueue.isEmpty()");
                return;
            }
            br0 br0VarD = this.f18054l.d();
            if (br0VarD == null) {
                wil.b("DataWrapperImpl", "handleSendCommand: btCommand is null");
                return;
            }
            r(br0VarD);
            if (br0VarD.e()) {
                return;
            }
            synchronized (this.f18051c) {
                this.f18054l.f(br0VarD);
            }
            n(br0VarD);
        }
    }

    public final void k() {
        wil.a("DataWrapperImpl", "initCommandThread: " + this);
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
        zak zakVar = new zak();
        this.f18052e = zakVar;
        zakVar.setOnPackedListener(this.p);
    }

    public final void m() {
        synchronized (this.a) {
            try {
                this.a.notifyAll();
            } catch (Exception e2) {
                wil.b("DataWrapperImpl", "mtuWriteNotify: " + e2.getMessage());
            }
        }
    }

    public final void n(br0 br0Var) {
        xs2<Void> xs2VarB = br0Var.b();
        if (xs2VarB != null) {
            xs2VarB.onSuccess(null);
        }
    }

    public void o(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            wil.b("DataWrapperImpl", "packing: data is null");
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
        wil.a("DataWrapperImpl", "release: " + this);
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
        synchronized (this.f18051c) {
            Iterator<br0> it = this.f18054l.c().iterator();
            while (it.hasNext()) {
                it.next().a(new Throwable("release"), -1, "DataWrapperImpl release");
            }
            this.f18054l.b();
        }
        this.f18052e.i();
    }

    public final void q(byte[] bArr) {
        List<byte[]> listC = this.f18052e.C(bArr);
        long j2 = this.o;
        for (byte[] bArr2 : listC) {
            u(true);
            this.f18053j.a(this.d, bArr2, this.r);
            try {
                synchronized (this.a) {
                    try {
                        if (this.f18055n) {
                            this.a.wait(10000L);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (InterruptedException e2) {
                wil.b("DataWrapperImpl", "sendLinkPackageCommand: " + e2.getMessage());
            }
        }
        if (j2 > 0) {
            try {
                wil.a("DataWrapperImpl", "sendLinkPackageCommand: mInterval:" + j2);
                Thread.sleep(j2);
            } catch (InterruptedException e3) {
                wil.b("DataWrapperImpl", "sendLinkPackageCommand InterruptedException = " + e3.getMessage());
            }
        }
    }

    public final synchronized void r(br0 br0Var) {
        int iG;
        synchronized (this.f18051c) {
            iG = this.f18054l.g();
        }
        if (iG == 0) {
            wil.d("DataWrapperImpl", "sendWrapData: mBTCommandQueue is empty");
            return;
        }
        if (br0Var == null) {
            wil.d("DataWrapperImpl", "sendWrapData: btCommand == null");
            return;
        }
        List<byte[]> listB = this.f18052e.B(br0Var);
        if (listB != null && listB.size() != 0) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            wil.a("DataWrapperImpl", "sendWrapData: start send ");
            for (int i = 0; i < listB.size(); i++) {
                q(listB.get(i));
            }
            long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
            StringBuilder sb = new StringBuilder();
            sb.append("sendWrapData: send success ");
            sb.append(br0Var.c() == null ? "null" : Integer.valueOf(br0Var.c().length));
            sb.append(" delay=");
            sb.append(jCurrentTimeMillis2);
            wil.d("DataWrapperImpl", sb.toString());
            return;
        }
        wil.b("DataWrapperImpl", "sendWrapData: packetList is null");
        br0Var.a(new Throwable("packetList is null"), -1, "packetList is null");
    }

    public void s(@NonNull ro9 ro9Var) {
        this.k = ro9Var;
    }

    public void t(@NonNull xo9 xo9Var) {
        this.f18053j = xo9Var;
    }

    public final void u(boolean z) {
        synchronized (this.a) {
            this.f18055n = z;
        }
    }

    public void v(br0 br0Var) {
        synchronized (this.f18051c) {
            this.f18054l.a(br0Var);
        }
        Message messageObtain = Message.obtain();
        messageObtain.what = 1;
        this.h.sendMessage(messageObtain);
    }

    public void w(o9k o9kVar) {
        this.q = o9kVar;
        this.f18052e.w(o9kVar.a());
        this.f18052e.v(this.q.c());
        this.f18052e.x(this.q.d());
        this.f18052e.y(this.q.b());
        this.o = this.q.b();
    }
}
