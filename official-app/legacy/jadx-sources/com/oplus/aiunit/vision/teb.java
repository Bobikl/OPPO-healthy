package com.oplus.aiunit.vision;

import android.os.Looper;

/* JADX INFO: loaded from: classes11.dex */
public interface teb {

    public static class a implements teb {
        public final Looper a;

        public a(Looper looper) {
            this.a = looper;
        }

        @Override // com.oplus.aiunit.vision.teb
        public hoe a(sr6 sr6Var) {
            return new ah8(sr6Var, this.a, 10);
        }

        @Override // com.oplus.aiunit.vision.teb
        public boolean isMainThread() {
            return this.a == Looper.myLooper();
        }
    }

    hoe a(sr6 sr6Var);

    boolean isMainThread();
}
