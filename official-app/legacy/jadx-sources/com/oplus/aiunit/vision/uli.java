package com.oplus.aiunit.vision;

import android.database.sqlite.SQLiteStatement;

/* JADX INFO: loaded from: classes11.dex */
public class uli implements d05 {
    public final SQLiteStatement a;

    public uli(SQLiteStatement sQLiteStatement) {
        this.a = sQLiteStatement;
    }

    @Override // com.oplus.aiunit.vision.d05
    public Object a() {
        return this.a;
    }

    @Override // com.oplus.aiunit.vision.d05
    public void bindDouble(int i, double d) {
        this.a.bindDouble(i, d);
    }

    @Override // com.oplus.aiunit.vision.d05
    public void bindLong(int i, long j2) {
        this.a.bindLong(i, j2);
    }

    @Override // com.oplus.aiunit.vision.d05
    public void bindString(int i, String str) {
        this.a.bindString(i, str);
    }

    @Override // com.oplus.aiunit.vision.d05
    public void clearBindings() {
        this.a.clearBindings();
    }

    @Override // com.oplus.aiunit.vision.d05
    public void close() {
        this.a.close();
    }

    @Override // com.oplus.aiunit.vision.d05
    public void execute() {
        this.a.execute();
    }

    @Override // com.oplus.aiunit.vision.d05
    public long executeInsert() {
        return this.a.executeInsert();
    }

    @Override // com.oplus.aiunit.vision.d05
    public long simpleQueryForLong() {
        return this.a.simpleQueryForLong();
    }
}
