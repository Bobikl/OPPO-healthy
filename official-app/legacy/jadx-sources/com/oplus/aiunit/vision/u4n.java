package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes12.dex */
public abstract class u4n implements Runnable {
    a f;

    public interface a {
        void a(u4n u4nVar);

        void b(u4n u4nVar);
    }

    public final void cancelTask() {
        try {
            a aVar = this.f;
            if (aVar != null) {
                aVar.b(this);
            }
        } catch (Throwable th) {
            c2n.r(th, "ThreadTask", "cancelTask");
            th.printStackTrace();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        a aVar;
        try {
            if (Thread.interrupted()) {
                return;
            }
            runTask();
            if (Thread.interrupted() || (aVar = this.f) == null) {
                return;
            }
            aVar.a(this);
        } catch (Throwable th) {
            c2n.r(th, "ThreadTask", "run");
            th.printStackTrace();
        }
    }

    public abstract void runTask();
}
