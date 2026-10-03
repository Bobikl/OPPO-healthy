package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes6.dex */
public interface vfa {

    public class a implements vfa {
        public final /* synthetic */ double a;

        public a(double d) {
            this.a = d;
        }

        @Override // com.oplus.aiunit.vision.vfa
        public long b(long j2) {
            return (long) (j2 * this.a);
        }
    }

    static vfa a(double d) {
        return new a(d);
    }

    long b(long j2);
}
