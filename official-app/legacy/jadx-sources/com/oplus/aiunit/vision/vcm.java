package com.oplus.aiunit.vision;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes10.dex */
public abstract class vcm<T> {
    public SQLiteDatabase a;
    public final Context b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f17809c = new AtomicBoolean(false);

    public vcm(Context context) {
        this.b = context;
        d();
    }

    public abstract long a();

    public abstract long b(yum yumVar);

    public abstract boolean c(ArrayList arrayList);

    public final void d() {
        try {
            if (e() || this.f17809c.getAndSet(true)) {
                return;
            }
            Context context = this.b;
            if (qim.a == null) {
                synchronized (qim.class) {
                    if (qim.a == null) {
                        qim.a = new qim(context.getApplicationContext());
                    }
                }
            }
            SQLiteDatabase writableDatabase = qim.a.getWritableDatabase();
            this.a = writableDatabase;
            writableDatabase.enableWriteAheadLogging();
        } catch (Exception unused) {
            this.f17809c.set(false);
        }
    }

    public final boolean e() {
        SQLiteDatabase sQLiteDatabase = this.a;
        return sQLiteDatabase != null && sQLiteDatabase.isOpen();
    }

    public abstract ArrayList f();
}
