package com.oplus.aiunit.vision;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes13.dex */
public abstract class umi {

    public static class b extends umi {
        public volatile boolean a;

        public b() {
            super();
        }

        @Override // com.oplus.aiunit.vision.umi
        public void b(boolean z) {
            this.a = z;
        }

        @Override // com.oplus.aiunit.vision.umi
        public void c() {
            if (this.a) {
                throw new IllegalStateException("Already released");
            }
        }
    }

    public umi() {
    }

    @NonNull
    public static umi a() {
        return new b();
    }

    public abstract void b(boolean z);

    public abstract void c();
}
