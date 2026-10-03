package com.oplus.aiunit.vision;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/* JADX INFO: loaded from: classes10.dex */
public class mcm extends a4k implements Handler.Callback {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public kim f14029l;
    public FileWriter m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public FileWriter f14030n;
    public File o;
    public File p;
    public char[] q;
    public volatile tum r;
    public volatile tum s;
    public volatile tum t;
    public volatile tum u;
    public volatile boolean v;
    public HandlerThread w;
    public Handler x;

    public mcm(kim kimVar) {
        this(gmm.b, true, vxm.a, kimVar);
    }

    @Override // com.oplus.aiunit.vision.a4k
    public void f(int i, Thread thread, long j2, String str, String str2, Throwable th) {
        j(g().b(i, thread, j2, str, str2, th));
    }

    public void h() {
        if (this.x.hasMessages(1024)) {
            this.x.removeMessages(1024);
        }
        this.x.sendEmptyMessage(1024);
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (message.what != 1024) {
            return true;
        }
        l();
        return true;
    }

    public void i(kim kimVar) {
        this.f14029l = kimVar;
    }

    public final void j(String str) {
        this.t.b(str);
        if (this.t.a() >= k().n()) {
            h();
        }
    }

    public kim k() {
        return this.f14029l;
    }

    public final void l() {
        if (Thread.currentThread() == this.w && !this.v) {
            this.v = true;
            p();
            try {
                try {
                    this.u.c(m(), this.q);
                } catch (IOException e2) {
                    q8g.g("FileTracer", "flushBuffer exception", e2);
                }
                this.u.d();
                this.v = false;
            } catch (Throwable th) {
                this.u.d();
                throw th;
            }
        }
    }

    public final Writer[] m() {
        File[] fileArrE = k().e();
        if (fileArrE != null && fileArrE.length >= 2) {
            File file = fileArrE[0];
            if ((file != null && !file.equals(this.o)) || (this.m == null && file != null)) {
                this.o = file;
                n();
                try {
                    this.m = new FileWriter(this.o, true);
                } catch (IOException unused) {
                    this.m = null;
                    q8g.f(q8g.TAG, "-->obtainFileWriter() old log file permission denied");
                }
            }
            File file2 = fileArrE[1];
            if ((file2 != null && !file2.equals(this.p)) || (this.f14030n == null && file2 != null)) {
                this.p = file2;
                o();
                try {
                    this.f14030n = new FileWriter(this.p, true);
                } catch (IOException unused2) {
                    this.f14030n = null;
                    q8g.f(q8g.TAG, "-->obtainFileWriter() app specific file permission denied");
                }
            }
        }
        return new Writer[]{this.m, this.f14030n};
    }

    public final void n() {
        try {
            FileWriter fileWriter = this.m;
            if (fileWriter != null) {
                fileWriter.flush();
                this.m.close();
            }
        } catch (IOException e2) {
            q8g.g(q8g.TAG, "-->closeFileWriter() exception:", e2);
        }
    }

    public final void o() {
        try {
            FileWriter fileWriter = this.f14030n;
            if (fileWriter != null) {
                fileWriter.flush();
                this.f14030n.close();
            }
        } catch (IOException e2) {
            q8g.g(q8g.TAG, "-->closeAppSpecificFileWriter() exception:", e2);
        }
    }

    public final void p() {
        synchronized (this) {
            if (this.t == this.r) {
                this.t = this.s;
                this.u = this.r;
            } else {
                this.t = this.r;
                this.u = this.s;
            }
        }
    }

    public mcm(int i, boolean z, vxm vxmVar, kim kimVar) {
        super(i, z, vxmVar);
        this.v = false;
        i(kimVar);
        this.r = new tum();
        this.s = new tum();
        this.t = this.r;
        this.u = this.s;
        this.q = new char[kimVar.n()];
        HandlerThread handlerThread = new HandlerThread(kimVar.j(), kimVar.r());
        this.w = handlerThread;
        handlerThread.start();
        if (!this.w.isAlive() || this.w.getLooper() == null) {
            return;
        }
        this.x = new Handler(this.w.getLooper(), this);
    }
}
