package com.omron;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: loaded from: classes5.dex */
public class bf implements Runnable {
    private final BlockingQueue<be> a = new LinkedBlockingQueue();
    private volatile boolean b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a f8839c;

    public interface a {
        void a(be beVar);
    }

    public bf(a aVar) {
        this.f8839c = aVar;
    }

    public void a(be beVar) {
        try {
            this.a.put(beVar);
        } catch (InterruptedException e2) {
            e2.printStackTrace();
        }
    }

    public void b() {
        synchronized (this) {
            if (this.b) {
                return;
            }
            new Thread(this).start();
            this.b = true;
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        while (true) {
            try {
                be beVarTake = this.a.take();
                if (beVarTake == null) {
                    return;
                }
                a aVar = this.f8839c;
                if (aVar != null) {
                    aVar.a(beVarTake);
                }
            } catch (InterruptedException e2) {
                e2.printStackTrace();
                synchronized (this) {
                    this.b = false;
                    return;
                }
            }
        }
    }

    public boolean a() {
        boolean z;
        synchronized (this) {
            z = this.b;
        }
        return z;
    }
}
