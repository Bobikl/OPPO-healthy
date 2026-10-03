package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes13.dex */
public final class w68 {

    /* JADX INFO: Add missing generic type declarations: [T] */
    public class a<T> implements b<T> {
        public volatile T a;
        public final /* synthetic */ b b;

        public a(b bVar) {
            this.b = bVar;
        }

        @Override // com.oplus.aiunit.vision.w68.b
        public T get() {
            if (this.a == null) {
                synchronized (this) {
                    if (this.a == null) {
                        this.a = (T) cpe.d(this.b.get());
                    }
                }
            }
            return this.a;
        }
    }

    public interface b<T> {
        T get();
    }

    public static <T> b<T> a(b<T> bVar) {
        return new a(bVar);
    }
}
