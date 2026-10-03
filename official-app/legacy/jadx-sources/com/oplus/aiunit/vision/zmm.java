package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes12.dex */
public final class zmm implements Runnable {
    public final /* synthetic */ fjm i;

    public zmm(fjm fjmVar) {
        this.i = fjmVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.i.d();
        } catch (Exception e2) {
            gqm.c(e2);
        }
    }
}
