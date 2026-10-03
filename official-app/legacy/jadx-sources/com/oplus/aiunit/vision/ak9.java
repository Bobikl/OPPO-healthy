package com.oplus.aiunit.vision;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.danikula.videocache.ProxyCacheException;
import java.io.File;
import java.io.IOException;
import java.net.Socket;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes13.dex */
public final class ak9 {
    public final AtomicInteger a = new AtomicInteger(0);
    public final String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile yj9 f9414c;
    public final List<bp2> d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final bp2 f9415e;
    public final mt3 f;

    public static final class a extends Handler implements bp2 {
        public final String i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final List<bp2> f9416j;

        public a(String str, List<bp2> list) {
            super(Looper.getMainLooper());
            this.i = str;
            this.f9416j = list;
        }

        @Override // com.oplus.aiunit.vision.bp2
        public void a(File file, String str, int i) {
            Message messageObtainMessage = obtainMessage();
            messageObtainMessage.arg1 = i;
            messageObtainMessage.obj = file;
            sendMessage(messageObtainMessage);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            Iterator<bp2> it = this.f9416j.iterator();
            while (it.hasNext()) {
                it.next().a((File) message.obj, this.i, message.arg1);
            }
        }
    }

    public ak9(String str, mt3 mt3Var) {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        this.d = copyOnWriteArrayList;
        this.b = (String) voe.d(str);
        this.f = (mt3) voe.d(mt3Var);
        this.f9415e = new a(str, copyOnWriteArrayList);
    }

    public final synchronized void a() {
        if (this.a.decrementAndGet() <= 0) {
            this.f9414c.m();
            this.f9414c = null;
        }
    }

    public final yj9 b() throws ProxyCacheException {
        String str = this.b;
        mt3 mt3Var = this.f;
        yj9 yj9Var = new yj9(new zk9(str, mt3Var.d, mt3Var.f14216e), new la7(this.f.a(this.b), this.f.f14215c));
        yj9Var.t(this.f9415e);
        return yj9Var;
    }

    public void c(v58 v58Var, Socket socket) throws IOException, ProxyCacheException {
        d();
        try {
            this.a.incrementAndGet();
            this.f9414c.s(v58Var, socket);
        } finally {
            a();
        }
    }

    public final synchronized void d() throws ProxyCacheException {
        this.f9414c = this.f9414c == null ? b() : this.f9414c;
    }
}
