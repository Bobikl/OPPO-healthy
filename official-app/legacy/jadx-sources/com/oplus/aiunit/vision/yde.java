package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes11.dex */
public final class yde {
    public xde a;
    public xde b;

    public synchronized void a(xde xdeVar) {
        try {
            if (xdeVar == null) {
                throw new NullPointerException("null cannot be enqueued");
            }
            xde xdeVar2 = this.b;
            if (xdeVar2 != null) {
                xdeVar2.f18589c = xdeVar;
                this.b = xdeVar;
            } else {
                if (this.a != null) {
                    throw new IllegalStateException("Head present, but no tail");
                }
                this.b = xdeVar;
                this.a = xdeVar;
            }
            notifyAll();
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized xde b() {
        xde xdeVar;
        xdeVar = this.a;
        if (xdeVar != null) {
            xde xdeVar2 = xdeVar.f18589c;
            this.a = xdeVar2;
            if (xdeVar2 == null) {
                this.b = null;
            }
        }
        return xdeVar;
    }

    public synchronized xde c(int i) throws InterruptedException {
        if (this.a == null) {
            wait(i);
        }
        return b();
    }
}
