package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes11.dex */
public abstract class i5m {
    public h5m a;

    public abstract h5m a();

    public synchronized h5m b() {
        if (this.a == null) {
            this.a = a();
        }
        return this.a;
    }
}
