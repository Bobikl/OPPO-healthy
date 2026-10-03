package com.oplus.aiunit.vision;

import androidx.annotation.NonNull;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;

/* JADX INFO: loaded from: classes13.dex */
public class rik<Model> implements n2c<Model, Model> {
    public static final rik<?> a = new rik<>();

    public static class a<Model> implements o2c<Model, Model> {
        public static final a<?> a = new a<>();

        @Deprecated
        public a() {
        }

        public static <T> a<T> a() {
            return (a<T>) a;
        }

        @Override // com.oplus.aiunit.vision.o2c
        public void c() {
        }

        @Override // com.oplus.aiunit.vision.o2c
        @NonNull
        public n2c<Model, Model> d(p7c p7cVar) {
            return rik.c();
        }
    }

    public static class b<Model> implements ft4<Model> {
        public final Model i;

        public b(Model model) {
            this.i = model;
        }

        @Override // com.oplus.aiunit.vision.ft4
        @NonNull
        public Class<Model> a() {
            return (Class<Model>) this.i.getClass();
        }

        @Override // com.oplus.aiunit.vision.ft4
        public void b() {
        }

        @Override // com.oplus.aiunit.vision.ft4
        @NonNull
        public DataSource c() {
            return DataSource.LOCAL;
        }

        @Override // com.oplus.aiunit.vision.ft4
        public void cancel() {
        }

        @Override // com.oplus.aiunit.vision.ft4
        public void f(@NonNull Priority priority, @NonNull ft4.a<? super Model> aVar) {
            aVar.d(this.i);
        }
    }

    @Deprecated
    public rik() {
    }

    public static <T> rik<T> c() {
        return (rik<T>) a;
    }

    @Override // com.oplus.aiunit.vision.n2c
    public n2c.a<Model> a(@NonNull Model model, int i, int i2, @NonNull erd erdVar) {
        return new n2c.a<>(new ebd(model), new b(model));
    }

    @Override // com.oplus.aiunit.vision.n2c
    public boolean b(@NonNull Model model) {
        return true;
    }
}
