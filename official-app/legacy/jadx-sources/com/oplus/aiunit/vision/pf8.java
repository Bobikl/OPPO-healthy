package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes15.dex */
public abstract class pf8 implements Runnable {
    public abstract void a(Exception exc);

    public abstract void b() throws Exception;

    @Override // java.lang.Runnable
    public void run() {
        try {
            b();
        } catch (Exception e2) {
            a(e2);
        }
    }
}
