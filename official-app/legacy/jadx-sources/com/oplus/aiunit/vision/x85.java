package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes11.dex */
public class x85<T> extends p6<T> {
    public final b<T> f;

    public static final class b<T2> extends q6<T2, x85<T2>> {
        @Override // com.oplus.aiunit.vision.q6
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public x85<T2> a() {
            return new x85<>(this, this.b, this.a, (String[]) this.f15638c.clone());
        }

        public b(a6<T2, ?> a6Var, String str, String[] strArr) {
            super(a6Var, str, strArr);
        }
    }

    public static <T2> x85<T2> c(a6<T2, ?> a6Var, String str, Object[] objArr) {
        return new b(a6Var, str, p6.b(objArr)).b();
    }

    public void d() {
        a();
        wz4 database = this.a.getDatabase();
        if (database.isDbLockedByCurrentThread()) {
            this.a.getDatabase().execSQL(this.f15206c, this.d);
            return;
        }
        database.beginTransaction();
        try {
            this.a.getDatabase().execSQL(this.f15206c, this.d);
            database.setTransactionSuccessful();
        } finally {
            database.endTransaction();
        }
    }

    public x85(b<T> bVar, a6<T, ?> a6Var, String str, String[] strArr) {
        super(a6Var, str, strArr);
        this.f = bVar;
    }
}
