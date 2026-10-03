package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes12.dex */
public final class un0 {

    /* JADX INFO: Add missing generic type declarations: [T] */
    public class a<T> implements zn0<T> {
        public final /* synthetic */ ds3 a;

        /* JADX INFO: renamed from: com.oplus.aiunit.vision.un0$a$a, reason: collision with other inner class name */
        public class C0933a implements mdd<T> {
            public final /* synthetic */ lbd i;

            public C0933a(lbd lbdVar) {
                this.i = lbdVar;
            }

            @Override // com.oplus.aiunit.vision.mdd
            public io.reactivex.rxjava3.disposables.a a(o14<? super T> o14Var) {
                return new autodispose2.b(this.i, a.this.a).a(o14Var);
            }

            @Override // com.oplus.aiunit.vision.mdd
            public io.reactivex.rxjava3.disposables.a b(o14<? super T> o14Var, o14<? super Throwable> o14Var2) {
                return new autodispose2.b(this.i, a.this.a).b(o14Var, o14Var2);
            }

            @Override // com.oplus.aiunit.vision.mdd
            public io.reactivex.rxjava3.disposables.a c() {
                return new autodispose2.b(this.i, a.this.a).c();
            }

            @Override // com.oplus.aiunit.vision.mdd
            public void subscribe(aed<? super T> aedVar) {
                new autodispose2.b(this.i, a.this.a).subscribe(aedVar);
            }
        }

        public class b implements u6h<T> {
            public final /* synthetic */ f5h i;

            public b(f5h f5hVar) {
                this.i = f5hVar;
            }

            @Override // com.oplus.aiunit.vision.u6h
            public io.reactivex.rxjava3.disposables.a a(o14<? super T> o14Var) {
                return new co0(this.i, a.this.a).a(o14Var);
            }

            @Override // com.oplus.aiunit.vision.u6h
            public void b(l6h<? super T> l6hVar) {
                new co0(this.i, a.this.a).b(l6hVar);
            }
        }

        public a(ds3 ds3Var) {
            this.a = ds3Var;
        }

        @Override // com.oplus.aiunit.vision.sbd
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public mdd<T> a(lbd<T> lbdVar) {
            return !bo0.f9804c ? new autodispose2.b(lbdVar, this.a) : new C0933a(lbdVar);
        }

        @Override // com.oplus.aiunit.vision.q5h
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public u6h<T> b(f5h<T> f5hVar) {
            return !bo0.f9804c ? new co0(f5hVar, this.a) : new b(f5hVar);
        }
    }

    public static <T> zn0<T> a(ds3 ds3Var) {
        do0.a(ds3Var, "scope == null");
        return new a(ds3Var);
    }

    public static <T> zn0<T> b(nig nigVar) {
        do0.a(nigVar, "provider == null");
        return a(pig.b(nigVar));
    }
}
